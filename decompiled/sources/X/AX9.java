package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AX9 extends Ab8<AXD> {
    public final C3UH A00;
    public final InterfaceC1072AWd A01;
    public final C1YD A02;
    public final Function0<Unit> A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AX9 ax9 = (AX9) obj;
                if (this.A05 != ax9.A05 || !C7384Etj.areEqual(this.A01, ax9.A01) || !C7384Etj.areEqual(this.A00, ax9.A00) || this.A06 != ax9.A06 || this.A04 != ax9.A04 || !C7384Etj.areEqual(this.A02, ax9.A02) || this.A03 != ax9.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AXD axd = (AXD) abstractC1439Aj8;
        boolean z = this.A05;
        InterfaceC1072AWd interfaceC1072AWd = this.A01;
        C3UH c3uh = this.A00;
        boolean z2 = this.A06;
        boolean z3 = this.A04;
        C1YD c1yd = this.A02;
        Function0<Unit> function0 = this.A03;
        if (axd.A00 != z) {
            axd.A00 = z;
            AaW.A00(axd);
        }
        axd.A0L(c3uh, interfaceC1072AWd, c1yd, null, function0, z2, z3);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        boolean z = this.A05;
        InterfaceC1072AWd interfaceC1072AWd = this.A01;
        AXD axd = new AXD(this.A00, interfaceC1072AWd, this.A02, null, this.A03, this.A06, this.A04);
        axd.A00 = z;
        return axd;
    }

    @Override // X.Ab8
    public final int hashCode() {
        int iA02 = (C0KA.A02(this.A05) + C60R.A01(this.A01)) * 31;
        C3UH c3uh = this.A00;
        int iA01 = C0KA.A01(C0KA.A01((iA02 + (c3uh != null ? c3uh.hashCode() : 0)) * 31, this.A06), this.A04);
        C1YD c1yd = this.A02;
        return AnonymousClass005.A0G(this.A03, (iA01 + (c1yd != null ? c1yd.A00 : 0)) * 31);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "selectable";
        BHD bhd = asf.A02;
        bhd.A01("selected", Boolean.valueOf(this.A05));
        bhd.A01("interactionSource", this.A01);
        bhd.A01("indicationNodeFactory", this.A00);
        Ab8.A03(bhd, this.A04);
        bhd.A01("role", this.A02);
        bhd.A01("onClick", this.A03);
    }

    /* JADX WARN: Incorrect types in method signature: (ZLX/AWd;LX/3UH;ZZLX/1YD;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public AX9(C3UH c3uh, InterfaceC1072AWd interfaceC1072AWd, C1YD c1yd, Function0 function0, boolean z, boolean z2, boolean z3) {
        this.A05 = z;
        this.A01 = interfaceC1072AWd;
        this.A00 = c3uh;
        this.A06 = z2;
        this.A04 = z3;
        this.A02 = c1yd;
        this.A03 = function0;
    }
}
