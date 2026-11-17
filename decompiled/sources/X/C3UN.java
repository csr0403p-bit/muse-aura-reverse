package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.3UN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3UN extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long A00(X.AXN r8) {
        /*
            r7 = this;
            float r1 = r7.A01
            boolean r0 = java.lang.Float.isNaN(r1)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            if (r0 != 0) goto L58
            int r4 = r8.Abr(r1)
            if (r4 >= 0) goto L13
            r4 = 0
        L13:
            float r1 = r7.A00
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L54
            int r3 = r8.Abr(r1)
            if (r3 >= 0) goto L22
            r3 = 0
        L22:
            float r1 = r7.A03
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L52
            int r2 = r8.Abr(r1)
            if (r2 < 0) goto L52
            if (r2 <= r4) goto L4f
            r2 = r4
        L33:
            float r1 = r7.A02
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L43
            int r0 = r8.Abr(r1)
            if (r0 >= 0) goto L48
            r0 = 0
        L42:
            r5 = r0
        L43:
            long r0 = X.AYL.A05(r2, r4, r5, r3)
            return r0
        L48:
            if (r0 <= r3) goto L4c
            r0 = r3
            goto L42
        L4c:
            if (r0 == r6) goto L43
            goto L42
        L4f:
            if (r2 == r6) goto L52
            goto L33
        L52:
            r2 = 0
            goto L33
        L54:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L22
        L58:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3UN.A00(X.AXN):long");
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        long jA00 = A00(c3tf);
        if (Constraints.A0B(jA00)) {
            return Constraints.A00(jA00);
        }
        if (!this.A04) {
            i = AYL.A02(jA00, i);
        }
        return AYL.A01(jA00, c3Tr.AQM(i));
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        long jA00 = A00(c3tf);
        if (Constraints.A0C(jA00)) {
            return Constraints.A01(jA00);
        }
        if (!this.A04) {
            i = AYL.A01(jA00, i);
        }
        return AYL.A02(jA00, c3Tr.AQO(i));
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        int iA03;
        int iA01;
        int iA02;
        int iA00;
        long jA05;
        long jA00 = A00(axy);
        if (this.A04) {
            jA05 = AYL.A0A(j, jA00);
        } else {
            if (Float.isNaN(this.A03)) {
                iA03 = Constraints.A03(j);
                int iA012 = Constraints.A01(jA00);
                if (iA03 > iA012) {
                    iA03 = iA012;
                }
            } else {
                iA03 = Constraints.A03(jA00);
            }
            if (Float.isNaN(this.A01)) {
                iA01 = Constraints.A01(j);
                int iA032 = Constraints.A03(jA00);
                if (iA01 < iA032) {
                    iA01 = iA032;
                }
            } else {
                iA01 = Constraints.A01(jA00);
            }
            if (Float.isNaN(this.A02)) {
                iA02 = Constraints.A02(j);
                int iA002 = Constraints.A00(jA00);
                if (iA02 > iA002) {
                    iA02 = iA002;
                }
            } else {
                iA02 = Constraints.A02(jA00);
            }
            if (Float.isNaN(this.A00)) {
                iA00 = Constraints.A00(j);
                int iA022 = Constraints.A02(jA00);
                if (iA00 < iA022) {
                    iA00 = iA022;
                }
            } else {
                iA00 = Constraints.A00(jA00);
            }
            jA05 = AYL.A05(iA03, iA01, iA02, iA00);
        }
        AZE azeAQW = c3tg.AQW(jA05);
        int i = azeAQW.A01;
        int i2 = azeAQW.A00;
        return axy.APV(AGH.A0E(), new C3bS(azeAQW, 3), i, i2);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        long jA00 = A00(c3tf);
        if (Constraints.A0B(jA00)) {
            return Constraints.A00(jA00);
        }
        if (!this.A04) {
            i = AYL.A02(jA00, i);
        }
        return AYL.A01(jA00, c3Tr.AQo(i));
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        long jA00 = A00(c3tf);
        if (Constraints.A0C(jA00)) {
            return Constraints.A01(jA00);
        }
        if (!this.A04) {
            i = AYL.A01(jA00, i);
        }
        return AYL.A02(jA00, c3Tr.AQq(i));
    }
}
