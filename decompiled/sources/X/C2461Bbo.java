package X;

/* renamed from: X.Bbo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2461Bbo {
    public final int A00;
    public final int A01;
    public final C6154Dwx A02;
    public final C6154Dwx A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C2461Bbo c2461Bbo = (C2461Bbo) obj;
                if (this.A01 != c2461Bbo.A01 || this.A00 != c2461Bbo.A00 || !this.A04.equals(c2461Bbo.A04) || !this.A03.equals(c2461Bbo.A03) || !this.A02.equals(c2461Bbo.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0I(this.A04, (((527 + this.A01) * 31) + this.A00) * 31)));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2461Bbo(X.C6154Dwx r2, X.C6154Dwx r3, java.lang.String r4, int r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            if (r5 == 0) goto L8
            r0 = 0
            if (r6 != 0) goto L9
        L8:
            r0 = 1
        L9:
            X.C1G.A07(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L20
            r1.A04 = r4
            r2.getClass()
            r1.A03 = r2
            r1.A02 = r3
            r1.A01 = r5
            r1.A00 = r6
            return
        L20:
            java.lang.IllegalArgumentException r0 = X.BV4.A0P()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2461Bbo.<init>(X.Dwx, X.Dwx, java.lang.String, int, int):void");
    }
}
