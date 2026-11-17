package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class HjD implements Serializable {
    public static final long serialVersionUID = 1;
    public final Class<?> _class;
    public final int _hashCode;
    public String _name;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                HjD hjD = (HjD) obj;
                if (this._class != hjD._class || !C6xC.A00(this._name, hjD._name)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public final String toString() {
        String name = this._class.getName();
        String str = this._name;
        return FGI.A0h("[NamedType, class ", name, ", name: ", str == null ? HatchCcvLoggingKt.NO_POSTAL_FIELD : FGI.A0U("'", str, "'"), "]");
    }

    public HjD(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode() + AnonymousClass006.A0G(str);
        this._name = (str == null || str.isEmpty()) ? null : str;
    }
}
