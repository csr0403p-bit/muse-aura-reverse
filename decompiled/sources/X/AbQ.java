package X;

import androidx.compose.foundation.pager.PagerState;

/* loaded from: classes4.dex */
public final class AbQ implements C3MW {
    public final PagerState A00;
    public final EnumC1820Arj A01;
    public final C3MW A02;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    @Override // X.C3MW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float calculateScrollDistance(float r8, float r9, float r10) {
        /*
            r7 = this;
            X.3MW r0 = r7.A02
            float r4 = r0.calculateScrollDistance(r8, r9, r10)
            r1 = 1
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            float r8 = r8 + r9
            if (r0 <= 0) goto L4d
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L54
        L11:
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L65
            if (r1 == 0) goto L65
            androidx.compose.foundation.pager.PagerState r2 = r7.A00
            X.Arj r1 = r7.A01
            X.Arj r0 = X.EnumC1820Arj.A03
            if (r1 != r0) goto L4a
            androidx.compose.runtime.MutableState<X.Abh> r0 = r2.A0A
            X.Abh r0 = X.C8j4.A0V(r0)
            X.AYu r1 = r0.A09
            X.AYu r0 = X.EnumC1108AYu.A02
            if (r1 != r0) goto L4a
            int r0 = r2.A03
            int r1 = -r0
            int r0 = r2.A08()
            int r1 = r1 + r0
        L37:
            float r1 = (float) r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r0
        L3b:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L56
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L56
            int r0 = r2.A08()
            float r0 = (float) r0
            float r1 = r1 + r0
            goto L3b
        L4a:
            int r1 = r2.A03
            goto L37
        L4d:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L54
            goto L11
        L54:
            r1 = 0
            goto L11
        L56:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lb4
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lb4
            int r0 = r2.A08()
            float r0 = (float) r0
            float r1 = r1 - r0
            goto L56
        L65:
            androidx.compose.foundation.pager.PagerState r4 = r7.A00
            int r0 = r4.A03
            int r0 = java.lang.Math.abs(r0)
            double r5 = (double) r0
            r1 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto Lc1
            X.Arj r5 = r7.A01
            X.Arj r2 = X.EnumC1820Arj.A03
            if (r5 != r2) goto Lbe
            androidx.compose.runtime.MutableState<X.Abh> r0 = r4.A0A
            X.Abh r0 = X.C8j4.A0V(r0)
            X.AYu r1 = r0.A09
            X.AYu r0 = X.EnumC1108AYu.A02
            if (r1 != r0) goto Lbe
            int r0 = r4.A03
            int r1 = -r0
            int r0 = r4.A08()
            int r1 = r1 + r0
        L91:
            float r3 = (float) r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r0
            if (r5 != r2) goto La4
            androidx.compose.runtime.MutableState<X.Abh> r0 = r4.A0A
            X.Abh r0 = X.C8j4.A0V(r0)
            X.AYu r2 = r0.A09
            X.AYu r0 = X.EnumC1108AYu.A02
            r1 = 1
            if (r2 == r0) goto La5
        La4:
            r1 = 0
        La5:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r4.A0R
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r1 == 0) goto Lb5
            if (r0 == 0) goto Lb7
        Laf:
            float r0 = -r10
            float r1 = X.ATD.A03(r3, r0, r10)
        Lb4:
            return r1
        Lb5:
            if (r0 == 0) goto Laf
        Lb7:
            int r0 = r4.A08()
            float r0 = (float) r0
            float r3 = r3 + r0
            goto Laf
        Lbe:
            int r1 = r4.A03
            goto L91
        Lc1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbQ.calculateScrollDistance(float, float, float):float");
    }

    public AbQ(C3MW c3mw, PagerState pagerState, EnumC1820Arj enumC1820Arj) {
        this.A00 = pagerState;
        this.A02 = c3mw;
        this.A01 = enumC1820Arj;
    }
}
