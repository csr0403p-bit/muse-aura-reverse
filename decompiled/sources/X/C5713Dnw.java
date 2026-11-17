package X;

/* renamed from: X.Dnw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5713Dnw {
    public final double A00;
    public final int A01;
    public final long A02;
    public final C5480DjH A03;
    public final C5838DqU A04;

    public C5713Dnw(C5480DjH c5480DjH, C5838DqU c5838DqU, double d, int i, long j) {
        this.A02 = j;
        this.A01 = i;
        this.A00 = d;
        this.A04 = c5838DqU;
        this.A03 = c5480DjH;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("{");
        sbA0x.append(this.A00);
        sbA0x.append(", bwe delta=");
        sbA0x.append(Math.round(this.A02 - this.A04.A00));
        sbA0x.append(" (C");
        sbA0x.append(this.A01);
        return AnonymousClass001.A0v(")}", sbA0x);
    }
}
