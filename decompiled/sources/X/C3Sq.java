package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.3Sq, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3Sq extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public float A00;
    public C1BO<Integer> A01;
    public C1BO<Integer> A02;

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        C1BO<Integer> c1bo = this.A02;
        int iRound = (c1bo == null || C1BO.A02(c1bo) == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(C1BO.A01(c1bo) * this.A00);
        C1BO<Integer> c1bo2 = this.A01;
        int iRound2 = (c1bo2 == null || C1BO.A02(c1bo2) == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(C1BO.A01(c1bo2) * this.A00);
        int iA03 = iRound != Integer.MAX_VALUE ? iRound : Constraints.A03(j);
        int iA02 = iRound2 != Integer.MAX_VALUE ? iRound2 : Constraints.A02(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = Constraints.A01(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = Constraints.A00(j);
        }
        AZE azeAQW = c3tg.AQW(AYL.A05(iA03, iRound, iA02, iRound2));
        return AnonymousClass002.A0X(axy, new C3bS(azeAQW, 5), azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A00(c3Tr, c3tf, this, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final /* synthetic */ int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return AXV.A01(c3Tr, c3tf, this, i);
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
