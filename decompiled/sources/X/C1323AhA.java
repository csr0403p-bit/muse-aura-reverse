package X;

/* renamed from: X.AhA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1323AhA extends Ab8<C1322Ah9> {
    public final C5V9 A00;
    public final G0U<AWx, Boolean> A01;
    public final boolean A02 = true;

    public C1323AhA(C5V9 c5v9, G0U g0u) {
        this.A00 = c5v9;
        this.A01 = g0u;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C1323AhA c1323AhA = (C1323AhA) obj;
                if (!C7384Etj.areEqual(this.A00, c1323AhA.A00) || this.A01 != c1323AhA.A01 || this.A02 != c1323AhA.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new C1322Ah9(this.A00, this.A01, this.A02);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A00)) + 1237) * 31, this.A02);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "transformable";
        BHD bhd = asf.A02;
        bhd.A01("state", this.A00);
        bhd.A01("canPan", this.A01);
        Ab8.A03(bhd, this.A02);
        bhd.A01("lockRotationOnZoomPan", AnonymousClass001.A0h());
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1322Ah9 c1322Ah9 = (C1322Ah9) abstractC1439Aj8;
        C5V9 c5v9 = this.A00;
        G0U<AWx, Boolean> g0u = this.A01;
        boolean z = this.A02;
        c1322Ah9.A01 = g0u;
        if (C7384Etj.areEqual(c1322Ah9.A00, c5v9) && c1322Ah9.A02 == z) {
            return;
        }
        c1322Ah9.A00 = c5v9;
        c1322Ah9.A02 = z;
        c1322Ah9.A05.AbO();
    }
}
