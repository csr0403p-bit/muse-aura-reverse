package com.facebook.common.dextricks;

import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C3cG;
import X.C3cH;
import X.FGI;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class OdexSchemeBoring extends OdexScheme {

    public final class BoringCompiler extends OdexScheme.Compiler {
        public final DexStore mDexStore;
        public final int mFlags;
        public boolean mLowDiskSpace;
        public final Map<File, File> mRenameTempToFinalOdexMap = BV4.A0u();
        public final DexStore.TmpDir mTmpDir;

        private void onLowDiskSpaceLikelyDetected() {
            this.mLowDiskSpace = true;
            Iterator itA11 = BV5.A11(this.mRenameTempToFinalOdexMap);
            while (itA11.hasNext()) {
                File file = (File) itA11.next();
                Mlog.d("Deleting odex file [success: %s]: %s", Boolean.valueOf(file.delete()), file.getAbsolutePath());
            }
            this.mRenameTempToFinalOdexMap.clear();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.mTmpDir.close();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            String strMakeDexName = OdexSchemeBoring.makeDexName(inputDex.dex);
            String strMakeOdexName = OdexSchemeBoring.makeOdexName(strMakeDexName);
            File fileA0O = C3cG.A0O(this.mDexStore.root, strMakeDexName);
            File fileA0O2 = C3cG.A0O(this.mDexStore.root, strMakeOdexName);
            if ((this.mFlags & 1) != 0 && fileA0O.exists() && fileA0O2.exists()) {
                return;
            }
            File fileA0O3 = C3cG.A0O(this.mTmpDir.directory, strMakeDexName);
            File fileA0O4 = !this.mLowDiskSpace ? C3cG.A0O(this.mTmpDir.directory, strMakeOdexName) : null;
            inputDex.extract(fileA0O3);
            if (Build.VERSION.SDK_INT > 33) {
                fileA0O3.setWritable(false);
            }
            DexFile.loadDex(fileA0O3.getAbsolutePath(), fileA0O4 != null ? fileA0O4.getAbsolutePath() : null, 0);
            Fs.renameOrThrow(fileA0O3, fileA0O);
            if (fileA0O4 != null) {
                if (fileA0O4.exists()) {
                    this.mRenameTempToFinalOdexMap.put(fileA0O4, fileA0O2);
                } else {
                    Mlog.w("Odex file does not exist (likely because dex2oat failed due to low disk space).\n Failing back to using dex file: %s\n Odex file: %s", fileA0O, fileA0O4.getAbsolutePath());
                    onLowDiskSpaceLikelyDetected();
                }
            }
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void performFinishActions() throws IOException {
            Iterator itA0n = AnonymousClass002.A0n(this.mRenameTempToFinalOdexMap);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                Mlog.d("Copying odex file %s to %s", ((File) entryA0l.getKey()).getAbsolutePath(), ((File) entryA0l.getValue()).getAbsolutePath());
                Fs.renameOrThrow((File) entryA0l.getKey(), (File) entryA0l.getValue());
            }
        }

        public BoringCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("boring-compiler");
            this.mLowDiskSpace = AnonymousClass002.A1L(i & 32);
        }
    }

    public static ExpectedFileInfo[] makeExpectedFileList(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        ExpectedFileInfo[] expectedFileInfoArr = new ExpectedFileInfo[length * 2];
        for (int i = 0; i < length; i++) {
            DexManifest.Dex dex = dexArr[i];
            String strMakeDexName = makeDexName(dex);
            int i2 = i * 2;
            expectedFileInfoArr[i2] = new ExpectedFileInfo(dex, strMakeDexName);
            int i3 = i2 + 1;
            ExpectedFileInfo expectedFileInfo = new ExpectedFileInfo(makeOdexName(strMakeDexName));
            expectedFileInfo.mIsOptional = true;
            expectedFileInfoArr[i3] = expectedFileInfo;
        }
        return expectedFileInfoArr;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) throws InterruptedException, IOException {
        int i = 0;
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i >= strArr.length) {
                return;
            }
            File fileA0O = C3cG.A0O(file, strArr[i + 1]);
            File file2 = fileA0O;
            if (!fileA0O.exists()) {
                file2 = null;
                Mlog.i("Odex %s does not exist. Skipping...", fileA0O);
            }
            classLoaderConfiguration.addDex(C3cG.A0O(file, this.expectedFiles[i]), file2);
            i += 2;
        }
    }

    public OdexSchemeBoring(DexManifest.Dex[] dexArr) {
        super(8, makeExpectedFileList(dexArr));
    }

    public static String makeDexName(DexManifest.Dex dex) {
        String str = dex.assetName;
        boolean zEndsWith = str.endsWith(".dex.xz");
        String str2 = DexManifest.DEX_EXT;
        if (!zEndsWith && !str.endsWith(DexManifest.DEX_EXT)) {
            str2 = ".dex.jar";
        }
        return FGI.A0U("prog-", dex.hash, str2);
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeBoring";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new BoringCompiler(dexStore, i);
    }

    public static String makeOdexName(String str) {
        return FGI.A0M(Fs.stripLastExtension(str), DexManifest.ODEX_EXT);
    }
}
