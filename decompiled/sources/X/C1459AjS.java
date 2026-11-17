package X;

/* renamed from: X.AjS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1459AjS {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C1455AjO A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final C1453AjM A0F;
    public Integer A05 = C79.A0P;
    public final C1454AjN A0G = new C1454AjN(this);

    public static final void A00(C1459AjS c1459AjS, int i) {
        C1453AjM c1453AjMA0E;
        C1459AjS c1459AjS2;
        int i2 = c1459AjS.A01;
        c1459AjS.A01 = i;
        if (AnonymousClass002.A1M(i2) == (i == 0) || (c1453AjMA0E = c1459AjS.A0F.A0E()) == null || (c1459AjS2 = c1453AjMA0E.A0d) == null) {
            return;
        }
        int i3 = c1459AjS2.A01;
        int i4 = i3 + 1;
        if (i == 0) {
            i4 = i3 - 1;
        }
        A00(c1459AjS2, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r3 = this;
            X.AjM r0 = r3.A0F
            X.AjS r0 = r0.A0d
            java.lang.Integer r2 = r0.A05
            java.lang.Integer r0 = X.C79.A0C
            r1 = 1
            if (r2 == r0) goto Lf
            java.lang.Integer r0 = X.C79.A0K
            if (r2 != r0) goto L26
        Lf:
            X.AjN r0 = r3.A0G
            boolean r0 = r0.A0I
            if (r0 == 0) goto L4d
            boolean r0 = r3.A07
            if (r0 == r1) goto L26
            r3.A07 = r1
            boolean r0 = r3.A06
        L1d:
            if (r0 != 0) goto L26
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A03(r0)
        L26:
            java.lang.Integer r0 = X.C79.A0K
            if (r2 != r0) goto L43
            X.AjO r0 = r3.A04
            if (r0 == 0) goto L44
            boolean r0 = r0.A0C
            if (r0 != r1) goto L44
            boolean r0 = r3.A0B
            if (r0 == r1) goto L43
            r3.A0B = r1
            boolean r0 = r3.A0A
        L3a:
            if (r0 != 0) goto L43
            int r0 = r3.A01
            int r0 = r0 + 1
            A00(r3, r0)
        L43:
            return
        L44:
            boolean r0 = r3.A0A
            if (r0 == r1) goto L43
            r3.A0A = r1
            boolean r0 = r3.A0B
            goto L3a
        L4d:
            boolean r0 = r3.A06
            if (r0 == r1) goto L26
            r3.A06 = r1
            boolean r0 = r3.A07
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459AjS.A01():void");
    }

    public final void A02() {
        C1454AjN c1454AjN = this.A0G;
        if ((c1454AjN.A0B != null || c1454AjN.A0T.A0F.A0f.A04.AIX() != null) && c1454AjN.A0O) {
            c1454AjN.A0O = false;
            c1454AjN.A0B = c1454AjN.A0T.A0F.A0f.A04.AIX();
            C1453AjM c1453AjMA0E = this.A0F.A0E();
            if (c1453AjMA0E != null) {
                C1453AjM.A0B(c1453AjMA0E, false, true, true);
            }
        }
        C1455AjO c1455AjO = this.A04;
        if (c1455AjO != null) {
            if (c1455AjO.A08 == null) {
                AbstractC1383AiD abstractC1383AiDA0l = c1455AjO.A0K.A0F.A0f.A04.A0l();
                C7384Etj.A0X(abstractC1383AiDA0l);
                if (abstractC1383AiDA0l.AIX() == null) {
                    return;
                }
            }
            if (c1455AjO.A0E) {
                c1455AjO.A0E = false;
                AbstractC1383AiD abstractC1383AiDA0l2 = c1455AjO.A0K.A0F.A0f.A04.A0l();
                C7384Etj.A0X(abstractC1383AiDA0l2);
                c1455AjO.A08 = abstractC1383AiDA0l2.AIX();
                C1453AjM c1453AjM = this.A0F;
                if (AbstractC1475Aji.A00(c1453AjM)) {
                    C1453AjM c1453AjMA0E2 = c1453AjM.A0E();
                    if (c1453AjMA0E2 != null) {
                        C1453AjM.A0B(c1453AjMA0E2, false, true, true);
                        return;
                    }
                    return;
                }
                C1453AjM c1453AjMA0E3 = c1453AjM.A0E();
                if (c1453AjMA0E3 != null) {
                    C1453AjM.A0A(c1453AjMA0E3, false, true, true);
                }
            }
        }
    }

    public final void A03(int i) {
        C1453AjM c1453AjMA0E;
        C1459AjS c1459AjS;
        int i2 = this.A00;
        this.A00 = i;
        if (AnonymousClass002.A1M(i2) == (i == 0) || (c1453AjMA0E = this.A0F.A0E()) == null || (c1459AjS = c1453AjMA0E.A0d) == null) {
            return;
        }
        int i3 = c1459AjS.A00;
        int i4 = i3 + 1;
        if (i == 0) {
            i4 = i3 - 1;
        }
        c1459AjS.A03(i4);
    }

    public C1459AjS(C1453AjM c1453AjM) {
        this.A0F = c1453AjM;
    }
}
