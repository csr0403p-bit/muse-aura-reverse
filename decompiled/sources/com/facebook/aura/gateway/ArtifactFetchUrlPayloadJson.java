package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactFetchUrlPayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String last_updated;
    public final String url;

    public final class Companion {
        public final C9hr<ArtifactFetchUrlPayloadJson> serializer() {
            return ArtifactFetchUrlPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ArtifactFetchUrlPayloadJson artifactFetchUrlPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(artifactFetchUrlPayloadJson.url)) {
            c9j5.AAV(artifactFetchUrlPayloadJson.url, c9iZ, 0);
        }
        if (zAfR || !"".equals(artifactFetchUrlPayloadJson.last_updated)) {
            c9j5.AAV(artifactFetchUrlPayloadJson.last_updated, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactFetchUrlPayloadJson) {
                ArtifactFetchUrlPayloadJson artifactFetchUrlPayloadJson = (ArtifactFetchUrlPayloadJson) obj;
                if (!C7384Etj.areEqual(this.url, artifactFetchUrlPayloadJson.url) || !C7384Etj.areEqual(this.last_updated, artifactFetchUrlPayloadJson.last_updated)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactFetchUrlPayloadJson copy$default(ArtifactFetchUrlPayloadJson artifactFetchUrlPayloadJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactFetchUrlPayloadJson.url;
        }
        if ((i & 2) != 0) {
            str2 = artifactFetchUrlPayloadJson.last_updated;
        }
        AnonymousClass003.A0u(str, str2);
        return new ArtifactFetchUrlPayloadJson(str, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.last_updated;
    }

    public final String getLast_updated() {
        return this.last_updated;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.last_updated, AnonymousClass001.A0G(this.url));
    }

    public ArtifactFetchUrlPayloadJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.url = str;
        this.last_updated = str2;
    }

    public final ArtifactFetchUrlPayloadJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ArtifactFetchUrlPayloadJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactFetchUrlPayloadJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.last_updated = "";
        } else {
            this.last_updated = str2;
        }
    }

    public /* synthetic */ ArtifactFetchUrlPayloadJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public ArtifactFetchUrlPayloadJson() {
        this("", "");
    }
}
