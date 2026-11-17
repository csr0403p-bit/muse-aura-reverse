package X;

/* renamed from: X.Dxl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6201Dxl {
    public int A00;
    public long A01;
    public Dy6 A02;
    public boolean A03;
    public boolean A04;
    public final String A05;
    public final /* synthetic */ C6199Dxj A06;

    public final boolean A02(Dy6 dy6, int i) {
        int i2;
        if (dy6 != null) {
            Dy6 dy62 = this.A02;
            if (dy62 == null) {
                if (!AnonymousClass002.A1P(dy6.A00, -1) && dy6.A03 == this.A01) {
                    return true;
                }
            } else if (dy6.A03 == dy62.A03 && dy6.A00 == dy62.A00) {
                i = dy6.A01;
                i2 = dy62.A01;
            }
        }
        i2 = this.A00;
        return i == i2;
    }

    public C6201Dxl(C6199Dxj c6199Dxj, Dy6 dy6, String str, int i) {
        this.A06 = c6199Dxj;
        this.A05 = str;
        this.A00 = i;
        this.A01 = dy6 == null ? -1L : dy6.A03;
        if (dy6 == null || !AnonymousClass002.A1P(dy6.A00, -1)) {
            return;
        }
        this.A02 = dy6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.Dy6 r10, int r11) {
        /*
            r9 = this;
            long r1 = r9.A01
            r7 = -1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L2a
            int r0 = r9.A00
            if (r11 != r0) goto L2a
            if (r10 == 0) goto L2a
            long r4 = r10.A03
            X.Dxj r6 = r9.A06
            java.util.HashMap<java.lang.String, X.Dxl> r1 = r6.A07
            java.lang.String r0 = r6.A03
            java.lang.Object r0 = r1.get(r0)
            X.Dxl r0 = (X.C6201Dxl) r0
            if (r0 == 0) goto L2b
            long r2 = r0.A01
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L2b
        L24:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L2a
            r9.A01 = r4
        L2a:
            return
        L2b:
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6201Dxl.A00(X.Dy6, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(X.C6202Dxm r12) {
        /*
            r11 = this;
            X.Dy6 r8 = r12.A09
            r10 = 1
            r9 = 0
            if (r8 != 0) goto Ld
            int r1 = r11.A00
            int r0 = r12.A01
            if (r1 == r0) goto L54
        Lc:
            return r10
        Ld:
            long r1 = r11.A01
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L54
            long r4 = r8.A03
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc
            X.Dy6 r7 = r11.A02
            if (r7 == 0) goto L54
            androidx.media3.common.Timeline r1 = r12.A07
            java.lang.Object r0 = r8.A04
            int r6 = r1.A06(r0)
            java.lang.Object r0 = r7.A04
            int r3 = r1.A06(r0)
            long r1 = r7.A03
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L54
            if (r6 < r3) goto L54
            if (r6 > r3) goto Lc
            int r2 = r8.A00
            r1 = -1
            boolean r0 = X.AnonymousClass002.A1P(r2, r1)
            if (r0 == 0) goto L4d
            int r0 = r8.A01
            int r1 = r7.A00
            if (r2 > r1) goto Lc
            if (r2 != r1) goto L54
            int r1 = r7.A01
        L4a:
            if (r0 <= r1) goto L54
            return r10
        L4d:
            int r0 = r8.A02
            if (r0 == r1) goto Lc
            int r1 = r7.A00
            goto L4a
        L54:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6201Dxl.A01(X.Dxm):boolean");
    }
}
