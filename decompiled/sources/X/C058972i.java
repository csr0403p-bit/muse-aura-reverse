package X;

/* renamed from: X.72i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C058972i extends C72j {
    public C76B A00 = C76B.A00;

    @Override // X.C73D
    public final C73D A7J() {
        C058972i c058972i = new C058972i();
        c058972i.A00 = this.A00;
        c058972i.A02 = this.A02;
        c058972i.A01 = this.A01;
        ((C72j) c058972i).A00 = super.A00;
        return c058972i;
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
        StringBuilder sbA0x = C60O.A0x("EmittableText(");
        sbA0x.append(this.A02);
        sbA0x.append(", style=");
        sbA0x.append(this.A01);
        sbA0x.append(", modifier=");
        sbA0x.append(this.A00);
        sbA0x.append(C8j2.A00(10));
        sbA0x.append(super.A00);
        return AnonymousClass006.A0z(sbA0x);
    }
}
