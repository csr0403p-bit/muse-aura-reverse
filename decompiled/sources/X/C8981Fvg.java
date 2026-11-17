package X;

/* renamed from: X.Fvg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8981Fvg {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8981Fvg) {
                C8981Fvg c8981Fvg = (C8981Fvg) obj;
                if (this.A01 != c8981Fvg.A01 || this.A00 != c8981Fvg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A00, AnonymousClass005.A07(this.A01));
    }

    public final String toString() {
        return FGI.A0b("BucketKey(startEpoch=", ", endEpoch=", ")", this.A01, this.A00);
    }

    public C8981Fvg(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
