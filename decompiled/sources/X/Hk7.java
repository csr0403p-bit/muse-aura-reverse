package X;

/* loaded from: classes6.dex */
public final class Hk7 {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                Hk7 hk7 = (Hk7) obj;
                if (this.A00 == hk7.A00 && this.A01 == hk7.A01) {
                    String str = this.A02;
                    if (str.length() == 0) {
                        if (hk7.A02.length() == 0) {
                        }
                    } else if (str.equals(hk7.A02)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0E(Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02);
    }

    public Hk7(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
