package X;

/* loaded from: classes5.dex */
public final class EHm {
    public final C6573EHp A00;
    public final C6575EHt A01;
    public final EHg A02;

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.EHl r9) {
        /*
            r8 = this;
            X.EHo r7 = r9.A01
            if (r7 == 0) goto L43
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L43
            X.EHg r5 = r8.A02
            monitor-enter(r5)
            X.EHo r6 = r5.A00()     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L19
            long r3 = r7.A00     // Catch: java.lang.Throwable -> L40
            long r1 = r6.A00     // Catch: java.lang.Throwable -> L40
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1c
        L19:
            r5.A01(r7)     // Catch: java.lang.Throwable -> L40
        L1c:
            monitor-exit(r5)
            if (r6 == 0) goto L3d
            X.EHo r5 = r9.A01
            long r3 = r5.A00
            long r1 = r6.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L3d
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L3a
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r6.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3a
            java.lang.Integer r0 = X.C79.A0T
            goto L45
        L3a:
            java.lang.Integer r0 = X.C79.A0Z
            goto L45
        L3d:
            java.lang.Integer r0 = X.C79.A0W
            goto L45
        L40:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L40
            throw r0
        L43:
            java.lang.Integer r0 = X.C79.A0P
        L45:
            r9.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EHm.A00(X.EHl):void");
    }

    public EHm(C6575EHt c6575EHt, C6573EHp c6573EHp, EHg eHg) {
        this.A02 = eHg;
        this.A00 = c6573EHp;
        this.A01 = c6575EHt;
    }
}
