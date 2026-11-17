package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AYE extends Ab8<AYG> {
    public final G0U<AXN, C2ae> A00;
    public final boolean A01;
    public final G0U<ASF, Unit> A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            AYE aye = obj instanceof AYE ? (AYE) obj : null;
            if (aye == null || this.A00 != aye.A00 || this.A01 != aye.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<AXN, C2ae> g0u = this.A00;
        boolean z = this.A01;
        AYG ayg = new AYG();
        ayg.A00 = g0u;
        ayg.A01 = z;
        return ayg;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.A00), this.A01);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        this.A02.invoke(asf);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("OffsetPxModifier(offset=");
        sbA0x.append(this.A00);
        sbA0x.append(", rtlAware=");
        sbA0x.append(this.A01);
        return AnonymousClass006.A0z(sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AYG ayg = (AYG) abstractC1439Aj8;
        G0U<AXN, C2ae> g0u = this.A00;
        boolean z = this.A01;
        if (ayg.A00 != g0u || ayg.A01 != z) {
            AbstractC1414Aij.A04(ayg).A0c(false);
        }
        ayg.A00 = g0u;
        ayg.A01 = z;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/AXN;LX/2ae;>;ZLX/G0U<-LX/ASF;Lkotlin/Unit;>;)V */
    public AYE(G0U g0u, G0U g0u2, boolean z) {
        this.A00 = g0u;
        this.A01 = z;
        this.A02 = g0u2;
    }
}
