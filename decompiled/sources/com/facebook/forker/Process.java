package com.facebook.forker;

import X.BV5;
import X.BV6;
import X.BV7;
import X.ETi;
import X.FGI;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.facebook.acra.util.JavaProcFileReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class Process extends java.lang.Process implements Closeable {
    public static final int FD_STREAM_INPUT = 0;
    public static final int FD_STREAM_OUTPUT = 1;
    public static final int IGNORE_FD = -1;
    public static final int SD_BLACK_HOLE = -3;
    public static final int SD_INHERIT = -2;
    public static final int SD_PIPE = -4;
    public static final int SD_STDOUT = -5;
    public static final int SIGCONT = 18;
    public static final int SIGKILL = 9;
    public static final int SIGSTOP = 19;
    public static final int SIGTERM = 15;
    public static final int SIGTSTP = 20;
    public static final int STATUS_EXITED = 4;
    public static final int STATUS_RUNNING = 1;
    public static final int STATUS_STOPPED = 2;
    public static final int STDERR = 2;
    public static final int STDIN = 0;
    public static final int STDOUT = 1;
    public static final String TAG = "fb-Process";
    public static final int WAIT_RESULT_RUNNING = -2147483646;
    public static final int WAIT_RESULT_STOPPED = -2147483647;
    public static final int WAIT_RESULT_TIMEOUT = Integer.MIN_VALUE;
    public InputStream mChildStderr;
    public OutputStream mChildStdin;
    public InputStream mChildStdout;
    public int mExitStatus;
    public int mPid;
    public int mProcessStatus;
    public WaiterThread mWaiterThread = new WaiterThread();

    public final class WaiterThread extends Thread {
        public WaiterThread() {
            super("PidWaiter:Ready");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.this.nativeWait();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Process(java.lang.String r16, java.lang.String[] r17, byte[] r18, int[] r19, int[] r20, java.io.File r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.<init>(java.lang.String, java.lang.String[], byte[], int[], int[], java.io.File):void");
    }

    private native void nativeKill(int i);

    private native int nativeLaunch(String str, String[] strArr, byte[] bArr, int[] iArr, int[] iArr2);

    public static native void nativeUnixClose(int i);

    public static native int nativeUnixCreateTmpFile(String str);

    public static native int nativeUnixOpen(String str);

    public static native int[] nativeUnixPipe(int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeWait();

    @Override // java.lang.Process
    public synchronized int waitFor() {
        while (this.mProcessStatus != 4) {
            wait();
        }
        return exitValue();
    }

    public int waitForUninterruptibly() throws InterruptedException {
        boolean z = false;
        while (true) {
            try {
                int iWaitFor = waitFor();
                BV7.A1N(z);
                return iWaitFor;
            } catch (InterruptedException unused) {
                Thread.interrupted();
                z = true;
            }
        }
    }

    static {
        ETi.loadLibrary("forker");
    }

    public static String fdMagicName(int i) {
        return FGI.A0Z("/proc/", "/task/", JavaProcFileReader.FD_DIR_STRING, android.os.Process.myPid(), android.os.Process.myTid(), i);
    }

    public static void safeClose(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.d(TAG, "suppressing close error", e);
            }
        }
    }

    public static void unixClose(int[] iArr) {
        if (iArr != null) {
            for (int i : iArr) {
                unixClose(i);
            }
        }
    }

    @Override // java.lang.Process
    public void destroy() throws InterruptedException {
        nativeKill(9);
        boolean z = false;
        while (true) {
            try {
                this.mWaiterThread.join();
                synchronized (this) {
                    safeClose(this.mChildStdin);
                    safeClose(this.mChildStdout);
                    safeClose(this.mChildStderr);
                }
                BV7.A1N(z);
                return;
            } catch (InterruptedException unused) {
                Thread.interrupted();
                z = true;
            }
        }
    }

    public synchronized int exitValueEx() {
        if (this.mProcessStatus != 4) {
            throw new IllegalThreadStateException(FGI.A0H("Process has not yet terminated: ", this.mPid));
        }
        return this.mExitStatus;
    }

    @Override // java.lang.Process
    public InputStream getErrorStream() {
        return this.mChildStderr;
    }

    @Override // java.lang.Process
    public InputStream getInputStream() {
        return this.mChildStdout;
    }

    @Override // java.lang.Process
    public OutputStream getOutputStream() {
        return this.mChildStdin;
    }

    public int getPid() {
        return this.mPid;
    }

    public static Object openFdStream(int i, int i2) throws IOException {
        String strFdMagicName = fdMagicName(i);
        try {
            return i2 == 0 ? new FileInputStream(strFdMagicName) : new FileOutputStream(strFdMagicName);
        } catch (FileNotFoundException unused) {
            ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(i);
            return i2 == 0 ? new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorFromFd) : new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorFromFd);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        destroy();
    }

    @Override // java.lang.Process
    public int exitValue() {
        int iExitValueEx = exitValueEx();
        return iExitValueEx < 0 ? (-iExitValueEx) + 128 : iExitValueEx;
    }

    public void kill(int i) {
        nativeKill(i);
    }

    public static void unixClose(int i) {
        if (i != -1) {
            nativeUnixClose(i);
        }
    }

    public synchronized int waitFor(int i, int i2) {
        while (true) {
            int i3 = this.mProcessStatus;
            if ((i3 & i2) == 0) {
                if (i3 != 4) {
                    if (i == 0) {
                        break;
                    }
                    if (i > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        wait(i);
                        long jMax = Math.max(0L, System.currentTimeMillis() - jCurrentTimeMillis);
                        if (i < jMax) {
                            i = 0;
                        } else {
                            i -= (int) jMax;
                        }
                    } else {
                        wait();
                    }
                } else if (i != 0) {
                    throw BV5.A0g("process entered unexpected state ", 4);
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 4) {
                            return this.mExitStatus;
                        }
                        throw BV6.A0f();
                    }
                    return WAIT_RESULT_STOPPED;
                }
                return WAIT_RESULT_RUNNING;
            }
        }
        return Integer.MIN_VALUE;
    }

    public int waitForUninterruptibly(int i, int i2) {
        long jCurrentTimeMillis = 0;
        boolean z = false;
        int iWaitFor = Integer.MIN_VALUE;
        do {
            if (i > 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            try {
                iWaitFor = waitFor(i, i2);
            } catch (InterruptedException unused) {
                Thread.interrupted();
                z = true;
            }
            if (iWaitFor != Integer.MIN_VALUE) {
                break;
            }
            if (i > 0) {
                long jMax = Math.max(0L, System.currentTimeMillis() - jCurrentTimeMillis);
                if (i < jMax) {
                    break;
                }
                i -= (int) jMax;
            }
        } while (i != 0);
        BV7.A1N(z);
        return iWaitFor;
    }
}
