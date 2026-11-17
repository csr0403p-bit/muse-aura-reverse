package X;

/* renamed from: X.1Yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05061Yl {
    public final long A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C05061Yl) {
                long j = this.A00;
                long j2 = ((C05061Yl) obj).A00;
                long j3 = B6A.A01;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = B6A.A01;
        return AnonymousClass002.A0A(j) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        AnonymousClass005.A0m(this.A00, sb);
        sb.append(", rippleAlpha=");
        return AnonymousClass007.A0Z(null, sb);
    }

    public C05061Yl(long j) {
        this.A00 = j;
    }
}
