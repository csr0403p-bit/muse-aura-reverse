package com.facebook.common.dextricks;

import X.AnonymousClass002;
import X.BV4;
import X.C3cG;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes5.dex */
public final class ReentrantLockFile implements Closeable {
    public static final int ACQUIRE_SHARED = 1;
    public static final boolean LOCK_DEBUG = false;
    public static final ReentrantLockFile sListHead = new ReentrantLockFile();
    public final File lockFileName;
    public FileChannel mChannel;
    public int mLockFlags;
    public final Lock mLockHandle;
    public boolean mLockInProgress;
    public Thread mLockOwner;
    public int mLockShareCount;
    public ReentrantLockFile mNext;
    public ReentrantLockFile mPrev;
    public int mReferenceCount;
    public FileLock mTheLock;

    public final class Lock implements Closeable {
        public Lock() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLockFile.this.release();
        }

        public ReentrantLockFile getReentrantLockFile() {
            return ReentrantLockFile.this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r10.mLockOwner == java.lang.Thread.currentThread()) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.facebook.common.dextricks.ReentrantLockFile.Lock tryAcquire(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.nio.channels.FileChannel r4 = r10.mChannel     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L68
            r0 = r11 & 1
            r1 = 0
            boolean r9 = X.AnonymousClass002.A1L(r0)
            boolean r0 = r10.mLockInProgress     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            if (r0 != 0) goto L66
            int r2 = r10.mLockShareCount     // Catch: java.lang.Throwable -> L6f
            if (r2 <= 0) goto L32
            int r0 = r10.mLockFlags     // Catch: java.lang.Throwable -> L6f
            r0 = r0 & 1
            if (r0 == 0) goto L1c
            r1 = 1
        L1c:
            if (r9 == 0) goto L21
            if (r1 != 0) goto L2b
            goto L23
        L21:
            if (r1 != 0) goto L66
        L23:
            java.lang.Thread r1 = r10.mLockOwner     // Catch: java.lang.Throwable -> L6f
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L6f
            if (r1 != r0) goto L66
        L2b:
            int r0 = r2 + 1
            r10.mLockShareCount = r0     // Catch: java.lang.Throwable -> L6f
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r10.mLockHandle     // Catch: java.lang.Throwable -> L6f
            goto L47
        L32:
            r5 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.nio.channels.FileLock r0 = r4.tryLock(r5, r7, r9)     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L6f
            if (r0 == 0) goto L66
            r10.addrefLocked()     // Catch: java.lang.Throwable -> L6f
            r10.claimLock(r11, r0)     // Catch: java.lang.Throwable -> L6f
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r10.mLockHandle     // Catch: java.lang.Throwable -> L6f
        L47:
            monitor-exit(r10)
            return r0
        L49:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L61
            java.lang.String r0 = ": EAGAIN ("
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L66
            java.lang.String r0 = ": errno 11 ("
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L61
            goto L66
        L61:
            java.lang.RuntimeException r0 = X.BV4.A0e(r2)     // Catch: java.lang.Throwable -> L6f
            goto L6e
        L66:
            monitor-exit(r10)
            return r3
        L68:
            java.lang.String r0 = "cannot acquire closed lock"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> L6f
        L6e:
            throw r0     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.tryAcquire(int):com.facebook.common.dextricks.ReentrantLockFile$Lock");
    }

    private void addrefLocked() {
        if (this.mChannel == null) {
            throw C3cG.A0Q("cannot add reference to dead lock");
        }
        this.mReferenceCount++;
    }

