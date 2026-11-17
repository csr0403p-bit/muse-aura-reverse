package com.facebook.aura.executors;

import X.C7384Etj;
import X.CFK;
import java.lang.Thread;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class CrashingExecutorPolicy {
    public static final CrashingExecutorPolicy INSTANCE = new CrashingExecutorPolicy();
    public static final String TAG = "CrashingExecutorPolicy";

    public final void crashIfAppropriate(Runnable runnable, Throwable th) {
        String string;
        C7384Etj.A0Y(runnable, 0);
        if (th == null) {
            if (!(runnable instanceof Future)) {
                return;
            }
            try {
                ((Future) runnable).get();
                return;
            } catch (InterruptedException e) {
                CFK.A0A(TAG, "Interrupted while getting future result", e);
                Thread.currentThread().interrupt();
                return;
            } catch (CancellationException unused) {
                return;
            } catch (ExecutionException e2) {
                th = e2.getCause();
                if (th == null) {
                    return;
                }
            }
        }
        if ((th instanceof Error) || (th instanceof RuntimeException)) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
                return;
            }
            string = "Received otherwise fatal exception, but no uncaught exception handler to fire!";
        } else {
            StringBuilder sb = new StringBuilder("Uncaught checked exception during ");
            sb.append(runnable);
            string = sb.toString();
        }
        CFK.A0J(TAG, th, string);
    }
}
