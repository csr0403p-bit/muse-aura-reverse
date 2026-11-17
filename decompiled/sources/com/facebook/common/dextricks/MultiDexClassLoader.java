package com.facebook.common.dextricks;

import X.AbstractC3277C7e;
import X.AnonymousClass007;
import X.BV4;
import X.C3227C4k;
import X.C3cG;
import X.C6B;
import X.F18;
import X.FGI;
import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.errorreporting.field.ReportFieldString;
import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class MultiDexClassLoader extends ClassLoader implements ColdStartAwareClassLoader, DexFileAccessLoggingClassLoader {
    public static final ClassLoader APP_CLASSLOADER;
    public static final Field CLASSLOADER_PARENT_FIELD;
    public static final Object INSTALL_LOCK = C3cG.A0T();
    public static final ClassLoader SYSTEM_CLASSLOADER;
    public static final String TAG = "MultiDexClassLoader";
    public static boolean sHadFancyLoaderFailure;
    public static volatile ClassLoader sInstalledClassLoader;
    public DexFileAccessListener dexFileAccessListener;
    public ClassLoaderConfiguration mConfig;
    public final ClassLoader mPutativeLoader;
    public DexFile[] subscribedDexFiles;

    public abstract void configure(ClassLoaderConfiguration classLoaderConfiguration);

    public abstract DexFile[] doGetConfiguredDexFiles();

    public abstract String[] getRecentFailedClasses();

    @Override // com.facebook.common.dextricks.ColdStartAwareClassLoader
    public void onColdstartDone() {
    }

    public abstract String verboseDescription();

    public MultiDexClassLoader() {
        super(SYSTEM_CLASSLOADER);
        this.dexFileAccessListener = null;
        this.subscribedDexFiles = null;
        this.mPutativeLoader = APP_CLASSLOADER;
    }

    public static boolean classInLongtailModule(String str) {
        if (sInstalledClassLoader instanceof MultiDexClassLoaderJava) {
            return NameClassifier.A01(MultiDexClassLoaderJava.sEncodedLongtailUnrenamedTypes, str);
        }
        return false;
    }

    public static ClassLoader createMultiDexClassLoader(Context context, ArrayList<DexFile> arrayList, ArrayList<DexFile> arrayList2) {
        SystemProperties.get("com.facebook.force_mdclj");
        return new MultiDexClassLoaderJava(context, arrayList, arrayList2);
    }

    public static void forceLoadProfiloIfPresent() throws ClassNotFoundException {
        try {
            Class.forName("com.facebook.profilo.logger.api.ProfiloClassLoadTracer");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static ClassLoader get() {
        return sInstalledClassLoader;
    }

    public static ClassLoaderConfiguration getConfiguration() {
        ClassLoader classLoader = sInstalledClassLoader;
        if (classLoader instanceof MultiDexClassLoader) {
            return ((MultiDexClassLoader) classLoader).mConfig;
        }
        return null;
    }

    public static DexFile[] getConfiguredDexFiles() {
        ClassLoader classLoader = sInstalledClassLoader;
        return !(classLoader instanceof MultiDexClassLoader) ? new DexFile[0] : ((MultiDexClassLoader) classLoader).doGetConfiguredDexFiles();
    }

    public static ClassLoader getSysClassloader() {
        return SYSTEM_CLASSLOADER;
    }

    public static boolean hadFancyLoaderFailure() {
        return sHadFancyLoaderFailure;
    }

    public static ClassLoader install(Context context, ArrayList<DexFile> arrayList, ArrayList<DexFile> arrayList2) {
        ClassLoader classLoaderCreateMultiDexClassLoader;
        ClassLoader classLoader = sInstalledClassLoader;
        if (classLoader != null) {
            return classLoader;
        }
        synchronized (INSTALL_LOCK) {
            classLoaderCreateMultiDexClassLoader = sInstalledClassLoader;
            if (classLoaderCreateMultiDexClassLoader == null) {
                try {
                    Class.forName("com.facebook.common.dextricks.FatalDexError");
                    Class.forName("com.facebook.common.dextricks.DexFileLoadOld");
                    Class.forName("com.facebook.common.dextricks.DexFileLoadNew");
                    Class.forName("com.facebook.common.dextricks.classifier.NameClassifier");
                    Class.forName("com.facebook.common.dextricks.ClassLoadingStatsHolder");
                    Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStatsJava");
                    Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats");
                    Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerLite");
                    Class.forName("com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger");
                    Class.forName("com.facebook.common.dextricks.benchmarkhelper.ClassloadNameCollector");
                    Class.forName("com.facebook.common.dextricks.classid.ClassId");
                    Class.forName("com.facebook.common.dextricks.StringTreeSet");
                    Class.forName("com.facebook.common.dextricks.fallback.FallbackDexLoader");
                    Class.forName("com.facebook.common.dextricks.ClassLoadsListener");
                    Class.forName("com.facebook.common.dextricks.ClassLoadsLoggingProvider");
                    Class.forName("com.facebook.common.dextricks.ClassLoadsTracer");
                    Class.forName("com.facebook.common.dextricks.ClassLoadsNotifier");
                    Class.forName("com.facebook.common.appcomponentfactory.doppelganger.DoppelDexStatus");
                    forceLoadProfiloIfPresent();
                    C3227C4k c3227C4k = AbstractC3277C7e.A00;
                    if (c3227C4k != null) {
                        c3227C4k.A00(new ReportFieldString(-2, "recentClassLoadFailures", true), new F18<String>() { // from class: com.facebook.common.dextricks.MultiDexClassLoader.1
                            @Override // X.F18
                            /* renamed from: get, reason: avoid collision after fix types in other method */
                            public String AMN() {
                                ClassLoader classLoader2 = MultiDexClassLoader.sInstalledClassLoader;
                                return classLoader2 instanceof MultiDexClassLoader ? Arrays.toString(((MultiDexClassLoader) classLoader2).getRecentFailedClasses()) : "";
                            }
                        });
                        c3227C4k.A00(C6B.A98, new F18<String>() { // from class: com.facebook.common.dextricks.MultiDexClassLoader.2
                            @Override // X.F18
                            /* renamed from: get */
                            public /* bridge */ /* synthetic */ String AMN() {
                                return AnonymousClass007.A0a("", MultiDexClassLoader.sInstalledClassLoader);
                            }

                            @Override // X.F18
                            /* renamed from: get, reason: avoid collision after fix types in other method */
                            public String AMN() {
                                return AnonymousClass007.A0a("", MultiDexClassLoader.sInstalledClassLoader);
                            }
                        });
                    }
                    classLoaderCreateMultiDexClassLoader = createMultiDexClassLoader(context, arrayList, arrayList2);
                    try {
                        ClassLoadsTracer.install((MultiDexClassLoaderJava) classLoaderCreateMultiDexClassLoader);
                        CLASSLOADER_PARENT_FIELD.set(((MultiDexClassLoader) classLoaderCreateMultiDexClassLoader).mPutativeLoader, classLoaderCreateMultiDexClassLoader);
                        sInstalledClassLoader = classLoaderCreateMultiDexClassLoader;
                    } catch (IllegalAccessException e) {
                        throw BV4.A0e(e);
                    }
                } catch (ClassNotFoundException e2) {
                    throw BV4.A0e(e2);
                }
            }
        }
        return classLoaderCreateMultiDexClassLoader;
    }

    public static boolean isNativeHookUseable() {
        return false;
    }

    public void configureArtHacks(ClassLoaderConfiguration classLoaderConfiguration) {
        if (classLoaderConfiguration.disableVerifier) {
            RuntimeInternals.installArtHacks(4, Build.VERSION.SDK_INT);
        }
    }

    public ClassLoaderConfiguration getConfig() {
        return this.mConfig;
    }

    public final Class<?> maybeFallbackLoadClass(String str, Throwable th) throws ClassNotFoundException {
        try {
            if (th instanceof ClassNotFoundException) {
                throw ((ClassNotFoundException) th);
            }
            throw new ClassNotFoundException(str, th);
        } catch (RuntimeException e) {
            throw new ClassNotFoundException(FGI.A0M("Fallback class load failed for ", str), e);
        }
    }

    public void observeDexFileLoad(DexFile dexFile, Class<?> cls) {
        DexFile[] dexFileArr;
        DexFileAccessListener dexFileAccessListener;
        if (cls == null || (dexFileArr = this.subscribedDexFiles) == null || (dexFileAccessListener = this.dexFileAccessListener) == null) {
            return;
        }
        for (DexFile dexFile2 : dexFileArr) {
            if (dexFile == dexFile2) {
                dexFileAccessListener.onClassLoadedFromDexFile(cls, dexFile);
                return;
            }
        }
    }

    @Override // com.facebook.common.dextricks.DexFileAccessLoggingClassLoader
    public void subscribeToDexFileAccesses(DexFile[] dexFileArr, DexFileAccessListener dexFileAccessListener) {
        this.subscribedDexFiles = dexFileArr;
        this.dexFileAccessListener = dexFileAccessListener;
    }

    static {
        try {
            ClassLoader classLoader = MultiDexClassLoader.class.getClassLoader();
            APP_CLASSLOADER = classLoader;
            Field declaredField = ClassLoader.class.getDeclaredField("parent");
            CLASSLOADER_PARENT_FIELD = declaredField;
            declaredField.setAccessible(true);
            SYSTEM_CLASSLOADER = (ClassLoader) declaredField.get(classLoader);
        } catch (Exception e) {
            throw BV4.A0e(e);
        }
    }

    public static final boolean maybeFallbackLoadDexes(String str, Throwable th) {
        return false;
    }
}
