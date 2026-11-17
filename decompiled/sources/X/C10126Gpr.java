package X;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.Gpr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10126Gpr implements Serializable {
    public static final long serialVersionUID = 1;
    public final Set<String> _toIgnore;
    public final Set<String> _toInclude;

    public final boolean A00(Object obj) {
        Set<String> set = this._toInclude;
        return !(set == null || set.contains(obj)) || this._toIgnore.contains(obj);
    }

    public C10126Gpr(Set<String> set, Set<String> set2) {
        this._toIgnore = set == null ? Collections.EMPTY_SET : set;
        this._toInclude = set2;
    }
}
