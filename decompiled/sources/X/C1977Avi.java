package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Avi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1977Avi implements InterfaceC1380AiA, InterfaceC2013AwR {
    public final C1AC A00;
    public final InterfaceC04981Yd A01;

    @Override // X.InterfaceC2013AwR
    public final InterfaceC1134Abi AXw(AXY axy, int[] iArr, int[] iArr2, AZE[] azeArr, int i, int i2, int i3, int i4, int i5, int i6) {
        return axy.APV(C9jH.A00, new BTT(this, iArr, azeArr, i3, i, 0), i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1977Avi) {
                C1977Avi c1977Avi = (C1977Avi) obj;
                if (!this.A01.equals(c1977Avi.A01) || !C7384Etj.areEqual(this.A00, c1977Avi.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC2013AwR
    public final long A7c(int i, int i2, int i3, int i4, boolean z) {
        return !z ? AYL.A05(i, i3, i2, i4) : Constraints.A07(i, i3, i2, i4);
    }

    @Override // X.InterfaceC2013AwR
    public final void AY6(AXY axy, int[] iArr, int[] iArr2, int i) {
        this.A01.A4l(axy, axy.getLayoutDirection(), iArr, iArr2, i);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // X.InterfaceC1380AiA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int maxIntrinsicHeight(X.C3TF r10, java.util.List<? extends X.C3Tr> r11, int r12) {
        /*
            r9 = this;
            X.1Yd r0 = r9.A01
            float r0 = r0.AKp()
            int r1 = r10.Abr(r0)
            boolean r0 = r11.isEmpty()
            r6 = 0
            if (r0 == 0) goto L13
            r0 = 0
        L12:
            return r0
        L13:
            int r0 = X.C60O.A00(r11)
            int r0 = r0 * r1
            int r5 = java.lang.Math.min(r0, r12)
            int r8 = r11.size()
            r10 = 0
            r4 = 0
            r3 = 0
            r0 = 0
        L24:
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r8) goto L5a
            X.3Tr r9 = X.C8j4.A0a(r11, r4)
            X.Avo r1 = X.AbstractC2103AyT.A00(r9)
            if (r1 == 0) goto L41
            float r2 = r1.A00
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 == 0) goto L41
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 <= 0) goto L3e
            float r3 = r3 + r2
        L3e:
            int r4 = r4 + 1
            goto L24
        L41:
            int r2 = r12 - r5
            if (r12 != r7) goto L48
            r2 = 2147483647(0x7fffffff, float:NaN)
        L48:
            int r1 = r9.AQO(r7)
            int r1 = java.lang.Math.min(r1, r2)
            int r5 = r5 + r1
            int r1 = r9.AQM(r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L3e
        L5a:
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 != 0) goto L8c
            r5 = 0
        L5f:
            int r4 = r11.size()
        L63:
            if (r6 >= r4) goto L12
            X.3Tr r3 = X.C8j4.A0a(r11, r6)
            X.Avo r1 = X.AbstractC2103AyT.A00(r3)
            if (r1 == 0) goto L85
            float r2 = r1.A00
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 <= 0) goto L85
            if (r5 == r7) goto L88
            float r1 = (float) r5
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
        L7d:
            int r1 = r3.AQM(r1)
            int r0 = java.lang.Math.max(r0, r1)
        L85:
            int r6 = r6 + 1
            goto L63
        L88:
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L7d
        L8c:
            int r5 = X.C8j5.A04(r3, r12, r5)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1977Avi.maxIntrinsicHeight(X.3TF, java.util.List, int):int");
    }

    @Override // X.InterfaceC1380AiA
    public final int maxIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        int iAbr = c3tf.Abr(this.A01.AKp());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            C3Tr c3TrA0a = C8j4.A0a(list, i3);
            C1983Avo c1983AvoA00 = AbstractC2103AyT.A00(c3TrA0a);
            float f2 = c1983AvoA00 != null ? c1983AvoA00.A00 : 0.0f;
            int iAQO = c3TrA0a.AQO(i);
            if (f2 == 0.0f) {
                i2 += iAQO;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iAQO / f2));
            }
        }
        return C8j5.A08(list, f, iMax, i2, iAbr);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // X.InterfaceC1380AiA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int minIntrinsicHeight(X.C3TF r10, java.util.List<? extends X.C3Tr> r11, int r12) {
        /*
            r9 = this;
            X.1Yd r0 = r9.A01
            float r0 = r0.AKp()
            int r1 = r10.Abr(r0)
            boolean r0 = r11.isEmpty()
            r6 = 0
            if (r0 == 0) goto L13
            r0 = 0
        L12:
            return r0
        L13:
            int r0 = X.C60O.A00(r11)
            int r0 = r0 * r1
            int r5 = java.lang.Math.min(r0, r12)
            int r8 = r11.size()
            r10 = 0
            r4 = 0
            r3 = 0
            r0 = 0
        L24:
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r8) goto L5a
            X.3Tr r9 = X.C8j4.A0a(r11, r4)
            X.Avo r1 = X.AbstractC2103AyT.A00(r9)
            if (r1 == 0) goto L41
            float r2 = r1.A00
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 == 0) goto L41
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 <= 0) goto L3e
            float r3 = r3 + r2
        L3e:
            int r4 = r4 + 1
            goto L24
        L41:
            int r2 = r12 - r5
            if (r12 != r7) goto L48
            r2 = 2147483647(0x7fffffff, float:NaN)
        L48:
            int r1 = r9.AQO(r7)
            int r1 = java.lang.Math.min(r1, r2)
            int r5 = r5 + r1
            int r1 = r9.AQo(r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L3e
        L5a:
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 != 0) goto L8c
            r5 = 0
        L5f:
            int r4 = r11.size()
        L63:
            if (r6 >= r4) goto L12
            X.3Tr r3 = X.C8j4.A0a(r11, r6)
            X.Avo r1 = X.AbstractC2103AyT.A00(r3)
            if (r1 == 0) goto L85
            float r2 = r1.A00
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 <= 0) goto L85
            if (r5 == r7) goto L88
            float r1 = (float) r5
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
        L7d:
            int r1 = r3.AQo(r1)
            int r0 = java.lang.Math.max(r0, r1)
        L85:
            int r6 = r6 + 1
            goto L63
        L88:
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L7d
        L8c:
            int r5 = X.C8j5.A04(r3, r12, r5)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1977Avi.minIntrinsicHeight(X.3TF, java.util.List, int):int");
    }

    @Override // X.InterfaceC1380AiA
    public final int minIntrinsicWidth(C3TF c3tf, List<? extends C3Tr> list, int i) {
        int iAbr = c3tf.Abr(this.A01.AKp());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            C3Tr c3TrA0a = C8j4.A0a(list, i3);
            C1983Avo c1983AvoA00 = AbstractC2103AyT.A00(c3TrA0a);
            float f2 = c1983AvoA00 != null ? c1983AvoA00.A00 : 0.0f;
            int iAQq = c3TrA0a.AQq(i);
            if (f2 == 0.0f) {
                i2 += iAQq;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iAQq / f2));
            }
        }
        return C8j5.A08(list, f, iMax, i2, iAbr);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RowMeasurePolicy(horizontalArrangement=");
        sbA0x.append(this.A01);
        sbA0x.append(C60N.A00(38));
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C1977Avi(InterfaceC04981Yd interfaceC04981Yd, C1AC c1ac) {
        this.A01 = interfaceC04981Yd;
        this.A00 = c1ac;
    }

    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        return AbstractC1981Avm.A00(this, axy, list, null, new AZE[list.size()], Constraints.A03(j), Constraints.A02(j), Constraints.A01(j), Constraints.A00(j), axy.Abr(this.A01.AKp()), 0, list.size(), 0);
    }

    @Override // X.InterfaceC2013AwR
    public final int A86(AZE aze) {
        return aze.A00;
    }

    @Override // X.InterfaceC2013AwR
    public final int AQ1(AZE aze) {
        return aze.A01;
    }
}
