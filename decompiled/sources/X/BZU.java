package X;

/* loaded from: classes5.dex */
public final class BZU {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof BZU)) {
                BZU bzu = (BZU) obj;
                if (this.A00 != bzu.A00 || this.A03 != bzu.A03 || this.A01 != bzu.A01 || this.A02 != bzu.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A0A(Integer.valueOf(this.A00), Long.valueOf(this.A03), Integer.valueOf(this.A01), Long.valueOf(this.A02));
    }

    public BZU(int i, int i2, long j, long j2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
    }
}
