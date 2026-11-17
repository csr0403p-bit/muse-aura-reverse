package com.facebook.common.dextricks.achilles;

import X.C5J;
import X.CA1;
import X.ETi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.facebook.common.build.BuildConstants;
import dalvik.system.BaseDexClassLoader;
import java.util.List;

/* loaded from: classes5.dex */
public class Achilles implements Runnable {
    public final Object ctx;
    public Throwable exc;
    public final long func;

    public static native long addccl();

    public static native long derp();

    public static native long existsNDLWS();

    public static native long ferp();

    public static native long getSLL();

    public static native long getrep();

    public static native long performDOPTS();

    public static native long recSDF();

    public static native long setrep();

    public static native long srclc();

    @Override // java.lang.Runnable
    public native void run();

    public class Arrow {
        public final List<ClassLoader> chain;
        public final BaseDexClassLoader cl;
        public final List<String> classPaths;
        public final String[] codePaths;
        public final String compilerFilter;
        public final ClassLoader customClassLoader;
        public boolean dexOptResult;
        public boolean existsNDLWS;
        public final boolean force;
        public final String loaderIsa;
        public final String packageName;
        public final PackageManager pm;
        public final String profileFile;
        public Object reporter;
        public final int sdk;
        public boolean sharedLibraryLoadersAfterAppended;
        public ClassLoader[] slCl;

        public Arrow(BaseDexClassLoader baseDexClassLoader) {
            this.sdk = Build.VERSION.SDK_INT;
            this.existsNDLWS = false;
            this.slCl = null;
            this.dexOptResult = false;
            this.sharedLibraryLoadersAfterAppended = false;
            this.cl = baseDexClassLoader;
            this.profileFile = null;
            this.codePaths = null;
            this.chain = null;
            this.classPaths = null;
            this.packageName = null;
            this.loaderIsa = null;
            this.pm = null;
            this.compilerFilter = "";
            this.force = false;
            this.customClassLoader = null;
        }

        public Arrow(BaseDexClassLoader baseDexClassLoader, ClassLoader classLoader) {
            this.sdk = Build.VERSION.SDK_INT;
            this.existsNDLWS = false;
            this.slCl = null;
            this.dexOptResult = false;
            this.sharedLibraryLoadersAfterAppended = false;
            this.cl = baseDexClassLoader;
            this.customClassLoader = classLoader;
            this.profileFile = null;
            this.codePaths = null;
            this.chain = null;
            this.classPaths = null;
            this.packageName = null;
            this.loaderIsa = null;
            this.pm = null;
            this.compilerFilter = "";
            this.force = false;
        }

        public Arrow(String str, String str2, boolean z, PackageManager packageManager) {
            this.sdk = Build.VERSION.SDK_INT;
            this.slCl = null;
            this.dexOptResult = false;
            this.sharedLibraryLoadersAfterAppended = false;
            this.cl = null;
            this.chain = null;
            this.classPaths = null;
            this.codePaths = null;
            this.profileFile = null;
            this.packageName = str;
            this.loaderIsa = null;
            this.pm = packageManager;
            this.existsNDLWS = false;
            this.compilerFilter = str2;
            this.force = z;
            this.customClassLoader = null;
        }

        public Arrow(BaseDexClassLoader baseDexClassLoader, String str, String str2, PackageManager packageManager, boolean z) {
            this.sdk = Build.VERSION.SDK_INT;
            this.slCl = null;
            this.dexOptResult = false;
            this.sharedLibraryLoadersAfterAppended = false;
            this.cl = baseDexClassLoader;
            this.chain = null;
            this.classPaths = null;
            this.codePaths = null;
            this.profileFile = null;
            this.packageName = str;
            this.loaderIsa = str2;
            this.pm = packageManager;
            this.existsNDLWS = z;
            this.compilerFilter = "";
            this.force = false;
            this.customClassLoader = null;
        }

        public Arrow(String[] strArr, BaseDexClassLoader baseDexClassLoader, List<ClassLoader> list, List<String> list2, String str, String str2, PackageManager packageManager, boolean z) {
            this.sdk = Build.VERSION.SDK_INT;
            this.slCl = null;
            this.dexOptResult = false;
            this.sharedLibraryLoadersAfterAppended = false;
            this.codePaths = strArr;
            this.cl = baseDexClassLoader;
            this.chain = list;
            this.classPaths = list2;
            this.profileFile = null;
            this.packageName = str;
            this.loaderIsa = str2;
            this.pm = packageManager;
            this.existsNDLWS = z;
            this.compilerFilter = "";
            this.force = false;
            this.customClassLoader = null;
        }

