package X;

/* loaded from: classes5.dex */
public final class DJ5 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof DJ5)) {
                DJ5 dj5 = (DJ5) obj;
                if (this.A01 != dj5.A01 || this.A02 != dj5.A02 || this.A04 != dj5.A04 || this.A03 != dj5.A03 || this.A00 != dj5.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.A01 + 31) * 31) + this.A02) * 31) + this.A04) * 31) + this.A03) * 31) + this.A00;
    }
}
