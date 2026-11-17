package X;

/* renamed from: X.DhW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5379DhW {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5379DhW) {
                C5379DhW c5379DhW = (C5379DhW) obj;
                if (this.A01 != c5379DhW.A01 || this.A00 != c5379DhW.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C5379DhW(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