        public Arrow(String str, PackageManager packageManager) {
            this.sdk = Build.VERSION.SDK_INT;
            this.slCl = null;
            this.dexOptResult = false;
            this.sharedLibraryLoadersAfterAppended = false;
            this.cl = null;
            this.chain = null;
            this.classPaths = null;
            this.codePaths = null;
            this.profileFile = null;
            this.packageName = str;
            this.loaderIsa = null;
            this.pm = packageManager;
            this.existsNDLWS = false;
            this.compilerFilter = "";
            this.force = false;
            this.customClassLoader = null;
        }

        public Arrow(String str, String[] strArr) {
            this.sdk = Build.VERSION.SDK_INT;
            this.existsNDLWS = false;
            this.slCl = null;
            this.dexOptResult = false;
            this.sharedLibraryLoadersAfterAppended = false;
            this.profileFile = str;
            this.codePaths = strArr;
            this.cl = null;
            this.chain = null;
            this.classPaths = null;
            this.packageName = null;
            this.loaderIsa = null;
            this.pm = null;
            this.compilerFilter = "";
            this.force = false;
            this.customClassLoader = null;
        }

        public Arrow() {
            this.sdk = Build.VERSION.SDK_INT;
            this.slCl = null;
            this.dexOptResult = false;
            this.sharedLibraryLoadersAfterAppended = false;
            this.cl = null;
            this.profileFile = null;
            this.codePaths = null;
            this.chain = null;
            this.classPaths = null;
            this.packageName = null;
            this.loaderIsa = null;
            this.pm = null;
            this.existsNDLWS = false;
            this.compilerFilter = "";
            this.force = false;
            this.customClassLoader = null;
        }
    }

    static {
        Log.w("Achilles", "Loading achilles-jni.so with SoLoader");
        ETi.loadLibrary("achilles-jni");
        Log.w("Achilles", "achilles-jni.so is loaded");
    }

    public static boolean addTosharedLibraryLoadersAfter(BaseDexClassLoader baseDexClassLoader, ClassLoader classLoader) throws InterruptedException {
        Arrow arrow = new Arrow(baseDexClassLoader, classLoader);
        attack(arrow, addccl());
        return arrow.sharedLibraryLoadersAfterAppended;
    }

    public static void attack(Object obj, long j) throws InterruptedException {
        Achilles achilles = new Achilles(obj, j);
        Thread thread = new Thread(achilles);
        thread.setUncaughtExceptionHandler(new CA1());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            Log.w("Achilles", "Failed to join on achilles thread: %s", e);
        }
        if (achilles.exc != null) {
            boolean zA02 = BuildConstants.A02();
            Throwable th = achilles.exc;
            if (zA02) {
                C5J.A01(th);
            } else {
                C5J.A00("Achilles", "Caught exception in Achilles thread", th);
            }
        }
    }

    public static boolean existsNotifyDexLoadWithStatus() throws InterruptedException {
        Arrow arrow = new Arrow();
        attack(arrow, existsNDLWS());
        return arrow.existsNDLWS;
    }

    public static Object getDexLoadReporter() throws InterruptedException {
        Arrow arrow = new Arrow();
        attack(arrow, getrep());
        return arrow.reporter;
    }

    public static void registerAppInfo(String str, String[] strArr) throws InterruptedException {
        attack(new Arrow(str, strArr), derp());
    }

    public static void reportClassLoaderChain(BaseDexClassLoader baseDexClassLoader) throws InterruptedException {
        attack(new Arrow(baseDexClassLoader), ferp());
    }

    public static void setDexLoadReporter(Object obj) throws InterruptedException {
        Arrow arrow = new Arrow();
        arrow.reporter = obj;
        attack(arrow, setrep());
    }

    public static void simulateReportClassLoaderChainQ(String[] strArr, BaseDexClassLoader baseDexClassLoader, List<ClassLoader> list, List<String> list2, String str, String str2, PackageManager packageManager, boolean z) throws InterruptedException {
        attack(new Arrow(strArr, baseDexClassLoader, list, list2, "com.facebook.aura", str2, packageManager, z), srclc());
    }

    public static void simulateReportClassLoaderChainR(BaseDexClassLoader baseDexClassLoader, String str, String str2, PackageManager packageManager, boolean z) throws InterruptedException {
        attack(new Arrow(baseDexClassLoader, "com.facebook.aura", str2, packageManager, z), srclc());
    }

    public Achilles(Object obj, long j) {
        this.ctx = obj;
        this.func = j;
    }
}
