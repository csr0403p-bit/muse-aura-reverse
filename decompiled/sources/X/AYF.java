package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AYF extends Ab8<AYH> {
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final G0U<ASF, Unit> A03;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            AYF ayf = obj instanceof AYF ? (AYF) obj : null;
            if (ayf == null || !C1DG.A08(this.A00, ayf.A00) || !C1DG.A08(this.A01, ayf.A01) || this.A02 != ayf.A02) {
                return false;
            }
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        float f = this.A00;
        float f2 = this.A01;
        boolean z = this.A02;
        AYH ayh = new AYH();
        ayh.A00 = f;
        ayh.A01 = f2;
        ayh.A02 = z;
        return ayh;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A02(C8j4.A04(this.A00), this.A01), this.A02);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        this.A03.invoke(asf);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("OffsetModifierElement(x=");
        C1DG.A07(sbA0x, this.A00);
        sbA0x.append(", y=");
        C1DG.A07(sbA0x, this.A01);
        sbA0x.append(", rtlAware=");
        sbA0x.append(this.A02);
        return AnonymousClass006.A0z(sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AYH ayh = (AYH) abstractC1439Aj8;
        float f = this.A00;
        float f2 = this.A01;
        boolean z = this.A02;
        if (!C1DG.A08(ayh.A00, f) || !C1DG.A08(ayh.A01, f2) || ayh.A02 != z) {
            AbstractC1414Aij.A04(ayh).A0c(false);
        }
        ayh.A00 = f;
        ayh.A01 = f2;
        ayh.A02 = z;
    }

    /* JADX WARN: Incorrect types in method signature: (FFZLX/G0U<-LX/ASF;Lkotlin/Unit;>;)V */
    public AYF(G0U g0u, float f, float f2, boolean z) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = z;
        this.A03 = g0u;
    }
}
