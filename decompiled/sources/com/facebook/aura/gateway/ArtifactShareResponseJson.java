package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactShareResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final FsErrorJson error;
    public final boolean ok;
    public final ArtifactSharePayloadJson result;
    public final String share_type;
    public final String url;

    public final class Companion {
        public final C9hr<ArtifactShareResponseJson> serializer() {
            return ArtifactShareResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ArtifactShareResponseJson(boolean z, ArtifactSharePayloadJson artifactSharePayloadJson, String str, String str2, FsErrorJson fsErrorJson) {
        C7384Etj.A0Y(str, 2);
        this.ok = z;
        this.result = artifactSharePayloadJson;
        this.url = str;
        this.share_type = str2;
        this.error = fsErrorJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ArtifactShareResponseJson artifactShareResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || artifactShareResponseJson.ok) {
            c9j5.AA7(c9iZ, 0, artifactShareResponseJson.ok);
        }
        if (zAfR || artifactShareResponseJson.result != null) {
            c9j5.AAP(artifactShareResponseJson.result, ArtifactSharePayloadJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cH.A1Q(artifactShareResponseJson.url)) {
            c9j5.AAV(artifactShareResponseJson.url, c9iZ, 2);
        }
        if (zAfR || artifactShareResponseJson.share_type != null) {
            c9j5.AAP(artifactShareResponseJson.share_type, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || artifactShareResponseJson.error != null) {
            c9j5.AAP(artifactShareResponseJson.error, FsErrorJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public final ArtifactShareResponseJson copy(boolean z, ArtifactSharePayloadJson artifactSharePayloadJson, String str, String str2, FsErrorJson fsErrorJson) {
        C7384Etj.A0Y(str, 2);
        return new ArtifactShareResponseJson(z, artifactSharePayloadJson, str, str2, fsErrorJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactShareResponseJson) {
                ArtifactShareResponseJson artifactShareResponseJson = (ArtifactShareResponseJson) obj;
                if (this.ok != artifactShareResponseJson.ok || !C7384Etj.areEqual(this.result, artifactShareResponseJson.result) || !C7384Etj.areEqual(this.url, artifactShareResponseJson.url) || !C7384Etj.areEqual(this.share_type, artifactShareResponseJson.share_type) || !C7384Etj.areEqual(this.error, artifactShareResponseJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactShareResponseJson copy$default(ArtifactShareResponseJson artifactShareResponseJson, boolean z, ArtifactSharePayloadJson artifactSharePayloadJson, String str, String str2, FsErrorJson fsErrorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = artifactShareResponseJson.ok;
        }
        if ((i & 2) != 0) {
            artifactSharePayloadJson = artifactShareResponseJson.result;
        }
        if ((i & 4) != 0) {
            str = artifactShareResponseJson.url;
        }
        if ((i & 8) != 0) {
            str2 = artifactShareResponseJson.share_type;
        }
        if ((i & 16) != 0) {
            fsErrorJson = artifactShareResponseJson.error;
        }
        return artifactShareResponseJson.copy(z, artifactSharePayloadJson, str, str2, fsErrorJson);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final ArtifactSharePayloadJson component2() {
        return this.result;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.share_type;
    }

    public final FsErrorJson component5() {
        return this.error;
    }

    public final FsErrorJson getError() {
        return this.error;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final ArtifactSharePayloadJson getResult() {
        return this.result;
    }

    public final String getShare_type() {
        return this.share_type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.url, (C0KA.A02(this.ok) + AnonymousClass006.A0D(this.result)) * 31) + AnonymousClass006.A0G(this.share_type)) * 31) + C3cH.A02(this.error);
    }

    public final String resolvedShareType() {
        String str;
        ArtifactSharePayloadJson artifactSharePayloadJson = this.result;
        return (artifactSharePayloadJson == null || (str = artifactSharePayloadJson.share_type) == null) ? this.share_type : str;
    }

    public final String resolvedUrl() {
        String str;
        ArtifactSharePayloadJson artifactSharePayloadJson = this.result;
        return (artifactSharePayloadJson == null || (str = artifactSharePayloadJson.url) == null) ? this.url : str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactShareResponseJson(boolean z, ArtifactSharePayloadJson artifactSharePayloadJson, String str, String str2, FsErrorJson fsErrorJson, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : artifactSharePayloadJson, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : fsErrorJson);
    }

    public /* synthetic */ ArtifactShareResponseJson(int i, boolean z, ArtifactSharePayloadJson artifactSharePayloadJson, String str, String str2, FsErrorJson fsErrorJson, C2hx c2hx) {
        this.ok = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.result = null;
        } else {
            this.result = artifactSharePayloadJson;
        }
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 8) == 0) {
            this.share_type = null;
        } else {
            this.share_type = str2;
        }
        if ((i & 16) == 0) {
            this.error = null;
        } else {
            this.error = fsErrorJson;
        }
    }

    public ArtifactShareResponseJson() {
        this(false, null, "", null, null);
    }
}
