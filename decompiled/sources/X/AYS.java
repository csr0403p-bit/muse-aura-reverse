package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AYS extends Ab8<AYT> {
    public final C0lh A00;
    public final boolean A01 = true;
    public final G0U<ASF, Unit> A02;

    public AYS(C0lh c0lh, G0U g0u) {
        this.A00 = c0lh;
        this.A02 = g0u;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            AYS ays = obj instanceof AYS ? (AYS) obj : null;
            if (ays == null || this.A00 != ays.A00 || this.A01 != ays.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C0lh c0lh = this.A00;
        boolean z = this.A01;
        AYT ayt = new AYT();
        ayt.A00 = c0lh;
        ayt.A01 = z;
        return ayt;
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
        AYT ayt = (AYT) abstractC1439Aj8;
        ayt.A00 = this.A00;
        ayt.A01 = this.A01;
    }
}
