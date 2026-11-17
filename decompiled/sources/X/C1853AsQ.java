package X;

/* renamed from: X.AsQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1853AsQ extends Ab8<C1852AsP> {
    public final int A00;
    public final int A01;
    public final C1822Arm A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1853AsQ) {
                C1853AsQ c1853AsQ = (C1853AsQ) obj;
                if (!C7384Etj.areEqual(this.A02, c1853AsQ.A02) || this.A01 != c1853AsQ.A01 || this.A00 != c1853AsQ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C1822Arm c1822Arm = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        C1852AsP c1852AsP = new C1852AsP();
        c1852AsP.A06 = c1822Arm;
        c1852AsP.A01 = i;
        c1852AsP.A00 = i2;
        c1852AsP.A03 = -1;
        c1852AsP.A02 = -1;
        return c1852AsP;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A02) + this.A01) * 31) + this.A00;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "heightInLines";
        BHD bhd = asf.A02;
        bhd.A01("minLines", Integer.valueOf(this.A01));
        bhd.A01("maxLines", Integer.valueOf(this.A00));
        bhd.A01("textStyle", this.A02);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1852AsP c1852AsP = (C1852AsP) abstractC1439Aj8;
        C1822Arm c1822Arm = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        if (C7384Etj.areEqual(c1852AsP.A06, c1822Arm) && c1852AsP.A01 == i && c1852AsP.A00 == i2) {
            return;
        }
        c1852AsP.A06 = c1822Arm;
        c1852AsP.A01 = i;
        c1852AsP.A00 = i2;
        c1852AsP.A05 = AbstractC1823Arn.A01(c1822Arm, AbstractC1414Aij.A04(c1852AsP).A0G);
        c1852AsP.A07 = true;
        AbstractC1339AhQ.A00(c1852AsP);
    }

    public C1853AsQ(C1822Arm c1822Arm, int i, int i2) {
        this.A02 = c1822Arm;
        this.A01 = i;
        this.A00 = i2;
    }
}
