package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.AsO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1851AsO extends AbstractC1439Aj8 implements InterfaceC1356Ahh, C1Z2 {
    public C1854AsR A00;
    public C1BO<? extends Object> A01;
    public final C1822Arm A02;

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        this.A01 = null;
        this.A00 = null;
    }

    public static final void A00(C1851AsO c1851AsO, C1822Arm c1822Arm, C2K7 c2k7) {
        C1824Aro c1824Aro = c1822Arm.A02;
        AbstractC1996Aw5 abstractC1996Aw5 = c1824Aro.A06;
        C1736ApY c1736ApY = c1824Aro.A09;
        if (c1736ApY == null) {
            c1736ApY = C1736ApY.A04;
        }
        int iA00 = C1824Aro.A00(c1824Aro);
        B0I b0i = c1824Aro.A08;
        c1851AsO.A01 = c2k7.AbY(abstractC1996Aw5, c1736ApY, iA00, b0i != null ? b0i.A00 : 65535);
        AbstractC1339AhQ.A00(c1851AsO);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        C1854AsR c1854AsR = this.A00;
        if (c1854AsR == null) {
            throw C60O.A0i("Min size state is not set.");
        }
        C1BO<? extends Object> c1bo = this.A01;
        if (c1bo == null) {
            throw C60O.A0i("Font resolution state is not set.");
        }
        Object value = c1bo.getValue();
        if (!C7384Etj.areEqual(value, c1854AsR.A05)) {
            c1854AsR.A05 = value;
            MutableState.A09(true, c1854AsR.A06);
        }
        MutableState mutableState = c1854AsR.A06;
        if (MutableState.A0A(mutableState)) {
            c1854AsR.A00 = AbstractC1933Atw.A00(c1854AsR.A01, c1854AsR.A02, c1854AsR.A03, AbstractC1933Atw.A00, 1);
            MutableState.A09(false, mutableState);
        }
        long j2 = c1854AsR.A00;
        AZE azeAQW = c3tg.AQW(AYL.A0A(j, AYL.A05(C8j3.A0G(j2), Integer.MAX_VALUE, AnonymousClass002.A09(j2), Integer.MAX_VALUE)));
        return AXY.A01(axy, C2294BSu.A00(azeAQW, 14), azeAQW.A01, azeAQW.A00);
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        C1822Arm c1822ArmA01 = AbstractC1823Arn.A01(this.A02, AbstractC1414Aij.A04(this).A0G);
        C2K7 c2k7 = (C2K7) ARZ.A01(Am0.A06, this);
        A00(this, c1822ArmA01, c2k7);
        EnumC1820Arj enumC1820Arj = AbstractC1414Aij.A04(this).A0G;
        AXN axnA08 = AbstractC1414Aij.A08(this);
        C1BO<? extends Object> c1bo = this.A01;
        if (c1bo == null) {
            throw C60O.A0i("Font resolution state is not set.");
        }
        this.A00 = new C1854AsR(c1822ArmA01, c2k7, axnA08, enumC1820Arj, c1bo.getValue());
    }

    @Override // X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public final void onViewConfigurationChange() {
        C1854AsR c1854AsR = this.A00;
        if (c1854AsR != null) {
            C1854AsR.A00(c1854AsR, null, AbstractC1414Aij.A08(this), null, 29);
        }
        AbstractC1339AhQ.A00(this);
    }

    @Override // X.AbstractC1439Aj8
    public final void onLayoutDirectionChange() {
        C1854AsR c1854AsR = this.A00;
        if (c1854AsR != null) {
            C1854AsR.A00(c1854AsR, null, null, AbstractC1414Aij.A04(this).A0G, 30);
        }
        AbstractC1339AhQ.A00(this);
    }

    public C1851AsO(C1822Arm c1822Arm) {
        this.A02 = c1822Arm;
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
