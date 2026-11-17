package X;

/* loaded from: classes5.dex */
public final class Dq8 {
    public static final Dq8 A0D = new Dq8(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Dq8) {
                Dq8 dq8 = (Dq8) obj;
                if (dq8.A03 != this.A03 || dq8.A00 != this.A00 || dq8.A07 != this.A07 || dq8.A06 != this.A06 || dq8.A08 != this.A08 || dq8.A02 != this.A02 || dq8.A09 != this.A09 || dq8.A01 != this.A01 || dq8.A0B != this.A0B || dq8.A04 != this.A04 || dq8.A05 != this.A05 || dq8.A0C != this.A0C) {
                }
            }
            return false;
        }
        return true;
    }

    public final Dq8 A00(int i, long j, long j2) {
        long j3 = this.A03;
        long j4 = this.A07;
        long j5 = this.A06;
        long j6 = this.A08;
        long j7 = this.A01;
        boolean z = this.A0B;
        return new Dq8(this.A0A, i, j3, j4, j5, j6, j, j2, j7, this.A04, this.A05, z, this.A0C);
    }

    public final int hashCode() {
        return AnonymousClass006.A06(this.A05, AnonymousClass006.A06(this.A04, (AnonymousClass006.A06(this.A01, AnonymousClass006.A06(this.A09, AnonymousClass006.A06(this.A02, AnonymousClass006.A06(this.A08, AnonymousClass006.A06(this.A06, AnonymousClass006.A06(this.A07, AnonymousClass006.A06(this.A00, AnonymousClass005.A07(this.A03)))))))) + ((int) BV5.A06(this.A0B ? 1 : 0))) * 31)) + ((int) (this.A0C ? 1L : 0L));
    }

    public Dq8(String str, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, boolean z2) {
        this.A03 = j;
        this.A00 = i;
        this.A07 = j2;
        this.A06 = j3;
        this.A08 = j4;
        this.A02 = j5;
        this.A09 = j6;
        this.A01 = j7;
        this.A0B = z;
        this.A04 = j8;
        this.A05 = j9;
        this.A0C = z2;
        this.A0A = str;
    }
}
