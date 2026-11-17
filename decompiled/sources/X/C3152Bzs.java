package X;

/* renamed from: X.Bzs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3152Bzs extends Thread {
    public static final String __redex_internal_original_name = "RetryOutOfThreadsThread";

    @Override // java.lang.Thread
    public final synchronized void start() {
        int i = 0;
        while (true) {
            try {
                super.start();
            } catch (OutOfMemoryError e) {
                if (isAlive()) {
                    throw e;
                }
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                if (!message.startsWith("pthread_create") || !message.endsWith("failed: Try again")) {
                    throw e;
                }
                if (i >= 3) {
                    OutOfMemoryError outOfMemoryError = new OutOfMemoryError(FGI.A0S(e.getMessage(), " JavaThreads:", Thread.activeCount()));
                    outOfMemoryError.initCause(e);
                    throw outOfMemoryError;
                }
                if (i > 0) {
                    try {
                        Thread.sleep(i * 500);
                    } catch (InterruptedException e2) {
                        throw BV4.A0e(e2);
                    }
                }
                i++;
            }
        }
    }
}
