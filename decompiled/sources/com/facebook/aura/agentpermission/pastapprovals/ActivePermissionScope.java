package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivePermissionScope extends C06G {
    public static final int $stable = 0;
    public final String displayName;
    public final String sessionScopeId;
    public final ActivePermissionScopeType type;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionScope) {
                ActivePermissionScope activePermissionScope = (ActivePermissionScope) obj;
                if (this.type != activePermissionScope.type || !C7384Etj.areEqual(this.sessionScopeId, activePermissionScope.sessionScopeId) || !C7384Etj.areEqual(this.displayName, activePermissionScope.displayName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionScope copy$default(ActivePermissionScope activePermissionScope, ActivePermissionScopeType activePermissionScopeType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            activePermissionScopeType = activePermissionScope.type;
        }
        if ((i & 2) != 0) {
            str = activePermissionScope.sessionScopeId;
        }
        if ((i & 4) != 0) {
            str2 = activePermissionScope.displayName;
        }
        return activePermissionScope.copy(activePermissionScopeType, str, str2);
    }

    public final ActivePermissionScopeType component1() {
        return this.type;
    }

    public final String component2() {
        return this.sessionScopeId;
    }

    public final String component3() {
        return this.displayName;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getSessionScopeId() {
        return this.sessionScopeId;
    }

    public final ActivePermissionScopeType getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.sessionScopeId, AnonymousClass005.A0E(this.type)) + AnonymousClass006.A0G(this.displayName);
    }

    public ActivePermissionScope(ActivePermissionScopeType activePermissionScopeType, String str, String str2) {
        AnonymousClass003.A0u(activePermissionScopeType, str);
        this.type = activePermissionScopeType;
        this.sessionScopeId = str;
        this.displayName = str2;
    }

    public final ActivePermissionScope copy(ActivePermissionScopeType activePermissionScopeType, String str, String str2) {
        AnonymousClass003.A0u(activePermissionScopeType, str);
        return new ActivePermissionScope(activePermissionScopeType, str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
