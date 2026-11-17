package X;

/* loaded from: classes4.dex */
public final class AnV {
    public static final AnV A02 = new AnV(0, 0);
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnV) {
                AnV anV = (AnV) obj;
                if (this.A00 != anV.A00 || this.A01 != anV.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A01, AnonymousClass005.A07(this.A00));
    }

    public AnV(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
