package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class AQQ extends Ab8<AQM> {
    public final APh A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AQQ) && C7384Etj.areEqual(this.A00, ((AQQ) obj).A00));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new AQM(this.A00);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "sharedBounds";
        asf.A02.A01("sharedElementState", this.A00);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("SharedBoundsNodeElement(sharedElementState="));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AQM aqm = (AQM) abstractC1439Aj8;
        APh aPh = this.A00;
        if (C7384Etj.areEqual(aPh, aqm.A00)) {
            return;
        }
        MutableState.A09(false, aqm.A00.A05);
        aqm.A00 = aPh;
        MutableState.A09(aqm.isAttached, aPh.A05);
        if (aqm.isAttached) {
            AQM.A00(aqm);
        }
    }

    public AQQ(APh aPh) {
        this.A00 = aPh;
    }
}
