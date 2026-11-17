package com.facebook.common.dextricks;

import X.AnonymousClass002;
import X.BV4;
import X.C5M;
import X.CBf;
import android.os.Build;
import android.util.Log;
import com.facebook.common.dextricks.achilles.Achilles;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DelegateLastClassLoader;

/* loaded from: classes5.dex */
public abstract class ReflectionClassLoader extends ClassLoader {
    public static final ClassLoader APP_CLASSLOADER;
    public static final String TAG = "ReflectionClassLoader";
    public static volatile ReflectionClassLoader sInstalledClassLoader;
    public final ClassLoader mPutativeLoader;

    public static boolean allowedVersion(boolean z) {
        return z || Build.VERSION.SDK_INT >= 33;
    }

    static {
        try {
            APP_CLASSLOADER = ReflectionClassLoader.class.getClassLoader();
        } catch (Exception e) {
            throw BV4.A0e(e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReflectionClassLoader() {
        ClassLoader classLoader = APP_CLASSLOADER;
        super(classLoader.getParent());
        this.mPutativeLoader = classLoader;
    }

    public static ReflectionClassLoader createReflectionClassLoader() {
        return new ReflectionClassLoaderJava();
    }

    public static synchronized ReflectionClassLoader install() {
        ReflectionClassLoader reflectionClassLoader;
        if (sInstalledClassLoader != null) {
            reflectionClassLoader = sInstalledClassLoader;
        } else {
            boolean z = CBf.class.getClassLoader() instanceof DelegateLastClassLoader;
            reflectionClassLoader = null;
            if (!allowedVersion(z)) {
                C5M.A01(TAG, "Not targeting this build or os version.", new Object[0]);
            } else if (ProcessHelper.isIsolatedOrAppZygoteProcess()) {
                C5M.A01(TAG, "Not targeting isolated or app_zyoget process.", new Object[0]);
            } else {
                try {
                    ReflectionClassLoaderJava reflectionClassLoaderJava = new ReflectionClassLoaderJava();
                    if (z) {
                        BV4.A0r(ClassLoader.class, "parent").set(APP_CLASSLOADER, reflectionClassLoaderJava);
                        C5M.A01(TAG, " Successfully install ReflectionClassLoader as parent!", new Object[0]);
                    } else {
                        if (!Achilles.addTosharedLibraryLoadersAfter((BaseDexClassLoader) APP_CLASSLOADER, reflectionClassLoaderJava)) {
                            throw BV4.A0c("ReflectionClassLoaderFailed to set reflection");
                        }
                        C5M.A01(TAG, " Successfully set reflection on sharedLibraryLoadersAfter!", new Object[0]);
                    }
                    sInstalledClassLoader = reflectionClassLoaderJava;
                    return reflectionClassLoaderJava;
                } catch (Exception e) {
                    Log.w(TAG, C5M.A00(" Failed to install reflection class loader %s", e), e);
                }
            }
        }
        return reflectionClassLoader;
    }

    public static boolean isInstalled() {
        return AnonymousClass002.A1X(sInstalledClassLoader);
    }

    public static final boolean maybeFallbackLoadDexes(String str) {
        return false;
    }
}
