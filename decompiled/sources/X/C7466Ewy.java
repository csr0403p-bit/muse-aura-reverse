package X;

/* renamed from: X.Ewy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7466Ewy extends F25 {
    public final int A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof F25) && this.A00 == ((C7466Ewy) ((F25) obj)).A00) {
                long jDoubleToLongBits = Double.doubleToLongBits(0.0d);
                if (jDoubleToLongBits == jDoubleToLongBits) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = (this.A00 ^ 1000003) * 1000003;
        long jDoubleToLongBits = Double.doubleToLongBits(0.0d);
        return ((i ^ ((int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits))) * 1000003) ^ AnonymousClass006.A0D(null);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioStats{audioState=");
        sbA0x.append(this.A00);
        sbA0x.append(", audioAmplitudeInternal=");
        sbA0x.append(0.0d);
        sbA0x.append(", errorCause=");
        return BV8.A0v(null, sbA0x);
    }

    public C7466Ewy(int i) {
        this.A00 = i;
    }
}
