package X;

/* renamed from: X.Doh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5746Doh {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C5702Dnj A09;
    public final C5702Dnj A0A;

    public final void A00(long j, boolean z, boolean z2) {
        this.A01 = z;
        this.A0A.A03(z && (z2 || !A01()), j);
        C5702Dnj c5702Dnj = this.A09;
        if (c5702Dnj != null) {
            if (this.A00 == Long.MIN_VALUE) {
                this.A00 = j;
            }
            c5702Dnj.A03(z && z2, j);
        }
    }

    public final boolean A01() {
        int i = this.A03;
        return i == 1 || i == 2 || i == 3;
    }

    public C5746Doh(int i, int i2, int i3, long j, long j2, long j3, long j4) {
        this.A03 = i;
        this.A08 = j;
        this.A05 = j2;
        this.A06 = j3;
        this.A02 = i2;
        this.A07 = j4;
        this.A04 = i3;
        this.A0A = new C5702Dnj(j, j2);
        this.A09 = (1 > i3 || i3 >= 101 || !(i == 2 || i == 3)) ? null : new C5702Dnj(20000L, 0L);
        this.A00 = Long.MIN_VALUE;
    }
}
