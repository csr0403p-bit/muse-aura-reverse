package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ArtifactSharingRecipient extends C06G {
    public final String name;
    public final ArtifactSharePermission permission;
    public final String photoUrl;
    public final String principal;

    public ArtifactSharingRecipient(String str, String str2, String str3, ArtifactSharePermission artifactSharePermission) {
        C7384Etj.A0Y(str, 0);
        this.principal = str;
        this.name = str2;
        this.photoUrl = str3;
        this.permission = artifactSharePermission;
    }

    public final ArtifactSharingRecipient copy(String str, String str2, String str3, ArtifactSharePermission artifactSharePermission) {
        C7384Etj.A0Y(str, 0);
        return new ArtifactSharingRecipient(str, str2, str3, artifactSharePermission);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactSharingRecipient) {
                ArtifactSharingRecipient artifactSharingRecipient = (ArtifactSharingRecipient) obj;
                if (!C7384Etj.areEqual(this.principal, artifactSharingRecipient.principal) || !C7384Etj.areEqual(this.name, artifactSharingRecipient.name) || !C7384Etj.areEqual(this.photoUrl, artifactSharingRecipient.photoUrl) || this.permission != artifactSharingRecipient.permission) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactSharingRecipient copy$default(ArtifactSharingRecipient artifactSharingRecipient, String str, String str2, String str3, ArtifactSharePermission artifactSharePermission, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingRecipient.principal;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingRecipient.name;
        }
        if ((i & 4) != 0) {
            str3 = artifactSharingRecipient.photoUrl;
        }
        if ((i & 8) != 0) {
            artifactSharePermission = artifactSharingRecipient.permission;
        }
        C7384Etj.A0Y(str, 0);
        return new ArtifactSharingRecipient(str, str2, str3, artifactSharePermission);
    }

    public final String component1() {
        return this.principal;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.photoUrl;
    }

    public final ArtifactSharePermission component4() {
        return this.permission;
    }

    public final String getName() {
        return this.name;
    }

    public final ArtifactSharePermission getPermission() {
        return this.permission;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getPrincipal() {
        return this.principal;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.principal) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.photoUrl)) * 31) + C06G.A04(this.permission);
    }

    public final boolean isOwner() {
        return UnifiedArtifactKt.OWNER_PRINCIPAL.equals(this.principal);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactSharingRecipient(String str, String str2, String str3, ArtifactSharePermission artifactSharePermission, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : artifactSharePermission);
    }
}
