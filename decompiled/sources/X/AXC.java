package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AXC extends Ab8<AY0> {
    public final C3UH A00;
    public final InterfaceC1072AWd A01;
    public final C1YD A02;
    public final G0U<Boolean, Unit> A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AXC axc = (AXC) obj;
                if (this.A06 != axc.A06 || !C7384Etj.areEqual(this.A01, axc.A01) || !C7384Etj.areEqual(this.A00, axc.A00) || this.A05 != axc.A05 || this.A04 != axc.A04 || !C7384Etj.areEqual(this.A02, axc.A02) || this.A03 != axc.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AY0 ay0 = (AY0) abstractC1439Aj8;
        boolean z = this.A06;
        InterfaceC1072AWd interfaceC1072AWd = this.A01;
        C3UH c3uh = this.A00;
        boolean z2 = this.A05;
        boolean z3 = this.A04;
        C1YD c1yd = this.A02;
        G0U<Boolean, Unit> g0u = this.A03;
        if (ay0.A01 != z) {
            ay0.A01 = z;
            AaW.A00(ay0);
        }
        ay0.A00 = g0u;
        ay0.A0L(c3uh, interfaceC1072AWd, c1yd, null, ay0.A02, z2, z3);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        boolean z = this.A06;
        InterfaceC1072AWd interfaceC1072AWd = this.A01;
        return new AY0(this.A00, interfaceC1072AWd, this.A02, this.A03, z, this.A05, this.A04);
    }

    @Override // X.Ab8
    public final int hashCode() {
        int iA02 = (C0KA.A02(this.A06) + C60R.A01(this.A01)) * 31;
        C3UH c3uh = this.A00;
        int iA01 = C0KA.A01(C0KA.A01((iA02 + (c3uh != null ? c3uh.hashCode() : 0)) * 31, this.A05), this.A04);
        C1YD c1yd = this.A02;
        return AnonymousClass005.A0G(this.A03, (iA01 + (c1yd != null ? c1yd.A00 : 0)) * 31);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "toggleable";
        BHD bhd = asf.A02;
        bhd.A01(BrowserOperationCatalogKt.VALUE, asf.A00);
        bhd.A01("interactionSource", this.A01);
        bhd.A01("indicationNodeFactory", this.A00);
        Ab8.A03(bhd, this.A04);
        bhd.A01("role", this.A02);
        bhd.A01("onValueChange", this.A03);
    }

    /* JADX WARN: Incorrect types in method signature: (ZLX/AWd;LX/3UH;ZZLX/1YD;LX/G0U<-Ljava/lang/Boolean;Lkotlin/Unit;>;)V */
    public AXC(C3UH c3uh, InterfaceC1072AWd interfaceC1072AWd, C1YD c1yd, G0U g0u, boolean z, boolean z2, boolean z3) {
        this.A06 = z;
        this.A01 = interfaceC1072AWd;
        this.A00 = c3uh;
        this.A05 = z2;
        this.A04 = z3;
        this.A02 = c1yd;
        this.A03 = g0u;
    }
}
