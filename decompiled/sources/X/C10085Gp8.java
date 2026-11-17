package X;

import java.io.Serializable;

/* renamed from: X.Gp8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10085Gp8 implements Serializable {
    public static final C10085Gp8 A00 = new C10085Gp8(null, null);
    public static final long serialVersionUID = 1;
    public final Object _id;
    public final Boolean _useInput;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C10085Gp8 c10085Gp8 = (C10085Gp8) obj;
            Boolean bool = this._useInput;
            Boolean bool2 = c10085Gp8._useInput;
            if (bool == null) {
                if (bool2 != null) {
                    return false;
                }
            } else if (!bool.equals(bool2)) {
                return false;
            }
            Object obj2 = this._id;
            Object obj3 = c10085Gp8._id;
            if (obj2 != null) {
                return obj2.equals(obj3);
            }
            if (obj3 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this._id;
        int iA0G = obj != null ? AnonymousClass005.A0G(obj, 1) : 1;
        Boolean bool = this._useInput;
        return bool != null ? AnonymousClass005.A0G(bool, iA0G) : iA0G;
    }

    public final String toString() {
        return String.format("JacksonInject.Value(id=%s,useInput=%s)", this._id, this._useInput);
    }

    public C10085Gp8(Boolean bool, Object obj) {
        this._id = obj;
        this._useInput = bool;
    }
}
