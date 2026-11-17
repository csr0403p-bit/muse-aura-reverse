package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactRemovePayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String destroyed;

    public final class Companion {
        public final C9hr<ArtifactRemovePayloadJson> serializer() {
            return ArtifactRemovePayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ArtifactRemovePayloadJson artifactRemovePayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(artifactRemovePayloadJson.destroyed)) {
            c9j5.AAV(artifactRemovePayloadJson.destroyed, c9iZ, 0);
        }
    }

    public final ArtifactRemovePayloadJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ArtifactRemovePayloadJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ArtifactRemovePayloadJson) && C7384Etj.areEqual(this.destroyed, ((ArtifactRemovePayloadJson) obj).destroyed));
    }

    public static /* synthetic */ ArtifactRemovePayloadJson copy$default(ArtifactRemovePayloadJson artifactRemovePayloadJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactRemovePayloadJson.destroyed;
        }
        C7384Etj.A0Y(str, 0);
        return new ArtifactRemovePayloadJson(str);
    }

    public final String component1() {
        return this.destroyed;
    }

    public final String getDestroyed() {
        return this.destroyed;
    }

    public int hashCode() {
        return this.destroyed.hashCode();
    }

    public /* synthetic */ ArtifactRemovePayloadJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.destroyed = "";
        } else {
            this.destroyed = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ArtifactRemovePayloadJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.destroyed = str;
    }

    public /* synthetic */ ArtifactRemovePayloadJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public ArtifactRemovePayloadJson() {
        this("");
    }
}
