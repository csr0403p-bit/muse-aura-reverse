package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AQ4 extends Ab8<AQP> {
    public final APN A00;
    public final Function0<Boolean> A01;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new AQP(this.A00, this.A01);
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (obj instanceof AQ4) {
            AQ4 aq4 = (AQ4) obj;
            if (aq4.A01 == this.A01 && C7384Etj.areEqual(aq4.A00, this.A00)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + C60R.A01(this.A00);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "skipToLookahead";
        BHD bhd = asf.A02;
        bhd.A01("scaleToBounds", this.A00);
        bhd.A01("isEnabled", this.A01);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AQP aqp = (AQP) abstractC1439Aj8;
        aqp.A03.Af8(this.A00);
        aqp.A02.Af8(this.A01);
    }

    public AQ4(APN apn, Function0<Boolean> function0) {
        this.A00 = apn;
        this.A01 = function0;
    }

    public AQ4() {
        this(null, AbstractC1025AQj.A00);
    }
}
