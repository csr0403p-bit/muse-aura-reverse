package X;

/* loaded from: classes6.dex */
public abstract class Hw7 {
    public final int A00;
    public final long A01;
    public final String A02;

    public float A01(int i) {
        if (this instanceof HpN) {
            return 2.0f;
        }
        return this instanceof HDl ? i == 0 ? 1.0f : 0.5f : i == 0 ? 100.0f : 128.0f;
    }

    public float A02(int i) {
        if (this instanceof HpN) {
            return -2.0f;
        }
        float f = this instanceof HDl ? -0.5f : -128.0f;
        if (i == 0) {
            return 0.0f;
        }
        return f;
    }

    public boolean A03() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Hw7 hw7 = (Hw7) obj;
            if (this.A00 == hw7.A00 && C7384Etj.areEqual(this.A02, hw7.A02)) {
                return AnonymousClass002.A1M((this.A01 > hw7.A01 ? 1 : (this.A01 == hw7.A01 ? 0 : -1)));
            }
        }
        return false;
    }

    public int hashCode() {
        return C60R.A00(this.A01, AnonymousClass001.A0G(this.A02)) + this.A00;
    }

    public Hw7(String str, long j, int i) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A02);
        sbA0w.append(" (id=");
        sbA0w.append(this.A00);
        sbA0w.append(", model=");
        return AnonymousClass007.A0Z(AbstractC10598Hxv.A00(this.A01), sbA0w);
    }
}
