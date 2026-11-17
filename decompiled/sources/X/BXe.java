package X;

/* loaded from: classes5.dex */
public final class BXe {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                BXe bXe = (BXe) obj;
                if (!this.A01.equals(bXe.A01) || !this.A00.equals(bXe.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(this.A01, this.A00);
    }

    public BXe(String str) {
        this.A01 = str;
        this.A00 = str;
    }
}
