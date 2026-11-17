package X;

import kotlin.Unit;

/* renamed from: X.3UM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3UM extends Ab8<C3UN> {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final boolean A04;
    public final G0U<ASF, Unit> A05;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3UM) {
                C3UM c3um = (C3UM) obj;
                if (!C1DG.A08(this.A03, c3um.A03) || !C1DG.A08(this.A02, c3um.A02) || !C1DG.A08(this.A01, c3um.A01) || !C1DG.A08(this.A00, c3um.A00) || this.A04 != c3um.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        float f = this.A03;
        float f2 = this.A02;
        float f3 = this.A01;
        float f4 = this.A00;
        boolean z = this.A04;
        C3UN c3un = new C3UN();
        c3un.A03 = f;
        c3un.A02 = f2;
        c3un.A01 = f3;
        c3un.A00 = f4;
        c3un.A04 = z;
        return c3un;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(Float.floatToIntBits(this.A03) * 31, this.A02), this.A01), this.A00), this.A04);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        this.A05.invoke(asf);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C3UN c3un = (C3UN) abstractC1439Aj8;
        c3un.A03 = this.A03;
        c3un.A02 = this.A02;
        c3un.A01 = this.A01;
        c3un.A00 = this.A00;
        c3un.A04 = this.A04;
    }

    /* JADX WARN: Incorrect types in method signature: (FFFFZLX/G0U<-LX/ASF;Lkotlin/Unit;>;)V */
    public C3UM(G0U g0u, float f, float f2, float f3, float f4, boolean z) {
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = z;
        this.A05 = g0u;
    }
}
