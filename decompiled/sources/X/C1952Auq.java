package X;

/* renamed from: X.Auq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1952Auq extends Ab8<C1945Auj> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C1DN A03;
    public final C1822Arm A04;
    public final C2K7 A05;
    public final String A06;
    public final boolean A07;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1952Auq) {
                C1952Auq c1952Auq = (C1952Auq) obj;
                if (!C7384Etj.areEqual(this.A03, c1952Auq.A03) || !C7384Etj.areEqual(this.A06, c1952Auq.A06) || !C7384Etj.areEqual(this.A04, c1952Auq.A04) || !C7384Etj.areEqual(this.A05, c1952Auq.A05) || this.A02 != c1952Auq.A02 || this.A07 != c1952Auq.A07 || this.A00 != c1952Auq.A00 || this.A01 != c1952Auq.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        String str = this.A06;
        C1822Arm c1822Arm = this.A04;
        C2K7 c2k7 = this.A05;
        int i = this.A02;
        boolean z = this.A07;
        int i2 = this.A00;
        int i3 = this.A01;
        C1DN c1dn = this.A03;
        C1945Auj c1945Auj = new C1945Auj();
        c1945Auj.A08 = str;
        c1945Auj.A06 = c1822Arm;
        c1945Auj.A07 = c2k7;
        c1945Auj.A02 = i;
        c1945Auj.A0A = z;
        c1945Auj.A00 = i2;
        c1945Auj.A01 = i3;
        c1945Auj.A04 = c1dn;
        return c1945Auj;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return ((((C0KA.A01((AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A04, AnonymousClass001.A0G(this.A06))) + this.A02) * 31, this.A07) + this.A00) * 31) + this.A01) * 31) + C60R.A01(this.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    @Override // X.Ab8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void update(X.AbstractC1439Aj8 r11) {
        /*
            r10 = this;
            X.Auj r11 = (X.C1945Auj) r11
            X.1DN r1 = r10.A03
            X.Arm r8 = r10.A04
            X.1DN r0 = r11.A04
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            r11.A04 = r1
            if (r0 == 0) goto La3
            X.Arm r0 = r11.A06
            if (r8 == r0) goto L1e
            X.Aro r1 = r8.A02
            X.Aro r0 = r0.A02
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto La3
        L1e:
            r9 = 0
        L1f:
            java.lang.String r1 = r10.A06
            java.lang.String r0 = r11.A08
            boolean r0 = X.C7384Etj.areEqual(r0, r1)
            if (r0 == 0) goto L9c
            r7 = 0
        L2a:
            int r6 = r10.A01
            int r5 = r10.A00
            boolean r4 = r10.A07
            X.2K7 r2 = r10.A05
            int r1 = r10.A02
            X.Arm r0 = r11.A06
            boolean r0 = r0.A03(r8)
            r3 = r0 ^ 1
            r11.A06 = r8
            int r0 = r11.A01
            if (r0 == r6) goto L45
            r11.A01 = r6
            r3 = 1
        L45:
            int r0 = r11.A00
            if (r0 == r5) goto L4c
            r11.A00 = r5
            r3 = 1
        L4c:
            boolean r0 = r11.A0A
            if (r0 == r4) goto L53
            r11.A0A = r4
            r3 = 1
        L53:
            X.2K7 r0 = r11.A07
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 != 0) goto L5e
            r11.A07 = r2
            r3 = 1
        L5e:
            int r0 = r11.A02
            if (r0 == r1) goto L65
            r11.A02 = r1
            r3 = 1
        L65:
            if (r9 != 0) goto L6b
            if (r7 != 0) goto L6b
            if (r3 == 0) goto L7d
        L6b:
            r0 = 0
            r11.A05 = r0
            if (r7 != 0) goto L72
            if (r3 == 0) goto L7d
        L72:
            X.Aum r2 = X.C1945Auj.A00(r11)
            java.lang.String r1 = r11.A08
            X.Arm r0 = r11.A06
            X.AbstractC1439Aj8.A0H(r2, r11, r0, r1)
        L7d:
            boolean r0 = r11.isAttached
            if (r0 == 0) goto L9b
            if (r7 != 0) goto L89
            if (r9 == 0) goto L8e
            X.G0U<? super java.util.List<X.Aux>, java.lang.Boolean> r0 = r11.A09
            if (r0 == 0) goto L8e
        L89:
            X.AaW.A00(r11)
            if (r7 != 0) goto L90
        L8e:
            if (r3 == 0) goto L96
        L90:
            X.AbstractC1339AhQ.A00(r11)
            X.AaD.A00(r11)
        L96:
            if (r9 == 0) goto L9b
            X.AaD.A00(r11)
        L9b:
            return
        L9c:
            r11.A08 = r1
            r0 = 0
            r11.A03 = r0
            r7 = 1
            goto L2a
        La3:
            r9 = 1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1952Auq.update(X.Aj8):void");
    }

    public C1952Auq(C1DN c1dn, C1822Arm c1822Arm, C2K7 c2k7, String str, int i, int i2, int i3, boolean z) {
        this.A06 = str;
        this.A04 = c1822Arm;
        this.A05 = c2k7;
        this.A02 = i;
        this.A07 = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = c1dn;
    }
}
