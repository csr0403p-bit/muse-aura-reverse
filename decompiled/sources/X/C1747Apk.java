package X;

/* renamed from: X.Apk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1747Apk extends AbstractC1748Apl implements InterfaceC1356Ahh {
    public C1Ny A00;

    @Override // X.AbstractC1748Apl
    public final C1Ny A00(C1Ny c1Ny) {
        return new C1OP(c1Ny, this.A00);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        int iAH1 = this.A01.AH1(axy, axy.getLayoutDirection()) - super.A00.AH1(axy, axy.getLayoutDirection());
        int iALn = this.A01.ALn(axy) - super.A00.ALn(axy);
        int iAJo = (this.A01.AJo(axy, axy.getLayoutDirection()) - super.A00.AJo(axy, axy.getLayoutDirection())) + iAH1;
        int iACy = (this.A01.ACy(axy) - super.A00.ACy(axy)) + iALn;
        AZE azeAQW = c3tg.AQW(AYL.A08(j, -iAJo, -iACy));
        return AXY.A01(axy, new BT6(azeAQW, iAH1, iALn, 1), AYL.A02(j, azeAQW.A01 + iAJo), AYL.A01(j, azeAQW.A00 + iACy));
    }

    @Override // X.AbstractC1748Apl
    public final void A01() {
        super.A01();
        AbstractC1339AhQ.A00(this);
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
