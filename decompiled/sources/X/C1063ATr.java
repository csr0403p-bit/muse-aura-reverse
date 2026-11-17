package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.ATr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1063ATr extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public float A00;
    public Integer A01;

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        int iA03;
        int iA01;
        int iA02;
        int iA00;
        if (!Constraints.A0A(j) || this.A01 == C79.A00) {
            iA03 = Constraints.A03(j);
            iA01 = Constraints.A01(j);
        } else {
            iA03 = Constraints.A01(j);
            int iRound = Math.round(iA03 * this.A00);
            int iA032 = Constraints.A03(j);
            if (iRound < iA032) {
                iRound = iA032;
            }
            if (iRound <= iA03) {
                iA03 = iRound;
            }
            iA01 = iA03;
        }
        if (!Constraints.A09(j) || this.A01 == C79.A01) {
            iA02 = Constraints.A02(j);
            iA00 = Constraints.A00(j);
        } else {
            iA02 = Constraints.A00(j);
            int iRound2 = Math.round(iA02 * this.A00);
            int iA022 = Constraints.A02(j);
            if (iRound2 < iA022) {
                iRound2 = iA022;
            }
            if (iRound2 <= iA02) {
                iA02 = iRound2;
            }
            iA00 = iA02;
        }
        AZE azeAQW = c3tg.AQW(AYL.A05(iA03, iA01, iA02, iA00));
        return axy.APV(C9jH.A00, new C2295BSv(azeAQW, 18), azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A02(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A03(c3Tr, c3tf, this, i);
    }
}
