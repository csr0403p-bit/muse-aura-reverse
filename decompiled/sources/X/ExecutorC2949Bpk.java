package X;

import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: X.Bpk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC2949Bpk implements Executor {
    public final Executor A04;
    public final Deque<Runnable> A02 = BV4.A0s();
    public final RunnableC2948Bpj A03 = new RunnableC2948Bpj(this);
    public Integer A01 = C79.A00;
    public long A00 = 0;

    public ExecutorC2949Bpk(Executor executor) {
        executor.getClass();
        this.A04 = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void execute(java.lang.Runnable r10) {
        /*
            r9 = this;
            r10.getClass()
            java.util.Deque<java.lang.Runnable> r5 = r9.A02
            monitor-enter(r5)
            java.lang.Integer r1 = r9.A01     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> L5f
            if (r1 == r0) goto L5a
            java.lang.Integer r8 = X.C79.A0C     // Catch: java.lang.Throwable -> L5f
            if (r1 == r8) goto L5a
            long r3 = r9.A00     // Catch: java.lang.Throwable -> L5f
            X.Bpl r7 = new X.Bpl     // Catch: java.lang.Throwable -> L5f
            r7.<init>(r9, r10)     // Catch: java.lang.Throwable -> L5f
            r5.add(r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r6 = X.C79.A01     // Catch: java.lang.Throwable -> L5f
            r9.A01 = r6     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.Executor r1 = r9.A04     // Catch: java.lang.Throwable -> L3c
            X.Bpj r0 = r9.A03     // Catch: java.lang.Throwable -> L3c
            r1.execute(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r0 = r9.A01
            if (r0 != r6) goto L5e
            monitor-enter(r5)
            long r1 = r9.A00     // Catch: java.lang.Throwable -> L39
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L37
            java.lang.Integer r0 = r9.A01     // Catch: java.lang.Throwable -> L39
            if (r0 != r6) goto L37
            r9.A01 = r8     // Catch: java.lang.Throwable -> L39
        L37:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L39
            throw r0
        L3c:
            r2 = move-exception
            monitor-enter(r5)
            java.lang.Integer r1 = r9.A01     // Catch: java.lang.Throwable -> L57
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> L57
            if (r1 == r0) goto L46
            if (r1 != r6) goto L4d
        L46:
            boolean r0 = r5.removeLastOccurrence(r7)     // Catch: java.lang.Throwable -> L57
            r1 = 1
            if (r0 != 0) goto L4e
        L4d:
            r1 = 0
        L4e:
            boolean r0 = r2 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L56
            if (r1 != 0) goto L56
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L57
            return
        L56:
            throw r2     // Catch: java.lang.Throwable -> L57
        L57:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L57
            throw r0
        L5a:
            r5.add(r10)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
        L5e:
            return
        L5f:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ExecutorC2949Bpk.execute(java.lang.Runnable):void");
    }
}
