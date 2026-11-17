package X;

import java.io.Serializable;

/* renamed from: X.Gnh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10009Gnh implements Serializable {
    public static final long serialVersionUID = 1;
    public InterfaceC10180Gqq _encodedSimple;
    public final String _namespace;
    public final String _simpleName;
    public static final C10009Gnh A01 = new C10009Gnh("", null);
    public static final C10009Gnh A00 = new C10009Gnh(new String(""), null);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            C10009Gnh c10009Gnh = (C10009Gnh) obj;
            String str = this._simpleName;
            String str2 = c10009Gnh._simpleName;
            if (str == null) {
                if (str2 == null) {
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this._namespace;
            String str4 = c10009Gnh._namespace;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public static C10009Gnh A00(String str) {
        return (str == null || str.isEmpty()) ? A01 : new C10009Gnh(HlK.A00.A00(str), null);
    }

    public static C10009Gnh A01(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.isEmpty()) ? A01 : new C10009Gnh(HlK.A00.A00(str), str2);
    }

    public final boolean A02() {
        return this._namespace == null && this._simpleName.isEmpty();
    }

    public final int hashCode() {
        return (AnonymousClass006.A0G(this._simpleName) * 31) + AnonymousClass006.A0G(this._namespace);
    }

    public Object readResolve() {
        String str;
        return (this._namespace == null && ((str = this._simpleName) == null || "".equals(str))) ? A01 : this;
    }

    public final String toString() {
        String str = this._namespace;
        return str == null ? this._simpleName : FGI.A0d("{", str, "}", this._simpleName);
    }

    public C10009Gnh(String str, String str2) {
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        this._simpleName = str == null ? "" : str;
        this._namespace = str2;
    }
}
