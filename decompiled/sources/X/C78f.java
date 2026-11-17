package X;

/* renamed from: X.78f, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78f implements InterfaceC1559AlZ {
    public C78g A00;
    public final G0U<C0Yr, C78g> A01;

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        C78g c78g = this.A00;
        if (c78g != null) {
            c78g.dispose();
        }
        this.A00 = null;
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
        this.A00 = this.A01.invoke(C78e.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C78f(G0U<? super C0Yr, ? extends C78g> g0u) {
        this.A01 = g0u;
    }
}
