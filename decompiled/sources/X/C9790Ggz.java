package X;

/* renamed from: X.Ggz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9790Ggz extends AbstractC9789Ggy {
    public final float _value;

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof C9790Ggz)) {
                if (Float.compare(this._value, ((C9790Ggz) obj)._value) == 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        return Float.floatToIntBits(this._value);
    }

    public C9790Ggz(float f) {
        this._value = f;
    }
}
