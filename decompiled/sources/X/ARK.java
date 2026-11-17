package X;

/* loaded from: classes4.dex */
public final class ARK extends Ab8<C2011AwO> {
    public final float A00;
    public final boolean A01;

    public static BRg A00(BRg bRg) {
        return bRg.then(new ARK(1.0f, true));
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            ARK ark = obj instanceof ARK ? (ARK) obj : null;
            if (ark == null || this.A00 != ark.A00 || this.A01 != ark.A01) {
                return false;
            }
        }
        return true;
    }

    public static BRg A01(BRg bRg, float f, boolean z) {
        return bRg.then(new ARK(f, z));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        float f = this.A00;
        boolean z = this.A01;
        C2011AwO c2011AwO = new C2011AwO();
        c2011AwO.A00 = f;
        c2011AwO.A01 = z;
        return c2011AwO;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00(C8j4.A04(this.A00), this.A01);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "weight";
        Float fValueOf = Float.valueOf(this.A00);
        asf.A00 = fValueOf;
        BHD bhd = asf.A02;
        bhd.A01("weight", fValueOf);
        bhd.A01("fill", Boolean.valueOf(this.A01));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C2011AwO c2011AwO = (C2011AwO) abstractC1439Aj8;
        c2011AwO.A00 = this.A00;
        c2011AwO.A01 = this.A01;
    }

    public ARK(float f, boolean z) {
        this.A00 = f;
        this.A01 = z;
    }
}
