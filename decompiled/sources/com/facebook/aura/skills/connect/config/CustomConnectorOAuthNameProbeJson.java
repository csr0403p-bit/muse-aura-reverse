package com.facebook.aura.skills.connect.config;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectorOAuthNameProbeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final CustomConnectorNameJson credential;

    public final class Companion {
        public final C9hr<CustomConnectorOAuthNameProbeJson> serializer() {
            return CustomConnectorOAuthNameProbeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(CustomConnectorOAuthNameProbeJson customConnectorOAuthNameProbeJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C7384Etj.areEqual(customConnectorOAuthNameProbeJson.credential, new CustomConnectorNameJson(""))) {
            c9j5.AAQ(customConnectorOAuthNameProbeJson.credential, CustomConnectorNameJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public final CustomConnectorOAuthNameProbeJson copy(CustomConnectorNameJson customConnectorNameJson) {
        C7384Etj.A0Y(customConnectorNameJson, 0);
        return new CustomConnectorOAuthNameProbeJson(customConnectorNameJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CustomConnectorOAuthNameProbeJson) && C7384Etj.areEqual(this.credential, ((CustomConnectorOAuthNameProbeJson) obj).credential));
    }

    public static /* synthetic */ CustomConnectorOAuthNameProbeJson copy$default(CustomConnectorOAuthNameProbeJson customConnectorOAuthNameProbeJson, CustomConnectorNameJson customConnectorNameJson, int i, Object obj) {
        if ((i & 1) != 0) {
            customConnectorNameJson = customConnectorOAuthNameProbeJson.credential;
        }
        C7384Etj.A0Y(customConnectorNameJson, 0);
        return new CustomConnectorOAuthNameProbeJson(customConnectorNameJson);
    }

    public final CustomConnectorNameJson component1() {
        return this.credential;
    }

    public final CustomConnectorNameJson getCredential() {
        return this.credential;
    }

    public int hashCode() {
        return this.credential.hashCode();
    }

    public /* synthetic */ CustomConnectorOAuthNameProbeJson(int i, CustomConnectorNameJson customConnectorNameJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.credential = new CustomConnectorNameJson("");
        } else {
            this.credential = customConnectorNameJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectorOAuthNameProbeJson(CustomConnectorNameJson customConnectorNameJson) {
        C7384Etj.A0Y(customConnectorNameJson, 0);
        this.credential = customConnectorNameJson;
    }

    public /* synthetic */ CustomConnectorOAuthNameProbeJson(CustomConnectorNameJson customConnectorNameJson, int i, C06H c06h) {
        this((i & 1) != 0 ? new CustomConnectorNameJson("") : customConnectorNameJson);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomConnectorOAuthNameProbeJson() {
        this((CustomConnectorNameJson) null, 1, (C06H) (0 == true ? 1 : 0));
    }
}
