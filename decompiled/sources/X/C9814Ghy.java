package X;

/* renamed from: X.Ghy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9814Ghy extends AbstractC9806GhU {
    public static final long serialVersionUID = 2;
    public final boolean _value;
    public static final C9814Ghy A01 = new C9814Ghy(true);
    public static final C9814Ghy A00 = new C9814Ghy(false);

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        return obj == this || (obj != null && (obj instanceof C9814Ghy) && this._value == ((C9814Ghy) obj)._value);
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        return this._value ? 3 : 1;
    }

    public Object readResolve() {
        return this._value ? A01 : A00;
    }

    public C9814Ghy(boolean z) {
        this._value = z;
    }
}
