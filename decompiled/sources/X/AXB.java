package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AXB extends Ab8<AXG> {
    public final C3UH A00;
    public final InterfaceC1072AWd A01;
    public final C1YD A02;
    public final String A03;
    public final String A04;
    public final Function0<Unit> A05;
    public final Function0<Unit> A06;
    public final boolean A07;
    public final boolean A08 = true;
    public final boolean A09;

    public AXB(C3UH c3uh, InterfaceC1072AWd interfaceC1072AWd, C1YD c1yd, String str, String str2, Function0 function0, Function0 function02, boolean z, boolean z2) {
        this.A01 = interfaceC1072AWd;
        this.A00 = c3uh;
        this.A09 = z;
        this.A07 = z2;
        this.A03 = str;
        this.A02 = c1yd;
        this.A05 = function0;
        this.A04 = str2;
        this.A06 = function02;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AXB axb = (AXB) obj;
                if (!C7384Etj.areEqual(this.A01, axb.A01) || !C7384Etj.areEqual(this.A00, axb.A00) || this.A09 != axb.A09 || this.A07 != axb.A07 || !C7384Etj.areEqual(this.A03, axb.A03) || !C7384Etj.areEqual(this.A02, axb.A02) || this.A05 != axb.A05 || !C7384Etj.areEqual(this.A04, axb.A04) || this.A06 != axb.A06 || this.A08 != axb.A08) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        boolean z;
        AXG axg = (AXG) abstractC1439Aj8;
        axg.A06 = this.A08;
        Function0<Unit> function0 = this.A05;
        String str = this.A04;
        Function0<Unit> function02 = this.A06;
        InterfaceC1072AWd interfaceC1072AWd = this.A01;
        C3UH c3uh = this.A00;
        boolean z2 = this.A09;
        boolean z3 = this.A07;
        String str2 = this.A03;
        C1YD c1yd = this.A02;
        if (!C7384Etj.areEqual(axg.A02, str)) {
            axg.A02 = str;
            AaW.A00(axg);
        }
        if (AnonymousClass002.A1Y(axg.A03) != AnonymousClass002.A1Y(function02)) {
            axg.A0J();
            AaW.A00(axg);
            z = true;
        } else {
            z = false;
        }
        axg.A03 = function02;
        if (((AX2) axg).A09 != z3) {
            z = true;
        }
        axg.A0L(c3uh, interfaceC1072AWd, c1yd, str2, function0, z2, z3);
        if (z) {
            AXG.A02(axg, false);
            AXG.A02(axg, true);
        }
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        Function0<Unit> function0 = this.A05;
        String str = this.A04;
        Function0<Unit> function02 = this.A06;
        boolean z = this.A08;
        InterfaceC1072AWd interfaceC1072AWd = this.A01;
        C3UH c3uh = this.A00;
        boolean z2 = this.A09;
        boolean z3 = this.A07;
        return new AXG(c3uh, interfaceC1072AWd, this.A02, str, this.A03, function0, function02, z, z2, z3);
    }

    @Override // X.Ab8
    public final int hashCode() {
        int iA01 = C60R.A01(this.A01) * 31;
        C3UH c3uh = this.A00;
        int iA012 = C0KA.A01(C0KA.A01((iA01 + (c3uh != null ? c3uh.hashCode() : 0)) * 31, this.A09), this.A07);
        String str = this.A03;
        int iHashCode = (iA012 + (str != null ? str.hashCode() : 0)) * 31;
        C1YD c1yd = this.A02;
        int iA0F = AnonymousClass005.A0F(this.A05, (iHashCode + (c1yd != null ? c1yd.A00 : 0)) * 31);
        String str2 = this.A04;
        return C0KA.A00((((iA0F + (str2 != null ? str2.hashCode() : 0)) * 31) + C60R.A01(this.A06)) * 31 * 31, this.A08);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "combinedClickable";
        BHD bhd = asf.A02;
        bhd.A01("indicationNodeFactory", this.A00);
        bhd.A01("interactionSource", this.A01);
        Ab8.A03(bhd, this.A07);
        bhd.A01("onClickLabel", this.A03);
        bhd.A01("role", this.A02);
        bhd.A01("onClick", this.A05);
        bhd.A01("onDoubleClick", null);
        bhd.A01("onLongClick", this.A06);
        bhd.A01("onLongClickLabel", this.A04);
        bhd.A01("hapticFeedbackEnabled", Boolean.valueOf(this.A08));
    }
}
