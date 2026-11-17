package X;

/* loaded from: classes5.dex */
public final class DrN {
    public static final DrN A02 = new DrN(1);
    public C5887DrO A00;
    public final int A01;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A01 == ((DrN) obj).A01);
    }

    public DrN(int i) {
        this.A01 = i;
    }

    public final int hashCode() {
        return (((506447 + this.A01) * 31) + 1) * 31 * 31;
    }
}
