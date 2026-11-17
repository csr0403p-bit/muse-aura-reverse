package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public abstract class AYP extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return ((this instanceof AYQ) && ((AYQ) this).A00 == C0lh.A03) ? c3Tr.AQo(i) : c3Tr.AQM(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return ((this instanceof AYT) && ((AYT) this).A00 == C0lh.A03) ? c3Tr.AQq(i) : c3Tr.AQO(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        long jA06;
        boolean z = this instanceof AYT;
        if (z) {
            C0lh c0lh = ((AYT) this).A00;
            C0lh c0lh2 = C0lh.A03;
            int iA00 = Constraints.A00(j);
            int iAQq = c0lh == c0lh2 ? c3tg.AQq(iA00) : c3tg.AQO(iA00);
            if (iAQq < 0) {
                iAQq = 0;
            }
            jA06 = AYL.A06(iAQq, iAQq, 0, Integer.MAX_VALUE);
        } else {
            C0lh c0lh3 = ((AYQ) this).A00;
            C0lh c0lh4 = C0lh.A03;
            int iA01 = Constraints.A01(j);
            int iAQo = c0lh3 == c0lh4 ? c3tg.AQo(iA01) : c3tg.AQM(iA01);
            if (iAQo < 0) {
                iAQo = 0;
            }
            jA06 = AYL.A06(0, Integer.MAX_VALUE, iAQo, iAQo);
        }
        if (z ? ((AYT) this).A01 : ((AYQ) this).A01) {
            jA06 = AYL.A0A(j, jA06);
        }
        AZE azeAQW = c3tg.AQW(jA06);
        return AXY.A00(axy, azeAQW, 24, azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return (!(this instanceof AYQ) || ((AYQ) this).A00 == C0lh.A03) ? c3Tr.AQo(i) : c3Tr.AQM(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return (!(this instanceof AYT) || ((AYT) this).A00 == C0lh.A03) ? c3Tr.AQq(i) : c3Tr.AQO(i);
    }
}
