package X;

import kotlin.Unit;

/* renamed from: X.Al7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1544Al7 extends Ab8<C1541Al4> {
    public final C1DM A00;
    public final G0U<InterfaceC2269BPv, Unit> A01;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1544Al7) {
                C1544Al7 c1544Al7 = (C1544Al7) obj;
                if (!C7384Etj.areEqual(this.A00, c1544Al7.A00) || this.A01 != c1544Al7.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C1DM c1dm = this.A00;
        G0U<InterfaceC2269BPv, Unit> g0u = this.A01;
        C1541Al4 c1541Al4 = new C1541Al4();
        c1541Al4.A05 = c1dm;
        c1541Al4.A09 = g0u;
        c1541Al4.A04 = 0L;
        c1541Al4.A03 = B6A.A01;
        c1541Al4.A00 = 1.0f;
        c1541Al4.A02 = 3;
        return c1541Al4;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "dropShadow";
        BHD bhd = asf.A02;
        bhd.A01("shape", this.A00);
        bhd.A01("block", this.A01);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1541Al4 c1541Al4 = (C1541Al4) abstractC1439Aj8;
        C1DM c1dm = this.A00;
        G0U<InterfaceC2269BPv, Unit> g0u = this.A01;
        if (!C7384Etj.areEqual(c1541Al4.A05, c1dm)) {
            c1541Al4.A05 = c1dm;
            C1541Al4.A00(c1541Al4);
        }
        if (c1541Al4.A09 != g0u) {
            c1541Al4.A09 = g0u;
            c1541Al4.A0A = false;
            AaD.A00(c1541Al4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1544Al7(C1DM c1dm, G0U<? super InterfaceC2269BPv, Unit> g0u) {
        this.A00 = c1dm;
        this.A01 = g0u;
    }
}
