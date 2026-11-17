package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AbW extends Ab8<BH6> {
    public static final G0U<C1312Agx, Boolean> A04 = C2278BSe.A00(33);
    public final BV1 A00;
    public final G0U<AWx, Unit> A01;
    public final G0U<C1251Afj, Unit> A02;
    public final boolean A03;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AbW abW = (AbW) obj;
                if (!C7384Etj.areEqual(this.A00, abW.A00) || this.A03 != abW.A03 || this.A01 != abW.A01 || this.A02 != abW.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        boolean z;
        BH6 bh6 = (BH6) abstractC1439Aj8;
        BV1 bv1 = this.A00;
        G0U<C1312Agx, Boolean> g0u = A04;
        boolean z2 = this.A03;
        G0U<AWx, Unit> g0u2 = this.A01;
        G0U<C1251Afj, Unit> g0u3 = this.A02;
        if (C7384Etj.areEqual(bh6.A00, bv1)) {
            z = false;
        } else {
            bh6.A00 = bv1;
            z = true;
        }
        bh6.A01 = g0u2;
        bh6.A02 = g0u3;
        bh6.A0M(null, null, g0u, z2, z);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        BV1 bv1 = this.A00;
        G0U<C1312Agx, Boolean> g0u = A04;
        boolean z = this.A03;
        G0U<AWx, Unit> g0u2 = this.A01;
        G0U<C1251Afj, Unit> g0u3 = this.A02;
        BH6 bh6 = new BH6(null, null, g0u, z);
        bh6.A00 = bv1;
        bh6.A01 = g0u2;
        bh6.A02 = g0u3;
        return bh6;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A01, ((C0KA.A01(AnonymousClass005.A0E(this.A00), this.A03) * 31) + 1237) * 31)) + 1237;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "draggable2D";
        BHD bhd = asf.A02;
        Ab8.A03(bhd, this.A03);
        bhd.A01("interactionSource", null);
        Boolean boolA0h = AnonymousClass001.A0h();
        bhd.A01("startDragImmediately", boolA0h);
        bhd.A01("onDragStarted", this.A01);
        bhd.A01("onDragStopped", this.A02);
        bhd.A01("reverseDirection", boolA0h);
        bhd.A01("state", this.A00);
    }

    public AbW(BV1 bv1, G0U g0u, G0U g0u2, boolean z) {
        this.A00 = bv1;
        this.A03 = z;
        this.A01 = g0u;
        this.A02 = g0u2;
    }
}
