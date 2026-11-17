package X;

/* loaded from: classes5.dex */
public final class E6E {
    public final E76 A00;
    public final Dn6 A01;
    public final E6B A02 = new E6B();
    public final E7C A03;
    public final InterfaceC6459E6s A04;
    public final E7Z A05;
    public final E67 A06;
    public final E69 A07;
    public final E66 A08;
    public final E6H A09;

    public E6E(Dn6 dn6, E7C e7c, E7Z e7z, int i, int i2, int i3, int i4) {
        this.A01 = dn6;
        this.A05 = e7z;
        this.A03 = e7c;
        C6438E5q c6438E5q = (C6438E5q) dn6;
        this.A04 = e7c.A7o(new C7571F4k(this, 1), c6438E5q.A0c);
        this.A06 = new E67(this, i);
        this.A07 = new E69(this, i2);
        this.A08 = new E66(this, i3);
        this.A09 = new E6H(this, i4);
        E6F e6f = new E6F(this);
        this.A00 = e6f;
        c6438E5q.A0j.A04(e6f);
    }
}
