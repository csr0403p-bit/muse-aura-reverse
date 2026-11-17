package X;

/* renamed from: X.75X, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75X implements InterfaceC060573e {
    public final C76X A00;

    @Override // X.C76B
    public final /* synthetic */ C76B Agp(C76B c76b) {
        return c76b != C76B.A00 ? new C76A(this, c76b) : this;
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("BackgroundModifier(colorProvider="));
    }

    public C75X(C76X c76x) {
        this.A00 = c76x;
    }

    @Override // X.C76B
    public final /* synthetic */ boolean A4L(G0U g0u) {
        return AnonymousClass003.A1X(this, g0u);
    }

    @Override // X.C76B
    public final /* synthetic */ boolean all(G0U g0u) {
        return AnonymousClass003.A1X(this, g0u);
    }

    @Override // X.C76B
    public final /* synthetic */ Object foldIn(Object obj, G0V g0v) {
        return g0v.invoke(obj, this);
    }
}
