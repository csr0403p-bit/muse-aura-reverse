package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AXA extends Ab8<AXF> {
    public final C3UH A00;
    public final InterfaceC1072AWd A01;
    public final C1YD A02;
    public final String A03;
    public final Function0<Unit> A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AXA axa = (AXA) obj;
                if (!C7384Etj.areEqual(this.A01, axa.A01) || !C7384Etj.areEqual(this.A00, axa.A00) || this.A06 != axa.A06 || this.A05 != axa.A05 || !C7384Etj.areEqual(this.A03, axa.A03) || !C7384Etj.areEqual(this.A02, axa.A02) || this.A04 != axa.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        InterfaceC1072AWd interfaceC1072AWd = this.A01;
        C3UH c3uh = this.A00;
        boolean z = this.A06;
        boolean z2 = this.A05;
        ((AX2) abstractC1439Aj8).A0L(c3uh, interfaceC1072AWd, this.A02, this.A03, this.A04, z, z2);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        InterfaceC1072AWd interfaceC1072AWd = this.A01;
        C3UH c3uh = this.A00;
        boolean z = this.A06;
        boolean z2 = this.A05;
        return new AXF(c3uh, interfaceC1072AWd, this.A02, this.A03, this.A04, z, z2);
    }

    @Override // X.Ab8
    public final int hashCode() {
        int iA01 = C60R.A01(this.A01) * 31;
        C3UH c3uh = this.A00;
        int iA012 = C0KA.A01(C0KA.A01((iA01 + (c3uh != null ? c3uh.hashCode() : 0)) * 31, this.A06), this.A05);
        String str = this.A03;
        int iHashCode = (iA012 + (str != null ? str.hashCode() : 0)) * 31;
        C1YD c1yd = this.A02;
        return AnonymousClass005.A0G(this.A04, (iHashCode + (c1yd != null ? c1yd.A00 : 0)) * 31);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "clickable";
        BHD bhd = asf.A02;
        Ab8.A03(bhd, this.A05);
        bhd.A01("onClick", this.A04);
        bhd.A01("onClickLabel", this.A03);
        bhd.A01("role", this.A02);
        bhd.A01("interactionSource", this.A01);
        bhd.A01("indicationNodeFactory", this.A00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AWd;LX/3UH;ZZLjava/lang/String;LX/1YD;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public AXA(C3UH c3uh, InterfaceC1072AWd interfaceC1072AWd, C1YD c1yd, String str, Function0 function0, boolean z, boolean z2) {
        this.A01 = interfaceC1072AWd;
        this.A00 = c3uh;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = str;
        this.A02 = c1yd;
        this.A04 = function0;
    }
}
