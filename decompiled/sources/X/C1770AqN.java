package X;

import kotlin.Unit;

/* renamed from: X.AqN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1770AqN extends Ab8<C1771AqO> {
    public final G0U<G0U<? super AaC, Unit>, Unit> A00;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new C1771AqO(this.A00);
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C1770AqN) && this.A00 == ((C1770AqN) obj).A00;
        }
        return true;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "requestRectangleBringIntoViewBridge";
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1771AqO c1771AqO = (C1771AqO) abstractC1439Aj8;
        G0U<G0U<? super AaC, Unit>, Unit> g0u = this.A00;
        c1771AqO.A00 = g0u;
        if (c1771AqO.isAttached) {
            g0u.invoke(c1771AqO.A01);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1770AqN(G0U<? super G0U<? super AaC, Unit>, Unit> g0u) {
        this.A00 = g0u;
    }
}
