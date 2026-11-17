package org.webrtc;

import X.BV4;
import X.BV5;
import X.BV7;
import X.C3cG;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class ThreadUtils {

    /* renamed from: org.webrtc.ThreadUtils$1CaughtException, reason: invalid class name */
    public class C1CaughtException {
        public Exception e;
    }

    /* renamed from: org.webrtc.ThreadUtils$1Result, reason: invalid class name */
    public class C1Result {
        public V value;
    }

    public interface BlockingOperation {
        void run();
    }

    public class ThreadChecker {
        public Thread thread = Thread.currentThread();

        public void detachThread() {
            this.thread = null;
        }

        public void checkIsOnValidThread() {
            Thread threadCurrentThread = this.thread;
            if (threadCurrentThread == null) {
                threadCurrentThread = Thread.currentThread();
                this.thread = threadCurrentThread;
            }
            if (Thread.currentThread() != threadCurrentThread) {
                throw C3cG.A0Q("Wrong thread");
            }
        }
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int length = stackTraceElementArr.length;
        int length2 = stackTraceElementArr2.length;
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[length + length2];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, length, length2);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                BV7.A1N(z);
                return;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.2
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.1
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                thread.join();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != BV5.A0s()) {
            throw C3cG.A0Q("Not on main thread!");
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (BV7.A13(handler) == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw BV4.A0e(e);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatchA16 = BV5.A16();
        handler.post(new Runnable() { // from class: org.webrtc.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r0v3, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c1Result.value = callable.call();
                } catch (Exception e2) {
                    c1CaughtException.e = e2;
                }
                countDownLatchA16.countDown();
            }
        });
        awaitUninterruptibly(countDownLatchA16);
        Exception exc = c1CaughtException.e;
        if (exc == null) {
            return c1Result.value;
        }
        RuntimeException runtimeExceptionA0e = BV4.A0e(exc);
        runtimeExceptionA0e.setStackTrace(concatStackTraces(c1CaughtException.e.getStackTrace(), runtimeExceptionA0e.getStackTrace()));
        throw runtimeExceptionA0e;
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) throws InterruptedException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zAwait = false;
        long jA04 = j;
        boolean z = false;
        while (true) {
            try {
                zAwait = countDownLatch.await(jA04, TimeUnit.MILLISECONDS);
                if (z) {
                }
            } catch (InterruptedException unused) {
                jA04 = j - C3cG.A04(jElapsedRealtime);
                z = true;
                if (jA04 <= 0) {
                    break;
                }
            }
        }
        BV4.A1A();
        return zAwait;
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: org.webrtc.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Void call() {
                runnable.run();
                return null;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: call, reason: avoid collision after fix types in other method */
            public Void call2() {
                runnable.run();
                return null;
            }
        });
    }

    public static boolean joinUninterruptibly(Thread thread, long j) throws InterruptedException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long jA04 = j;
        while (jA04 > 0) {
            try {
                thread.join(jA04);
                break;
            } catch (InterruptedException unused) {
                jA04 = j - C3cG.A04(jElapsedRealtime);
                z = true;
            }
        }
        BV7.A1N(z);
        return !thread.isAlive();
    }
}
