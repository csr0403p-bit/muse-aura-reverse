package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class SpaceAccessRequest {
    public static final int $stable = 0;
    public final String activityId;
    public final String name;
    public final String principal;
    public final SpaceRole role;

    public final String getActivityId() {
        return this.activityId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPrincipal() {
        return this.principal;
    }

    public final SpaceRole getRole() {
        return this.role;
    }

    public SpaceAccessRequest(String str, String str2, String str3, SpaceRole spaceRole) {
        AnonymousClass005.A0y(str, str2, spaceRole);
        this.activityId = str;
        this.principal = str2;
        this.name = str3;
        this.role = spaceRole;
    }
}
