package com.facebook.common.dextricks;

import X.AbstractC3145Bzb;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.BV8;
import X.BV9;
import X.C3146Bzc;
import X.C3cG;
import X.C5J;
import X.C60O;
import X.C8j3;
import X.C9X;
import X.FGI;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Trace;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.ReentrantLockFile;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public final class DexStore {
    public static final String CONFIG_FILENAME = "config";
    public static final String CONFIG_TMP_FILENAME = "config.tmp";
    public static final long CS_DEX0OPT = 16;
    public static final long CS_STATE_MASK = 15;
    public static final byte CS_STATE_SHIFT = 4;
    public static final int DAYS_TO_MS_FACTOR = 86400000;
    public static final byte DEFAULT_MULTIDEX_COMPILATION_STRATEGY = 0;
    public static final byte DEFAULT_PGO_COMPILER_FILTER = 0;
    public static final String DEPS_FILENAME = "deps";
    public static final int DS_ASYNC = 4;
    public static final int DS_DO_NOT_OPTIMIZE = 1;
    public static final int DS_FORCE_SYNC = 8;
    public static final int DS_LOAD_SECONDARY = 16;
    public static final int DS_NO_RETRY = 2;
    public static final int DS_UNPACK_ONLY = 32;
    public static final int LA_LOAD_EXISTING = 0;
    public static final int LA_REGEN_ALL = 2;
    public static final int LA_REGEN_MISSING = 1;
    public static final String MDEX_LOCK_FILENAME = "mdex_lock";
    public static final String MDEX_STATUS_FILENAME = "mdex_status2";
    public static final long MDEX_STATUS_XOR = -374168170706063353L;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_COLDSTART_DEX = 2;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_DEX = 1;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_FIRST_COLDSTART_DEX = 0;
    public static final String ODEX_LOCK_FILENAME = "odex_lock";
    public static final String OPTIMIZATION_HISTORY_LOG_FILENAME = "optimization_history_log";
    public static final String OPTIMIZATION_LOG_FILENAME = "optimization_log";
    public static final byte PGO_COMPILER_FILTER_EVERYTHING_PROFILE = 2;
    public static final byte PGO_COMPILER_FILTER_SPACE_PROFILE = 1;
    public static final byte PGO_COMPILER_FILTER_SPEED_PROFILE = 0;
    public static final byte PGO_COMPILER_FILTER_VERIFY_PROFILE = 3;
    public static final String REGEN_STAMP_FILENAME = "regen_stamp";
    public static final byte STATE_ART_TURBO = 7;
    public static final byte STATE_ART_XDEX = 8;
    public static final byte STATE_BAD_GEN = 5;
    public static final byte STATE_FALLBACK = 2;
    public static final byte STATE_INVALID = 0;
    public static final byte STATE_NOOP = 9;
    public static final byte STATE_REGEN_FORCED = 6;
    public static final byte STATE_RESERVED1 = 10;
    public static final byte STATE_TX_FAILED = 1;
    public static final String TMPDIR_LOCK_SUFFIX = ".tmpdir_lock";
    public static final String TMPDIR_SUFFIX = ".tmpdir";
    public static boolean logDexAddPageFaults;
    public static long majPageFaultsDelta;
    public static long pageInBytesDelta;
    public static DexStoreClock sDexStoreClock = new NormalDexStoreClock();
    public static DexStore sListHead;
    public static boolean sLoadedCompressedOreo;
    public final ArrayList<DexFile> auxiliaryDexes;
    public String id;
    public final File mApk;
    public DexIteratorFactory mDexIteratorFactory;
    public DexErrorRecoveryInfo mLastDeri;
    public ArrayList<DexFile> mLoadedDexFiles;
    public DexManifest mLoadedManifest;
    public final ReentrantLockFile mLockFile;
    public DexManifest mManifest;
    public ResProvider mResProvider;
    public final ArrayList<DexFile> primaryDexes;
    public final File root;
    public String mMegaZipPath = null;
    public boolean mUseBgDexOpt = false;
    public boolean mUseEagerDexOpt = false;
    public final List<DexStore> mParentStores = C3cG.A0h();
    public final List<DexStore> mChildStores = C3cG.A0h();
    public boolean mDisableVerifier = false;
    public boolean mIsArtMainStore = false;
    public final DexStore next = sListHead;

    public final class Config {
        public static final byte ART_FILTER_BALANCED = 4;
        public static final byte ART_FILTER_DEFAULT = 0;
        public static final byte ART_FILTER_EVERYTHING = 6;
        public static final byte ART_FILTER_INTERPRET_ONLY = 2;
        public static final byte ART_FILTER_SPACE = 3;
        public static final byte ART_FILTER_SPEED = 5;
        public static final byte ART_FILTER_TIME = 7;
        public static final byte ART_FILTER_VERIFY_NONE = 1;
        public static final byte DALVIK_OPT_ALL = 3;
        public static final byte DALVIK_OPT_DEFAULT = 0;
        public static final byte DALVIK_OPT_FULL = 4;
        public static final byte DALVIK_OPT_NONE = 1;
        public static final byte DALVIK_OPT_VERIFIED = 2;
        public static final byte DALVIK_REGISTER_MAPS_DEFAULT = 0;
        public static final byte DALVIK_REGISTER_MAPS_NO = 1;
        public static final byte DALVIK_REGISTER_MAPS_YES = 2;
        public static final byte DALVIK_VERIFY_ALL = 3;
        public static final byte DALVIK_VERIFY_DEFAULT = 0;
        public static final byte DALVIK_VERIFY_NONE = 1;
        public static final byte DALVIK_VERIFY_REMOTE = 2;
        public static final int FLAGS_CONTROL_UNPACK = 31;
        public static final byte MODE_DEFAULT = 0;
        public static final byte MODE_FORCE_FALLBACK = 1;
        public static final byte MODE_FORCE_TURBO = 2;
        public static final byte MODE_FORCE_XDEX = 3;
        public static final byte SYNC_CONTROL_ASYNC = 1;
        public static final byte SYNC_CONTROL_DEFAULT = 0;
        public static final byte SYNC_CONTROL_SYNC = 2;
        public static final byte VERSION = 9;
        public final byte artFilter;
        public final int artHugeMethodMax;
        public final int artLargeMethodMax;
        public final int artSmallMethodMax;
        public final int artTinyMethodMax;
        public final int artTruncatedDexSize;
        public final byte dalvikOptimize;
        public final byte dalvikRegisterMaps;
        public final byte dalvikVerify;
        public final boolean enableArtVerifyNone;
        public final boolean enableDex2OatQuickening;
        public final boolean enableMixedMode;
        public final boolean enableMixedModeClassPath;
        public final boolean enableMixedModePgo;
        public final boolean enableQuickening;
        public final int henosisFlags;
        public final int legacyFlags;
        public final long minTimeBetweenPgoCompilationMs;
        public final byte mode;
        public final byte multidexCompilationStrategy;
        public final byte pgoCompilerFilter;
        public final byte sync;
        public final boolean tryPeriodicPgoCompilation;

        public final class Builder {
            public byte mArtFilter;
            public int mArtHugeMethodMax;
            public int mArtLargeMethodMax;
            public int mArtSmallMethodMax;
            public int mArtTinyMethodMax;
            public int mArtTruncatedDexSize;
            public byte mDalvikOptimize;
            public byte mDalvikRegisterMaps;
            public byte mDalvikVerify;
            public boolean mDoPeriodicPgoCompilation;
            public boolean mEnableArtVerifyNone;
            public boolean mEnableDex2OatQuickening;
            public boolean mEnableMixedMode;
            public boolean mEnableMixedModeClassPath;
            public boolean mEnableMixedModePgo;
            public boolean mEnableQuickening;
            public int mHenosisFlags;
            public int mLegacyFlags;
            public long mMinTimeBetweenPgoCompilationMs;
            public byte mMode;
            public byte mMultidexCompilationStrategy;
            public byte mPgoCompilerFilter;
            public byte mSync;

            public Config build() {
                return new Config(this.mMode, this.mSync, this.mDalvikVerify, this.mDalvikOptimize, this.mDalvikRegisterMaps, this.mArtFilter, this.mArtHugeMethodMax, this.mArtLargeMethodMax, this.mArtSmallMethodMax, this.mArtTinyMethodMax, this.mArtTruncatedDexSize, this.mEnableArtVerifyNone, this.mEnableDex2OatQuickening, this.mEnableQuickening, this.mEnableMixedMode, this.mEnableMixedModeClassPath, this.mEnableMixedModePgo, this.mPgoCompilerFilter, this.mDoPeriodicPgoCompilation, this.mMinTimeBetweenPgoCompilationMs, this.mMultidexCompilationStrategy, this.mLegacyFlags, this.mHenosisFlags);
            }

            public Builder(Config config) {
                BV9.A05(this);
                this.mMode = config.mode;
                this.mSync = config.sync;
                this.mDalvikVerify = config.dalvikVerify;
                this.mDalvikOptimize = config.dalvikOptimize;
                this.mDalvikRegisterMaps = config.dalvikRegisterMaps;
                this.mArtFilter = config.artFilter;
                this.mArtHugeMethodMax = config.artHugeMethodMax;
                this.mArtLargeMethodMax = config.artLargeMethodMax;
                this.mArtSmallMethodMax = config.artSmallMethodMax;
                this.mArtTinyMethodMax = config.artTinyMethodMax;
                this.mArtTruncatedDexSize = config.artTruncatedDexSize;
                this.mEnableArtVerifyNone = config.enableArtVerifyNone;
                this.mEnableDex2OatQuickening = config.enableDex2OatQuickening;
                this.mEnableQuickening = config.enableQuickening;
                this.mEnableMixedMode = config.enableMixedMode;
                this.mEnableMixedModeClassPath = config.enableMixedModeClassPath;
                this.mEnableMixedModePgo = config.enableMixedModePgo;
                this.mPgoCompilerFilter = config.pgoCompilerFilter;
                this.mDoPeriodicPgoCompilation = config.tryPeriodicPgoCompilation;
                this.mMinTimeBetweenPgoCompilationMs = config.minTimeBetweenPgoCompilationMs;
                this.mMultidexCompilationStrategy = config.multidexCompilationStrategy;
                this.mLegacyFlags = config.legacyFlags;
                this.mHenosisFlags = config.henosisFlags;
            }

            public Builder setArtFilter(byte b) {
                this.mArtFilter = b;
                return this;
            }

            public Builder setArtHugeMethodMax(int i) {
                this.mArtHugeMethodMax = i;
                return this;
            }

            public Builder setArtLargeMethodMax(int i) {
                this.mArtLargeMethodMax = i;
                return this;
            }

            public Builder setArtSmallMethodMax(int i) {
                this.mArtSmallMethodMax = i;
                return this;
            }

            public Builder setArtTinyMethodMax(int i) {
                this.mArtTinyMethodMax = i;
                return this;
            }

            public Builder setArtTruncatedDexSize(int i) {
                this.mArtTruncatedDexSize = i;
                return this;
            }

            public Builder setDalvikOptimize(byte b) {
                this.mDalvikOptimize = b;
                return this;
            }

            public Builder setDalvikRegisterMaps(byte b) {
                this.mDalvikRegisterMaps = b;
                return this;
            }

            public Builder setDalvikVerify(byte b) {
                this.mDalvikVerify = b;
                return this;
            }

            public Builder setDoPeriodicPgoCompilation(boolean z) {
                this.mDoPeriodicPgoCompilation = z;
                return this;
            }

            public Builder setEnableArtVerifyNone(boolean z) {
                this.mEnableArtVerifyNone = z;
                return this;
            }

            public Builder setEnableDex2OatQuickening(boolean z) {
                this.mEnableDex2OatQuickening = z;
                return this;
            }

            public Builder setEnableMixedMode(boolean z) {
                this.mEnableMixedMode = z;
                return this;
            }

            public Builder setEnableMixedModeClassPath(boolean z) {
                this.mEnableMixedModeClassPath = z;
                return this;
            }

            public Builder setEnableMixedModePgo(boolean z) {
                this.mEnableMixedModePgo = z;
                return this;
            }

            public Builder setEnableQuickening(boolean z) {
                this.mEnableQuickening = z;
                return this;
            }

            public Builder setHenosisFlags(int i) {
                this.mHenosisFlags = i;
                return this;
            }

            public Builder setLegacyFlags(int i) {
                this.mLegacyFlags = i;
                return this;
            }

            public Builder setMinTimeBetweenPgoCompilationDays(double d) {
                this.mMinTimeBetweenPgoCompilationMs = convertDaysToMs(d);
                return this;
            }

            public Builder setMinTimeBetweenPgoCompilationMs(long j) {
                this.mMinTimeBetweenPgoCompilationMs = j;
                return this;
            }

            public Builder setMode(byte b) {
                this.mMode = b;
                return this;
            }

            public Builder setMultidexCompilationStrategy(byte b) {
                this.mMultidexCompilationStrategy = b;
                return this;
            }

            public Builder setPgoCompilerFilter(byte b) {
                this.mPgoCompilerFilter = b;
                return this;
            }

            public Builder setSync(byte b) {
                this.mSync = b;
                return this;
            }

            private long convertDaysToMs(double d) {
                return BV6.A0G(d, 8.64E7d);
            }

            public Builder() {
                BV9.A05(this);
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj != null && getClass() == obj.getClass()) {
                    Config config = (Config) obj;
                    if (this.mode != config.mode || this.sync != config.sync || this.dalvikVerify != config.dalvikVerify || this.dalvikOptimize != config.dalvikOptimize || this.dalvikRegisterMaps != config.dalvikRegisterMaps || this.artFilter != config.artFilter || this.artHugeMethodMax != config.artHugeMethodMax || this.artLargeMethodMax != config.artLargeMethodMax || this.artSmallMethodMax != config.artSmallMethodMax || this.artTinyMethodMax != config.artTinyMethodMax || this.artTruncatedDexSize != config.artTruncatedDexSize || this.enableArtVerifyNone != config.enableArtVerifyNone || this.enableDex2OatQuickening != config.enableDex2OatQuickening || this.enableQuickening != config.enableQuickening || this.enableMixedMode != config.enableMixedMode || this.enableMixedModeClassPath != config.enableMixedModeClassPath || this.enableMixedModePgo != config.enableMixedModePgo || this.pgoCompilerFilter != config.pgoCompilerFilter || this.multidexCompilationStrategy != config.multidexCompilationStrategy || this.tryPeriodicPgoCompilation != config.tryPeriodicPgoCompilation || this.minTimeBetweenPgoCompilationMs != config.minTimeBetweenPgoCompilationMs || this.legacyFlags != config.legacyFlags || this.henosisFlags != config.henosisFlags) {
                    }
                }
                return false;
            }
            return true;
        }

        public static File getConfigFileName(File file) {
            return C3cG.A0O(file, "config");
        }

        public static Config readFromRoot(File file) {
            return read(C3cG.A0O(file, "config"));
        }

        public boolean equalsForBootstrapPurposes(Config config) {
            return config != null && config.mode == this.mode && config.sync == this.sync && config.artFilter == this.artFilter && config.enableArtVerifyNone == this.enableArtVerifyNone && config.enableDex2OatQuickening == this.enableDex2OatQuickening && config.enableMixedMode == this.enableMixedMode && config.enableMixedModeClassPath == this.enableMixedModeClassPath && config.enableMixedModePgo == this.enableMixedModePgo && config.pgoCompilerFilter == this.pgoCompilerFilter && config.multidexCompilationStrategy == this.multidexCompilationStrategy && config.tryPeriodicPgoCompilation == this.tryPeriodicPgoCompilation && config.legacyFlags == this.legacyFlags && config.henosisFlags == this.henosisFlags;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((((((((((((10571 + this.mode) * 31) + this.sync) * 31) + this.dalvikVerify) * 31) + this.dalvikOptimize) * 31) + this.dalvikRegisterMaps) * 31) + this.artFilter) * 31) + this.artHugeMethodMax) * 31) + this.artLargeMethodMax) * 31) + this.artSmallMethodMax) * 31) + this.artTinyMethodMax) * 31) + this.artTruncatedDexSize) * 31) + (this.enableArtVerifyNone ? 1 : 0)) * 31) + (this.enableDex2OatQuickening ? 1 : 0)) * 31) + (this.enableQuickening ? 1 : 0)) * 31) + (this.enableMixedMode ? 1 : 0)) * 31) + (this.enableMixedModeClassPath ? 1 : 0)) * 31) + (this.enableMixedModePgo ? 1 : 0)) * 31) + this.pgoCompilerFilter) * 31) + this.multidexCompilationStrategy) * 31) + (this.tryPeriodicPgoCompilation ? 1 : 0)) * 31) + ((int) this.minTimeBetweenPgoCompilationMs)) * 31) + this.legacyFlags) * 31) + this.henosisFlags;
        }

        public boolean isDefault() {
            return equals(new Builder().build());
        }

        public Config(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, byte b7, boolean z7, long j, byte b8, int i6, int i7) {
            this.mode = b;
            this.sync = b2;
            this.dalvikVerify = b3;
            this.dalvikOptimize = b4;
            this.dalvikRegisterMaps = b5;
            this.artFilter = b6;
            this.artHugeMethodMax = i;
            this.artLargeMethodMax = i2;
            this.artSmallMethodMax = i3;
            this.artTinyMethodMax = i4;
            this.artTruncatedDexSize = i5;
            this.enableArtVerifyNone = z;
            this.enableDex2OatQuickening = z2;
            this.enableQuickening = z3;
            this.enableMixedMode = z4;
            this.enableMixedModeClassPath = z5;
            this.enableMixedModePgo = z6;
            this.pgoCompilerFilter = b7;
            this.tryPeriodicPgoCompilation = z7;
            this.minTimeBetweenPgoCompilationMs = j;
            this.multidexCompilationStrategy = b8;
            this.legacyFlags = i6;
            this.henosisFlags = i7;
        }

        public static Config read(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            RandomAccessFile randomAccessFileA0L = BV4.A0L(file);
            try {
                if (randomAccessFileA0L.readByte() != 9) {
                    throw C8j3.A18("unexpected version");
                }
                Config config = new Config(randomAccessFileA0L.readByte(), randomAccessFileA0L.readByte(), randomAccessFileA0L.readByte(), randomAccessFileA0L.readByte(), randomAccessFileA0L.readByte(), randomAccessFileA0L.readByte(), randomAccessFileA0L.readInt(), randomAccessFileA0L.readInt(), randomAccessFileA0L.readInt(), randomAccessFileA0L.readInt(), randomAccessFileA0L.readInt(), randomAccessFileA0L.readBoolean(), randomAccessFileA0L.readBoolean(), randomAccessFileA0L.readBoolean(), randomAccessFileA0L.readBoolean(), randomAccessFileA0L.readBoolean(), randomAccessFileA0L.readBoolean(), randomAccessFileA0L.readByte(), randomAccessFileA0L.readBoolean(), randomAccessFileA0L.readLong(), randomAccessFileA0L.readByte(), randomAccessFileA0L.readInt(), randomAccessFileA0L.readInt());
                randomAccessFileA0L.close();
                return config;
            } catch (Throwable th) {
                try {
                    randomAccessFileA0L.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }

        public byte[] readDepBlock() {
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeByte(this.mode);
                parcelObtain.writeByte(this.sync);
                parcelObtain.writeByte(this.dalvikVerify);
                parcelObtain.writeByte(this.dalvikOptimize);
                parcelObtain.writeByte(this.dalvikRegisterMaps);
                parcelObtain.writeByte(this.artFilter);
                parcelObtain.writeInt(this.artHugeMethodMax);
                parcelObtain.writeInt(this.artLargeMethodMax);
                parcelObtain.writeInt(this.artSmallMethodMax);
                parcelObtain.writeInt(this.artTinyMethodMax);
                parcelObtain.writeBooleanArray(new boolean[]{this.enableArtVerifyNone, this.enableDex2OatQuickening, this.enableQuickening, this.enableMixedMode, this.enableMixedModeClassPath, this.enableMixedModePgo});
                parcelObtain.writeByte(this.pgoCompilerFilter);
                parcelObtain.writeByte(this.tryPeriodicPgoCompilation ? (byte) 1 : (byte) 0);
                parcelObtain.writeLong(this.minTimeBetweenPgoCompilationMs);
                parcelObtain.writeByte(this.multidexCompilationStrategy);
                parcelObtain.writeInt(this.legacyFlags);
                parcelObtain.writeInt(this.henosisFlags);
                return parcelObtain.marshall();
            } finally {
                parcelObtain.recycle();
            }
        }

        public void writeAndSync(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            RandomAccessFile randomAccessFileA0M = BV4.A0M(file);
            try {
                randomAccessFileA0M.writeByte(9);
                randomAccessFileA0M.writeByte(this.mode);
                randomAccessFileA0M.writeByte(this.sync);
                randomAccessFileA0M.writeByte(this.dalvikVerify);
                randomAccessFileA0M.writeByte(this.dalvikOptimize);
                randomAccessFileA0M.writeByte(this.dalvikRegisterMaps);
                randomAccessFileA0M.writeByte(this.artFilter);
                randomAccessFileA0M.writeInt(this.artHugeMethodMax);
                randomAccessFileA0M.writeInt(this.artLargeMethodMax);
                randomAccessFileA0M.writeInt(this.artSmallMethodMax);
                randomAccessFileA0M.writeInt(this.artTinyMethodMax);
                randomAccessFileA0M.writeInt(this.artTruncatedDexSize);
                randomAccessFileA0M.writeBoolean(this.enableArtVerifyNone);
                randomAccessFileA0M.writeBoolean(this.enableDex2OatQuickening);
                randomAccessFileA0M.writeBoolean(this.enableQuickening);
                randomAccessFileA0M.writeBoolean(this.enableMixedMode);
                randomAccessFileA0M.writeBoolean(this.enableMixedModeClassPath);
                randomAccessFileA0M.writeBoolean(this.enableMixedModePgo);
                randomAccessFileA0M.writeByte(this.pgoCompilerFilter);
                randomAccessFileA0M.writeBoolean(this.tryPeriodicPgoCompilation);
                randomAccessFileA0M.writeLong(this.minTimeBetweenPgoCompilationMs);
                randomAccessFileA0M.writeByte(this.multidexCompilationStrategy);
                randomAccessFileA0M.writeInt(this.legacyFlags);
                randomAccessFileA0M.writeInt(this.henosisFlags);
                randomAccessFileA0M.setLength(randomAccessFileA0M.getFilePointer());
                randomAccessFileA0M.getFD().sync();
                randomAccessFileA0M.close();
            } catch (Throwable th) {
                try {
                    randomAccessFileA0M.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
    }

    public interface DexStoreClock {
        long now();
    }

    public final class FinishRegenerationThread extends Thread {
        public final ReentrantLockFile.Lock mHeldLock;
        public final long mNewStatus;
        public final OdexScheme mOdexScheme;

        public FinishRegenerationThread(OdexScheme odexScheme, ReentrantLockFile.Lock lock, long j) {
            super(FGI.A0M("TxFlush-", DexStore.this.root.getName()));
            this.mHeldLock = lock;
            this.mNewStatus = j;
            this.mOdexScheme = odexScheme;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                BV6.A1G("running syncer thread");
                try {
                    for (String str : this.mOdexScheme.expectedFiles) {
                        File fileA0O = C3cG.A0O(DexStore.this.root, str);
                        if (fileA0O.exists()) {
                            RuntimeInternals.fsyncNamed(fileA0O.getCanonicalPath(), -1);
                        }
                    }
                    DexStore.this.writeStatusLocked(this.mNewStatus);
                    this.mHeldLock.close();
                    Mlog.i("finished syncer thread: initial regeneration of dex store %s complete", DexStore.this.root);
                } catch (IOException e) {
                    throw BV4.A0e(e);
                }
            } catch (Throwable th) {
                this.mHeldLock.close();
                throw th;
            }
        }
    }

    public class PreviewSdkHelper {
        public static boolean isPreviewSdk() {
            return AnonymousClass002.A1L(Build.VERSION.PREVIEW_SDK_INT);
        }
    }

    public final class TmpDir implements Closeable {
        public File directory;
        public ReentrantLockFile.Lock mTmpDirLock;

        public TmpDir(ReentrantLockFile.Lock lock, File file) {
            this.mTmpDirLock = lock;
            this.directory = file;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.mTmpDirLock != null) {
                ReentrantLockFile.Lock lockAcquire = DexStore.this.mLockFile.acquire(0);
                try {
                    ReentrantLockFile.Lock lock = this.mTmpDirLock;
                    File file = ReentrantLockFile.this.lockFileName;
                    lock.close();
                    this.mTmpDirLock = null;
                    Fs.deleteRecursiveNoThrow(file);
                    Fs.deleteRecursiveNoThrow(this.directory);
                    this.directory = null;
                    if (lockAcquire != null) {
                        lockAcquire.close();
                    }
                } catch (Throwable th) {
                    if (lockAcquire != null) {
                        try {
                            lockAcquire.close();
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
    }

    private void deleteFiles(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null) {
                Mlog.v("deleting existing file %s/%s", this.root, str);
                Fs.deleteRecursive(C3cG.A0O(this.root, strArr[i]));
            }
        }
    }

    private int findInArray(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static long getBaseApkIdentifier(File file) {
        return getApkIdentifier(file, false);
    }

    private synchronized DexStore[] getParents() {
        List<DexStore> list;
        DexManifest dexManifestLoadManifest = loadManifest();
        if (this.mParentStores.isEmpty() && !DexStoreUtils.MAIN_DEX_STORE_ID.equals(dexManifestLoadManifest.id)) {
            for (String str : dexManifestLoadManifest.requires) {
                if (!DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
                    DexStore dexStoreDexStoreListHead = dexStoreListHead();
                    while (true) {
                        if (dexStoreDexStoreListHead == null) {
                            Mlog.d(FGI.A0d("unable to find required store ", str, " of store ", dexManifestLoadManifest.id), new Object[0]);
                            break;
                        }
                        String str2 = dexStoreDexStoreListHead.id;
                        if (str2 != null && str2.equals(str)) {
                            this.mParentStores.add(dexStoreDexStoreListHead);
                            dexStoreDexStoreListHead.addChild(this);
                            break;
                        }
                        dexStoreDexStoreListHead = dexStoreDexStoreListHead.next;
                    }
                }
            }
        }
        list = this.mParentStores;
        return (DexStore[]) list.toArray(new DexStore[list.size()]);
    }

    private void setDifference(String[] strArr, String[] strArr2) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str2 = strArr2[i2];
                    if (str2 != null && str.equals(str2)) {
                        strArr[i] = null;
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    private void writeTxFailedStatusLocked(long j) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        writeStatusLocked((j << 4) | 1);
    }

    public synchronized boolean isLoaded() {
        return AnonymousClass002.A1X(this.mLoadedManifest);
    }

    public long reportStatus() {
        Mlog.v("DexStore::reportStatus()", new Object[0]);
        long statusLocked = 0;
        try {
            ReentrantLockFile.Lock lockAcquire = this.mLockFile.acquire(0);
            try {
                statusLocked = readStatusLocked();
                if (lockAcquire != null) {
                    lockAcquire.close();
                }
                return statusLocked;
            } finally {
            }
        } catch (Throwable th) {
            Mlog.v("DexStore::reportStatus caught Throwable ", th);
            return statusLocked;
        }
    }

    public class NormalDexStoreClock implements DexStoreClock {
        public /* synthetic */ NormalDexStoreClock(AnonymousClass1 anonymousClass1) {
        }

        @Override // com.facebook.common.dextricks.DexStore.DexStoreClock
        public long now() {
            return System.currentTimeMillis();
        }

        public NormalDexStoreClock() {
        }
    }

    public final class RecoverableDexException extends Exception {
        public static final long serialVersionUID = 1;

        public RecoverableDexException(Throwable th) {
            super(th);
        }
    }

    private byte adjustDesiredStateForConfig(byte b, Config config) {
        Object[] objArr;
        String str;
        String str2;
        byte b2 = config.mode;
        if (b2 != 0) {
            if (b2 == 1) {
                Mlog.i("using fallback mode due to request in config file", new Object[0]);
                return (byte) 2;
            }
            if (b2 != 2) {
                if (b2 == 3) {
                    if (b == 2) {
                        str2 = "ignoring configured xdex mode: already forced to fallback";
                    } else {
                        if (b == 7 || b == 8) {
                            Mlog.i("using ART xdex as requested in config file", new Object[0]);
                            return (byte) 8;
                        }
                        if (b != 9) {
                            objArr = new Object[]{Byte.valueOf(b)};
                            str = "ignoring configured xdex mode: state not whitelisted: %s";
                        } else {
                            str2 = "ignoring configured xdex mode: no dex loading to do";
                        }
                    }
                    Mlog.i(str2, new Object[0]);
                } else {
                    objArr = new Object[]{Byte.valueOf(b2)};
                    str = "ignoring unknown configured dex mode %s";
                }
                Mlog.w(str, objArr);
                return b;
            }
            if (b == 2) {
                str2 = "ignoring configured turbo mode: already forced to fallback mode";
            } else {
                if (b == 7 || b == 8) {
                    Mlog.i("using ART turbo as requested in config file", new Object[0]);
                    return (byte) 7;
                }
                if (b != 9) {
                    objArr = new Object[]{Byte.valueOf(b)};
                    str = "ignoring configured turbo mode: state not whitelisted: %s";
                    Mlog.w(str, objArr);
                    return b;
                }
                str2 = "ignoring configured turbo mode: no dex loading to do";
            }
            Mlog.i(str2, new Object[0]);
        }
        return b;
    }

    private void appendDexHashForMegaZip(Context context, StringBuilder sb, DexManifest dexManifest) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(OdexSchemeOreo.getPrimaryDexIdentifierString(context).getBytes());
            int i = 0;
            while (true) {
                DexManifest.Dex[] dexArr = dexManifest.dexes;
                if (i >= dexArr.length) {
                    messageDigest.update(readCurrentDepBlock());
                    sb.append(DexStoreUtils.toHex(messageDigest.digest()));
                    return;
                } else {
                    messageDigest.update(dexArr[i].hash.getBytes());
                    i++;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            throw BV4.A0e(e);
        }
    }

    private void assertLockHeld() {
        Mlog.assertThat(AnonymousClass002.A1Z(this.mLockFile.mLockOwner, Thread.currentThread()), "lock req", new Object[0]);
    }

    public static boolean checkAndClearGk(Context context, String str) {
        try {
            C3146Bzc c3146Bzc = new C3146Bzc();
            c3146Bzc.A00 = context;
            boolean zA1Q = BV7.A1Q(AbstractC3145Bzb.A00(c3146Bzc, str));
            C3146Bzc c3146Bzc2 = new C3146Bzc();
            c3146Bzc2.A00 = context;
            AbstractC3145Bzb.A03(c3146Bzc2, str, 0);
            return zA1Q;
        } catch (Throwable th) {
            C3146Bzc c3146Bzc3 = new C3146Bzc();
            c3146Bzc3.A00 = context;
            AbstractC3145Bzb.A03(c3146Bzc3, str, 0);
            throw th;
        }
    }

    private byte determineDesiredState(byte b, DexManifest dexManifest, boolean z) {
        if (dexManifest.dexes.length == 0) {
            Mlog.i("no secondary dexes listed: using noop configuration", new Object[0]);
            return (byte) 9;
        }
        if (b != 5) {
            return (z || !dexManifest.canLoadCanaryClass()) ? (byte) 8 : (byte) 9;
        }
        Mlog.i("recovering from bad class gen: using fallback", new Object[0]);
        return (byte) 2;
    }

    public static synchronized DexStore dexStoreListHead() {
        return sListHead;
    }

    public static synchronized DexStore findOpened(String str) {
        for (DexStore dexStoreDexStoreListHead = dexStoreListHead(); dexStoreDexStoreListHead != null; dexStoreDexStoreListHead = dexStoreDexStoreListHead.next) {
            String str2 = dexStoreDexStoreListHead.id;
            if (str2 == null) {
                if (str == null) {
                    return dexStoreDexStoreListHead;
                }
            } else {
                if (str2.equals(str)) {
                    return dexStoreDexStoreListHead;
                }
            }
        }
        return null;
    }

    public static Long getBaseApkDexFilesIdentifier(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry("classes.dex");
            if (entry == null) {
                zipFile.close();
                return null;
            }
            Long lValueOf = Long.valueOf(entry.getCrc());
            zipFile.close();
            return lValueOf;
        } catch (Throwable th) {
            try {
                zipFile.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static <T extends DexStoreClock> T getClock(Class<T> cls) {
        T t = (T) sDexStoreClock;
        if (t == null) {
            return null;
        }
        return t;
    }

    private String getMegaZipName(Context context, DexManifest dexManifest) throws NoSuchAlgorithmException {
        StringBuilder sbA0p = BV4.A0p(46);
        sbA0p.append("z-");
        appendDexHashForMegaZip(context, sbA0p, dexManifest);
        return AnonymousClass001.A0v(".zip", sbA0p);
    }

    public static String getStatusDescription(long j) {
        String strA0H;
        int i = (int) (j & 15);
        StringBuilder sbA0w = C60O.A0w();
        if (i == 0) {
            strA0H = "STATE_INVALID";
        } else if (i == 1) {
            strA0H = "STATE_TX_FAILED";
        } else if (i != 2) {
            switch (i) {
                case 5:
                    strA0H = "STATE_BAD_GEN";
                    break;
                case 6:
                    strA0H = "STATE_REGEN_FORCED";
                    break;
                case 7:
                    strA0H = "STATE_ART_TURBO";
                    break;
                case 8:
                    strA0H = "STATE_ART_XDEX";
                    break;
                case 9:
                    strA0H = "STATE_NOOP";
                    break;
                default:
                    strA0H = FGI.A0H("BAD STATE ", i);
                    break;
            }
        } else {
            strA0H = "STATE_FALLBACK";
        }
        return AnonymousClass001.A0v(strA0H, sbA0w);
    }

    private void installArtHacks(Context context, DexErrorRecoveryInfo dexErrorRecoveryInfo) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            context.getPackageName();
        }
        boolean zCheckAndClearGk = checkAndClearGk(context, Experiments.DISABLE_DEX_VERIFIER);
        this.mDisableVerifier = zCheckAndClearGk;
        int i2 = zCheckAndClearGk ? 4 : 0;
        boolean zCheckAndClearGk2 = checkAndClearGk(context, Experiments.DISABLE_DEX_COLLISION_CHECK);
        if (!AnonymousClass002.A1X(MultiDexClassLoaderLight.INSTANCE) && zCheckAndClearGk2) {
            i2 |= 32;
        }
        if (!sLoadedCompressedOreo) {
            if (checkAndClearGk(context, Experiments.DISABLE_DEX_ISUPTODATE_CHECK)) {
                i2 |= 64;
            }
            C3146Bzc c3146Bzc = new C3146Bzc();
            c3146Bzc.A00 = context;
            if (AbstractC3145Bzb.A00(c3146Bzc, Experiments.DISABLE_MONITOR_VISITLOCKS) == 1) {
                i2 |= 128;
            }
        }
        int iInstallArtHacks = RuntimeInternals.installArtHacks(i2, i);
        if (i <= 31 && (i2 & 4) != 0 && (iInstallArtHacks & 4) == 0) {
            C5J.A00("dex_tricks::art_disable_verifier::failed_install", RuntimeInternals.getLastInstallFailures(), null);
        }
        RuntimeInternals.setEnabledThreadArtHacks(i2);
        dexErrorRecoveryInfo.hacksDesired = i2;
        dexErrorRecoveryInfo.hacksInstalled = iInstallArtHacks;
    }

    private boolean isCustomClassLoaderInstalled() {
        return AnonymousClass002.A1X(ReflectionClassLoader.sInstalledClassLoader) || MultiDexClassLoader.sInstalledClassLoader != null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:172|45|46|(2:48|(1:50))(22:(1:52)|174|73|77|(6:79|(1:83)|84|(1:(2:87|(2:89|92)(1:90))(1:91))|93|(5:94|176|95|(1:97)(1:98)|104))|105|(2:107|(1:109))|110|(2:159|(5:113|114|168|115|120)(1:119))|121|(1:124)|177|125|162|126|(1:128)|137|(1:139)|140|(1:142)|143|(1:145))|53|(1:55)|56|(5:58|160|59|(1:61)|62)|68|(2:164|70)|174|73|77|(0)|105|(0)|110|(0)|121|(1:124)|177|125|162|126|(0)|137|(0)|140|(0)|143|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:(1:39)(1:(2:41|43)(1:42))|44|172|45|46|(2:48|(1:50))(22:(1:52)|174|73|77|(6:79|(1:83)|84|(1:(2:87|(2:89|92)(1:90))(1:91))|93|(5:94|176|95|(1:97)(1:98)|104))|105|(2:107|(1:109))|110|(2:159|(5:113|114|168|115|120)(1:119))|121|(1:124)|177|125|162|126|(1:128)|137|(1:139)|140|(1:142)|143|(1:145))|53|(1:55)|56|(5:58|160|59|(1:61)|62)|68|(2:164|70)|174|73|77|(0)|105|(0)|110|(0)|121|(1:124)|177|125|162|126|(0)|137|(0)|140|(0)|143|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02fe, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ff, code lost:
    
        com.facebook.common.dextricks.Mlog.e(r2, "Failure while checking oat file provenance.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01af, code lost:
    
        com.facebook.common.dextricks.Mlog.d("no config file for repository %s found: using all-default configuration", r27.root);
        r0 = new com.facebook.common.dextricks.DexStore.Config.Builder().build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ee A[Catch: all -> 0x02fe, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x02fe, blocks: (B:125:0x02df, B:128:0x02ee, B:134:0x02fd, B:133:0x02fa, B:126:0x02e5, B:131:0x02f5), top: B:177:0x02df, outer: #11, inners: #2, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030e A[Catch: all -> 0x034e, TryCatch #11 {all -> 0x034e, blocks: (B:24:0x0083, B:26:0x0091, B:31:0x00c2, B:35:0x00d4, B:37:0x00e6, B:46:0x0106, B:48:0x010b, B:50:0x0111, B:53:0x0121, B:55:0x012a, B:56:0x0140, B:58:0x0160, B:62:0x016d, B:67:0x017a, B:66:0x0177, B:70:0x017f, B:73:0x019b, B:79:0x01bf, B:83:0x01ce, B:84:0x01d7, B:92:0x01f6, B:90:0x01e2, B:91:0x01ee, B:93:0x0203, B:94:0x0214, B:95:0x0219, B:97:0x022f, B:104:0x025c, B:98:0x0237, B:102:0x0248, B:103:0x025b, B:105:0x025d, B:109:0x0265, B:113:0x0279, B:120:0x02c3, B:121:0x02c9, B:124:0x02d0, B:137:0x0306, B:139:0x030e, B:140:0x0310, B:142:0x0316, B:143:0x0318, B:145:0x032e, B:136:0x02ff, B:74:0x01a7, B:76:0x01af, B:72:0x018d, B:34:0x00cd, B:28:0x00a3, B:18:0x0062, B:20:0x0068, B:59:0x0164, B:61:0x016a, B:64:0x0172, B:125:0x02df, B:128:0x02ee, B:134:0x02fd, B:133:0x02fa, B:126:0x02e5, B:131:0x02f5), top: B:178:0x0062, inners: #1, #3, #4, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0316 A[Catch: all -> 0x034e, TryCatch #11 {all -> 0x034e, blocks: (B:24:0x0083, B:26:0x0091, B:31:0x00c2, B:35:0x00d4, B:37:0x00e6, B:46:0x0106, B:48:0x010b, B:50:0x0111, B:53:0x0121, B:55:0x012a, B:56:0x0140, B:58:0x0160, B:62:0x016d, B:67:0x017a, B:66:0x0177, B:70:0x017f, B:73:0x019b, B:79:0x01bf, B:83:0x01ce, B:84:0x01d7, B:92:0x01f6, B:90:0x01e2, B:91:0x01ee, B:93:0x0203, B:94:0x0214, B:95:0x0219, B:97:0x022f, B:104:0x025c, B:98:0x0237, B:102:0x0248, B:103:0x025b, B:105:0x025d, B:109:0x0265, B:113:0x0279, B:120:0x02c3, B:121:0x02c9, B:124:0x02d0, B:137:0x0306, B:139:0x030e, B:140:0x0310, B:142:0x0316, B:143:0x0318, B:145:0x032e, B:136:0x02ff, B:74:0x01a7, B:76:0x01af, B:72:0x018d, B:34:0x00cd, B:28:0x00a3, B:18:0x0062, B:20:0x0068, B:59:0x0164, B:61:0x016a, B:64:0x0172, B:125:0x02df, B:128:0x02ee, B:134:0x02fd, B:133:0x02fa, B:126:0x02e5, B:131:0x02f5), top: B:178:0x0062, inners: #1, #3, #4, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032e A[Catch: all -> 0x034e, TryCatch #11 {all -> 0x034e, blocks: (B:24:0x0083, B:26:0x0091, B:31:0x00c2, B:35:0x00d4, B:37:0x00e6, B:46:0x0106, B:48:0x010b, B:50:0x0111, B:53:0x0121, B:55:0x012a, B:56:0x0140, B:58:0x0160, B:62:0x016d, B:67:0x017a, B:66:0x0177, B:70:0x017f, B:73:0x019b, B:79:0x01bf, B:83:0x01ce, B:84:0x01d7, B:92:0x01f6, B:90:0x01e2, B:91:0x01ee, B:93:0x0203, B:94:0x0214, B:95:0x0219, B:97:0x022f, B:104:0x025c, B:98:0x0237, B:102:0x0248, B:103:0x025b, B:105:0x025d, B:109:0x0265, B:113:0x0279, B:120:0x02c3, B:121:0x02c9, B:124:0x02d0, B:137:0x0306, B:139:0x030e, B:140:0x0310, B:142:0x0316, B:143:0x0318, B:145:0x032e, B:136:0x02ff, B:74:0x01a7, B:76:0x01af, B:72:0x018d, B:34:0x00cd, B:28:0x00a3, B:18:0x0062, B:20:0x0068, B:59:0x0164, B:61:0x016a, B:64:0x0172, B:125:0x02df, B:128:0x02ee, B:134:0x02fd, B:133:0x02fa, B:126:0x02e5, B:131:0x02f5), top: B:178:0x0062, inners: #1, #3, #4, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6 A[Catch: all -> 0x034e, TryCatch #11 {all -> 0x034e, blocks: (B:24:0x0083, B:26:0x0091, B:31:0x00c2, B:35:0x00d4, B:37:0x00e6, B:46:0x0106, B:48:0x010b, B:50:0x0111, B:53:0x0121, B:55:0x012a, B:56:0x0140, B:58:0x0160, B:62:0x016d, B:67:0x017a, B:66:0x0177, B:70:0x017f, B:73:0x019b, B:79:0x01bf, B:83:0x01ce, B:84:0x01d7, B:92:0x01f6, B:90:0x01e2, B:91:0x01ee, B:93:0x0203, B:94:0x0214, B:95:0x0219, B:97:0x022f, B:104:0x025c, B:98:0x0237, B:102:0x0248, B:103:0x025b, B:105:0x025d, B:109:0x0265, B:113:0x0279, B:120:0x02c3, B:121:0x02c9, B:124:0x02d0, B:137:0x0306, B:139:0x030e, B:140:0x0310, B:142:0x0316, B:143:0x0318, B:145:0x032e, B:136:0x02ff, B:74:0x01a7, B:76:0x01af, B:72:0x018d, B:34:0x00cd, B:28:0x00a3, B:18:0x0062, B:20:0x0068, B:59:0x0164, B:61:0x016a, B:64:0x0172, B:125:0x02df, B:128:0x02ee, B:134:0x02fd, B:133:0x02fa, B:126:0x02e5, B:131:0x02f5), top: B:178:0x0062, inners: #1, #3, #4, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf A[Catch: all -> 0x034e, TryCatch #11 {all -> 0x034e, blocks: (B:24:0x0083, B:26:0x0091, B:31:0x00c2, B:35:0x00d4, B:37:0x00e6, B:46:0x0106, B:48:0x010b, B:50:0x0111, B:53:0x0121, B:55:0x012a, B:56:0x0140, B:58:0x0160, B:62:0x016d, B:67:0x017a, B:66:0x0177, B:70:0x017f, B:73:0x019b, B:79:0x01bf, B:83:0x01ce, B:84:0x01d7, B:92:0x01f6, B:90:0x01e2, B:91:0x01ee, B:93:0x0203, B:94:0x0214, B:95:0x0219, B:97:0x022f, B:104:0x025c, B:98:0x0237, B:102:0x0248, B:103:0x025b, B:105:0x025d, B:109:0x0265, B:113:0x0279, B:120:0x02c3, B:121:0x02c9, B:124:0x02d0, B:137:0x0306, B:139:0x030e, B:140:0x0310, B:142:0x0316, B:143:0x0318, B:145:0x032e, B:136:0x02ff, B:74:0x01a7, B:76:0x01af, B:72:0x018d, B:34:0x00cd, B:28:0x00a3, B:18:0x0062, B:20:0x0068, B:59:0x0164, B:61:0x016a, B:64:0x0172, B:125:0x02df, B:128:0x02ee, B:134:0x02fd, B:133:0x02fa, B:126:0x02e5, B:131:0x02f5), top: B:178:0x0062, inners: #1, #3, #4, #9, #10 }] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v22 */
    /* JADX WARN: Type inference failed for: r28v23 */
    /* JADX WARN: Type inference failed for: r28v24 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v8, types: [com.facebook.common.dextricks.ReentrantLockFile$Lock] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllImpl(int r28, com.facebook.quicklog.LightweightQuickPerformanceLogger r29, android.content.Context r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAllImpl(int, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0 A[Catch: all -> 0x00ef, TryCatch #1 {all -> 0x00ef, blocks: (B:12:0x0049, B:14:0x005e, B:16:0x0064, B:17:0x007f, B:27:0x00d0, B:28:0x00d3, B:18:0x0085, B:20:0x008f, B:22:0x0095, B:23:0x00b7, B:25:0x00c3), top: B:57:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loadDexFiles(com.facebook.common.dextricks.DexErrorRecoveryInfo r9, boolean r10, com.facebook.common.dextricks.OdexScheme r11, com.facebook.common.dextricks.DexManifest r12, android.content.Context r13, int r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadDexFiles(com.facebook.common.dextricks.DexErrorRecoveryInfo, boolean, com.facebook.common.dextricks.OdexScheme, com.facebook.common.dextricks.DexManifest, android.content.Context, int):void");
    }

    public static long nowTimestamp() {
        return sDexStoreClock.now();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r3 = new com.facebook.common.dextricks.DexStore(r4, r5, r6, r7, r8);
        com.facebook.common.dextricks.DexStore.sListHead = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.facebook.common.dextricks.DexStore open(java.io.File r4, java.io.File r5, com.facebook.common.dextricks.ResProvider r6, java.util.ArrayList<dalvik.system.DexFile> r7, java.util.ArrayList<dalvik.system.DexFile> r8) {
        /*
            java.lang.String r3 = "DexStore.open["
            java.lang.Class<com.facebook.common.dextricks.DexStore> r2 = com.facebook.common.dextricks.DexStore.class
            monitor-enter(r2)
            java.lang.String r1 = getIdForTracing(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "]"
            java.lang.String r0 = X.FGI.A0U(r3, r1, r0)     // Catch: java.lang.Throwable -> L38
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L38
            java.io.File r4 = r4.getAbsoluteFile()     // Catch: java.lang.Throwable -> L33
            com.facebook.common.dextricks.DexStore r3 = dexStoreListHead()     // Catch: java.lang.Throwable -> L33
        L1a:
            if (r3 == 0) goto L27
            java.io.File r0 = r3.root     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L2e
            com.facebook.common.dextricks.DexStore r3 = r3.next     // Catch: java.lang.Throwable -> L33
            goto L1a
        L27:
            com.facebook.common.dextricks.DexStore r3 = new com.facebook.common.dextricks.DexStore     // Catch: java.lang.Throwable -> L33
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
            com.facebook.common.dextricks.DexStore.sListHead = r3     // Catch: java.lang.Throwable -> L33
        L2e:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r2)
            return r3
        L33:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.open(java.io.File, java.io.File, com.facebook.common.dextricks.ResProvider, java.util.ArrayList, java.util.ArrayList):com.facebook.common.dextricks.DexStore");
    }

    private byte[] readSavedDepBlock() {
        String str;
        Object[] objArr;
        File fileA0O = C3cG.A0O(this.root, DEPS_FILENAME);
        if (!fileA0O.exists()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFileA0L = BV4.A0L(fileA0O);
            try {
                long length = randomAccessFileA0L.length();
                if (length > 16777216) {
                    str = "saved dep block file is way too big (%s bytes): considering invalid";
                    objArr = new Object[]{Long.valueOf(length)};
                } else {
                    byte[] bArr = new byte[(int) length];
                    int i = randomAccessFileA0L.read(bArr);
                    if (i >= length) {
                        Mlog.v("read saved dep file %s (%s bytes)", fileA0O, Long.valueOf(length));
                        return bArr;
                    }
                    str = "short read of dep block %s: wanted %s bytes; got %s: considering invalid";
                    objArr = new Object[]{fileA0O, Long.valueOf(length), Integer.valueOf(i)};
                }
                Mlog.i(str, objArr);
                return null;
            } finally {
                Fs.safeClose(randomAccessFileA0L);
            }
        } catch (FileNotFoundException e) {
            Mlog.w(e, "unable to open deps file %s", fileA0O);
            return null;
        }
    }

    private void setCompressedOreoDexErrorRecoveryInfo(DexErrorRecoveryInfo dexErrorRecoveryInfo, OdexSchemeOreo odexSchemeOreo, int i) {
        File file = odexSchemeOreo.mZipFile;
        int iMarkLoadResult = odexSchemeOreo.markLoadResult(i, this.mUseEagerDexOpt);
        dexErrorRecoveryInfo.loadResult = iMarkLoadResult;
        dexErrorRecoveryInfo.odexSize = OreoFileUtils.getOdex(file).length();
        dexErrorRecoveryInfo.odexLastModified = OreoFileUtils.getOdex(file).lastModified();
        dexErrorRecoveryInfo.odexSchemeName = "OdexSchemeOreo";
        dexErrorRecoveryInfo.dexoptDuringColdStart = (iMarkLoadResult & 1) != 0;
        dexErrorRecoveryInfo.dex2oatCmdLine = OreoFileUtils.getMegazipOdexKeyValue(file, "dex2oat-cmdline");
        dexErrorRecoveryInfo.vdexSize = OreoFileUtils.getVdex(file).length();
        dexErrorRecoveryInfo.vdexLastModified = OreoFileUtils.getVdex(file).lastModified();
    }

    private void setUsingAppImageForMainDexStore(final Context context, final File file) {
        String str = this.id;
        if (str == null || !DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
            return;
        }
        new Thread(file != null ? new Runnable(this) { // from class: com.facebook.common.dextricks.DexStore.1
            public final /* synthetic */ DexStore this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                DexErrorRecoveryInfoAsync.setMainDexStoreLoadInformation(OreoFileUtils.collectAsyncInfoWithSecondary(context, file));
            }
        } : new Runnable(this) { // from class: com.facebook.common.dextricks.DexStore.2
            public final /* synthetic */ DexStore this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                DexErrorRecoveryInfoAsync.setMainDexStoreLoadInformation(OreoFileUtils.collectBaseAsyncInfo(context));
            }
        }).start();
    }

    private boolean shouldLoadCompressedOreoImpl(Context context, DexManifest dexManifest) {
        if (sLoadedCompressedOreo) {
            return true;
        }
        context.getApplicationInfo();
        return false;
    }

    public void addChild(DexStore dexStore) {
        if (this.mChildStores.contains(dexStore)) {
            return;
        }
        this.mChildStores.add(dexStore);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean atomicReplaceConfig(com.facebook.common.dextricks.DexStore.Config r7) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            java.lang.String r2 = "Replacing config is default: %s nn: s"
            r3 = 0
            if (r7 == 0) goto Lc
            boolean r1 = r7.isDefault()
            r0 = 1
            if (r1 != 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AnonymousClass002.A1X(r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            com.facebook.common.dextricks.Mlog.i(r2, r0)
            com.facebook.common.dextricks.ReentrantLockFile r0 = r6.mLockFile
            com.facebook.common.dextricks.ReentrantLockFile$Lock r5 = r0.acquire(r3)
            java.io.File r1 = r6.root     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = "config"
            java.io.File r4 = X.C3cG.A0O(r1, r0)     // Catch: java.lang.Throwable -> L97
            com.facebook.common.dextricks.DexStore$Config r1 = r6.readConfig()     // Catch: java.lang.Throwable -> L97
            boolean r2 = r7.equals(r1)     // Catch: java.lang.Throwable -> L97
            boolean r0 = r6.attemptedOptimizationSinceRegeneration()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L3d
            goto L42
        L3d:
            boolean r1 = r7.equalsForBootstrapPurposes(r1)     // Catch: java.lang.Throwable -> L97
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L4e
            if (r2 != 0) goto L4e
            boolean r0 = r6.checkDeps()     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L50
            r1 = 0
        L4e:
            r3 = r1
            goto L56
        L50:
            boolean r0 = r6.attemptedOptimizationSinceRegeneration()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L4e
        L56:
            boolean r0 = r7.isDefault()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L60
            com.facebook.common.dextricks.Fs.deleteRecursive(r4)     // Catch: java.lang.Throwable -> L97
            goto L6e
        L60:
            java.io.File r1 = r6.root     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = "config.tmp"
            java.io.File r0 = X.C3cG.A0O(r1, r0)     // Catch: java.lang.Throwable -> L97
            r7.writeAndSync(r0)     // Catch: java.lang.Throwable -> L97
            com.facebook.common.dextricks.Fs.renameOrThrow(r0, r4)     // Catch: java.lang.Throwable -> L97
        L6e:
            if (r3 != 0) goto L8a
            java.io.File r0 = r6.root     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L97
            r0 = -1
            com.facebook.common.dextricks.RuntimeInternals.fsyncNamed(r1, r0)     // Catch: java.lang.Throwable -> L97
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L97
            java.io.File r0 = r6.getRegenFile()     // Catch: java.lang.Throwable -> L87
            r0.delete()     // Catch: java.lang.Throwable -> L87
            r6.touchRegenStamp()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L87
            goto L8f
        L87:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L97
        L8a:
            if (r2 != 0) goto L8f
            r6.saveDeps()     // Catch: java.lang.Throwable -> L97
        L8f:
            r0 = r3 ^ 1
            if (r5 == 0) goto L96
            r5.close()
        L96:
            return r0
        L97:
            r1 = move-exception
            if (r5 == 0) goto La2
            r5.close()     // Catch: java.lang.Throwable -> L9e
            throw r1
        L9e:
            r0 = move-exception
            X.AbstractC7486Exp.A00(r1, r0)
        La2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.atomicReplaceConfig(com.facebook.common.dextricks.DexStore$Config):boolean");
    }

    public boolean attemptedOptimizationSinceRegeneration() {
        return BV5.A1R(this.root, OPTIMIZATION_LOG_FILENAME);
    }

    public void forceRegenerateOnNextLoad() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ReentrantLockFile.Lock lockAcquire = this.mLockFile.acquire(0);
        try {
            writeStatusLocked(6L);
            if (lockAcquire != null) {
                lockAcquire.close();
            }
        } catch (Throwable th) {
            if (lockAcquire != null) {
                try {
                    lockAcquire.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public long getApkLastModified() {
        return this.mApk.lastModified();
    }

    public List<DexFile> getLoadedDexFiles() {
        return this.mLoadedDexFiles;
    }

    public DexManifest getLoadedManifest() {
        return this.mLoadedManifest;
    }

    public String getMegaZipPath() {
        return this.mMegaZipPath;
    }

    public File getRegenFile() {
        return C3cG.A0O(this.root, REGEN_STAMP_FILENAME);
    }

    public ResProvider getResProvider() {
        return this.mResProvider;
    }

    public boolean hasChildren() {
        return this.mChildStores.isEmpty();
    }

    public boolean isArtMainStore() {
        return this.mIsArtMainStore;
    }

    public synchronized DexErrorRecoveryInfo loadAll(int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Context context) {
        DexErrorRecoveryInfo dexErrorRecoveryInfoLoadAllImpl;
        Trace.beginSection(FGI.A0U("DexStore.loadAll[", getIdForTracing(this.root), "]"));
        try {
            try {
                dexErrorRecoveryInfoLoadAllImpl = loadAllImpl(i, lightweightQuickPerformanceLogger, context);
            } catch (RecoverableDexException e) {
                try {
                    dexErrorRecoveryInfoLoadAllImpl = loadAllImpl(i | 2, lightweightQuickPerformanceLogger, context);
                    dexErrorRecoveryInfoLoadAllImpl.regenRetryCause = e;
                } catch (RecoverableDexException e2) {
                    throw BV4.A0N(e2);
                }
            }
            Trace.endSection();
            dexErrorRecoveryInfoLoadAllImpl.loadAllTime = sDexStoreClock.now();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        return dexErrorRecoveryInfoLoadAllImpl;
    }

    public DexManifest loadManifest() {
        Trace.beginSection("DexStore.loadManifest");
        if (this.mManifest == null) {
            synchronized (this) {
                if (this.mManifest == null) {
                    DexManifest dexManifest = this.mIsArtMainStore ? new DexManifest(this.mResProvider.isExoResProvider()) : DexManifest.loadManifestFrom(this.mResProvider, DexStoreUtils.SECONDARY_DEX_MANIFEST, true);
                    this.id = dexManifest.id;
                    this.mManifest = dexManifest;
                }
            }
        }
        Trace.endSection();
        return this.mManifest;
    }

    public TmpDir makeTemporaryDirectory(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        File fileCreateTempFile;
        File fileA0L;
        ReentrantLockFile reentrantLockFileOpen;
        ReentrantLockFile.Lock lockAcquire = this.mLockFile.acquire(0);
        try {
            fileCreateTempFile = File.createTempFile(str, TMPDIR_LOCK_SUFFIX, this.root);
        } catch (Throwable th) {
            th = th;
            fileCreateTempFile = null;
            fileA0L = null;
        }
        try {
            fileA0L = BV5.A0L(Fs.stripLastExtension(fileCreateTempFile.getName()), TMPDIR_SUFFIX, this.root);
            Fs.mkdirOrThrow(fileA0L);
            try {
                reentrantLockFileOpen = ReentrantLockFile.open(fileCreateTempFile);
            } catch (Throwable th2) {
                th = th2;
                reentrantLockFileOpen = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileA0L = null;
            reentrantLockFileOpen = null;
            try {
                Fs.safeClose((Closeable) null);
                Fs.safeClose(reentrantLockFileOpen);
                Fs.deleteRecursiveNoThrow(fileCreateTempFile);
                Fs.deleteRecursiveNoThrow(fileA0L);
                throw th;
            } catch (Throwable th4) {
                if (lockAcquire != null) {
                    try {
                        lockAcquire.close();
                        throw th4;
                    } catch (Throwable th5) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                        throw th4;
                    }
                }
                throw th4;
            }
        }
        try {
            ReentrantLockFile.Lock lockTryAcquire = reentrantLockFileOpen.tryAcquire(1);
            if (lockTryAcquire == null) {
                throw BV4.A0c("should have been able to acquire tmpdir lock");
            }
            TmpDir tmpDir = new TmpDir(lockTryAcquire, fileA0L);
            Mlog.v("created tmpdir %s (lock file %s)", tmpDir.directory, reentrantLockFileOpen.lockFileName);
            if (lockAcquire != null) {
                lockAcquire.close();
            }
            return tmpDir;
        } catch (Throwable th6) {
            th = th6;
            Fs.safeClose((Closeable) null);
            Fs.safeClose(reentrantLockFileOpen);
            Fs.deleteRecursiveNoThrow(fileCreateTempFile);
            Fs.deleteRecursiveNoThrow(fileA0L);
            throw th;
        }
    }

    public Config readConfig() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Config configBuild;
        ReentrantLockFile.Lock lockAcquire = this.mLockFile.acquire(0);
        try {
            File fileA0O = C3cG.A0O(this.root, "config");
            try {
                try {
                    configBuild = Config.read(fileA0O);
                } catch (UnsupportedOperationException unused) {
                    Mlog.i("unsupported dex store config file %s: ignoring and deleting", new Object[0]);
                    Fs.deleteRecursive(fileA0O);
                    configBuild = new Config.Builder().build();
                }
            } catch (FileNotFoundException unused2) {
                configBuild = new Config.Builder().build();
            } catch (Exception e) {
                Mlog.w(e, "error reading dex store config file %s: deleting and proceeding", new Object[0]);
                Fs.deleteRecursive(fileA0O);
                configBuild = new Config.Builder().build();
            }
            if (lockAcquire != null) {
                lockAcquire.close();
            }
            return configBuild;
        } catch (Throwable th) {
            if (lockAcquire != null) {
                try {
                    lockAcquire.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public void setResProvider(ResProvider resProvider) {
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
    }

    public boolean useBgDexOpt() {
        return this.mUseBgDexOpt;
    }

    public boolean useEagerDexOpt() {
        return this.mUseEagerDexOpt;
    }

    public DexStore(File file, File file2, ResProvider resProvider, ArrayList<DexFile> arrayList, ArrayList<DexFile> arrayList2) {
        this.mApk = file2;
        this.root = file;
        Fs.mkdirOrThrow(file);
        this.mLockFile = ReentrantLockFile.open(C3cG.A0O(file, MDEX_LOCK_FILENAME));
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
        this.primaryDexes = arrayList;
        this.auxiliaryDexes = arrayList2;
    }

    private boolean checkDeps() {
        byte[] currentDepBlock = readCurrentDepBlock();
        byte[] savedDepBlock = readSavedDepBlock();
        return savedDepBlock != null && Arrays.equals(currentDepBlock, savedDepBlock);
    }

    private int checkDirty(OdexScheme odexScheme, String[] strArr) {
        ArrayList arrayListA0h = C3cG.A0h();
        int iCheckDirty = checkDirty(odexScheme, strArr, arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            Fs.deleteRecursive((File) it.next());
        }
        return iCheckDirty;
    }

    public static long getApkIdentifier(File file, boolean z) {
        BuildConstants.A01();
        BV6.A1F("Build id used for apk identification");
        return 1114131228L;
    }

    public static String getIdForTracing(File file) {
        int i;
        String path = file.getPath();
        int length = path.length();
        if (length <= 64) {
            return path;
        }
        if (path.startsWith("/data/data/")) {
            int iIndexOf = path.indexOf(47, 11);
            i = iIndexOf + 1;
            if (length <= iIndexOf + 65) {
                return path.substring(i);
            }
        } else {
            i = 0;
        }
        return path.substring(i, i + 64);
    }

    private String[] listAndPruneRootFiles(Context context) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayListA0h = C3cG.A0h();
        String[] strArrListRootFilesForPruningLocked = listRootFilesForPruningLocked(context, arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            Fs.deleteRecursive((File) it.next());
        }
        return strArrListRootFilesForPruningLocked;
    }

    private String[] listRootFilesForPruningLocked(Context context, List<File> list) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int length;
        String str;
        assertLockHeld();
        String[] list2 = this.root.list();
        if (list2 == null) {
            throw BV4.A0K(C8j3.A14(this.root, C60O.A0x("unable to list directory ")));
        }
        int i = 0;
        while (true) {
            length = list2.length;
            if (i >= length) {
                break;
            }
            String str2 = list2[i];
            if (str2.equals(MDEX_LOCK_FILENAME) || str2.equals(MDEX_STATUS_FILENAME) || str2.equals(ODEX_LOCK_FILENAME) || str2.equals(DEPS_FILENAME) || str2.equals(REGEN_STAMP_FILENAME) || str2.equals(OPTIMIZATION_LOG_FILENAME) || str2.equals(OPTIMIZATION_HISTORY_LOG_FILENAME) || str2.equals("config")) {
                list2[i] = null;
            }
            if (str2.equals(CONFIG_TMP_FILENAME)) {
                list.add(C3cG.A0O(this.root, str2));
                list2[i] = null;
            }
            i++;
        }
        for (int i2 = 0; i2 < length; i2++) {
            String str3 = list2[i2];
            if (str3 != null) {
                if (str3.endsWith(TMPDIR_LOCK_SUFFIX)) {
                    list2[i2] = null;
                    int iFindInArray = findInArray(list2, FGI.A0M(Fs.stripLastExtension(str3), TMPDIR_SUFFIX));
                    if (iFindInArray >= 0) {
                        str = list2[iFindInArray];
                        list2[iFindInArray] = null;
                    } else {
                        str = null;
                    }
                } else if (str3.endsWith(TMPDIR_SUFFIX)) {
                    list2[i2] = null;
                    int iFindInArray2 = findInArray(list2, FGI.A0M(Fs.stripLastExtension(str3), TMPDIR_LOCK_SUFFIX));
                    if (iFindInArray2 >= 0) {
                        String str4 = list2[iFindInArray2];
                        list2[iFindInArray2] = null;
                        str = str3;
                        str3 = str4;
                    } else {
                        str = str3;
                        str3 = null;
                    }
                } else {
                    str3 = null;
                    str = null;
                }
                if (str3 != null && str != null) {
                    File fileA0O = C3cG.A0O(this.root, str3);
                    ReentrantLockFile reentrantLockFileOpen = ReentrantLockFile.open(fileA0O);
                    try {
                        if (reentrantLockFileOpen.tryAcquire(0) == null) {
                            Mlog.v("tmpdir %s in use: not deleting", str);
                        } else {
                            try {
                                Mlog.i("tmpdir %s (lockfile %s) is abandoned: will delete", fileA0O, str);
                                list.add(fileA0O);
                                list.add(C3cG.A0O(this.root, str));
                            } finally {
                            }
                        }
                        reentrantLockFileOpen.close();
                    } catch (Throwable th) {
                        try {
                            reentrantLockFileOpen.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                } else if (str3 != null) {
                    Mlog.i("tmpdir lockfile %s is orphaned: will delete", str3);
                    list.add(C3cG.A0O(this.root, str3));
                } else if (str != null) {
                    Mlog.i("tmpdir %s is orphaned without its lockfile: will delete", str);
                    list.add(C3cG.A0O(this.root, str));
                }
            }
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.common.dextricks.DexErrorRecoveryInfo loadAllCompressedOreoImpl(com.facebook.common.dextricks.DexErrorRecoveryInfo r19, com.facebook.common.dextricks.DexManifest r20, int r21, com.facebook.quicklog.LightweightQuickPerformanceLogger r22, android.content.Context r23) throws com.facebook.common.dextricks.DexStore.RecoverableDexException {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.loadAllCompressedOreoImpl(com.facebook.common.dextricks.DexErrorRecoveryInfo, com.facebook.common.dextricks.DexManifest, int, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.DexErrorRecoveryInfo");
    }

    private byte[] readCurrentDepBlock() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            long apkIdentifier = getApkIdentifier(this.mApk, true);
            parcelObtain.writeString(this.mApk.getName());
            parcelObtain.writeLong(apkIdentifier);
            parcelObtain.writeString(Build.FINGERPRINT);
            if (C9X.A05()) {
                parcelObtain.writeByte((byte) 0);
            }
            parcelObtain.writeByteArray(readConfig().readDepBlock());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    private long readStatusLocked() {
        assertLockHeld();
        File fileA0O = C3cG.A0O(this.root, MDEX_STATUS_FILENAME);
        long j = 0;
        try {
            FileInputStream fileInputStreamA0H = BV4.A0H(fileA0O);
            try {
                byte[] bArr = new byte[16];
                if (fileInputStreamA0H.read(bArr, 0, 16) < 16) {
                    Mlog.d("status file %s too short: treating as zero", fileA0O);
                    Fs.deleteRecursiveNoThrow(fileA0O);
                } else {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    j = byteBufferWrap.getLong();
                    long j2 = byteBufferWrap.getLong();
                    Long lValueOf = Long.valueOf(j);
                    Long lValueOf2 = Long.valueOf(j2);
                    Mlog.v("read status:%x check:%x str:%s", lValueOf, lValueOf2, getStatusDescription(j));
                    long j3 = MDEX_STATUS_XOR ^ j;
                    if (j3 != j2) {
                        Mlog.e("check mismatch: status:%x expected-check:%x actual-check:%x", lValueOf, Long.valueOf(j3), lValueOf2);
                        Fs.deleteRecursiveNoThrow(fileA0O);
                        return 0L;
                    }
                }
                return j;
            } finally {
                Fs.safeClose(fileInputStreamA0H);
            }
        } catch (FileNotFoundException unused) {
            Mlog.d("status file %s not found: treating as zero", fileA0O);
            return 0L;
        }
    }

    private void runCompiler(DexManifest dexManifest, OdexScheme odexScheme, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        OdexScheme.Compiler compilerMakeCompiler = odexScheme.makeCompiler(this, i);
        try {
            InputDexIterator inputDexIteratorOpenDexIterator = this.mDexIteratorFactory.openDexIterator(this.id, dexManifest, lightweightQuickPerformanceLogger, context);
            while (inputDexIteratorOpenDexIterator.hasNext()) {
                try {
                    InputDex next = inputDexIteratorOpenDexIterator.next();
                    try {
                        Mlog.v("compiling %d/%d %s", Integer.valueOf(inputDexIteratorOpenDexIterator.mDexPos), Integer.valueOf(inputDexIteratorOpenDexIterator.mDexes.length), next);
                        compilerMakeCompiler.compile(next);
                        if (next != null) {
                            next.close();
                        }
                    } finally {
                    }
                } finally {
                }
            }
            compilerMakeCompiler.performFinishActions();
            inputDexIteratorOpenDexIterator.close();
            compilerMakeCompiler.close();
        } catch (Throwable th) {
            if (compilerMakeCompiler != null) {
                try {
                    compilerMakeCompiler.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    private void saveDeps() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        byte[] currentDepBlock = readCurrentDepBlock();
        File fileA0O = C3cG.A0O(this.root, DEPS_FILENAME);
        RandomAccessFile randomAccessFileA0M = BV4.A0M(fileA0O);
        try {
            randomAccessFileA0M.write(currentDepBlock);
            randomAccessFileA0M.setLength(randomAccessFileA0M.getFilePointer());
            randomAccessFileA0M.close();
            Mlog.v("saved deps file %s", fileA0O);
        } catch (Throwable th) {
            try {
                randomAccessFileA0M.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    private OdexScheme schemeForState(Context context, DexManifest dexManifest, long j, int i) {
        return schemeForState(context, dexManifest, j);
    }

    public static void setClock(DexStoreClock dexStoreClock) {
        Mlog.d("Setting dexstore clock override", BV4.A1W());
        sDexStoreClock = dexStoreClock;
    }

    public static void setIsSynchronizedDexConfig(boolean z) {
        ClassLoaderConfigurationHelper.setIsSynchronized(z);
    }

    private void touchRegenStamp() throws IOException {
        File regenFile = getRegenFile();
        regenFile.createNewFile();
        if (!regenFile.setLastModified(sDexStoreClock.now())) {
            throw BV8.A0j(regenFile, "could not set modtime of ");
        }
    }

    public Map<String, String> getDiagnostics(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        long jReportStatus = reportStatus();
        Config config = readConfig();
        schemeForState(context, loadManifest(), jReportStatus);
        linkedHashMapA0j.put("loadNotOptimized", Boolean.toString(true));
        linkedHashMapA0j.put("scheme", getStatusDescription(jReportStatus));
        linkedHashMapA0j.put(AuraDeeplinkRouteMapper.STATUS_ROUTE, Long.toHexString(jReportStatus));
        if (config != null) {
            linkedHashMapA0j.put("config.enablePgoCompile", Boolean.toString(config.tryPeriodicPgoCompilation));
            if (config.tryPeriodicPgoCompilation) {
                linkedHashMapA0j.put("config.minPgoDuration", Long.toString(config.minTimeBetweenPgoCompilationMs));
                linkedHashMapA0j.put("config.timeleft", "<no info>");
            }
        }
        return linkedHashMapA0j;
    }

    public String[] getParentNames() {
        return loadManifest().requires;
    }

    public void markArtMainStore(Context context) {
        C3146Bzc c3146Bzc = new C3146Bzc();
        c3146Bzc.A00 = context;
        if (AbstractC3145Bzb.A00(c3146Bzc, Experiments.SKIP_MANIFEST_RELEASE) != 1) {
            C3146Bzc c3146Bzc2 = new C3146Bzc();
            c3146Bzc2.A00 = context;
            if (AbstractC3145Bzb.A00(c3146Bzc2, Experiments.SKIP_MANIFEST) != 1) {
                return;
            }
        }
        Mlog.w("Marking ArtMainStore true!", new Object[0]);
        this.mIsArtMainStore = true;
    }

    public void writeStatusLocked(long j) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        assertLockHeld();
        if (((byte) (15 & j)) != 1) {
            RuntimeInternals.fsyncNamed(this.root.getAbsolutePath(), -1);
        }
        File fileA0O = C3cG.A0O(this.root, MDEX_STATUS_FILENAME);
        long j2 = MDEX_STATUS_XOR ^ j;
        Mlog.v("writing status:%x check:%x str:%s", Long.valueOf(j), Long.valueOf(j2), getStatusDescription(j));
        byte[] bArr = new byte[16];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(j);
        byteBufferWrap.putLong(j2);
        FileOutputStream fileOutputStreamA0I = BV4.A0I(fileA0O);
        try {
            fileOutputStreamA0I.write(bArr, 0, 16);
            fileOutputStreamA0I.getFD().sync();
            fileOutputStreamA0I.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamA0I.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int checkDirty(com.facebook.common.dextricks.OdexScheme r9, java.lang.String[] r10, java.util.List<java.io.File> r11) {
        /*
            r8 = this;
            java.lang.String[] r2 = r9.expectedFiles
            int r0 = r9.flags
            r0 = r0 & 2
            r5 = 0
            if (r0 == 0) goto La
            r5 = 2
        La:
            java.lang.Object r4 = r10.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            r8.setDifference(r4, r2)
            r3 = 0
            r7 = 0
        L15:
            int r0 = r4.length
            r6 = 1
            if (r3 >= r0) goto L51
            r0 = r4[r3]
            if (r0 == 0) goto L43
            boolean r0 = com.facebook.common.dextricks.DexStoreUtils.isIgnoreDirtyFileName(r0)
            if (r0 != 0) goto L43
            r6 = r4[r3]
            java.io.File r1 = r8.root
            java.lang.String r0 = r9.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1, r0}
            java.lang.String r0 = "deleting unknown file %s in dex store %s with schema %s"
            com.facebook.common.dextricks.Mlog.i(r0, r1)
            java.io.File r1 = r8.root
            r0 = r4[r3]
            java.io.File r0 = X.C3cG.A0O(r1, r0)
            r11.add(r0)
            r7 = 1
        L40:
            int r3 = r3 + 1
            goto L15
        L43:
            r1 = r4[r3]
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Ignoring potentially excessive file %s in root: %s"
            com.facebook.common.dextricks.Mlog.d(r0, r1)
            goto L40
        L51:
            if (r7 == 0) goto L65
            int r0 = r9.flags
            r0 = r0 & 1
            if (r0 == 0) goto L65
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "dex store %s had excess files and is non-incremental: regenerating"
            com.facebook.common.dextricks.Mlog.i(r0, r1)
            r5 = 2
        L65:
            boolean r0 = r8.checkDeps()
            if (r0 != 0) goto L78
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "dex store %s dependencies have changed: regenerating all"
            com.facebook.common.dextricks.Mlog.i(r0, r1)
            r5 = 2
        L77:
            return r5
        L78:
            if (r5 >= r6) goto L77
            com.facebook.common.dextricks.ExpectedFileInfo[] r4 = r9.expectedFileInfos
            java.lang.Object r3 = r2.clone()
            java.lang.String[] r3 = (java.lang.String[]) r3
            r8.setDifference(r3, r10)
            r2 = 0
        L86:
            int r0 = r3.length
            if (r2 >= r0) goto L77
            r0 = r4[r2]
            if (r0 == 0) goto L92
            boolean r1 = r0.mIsOptional
            r0 = 1
            if (r1 != 0) goto L93
        L92:
            r0 = 0
        L93:
            r1 = r3[r2]
            if (r1 == 0) goto La5
            if (r0 != 0) goto La5
            java.io.File r0 = r8.root
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "missing file %s in dex store %s"
            com.facebook.common.dextricks.Mlog.i(r0, r1)
            r5 = 1
        La5:
            int r2 = r2 + 1
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.checkDirty(com.facebook.common.dextricks.OdexScheme, java.lang.String[], java.util.List):int");
    }

    public static synchronized DexStore findOpened(File file) {
        File absoluteFile = file.getAbsoluteFile();
        for (DexStore dexStoreDexStoreListHead = dexStoreListHead(); dexStoreDexStoreListHead != null; dexStoreDexStoreListHead = dexStoreDexStoreListHead.next) {
            if (dexStoreDexStoreListHead.root.equals(absoluteFile)) {
                return dexStoreDexStoreListHead;
            }
        }
        return null;
    }

    public static DexStore open(File file, File file2, ResProvider resProvider) {
        return open(file, file2, resProvider, C3cG.A0h(), C3cG.A0h());
    }

    private OdexScheme schemeForState(Context context, DexManifest dexManifest, long j) {
        if (dexManifest.isUncompressedExo()) {
            BV6.A1F("Uncompressed exo package detected, using OdexSchemeUncompressedExo scheme");
            return new OdexSchemeUncompressedExo(dexManifest, this.mResProvider);
        }
        if (dexManifest.isArtMainStore) {
            BV6.A1F("This is the main store for art builds, using noop scheme");
        } else {
            DexManifest.Dex[] dexArr = dexManifest.dexes;
            byte b = (byte) (15 & j);
            if (b != 2) {
                if (b != 7) {
                    if (b != 8) {
                        if (b != 9) {
                            return new OdexSchemeInvalid(j);
                        }
                    } else {
                        return new OdexSchemeArtXdex(dexArr, j);
                    }
                } else {
                    return new OdexSchemeArtTurbo(dexArr);
                }
            } else {
                return new OdexSchemeBoring(dexArr);
            }
        }
        return new OdexSchemeNoop();
    }
}
