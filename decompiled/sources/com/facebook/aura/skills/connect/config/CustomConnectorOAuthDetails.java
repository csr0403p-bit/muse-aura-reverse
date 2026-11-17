package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CustomConnectorOAuthDetails extends C06G {
    public final String authorizationUrl;
    public final String issuerDomain;
    public final String redirectUri;
    public final String revokeUrl;
    public final String scope;
    public final String tokenEndpointAuthMethod;
    public final String tokenUrl;
    public final String userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorOAuthDetails) {
                CustomConnectorOAuthDetails customConnectorOAuthDetails = (CustomConnectorOAuthDetails) obj;
                if (!C7384Etj.areEqual(this.issuerDomain, customConnectorOAuthDetails.issuerDomain) || !C7384Etj.areEqual(this.authorizationUrl, customConnectorOAuthDetails.authorizationUrl) || !C7384Etj.areEqual(this.tokenUrl, customConnectorOAuthDetails.tokenUrl) || !C7384Etj.areEqual(this.redirectUri, customConnectorOAuthDetails.redirectUri) || !C7384Etj.areEqual(this.revokeUrl, customConnectorOAuthDetails.revokeUrl) || !C7384Etj.areEqual(this.scope, customConnectorOAuthDetails.scope) || !C7384Etj.areEqual(this.userId, customConnectorOAuthDetails.userId) || !C7384Etj.areEqual(this.tokenEndpointAuthMethod, customConnectorOAuthDetails.tokenEndpointAuthMethod)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorOAuthDetails copy$default(CustomConnectorOAuthDetails customConnectorOAuthDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorOAuthDetails.issuerDomain;
        }
        if ((i & 2) != 0) {
            str2 = customConnectorOAuthDetails.authorizationUrl;
        }
        if ((i & 4) != 0) {
            str3 = customConnectorOAuthDetails.tokenUrl;
        }
        if ((i & 8) != 0) {
            str4 = customConnectorOAuthDetails.redirectUri;
        }
        if ((i & 16) != 0) {
            str5 = customConnectorOAuthDetails.revokeUrl;
        }
        if ((i & 32) != 0) {
            str6 = customConnectorOAuthDetails.scope;
        }
        if ((i & 64) != 0) {
            str7 = customConnectorOAuthDetails.userId;
        }
        if ((i & 128) != 0) {
            str8 = customConnectorOAuthDetails.tokenEndpointAuthMethod;
        }
        return customConnectorOAuthDetails.copy(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final String component1() {
        return this.issuerDomain;
    }

    public final String component2() {
        return this.authorizationUrl;
    }

    public final String component3() {
        return this.tokenUrl;
    }

    public final String component4() {
        return this.redirectUri;
    }

    public final String component5() {
        return this.revokeUrl;
    }

    public final String component6() {
        return this.scope;
    }

    public final String component7() {
        return this.userId;
    }

    public final String component8() {
        return this.tokenEndpointAuthMethod;
    }

    public final String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public final String getIssuerDomain() {
        return this.issuerDomain;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public final CustomConnectorOAuthAuthMethod getResolvedAuthMethod() {
        return CustomConnectorOAuthAuthMethod.Companion.fromWire(this.tokenEndpointAuthMethod);
    }

    public final String getRevokeUrl() {
        return this.revokeUrl;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getTokenEndpointAuthMethod() {
        return this.tokenEndpointAuthMethod;
    }

    public final String getTokenUrl() {
        return this.tokenUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.redirectUri, AnonymousClass005.A0I(this.tokenUrl, AnonymousClass005.A0I(this.authorizationUrl, AnonymousClass001.A0G(this.issuerDomain)))) + AnonymousClass006.A0G(this.revokeUrl)) * 31) + AnonymousClass006.A0G(this.scope)) * 31) + AnonymousClass006.A0G(this.userId)) * 31) + AnonymousClass005.A0H(this.tokenEndpointAuthMethod);
    }

    public CustomConnectorOAuthDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.issuerDomain = str;
        this.authorizationUrl = str2;
        this.tokenUrl = str3;
        this.redirectUri = str4;
        this.revokeUrl = str5;
        this.scope = str6;
        this.userId = str7;
        this.tokenEndpointAuthMethod = str8;
    }

    public final CustomConnectorOAuthDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new CustomConnectorOAuthDetails(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorOAuthDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}
