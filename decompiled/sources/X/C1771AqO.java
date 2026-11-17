package X;

import kotlin.Unit;

/* renamed from: X.AqO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1771AqO extends AbstractC1439Aj8 {
    public G0U<? super G0U<? super AaC, Unit>, Unit> A00;
    public final G0U<AaC, Unit> A01 = new C2326BUa(this, 6);

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        this.A00.invoke(this.A01);
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        this.A00.invoke(null);
    }

    public C1771AqO(G0U<? super G0U<? super AaC, Unit>, Unit> g0u) {
        this.A00 = g0u;
    }
}
