package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Apn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1750Apn extends AbstractC1748Apl implements InterfaceC1356Ahh {
    public C1Ny A00;
    public C1Ny A01;
    public C15X A02;

    @Override // X.AbstractC1748Apl
    public final void A01() {
        this.A00 = new C1CH(this.A01, super.A00);
        super.A01();
        AbstractC1339AhQ.A00(this);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        int iALn = this.A00.ALn(axy);
        if (iALn == 0) {
            return axy.APV(C9jH.A00, C2278BSe.A00(39), 0, 0);
        }
        AZE azeAQW = c3tg.AQW(Constraints.A05(Constraints.A03(j), Constraints.A01(j), iALn, iALn));
        return AXY.A00(axy, azeAQW, 17, azeAQW.A01, iALn);
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
