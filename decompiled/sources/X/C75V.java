package X;

/* renamed from: X.75V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75V implements InterfaceC060673f {
    public final C71J A00;

    public static C76B A00(C76B c76b, C71J c71j) {
        return c76b.Agp(new C75V(c71j));
    }

    @Override // X.C76B
    public final /* synthetic */ C76B Agp(C76B c76b) {
        return c76b != C76B.A00 ? new C76A(this, c76b) : this;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ActionModifier(action=");
        sbA0x.append(this.A00);
        sbA0x.append(", rippleOverride=");
        sbA0x.append(0);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C75V(C71J c71j) {
        this.A00 = c71j;
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
