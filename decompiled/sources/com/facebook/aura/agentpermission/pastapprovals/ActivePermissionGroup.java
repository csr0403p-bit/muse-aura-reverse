package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class ActivePermissionGroup extends C06G {
    public static final int $stable = 8;
    public final List<ActivePermission> items;
    public final ActivePermissionScope scope;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionGroup) {
                ActivePermissionGroup activePermissionGroup = (ActivePermissionGroup) obj;
                if (!C7384Etj.areEqual(this.scope, activePermissionGroup.scope) || !C7384Etj.areEqual(this.items, activePermissionGroup.items)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionGroup copy$default(ActivePermissionGroup activePermissionGroup, ActivePermissionScope activePermissionScope, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            activePermissionScope = activePermissionGroup.scope;
        }
        if ((i & 2) != 0) {
            list = activePermissionGroup.items;
        }
        AnonymousClass003.A0u(activePermissionScope, list);
        return new ActivePermissionGroup(activePermissionScope, list);
    }

    public final ActivePermissionScope component1() {
        return this.scope;
    }

    public final List<ActivePermission> component2() {
        return this.items;
    }

    public final List<ActivePermission> getItems() {
        return this.items;
    }

    public final ActivePermissionScope getScope() {
        return this.scope;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, AnonymousClass005.A0E(this.scope));
    }

    public ActivePermissionGroup(ActivePermissionScope activePermissionScope, List<ActivePermission> list) {
        AnonymousClass003.A0u(activePermissionScope, list);
        this.scope = activePermissionScope;
        this.items = list;
    }

    public final ActivePermissionGroup copy(ActivePermissionScope activePermissionScope, List<ActivePermission> list) {
        AnonymousClass003.A0u(activePermissionScope, list);
        return new ActivePermissionGroup(activePermissionScope, list);
    }

    public String toString() {
        return super.toString();
    }
}
