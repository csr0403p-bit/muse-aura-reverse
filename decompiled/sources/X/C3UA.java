package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.3UA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3UA extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public float A00;
    public float A01;

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        int iA03;
        int iA02;
        float f = this.A01;
        if (Float.isNaN(f) || Constraints.A03(j) != 0) {
            iA03 = Constraints.A03(j);
        } else {
            int iAbr = axy.Abr(f);
            iA03 = Constraints.A01(j);
            if (iAbr < 0) {
                iAbr = 0;
            }
            if (iAbr <= iA03) {
                iA03 = iAbr;
            }
        }
        int iA01 = Constraints.A01(j);
        float f2 = this.A00;
        if (Float.isNaN(f2) || Constraints.A02(j) != 0) {
            iA02 = Constraints.A02(j);
        } else {
            int iAbr2 = axy.Abr(f2);
            iA02 = Constraints.A00(j);
            int i = iAbr2 >= 0 ? iAbr2 : 0;
            if (i <= iA02) {
                iA02 = i;
            }
        }
        AZE azeAQW = c3tg.AQW(AYL.A05(iA03, iA01, iA02, Constraints.A00(j)));
        return AnonymousClass002.A0X(axy, new C3bS(azeAQW, 4), azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        int iAQM = c3Tr.AQM(i);
        float f = this.A00;
        int iAbr = !Float.isNaN(f) ? c3tf.Abr(f) : 0;
        return iAQM < iAbr ? iAbr : iAQM;
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        int iAQO = c3Tr.AQO(i);
        float f = this.A01;
        int iAbr = !Float.isNaN(f) ? c3tf.Abr(f) : 0;
        return iAQO < iAbr ? iAbr : iAQO;
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        int iAQo = c3Tr.AQo(i);
        float f = this.A00;
        int iAbr = !Float.isNaN(f) ? c3tf.Abr(f) : 0;
        return iAQo < iAbr ? iAbr : iAQo;
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        int iAQq = c3Tr.AQq(i);
        float f = this.A01;
        int iAbr = !Float.isNaN(f) ? c3tf.Abr(f) : 0;
        return iAQq < iAbr ? iAbr : iAQq;
    }
}
