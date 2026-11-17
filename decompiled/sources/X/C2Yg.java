package X;

import androidx.compose.ui.Alignment;
import kotlin.Unit;

/* renamed from: X.2Yg, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Yg extends Ab8<C2Yh> {
    public final Alignment A00;
    public final boolean A01;
    public final G0U<ASF, Unit> A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            C2Yg c2Yg = obj instanceof C2Yg ? (C2Yg) obj : null;
            if (c2Yg == null || !C7384Etj.areEqual(this.A00, c2Yg.A00) || this.A01 != c2Yg.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        Alignment alignment = this.A00;
        boolean z = this.A01;
        C2Yh c2Yh = new C2Yh();
        c2Yh.A00 = alignment;
        c2Yh.A01 = z;
        return c2Yh;
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
        C2Yh c2Yh = (C2Yh) abstractC1439Aj8;
        c2Yh.A00 = this.A00;
        c2Yh.A01 = this.A01;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/Alignment;ZLX/G0U<-LX/ASF;Lkotlin/Unit;>;)V */
    public C2Yg(Alignment alignment, G0U g0u, boolean z) {
        this.A00 = alignment;
        this.A01 = z;
        this.A02 = g0u;
    }
}
