package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactSharingRecipientJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String name;
    public final String permission;
    public final String photo_url;
    public final String principal;

    public final class Companion {
        public final C9hr<ArtifactSharingRecipientJson> serializer() {
            return ArtifactSharingRecipientJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactSharingRecipientJson artifactSharingRecipientJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(artifactSharingRecipientJson.principal)) {
            c9j5.AAV(artifactSharingRecipientJson.principal, c9iZ, 0);
        }
        if (zAfR || artifactSharingRecipientJson.name != null) {
            c9j5.AAP(artifactSharingRecipientJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || artifactSharingRecipientJson.photo_url != null) {
            c9j5.AAP(artifactSharingRecipientJson.photo_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || artifactSharingRecipientJson.permission != null) {
            c9j5.AAP(artifactSharingRecipientJson.permission, C07779iq.A01, c9iZ, 3);
        }
    }

    public final ArtifactSharingRecipientJson copy(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return new ArtifactSharingRecipientJson(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactSharingRecipientJson) {
                ArtifactSharingRecipientJson artifactSharingRecipientJson = (ArtifactSharingRecipientJson) obj;
                if (!C7384Etj.areEqual(this.principal, artifactSharingRecipientJson.principal) || !C7384Etj.areEqual(this.name, artifactSharingRecipientJson.name) || !C7384Etj.areEqual(this.photo_url, artifactSharingRecipientJson.photo_url) || !C7384Etj.areEqual(this.permission, artifactSharingRecipientJson.permission)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactSharingRecipientJson copy$default(ArtifactSharingRecipientJson artifactSharingRecipientJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharingRecipientJson.principal;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharingRecipientJson.name;
        }
        if ((i & 4) != 0) {
            str3 = artifactSharingRecipientJson.photo_url;
        }
        if ((i & 8) != 0) {
            str4 = artifactSharingRecipientJson.permission;
        }
        C7384Etj.A0Y(str, 0);
        return new ArtifactSharingRecipientJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.principal;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.photo_url;
    }

    public final String component4() {
        return this.permission;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPermission() {
        return this.permission;
    }

    public final String getPhoto_url() {
        return this.photo_url;
    }

    public final String getPrincipal() {
        return this.principal;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.principal) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.photo_url)) * 31) + AnonymousClass005.A0H(this.permission);
    }

    public final ArtifactSharingRecipient toDomain() {
        String str = this.principal;
        String str2 = this.name;
        String str3 = null;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        String str4 = this.photo_url;
        if (str4 != null && !C7BY.A0j(str4)) {
            str3 = str4;
        }
        return new ArtifactSharingRecipient(str, str2, str3, ArtifactSharePermission.Companion.fromWire(this.permission));
    }

    public /* synthetic */ ArtifactSharingRecipientJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        this.principal = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.photo_url = null;
        } else {
            this.photo_url = str3;
        }
        if ((i & 8) == 0) {
            this.permission = null;
        } else {
            this.permission = str4;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ArtifactSharingRecipientJson(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        this.principal = str;
        this.name = str2;
        this.photo_url = str3;
        this.permission = str4;
    }

    public /* synthetic */ ArtifactSharingRecipientJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public ArtifactSharingRecipientJson() {
        this("", null, null, null);
    }
}
