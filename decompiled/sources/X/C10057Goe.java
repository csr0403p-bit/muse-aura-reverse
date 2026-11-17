package X;

import java.io.Serializable;

/* renamed from: X.Goe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10057Goe implements Serializable {
    public static final C10057Goe A00;
    public static final C10057Goe A01;
    public static final EnumC9856Gj4 A02;
    public static final long serialVersionUID = 1;
    public final EnumC9856Gj4 _creatorVisibility;
    public final EnumC9856Gj4 _fieldVisibility;
    public final EnumC9856Gj4 _getterVisibility;
    public final EnumC9856Gj4 _isGetterVisibility;
    public final EnumC9856Gj4 _setterVisibility;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C10057Goe c10057Goe = (C10057Goe) obj;
                if (this._fieldVisibility != c10057Goe._fieldVisibility || this._getterVisibility != c10057Goe._getterVisibility || this._isGetterVisibility != c10057Goe._isGetterVisibility || this._setterVisibility != c10057Goe._setterVisibility || this._creatorVisibility != c10057Goe._creatorVisibility) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9856Gj4 enumC9856Gj4 = EnumC9856Gj4.PUBLIC_ONLY;
        A02 = enumC9856Gj4;
        A00 = new C10057Goe(enumC9856Gj4, enumC9856Gj4, enumC9856Gj4, EnumC9856Gj4.ANY, enumC9856Gj4);
        EnumC9856Gj4 enumC9856Gj42 = EnumC9856Gj4.DEFAULT;
        A01 = new C10057Goe(enumC9856Gj42, enumC9856Gj42, enumC9856Gj42, enumC9856Gj42, enumC9856Gj42);
    }

    public final int hashCode() {
        return ((this._fieldVisibility.ordinal() + 1) ^ (((this._getterVisibility.ordinal() * 3) - (this._isGetterVisibility.ordinal() * 7)) + (this._setterVisibility.ordinal() * 11))) ^ (this._creatorVisibility.ordinal() * 13);
    }

    public Object readResolve() {
        EnumC9856Gj4 enumC9856Gj4 = this._fieldVisibility;
        EnumC9856Gj4 enumC9856Gj42 = this._getterVisibility;
        EnumC9856Gj4 enumC9856Gj43 = this._isGetterVisibility;
        EnumC9856Gj4 enumC9856Gj44 = this._setterVisibility;
        EnumC9856Gj4 enumC9856Gj45 = this._creatorVisibility;
        if (enumC9856Gj4 == A02) {
            C10057Goe c10057Goe = A00;
            if (enumC9856Gj42 == c10057Goe._getterVisibility && enumC9856Gj43 == c10057Goe._isGetterVisibility && enumC9856Gj44 == c10057Goe._setterVisibility && enumC9856Gj45 == c10057Goe._creatorVisibility) {
                return c10057Goe;
            }
        } else {
            EnumC9856Gj4 enumC9856Gj46 = EnumC9856Gj4.DEFAULT;
            if (enumC9856Gj4 == enumC9856Gj46 && enumC9856Gj42 == enumC9856Gj46 && enumC9856Gj43 == enumC9856Gj46 && enumC9856Gj44 == enumC9856Gj46 && enumC9856Gj45 == enumC9856Gj46) {
                return A01;
            }
        }
        return this;
    }

    public final String toString() {
        return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
    }

    public C10057Goe(EnumC9856Gj4 enumC9856Gj4, EnumC9856Gj4 enumC9856Gj42, EnumC9856Gj4 enumC9856Gj43, EnumC9856Gj4 enumC9856Gj44, EnumC9856Gj4 enumC9856Gj45) {
        this._fieldVisibility = enumC9856Gj4;
        this._getterVisibility = enumC9856Gj42;
        this._isGetterVisibility = enumC9856Gj43;
        this._setterVisibility = enumC9856Gj44;
        this._creatorVisibility = enumC9856Gj45;
    }
}
