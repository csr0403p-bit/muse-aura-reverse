package X;

/* renamed from: X.0xk, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0xk {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C0xk)) {
                long j = this.A00;
                C0xk c0xk = (C0xk) obj;
                long j2 = c0xk.A00;
                long j3 = B6A.A01;
                if (j != j2 || this.A01 != c0xk.A01 || this.A02 != c0xk.A02 || this.A03 != c0xk.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = B6A.A01;
        int iA06 = AnonymousClass006.A06(this.A02, AnonymousClass006.A06(this.A01, AnonymousClass005.A07(j)));
        long j3 = this.A03;
        return iA06 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C0xk(long j, long j2, long j3, long j4) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A03 = j4;
    }
}
