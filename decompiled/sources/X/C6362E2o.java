package X;

/* renamed from: X.E2o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6362E2o implements E5D {
    public final int A00;
    public final int A01;
    public final E1P A02;

    @Override // X.E5D
    public final int AFk() {
        return this.A00;
    }

    @Override // X.E5D
    public final int AJt() {
        return this.A01;
    }

    @Override // X.E5D
    public final int AZQ() {
        int i = this.A00;
        return i == -1 ? this.A02.A0C() : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6362E2o(X.C6154Dwx r6, X.C6419E4v r7) {
        /*
            r5 = this;
            r5.<init>()
            X.E1P r4 = r7.A00
            r5.A02 = r4
            r0 = 12
            int r3 = X.BV6.A04(r4, r0)
            java.lang.String r0 = "audio/raw"
            boolean r0 = X.BV6.A1W(r6, r0)
            if (r0 == 0) goto L32
            int r1 = r6.A0H
            int r0 = r6.A06
            int r2 = androidx.media3.common.util.Util.A01(r1)
            int r2 = r2 * r0
            if (r3 == 0) goto L24
            int r0 = r3 % r2
            if (r0 == 0) goto L35
        L24:
            java.lang.String r1 = "Audio sample size mismatch. stsd sample size: "
            java.lang.String r0 = ", stsz sample size: "
            java.lang.String r1 = X.FGI.A0T(r1, r0, r2, r3)
            java.lang.String r0 = "BoxParsers"
            X.CNC.A04(r0, r1)
            r3 = r2
        L32:
            if (r3 != 0) goto L35
            r3 = -1
        L35:
            r5.A00 = r3
            int r0 = r4.A0C()
            r5.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6362E2o.<init>(X.Dwx, X.E4v):void");
    }
}
