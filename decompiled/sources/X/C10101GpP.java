package X;

/* renamed from: X.GpP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10101GpP {
    public static final C10101GpP A02 = new C10101GpP(0, 0);
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C10101GpP c10101GpP = (C10101GpP) obj;
                if (c10101GpP.A01 != this.A01 || c10101GpP.A00 != this.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00 + this.A01;
    }

    public final String toString() {
        return this == A02 ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", BV5.A1a(Integer.valueOf(this.A01), this.A00));
    }

    public C10101GpP(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
