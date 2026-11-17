package X;

/* renamed from: X.ECu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6527ECu {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                C6527ECu c6527ECu = (C6527ECu) obj;
                if (c6527ECu.A01 != this.A01 || c6527ECu.A00 != this.A00) {
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
        return FGI.A0b("PeriodicityInfo{repeatIntervalMillis=", ", flexIntervalMillis=", "}", this.A01, this.A00);
    }

    public C6527ECu(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
