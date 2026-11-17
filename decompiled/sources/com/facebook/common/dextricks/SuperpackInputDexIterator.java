package com.facebook.common.dextricks;

import X.AnonymousClass007;
import X.BV4;
import X.C3cG;
import X.C8j3;
import X.EnumC2380BWu;
import X.FGI;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.superpack.SuperpackArchive;
import com.facebook.superpack.SuperpackFile;
import com.facebook.superpack.SuperpackFileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

/* loaded from: classes5.dex */
public final class SuperpackInputDexIterator extends InputDexIterator {
    public final EnumC2380BWu mArchiveExtension;
    public final int[] mDexToArchiveMap;
    public final SynchronousQueue<SuperpackFile>[] mFileQueues;
    public int mNextDexIndex;
    public boolean mShuttingDownFlag;
    public final SuperpackArchive mSuperpackArchive;
    public SuperpackFile mSuperpackFileToClose;
    public final Thread[] mThreads;

    public final class Builder {
        public EnumC2380BWu archiveExtension;
        public int[] dexToArchive;
        public DexManifest manifest;
        public LightweightQuickPerformanceLogger qplCollector;
        public ArrayList<InputStream> rawArchives;

        public Builder assignDexToArchive(int i, int i2) {
            if (i2 < 0 || i2 >= this.rawArchives.size()) {
                throw new IndexOutOfBoundsException();
            }
            this.dexToArchive[i] = i2;
            return this;
        }

        public SuperpackInputDexIterator build() {
            if (this.rawArchives.size() >= 1) {
                return new SuperpackInputDexIterator(this);
            }
            throw BV4.A0T();
        }

        public Builder(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
            this.archiveExtension = EnumC2380BWu.NONE;
            dexManifest.getClass();
            this.manifest = dexManifest;
            this.dexToArchive = new int[dexManifest.dexes.length];
            this.qplCollector = lightweightQuickPerformanceLogger;
            this.rawArchives = C3cG.A0h();
            this.archiveExtension = dexManifest.superpackExtension;
        }

        public Builder addRawArchive(InputStream inputStream) {
            inputStream.getClass();
            this.rawArchives.add(inputStream);
            return this;
        }
    }

    public class UnpackingRunnable implements Runnable {
        public InputStream mInput;
        public SynchronousQueue<SuperpackFile> mOutput;

