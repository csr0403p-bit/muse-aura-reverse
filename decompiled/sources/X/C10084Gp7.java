package X;

import java.io.Serializable;
import java.util.Set;

/* renamed from: X.Gp7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10084Gp7 implements Serializable {
    public static final C10084Gp7 A00 = new C10084Gp7(null);
    public static final long serialVersionUID = 1;
    public final Set<String> _included;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                Set<String> set = this._included;
                Set<String> set2 = ((C10084Gp7) obj)._included;
                if (set == null) {
                    if (set2 == null) {
                    }
                } else if (set.equals(set2)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Set<String> set = this._included;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public final String toString() {
        return String.format("JsonIncludeProperties.Value(included=%s)", this._included);
    }

    public C10084Gp7(Set<String> set) {
        this._included = set;
    }
}
