package com.facebook.aura.skills.connect.config;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectorOAuthConfigJson extends C06G {
    public static final Companion Companion = new Companion();
    public final CustomConnectorOAuthCredentialJson credential;
    public final int version;

    public final class Companion {
        public final C9hr<CustomConnectorOAuthConfigJson> serializer() {
            return CustomConnectorOAuthConfigJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CustomConnectorOAuthConfigJson(int i, CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson) {
        C7384Etj.A0Y(customConnectorOAuthCredentialJson, 1);
        this.version = i;
        this.credential = customConnectorOAuthCredentialJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(CustomConnectorOAuthConfigJson customConnectorOAuthConfigJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || customConnectorOAuthConfigJson.version != 0) {
            c9j5.AAK(c9iZ, 0, customConnectorOAuthConfigJson.version);
        }
        if (!zAfR) {
            if (C7384Etj.areEqual(customConnectorOAuthConfigJson.credential, new CustomConnectorOAuthCredentialJson((String) null, (List) (0 == true ? 1 : 0), (CustomConnectorOAuthDetailsJson) (0 == true ? 1 : 0), 7, (C06H) (0 == true ? 1 : 0)))) {
                return;
            }
        }
        c9j5.AAQ(customConnectorOAuthConfigJson.credential, CustomConnectorOAuthCredentialJson$$serializer.INSTANCE, c9iZ, 1);
    }

    public final CustomConnectorOAuthConfigJson copy(int i, CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson) {
        C7384Etj.A0Y(customConnectorOAuthCredentialJson, 1);
        return new CustomConnectorOAuthConfigJson(i, customConnectorOAuthCredentialJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorOAuthConfigJson) {
                CustomConnectorOAuthConfigJson customConnectorOAuthConfigJson = (CustomConnectorOAuthConfigJson) obj;
                if (this.version != customConnectorOAuthConfigJson.version || !C7384Etj.areEqual(this.credential, customConnectorOAuthConfigJson.credential)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorOAuthConfigJson copy$default(CustomConnectorOAuthConfigJson customConnectorOAuthConfigJson, int i, CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customConnectorOAuthConfigJson.version;
        }
        if ((i2 & 2) != 0) {
            customConnectorOAuthCredentialJson = customConnectorOAuthConfigJson.credential;
        }
        C7384Etj.A0Y(customConnectorOAuthCredentialJson, 1);
        return new CustomConnectorOAuthConfigJson(i, customConnectorOAuthCredentialJson);
    }

    public final int component1() {
        return this.version;
    }

    public final CustomConnectorOAuthCredentialJson component2() {
        return this.credential;
    }

    public final CustomConnectorOAuthCredentialJson getCredential() {
        return this.credential;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.credential, this.version * 31);
    }

    public final CustomConnectorOAuthConfig toDomain() {
        return new CustomConnectorOAuthConfig(this.version, this.credential.toDomain());
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CustomConnectorOAuthConfigJson(int i, int i2, CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.credential = new CustomConnectorOAuthCredentialJson((String) null, (List) (0 == true ? 1 : 0), (CustomConnectorOAuthDetailsJson) (0 == true ? 1 : 0), 7, (C06H) (0 == true ? 1 : 0));
        } else {
            this.credential = customConnectorOAuthCredentialJson;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CustomConnectorOAuthConfigJson(int i, CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson, int i2, C06H c06h) {
        CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson2 = customConnectorOAuthCredentialJson;
        int iA00 = C3cI.A00(i2, i);
        if ((i2 & 2) != 0) {
            customConnectorOAuthCredentialJson2 = new CustomConnectorOAuthCredentialJson((String) null, (List) (0 == true ? 1 : 0), (CustomConnectorOAuthDetailsJson) (0 == true ? 1 : 0), 7, (C06H) (0 == true ? 1 : 0));
        }
        this(iA00, customConnectorOAuthCredentialJson2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomConnectorOAuthConfigJson() {
        this(0, (CustomConnectorOAuthCredentialJson) null, 3, (C06H) (0 == true ? 1 : 0));
    }
}
