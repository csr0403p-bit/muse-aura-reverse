package com.facebook.aura.skills.connect.repository;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectorOAuthBootstrapJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String authorization_url;
    public final String client_id;
    public final String client_secret;
    public final String issuer_domain;
    public final String redirect_uri;
    public final String revoke_url;
    public final String scope;
    public final String token_endpoint_auth_method;
    public final String token_url;
    public final String user_id;

    public final class Companion {
        public final C9hr<CustomConnectorOAuthBootstrapJson> serializer() {
            return CustomConnectorOAuthBootstrapJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_repository_repository(CustomConnectorOAuthBootstrapJson customConnectorOAuthBootstrapJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(customConnectorOAuthBootstrapJson.issuer_domain, c9iZ, 0);
        c9j5.AAV(customConnectorOAuthBootstrapJson.authorization_url, c9iZ, 1);
        c9j5.AAV(customConnectorOAuthBootstrapJson.token_url, c9iZ, 2);
        c9j5.AAV(customConnectorOAuthBootstrapJson.redirect_uri, c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || customConnectorOAuthBootstrapJson.revoke_url != null) {
            c9j5.AAP(customConnectorOAuthBootstrapJson.revoke_url, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || customConnectorOAuthBootstrapJson.scope != null) {
            c9j5.AAP(customConnectorOAuthBootstrapJson.scope, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || customConnectorOAuthBootstrapJson.user_id != null) {
            c9j5.AAP(customConnectorOAuthBootstrapJson.user_id, C07779iq.A01, c9iZ, 6);
        }
        c9j5.AAV(customConnectorOAuthBootstrapJson.client_id, c9iZ, 7);
        if (zAfR || customConnectorOAuthBootstrapJson.client_secret != null) {
            c9j5.AAP(customConnectorOAuthBootstrapJson.client_secret, C07779iq.A01, c9iZ, 8);
        }
        c9j5.AAV(customConnectorOAuthBootstrapJson.token_endpoint_auth_method, c9iZ, 9);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorOAuthBootstrapJson) {
                CustomConnectorOAuthBootstrapJson customConnectorOAuthBootstrapJson = (CustomConnectorOAuthBootstrapJson) obj;
                if (!C7384Etj.areEqual(this.issuer_domain, customConnectorOAuthBootstrapJson.issuer_domain) || !C7384Etj.areEqual(this.authorization_url, customConnectorOAuthBootstrapJson.authorization_url) || !C7384Etj.areEqual(this.token_url, customConnectorOAuthBootstrapJson.token_url) || !C7384Etj.areEqual(this.redirect_uri, customConnectorOAuthBootstrapJson.redirect_uri) || !C7384Etj.areEqual(this.revoke_url, customConnectorOAuthBootstrapJson.revoke_url) || !C7384Etj.areEqual(this.scope, customConnectorOAuthBootstrapJson.scope) || !C7384Etj.areEqual(this.user_id, customConnectorOAuthBootstrapJson.user_id) || !C7384Etj.areEqual(this.client_id, customConnectorOAuthBootstrapJson.client_id) || !C7384Etj.areEqual(this.client_secret, customConnectorOAuthBootstrapJson.client_secret) || !C7384Etj.areEqual(this.token_endpoint_auth_method, customConnectorOAuthBootstrapJson.token_endpoint_auth_method)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CustomConnectorOAuthBootstrapJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C2hx c2hx) {
        if (655 != (i & 655)) {
            C9iI.A00(CustomConnectorOAuthBootstrapJson$$serializer.descriptor, i, 655);
            throw F60.createAndThrow();
        }
        this.issuer_domain = str;
        this.authorization_url = str2;
        this.token_url = str3;
        this.redirect_uri = str4;
        if ((i & 16) == 0) {
            this.revoke_url = null;
        } else {
            this.revoke_url = str5;
        }
        if ((i & 32) == 0) {
            this.scope = null;
        } else {
            this.scope = str6;
        }
        if ((i & 64) == 0) {
            this.user_id = null;
        } else {
            this.user_id = str7;
        }
        this.client_id = str8;
        if ((i & 256) == 0) {
            this.client_secret = null;
        } else {
            this.client_secret = str9;
        }
        this.token_endpoint_auth_method = str10;
    }

    public static /* synthetic */ CustomConnectorOAuthBootstrapJson copy$default(CustomConnectorOAuthBootstrapJson customConnectorOAuthBootstrapJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorOAuthBootstrapJson.issuer_domain;
        }
        if ((i & 2) != 0) {
            str2 = customConnectorOAuthBootstrapJson.authorization_url;
        }
        if ((i & 4) != 0) {
            str3 = customConnectorOAuthBootstrapJson.token_url;
        }
        if ((i & 8) != 0) {
            str4 = customConnectorOAuthBootstrapJson.redirect_uri;
        }
        if ((i & 16) != 0) {
            str5 = customConnectorOAuthBootstrapJson.revoke_url;
        }
        if ((i & 32) != 0) {
            str6 = customConnectorOAuthBootstrapJson.scope;
        }
        if ((i & 64) != 0) {
            str7 = customConnectorOAuthBootstrapJson.user_id;
        }
        if ((i & 128) != 0) {
            str8 = customConnectorOAuthBootstrapJson.client_id;
        }
        if ((i & 256) != 0) {
            str9 = customConnectorOAuthBootstrapJson.client_secret;
        }
        if ((i & 512) != 0) {
            str10 = customConnectorOAuthBootstrapJson.token_endpoint_auth_method;
        }
        return customConnectorOAuthBootstrapJson.copy(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public final String component1() {
        return this.issuer_domain;
    }

    public final String component10() {
        return this.token_endpoint_auth_method;
    }

    public final String component2() {
        return this.authorization_url;
    }

    public final String component3() {
        return this.token_url;
    }

    public final String component4() {
        return this.redirect_uri;
    }

    public final String component5() {
        return this.revoke_url;
    }

    public final String component6() {
        return this.scope;
    }

    public final String component7() {
        return this.user_id;
    }

    public final String component8() {
        return this.client_id;
    }

    public final String component9() {
        return this.client_secret;
    }

    public final String getAuthorization_url() {
        return this.authorization_url;
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final String getClient_secret() {
        return this.client_secret;
    }

    public final String getIssuer_domain() {
        return this.issuer_domain;
    }

    public final String getRedirect_uri() {
        return this.redirect_uri;
    }

    public final String getRevoke_url() {
        return this.revoke_url;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getToken_endpoint_auth_method() {
        return this.token_endpoint_auth_method;
    }

    public final String getToken_url() {
        return this.token_url;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.token_endpoint_auth_method, (AnonymousClass005.A0I(this.client_id, (((((AnonymousClass005.A0I(this.redirect_uri, AnonymousClass005.A0I(this.token_url, AnonymousClass005.A0I(this.authorization_url, AnonymousClass001.A0G(this.issuer_domain)))) + AnonymousClass006.A0G(this.revoke_url)) * 31) + AnonymousClass006.A0G(this.scope)) * 31) + AnonymousClass006.A0G(this.user_id)) * 31) + AnonymousClass005.A0H(this.client_secret)) * 31);
    }

    public final CustomConnectorOAuthBootstrapJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AnonymousClass005.A14(str, str2, str3, str4);
        AnonymousClass002.A1F(str8, 7, str10);
        return new CustomConnectorOAuthBootstrapJson(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorOAuthBootstrapJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, C06H c06h) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, str8, (i & 256) != 0 ? null : str9, str10);
    }

    public CustomConnectorOAuthBootstrapJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AnonymousClass005.A14(str, str2, str3, str4);
        AnonymousClass002.A1F(str8, 7, str10);
        this.issuer_domain = str;
        this.authorization_url = str2;
        this.token_url = str3;
        this.redirect_uri = str4;
        this.revoke_url = str5;
        this.scope = str6;
        this.user_id = str7;
        this.client_id = str8;
        this.client_secret = str9;
        this.token_endpoint_auth_method = str10;
    }
}
