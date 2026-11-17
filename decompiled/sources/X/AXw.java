package X;

/* loaded from: classes4.dex */
public final class AXw extends Ab8<AXx> {
    public final AOe<Float> A00;
    public final AOe<Float> A01;
    public final AOe<C2ae> A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AXw) {
                AXw aXw = (AXw) obj;
                if (!C7384Etj.areEqual(this.A00, aXw.A00) || !C7384Etj.areEqual(this.A02, aXw.A02) || !C7384Etj.areEqual(this.A01, aXw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        AOe<Float> aOe = this.A00;
        AOe<C2ae> aOe2 = this.A02;
        AOe<Float> aOe3 = this.A01;
        AXx aXx = new AXx();
        aXx.A00 = aOe;
        aXx.A02 = aOe2;
        aXx.A01 = aOe3;
        return aXx;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return (((AnonymousClass006.A0D(this.A00) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + C3cH.A02(this.A01);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "animateItem";
        BHD bhd = asf.A02;
        bhd.A01("fadeInSpec", this.A00);
        bhd.A01("placementSpec", this.A02);
        bhd.A01("fadeOutSpec", this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LazyLayoutAnimateItemElement(fadeInSpec=");
        sbA0x.append(this.A00);
        sbA0x.append(", placementSpec=");
        sbA0x.append(this.A02);
        sbA0x.append(", fadeOutSpec=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AXx aXx = (AXx) abstractC1439Aj8;
        aXx.A00 = this.A00;
        aXx.A02 = this.A02;
        aXx.A01 = this.A01;
    }

    public AXw(AOe<Float> aOe, AOe<C2ae> aOe2, AOe<Float> aOe3) {
        this.A00 = aOe;
        this.A02 = aOe2;
        this.A01 = aOe3;
    }
}
