package X;

/* renamed from: X.75R, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75R implements InterfaceC060673f {
    public final C73P A00;
    public final C73P A01;
    public final C73P A02;
    public final C73P A03;
    public final C73P A04;
    public final C73P A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C75R) {
                C75R c75r = (C75R) obj;
                if (!this.A02.equals(c75r.A02) || !this.A04.equals(c75r.A04) || !this.A05.equals(c75r.A05) || !this.A03.equals(c75r.A03) || !this.A01.equals(c75r.A01) || !this.A00.equals(c75r.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C76B
    public final /* synthetic */ C76B Agp(C76B c76b) {
        return c76b != C76B.A00 ? new C76A(this, c76b) : this;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0F(this.A05, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0E(this.A02))))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PaddingModifier(left=");
        sbA0x.append(this.A02);
        sbA0x.append(C8j2.A00(14));
        sbA0x.append(this.A04);
        sbA0x.append(AnonymousClass000.A00(7));
        sbA0x.append(this.A05);
        sbA0x.append(AnonymousClass000.A00(18));
        sbA0x.append(this.A03);
        sbA0x.append(", end=");
        sbA0x.append(this.A01);
        sbA0x.append(AnonymousClass000.A00(17));
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C75R(C73P c73p, C73P c73p2, C73P c73p3, C73P c73p4, C73P c73p5, C73P c73p6) {
        this.A02 = c73p;
        this.A04 = c73p2;
        this.A05 = c73p3;
        this.A03 = c73p4;
        this.A01 = c73p5;
        this.A00 = c73p6;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public C75R() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(new C73P(0.0f, c0881AGi), new C73P(0.0f, c0881AGi), new C73P(0.0f, c0881AGi), new C73P(0.0f, c0881AGi), new C73P(0.0f, c0881AGi), new C73P(0.0f, c0881AGi));
    }
}
