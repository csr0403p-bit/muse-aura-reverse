package X;

/* renamed from: X.Gi3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9816Gi3 extends AbstractC9806GhU {
    public static final C9816Gi3 A00 = new C9816Gi3("");
    public static final long serialVersionUID = 2;
    public final String _value;

    public static C9816Gi3 A00(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? A00 : new C9816Gi3(str);
    }

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C9816Gi3)) {
            return false;
        }
        return C6xC.A00(((C9816Gi3) obj)._value, this._value);
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        return AnonymousClass006.A0G(this._value);
    }

    public C9816Gi3(String str) {
        this._value = str;
    }
}