        public UnpackingRunnable(InputStream inputStream, SynchronousQueue<SuperpackFile> synchronousQueue) {
            this.mInput = inputStream;
            this.mOutput = synchronousQueue;
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                SuperpackArchive superpackArchive = SuperpackInputDexIterator.this.getSuperpackArchive(this.mInput);
                try {
                    this.mInput.close();
                    while (superpackArchive.hasNext()) {
                        try {
                            this.mOutput.put(SuperpackInputDexIterator.this.getNextFileFromSpk(superpackArchive));
                        } finally {
                        }
                    }
                    superpackArchive.close();
                } finally {
                }
            } catch (IOException e) {
                throw BV4.A0e(e);
            } catch (InterruptedException e2) {
                if (!SuperpackInputDexIterator.this.mShuttingDownFlag) {
                    throw BV4.A0e(e2);
                }
            }
        }
    }

    public SuperpackInputDexIterator(Builder builder) {
        super(builder.manifest, builder.qplCollector);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603017);
        }
        this.mArchiveExtension = builder.archiveExtension;
        try {
            this.mShuttingDownFlag = false;
            this.mNextDexIndex = 0;
            this.mDexToArchiveMap = builder.dexToArchive;
            int iA0K = C8j3.A0K(builder.rawArchives);
            this.mThreads = new Thread[iA0K];
            this.mFileQueues = new SynchronousQueue[iA0K];
            int i = 0;
            while (i < iA0K) {
                this.mFileQueues[i] = new SynchronousQueue<>();
                int i2 = i + 1;
                this.mThreads[i] = new Thread(new UnpackingRunnable(builder.rawArchives.get(i2), this.mFileQueues[i]));
                this.mThreads[i].start();
                i = i2;
            }
            this.mSuperpackArchive = getSuperpackArchive(builder.rawArchives.get(0));
        } catch (Throwable th) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603017, (short) 2);
            }
            throw th;
        }
    }

    public static Builder builder(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        return new Builder(dexManifest, lightweightQuickPerformanceLogger);
    }

    public static String getArchiveExtension(Builder builder) {
        EnumC2380BWu enumC2380BWu = builder.manifest.superpackExtension;
        SuperpackArchive superpackArchive = SuperpackArchive.$redex_init_class;
        if (enumC2380BWu == EnumC2380BWu.NONE) {
            return ".dex.spk.xz";
        }
        if (enumC2380BWu == EnumC2380BWu.OB) {
            return ".dex.spo";
        }
        if (enumC2380BWu == EnumC2380BWu.XZ) {
            return ".dex.spk.xz";
        }
        if (enumC2380BWu == EnumC2380BWu.ZST) {
            return ".dex.spk.zst";
        }
        throw BV4.A0c(AnonymousClass007.A0a("Unknown Superpack Archive Extension ", enumC2380BWu));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SuperpackFile getNextFileFromSpk(SuperpackArchive superpackArchive) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603016);
        }
        try {
            return superpackArchive.next();
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603016, (short) 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SuperpackArchive getSuperpackArchive(InputStream inputStream) {
        SuperpackArchive superpackArchive;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603015);
        }
        try {
            EnumC2380BWu enumC2380BWu = this.mArchiveExtension;
            if (enumC2380BWu == EnumC2380BWu.OB) {
                SuperpackArchive superpackArchive2 = SuperpackArchive.$redex_init_class;
                inputStream.getClass();
                superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, "spo", 0L));
            } else if (enumC2380BWu == EnumC2380BWu.NONE || enumC2380BWu == EnumC2380BWu.XZ) {
                SuperpackArchive superpackArchive3 = SuperpackArchive.$redex_init_class;
                inputStream.getClass();
                superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, "xz", 0L));
            } else {
                if (enumC2380BWu != EnumC2380BWu.ZST) {
                    throw BV4.A0c(AnonymousClass007.A0a("Unknown Superpack Archive Extension ", enumC2380BWu));
                }
                SuperpackArchive superpackArchive4 = SuperpackArchive.$redex_init_class;
                inputStream.getClass();
                superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, "zst", 0L));
            }
            return superpackArchive;
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603015, (short) 2);
            }
        }
    }

    private void maybeCloseLastSuperpackFile() {
        SuperpackFile superpackFile = this.mSuperpackFileToClose;
        if (superpackFile != null) {
            superpackFile.close();
            this.mSuperpackFileToClose = null;
        }
    }

    private SuperpackFile nextSuperpackFile() {
        int[] iArr = this.mDexToArchiveMap;
        int i = this.mNextDexIndex;
        this.mNextDexIndex = i + 1;
        int i2 = iArr[i];
        if (i2 == 0) {
            return getNextFileFromSpk(this.mSuperpackArchive);
        }
        try {
            return this.mFileQueues[i2 - 1].take();
        } catch (InterruptedException e) {
            throw BV4.A0e(e);
        }
    }

    private void setLastSuperpackFileToClose(SuperpackFile superpackFile) {
        if (this.mSuperpackFileToClose != null) {
            throw BV4.A0T();
        }
        this.mSuperpackFileToClose = superpackFile;
    }

    @Override // com.facebook.common.dextricks.InputDexIterator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.mShuttingDownFlag) {
            throw C3cG.A0Q("Iterator already closed");
        }
        this.mShuttingDownFlag = true;
        maybeCloseLastSuperpackFile();
        try {
            try {
                this.mSuperpackArchive.close();
                for (Thread thread : this.mThreads) {
                    thread.interrupt();
                    thread.join();
                }
            } catch (InterruptedException e) {
                throw BV4.A0e(e);
            }
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
            if (lightweightQuickPerformanceLogger != null) {
                lightweightQuickPerformanceLogger.markerEnd(34603017, (short) 2);
            }
        }
    }

    @Override // com.facebook.common.dextricks.InputDexIterator
    public InputDex nextImpl(DexManifest.Dex dex) {
        String nameNative;
        String nameNative2;
        SuperpackFileInputStream superpackFileInputStream;
        maybeCloseLastSuperpackFile();
        SuperpackFile superpackFileNextSuperpackFile = nextSuperpackFile();
        String str = dex.assetName;
        synchronized (superpackFileNextSuperpackFile) {
            long j = superpackFileNextSuperpackFile.A02;
            if (j == 0) {
                throw BV4.A0T();
            }
            nameNative = SuperpackFile.getNameNative(j);
        }
        if (str.equals(nameNative)) {
            setLastSuperpackFileToClose(superpackFileNextSuperpackFile);
            synchronized (superpackFileNextSuperpackFile) {
                if (superpackFileNextSuperpackFile.A02 == 0) {
                    throw BV4.A0T();
                }
                superpackFileInputStream = new SuperpackFileInputStream(superpackFileNextSuperpackFile);
            }
            return new InputDex(dex, superpackFileInputStream);
        }
        String str2 = dex.assetName;
        synchronized (superpackFileNextSuperpackFile) {
            long j2 = superpackFileNextSuperpackFile.A02;
            if (j2 == 0) {
                throw BV4.A0T();
            }
            nameNative2 = SuperpackFile.getNameNative(j2);
        }
        throw BV4.A0c(FGI.A0d("Wrong dex, expected ", str2, ", got ", nameNative2));
    }
}
