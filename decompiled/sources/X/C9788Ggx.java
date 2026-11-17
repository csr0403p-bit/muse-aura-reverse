package X;

/* renamed from: X.Ggx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9788Ggx extends AbstractC9806GhU {
    public static final long serialVersionUID = 2;
    public final Object _value;

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C9788Ggx)) {
            return false;
        }
        Object obj2 = this._value;
        Object obj3 = ((C9788Ggx) obj)._value;
        return obj2 == null ? AnonymousClass002.A1Y(obj3) : obj2.equals(obj3);
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        return AnonymousClass006.A0D(this._value);
    }

    public C9788Ggx(Object obj) {
        this._value = obj;
    }
}
