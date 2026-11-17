package X;

/* renamed from: X.FyQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9099FyQ extends AbstractC9142FzB {
    public final double A00;
    public final double A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9099FyQ) {
                C9099FyQ c9099FyQ = (C9099FyQ) obj;
                if (this.A01 != c9099FyQ.A01 || this.A00 != c9099FyQ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass002.A0A(Double.doubleToLongBits(this.A01)) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("HeartRateTarget(minHeartRate=");
        sbA0x.append(this.A01);
        sbA0x.append(", maxHeartRate=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C9099FyQ(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }
}
