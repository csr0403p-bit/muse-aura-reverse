package X;

/* renamed from: X.3UL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3UL extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04;

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        int iAbr = axy.Abr(this.A02) + axy.Abr(this.A01);
        int iAbr2 = axy.Abr(this.A03) + axy.Abr(this.A00);
        AZE azeAQW = c3tg.AQW(AYL.A08(j, -iAbr, -iAbr2));
        int iA02 = AYL.A02(j, azeAQW.A01 + iAbr);
        int iA01 = AYL.A01(j, azeAQW.A00 + iAbr2);
        return axy.APV(AGH.A0E(), new C3bW(1, this, azeAQW), iA02, iA01);
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
