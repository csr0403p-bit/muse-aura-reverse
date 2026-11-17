package X;

/* loaded from: classes5.dex */
public final class COX {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("id=");
        sbA0x.append(this.A04);
        sbA0x.append(",bw=");
        sbA0x.append(this.A00);
        sbA0x.append(",ttfb=");
        sbA0x.append(this.A03);
        sbA0x.append(",ts=");
        sbA0x.append(this.A02);
        sbA0x.append(",bwt=");
        return BV4.A0m(sbA0x, this.A01);
    }

    public COX(String str, long j, long j2, long j3, long j4) {
        this.A04 = str;
        this.A00 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = j4;
    }
}
