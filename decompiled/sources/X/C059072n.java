package X;

/* renamed from: X.72n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C059072n implements C73D {
    public C76B A00 = C76B.A00;
    public C76X A01 = C72l.A00;

    @Override // X.C73D
    public final C73D A7J() {
        C059072n c059072n = new C059072n();
        c059072n.A00 = this.A00;
        c059072n.A01 = this.A01;
        return c059072n;
    }

    @Override // X.C73D
    public final C76B AHq() {
        return this.A00;
    }

    @Override // X.C73D
    public final void Ado(C76B c76b) {
        this.A00 = c76b;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EmittableCircularProgressIndicator(modifier=");
        sbA0x.append(this.A00);
        sbA0x.append(", color=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }
}
