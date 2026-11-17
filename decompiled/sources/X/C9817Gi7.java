package X;

/* renamed from: X.Gi7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9817Gi7 extends AbstractC9789Ggy {
    public final long _value;

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        return obj == this || (obj != null && (obj instanceof C9817Gi7) && ((C9817Gi7) obj)._value == this._value);
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        long j = this._value;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public C9817Gi7(long j) {
        this._value = j;
    }
}
