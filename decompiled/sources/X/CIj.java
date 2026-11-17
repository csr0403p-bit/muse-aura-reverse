package X;

/* loaded from: classes5.dex */
public abstract class CIj {
    public final int A00;
    public final EnumC7437Evy A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                CIj cIj = (CIj) obj;
                if (this.A00 != cIj.A00 || this.A01 != cIj.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(Integer.valueOf(this.A00), this.A01);
    }

    public CIj(EnumC7437Evy enumC7437Evy, int i) {
        this.A00 = i;
        this.A01 = enumC7437Evy;
    }
}
