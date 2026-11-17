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
public final class CustomConnectorApiKeyNameProbeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final CustomConnectorNameJson connector;

    public final class Companion {
        public final C9hr<CustomConnectorApiKeyNameProbeJson> serializer() {
            return CustomConnectorApiKeyNameProbeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(CustomConnectorApiKeyNameProbeJson customConnectorApiKeyNameProbeJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C7384Etj.areEqual(customConnectorApiKeyNameProbeJson.connector, new CustomConnectorNameJson(""))) {
            c9j5.AAQ(customConnectorApiKeyNameProbeJson.connector, CustomConnectorNameJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public final CustomConnectorApiKeyNameProbeJson copy(CustomConnectorNameJson customConnectorNameJson) {
        C7384Etj.A0Y(customConnectorNameJson, 0);
        return new CustomConnectorApiKeyNameProbeJson(customConnectorNameJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CustomConnectorApiKeyNameProbeJson) && C7384Etj.areEqual(this.connector, ((CustomConnectorApiKeyNameProbeJson) obj).connector));
    }

    public static /* synthetic */ CustomConnectorApiKeyNameProbeJson copy$default(CustomConnectorApiKeyNameProbeJson customConnectorApiKeyNameProbeJson, CustomConnectorNameJson customConnectorNameJson, int i, Object obj) {
        if ((i & 1) != 0) {
            customConnectorNameJson = customConnectorApiKeyNameProbeJson.connector;
        }
        C7384Etj.A0Y(customConnectorNameJson, 0);
        return new CustomConnectorApiKeyNameProbeJson(customConnectorNameJson);
    }

    public final CustomConnectorNameJson component1() {
        return this.connector;
    }

    public final CustomConnectorNameJson getConnector() {
        return this.connector;
    }

    public int hashCode() {
        return this.connector.hashCode();
    }

    public /* synthetic */ CustomConnectorApiKeyNameProbeJson(int i, CustomConnectorNameJson customConnectorNameJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.connector = new CustomConnectorNameJson("");
        } else {
            this.connector = customConnectorNameJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectorApiKeyNameProbeJson(CustomConnectorNameJson customConnectorNameJson) {
        C7384Etj.A0Y(customConnectorNameJson, 0);
        this.connector = customConnectorNameJson;
    }

    public /* synthetic */ CustomConnectorApiKeyNameProbeJson(CustomConnectorNameJson customConnectorNameJson, int i, C06H c06h) {
        this((i & 1) != 0 ? new CustomConnectorNameJson("") : customConnectorNameJson);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomConnectorApiKeyNameProbeJson() {
        this((CustomConnectorNameJson) null, 1, (C06H) (0 == true ? 1 : 0));
    }
}
