package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactSharePayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final SpaceShareDisclosureConfirmationJson disclosure_confirmation;
    public final String share_type;
    public final String url;

    public final class Companion {
        public final C9hr<ArtifactSharePayloadJson> serializer() {
            return ArtifactSharePayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ArtifactSharePayloadJson(String str, String str2, SpaceShareDisclosureConfirmationJson spaceShareDisclosureConfirmationJson) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.share_type = str2;
        this.disclosure_confirmation = spaceShareDisclosureConfirmationJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ArtifactSharePayloadJson artifactSharePayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(artifactSharePayloadJson.url)) {
            c9j5.AAV(artifactSharePayloadJson.url, c9iZ, 0);
        }
        if (zAfR || artifactSharePayloadJson.share_type != null) {
            c9j5.AAP(artifactSharePayloadJson.share_type, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || artifactSharePayloadJson.disclosure_confirmation != null) {
            c9j5.AAP(artifactSharePayloadJson.disclosure_confirmation, SpaceShareDisclosureConfirmationJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public final ArtifactSharePayloadJson copy(String str, String str2, SpaceShareDisclosureConfirmationJson spaceShareDisclosureConfirmationJson) {
        C7384Etj.A0Y(str, 0);
        return new ArtifactSharePayloadJson(str, str2, spaceShareDisclosureConfirmationJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactSharePayloadJson) {
                ArtifactSharePayloadJson artifactSharePayloadJson = (ArtifactSharePayloadJson) obj;
                if (!C7384Etj.areEqual(this.url, artifactSharePayloadJson.url) || !C7384Etj.areEqual(this.share_type, artifactSharePayloadJson.share_type) || !C7384Etj.areEqual(this.disclosure_confirmation, artifactSharePayloadJson.disclosure_confirmation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactSharePayloadJson copy$default(ArtifactSharePayloadJson artifactSharePayloadJson, String str, String str2, SpaceShareDisclosureConfirmationJson spaceShareDisclosureConfirmationJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactSharePayloadJson.url;
        }
        if ((i & 2) != 0) {
            str2 = artifactSharePayloadJson.share_type;
        }
        if ((i & 4) != 0) {
            spaceShareDisclosureConfirmationJson = artifactSharePayloadJson.disclosure_confirmation;
        }
        return artifactSharePayloadJson.copy(str, str2, spaceShareDisclosureConfirmationJson);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.share_type;
    }

    public final SpaceShareDisclosureConfirmationJson component3() {
        return this.disclosure_confirmation;
    }

    public final SpaceShareDisclosureConfirmationJson getDisclosure_confirmation() {
        return this.disclosure_confirmation;
    }

    public final String getShare_type() {
        return this.share_type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.url) + AnonymousClass006.A0G(this.share_type)) * 31) + C3cH.A02(this.disclosure_confirmation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactSharePayloadJson(int i, String str, String str2, SpaceShareDisclosureConfirmationJson spaceShareDisclosureConfirmationJson, C2hx c2hx) {
        this.url = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.share_type = null;
        } else {
            this.share_type = str2;
        }
        if ((i & 4) == 0) {
            this.disclosure_confirmation = null;
        } else {
            this.disclosure_confirmation = spaceShareDisclosureConfirmationJson;
        }
    }

    public /* synthetic */ ArtifactSharePayloadJson(String str, String str2, SpaceShareDisclosureConfirmationJson spaceShareDisclosureConfirmationJson, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : spaceShareDisclosureConfirmationJson);
    }

    public ArtifactSharePayloadJson() {
        this("", null, null);
    }
}
