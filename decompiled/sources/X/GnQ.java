package X;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class GnQ implements Serializable {
    public static final long serialVersionUID = 1;
    public final Class<?> _defaultImpl;
    public final EnumC10066Gon _idType;
    public final boolean _idVisible;
    public final EnumC10075Gow _inclusionType;
    public final String _propertyName;
    public final Boolean _requireTypeIdForSubtypes;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                GnQ gnQ = (GnQ) obj;
                if (this._idType == gnQ._idType && this._inclusionType == gnQ._inclusionType && this._defaultImpl == gnQ._defaultImpl && this._idVisible == gnQ._idVisible) {
                    String str = this._propertyName;
                    String str2 = gnQ._propertyName;
                    if (str != null ? !(str2 == null || !str.equals(str2)) : str2 == null) {
                        Boolean bool = this._requireTypeIdForSubtypes;
                        Boolean bool2 = gnQ._requireTypeIdForSubtypes;
                        if (bool == null) {
                            if (bool2 == null) {
                            }
                        } else if (bool2 != null && bool.equals(bool2)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((C60R.A01(this._idType) + 31) * 31) + C60R.A01(this._inclusionType)) * 31) + BV7.A0I(this._propertyName)) * 31) + C8j4.A0E(this._defaultImpl, 0)) * 31) + (this._requireTypeIdForSubtypes.booleanValue() ? 11 : -17)) * 31) + (this._idVisible ? 11 : -17);
    }

    public final String toString() {
        EnumC10066Gon enumC10066Gon = this._idType;
        EnumC10075Gow enumC10075Gow = this._inclusionType;
        String str = this._propertyName;
        Class<?> cls = this._defaultImpl;
        return String.format("JsonTypeInfo.Value(idType=%s,includeAs=%s,propertyName=%s,defaultImpl=%s,idVisible=%s,requireTypeIdForSubtypes=%s)", enumC10066Gon, enumC10075Gow, str, cls == null ? "NULL" : cls.getName(), Boolean.valueOf(this._idVisible), this._requireTypeIdForSubtypes);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gon;LX/Gow;Ljava/lang/String;Ljava/lang/Class<*>;ZLjava/lang/Boolean;)V */
    public GnQ(EnumC10075Gow enumC10075Gow, EnumC10066Gon enumC10066Gon, Boolean bool, Class cls, String str, boolean z) {
        this._defaultImpl = cls;
        this._idType = enumC10066Gon;
        this._inclusionType = enumC10075Gow;
        this._propertyName = str;
        this._idVisible = z;
        this._requireTypeIdForSubtypes = bool;
    }
}
