package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AW5 extends Ab8<AW4> {
    public final float A00 = 1.0f;
    public final long A01;
    public final C1EQ A02;
    public final C1DM A03;
    public final G0U<ASF, Unit> A04;

    public AW5(C1EQ c1eq, C1DM c1dm, G0U g0u, long j) {
        this.A01 = j;
        this.A02 = c1eq;
        this.A03 = c1dm;
        this.A04 = g0u;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        long j = this.A01;
        C1EQ c1eq = this.A02;
        float f = this.A00;
        C1DM c1dm = this.A03;
        AW4 aw4 = new AW4();
        aw4.A01 = j;
        aw4.A03 = c1eq;
        aw4.A00 = f;
        aw4.A07 = c1dm;
        aw4.A02 = 9205357640488583168L;
        return aw4;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        AW5 aw5 = obj instanceof AW5 ? (AW5) obj : null;
        if (aw5 == null) {
            return false;
        }
        long j = this.A01;
        long j2 = aw5.A01;
        long j3 = B6A.A01;
        if (j == j2 && C7384Etj.areEqual(this.A02, aw5.A02) && this.A00 == aw5.A00) {
            return C8j3.A1W(this.A03, aw5.A03, false);
        }
        return false;
    }

    @Override // X.Ab8
    public final int hashCode() {
        long j = this.A01;
        long j2 = B6A.A01;
        return AnonymousClass005.A0G(this.A03, AnonymousClass005.A02((C3cI.A01(j) + C60R.A01(this.A02)) * 31, this.A00));
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        this.A04.invoke(asf);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AW4 aw4 = (AW4) abstractC1439Aj8;
        aw4.A01 = this.A01;
        aw4.A03 = this.A02;
        aw4.A00 = this.A00;
        C1DM c1dm = aw4.A07;
        C1DM c1dm2 = this.A03;
        if (!C7384Etj.areEqual(c1dm, c1dm2)) {
            aw4.A07 = c1dm2;
            AaW.A00(aw4);
        }
        AaD.A00(aw4);
    }
}
