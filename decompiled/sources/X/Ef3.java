package X;

/* loaded from: classes5.dex */
public final class Ef3 implements Runnable {
    public static final String __redex_internal_original_name = "JobScheduler$1";
    public final /* synthetic */ C7051Eex A00;

    public Ef3(C7051Eex c7051Eex) {
        this.A00 = c7051Eex;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:11:0x0024, B:13:0x002a), top: B:28:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[DONT_GENERATE] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            X.Eex r6 = r6.A00
            long r4 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r6)
            X.Edo r3 = r6.A03     // Catch: java.lang.Throwable -> L42
            int r2 = r6.A00     // Catch: java.lang.Throwable -> L42
            r0 = 0
            r6.A03 = r0     // Catch: java.lang.Throwable -> L42
            r0 = 0
            r6.A00 = r0     // Catch: java.lang.Throwable -> L42
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.Throwable -> L42
            r6.A04 = r0     // Catch: java.lang.Throwable -> L42
            r6.A01 = r4     // Catch: java.lang.Throwable -> L42
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L42
            r1 = 1
            r0 = r2 & 1
            if (r0 == r1) goto L2a
            r1 = 4
            r0 = r2 & 4
            if (r0 == r1) goto L2a
            if (r3 == 0) goto L34
            boolean r0 = r3.A09()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L31
        L2a:
            X.EfU r0 = r6.A05     // Catch: java.lang.Throwable -> L38
            r0.Abs(r3, r2)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L34
        L31:
            r3.close()
        L34:
            X.C7051Eex.A01(r6)
            return
        L38:
            r0 = move-exception
            if (r3 == 0) goto L3e
            r3.close()
        L3e:
            X.C7051Eex.A01(r6)
            throw r0
        L42:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ef3.run():void");
    }
}
