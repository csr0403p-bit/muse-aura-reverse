package X;

/* renamed from: X.DoQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5731DoQ {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final String A04;
    public final String A05;

    public C5731DoQ(String str, String str2, double d, double d2, double d3, double d4) {
        this.A02 = d;
        this.A01 = d2;
        this.A00 = d3;
        this.A03 = d4;
        this.A05 = str;
        this.A04 = str2;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("{");
        sbA0x.append(this.A02);
        sbA0x.append(", csvqm=");
        sbA0x.append(C5685DnQ.A00(1L, this.A01));
        sbA0x.append(", uumos=");
        sbA0x.append(C5685DnQ.A00(1L, this.A03));
        sbA0x.append(" (");
        sbA0x.append(this.A05);
        return AnonymousClass001.A0v(")}", sbA0x);
    }
}
