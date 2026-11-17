package X;

/* renamed from: X.0jF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0jF {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C0jF)) {
                long j = this.A04;
                C0jF c0jF = (C0jF) obj;
                long j2 = c0jF.A04;
                long j3 = B6A.A01;
                if (j != j2 || this.A03 != c0jF.A03 || this.A05 != c0jF.A05 || this.A01 != c0jF.A01 || this.A00 != c0jF.A00 || this.A02 != c0jF.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A04;
        long j2 = B6A.A01;
        int iA06 = AnonymousClass006.A06(this.A00, AnonymousClass006.A06(this.A01, AnonymousClass006.A06(this.A05, AnonymousClass006.A06(this.A03, AnonymousClass005.A07(j)))));
        long j3 = this.A02;
        return iA06 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C0jF(long j, long j2, long j3, long j4, long j5, long j6) {
        this.A04 = j;
        this.A03 = j2;
        this.A05 = j3;
        this.A01 = j4;
        this.A00 = j5;
        this.A02 = j6;
    }
}
