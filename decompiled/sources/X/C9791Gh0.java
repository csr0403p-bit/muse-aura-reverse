package X;

/* renamed from: X.Gh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9791Gh0 extends AbstractC9789Ggy {
    public final double _value;

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof C9791Gh0)) {
                if (Double.compare(this._value, ((C9791Gh0) obj)._value) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this._value);
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    public C9791Gh0(double d) {
        this._value = d;
    }
}
