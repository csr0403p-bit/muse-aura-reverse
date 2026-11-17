package X;

/* loaded from: classes5.dex */
public final class C3C implements InterfaceC3204C3e {
    public final C2W A00;
    public final int A01;
    public final C3B A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // X.InterfaceC3204C3e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AZs(java.lang.UnsatisfiedLinkError r6, X.C3g[] r7) {
        /*
            r5 = this;
            X.C3B r0 = r5.A02
            android.content.Context r0 = r0.A00
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo()
            java.lang.String r1 = r4.sourceDir
            boolean r0 = X.BV5.A1V(r1)
            if (r0 == 0) goto L19
            X.C2W r0 = r5.A00
            boolean r1 = r0.A01(r1)
            r0 = 1
            if (r1 != 0) goto L1a
        L19:
            r0 = 0
        L1a:
            r3 = 1
            if (r0 == 0) goto L32
            r2 = 0
        L1e:
            int r0 = r7.length
            if (r2 >= r0) goto L44
            r1 = r7[r2]
            boolean r0 = r1 instanceof X.C3F
            if (r0 == 0) goto L2f
            X.C3F r1 = (X.C3F) r1
            X.C3g r0 = r1.AZr(r4)
            r7[r2] = r0
        L2f:
            int r2 = r2 + 1
            goto L1e
        L32:
            int r2 = r5.A01
            X.C2W r1 = r5.A00
            monitor-enter(r1)
            int r0 = r1.A00     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            if (r2 == r0) goto L45
            java.lang.String r1 = "soloader.recovery.DetectDataAppMove"
            java.lang.String r0 = "Context was updated (perhaps by another thread)"
            android.util.Log.w(r1, r0)
        L44:
            return r3
        L45:
            r3 = 0
            return r3
        L47:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3C.AZs(java.lang.UnsatisfiedLinkError, X.C3g[]):boolean");
    }

    public C3C(C3B c3b, C2W c2w) {
        int i;
        this.A00 = c2w;
        synchronized (c2w) {
            i = c2w.A00;
        }
        this.A01 = i;
        this.A02 = c3b;
    }
}
