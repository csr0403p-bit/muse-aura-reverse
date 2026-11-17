package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.FXe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8162FXe {
    public static final F0C A00;
    public static final F0C A01;

    static {
        Integer num = C79.A00;
        A01 = AbstractC5321DgF.A00(num, 23);
        A00 = AbstractC5321DgF.A00(num, 22);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T A00(java.util.concurrent.Future<T> r7, int r8) throws java.lang.Throwable {
        /*
            java.lang.String r5 = ", "
            java.lang.String r4 = "Unable to restore priority: "
            int r0 = android.os.Process.myTid()
            r6 = 1
            r3 = 0
            boolean r2 = X.AnonymousClass002.A1P(r8, r0)
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L17
            r1 = 1
            if (r2 != 0) goto L18
        L17:
            r1 = 0
        L18:
            boolean r0 = A03()
            if (r0 == 0) goto L36
            if (r1 == 0) goto L36
            int r0 = android.os.Process.myTid()
            int r1 = android.os.Process.getThreadPriority(r0)
            int r3 = android.os.Process.getThreadPriority(r8)
            r0 = r1
        L2d:
            if (r1 >= r3) goto L37
            android.os.Process.setThreadPriority(r8, r0)     // Catch: java.lang.SecurityException -> L33
            goto L37
        L33:
            int r0 = r0 + 1
            goto L2d
        L36:
            r6 = 0
        L37:
            java.lang.Object r0 = r7.get()     // Catch: java.util.concurrent.CancellationException -> L56 java.lang.InterruptedException -> L60 java.util.concurrent.ExecutionException -> L62 java.lang.Throwable -> L7d
            if (r6 == 0) goto L55
            android.os.Process.setThreadPriority(r8, r3)     // Catch: java.lang.SecurityException -> L41 java.lang.IllegalArgumentException -> L4b
            return r0
        L41:
            r1 = move-exception
            java.lang.String r0 = X.FGI.A0T(r4, r5, r8, r3)
            java.lang.RuntimeException r0 = X.BV4.A0d(r0, r1)
            throw r0
        L4b:
            r1 = move-exception
            java.lang.String r0 = X.FGI.A0T(r4, r5, r8, r3)
            java.lang.RuntimeException r0 = X.BV4.A0d(r0, r1)
            throw r0
        L55:
            return r0
        L56:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L7d
            java.lang.RuntimeException r2 = X.BV4.A0d(r0, r1)     // Catch: java.lang.Throwable -> L7d
            goto L7c
        L60:
            r1 = move-exception
            goto L74
        L62:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7c
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L7d
            java.lang.RuntimeException r2 = X.BV4.A0d(r0, r1)     // Catch: java.lang.Throwable -> L7d
            goto L7c
        L74:
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L7d
            java.lang.RuntimeException r2 = X.BV4.A0d(r0, r1)     // Catch: java.lang.Throwable -> L7d
        L7c:
            throw r2     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            if (r6 == 0) goto L98
            android.os.Process.setThreadPriority(r8, r3)     // Catch: java.lang.SecurityException -> L84 java.lang.IllegalArgumentException -> L8e
            throw r0
        L84:
            r1 = move-exception
            java.lang.String r0 = X.FGI.A0T(r4, r5, r8, r3)
            java.lang.RuntimeException r0 = X.BV4.A0d(r0, r1)
            throw r0
        L8e:
            r1 = move-exception
            java.lang.String r0 = X.FGI.A0T(r4, r5, r8, r3)
            java.lang.RuntimeException r0 = X.BV4.A0d(r0, r1)
            throw r0
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8162FXe.A00(java.util.concurrent.Future, int):java.lang.Object");
    }

    public static final void A01(Runnable runnable) {
        if (A03()) {
            runnable.run();
        } else {
            ((Handler) A01.getValue()).post(runnable);
        }
    }

    public static final void A02(String str) {
        if (A03()) {
            return;
        }
        if (str == null) {
            str = FGI.A0M("This must run on the main thread; but is running on ", Thread.currentThread().getName());
        }
        throw C3cG.A0Q(str);
    }

    public static final boolean A03() {
        return AnonymousClass002.A1Z(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
