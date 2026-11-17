package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectorOAuthDetailsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String authorization_url;
    public final String issuer_domain;
    public final String redirect_uri;
    public final String revoke_url;
    public final String scope;
    public final String token_endpoint_auth_method;
    public final String token_url;
    public final String user_id;

    public final class Companion {
        public final C9hr<CustomConnectorOAuthDetailsJson> serializer() {
            return CustomConnectorOAuthDetailsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(CustomConnectorOAuthDetailsJson customConnectorOAuthDetailsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(customConnectorOAuthDetailsJson.issuer_domain)) {
            c9j5.AAV(customConnectorOAuthDetailsJson.issuer_domain, c9iZ, 0);
        }
        if (zAfR || !"".equals(customConnectorOAuthDetailsJson.authorization_url)) {
            c9j5.AAV(customConnectorOAuthDetailsJson.authorization_url, c9iZ, 1);
        }
        if (zAfR || !"".equals(customConnectorOAuthDetailsJson.token_url)) {
            c9j5.AAV(customConnectorOAuthDetailsJson.token_url, c9iZ, 2);
        }
        if (zAfR || !"".equals(customConnectorOAuthDetailsJson.redirect_uri)) {
            c9j5.AAV(customConnectorOAuthDetailsJson.redirect_uri, c9iZ, 3);
        }
        if (zAfR || customConnectorOAuthDetailsJson.revoke_url != null) {
            c9j5.AAP(customConnectorOAuthDetailsJson.revoke_url, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || customConnectorOAuthDetailsJson.scope != null) {
            c9j5.AAP(customConnectorOAuthDetailsJson.scope, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || customConnectorOAuthDetailsJson.user_id != null) {
            c9j5.AAP(customConnectorOAuthDetailsJson.user_id, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || customConnectorOAuthDetailsJson.token_endpoint_auth_method != null) {
            c9j5.AAP(customConnectorOAuthDetailsJson.token_endpoint_auth_method, C07779iq.A01, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorOAuthDetailsJson) {
                CustomConnectorOAuthDetailsJson customConnectorOAuthDetailsJson = (CustomConnectorOAuthDetailsJson) obj;
                if (!C7384Etj.areEqual(this.issuer_domain, customConnectorOAuthDetailsJson.issuer_domain) || !C7384Etj.areEqual(this.authorization_url, customConnectorOAuthDetailsJson.authorization_url) || !C7384Etj.areEqual(this.token_url, customConnectorOAuthDetailsJson.token_url) || !C7384Etj.areEqual(this.redirect_uri, customConnectorOAuthDetailsJson.redirect_uri) || !C7384Etj.areEqual(this.revoke_url, customConnectorOAuthDetailsJson.revoke_url) || !C7384Etj.areEqual(this.scope, customConnectorOAuthDetailsJson.scope) || !C7384Etj.areEqual(this.user_id, customConnectorOAuthDetailsJson.user_id) || !C7384Etj.areEqual(this.token_endpoint_auth_method, customConnectorOAuthDetailsJson.token_endpoint_auth_method)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorOAuthDetailsJson copy$default(CustomConnectorOAuthDetailsJson customConnectorOAuthDetailsJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorOAuthDetailsJson.issuer_domain;
        }
        if ((i & 2) != 0) {
            str2 = customConnectorOAuthDetailsJson.authorization_url;
        }
        if ((i & 4) != 0) {
            str3 = customConnectorOAuthDetailsJson.token_url;
        }
        if ((i & 8) != 0) {
            str4 = customConnectorOAuthDetailsJson.redirect_uri;
        }
        if ((i & 16) != 0) {
            str5 = customConnectorOAuthDetailsJson.revoke_url;
        }
        if ((i & 32) != 0) {
            str6 = customConnectorOAuthDetailsJson.scope;
        }
        if ((i & 64) != 0) {
            str7 = customConnectorOAuthDetailsJson.user_id;
        }
        if ((i & 128) != 0) {
            str8 = customConnectorOAuthDetailsJson.token_endpoint_auth_method;
        }
        return customConnectorOAuthDetailsJson.copy(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final String component1() {
        return this.issuer_domain;
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
        return this.token_endpoint_auth_method;
    }

    public final String getAuthorization_url() {
        return this.authorization_url;
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
        return ((((((AnonymousClass005.A0I(this.redirect_uri, AnonymousClass005.A0I(this.token_url, AnonymousClass005.A0I(this.authorization_url, AnonymousClass001.A0G(this.issuer_domain)))) + AnonymousClass006.A0G(this.revoke_url)) * 31) + AnonymousClass006.A0G(this.scope)) * 31) + AnonymousClass006.A0G(this.user_id)) * 31) + AnonymousClass005.A0H(this.token_endpoint_auth_method);
    }

    public final CustomConnectorOAuthDetails toDomain() {
        return new CustomConnectorOAuthDetails(this.issuer_domain, this.authorization_url, this.token_url, this.redirect_uri, this.revoke_url, this.scope, this.user_id, this.token_endpoint_auth_method);
    }

    public CustomConnectorOAuthDetailsJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.issuer_domain = str;
        this.authorization_url = str2;
        this.token_url = str3;
        this.redirect_uri = str4;
        this.revoke_url = str5;
        this.scope = str6;
        this.user_id = str7;
        this.token_endpoint_auth_method = str8;
    }

    public final CustomConnectorOAuthDetailsJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new CustomConnectorOAuthDetailsJson(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorOAuthDetailsJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }

    public /* synthetic */ CustomConnectorOAuthDetailsJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.issuer_domain = "";
        } else {
            this.issuer_domain = str;
        }
        if ((i & 2) == 0) {
            this.authorization_url = "";
        } else {
            this.authorization_url = str2;
        }
        if ((i & 4) == 0) {
            this.token_url = "";
        } else {
            this.token_url = str3;
        }
        if ((i & 8) == 0) {
            this.redirect_uri = "";
        } else {
            this.redirect_uri = str4;
        }
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
        if ((i & 128) == 0) {
            this.token_endpoint_auth_method = null;
        } else {
            this.token_endpoint_auth_method = str8;
        }
    }

    public CustomConnectorOAuthDetailsJson() {
        this("", "", "", "", null, null, null, null);
    }
}
