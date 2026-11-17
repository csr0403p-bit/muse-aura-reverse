package com.facebook.common.dextricks;

import X.BV4;
import X.BV5;
import X.BV6;
import X.C3cG;
import X.C60O;
import X.C8D;
import X.C8j3;
import X.FGI;
import android.os.Build;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class OdexSchemeArtTurbo extends OdexScheme {
    public static final String OREO_ODEX_DIR = "oat";
    public static boolean sAttemptedArtHackInstallation;

    public final class TurboArtCompiler extends OdexScheme.Compiler {
        public final DexStore mDexStore;
        public final int mFlags;
        public final DexStore.TmpDir mTmpDir;

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.mTmpDir.close();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            String strMakeDexName = inputDex.dex.makeDexName();
            File fileA0O = C3cG.A0O(this.mDexStore.root, strMakeDexName);
            if ((this.mFlags & 1) == 0 || !fileA0O.exists()) {
                File fileA0O2 = C3cG.A0O(this.mTmpDir.directory, strMakeDexName);
                InputStream dexContents = inputDex.getDexContents();
                try {
                    Mlog.v("size hint for %s: %s", inputDex, Integer.valueOf(inputDex.getSizeHint(dexContents)));
                    RandomAccessFile randomAccessFileA0M = BV4.A0M(fileA0O2);
                    try {
                        byte[] bArr = new byte[32768];
                        boolean z = C8D.A00;
                        int i = 0;
                        do {
                            int iA0F = C8j3.A0F(Integer.MAX_VALUE, i, 32768);
                            int i2 = 0;
                            while (true) {
                                if (i2 >= iA0F) {
                                    break;
                                }
                                int i3 = dexContents.read(bArr, i2, iA0F - i2);
                                if (i3 < 0) {
                                    if (i3 != -1 || i2 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                i2 += i3;
                            }
                            if (i2 == -1) {
                                break;
                            }
                            randomAccessFileA0M.write(bArr, 0, i2);
                            i += i2;
                        } while (i < Integer.MAX_VALUE);
                        randomAccessFileA0M.close();
                        if (dexContents != null) {
                            dexContents.close();
                        }
                        Fs.renameOrThrow(fileA0O2, C3cG.A0O(this.mDexStore.root, strMakeDexName));
                    } finally {
                    }
                } catch (Throwable th) {
                    if (dexContents != null) {
                        try {
                            dexContents.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
        }

        public TurboArtCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("turbo-art-compiler");
        }
    }

    public OdexSchemeArtTurbo(DexManifest.Dex[] dexArr) {
        super(8, makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, null)));
    }

    public static List<ExpectedFileInfo> makeExpectedFileInfoList(DexManifest.Dex[] dexArr, String str) {
        int length = dexArr.length;
        if (str != null) {
            length++;
        }
        ArrayList arrayListA11 = C60O.A11(length);
        for (DexManifest.Dex dex : dexArr) {
            arrayListA11.add(new ExpectedFileInfo(dex));
        }
        if (str != null) {
            arrayListA11.add(new ExpectedFileInfo(str));
        }
        return arrayListA11;
    }

    public static String getArch() {
        String str = Build.SUPPORTED_32_BIT_ABIS[0];
        if (str.equals("x86")) {
            return "x86";
        }
        if (str.equals("armeabi-v7a")) {
            return "arm";
        }
        throw BV5.A0h("Unknown ABI ", str);
    }

    public static String getOreoOdexOutputDirectory(File file, boolean z) {
        File fileA0L = BV5.A0L("oat/", getArch(), file);
        if (z) {
            Fs.mkdirOrThrow(fileA0L);
        }
        return FGI.A0M(fileA0L.getPath(), CustomConnectorRegisterRepositoryKt.ROOT_PATH);
    }

    public static String[] makeExpectedFileListFrom(List<ExpectedFileInfo> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i).toExpectedFileString();
        }
        return strArr;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (!sAttemptedArtHackInstallation) {
            sAttemptedArtHackInstallation = true;
            try {
                RuntimeInternals.installArtHacks(0, i);
            } catch (Exception e) {
                Mlog.w(e, "failed to install verifier-disabling ART hacks; continuing slowly", new Object[0]);
            }
        }
        int enabledThreadArtHacks = RuntimeInternals.getEnabledThreadArtHacks();
        RuntimeInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
        try {
            BV6.A1G("enabled ART verifier hack (warning-level logs following are expected)");
            while (true) {
                String[] strArr = this.expectedFiles;
                if (i2 >= strArr.length) {
                    return;
                }
                if (!strArr[i2].equals(OREO_ODEX_DIR)) {
                    classLoaderConfiguration.addDex(C3cG.A0O(file, strArr[i2]), true);
                }
                i2++;
            }
        } finally {
            RuntimeInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
            BV6.A1G("restored old ART hack mask");
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeArtTurbo";
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public final OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboArtCompiler(dexStore, i);
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, String str) {
        return makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, str));
    }

    public OdexSchemeArtTurbo(int i, String[] strArr) {
        super(i, strArr);
    }
}
