package X;

/* renamed from: X.76A, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C76A implements C76B {
    public final C76B A00;
    public final C76B A01;

    @Override // X.C76B
    public final boolean A4L(G0U<? super InterfaceC060673f, Boolean> g0u) {
        return this.A01.A4L(g0u) || this.A00.A4L(g0u);
    }

    @Override // X.C76B
    public final /* synthetic */ C76B Agp(C76B c76b) {
        return c76b != C76B.A00 ? new C76A(this, c76b) : this;
    }

    @Override // X.C76B
    public final boolean all(G0U<? super InterfaceC060673f, Boolean> g0u) {
        return this.A01.all(g0u) && this.A00.all(g0u);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C76A) {
            C76A c76a = (C76A) obj;
            if (this.A01.equals(c76a.A01) && C7384Etj.areEqual(this.A00, c76a.A00)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C76B
    public final <R> R foldIn(R r, G0V<? super R, ? super InterfaceC060673f, ? extends R> g0v) {
        return (R) this.A00.foldIn(this.A01.foldIn(r, g0v), g0v);
    }

    public final int hashCode() {
        return this.A01.hashCode() + AnonymousClass005.A0E(this.A00);
    }

    public final String toString() {
        return FGI.A0N("[", (String) foldIn("", new C8i0(0)), ']');
    }

    public C76A(C76B c76b, C76B c76b2) {
        this.A01 = c76b;
        this.A00 = c76b2;
    }
}
