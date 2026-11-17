package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.AsP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1852AsP extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1451AjK, C1Z2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C1BO<? extends Object> A04;
    public C1822Arm A05;
    public C1822Arm A06;
    public boolean A07;

    @Override // X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public final void onViewConfigurationChange() {
        this.A07 = true;
        AbstractC1339AhQ.A00(this);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        this.A05 = null;
        this.A04 = null;
        this.A07 = false;
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        int iA02;
        int iA022;
        if (this.A07) {
            C1822Arm c1822Arm = this.A05;
            if (c1822Arm == null) {
                throw C60O.A0i("Resolved style is not set.");
            }
            C2K7 c2k7 = (C2K7) ARZ.A01(Am0.A06, this);
            String str = AbstractC1933Atw.A00;
            int iA00 = (int) (AbstractC1933Atw.A00(c1822Arm, c2k7, axy, str, 1) & 4294967295L);
            int iA002 = ((int) (AbstractC1933Atw.A00(c1822Arm, c2k7, axy, FGI.A0O(str, str, '\n'), 2) & 4294967295L)) - iA00;
            int i = this.A01;
            this.A03 = i != 1 ? ((i - 1) * iA002) + iA00 : -1;
            int i2 = this.A00;
            this.A02 = i2 != Integer.MAX_VALUE ? iA00 + (iA002 * (i2 - 1)) : -1;
            this.A07 = false;
        }
        int i3 = this.A03;
        if (i3 != -1) {
            iA022 = Constraints.A02(j);
            iA02 = ATD.A04(i3, iA022, Constraints.A00(j));
        } else {
            iA02 = Constraints.A02(j);
            iA022 = iA02;
        }
        int i4 = this.A02;
        AZE azeAQW = c3tg.AQW(Constraints.A05(Constraints.A03(j), Constraints.A01(j), iA02, i4 != -1 ? ATD.A04(i4, iA022, Constraints.A00(j)) : Constraints.A00(j)));
        return AXY.A01(axy, C2294BSu.A00(azeAQW, 5), azeAQW.A01, azeAQW.A00);
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        if (this.A04 != null) {
            AbstractC1441AjA.A00(this, C2298BSy.A00(this, 6));
        }
        this.A07 = true;
        AbstractC1339AhQ.A00(this);
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        C2K7 c2k7 = (C2K7) ARZ.A01(Am0.A06, this);
        C1822Arm c1822ArmA01 = AbstractC1823Arn.A01(this.A06, AbstractC1414Aij.A04(this).A0G);
        this.A05 = c1822ArmA01;
        C1824Aro c1824Aro = c1822ArmA01.A02;
        AbstractC1996Aw5 abstractC1996Aw5 = c1824Aro.A06;
        C1736ApY c1736ApY = c1824Aro.A09;
        if (c1736ApY == null) {
            c1736ApY = C1736ApY.A04;
        }
        int iA00 = C1824Aro.A00(c1824Aro);
        B0I b0i = c1824Aro.A08;
        this.A04 = c2k7.AbY(abstractC1996Aw5, c1736ApY, iA00, b0i != null ? b0i.A00 : 65535);
        AbstractC1441AjA.A00(this, C2298BSy.A00(this, 5));
        this.A07 = true;
    }

    @Override // X.AbstractC1439Aj8
    public final void onLayoutDirectionChange() {
        this.A05 = AbstractC1823Arn.A01(this.A06, AbstractC1414Aij.A04(this).A0G);
        this.A07 = true;
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
