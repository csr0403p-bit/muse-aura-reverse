package com.facebook.common.dextricks;

import X.BV4;
import X.C3cG;
import X.C5M;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class ClassLoaderConfiguration {
    public static final int BASE_DEX_RETRY_WAIT_MS = 500;
    public static final int LOAD_SECONDARY = 4;
    public static final int MAX_LOAD_DEX_RETRY = 3;
    public static final int SUPPORTS_LOCATORS = 2;
    public static final String TAG = "ClassLoaderConfiguration";
    public final ArrayList<String> coldstartDexBaseNames;
    public final int coldstartDexCount;
    public int configFlags;
    public boolean disableVerifier;
    public final ArrayList<DexFile> mDexFiles;

    private void appendColdstartDexBaseName(File file) {
        if (this.coldstartDexBaseNames.size() < this.coldstartDexCount) {
            String name = file.getName();
            String strA0j = BV4.A0j(name, name.indexOf(46));
            this.coldstartDexBaseNames.add(strA0j);
            RuntimeInternals.addDexBaseNames(strA0j);
        }
    }

    public void addDex(DexFile dexFile) {
        this.mDexFiles.add(dexFile);
    }

    public void addDexFileToClassLoaderPath(BaseDexClassLoader baseDexClassLoader) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<DexFile> it = this.mDexFiles.iterator();
        while (it.hasNext()) {
            arrayListA0h.add(BV4.A0G(it.next().getName()));
        }
        try {
            IOException[] iOExceptionArrThreadSafeAddDexPathSynchronized = OdexSchemeOreo.threadSafeAddDexPathSynchronized(baseDexClassLoader, arrayListA0h);
            if (iOExceptionArrThreadSafeAddDexPathSynchronized != null) {
                C5M.A01(TAG, "%d suppressed exceptions were found in BaseDexClassLoader.", Integer.valueOf(iOExceptionArrThreadSafeAddDexPathSynchronized.length));
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    C5M.A01(TAG, "Dex file: %s", it2.next());
                }
                for (IOException iOException : iOExceptionArrThreadSafeAddDexPathSynchronized) {
                    Log.w(TAG, C5M.A00("Suppressed exception:", new Object[0]), iOException);
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            throw BV4.A0d("ClassLoaderConfigurationfail to add dex file to class loader path", e);
        }
    }

    public int getConfigFlags() {
        return this.configFlags;
    }

    public boolean getDisableVerifier() {
        return this.disableVerifier;
    }

    public int getNumberConfiguredDexFiles() {
        return this.mDexFiles.size();
    }

    public ClassLoaderConfiguration(int i, int i2) {
        this.mDexFiles = C3cG.A0h();
        this.coldstartDexBaseNames = C3cG.A0h();
        this.configFlags = i;
        this.coldstartDexCount = i2;
        this.disableVerifier = false;
    }

    public void setConfigFlags(int i) {
        this.configFlags = i;
    }

    public void setDisableVerifier(boolean z) {
        this.disableVerifier = z;
    }

    public ClassLoaderConfiguration(int i, int i2, boolean z) {
        this.mDexFiles = C3cG.A0h();
        this.coldstartDexBaseNames = C3cG.A0h();
        this.configFlags = i;
        this.coldstartDexCount = i2;
        this.disableVerifier = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r8.mDexFiles.add(r1);
        appendColdstartDexBaseName(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        throw X.BV5.A0M("Could not load dex file ", r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addDex(java.io.File r9, java.io.File r10, boolean r11) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r8 = this;
            java.lang.String r5 = r9.getCanonicalPath()
            r6 = 0
            if (r10 == 0) goto Lb
            java.lang.String r6 = r10.getCanonicalPath()
        Lb:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            r7 = 0
            if (r1 < r0) goto L15
            r9.setWritable(r7)
        L15:
            r4 = 0
        L16:
            int r4 = r4 + 1
            r3 = 3
            java.lang.String r0 = r9.getCanonicalPath()     // Catch: java.io.IOException -> L3a
            dalvik.system.DexFile r1 = dalvik.system.DexFile.loadDex(r0, r6, r7)     // Catch: java.io.IOException -> L3a
            if (r11 == 0) goto L24
            goto L2f
        L24:
            if (r1 == 0) goto L33
        L26:
            java.util.ArrayList<dalvik.system.DexFile> r0 = r8.mDexFiles
            r0.add(r1)
            r8.appendColdstartDexBaseName(r9)
            return
        L2f:
            if (r1 != 0) goto L26
            if (r4 <= r3) goto L48
        L33:
            java.lang.String r0 = "Could not load dex file "
            java.io.IOException r0 = X.BV5.A0M(r0, r5)
            throw r0
        L3a:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r2}
            java.lang.String r0 = "ClassLoaderConfiguration Failed loading dex ( %s )"
            com.facebook.common.dextricks.Mlog.w(r0, r1)
            if (r11 == 0) goto L55
            if (r3 < r4) goto L55
        L48:
            if (r4 <= 0) goto L16
            int r0 = r4 * 500
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L51
            goto L16
        L51:
            X.BV4.A1A()
            goto L16
        L55:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ClassLoaderConfiguration.addDex(java.io.File, java.io.File, boolean):void");
    }

    public void addDex(File file, File file2) throws InterruptedException, IOException {
        addDex(file, file2, false);
    }

    public void addDex(File file, boolean z) throws InterruptedException, IOException {
        addDex(file, null, z);
    }

    public void addDex(File file) throws InterruptedException, IOException {
        addDex(file, false);
    }
}
