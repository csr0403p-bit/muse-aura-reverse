package X;

/* renamed from: X.75U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75U implements InterfaceC060673f {
    public final C72e A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75U) && this.A00.equals(((C75U) obj).A00));
    }

    @Override // X.C76B
    public final /* synthetic */ C76B Agp(C76B c76b) {
        return c76b != C76B.A00 ? new C76A(this, c76b) : this;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("CornerRadiusModifier(radius="));
    }

    public C75U(C72e c72e) {
        this.A00 = c72e;
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
