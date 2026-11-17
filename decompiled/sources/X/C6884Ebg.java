package X;

/* renamed from: X.Ebg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6884Ebg {
    public int A00;
    public long A01;
    public long A02;
    public String A03;
    public C6797Ea8 A04;
    public C6845Eax A05;
    public EnumC6905Ec1 A06;
    public Eb0 A07;
    public C6886Ebi A08;
    public C6886Ebi A09;
    public C6886Ebi A0A;
    public Eb4 A0B;
    public C6871EbT A0C;

    public final C6886Ebi A00() {
        int i = this.A00;
        if (i < 0) {
            throw C3cG.A0Q(AnonymousClass006.A0y(Integer.valueOf(i), "code < 0: ", C60O.A0w()));
        }
        Eb0 eb0 = this.A07;
        if (eb0 == null) {
            throw C3cG.A0Q("request == null");
        }
        EnumC6905Ec1 enumC6905Ec1 = this.A06;
        if (enumC6905Ec1 == null) {
            throw C3cG.A0Q("protocol == null");
        }
        String str = this.A03;
        if (str == null) {
            throw C3cG.A0Q("message == null");
        }
        C6797Ea8 c6797Ea8 = this.A04;
        C6844Eaw c6844EawA00 = this.A05.A00();
        Eb4 eb4 = this.A0B;
        return new C6886Ebi(str, c6797Ea8, c6844EawA00, enumC6905Ec1, eb0, this.A09, this.A08, this.A0A, eb4, this.A0C, i, this.A02, this.A01);
    }

    public C6884Ebg(C6886Ebi c6886Ebi) {
        this.A00 = -1;
        this.A07 = c6886Ebi.A07;
        this.A06 = c6886Ebi.A06;
        this.A00 = c6886Ebi.A00;
        this.A03 = c6886Ebi.A03;
        this.A04 = c6886Ebi.A04;
        this.A05 = c6886Ebi.A05.A04();
        this.A0B = c6886Ebi.A0B;
        this.A09 = c6886Ebi.A09;
        this.A08 = c6886Ebi.A08;
        this.A0A = c6886Ebi.A0A;
        this.A02 = c6886Ebi.A02;
        this.A01 = c6886Ebi.A01;
        this.A0C = c6886Ebi.A0C;
    }

    public C6884Ebg() {
        this.A00 = -1;
        this.A05 = new C6845Eax();
    }
}
