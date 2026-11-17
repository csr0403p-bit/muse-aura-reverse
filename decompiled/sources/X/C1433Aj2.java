package X;

import com.sun.jna.Callback;

/* renamed from: X.Aj2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1433Aj2 extends Ab8<C1432Aj1> {
    public final float A00;
    public final long A01;
    public final EnumC10573Huf A02;
    public final G0U A03;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C1433Aj2 c1433Aj2 = (C1433Aj2) obj;
                if (this.A01 != c1433Aj2.A01 || this.A00 != c1433Aj2.A00 || this.A02 != c1433Aj2.A02 || this.A03 != c1433Aj2.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        C7384Etj.A0Y(asf, 0);
        asf.A01 = "onVisible";
        BHD bhd = asf.A02;
        bhd.A01("minDurationMs", Long.valueOf(this.A01));
        bhd.A01("minFractionVisible", Float.valueOf(this.A00));
        bhd.A01("viewportBounds", null);
        bhd.A01("minLifecycleState", this.A02);
        bhd.A01("hostVisibilitySignal", null);
        bhd.A01("clipToHostVisibleRect", false);
        bhd.A01(Callback.METHOD_NAME, this.A03);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        long j = this.A01;
        return new C1432Aj1(this.A02, this.A03, this.A00, j);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, ((AnonymousClass005.A0F(this.A02, AnonymousClass005.A02(C3cI.A01(this.A01), this.A00) * 31) * 31) + 1237) * 31);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1432Aj1 c1432Aj1 = (C1432Aj1) abstractC1439Aj8;
        C7384Etj.A0Y(c1432Aj1, 0);
        c1432Aj1.A01 = this.A01;
        c1432Aj1.A00 = this.A00;
        G0U g0u = this.A03;
        C7384Etj.A0Y(g0u, 0);
        c1432Aj1.A05 = g0u;
        C2LD c2ld = c1432Aj1.A02;
        if (c2ld != null) {
            C1432Aj1.A00(c2ld, c1432Aj1, c1432Aj1.A00);
        }
    }

    public C1433Aj2(EnumC10573Huf enumC10573Huf, G0U g0u, float f, long j) {
        this.A01 = j;
        this.A00 = f;
        this.A02 = enumC10573Huf;
        this.A03 = g0u;
    }
}
