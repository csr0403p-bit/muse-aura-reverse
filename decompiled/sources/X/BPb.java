package X;

/* loaded from: classes4.dex */
public abstract class BPb {
    public static final float A00 = (25.0f * 2.0f) / 2.4142137f;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(final X.InterfaceC2267BNn r10, X.BFM r11, final X.BRg r12, final int r13, final int r14, long r15) {
        /*
            r8 = r15
            r0 = 1776202187(0x69deb1cb, float:3.3652642E25)
            r11.AgG(r0)
            r6 = r13
            r0 = r13 & 6
            r2 = 4
            r4 = r10
            if (r0 != 0) goto Lb2
            boolean r0 = X.AnonymousClass004.A1X(r10, r11, r13)
            int r1 = X.AnonymousClass002.A05(r0)
            r1 = r1 | r13
        L17:
            r0 = r13 & 48
            r5 = r12
            if (r0 != 0) goto L21
            int r0 = X.AnonymousClass004.A0e(r11, r12)
            r1 = r1 | r0
        L21:
            r0 = r13 & 384(0x180, float:5.38E-43)
            r7 = r14
            if (r0 != 0) goto L35
            r0 = r14 & 4
            if (r0 != 0) goto L32
            boolean r3 = r11.A64(r8)
            r0 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L34
        L32:
            r0 = 128(0x80, float:1.794E-43)
        L34:
            r1 = r1 | r0
        L35:
            boolean r0 = X.AnonymousClass004.A1J(r1)
            boolean r0 = X.AnonymousClass001.A1b(r0, r11, r1)
            if (r0 == 0) goto Lae
            r11.Afy()
            r0 = r13 & 1
            if (r0 == 0) goto La4
            boolean r0 = r11.AEk()
            if (r0 != 0) goto La4
            r11.Afo()
            r0 = r14 & 4
            if (r0 == 0) goto L55
        L53:
            r1 = r1 & (-897(0xfffffffffffffc7f, float:NaN))
        L55:
            r11.AAb()
            r3 = r1 & 14
            if (r3 == r2) goto L66
            r0 = r1 & 8
            if (r0 == 0) goto La2
            boolean r0 = r11.A67(r10)
            if (r0 == 0) goto La2
        L66:
            r0 = 1
        L67:
            java.lang.Object r1 = r11.AaT()
            if (r0 != 0) goto L71
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L7a
        L71:
            r0 = 47
            X.BSv r1 = X.C2295BSv.A00(r10, r0)
            r11.Ai0(r1)
        L7a:
            X.G0U r1 = (X.G0U) r1
            r0 = 0
            X.BRg r0 = X.ARD.A01(r12, r1, r0)
            androidx.compose.ui.Alignment r2 = X.C2VU.A0C
            X.BR2 r1 = new X.BR2
            r1.<init>()
            r0 = -1653527038(0xffffffff9d712e02, float:-3.191987E-21)
            X.B1U r1 = X.B1V.A00(r11, r1, r0)
            r0 = r3 | 432(0x1b0, float:6.05E-43)
            X.AWB.A01(r10, r11, r2, r1, r0)
        L94:
            X.BBb r0 = r11.AAc()
            if (r0 == 0) goto La1
            X.BQU r3 = new X.BQU
            r3.<init>()
            r0.A06 = r3
        La1:
            return
        La2:
            r0 = 0
            goto L67
        La4:
            r0 = r14 & 4
            if (r0 == 0) goto L55
            r8 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L53
        Lae:
            r11.Afo()
            goto L94
        Lb2:
            r1 = r13
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPb.A00(X.BNn, X.BFM, X.BRg, int, int, long):void");
    }

    public static final void A01(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(694251107);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C01N.A07(bfm, AEk.A02(C10G.A0C(bRg, A00, 25.0f), new C3bP(((C1BT) AKO.A07(C1BR.A00, (BBI) bfm)).A01, 0)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8i7(bRg, i, i2, 0);
        }
    }
}
