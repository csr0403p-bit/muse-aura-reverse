package X;

/* renamed from: X.73k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C061173k implements C73D {
    public C72W A01;
    public C71K A03;
    public Float A04;
    public C76B A02 = C76B.A00;
    public int A00 = 1;

    @Override // X.C73D
    public final C73D A7J() {
        C061173k c061173k = new C061173k();
        c061173k.A02 = this.A02;
        c061173k.A03 = this.A03;
        c061173k.A01 = this.A01;
        c061173k.A04 = this.A04;
        c061173k.A00 = this.A00;
        return c061173k;
    }

    @Override // X.C73D
    public final C76B AHq() {
        return this.A02;
    }

    @Override // X.C73D
    public final void Ado(C76B c76b) {
        this.A02 = c76b;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EmittableImage(modifier=");
        sbA0x.append(this.A02);
        sbA0x.append(", provider=");
        sbA0x.append(this.A03);
        sbA0x.append(", colorFilterParams=");
        sbA0x.append(this.A01);
        sbA0x.append(", alpha=");
        sbA0x.append(this.A04);
        sbA0x.append(", contentScale=");
        sbA0x.append((Object) FGI.A0G("ContentScale(value=", ')', this.A00));
        sbA0x.append(')');
        return sbA0x.toString();
    }
}
