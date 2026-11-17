package com.facebook.aura.auth;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class TokenExchangeResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final JsonElement abra_user_id;
    public final String access_token;
    public final String refresh_token;
    public final String user_id;

    public final class Companion {
        public final C9hr<TokenExchangeResponseJson> serializer() {
            return TokenExchangeResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TokenExchangeResponseJson() {
        this("", "", null, "");
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_auth_auth(TokenExchangeResponseJson tokenExchangeResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(tokenExchangeResponseJson.access_token)) {
            c9j5.AAV(tokenExchangeResponseJson.access_token, c9iZ, 0);
        }
        if (zAfR || !"".equals(tokenExchangeResponseJson.refresh_token)) {
            c9j5.AAV(tokenExchangeResponseJson.refresh_token, c9iZ, 1);
        }
        if (zAfR || tokenExchangeResponseJson.abra_user_id != null) {
            c9j5.AAP(tokenExchangeResponseJson.abra_user_id, JsonElementSerializer.A00, c9iZ, 2);
        }
        if (zAfR || !"".equals(tokenExchangeResponseJson.user_id)) {
            c9j5.AAV(tokenExchangeResponseJson.user_id, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TokenExchangeResponseJson) {
                TokenExchangeResponseJson tokenExchangeResponseJson = (TokenExchangeResponseJson) obj;
                if (!C7384Etj.areEqual(this.access_token, tokenExchangeResponseJson.access_token) || !C7384Etj.areEqual(this.refresh_token, tokenExchangeResponseJson.refresh_token) || !C7384Etj.areEqual(this.abra_user_id, tokenExchangeResponseJson.abra_user_id) || !C7384Etj.areEqual(this.user_id, tokenExchangeResponseJson.user_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TokenExchangeResponseJson copy$default(TokenExchangeResponseJson tokenExchangeResponseJson, String str, String str2, JsonElement jsonElement, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenExchangeResponseJson.access_token;
        }
        if ((i & 2) != 0) {
            str2 = tokenExchangeResponseJson.refresh_token;
        }
        if ((i & 4) != 0) {
            jsonElement = tokenExchangeResponseJson.abra_user_id;
        }
        if ((i & 8) != 0) {
            str3 = tokenExchangeResponseJson.user_id;
        }
        AnonymousClass005.A0y(str, str2, str3);
        return new TokenExchangeResponseJson(str, str2, jsonElement, str3);
    }

    public final String component1() {
        return this.access_token;
    }

    public final String component2() {
        return this.refresh_token;
    }

    public final JsonElement component3() {
        return this.abra_user_id;
    }

    public final String component4() {
        return this.user_id;
    }

    public final JsonElement getAbra_user_id() {
        return this.abra_user_id;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.user_id, (AnonymousClass005.A0I(this.refresh_token, AnonymousClass001.A0G(this.access_token)) + AnonymousClass006.A0D(this.abra_user_id)) * 31);
    }

    public final TokenExchangeResponseJson copy(String str, String str2, JsonElement jsonElement, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        return new TokenExchangeResponseJson(str, str2, jsonElement, str3);
    }

    public String toString() {
        return super.toString();
    }

    public TokenExchangeResponseJson(String str, String str2, JsonElement jsonElement, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        this.access_token = str;
        this.refresh_token = str2;
        this.abra_user_id = jsonElement;
        this.user_id = str3;
    }

    public /* synthetic */ TokenExchangeResponseJson(String str, String str2, JsonElement jsonElement, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : jsonElement, (i & 8) != 0 ? "" : str3);
    }

    public /* synthetic */ TokenExchangeResponseJson(int i, String str, String str2, JsonElement jsonElement, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.access_token = "";
        } else {
            this.access_token = str;
        }
        if ((i & 2) == 0) {
            this.refresh_token = "";
        } else {
            this.refresh_token = str2;
        }
        if ((i & 4) == 0) {
            this.abra_user_id = null;
        } else {
            this.abra_user_id = jsonElement;
        }
        if ((i & 8) == 0) {
            this.user_id = "";
        } else {
            this.user_id = str3;
        }
    }
}
