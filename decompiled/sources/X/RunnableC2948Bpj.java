package X;

/* renamed from: X.Bpj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC2948Bpj implements Runnable {
    public static final String __redex_internal_original_name = "SequentialExecutor$QueueWorker";
    public final /* synthetic */ ExecutorC2949Bpk A00;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:35:0x005e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0021 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            r8 = 0
            r7 = 0
        L2:
            X.Bpk r6 = r9.A00     // Catch: java.lang.Throwable -> L4b
            java.util.Deque<java.lang.Runnable> r5 = r6.A02     // Catch: java.lang.Throwable -> L4b
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4b
            if (r8 != 0) goto L19
            java.lang.Integer r0 = r6.A01     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r4 = X.C79.A0K     // Catch: java.lang.Throwable -> L48
            if (r0 == r4) goto L25
            long r2 = r6.A00     // Catch: java.lang.Throwable -> L48
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2     // Catch: java.lang.Throwable -> L48
            r6.A01 = r4     // Catch: java.lang.Throwable -> L48
            r8 = 1
        L19:
            java.lang.Object r4 = r5.poll()     // Catch: java.lang.Throwable -> L48
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L27
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> L48
            r6.A01 = r0     // Catch: java.lang.Throwable -> L48
        L25:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            goto L42
        L27:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4b
            r7 = r7 | r0
            r4.run()     // Catch: java.lang.RuntimeException -> L31 java.lang.Throwable -> L4b
            goto L2
        L31:
            r3 = move-exception
            java.lang.String r2 = "SequentialExecutor"
            java.lang.StringBuilder r1 = X.C60O.A0w()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = "Exception while executing runnable "
            java.lang.String r0 = X.AnonymousClass006.A0y(r4, r0, r1)     // Catch: java.lang.Throwable -> L4b
            X.AbstractC2875Bni.A05(r2, r0, r3)     // Catch: java.lang.Throwable -> L4b
            goto L2
        L42:
            if (r7 == 0) goto L47
            X.BV4.A1A()     // Catch: java.lang.Error -> L52
        L47:
            return
        L48:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            if (r7 == 0) goto L51
            X.BV4.A1A()     // Catch: java.lang.Error -> L52
        L51:
            throw r0     // Catch: java.lang.Error -> L52
        L52:
            r3 = move-exception
            X.Bpk r2 = r9.A00
            java.util.Deque<java.lang.Runnable> r1 = r2.A02
            monitor-enter(r1)
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> L5e
            r2.A01 = r0     // Catch: java.lang.Throwable -> L5e
        L5c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r3 = move-exception
            goto L5c
        L60:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2948Bpj.run():void");
    }

    public RunnableC2948Bpj(ExecutorC2949Bpk executorC2949Bpk) {
        this.A00 = executorC2949Bpk;
    }
}
