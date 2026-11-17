package com.facebook.common.dextricks;

import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C9X;
import X.CAy;
import X.FGI;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.utils.DexUtils$FindApplicationDexException;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public final class DexLibLoader {
    public static final int LOAD_ALL_ASYNC_OPTIMIZATION = 4;
    public static final int LOAD_ALL_BETA_BUILD = 1;
    public static final int LOAD_ALL_INSTRUMENTATION_TEST = 16;
    public static final int LOAD_ALL_OPEN_ONLY = 2;
    public static final int LOAD_SECONDARY = 8;
    public static DexStore sMainDexStore;

    public final class ApkResProvider extends ResProvider {
        public static final String SECONDARY_PROGRAM_DEX_JARS = "secondary-program-dex-jars";
        public ZipFile mApkZip;
        public final Context mContext;

        @Override // com.facebook.common.dextricks.ResProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Fs.safeClose(this.mApkZip);
        }

        @Override // com.facebook.common.dextricks.ResProvider
        public void markRootRelative() {
            if (this.mApkZip == null) {
                this.mApkZip = new ZipFile(CAy.A00(this.mContext).getApplicationInfo().sourceDir);
            }
        }

        @Override // com.facebook.common.dextricks.ResProvider
        public InputStream open(String str) throws FileNotFoundException {
            ZipFile zipFile = this.mApkZip;
            if (zipFile == null || DexStoreUtils.SECONDARY_DEX_MANIFEST.equals(str)) {
                return this.mContext.getAssets().open(FGI.A0M("secondary-program-dex-jars/", str));
            }
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return this.mApkZip.getInputStream(entry);
            }
            throw new FileNotFoundException(FGI.A0M("cannot find root-relative resource: ", str));
        }

        public ApkResProvider(Context context) {
            this.mContext = context;
        }
    }

    public final class ExoPackageResProvider extends ResProvider {
        public static final String EXOPACKAGE_DIR = "/data/local/tmp/exopackage";
        public final File mDirectory;

        @Override // com.facebook.common.dextricks.ResProvider
        public boolean isExoResProvider() {
            return true;
        }

        @Override // com.facebook.common.dextricks.ResProvider
        public InputStream open(String str) {
            return BV4.A0H(C3cG.A0O(this.mDirectory, str));
        }

        public ExoPackageResProvider(Context context) {
            this.mDirectory = BV4.A0G(FGI.A0U("/data/local/tmp/exopackage/", context.getPackageName(), "/secondary-dex"));
        }

        @Override // com.facebook.common.dextricks.ResProvider
        public String getFilePath(String str) {
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(this.mDirectory);
            return C60P.A1M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str, sbA0w);
        }
    }

    public interface ResProviderShim {
        ResProvider install(ResProvider resProvider);
    }

    public static int loadAll(Context context) {
        return loadAll(context, 1, (LightweightQuickPerformanceLogger) null);
    }

    public static ResProvider obtainResProvider(Context context, boolean z) {
        return obtainResProvider(context, null, z);
    }

    public static ResProvider obtainResProviderInternal(Context context, boolean z) throws IOException {
        ApkResProvider apkResProvider = new ApkResProvider(context);
        try {
            apkResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
            return apkResProvider;
        } catch (Resources.NotFoundException | FileNotFoundException unused) {
            if (z) {
                ExoPackageResProvider exoPackageResProvider = new ExoPackageResProvider(context);
                try {
                    exoPackageResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
                    Mlog.i("using exopackage", new Object[0]);
                    return exoPackageResProvider;
                } catch (FileNotFoundException e) {
                    Mlog.v(e, "using exo res provider failed", new Object[0]);
                    return null;
                }
            }
            return null;
        }
    }

    public class CanaryLoaderImpl implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                for (DexStore dexStoreDexStoreListHead = DexStore.dexStoreListHead(); dexStoreDexStoreListHead != null; dexStoreDexStoreListHead = dexStoreDexStoreListHead.next) {
                    DexManifest dexManifest = dexStoreDexStoreListHead.mLoadedManifest;
                    if (dexManifest != null) {
                        for (int i = 0; i < dexManifest.dexes.length; i++) {
                            Class.forName(dexManifest.dexes[i].canaryClass);
                        }
                    }
                }
            } catch (Throwable th) {
                throw Fs.runtimeExFrom(th);
            }
        }
    }

    public static synchronized DexStore getMainDexStore() {
        return sMainDexStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int loadAllImpl(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProviderShim resProviderShim, DexStore.Config config) throws IllegalAccessException, PackageManager.NameNotFoundException, IOException, IllegalArgumentException, InvocationTargetException {
        DexErrorRecoveryInfo dexErrorRecoveryInfoLoadAll;
        int i2 = i & 1;
        boolean zA1L = AnonymousClass002.A1L(i2);
        Mlog.v("DLL.loadAll betaBuild:%s flags:0x%08x", BV5.A1a(Boolean.valueOf(zA1L), i));
        if ((i & 16) != 0) {
            BV6.A1G("DLL.loadAll instrumentation test mode");
            setupMainDexStoreConfigForInstrumentationTests(context, config);
        } else if (config != null) {
            throw C60O.A0i("Do not specify a config outside of test mode.");
        }
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        Context contextA00 = CAy.A00(context);
        try {
            CAy.A01(contextA00.getApplicationInfo(), DexLibLoader.class.getClassLoader(), arrayListA0h, arrayListA0h2);
        } catch (DexUtils$FindApplicationDexException e) {
            Mlog.w(e, "failure to locate primary/auxiliary dexes: perf loss", new Object[0]);
            arrayListA0h.clear();
            arrayListA0h2.clear();
        }
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        File fileA0G = BV4.A0G(contextA00.getApplicationInfo().sourceDir);
        if (!fileA0G.exists()) {
            if (arrayListA0h.isEmpty()) {
                throw BV4.A0c("Cannot determine base.apk");
            }
            fileA0G = BV4.A0G(((DexFile) arrayListA0h.get(0)).getName());
            Mlog.w("Main store will use %s as apk file.", fileA0G.getPath());
        }
        ResProvider resProviderObtainResProvider = obtainResProvider(context, resProviderShim, zA1L);
        try {
            if (resProviderObtainResProvider == null) {
                BV6.A1G("Nothing to do in DexLibLoader.loadAll: no resProvider");
                DexErrorRecoveryInfo.setMainDexStoreLoadInformation(new DexErrorRecoveryInfo());
                return 0;
            }
            Mlog.v("opening dex store %s", mainDexStoreLocation);
            DexStore dexStoreOpen = DexStore.open(mainDexStoreLocation, fileA0G, resProviderObtainResProvider, arrayListA0h, arrayListA0h2);
            sMainDexStore = dexStoreOpen;
            if (Build.VERSION.SDK_INT >= 30) {
                dexStoreOpen.markArtMainStore(context);
            }
            if ((i & 2) == 0) {
                boolean zA1L2 = AnonymousClass002.A1L(i2);
                int i3 = zA1L2;
                if ((i & 8) != 0) {
                    i3 = (zA1L2 ? 1 : 0) | 16;
                }
                int i4 = i3;
                if ((i & 4) != 0) {
                    i4 = (i3 == true ? 1 : 0) | 4;
                }
                C9X.A05();
                BV6.A1F("disabling background optimization");
                dexErrorRecoveryInfoLoadAll = dexStoreOpen.loadAll((i4 & (-5)) | 1 | 8, lightweightQuickPerformanceLogger, context);
                if ((dexErrorRecoveryInfoLoadAll.loadResult & 8) != 0) {
                    BV6.A1G("running deoptimized code");
                    DexErrorRecoveryInfo.sDeoptTaint = true;
                }
                dexErrorRecoveryInfoLoadAll.storeRegenFilename = dexStoreOpen.getRegenFile().getAbsolutePath();
            } else {
                BV6.A1G("skipping actual loadAll as requested");
                dexErrorRecoveryInfoLoadAll = null;
            }
            DexErrorRecoveryInfo.setMainDexStoreLoadInformation(dexErrorRecoveryInfoLoadAll);
            resProviderObtainResProvider.close();
            return 0;
        } catch (Throwable th) {
            if (resProviderObtainResProvider == null) {
                throw th;
            }
            try {
                resProviderObtainResProvider.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static void ensureConfig(Context context, DexStore.Config config, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            File fileA0O = C3cG.A0O(mainDexStoreLocation, "config");
            if (!fileA0O.exists() || z) {
                config.writeAndSync(fileA0O);
            }
        }
    }

    public static DexErrorRecoveryInfo getMainDexStoreLoadInformation() {
        return DexErrorRecoveryInfo.getMainDexStoreLoadInformation();
    }

    public static void handleUnoptimizedCodeForPerftest(Context context) {
        if (C9X.A05()) {
            throw BV5.A0U("In ct-scan mode, but not running optimized code. Out of disk space? Bad config? Load result: 0x", Integer.toHexString(DexErrorRecoveryInfo.getMainDexStoreLoadInformation().loadResult));
        }
    }

    public static void setupMainDexStoreConfigForInstrumentationTests(Context context, DexStore.Config config) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        Fs.deleteRecursive(mainDexStoreLocation);
        Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            config.writeAndSync(C3cG.A0O(mainDexStoreLocation, "config"));
        }
    }

    public static boolean shouldSynchronouslyGenerateOatFiles() {
        C9X.A05();
        return true;
    }

    public static boolean wasMainDexStoreRegenerated() {
        return (DexErrorRecoveryInfo.getMainDexStoreLoadInformation().loadResult & 1) != 0;
    }

    public static synchronized int loadAll(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        return loadAll(context, i, lightweightQuickPerformanceLogger, null, null);
    }

    public static ResProvider obtainResProvider(Context context, ResProviderShim resProviderShim, boolean z) {
        try {
            ResProvider resProviderObtainResProviderInternal = obtainResProviderInternal(context, z);
            if (resProviderShim != null) {
                return resProviderShim.install(resProviderObtainResProviderInternal);
            }
            return resProviderObtainResProviderInternal;
        } catch (IOException e) {
            throw BV4.A0e(e);
        }
    }

    public static synchronized int loadAll(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProviderShim resProviderShim, DexStore.Config config) {
        int iLoadAllImpl;
        if (DexErrorRecoveryInfo.getMainDexStoreLoadInformationNoThrow() == null) {
            try {
                iLoadAllImpl = loadAllImpl(context, i, lightweightQuickPerformanceLogger, resProviderShim, config);
                CanaryLoader.setInstance(new CanaryLoaderImpl());
                if (DexErrorRecoveryInfo.sDeoptTaint) {
                    handleUnoptimizedCodeForPerftest(context);
                }
            } catch (IOException e) {
                throw BV4.A0e(e);
            }
        } else {
            throw BV4.A0N("loadAll already loaded dex files");
        }
        return iLoadAllImpl;
    }

    public static int loadAll(Context context, boolean z, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        return loadAll(context, 1, lightweightQuickPerformanceLogger);
    }

    public static int loadAll(Context context, boolean z) {
        return loadAll(context, 1, (LightweightQuickPerformanceLogger) null);
    }
}
