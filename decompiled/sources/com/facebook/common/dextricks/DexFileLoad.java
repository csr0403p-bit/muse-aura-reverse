package com.facebook.common.dextricks;

import dalvik.system.DexFile;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class DexFileLoad {
    public static boolean sUseLazyLoadDexMethod;

    public class LoadDexMethodHolder {
        public static final Method sLoadDexMethod;

        static {
            Method loadMethodWithClassLoader;
            try {
                loadMethodWithClassLoader = DexFileLoad.getLoadMethodWithClassLoader();
            } catch (SecurityException unused) {
                loadMethodWithClassLoader = null;
            }
            sLoadDexMethod = loadMethodWithClassLoader;
        }

        public static Method safeGetLoadMethodWithClassLoader() {
            try {
                return DexFileLoad.getLoadMethodWithClassLoader();
            } catch (SecurityException unused) {
                return null;
            }
        }
    }

    public static void init() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[PHI: r3
  0x0022: PHI (r3v5 dalvik.system.DexFile) = (r3v0 dalvik.system.DexFile), (r3v1 dalvik.system.DexFile), (r3v0 dalvik.system.DexFile) binds: [B:3:0x0002, B:14:0x0022, B:8:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dalvik.system.DexFile loadDex(java.lang.String r5, java.lang.String r6, java.lang.ClassLoader r7) {
        /*
            r4 = 0
            r3 = 0
            if (r7 == 0) goto L22
            boolean r0 = com.facebook.common.dextricks.DexFileLoad.sUseLazyLoadDexMethod     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lb
            java.lang.reflect.Method r2 = com.facebook.common.dextricks.DexFileLoad.LoadDexMethodHolder.sLoadDexMethod     // Catch: java.lang.Throwable -> L22
            goto Lf
        Lb:
            java.lang.reflect.Method r2 = getLoadMethodWithClassLoader()     // Catch: java.lang.Throwable -> L22
        Lf:
            if (r2 == 0) goto L22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L22
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r6, r0, r7, r3}     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r2.invoke(r3, r0)     // Catch: java.lang.Throwable -> L22
            dalvik.system.DexFile r0 = (dalvik.system.DexFile) r0     // Catch: java.lang.Throwable -> L22
            r3 = r0
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 != 0) goto L29
            dalvik.system.DexFile r3 = dalvik.system.DexFile.loadDex(r5, r6, r4)
        L29:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexFileLoad.loadDex(java.lang.String, java.lang.String, java.lang.ClassLoader):dalvik.system.DexFile");
    }

    public static Method getLoadMethodWithClassLoader() throws SecurityException {
        for (Method method : DexFile.class.getDeclaredMethods()) {
            if (method.getName().equals("loadDex") && method.getParameterTypes().length >= 5) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static void setUseLazyLoadDexMethod(boolean z) {
        sUseLazyLoadDexMethod = z;
    }
}