    private void claimLock(int i, FileLock fileLock) {
        if ((i & 1) == 0) {
            this.mLockOwner = Thread.currentThread();
        }
        this.mTheLock = fileLock;
        this.mLockFlags = i;
        this.mLockShareCount = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        r1 = X.BV4.A0M(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        r0 = r1.getChannel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r1 = new com.facebook.common.dextricks.ReentrantLockFile(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r1.mPrev = r3;
        r1.mNext = r3.mNext;
        r3.mNext = r1;
        r0 = r1.mNext;
        r0.getClass();
        r0.mPrev = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r0 = null;
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        com.facebook.common.dextricks.Fs.safeClose(r2);
        com.facebook.common.dextricks.Fs.safeClose(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.facebook.common.dextricks.ReentrantLockFile open(java.io.File r6) {
        /*
            java.lang.Class<com.facebook.common.dextricks.ReentrantLockFile> r5 = com.facebook.common.dextricks.ReentrantLockFile.class
            monitor-enter(r5)
            java.io.File r4 = r6.getAbsoluteFile()     // Catch: java.lang.Throwable -> L51
            com.facebook.common.dextricks.ReentrantLockFile r1 = com.facebook.common.dextricks.ReentrantLockFile.sListHead     // Catch: java.lang.Throwable -> L51
        L9:
            com.facebook.common.dextricks.ReentrantLockFile r1 = r1.mNext     // Catch: java.lang.Throwable -> L51
            com.facebook.common.dextricks.ReentrantLockFile r3 = com.facebook.common.dextricks.ReentrantLockFile.sListHead     // Catch: java.lang.Throwable -> L51
            if (r1 == r3) goto L23
            r1.getClass()     // Catch: java.lang.Throwable -> L51
            java.io.File r0 = r1.lockFileName     // Catch: java.lang.Throwable -> L51
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L9
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L51
            r1.addrefLocked()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            goto L40
        L20:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L20
            goto L50
        L23:
            r2 = 0
            java.io.RandomAccessFile r1 = X.BV4.A0M(r4)     // Catch: java.lang.Throwable -> L48
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L44
            com.facebook.common.dextricks.ReentrantLockFile r1 = new com.facebook.common.dextricks.ReentrantLockFile     // Catch: java.lang.Throwable -> L42
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L42
            r1.mPrev = r3     // Catch: java.lang.Throwable -> L48
            com.facebook.common.dextricks.ReentrantLockFile r0 = r3.mNext     // Catch: java.lang.Throwable -> L48
            r1.mNext = r0     // Catch: java.lang.Throwable -> L48
            r3.mNext = r1     // Catch: java.lang.Throwable -> L48
            com.facebook.common.dextricks.ReentrantLockFile r0 = r1.mNext     // Catch: java.lang.Throwable -> L48
            r0.getClass()     // Catch: java.lang.Throwable -> L48
            r0.mPrev = r1     // Catch: java.lang.Throwable -> L48
        L40:
            monitor-exit(r5)
            return r1
        L42:
            r3 = move-exception
            goto L4a
        L44:
            r3 = move-exception
            r0 = r2
            r2 = r1
            goto L4a
        L48:
            r3 = move-exception
            r0 = r2
        L4a:
            com.facebook.common.dextricks.Fs.safeClose(r2)     // Catch: java.lang.Throwable -> L51
            com.facebook.common.dextricks.Fs.safeClose(r0)     // Catch: java.lang.Throwable -> L51
        L50:
            throw r3     // Catch: java.lang.Throwable -> L51
        L51:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L51
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.open(java.io.File):com.facebook.common.dextricks.ReentrantLockFile");
    }

    public Lock acquireInterruptubly(int i) throws Throwable {
        boolean z = false;
        boolean zA1L = AnonymousClass002.A1L(i & 1);
        assertMonitorLockNotHeld();
        try {
            synchronized (this) {
                boolean z2 = false;
                while (tryAcquire(i) == null) {
                    try {
                        if (!this.mLockInProgress && this.mLockShareCount == 0) {
                            if (!z2) {
                                addrefLocked();
                            }
                            try {
                                this.mLockInProgress = true;
                                try {
                                    try {
                                        try {
                                            FileChannel fileChannel = this.mChannel;
                                            if (fileChannel == null) {
                                                throw C3cG.A0Q("cannot acquire closed lock");
                                            }
                                            FileLock fileLockLock = fileChannel.lock(0L, LinkEncryptedPairingKt.LINK_COUNTER_MAX, zA1L);
                                            if (fileLockLock == null) {
                                                synchronized (this) {
                                                    try {
                                                        this.mLockInProgress = false;
                                                        notifyAll();
                                                    } finally {
                                                    }
                                                }
                                                close();
                                            }
                                            try {
                                                synchronized (this) {
                                                    try {
                                                        claimLock(i, fileLockLock);
                                                        this.mLockInProgress = false;
                                                        notifyAll();
                                                        return this.mLockHandle;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        z = true;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            close();
                                            throw th;
                                        }
                                    } catch (IOException e) {
                                        throw BV4.A0e(e);
                                    }
                                } catch (Throwable th4) {
                                    synchronized (this) {
                                        try {
                                            this.mLockInProgress = false;
                                            notifyAll();
                                            close();
                                            throw th4;
                                        } finally {
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                while (true) {
                                }
                            }
                        }
                        if (!z2) {
                            addrefLocked();
                            z2 = true;
                        }
                        wait();
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                Lock lock = this.mLockHandle;
                if (z2) {
                    close();
                }
                return lock;
            }
        } catch (Throwable th7) {
            th = th7;
            if (!z) {
                throw th;
            }
        }
    }

    public void donateLock(Thread thread) {
        Mlog.assertThat(AnonymousClass002.A1Z(this.mLockOwner, Thread.currentThread()), "caller must own lock exclusively", new Object[0]);
        this.mLockOwner = thread;
    }

    public Thread getExclusiveOwner() {
        return this.mLockOwner;
    }

    public void stealLock() {
        Mlog.assertThat(AnonymousClass002.A1X(this.mLockOwner), "cannot steal unowned lock", new Object[0]);
        this.mLockOwner = Thread.currentThread();
    }

    public ReentrantLockFile() {
        this.lockFileName = null;
        this.mLockHandle = null;
        this.mNext = this;
        this.mPrev = this;
    }

    private void assertMonitorLockNotHeld() {
        Mlog.assertThat(!Thread.holdsLock(this), "lock order violation", BV4.A1W());
    }

    public Lock acquire(int i) {
        try {
            return acquireInterruptubly(i);
        } catch (InterruptedException unused) {
            BV4.A1A();
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        assertMonitorLockNotHeld();
        synchronized (this) {
            if (this.mChannel != null) {
                int i = this.mReferenceCount;
                if (i <= 1) {
                    synchronized (ReentrantLockFile.class) {
                        synchronized (this) {
                            int i2 = this.mReferenceCount - 1;
                            this.mReferenceCount = i2;
                            if (i2 == 0) {
                                ReentrantLockFile reentrantLockFile = this.mPrev;
                                reentrantLockFile.getClass();
                                reentrantLockFile.mNext = this.mNext;
                                ReentrantLockFile reentrantLockFile2 = this.mNext;
                                reentrantLockFile2.getClass();
                                reentrantLockFile2.mPrev = this.mPrev;
                                this.mPrev = null;
                                this.mNext = null;
                                Fs.safeClose(this.mChannel);
                                this.mChannel = null;
                            }
                        }
                    }
                    return;
                }
                this.mReferenceCount = i - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void release() {
        /*
            r5 = this;
            r5.assertMonitorLockNotHeld()
            monitor-enter(r5)
            int r0 = r5.mLockShareCount     // Catch: java.lang.Throwable -> L52
            r4 = 1
            r3 = 0
            boolean r2 = X.AnonymousClass002.A1N(r0)
            java.lang.String r1 = "lock release balance"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L52
            com.facebook.common.dextricks.Mlog.assertThat(r2, r1, r0)     // Catch: java.lang.Throwable -> L52
            int r0 = r5.mLockFlags     // Catch: java.lang.Throwable -> L52
            r0 = r0 & 1
            if (r0 != 0) goto L22
            java.lang.Thread r1 = r5.mLockOwner     // Catch: java.lang.Throwable -> L52
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L52
            r2 = 0
            if (r1 != r0) goto L23
        L22:
            r2 = 1
        L23:
            java.lang.String r1 = "lock thread affinity"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L52
            com.facebook.common.dextricks.Mlog.assertThat(r2, r1, r0)     // Catch: java.lang.Throwable -> L52
            int r0 = r5.mLockShareCount     // Catch: java.lang.Throwable -> L52
            int r0 = r0 - r4
            r5.mLockShareCount = r0     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L40
            java.nio.channels.FileLock r0 = r5.mTheLock     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L52
            if (r0 == 0) goto L38
            r0.release()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L52
        L38:
            r0 = 0
            goto L42
        L3a:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.BV4.A0e(r0)     // Catch: java.lang.Throwable -> L52
            throw r0     // Catch: java.lang.Throwable -> L52
        L40:
            r4 = 0
            goto L4b
        L42:
            r5.mLockOwner = r0     // Catch: java.lang.Throwable -> L52
            r5.mTheLock = r0     // Catch: java.lang.Throwable -> L52
            r5.mLockFlags = r3     // Catch: java.lang.Throwable -> L52
            r5.notifyAll()     // Catch: java.lang.Throwable -> L52
        L4b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L51
            r5.close()
        L51:
            return
        L52:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L52
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.release():void");
    }

    public ReentrantLockFile(File file, FileChannel fileChannel) {
        this.lockFileName = file;
        this.mChannel = fileChannel;
        this.mReferenceCount = 1;
        this.mLockHandle = new Lock();
    }
}
