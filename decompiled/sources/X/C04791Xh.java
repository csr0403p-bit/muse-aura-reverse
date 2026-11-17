package X;

/* renamed from: X.1Xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04791Xh {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C04791Xh)) {
                long j = this.A00;
                C04791Xh c04791Xh = (C04791Xh) obj;
                long j2 = c04791Xh.A00;
                long j3 = B6A.A01;
                if (j != j2 || this.A01 != c04791Xh.A01 || this.A02 != c04791Xh.A02 || this.A03 != c04791Xh.A03) {
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

    public C04791Xh(long j, long j2, long j3, long j4) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A03 = j4;
    }
}
