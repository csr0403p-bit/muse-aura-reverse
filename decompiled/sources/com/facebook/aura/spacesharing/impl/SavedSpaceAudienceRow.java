package com.facebook.aura.spacesharing.impl;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.library.repo.ArtifactSharePermission;

/* loaded from: classes3.dex */
public interface SavedSpaceAudienceRow {

    public final class Owner extends C06G implements SavedSpaceAudienceRow {
        public static final int $stable = 0;
        public final String name;
        public final String photoUrl;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Owner) {
                    Owner owner = (Owner) obj;
                    if (!C7384Etj.areEqual(this.name, owner.name) || !C7384Etj.areEqual(this.photoUrl, owner.photoUrl)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Owner copy$default(Owner owner, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = owner.name;
            }
            if ((i & 2) != 0) {
                str2 = owner.photoUrl;
            }
            return new Owner(str, str2);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.photoUrl;
        }

        public final Owner copy(String str, String str2) {
            return new Owner(str, str2);
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhotoUrl() {
            return this.photoUrl;
        }

        public int hashCode() {
            return (AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.photoUrl);
        }

        public Owner(String str, String str2) {
            this.name = str;
            this.photoUrl = str2;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Recipient extends C06G implements SavedSpaceAudienceRow {
        public static final int $stable = 0;
        public final String name;
        public final ArtifactSharePermission permission;
        public final String photoUrl;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Recipient) {
                    Recipient recipient = (Recipient) obj;
                    if (!C7384Etj.areEqual(this.name, recipient.name) || !C7384Etj.areEqual(this.photoUrl, recipient.photoUrl) || this.permission != recipient.permission) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Recipient copy$default(Recipient recipient, String str, String str2, ArtifactSharePermission artifactSharePermission, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recipient.name;
            }
            if ((i & 2) != 0) {
                str2 = recipient.photoUrl;
            }
            if ((i & 4) != 0) {
                artifactSharePermission = recipient.permission;
            }
            return new Recipient(str, str2, artifactSharePermission);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.photoUrl;
        }

        public final ArtifactSharePermission component3() {
            return this.permission;
        }

        public final Recipient copy(String str, String str2, ArtifactSharePermission artifactSharePermission) {
            return new Recipient(str, str2, artifactSharePermission);
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

        public int hashCode() {
            return (((AnonymousClass006.A0G(this.name) * 31) + AnonymousClass006.A0G(this.photoUrl)) * 31) + C3cH.A02(this.permission);
        }

        public Recipient(String str, String str2, ArtifactSharePermission artifactSharePermission) {
            this.name = str;
            this.photoUrl = str2;
            this.permission = artifactSharePermission;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Self extends C06G implements SavedSpaceAudienceRow {
        public static final int $stable = 0;
        public final ArtifactSharePermission permission;
        public final String photoUrl;

        public Self(ArtifactSharePermission artifactSharePermission, String str) {
            C7384Etj.A0Y(artifactSharePermission, 0);
            this.permission = artifactSharePermission;
            this.photoUrl = str;
        }

        public final Self copy(ArtifactSharePermission artifactSharePermission, String str) {
            C7384Etj.A0Y(artifactSharePermission, 0);
            return new Self(artifactSharePermission, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Self) {
                    Self self = (Self) obj;
                    if (this.permission != self.permission || !C7384Etj.areEqual(this.photoUrl, self.photoUrl)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Self copy$default(Self self, ArtifactSharePermission artifactSharePermission, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                artifactSharePermission = self.permission;
            }
            if ((i & 2) != 0) {
                str = self.photoUrl;
            }
            C7384Etj.A0Y(artifactSharePermission, 0);
            return new Self(artifactSharePermission, str);
        }

        public final ArtifactSharePermission component1() {
            return this.permission;
        }

        public final String component2() {
            return this.photoUrl;
        }

        public final ArtifactSharePermission getPermission() {
            return this.permission;
        }

        public final String getPhotoUrl() {
            return this.photoUrl;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.permission) + AnonymousClass006.A0G(this.photoUrl);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Self(ArtifactSharePermission artifactSharePermission, String str, int i, C06H c06h) {
            this(artifactSharePermission, AnonymousClass006.A0s(i, str));
        }
    }
}
