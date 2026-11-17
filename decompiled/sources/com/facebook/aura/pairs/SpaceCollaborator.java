package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class SpaceCollaborator {
    public static final int $stable = PairsImageRef.$stable;
    public final boolean isInvited;
    public final String name;
    public final PairsImageRef photo;
    public final String principal;
    public final SpaceRole role;

    public SpaceCollaborator(String str, String str2, SpaceRole spaceRole, boolean z, PairsImageRef pairsImageRef) {
        C7384Etj.A0Y(str, 0);
        this.principal = str;
        this.name = str2;
        this.role = spaceRole;
        this.isInvited = z;
        this.photo = pairsImageRef;
    }

    public final String getName() {
        return this.name;
    }

    public final PairsImageRef getPhoto() {
        return this.photo;
    }

    public final String getPrincipal() {
        return this.principal;
    }

    public final SpaceRole getRole() {
        return this.role;
    }

    public final boolean isInvited() {
        return this.isInvited;
    }
}
