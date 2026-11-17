package X;

/* renamed from: X.1BT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BT {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1BT) {
                long j = this.A01;
                C1BT c1bt = (C1BT) obj;
                long j2 = c1bt.A01;
                long j3 = B6A.A01;
                if (j != j2 || this.A00 != c1bt.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = B6A.A01;
        int iA07 = AnonymousClass005.A07(j);
        long j3 = this.A00;
        return iA07 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AnonymousClass005.A0m(this.A01, sb);
        sb.append(", selectionBackgroundColor=");
        return AnonymousClass007.A0Z(B6A.A07(this.A00), sb);
    }

    public C1BT(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
