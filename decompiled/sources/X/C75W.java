package X;

/* renamed from: X.75W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75W implements InterfaceC060673f {
    public final C060973i A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75W) && this.A00.equals(((C75W) obj).A00));
    }

    @Override // X.C76B
    public final /* synthetic */ C76B Agp(C76B c76b) {
        return c76b != C76B.A00 ? new C76A(this, c76b) : this;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("SemanticsModifier(configuration="));
    }

    public C75W(C060973i c060973i) {
        this.A00 = c060973i;
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
