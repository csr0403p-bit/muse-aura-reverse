package com.facebook.aura.skills.connect.repository;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectorOAuthRegisterRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final CustomConnectoJson connector;
    public final CustomConnectorOAuthBootstrapJson oauth_bootstrap;
    public final boolean replace_existing;
    public final String session_id;

    public final class Companion {
        public final C9hr<CustomConnectorOAuthRegisterRequestJson> serializer() {
            return CustomConnectorOAuthRegisterRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorOAuthRegisterRequestJson) {
                CustomConnectorOAuthRegisterRequestJson customConnectorOAuthRegisterRequestJson = (CustomConnectorOAuthRegisterRequestJson) obj;
                if (!C7384Etj.areEqual(this.connector, customConnectorOAuthRegisterRequestJson.connector) || !C7384Etj.areEqual(this.oauth_bootstrap, customConnectorOAuthRegisterRequestJson.oauth_bootstrap) || !C7384Etj.areEqual(this.session_id, customConnectorOAuthRegisterRequestJson.session_id) || this.replace_existing != customConnectorOAuthRegisterRequestJson.replace_existing) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorOAuthRegisterRequestJson copy$default(CustomConnectorOAuthRegisterRequestJson customConnectorOAuthRegisterRequestJson, CustomConnectoJson customConnectoJson, CustomConnectorOAuthBootstrapJson customConnectorOAuthBootstrapJson, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            customConnectoJson = customConnectorOAuthRegisterRequestJson.connector;
        }
        if ((i & 2) != 0) {
            customConnectorOAuthBootstrapJson = customConnectorOAuthRegisterRequestJson.oauth_bootstrap;
        }
        if ((i & 4) != 0) {
            str = customConnectorOAuthRegisterRequestJson.session_id;
        }
        if ((i & 8) != 0) {
            z = customConnectorOAuthRegisterRequestJson.replace_existing;
        }
        AnonymousClass003.A0u(customConnectoJson, customConnectorOAuthBootstrapJson);
        return new CustomConnectorOAuthRegisterRequestJson(customConnectoJson, customConnectorOAuthBootstrapJson, str, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_repository_repository(CustomConnectorOAuthRegisterRequestJson customConnectorOAuthRegisterRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(customConnectorOAuthRegisterRequestJson.connector, CustomConnectoJson$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAQ(customConnectorOAuthRegisterRequestJson.oauth_bootstrap, CustomConnectorOAuthBootstrapJson$$serializer.INSTANCE, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || customConnectorOAuthRegisterRequestJson.session_id != null) {
            c9j5.AAP(customConnectorOAuthRegisterRequestJson.session_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !customConnectorOAuthRegisterRequestJson.replace_existing) {
            c9j5.AA7(c9iZ, 3, customConnectorOAuthRegisterRequestJson.replace_existing);
        }
    }

    public final CustomConnectoJson component1() {
        return this.connector;
    }

    public final CustomConnectorOAuthBootstrapJson component2() {
        return this.oauth_bootstrap;
    }

    public final String component3() {
        return this.session_id;
    }

    public final boolean component4() {
        return this.replace_existing;
    }

    public final CustomConnectoJson getConnector() {
        return this.connector;
    }

    public final CustomConnectorOAuthBootstrapJson getOauth_bootstrap() {
        return this.oauth_bootstrap;
    }

    public final boolean getReplace_existing() {
        return this.replace_existing;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.oauth_bootstrap, AnonymousClass005.A0E(this.connector)) + AnonymousClass006.A0G(this.session_id)) * 31, this.replace_existing);
    }

    public CustomConnectorOAuthRegisterRequestJson(CustomConnectoJson customConnectoJson, CustomConnectorOAuthBootstrapJson customConnectorOAuthBootstrapJson, String str, boolean z) {
        AnonymousClass003.A0u(customConnectoJson, customConnectorOAuthBootstrapJson);
        this.connector = customConnectoJson;
        this.oauth_bootstrap = customConnectorOAuthBootstrapJson;
        this.session_id = str;
        this.replace_existing = z;
    }

    public final CustomConnectorOAuthRegisterRequestJson copy(CustomConnectoJson customConnectoJson, CustomConnectorOAuthBootstrapJson customConnectorOAuthBootstrapJson, String str, boolean z) {
        AnonymousClass003.A0u(customConnectoJson, customConnectorOAuthBootstrapJson);
        return new CustomConnectorOAuthRegisterRequestJson(customConnectoJson, customConnectorOAuthBootstrapJson, str, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorOAuthRegisterRequestJson(int i, CustomConnectoJson customConnectoJson, CustomConnectorOAuthBootstrapJson customConnectorOAuthBootstrapJson, String str, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CustomConnectorOAuthRegisterRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.connector = customConnectoJson;
        this.oauth_bootstrap = customConnectorOAuthBootstrapJson;
        this.session_id = C3cI.A0W(i, str);
        if ((i & 8) == 0) {
            this.replace_existing = true;
        } else {
            this.replace_existing = z;
        }
    }

    public /* synthetic */ CustomConnectorOAuthRegisterRequestJson(CustomConnectoJson customConnectoJson, CustomConnectorOAuthBootstrapJson customConnectorOAuthBootstrapJson, String str, boolean z, int i, C06H c06h) {
        this(customConnectoJson, customConnectorOAuthBootstrapJson, AnonymousClass006.A0t(i, str), (i & 8) != 0 ? true : z);
    }
}
