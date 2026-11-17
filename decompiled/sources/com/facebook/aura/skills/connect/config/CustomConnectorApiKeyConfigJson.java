package com.facebook.aura.skills.connect.config;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectorApiKeyConfigJson extends C06G {
    public static final Companion Companion = new Companion();
    public final CustomConnectorApiKeyConnectorJson connector;
    public final int version;

    public final class Companion {
        public final C9hr<CustomConnectorApiKeyConfigJson> serializer() {
            return CustomConnectorApiKeyConfigJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CustomConnectorApiKeyConfigJson(int i, CustomConnectorApiKeyConnectorJson customConnectorApiKeyConnectorJson) {
        C7384Etj.A0Y(customConnectorApiKeyConnectorJson, 1);
        this.version = i;
        this.connector = customConnectorApiKeyConnectorJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(CustomConnectorApiKeyConfigJson customConnectorApiKeyConfigJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || customConnectorApiKeyConfigJson.version != 0) {
            c9j5.AAK(c9iZ, 0, customConnectorApiKeyConfigJson.version);
        }
        if (!zAfR) {
            CustomConnectorApiKeyConnectorJson customConnectorApiKeyConnectorJson = customConnectorApiKeyConfigJson.connector;
            C0881AGi c0881AGi = C0881AGi.A00;
            if (C7384Etj.areEqual(customConnectorApiKeyConnectorJson, new CustomConnectorApiKeyConnectorJson("", "", c0881AGi, c0881AGi))) {
                return;
            }
        }
        c9j5.AAQ(customConnectorApiKeyConfigJson.connector, CustomConnectorApiKeyConnectorJson$$serializer.INSTANCE, c9iZ, 1);
    }

    public final CustomConnectorApiKeyConfigJson copy(int i, CustomConnectorApiKeyConnectorJson customConnectorApiKeyConnectorJson) {
        C7384Etj.A0Y(customConnectorApiKeyConnectorJson, 1);
        return new CustomConnectorApiKeyConfigJson(i, customConnectorApiKeyConnectorJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorApiKeyConfigJson) {
                CustomConnectorApiKeyConfigJson customConnectorApiKeyConfigJson = (CustomConnectorApiKeyConfigJson) obj;
                if (this.version != customConnectorApiKeyConfigJson.version || !C7384Etj.areEqual(this.connector, customConnectorApiKeyConfigJson.connector)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorApiKeyConfigJson copy$default(CustomConnectorApiKeyConfigJson customConnectorApiKeyConfigJson, int i, CustomConnectorApiKeyConnectorJson customConnectorApiKeyConnectorJson, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customConnectorApiKeyConfigJson.version;
        }
        if ((i2 & 2) != 0) {
            customConnectorApiKeyConnectorJson = customConnectorApiKeyConfigJson.connector;
        }
        C7384Etj.A0Y(customConnectorApiKeyConnectorJson, 1);
        return new CustomConnectorApiKeyConfigJson(i, customConnectorApiKeyConnectorJson);
    }

    public final int component1() {
        return this.version;
    }

    public final CustomConnectorApiKeyConnectorJson component2() {
        return this.connector;
    }

    public final CustomConnectorApiKeyConnectorJson getConnector() {
        return this.connector;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.connector, this.version * 31);
    }

    public final CustomConnectorApiKeyConfig toDomain() {
        return new CustomConnectorApiKeyConfig(this.version, this.connector.toDomain());
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorApiKeyConfigJson(int i, int i2, CustomConnectorApiKeyConnectorJson customConnectorApiKeyConnectorJson, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            C0881AGi c0881AGi = C0881AGi.A00;
            this.connector = new CustomConnectorApiKeyConnectorJson("", "", c0881AGi, c0881AGi);
        } else {
            this.connector = customConnectorApiKeyConnectorJson;
        }
    }

    public /* synthetic */ CustomConnectorApiKeyConfigJson(int i, CustomConnectorApiKeyConnectorJson customConnectorApiKeyConnectorJson, int i2, C06H c06h) {
        int iA00 = C3cI.A00(i2, i);
        if ((i2 & 2) != 0) {
            C0881AGi c0881AGi = C0881AGi.A00;
            customConnectorApiKeyConnectorJson = new CustomConnectorApiKeyConnectorJson("", "", c0881AGi, c0881AGi);
        }
        this(iA00, customConnectorApiKeyConnectorJson);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomConnectorApiKeyConfigJson() {
        this(0, (CustomConnectorApiKeyConnectorJson) null, 3, (C06H) (0 == true ? 1 : 0));
    }
}
