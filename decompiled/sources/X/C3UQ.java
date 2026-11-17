package X;

import kotlin.Unit;

/* renamed from: X.3UQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3UQ extends Ab8<C3UR> {
    public final G0U<InterfaceC1497Ak4, Unit> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3UQ) && this.A00 == ((C3UQ) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<InterfaceC1497Ak4, Unit> g0u = this.A00;
        C3UR c3ur = new C3UR();
        c3ur.A00 = g0u;
        return c3ur;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "onPlaced";
        asf.A02.A01("onPlaced", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C3UR) abstractC1439Aj8).A00 = this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3UQ(G0U<? super InterfaceC1497Ak4, Unit> g0u) {
        this.A00 = g0u;
    }
}
