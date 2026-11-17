package X;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.ByT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3106ByT extends Permission {
    public final Set<String> actions;

    public final boolean equals(Object obj) {
        return (obj instanceof C3106ByT) && this.actions.equals(((C3106ByT) obj).actions);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.actions.toString();
    }

    public final int hashCode() {
        return this.actions.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof C3106ByT)) {
            return false;
        }
        C3106ByT c3106ByT = (C3106ByT) permission;
        return getName().equals(c3106ByT.getName()) || this.actions.containsAll(c3106ByT.actions);
    }

    public C3106ByT(String str) {
        super(str);
        HashSet hashSetA13 = C60O.A13();
        this.actions = hashSetA13;
        hashSetA13.add(str);
    }
}
