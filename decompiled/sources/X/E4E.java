package X;

/* loaded from: classes5.dex */
public final class E4E implements E5W {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public final int A00() {
        int i = this.A04;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        CNC.A04("AviStreamHeaderChunk", FGI.A0M("Found unsupported streamType fourCC: ", Integer.toHexString(i)));
        return -1;
    }

    public E4E(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A04 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A05 = i5;
        this.A02 = i6;
    }

    @Override // X.E5W
    public final int AM8() {
        return 1752331379;
    }
}
