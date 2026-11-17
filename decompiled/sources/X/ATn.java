package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes4.dex */
public final class ATn extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public Integer A00;
    public G0V<? super BL4, ? super EnumC1820Arj, C2ae> A01;
    public boolean A02;

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        Integer num = this.A00;
        Integer num2 = C79.A00;
        int iA03 = num != num2 ? 0 : Constraints.A03(j);
        Integer num3 = C79.A01;
        AZE azeAQW = c3tg.AQW(AYL.A05(iA03, (num == num2 || !this.A02) ? Constraints.A01(j) : Integer.MAX_VALUE, num == num3 ? Constraints.A02(j) : 0, (num == num3 || !this.A02) ? Constraints.A00(j) : Integer.MAX_VALUE));
        int iA04 = ATD.A04(azeAQW.A01, Constraints.A03(j), Constraints.A01(j));
        int iA042 = ATD.A04(azeAQW.A00, Constraints.A02(j), Constraints.A00(j));
        return axy.APV(C9jH.A00, new BTT(azeAQW, axy, this, iA04, iA042, 1), iA04, iA042);
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
