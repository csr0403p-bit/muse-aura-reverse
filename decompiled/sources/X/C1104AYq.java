package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.AYq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1104AYq extends AbstractC1437Aj6 implements InterfaceC1451AjK, C1Z2 {
    public InterfaceC1260Afz A00;
    public InterfaceC1260Afz A01;
    public InterfaceC0976AKp A02;
    public C3MW A03;
    public BLD A04;
    public EnumC1108AYu A05;
    public InterfaceC1180Adj A06;
    public InterfaceC1072AWd A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C1262Ag1 A0B;
    public C1Z3 A0C;
    public boolean A0D;

    public final void A0I(InterfaceC1260Afz interfaceC1260Afz, C3MW c3mw, BLD bld, EnumC1108AYu enumC1108AYu, InterfaceC1180Adj interfaceC1180Adj, InterfaceC1072AWd interfaceC1072AWd, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.A06 = interfaceC1180Adj;
        this.A05 = enumC1108AYu;
        boolean z5 = true;
        if (this.A0A != z) {
            this.A0A = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (C7384Etj.areEqual(this.A01, interfaceC1260Afz)) {
            z5 = false;
        } else {
            this.A01 = interfaceC1260Afz;
        }
        if (z4 || (z5 && !z)) {
            C1Z3 c1z3 = this.A0C;
            if (c1z3 != null) {
                A0H(c1z3);
            }
            this.A0C = null;
            A00();
        }
        this.A08 = z2;
        this.A09 = z3;
        this.A04 = bld;
        this.A07 = interfaceC1072AWd;
        this.A03 = c3mw;
        boolean zA01 = A01();
        this.A0D = zA01;
        C1262Ag1 c1262Ag1 = this.A0B;
        if (c1262Ag1 != null) {
            c1262Ag1.A0O(this.A0A ? this.A00 : this.A01, c3mw, bld, enumC1108AYu, interfaceC1180Adj, interfaceC1072AWd, z2, zA01);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onLayoutDirectionChange() {
        boolean zA01 = A01();
        if (this.A0D != zA01) {
            this.A0D = zA01;
            InterfaceC1180Adj interfaceC1180Adj = this.A06;
            EnumC1108AYu enumC1108AYu = this.A05;
            boolean z = this.A0A;
            InterfaceC1260Afz interfaceC1260Afz = z ? this.A00 : this.A01;
            A0I(interfaceC1260Afz, this.A03, this.A04, enumC1108AYu, interfaceC1180Adj, this.A07, z, this.A08, this.A09);
        }
    }

    private final void A00() {
        C1Z3 c1z3 = this.A0C;
        if (c1z3 != null) {
            if (((AbstractC1439Aj8) c1z3).node.isAttached) {
                return;
            }
            A0G(c1z3);
            return;
        }
        if (this.A0A) {
            AbstractC1441AjA.A00(this, C2292BSs.A00(this, 18));
        }
        InterfaceC1260Afz interfaceC1260Afz = this.A0A ? this.A00 : this.A01;
        if (interfaceC1260Afz != null) {
            C1Z3 c1z32 = ((AndroidEdgeEffectOverscrollEffect) interfaceC1260Afz).A06;
            if (((AbstractC1439Aj8) c1z32).node.isAttached) {
                return;
            }
            A0G(c1z32);
            this.A0C = c1z32;
        }
    }

    private final boolean A01() {
        EnumC1820Arj enumC1820Arj = EnumC1820Arj.A02;
        if (this.isAttached) {
            enumC1820Arj = AbstractC1414Aij.A04(this).A0G;
        }
        EnumC1108AYu enumC1108AYu = this.A05;
        boolean z = this.A09;
        return (enumC1820Arj != EnumC1820Arj.A03 || enumC1108AYu == EnumC1108AYu.A03) ? !z : z;
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        InterfaceC0976AKp interfaceC0976AKp = (InterfaceC0976AKp) ARZ.A01(AbstractC0974AKn.A00, this);
        if (C7384Etj.areEqual(interfaceC0976AKp, this.A02)) {
            return;
        }
        this.A02 = interfaceC0976AKp;
        this.A00 = null;
        C1Z3 c1z3 = this.A0C;
        if (c1z3 != null) {
            A0H(c1z3);
        }
        this.A0C = null;
        A00();
        C1262Ag1 c1262Ag1 = this.A0B;
        if (c1262Ag1 != null) {
            InterfaceC1180Adj interfaceC1180Adj = this.A06;
            EnumC1108AYu enumC1108AYu = this.A05;
            InterfaceC1260Afz interfaceC1260Afz = this.A0A ? this.A00 : this.A01;
            c1262Ag1.A0O(interfaceC1260Afz, this.A03, this.A04, enumC1108AYu, interfaceC1180Adj, this.A07, this.A08, this.A0D);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        C1Z3 c1z3 = this.A0C;
        if (c1z3 != null) {
            A0H(c1z3);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        this.A0D = A01();
        A00();
        if (this.A0B == null) {
            InterfaceC1180Adj interfaceC1180Adj = this.A06;
            InterfaceC1260Afz interfaceC1260Afz = this.A0A ? this.A00 : this.A01;
            C1262Ag1 c1262Ag1 = new C1262Ag1(interfaceC1260Afz, this.A03, this.A04, this.A05, interfaceC1180Adj, this.A07, this.A08, this.A0D);
            A0G(c1262Ag1);
            this.A0B = c1262Ag1;
        }
    }
}
