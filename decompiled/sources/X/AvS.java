package X;

import android.view.View;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AvS extends Ab8<AvQ> {
    public final AVi A04;
    public final G0U<C73O, Unit> A05;
    public final G0U<AXN, AWx> A06;
    public final float A02 = Float.NaN;
    public final boolean A08 = true;
    public final long A03 = 9205357640488583168L;
    public final float A00 = Float.NaN;
    public final float A01 = Float.NaN;
    public final boolean A07 = true;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvS) {
                AvS avS = (AvS) obj;
                if (this.A06 != avS.A06 || this.A02 != avS.A02 || this.A08 != avS.A08 || this.A03 != avS.A03 || !C1DG.A08(this.A00, avS.A00) || !C1DG.A08(this.A01, avS.A01) || this.A07 != avS.A07 || this.A05 != avS.A05 || !C7384Etj.areEqual(this.A04, avS.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public AvS(AVi aVi, G0U g0u, G0U g0u2) {
        this.A06 = g0u;
        this.A05 = g0u2;
        this.A04 = aVi;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<AXN, AWx> g0u = this.A06;
        float f = this.A02;
        boolean z = this.A08;
        long j = this.A03;
        float f2 = this.A00;
        float f3 = this.A01;
        boolean z2 = this.A07;
        return new AvQ(this.A04, g0u, this.A05, f, f2, f3, j, z, z2);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, (C0KA.A01(AnonymousClass005.A02(AnonymousClass005.A02(C60R.A00(this.A03, C0KA.A01(AnonymousClass005.A02(AnonymousClass005.A0E(this.A06) * 31, this.A02), this.A08)), this.A00), this.A01), this.A07) + C8j4.A0E(this.A05, 0)) * 31);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "magnifier";
        BHD bhd = asf.A02;
        bhd.A01("sourceCenter", this.A06);
        bhd.A01("magnifierCenter", null);
        bhd.A01("zoom", Float.valueOf(this.A02));
        bhd.A01("size", new C73O(this.A03));
        bhd.A01("cornerRadius", C8j3.A0k(this.A00));
        bhd.A01("elevation", C8j3.A0k(this.A01));
        bhd.A01("clippingEnabled", Boolean.valueOf(this.A07));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AvQ avQ = (AvQ) abstractC1439Aj8;
        G0U<AXN, AWx> g0u = this.A06;
        float f = this.A02;
        boolean z = this.A08;
        long j = this.A03;
        float f2 = this.A00;
        float f3 = this.A01;
        boolean z2 = this.A07;
        G0U<C73O, Unit> g0u2 = this.A05;
        AVi aVi = this.A04;
        long j2 = avQ.A03;
        float f4 = avQ.A00;
        boolean z3 = avQ.A0E;
        float f5 = avQ.A01;
        boolean z4 = avQ.A0D;
        AVi aVi2 = avQ.A07;
        View view = avQ.A05;
        AXN axn = avQ.A09;
        avQ.A0B = g0u;
        avQ.A02 = f;
        avQ.A0E = z;
        avQ.A03 = j;
        avQ.A00 = f2;
        avQ.A01 = f3;
        avQ.A0D = z2;
        avQ.A0A = g0u2;
        avQ.A07 = aVi;
        View viewA00 = AbstractC1329AhG.A00(avQ);
        AXN axnA08 = AbstractC1414Aij.A08(avQ);
        if (avQ.A06 != null && (j != j2 || !C1DG.A08(f2, f4) || !C1DG.A08(f3, f5) || z != z3 || z2 != z4 || !C7384Etj.areEqual(aVi, aVi2) || !C7384Etj.areEqual(viewA00, view) || !C7384Etj.areEqual(axnA08, axn))) {
            AvQ.A01(avQ);
        }
        AvQ.A02(avQ);
    }
}
