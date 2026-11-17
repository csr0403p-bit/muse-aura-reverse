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
public final class CustomConnectorApiKeyRegisterRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final CustomConnectorApiKeyCredentialJson api_key;
    public final CustomConnectoJson connector;
    public final boolean replace_existing;
    public final String session_id;

    public final class Companion {
        public final C9hr<CustomConnectorApiKeyRegisterRequestJson> serializer() {
            return CustomConnectorApiKeyRegisterRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorApiKeyRegisterRequestJson) {
                CustomConnectorApiKeyRegisterRequestJson customConnectorApiKeyRegisterRequestJson = (CustomConnectorApiKeyRegisterRequestJson) obj;
                if (!C7384Etj.areEqual(this.connector, customConnectorApiKeyRegisterRequestJson.connector) || !C7384Etj.areEqual(this.api_key, customConnectorApiKeyRegisterRequestJson.api_key) || !C7384Etj.areEqual(this.session_id, customConnectorApiKeyRegisterRequestJson.session_id) || this.replace_existing != customConnectorApiKeyRegisterRequestJson.replace_existing) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorApiKeyRegisterRequestJson copy$default(CustomConnectorApiKeyRegisterRequestJson customConnectorApiKeyRegisterRequestJson, CustomConnectoJson customConnectoJson, CustomConnectorApiKeyCredentialJson customConnectorApiKeyCredentialJson, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            customConnectoJson = customConnectorApiKeyRegisterRequestJson.connector;
        }
        if ((i & 2) != 0) {
            customConnectorApiKeyCredentialJson = customConnectorApiKeyRegisterRequestJson.api_key;
        }
        if ((i & 4) != 0) {
            str = customConnectorApiKeyRegisterRequestJson.session_id;
        }
        if ((i & 8) != 0) {
            z = customConnectorApiKeyRegisterRequestJson.replace_existing;
        }
        AnonymousClass003.A0u(customConnectoJson, customConnectorApiKeyCredentialJson);
        return new CustomConnectorApiKeyRegisterRequestJson(customConnectoJson, customConnectorApiKeyCredentialJson, str, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_repository_repository(CustomConnectorApiKeyRegisterRequestJson customConnectorApiKeyRegisterRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(customConnectorApiKeyRegisterRequestJson.connector, CustomConnectoJson$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAQ(customConnectorApiKeyRegisterRequestJson.api_key, CustomConnectorApiKeyCredentialJson$$serializer.INSTANCE, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || customConnectorApiKeyRegisterRequestJson.session_id != null) {
            c9j5.AAP(customConnectorApiKeyRegisterRequestJson.session_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !customConnectorApiKeyRegisterRequestJson.replace_existing) {
            c9j5.AA7(c9iZ, 3, customConnectorApiKeyRegisterRequestJson.replace_existing);
        }
    }

    public final CustomConnectoJson component1() {
        return this.connector;
    }

    public final CustomConnectorApiKeyCredentialJson component2() {
        return this.api_key;
    }

    public final String component3() {
        return this.session_id;
    }

    public final boolean component4() {
        return this.replace_existing;
    }

    public final CustomConnectorApiKeyCredentialJson getApi_key() {
        return this.api_key;
    }

    public final CustomConnectoJson getConnector() {
        return this.connector;
    }

    public final boolean getReplace_existing() {
        return this.replace_existing;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.api_key, AnonymousClass005.A0E(this.connector)) + AnonymousClass006.A0G(this.session_id)) * 31, this.replace_existing);
    }

    public CustomConnectorApiKeyRegisterRequestJson(CustomConnectoJson customConnectoJson, CustomConnectorApiKeyCredentialJson customConnectorApiKeyCredentialJson, String str, boolean z) {
        AnonymousClass003.A0u(customConnectoJson, customConnectorApiKeyCredentialJson);
        this.connector = customConnectoJson;
        this.api_key = customConnectorApiKeyCredentialJson;
        this.session_id = str;
        this.replace_existing = z;
    }

    public final CustomConnectorApiKeyRegisterRequestJson copy(CustomConnectoJson customConnectoJson, CustomConnectorApiKeyCredentialJson customConnectorApiKeyCredentialJson, String str, boolean z) {
        AnonymousClass003.A0u(customConnectoJson, customConnectorApiKeyCredentialJson);
        return new CustomConnectorApiKeyRegisterRequestJson(customConnectoJson, customConnectorApiKeyCredentialJson, str, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorApiKeyRegisterRequestJson(int i, CustomConnectoJson customConnectoJson, CustomConnectorApiKeyCredentialJson customConnectorApiKeyCredentialJson, String str, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CustomConnectorApiKeyRegisterRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.connector = customConnectoJson;
        this.api_key = customConnectorApiKeyCredentialJson;
        this.session_id = C3cI.A0W(i, str);
        if ((i & 8) == 0) {
            this.replace_existing = true;
        } else {
            this.replace_existing = z;
        }
    }

    public /* synthetic */ CustomConnectorApiKeyRegisterRequestJson(CustomConnectoJson customConnectoJson, CustomConnectorApiKeyCredentialJson customConnectorApiKeyCredentialJson, String str, boolean z, int i, C06H c06h) {
        this(customConnectoJson, customConnectorApiKeyCredentialJson, AnonymousClass006.A0t(i, str), (i & 8) != 0 ? true : z);
    }
}
