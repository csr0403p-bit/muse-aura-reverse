package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AYR extends Ab8<AYQ> {
    public final C0lh A00;
    public final boolean A01 = true;
    public final G0U<ASF, Unit> A02;

    public AYR(C0lh c0lh, G0U g0u) {
        this.A00 = c0lh;
        this.A02 = g0u;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            AYR ayr = obj instanceof AYR ? (AYR) obj : null;
            if (ayr == null || this.A00 != ayr.A00 || this.A01 != ayr.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C0lh c0lh = this.A00;
        boolean z = this.A01;
        AYQ ayq = new AYQ();
        ayq.A00 = c0lh;
        ayq.A01 = z;
        return ayq;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.A00), this.A01);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        this.A02.invoke(asf);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AYQ ayq = (AYQ) abstractC1439Aj8;
        ayq.A00 = this.A00;
        ayq.A01 = this.A01;
    }
}
