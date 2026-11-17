package X;

/* renamed from: X.Dj4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5469Dj4 extends C06G {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5469Dj4) {
                C5469Dj4 c5469Dj4 = (C5469Dj4) obj;
                if (this.A00 != c5469Dj4.A00 || this.A06 != c5469Dj4.A06 || this.A07 != c5469Dj4.A07 || this.A02 != c5469Dj4.A02 || this.A01 != c5469Dj4.A01 || this.A03 != c5469Dj4.A03 || this.A04 != c5469Dj4.A04 || this.A05 != c5469Dj4.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A05, AnonymousClass006.A06(this.A04, AnonymousClass006.A06(this.A03, (AnonymousClass006.A06(this.A02, C0KA.A01(AnonymousClass006.A06(this.A06, this.A00 * 31), this.A07)) + this.A01) * 31)));
    }

    public C5469Dj4(int i, int i2, long j, long j2, long j3, long j4, long j5, boolean z) {
        this.A00 = i;
        this.A06 = j;
        this.A07 = z;
        this.A02 = j2;
        this.A01 = i2;
        this.A03 = j3;
        this.A04 = j4;
        this.A05 = j5;
    }
}
