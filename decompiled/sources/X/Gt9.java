package X;

/* loaded from: classes6.dex */
public class Gt9 {
    public final Hy9 A00;
    public final C10532Hqa A01;
    public final Gt4 A02;

    public final void A01(int i) {
        String strValueOf;
        Hy9 hy9 = this.A00;
        hy9.A01('\n');
        C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
        int i2 = 0;
        C10293Gtx.A03(C8j3.A1Q(i), "width must be >= 0");
        int iMin = Math.min(i, 30);
        String[] strArr = Gt5.A04;
        if (iMin < 21) {
            strValueOf = strArr[iMin];
        } else {
            char[] cArr = new char[iMin];
            do {
                cArr[i2] = ' ';
                i2++;
            } while (i2 < iMin);
            strValueOf = String.valueOf(cArr);
        }
        hy9.A02(strValueOf);
    }

    public void A03(Gt3 gt3, int i) {
        gt3.A0N(this.A00, this.A01);
    }

    public void A04(GtD gtD, int i) {
        gtD.A0N(this.A00, this.A01);
    }

    public void A05(C10262GtH c10262GtH, int i, int i2) {
        int i3 = i | 1;
        HuP.A00(c10262GtH.A0T(), this.A00, this.A01, i3);
    }

    public Gt9(Hy9 hy9, C10532Hqa c10532Hqa, Gt4 gt4) {
        this.A02 = gt4;
        this.A00 = hy9;
        this.A01 = c10532Hqa;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void A02(X.Gt4 r8) {
        /*
            r7 = this;
            X.Gt4 r2 = r8.A0H()
            r1 = 0
        L5:
            X.Gt3 r5 = r8.A01
            X.Gt4 r4 = r8.A0H()
            if (r5 == 0) goto Lcd
            int r6 = r8.A05()
        L11:
            java.lang.Class r3 = r8.getClass()
            java.lang.Class<X.GtH> r0 = X.C10262GtH.class
            if (r3 != r0) goto Lb9
            r3 = r8
            X.GtH r3 = (X.C10262GtH) r3
            r0 = 0
            r7.A05(r3, r0, r1)
        L20:
            if (r5 == 0) goto L3a
            X.Gt3 r0 = r8.A01
            if (r0 == r5) goto L3a
            X.Gty r0 = r5.A01
            int r0 = r0.size()
            if (r6 >= r0) goto Lb6
            X.Gt4 r8 = X.AbstractC7609F5w.A12(r5, r6)
        L32:
            r0 = r4
            if (r1 != 0) goto L36
            r0 = r2
        L36:
            if (r8 == 0) goto L48
            if (r8 == r0) goto L48
        L3a:
            int r0 = r8.A04()
            if (r0 <= 0) goto L54
            r0 = 0
            X.Gt4 r8 = X.AbstractC7609F5w.A12(r8, r0)
            int r1 = r1 + 1
            goto L5
        L48:
            if (r1 == 0) goto Ld0
            if (r4 == 0) goto L51
            X.Gt3 r0 = r4.A01
            r8 = r4
            if (r0 == r5) goto L5
        L51:
            int r1 = r1 + (-1)
            r8 = r5
        L54:
            boolean r0 = r8 instanceof X.Gt3
            if (r0 == 0) goto La1
            r4 = r8
            X.Gt3 r4 = (X.Gt3) r4
            boolean r0 = r7 instanceof X.GtB
            if (r0 == 0) goto L9c
            r3 = r7
            X.GtB r3 = (X.GtB) r3
            X.Gt4 r5 = r4.A0G()
        L66:
            boolean r0 = X.GtB.A00(r5)
            if (r0 == 0) goto L71
            X.Gt4 r5 = r5.A0H()
            goto L66
        L71:
            boolean r0 = r3.A07(r5)
            if (r0 == 0) goto L7a
            r3.A01(r1)
        L7a:
            X.Hy9 r0 = r3.A00
            r4.A0d(r0)
            boolean r0 = r3.A00
            if (r0 == 0) goto La1
            X.Guc r0 = r4.A02
            int r0 = r0.A00
            r0 = r0 & 64
            if (r0 == 0) goto La1
        L8b:
            X.Gt3 r4 = r4.A01
            if (r4 == 0) goto L98
            X.Guc r0 = r4.A02
            int r0 = r0.A00
            r0 = r0 & 64
            if (r0 == 0) goto L8b
            goto La1
        L98:
            r0 = 0
            r3.A00 = r0
            goto La1
        L9c:
            X.Hy9 r0 = r7.A00
            r4.A0d(r0)
        La1:
            X.Gt4 r0 = r8.A0H()
            if (r1 != 0) goto Lac
            if (r0 == 0) goto Ld0
            if (r0 != r2) goto Lb3
            return
        Lac:
            if (r0 != 0) goto Lb3
            X.Gt3 r8 = r8.A01
            int r1 = r1 + (-1)
            goto L54
        Lb3:
            r8 = r0
            goto L5
        Lb6:
            r8 = 0
            goto L32
        Lb9:
            boolean r0 = r8 instanceof X.Gt3
            if (r0 == 0) goto Lc5
            r0 = r8
            X.Gt3 r0 = (X.Gt3) r0
            r7.A03(r0, r1)
            goto L20
        Lc5:
            r0 = r8
            X.GtD r0 = (X.GtD) r0
            r7.A04(r0, r1)
            goto L20
        Lcd:
            r6 = 0
            goto L11
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gt9.A02(X.Gt4):void");
    }
}
