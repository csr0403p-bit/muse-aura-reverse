package X;

/* loaded from: classes5.dex */
public final class E29 {
    public static final E29 A02 = new E29(0, 0);
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E29 e29 = (E29) obj;
                if (this.A01 != e29.A01 || this.A00 != e29.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return FGI.A0b("[timeUs=", ", position=", "]", this.A01, this.A00);
    }

    public E29(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
