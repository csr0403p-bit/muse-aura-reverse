package X;

/* loaded from: classes6.dex */
public final class Hw6 extends Huk {
    public final Throwable A00;
    public final HoB A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hw6) {
                Hw6 hw6 = (Hw6) obj;
                if (!this.A00.equals(hw6.A00) || !this.A01.equals(hw6.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", fetchSummaryData=", C3cG.A0f(this.A00, "Failure(exception="));
    }

    public Hw6(HoB hoB, Throwable th) {
        super(hoB);
        this.A00 = th;
        this.A01 = hoB;
    }
}
