package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ArtifactOpenTargetJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String host_muse;
    public final String kind;
    public final String path;
    public final String shortcode;
    public final String slug;
    public final String space_id;
    public final String url;

    /* loaded from: classes3.dex */
    public final class Companion {
        public final C9hr<ArtifactOpenTargetJson> serializer() {
            return ArtifactOpenTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ArtifactOpenTargetJson() {
        this("", null, null, null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactOpenTargetJson artifactOpenTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(artifactOpenTargetJson.kind)) {
            c9j5.AAV(artifactOpenTargetJson.kind, c9iZ, 0);
        }
        if (zAfR || artifactOpenTargetJson.slug != null) {
            c9j5.AAP(artifactOpenTargetJson.slug, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || artifactOpenTargetJson.shortcode != null) {
            c9j5.AAP(artifactOpenTargetJson.shortcode, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || artifactOpenTargetJson.path != null) {
            c9j5.AAP(artifactOpenTargetJson.path, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || artifactOpenTargetJson.url != null) {
            c9j5.AAP(artifactOpenTargetJson.url, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || artifactOpenTargetJson.host_muse != null) {
            c9j5.AAP(artifactOpenTargetJson.host_muse, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || artifactOpenTargetJson.space_id != null) {
            c9j5.AAP(artifactOpenTargetJson.space_id, C07779iq.A01, c9iZ, 6);
        }
    }

    public final ArtifactOpenTargetJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C7384Etj.A0Y(str, 0);
        return new ArtifactOpenTargetJson(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactOpenTargetJson) {
                ArtifactOpenTargetJson artifactOpenTargetJson = (ArtifactOpenTargetJson) obj;
                if (!C7384Etj.areEqual(this.kind, artifactOpenTargetJson.kind) || !C7384Etj.areEqual(this.slug, artifactOpenTargetJson.slug) || !C7384Etj.areEqual(this.shortcode, artifactOpenTargetJson.shortcode) || !C7384Etj.areEqual(this.path, artifactOpenTargetJson.path) || !C7384Etj.areEqual(this.url, artifactOpenTargetJson.url) || !C7384Etj.areEqual(this.host_muse, artifactOpenTargetJson.host_muse) || !C7384Etj.areEqual(this.space_id, artifactOpenTargetJson.space_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactOpenTargetJson copy$default(ArtifactOpenTargetJson artifactOpenTargetJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactOpenTargetJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = artifactOpenTargetJson.slug;
        }
        if ((i & 4) != 0) {
            str3 = artifactOpenTargetJson.shortcode;
        }
        if ((i & 8) != 0) {
            str4 = artifactOpenTargetJson.path;
        }
        if ((i & 16) != 0) {
            str5 = artifactOpenTargetJson.url;
        }
        if ((i & 32) != 0) {
            str6 = artifactOpenTargetJson.host_muse;
        }
        if ((i & 64) != 0) {
            str7 = artifactOpenTargetJson.space_id;
        }
        return artifactOpenTargetJson.copy(str, str2, str3, str4, str5, str6, str7);
    }

    private final ArtifactOpenTarget.PeerSpace toPeerSpace() {
        String str;
        String str2 = this.host_muse;
        String str3 = null;
        if (str2 == null || !UnifiedArtifactKt.PEER_SPACE_HOST.A08(str2) || (str = this.space_id) == null || !UnifiedArtifactKt.isValidUuid(str)) {
            return null;
        }
        String str4 = this.slug;
        if (str4 != null && str4.length() > 0) {
            str3 = str4;
        }
        return new ArtifactOpenTarget.PeerSpace(str2, str, str3, UnifiedArtifactKt.peerSpaceRootPath(str2, str));
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.slug;
    }

    public final String component3() {
        return this.shortcode;
    }

    public final String component4() {
        return this.path;
    }

    public final String component5() {
        return this.url;
    }

    public final String component6() {
        return this.host_muse;
    }

    public final String component7() {
        return this.space_id;
    }

    public final String getHost_muse() {
        return this.host_muse;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getShortcode() {
        return this.shortcode;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0G(this.slug)) * 31) + AnonymousClass006.A0G(this.shortcode)) * 31) + AnonymousClass006.A0G(this.path)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.host_muse)) * 31) + AnonymousClass005.A0H(this.space_id);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String resolveItemKey() {
        /*
            r3 = this;
            java.lang.String r1 = r3.kind
            int r0 = r1.hashCode()
            r2 = 0
            switch(r0) {
                case -1843153943: goto Lb;
                case 3143036: goto L1e;
                case 109637894: goto L31;
                case 411468110: goto L3c;
                default: goto La;
            }
        La:
            return r2
        Lb:
            java.lang.String r0 = "peer_space"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La
            com.facebook.aura.library.repo.ArtifactOpenTarget$PeerSpace r0 = r3.toPeerSpace()
            if (r0 == 0) goto La
            java.lang.String r1 = r0.getItemKey()
            goto L46
        L1e:
            java.lang.String r0 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La
            java.lang.String r1 = r3.path
            if (r1 == 0) goto La
            java.lang.String r0 = "/"
            java.lang.String r1 = X.C7BY.A0K(r0, r1)
            goto L46
        L31:
            java.lang.String r0 = "space"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La
            java.lang.String r1 = r3.slug
            goto L46
        L3c:
            java.lang.String r0 = "saved_space"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La
            java.lang.String r1 = r3.shortcode
        L46:
            if (r1 == 0) goto La
            int r0 = r1.length()
            if (r0 <= 0) goto La
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ArtifactOpenTargetJson.resolveItemKey():java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final ArtifactOpenTarget toDomain() {
        String strA0K;
        String strA0K2;
        ArtifactOpenTarget savedSpace;
        String strA0K3;
        String str = this.kind;
        ArtifactOpenTarget file = null;
        str = null;
        str = null;
        String str2 = null;
        file = null;
        file = null;
        file = null;
        file = null;
        file = null;
        str = null;
        str = null;
        String str3 = null;
        file = null;
        switch (str.hashCode()) {
            case -1843153943:
                if (str.equals("peer_space")) {
                    return toPeerSpace();
                }
                return null;
            case 3143036:
                if (str.equals("file")) {
                    String str4 = this.path;
                    if (str4 != null && (strA0K2 = C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str4)) != null && strA0K2.length() > 0) {
                        file = new ArtifactOpenTarget.File(strA0K2);
                    }
                    return file;
                }
                return null;
            case 109637894:
                if (str.equals("space")) {
                    String str5 = this.slug;
                    if (str5 != null && str5.length() > 0) {
                        String str6 = this.path;
                        if (str6 != null && (strA0K3 = C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str6)) != null && strA0K3.length() > 0) {
                            str2 = strA0K3;
                        }
                        savedSpace = new ArtifactOpenTarget.Space(str5, str2);
                        file = savedSpace;
                    }
                    return file;
                }
                return null;
            case 411468110:
                if (str.equals(PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SAVED_SPACE)) {
                    String str7 = this.shortcode;
                    if (str7 != null && str7.length() > 0) {
                        String str8 = this.path;
                        if (str8 != null && (strA0K = C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, str8)) != null && strA0K.length() > 0) {
                            str3 = strA0K;
                        }
                        savedSpace = new ArtifactOpenTarget.SavedSpace(str7, str3);
                        file = savedSpace;
                    }
                    return file;
                }
                return null;
            default:
                return null;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ArtifactOpenTargetJson(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C7384Etj.A0Y(str, 0);
        this.kind = str;
        this.slug = str2;
        this.shortcode = str3;
        this.path = str4;
        this.url = str5;
        this.host_muse = str6;
        this.space_id = str7;
    }

    public /* synthetic */ ArtifactOpenTargetJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public /* synthetic */ ArtifactOpenTargetJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C2hx c2hx) {
        this.kind = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.slug = null;
        } else {
            this.slug = str2;
        }
        if ((i & 4) == 0) {
            this.shortcode = null;
        } else {
            this.shortcode = str3;
        }
        if ((i & 8) == 0) {
            this.path = null;
        } else {
            this.path = str4;
        }
        if ((i & 16) == 0) {
            this.url = null;
        } else {
            this.url = str5;
        }
        if ((i & 32) == 0) {
            this.host_muse = null;
        } else {
            this.host_muse = str6;
        }
        if ((i & 64) == 0) {
            this.space_id = null;
        } else {
            this.space_id = str7;
        }
    }
}
