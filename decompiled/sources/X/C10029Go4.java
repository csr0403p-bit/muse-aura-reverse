package X;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.Go4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10029Go4 implements Serializable {
    public static final C10029Go4 A00 = new C10029Go4(Collections.EMPTY_SET, false, false, false, true);
    public static final long serialVersionUID = 1;
    public final boolean _allowGetters;
    public final boolean _allowSetters;
    public final boolean _ignoreUnknown;
    public final Set<String> _ignored;
    public final boolean _merge;

    public final boolean equals(Object obj) {
        return obj == this || (obj != null && obj.getClass() == getClass() && A01(this, (C10029Go4) obj));
    }

    public static C10029Go4 A00(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
        C10029Go4 c10029Go4 = A00;
        return (z == c10029Go4._ignoreUnknown && z2 == c10029Go4._allowGetters && z3 == c10029Go4._allowSetters && z4 == c10029Go4._merge && (set == null || set.size() == 0)) ? c10029Go4 : new C10029Go4(set, z, z2, z3, z4);
    }

    public static boolean A01(C10029Go4 c10029Go4, C10029Go4 c10029Go42) {
        return c10029Go4._ignoreUnknown == c10029Go42._ignoreUnknown && c10029Go4._merge == c10029Go42._merge && c10029Go4._allowGetters == c10029Go42._allowGetters && c10029Go4._allowSetters == c10029Go42._allowSetters && c10029Go4._ignored.equals(c10029Go42._ignored);
    }

    public final int hashCode() {
        return this._ignored.size() + (this._ignoreUnknown ? 1 : -3) + (this._allowGetters ? 3 : -7) + (this._allowSetters ? 7 : -11) + (this._merge ? 11 : -13);
    }

    public Object readResolve() {
        Set<String> set = this._ignored;
        boolean z = this._ignoreUnknown;
        boolean z2 = this._allowGetters;
        boolean z3 = this._allowSetters;
        boolean z4 = this._merge;
        C10029Go4 c10029Go4 = A00;
        return (z == c10029Go4._ignoreUnknown && z2 == c10029Go4._allowGetters && z3 == c10029Go4._allowSetters && z4 == c10029Go4._merge && (set == null || set.size() == 0)) ? c10029Go4 : this;
    }

    public final String toString() {
        return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this._ignored, Boolean.valueOf(this._ignoreUnknown), Boolean.valueOf(this._allowGetters), Boolean.valueOf(this._allowSetters), Boolean.valueOf(this._merge));
    }

    public C10029Go4(Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
        this._ignored = set == null ? Collections.EMPTY_SET : set;
        this._ignoreUnknown = z;
        this._allowGetters = z2;
        this._allowSetters = z3;
        this._merge = z4;
    }
}
