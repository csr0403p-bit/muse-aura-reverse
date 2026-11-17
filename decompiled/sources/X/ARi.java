package X;

import androidx.compose.ui.Alignment;

/* loaded from: classes4.dex */
public final class ARi extends Ab8<C1030ARg> {
    public final AOe<BL4> A00;
    public final Alignment A01;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new C1030ARg(this.A00, this.A01);
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (obj instanceof ARi) {
            ARi aRi = (ARi) obj;
            if (C7384Etj.areEqual(aRi.A00, this.A00) && C7384Etj.areEqual(aRi.A01, this.A01)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A00));
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "animateContentSize";
        BHD bhd = asf.A02;
        bhd.A01("animationSpec", this.A00);
        bhd.A01("alignment", this.A01);
        bhd.A01("finishedListener", null);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1030ARg c1030ARg = (C1030ARg) abstractC1439Aj8;
        c1030ARg.A01 = this.A00;
        c1030ARg.A02 = this.A01;
    }

    public ARi(AOe aOe, Alignment alignment) {
        this.A00 = aOe;
        this.A01 = alignment;
    }
}
