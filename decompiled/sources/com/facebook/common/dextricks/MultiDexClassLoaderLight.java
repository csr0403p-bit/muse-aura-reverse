package com.facebook.common.dextricks;

import X.AnonymousClass002;
import X.BV4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.CAy;
import X.CFK;
import X.FGI;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.common.dextricks.halfnosis.HalfnosisClassNotFoundException;
import com.facebook.common.dextricks.utils.DexUtils$FindApplicationDexException;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class MultiDexClassLoaderLight extends ClassLoader implements ClassLoadsLoggingProvider {
    public static volatile MultiDexClassLoaderLight INSTANCE = null;
    public static final String[] REQUIRED_PRELOAD_CLASSES = {"com.facebook.common.dextricks.DexFileLoadNew", "com.facebook.common.dextricks.classifier.NameClassifier", "com.facebook.common.dextricks.StringTreeSet", "com.facebook.common.dextricks.MultiDexClassLoaderJava", "com.facebook.common.dextricks.halfnosis.Halfnosis", "com.facebook.common.dextricks.halfnosis.HalfnosisClassNotFoundException", "com.facebook.common.build.BuildConstants", "android.util.Log", "java.lang.StringBuilder", "com.facebook.common.dextricks.ClassLoadsListener", "com.facebook.common.dextricks.ClassLoadsLoggingProvider", "com.facebook.common.dextricks.ClassLoadsTracer", "com.facebook.common.dextricks.ClassLoadsNotifier", "com.facebook.common.dextricks.ClassLoadingStatsHolder", "com.facebook.common.dextricks.stats.ClassLoadingStats", "com.facebook.common.dextricks.stats.ClassLoadingStatsJava", "com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats", "com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger", "com.facebook.common.dextricks.benchmarkhelper.ClassloadNameCollector"};
    public static final String TAG = "MDCLLight";
    public final DexFile mBaseApkDex;
    public final ClassLoadsNotifier mClassLoadsNotifier;
    public final ClassLoader mPutativeLoader;

    public static MultiDexClassLoaderLight getInstance() {
        return INSTANCE;
    }

    public static synchronized boolean install(ApplicationInfo applicationInfo, ClassLoader classLoader) {
        if (ProcessHelper.isIsolatedOrAppZygoteProcess()) {
            CFK.A06(TAG, "Not targeting isolated processes.");
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                if (INSTANCE == null || INSTANCE.mPutativeLoader != classLoader) {
                    try {
                        Field fieldA0r = BV4.A0r(ClassLoader.class, "parent");
                        preloadRequiredClasses();
                        ArrayList arrayListA0h = C3cG.A0h();
                        ArrayList arrayListA0h2 = C3cG.A0h();
                        try {
                            CAy.A01(applicationInfo, classLoader, arrayListA0h, arrayListA0h2);
                        } catch (DexUtils$FindApplicationDexException e) {
                            CFK.A0A(TAG, "failure to locate primary/auxiliary dexes.", e);
                            arrayListA0h.clear();
                            arrayListA0h2.clear();
                        }
                        if (arrayListA0h.isEmpty()) {
                            CFK.A04(TAG, "No dex primary files found, skipping install MDCLLight!");
                        } else {
                            ClassLoader parent = classLoader.getParent();
                            if (parent == null) {
                                CFK.A04(TAG, "Parent classloader is null, skipping install MDCLLight!");
                            } else {
                                if (arrayListA0h.size() != 1) {
                                    CFK.A04(TAG, "More than 1 base.apk dex file found, something is unexpected!");
                                }
                                MultiDexClassLoaderLight multiDexClassLoaderLight = new MultiDexClassLoaderLight(parent, (DexFile) arrayListA0h.get(0), classLoader);
                                ClassLoadsTracer.install(true, multiDexClassLoaderLight);
                                fieldA0r.set(classLoader, multiDexClassLoaderLight);
                                INSTANCE = multiDexClassLoaderLight;
                            }
                        }
                    } catch (Exception e2) {
                        CFK.A08(TAG, "Failed to install MultiDexClassLoaderLight", e2);
                    }
                } else {
                    CFK.A06(TAG, "MultiDexClassLoaderLight already installed");
                }
                return true;
            }
            CFK.A06(TAG, "Not targeting this build or os version.");
        }
        return false;
    }

    public static boolean isInstalled() {
        return AnonymousClass002.A1X(INSTANCE);
    }

    private Class<?> maybeFallbackLoadClass(String str) {
        try {
            maybeFallbackLoadDexes(str);
            C60O.A1P("Fallback load dex failed for ", str, TAG);
            return null;
        } catch (ClassNotFoundException | RuntimeException e) {
            C3cH.A1B("Failed to load class from MDCL: ", str, TAG, e);
            return null;
        }
    }

    private boolean maybeFallbackLoadDexes(String str) throws HalfnosisClassNotFoundException {
        if (!NameClassifier.A01(MultiDexClassLoaderJava.sEncodedLongtailUnrenamedTypes, str)) {
            C3cG.A1G("tryFallbackLoadDex: fallbackLoader is null, unable to fallback load dex for ", str, TAG);
            return false;
        }
        HalfnosisClassNotFoundException halfnosisClassNotFoundException = new HalfnosisClassNotFoundException(str);
        CFK.A08(TAG, FGI.A0U("Halfnosis class load attempts ", str, " before fallback loader is setup, this needs to be fixed!"), halfnosisClassNotFoundException);
        throw halfnosisClassNotFoundException;
    }

    public static void preloadRequiredClasses() throws ClassNotFoundException {
        try {
            for (String str : REQUIRED_PRELOAD_CLASSES) {
                Class.forName(str);
            }
        } catch (ClassNotFoundException e) {
            throw BV4.A0e(e);
        }
    }

    @Override // com.facebook.common.dextricks.ClassLoadsLoggingProvider
    public void addListener(ClassLoadsListener classLoadsListener) {
        this.mClassLoadsNotifier.addListener(classLoadsListener);
    }

    @Override // java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> clsLoadClassBinaryName = DexFileLoadNew.loadClassBinaryName(this.mBaseApkDex, str, this.mPutativeLoader);
        if (clsLoadClassBinaryName != null) {
            return clsLoadClassBinaryName;
        }
        throw new ClassNotFoundException(str);
    }

    public MultiDexClassLoaderLight(ClassLoader classLoader, DexFile dexFile, ClassLoader classLoader2) {
        super(classLoader);
        this.mClassLoadsNotifier = new ClassLoadsNotifier();
        this.mBaseApkDex = dexFile;
        this.mPutativeLoader = classLoader2;
    }

    private Class<?> loadFromParent(String str) {
        try {
            return getParent().loadClass(str);
        } catch (ClassNotFoundException e) {
            CFK.A0A(TAG, FGI.A0M("Failed to load class from parent: ", str), e);
            return null;
        }
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        boolean z2;
        Class<?> clsLoadFromParent;
        if (NameClassifier.A00(str)) {
            Class<?> clsLoadFromParent2 = loadFromParent(str);
            if (clsLoadFromParent2 != null) {
                return clsLoadFromParent2;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.mClassLoadsNotifier.notifyClassLoadBegin(str);
        Class<?> clsLoadClassBinaryName = DexFileLoadNew.loadClassBinaryName(this.mBaseApkDex, str, this.mPutativeLoader);
        if (clsLoadClassBinaryName != null) {
            this.mClassLoadsNotifier.notifyClassLoaded(clsLoadClassBinaryName);
            return clsLoadClassBinaryName;
        }
        if (!z2 && (clsLoadFromParent = loadFromParent(str)) != null) {
            CFK.A06(TAG, FGI.A0U("Class ", str, " was loaded on parent fallback. This should be fixed and added to the shouldAskParent method."));
            return clsLoadFromParent;
        }
        maybeFallbackLoadClass(str);
        this.mClassLoadsNotifier.notifyClassNotFound(str);
        throw new ClassNotFoundException(str);
    }
}
