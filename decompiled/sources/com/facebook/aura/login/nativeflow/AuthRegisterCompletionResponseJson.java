package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthRegisterCompletionResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String abra_access_token;
    public final String abra_user_id;
    public final String frl_access_token;
    public final String frl_account_id;
    public final String refresh_token;

    public final class Companion {
        public final C9hr<AuthRegisterCompletionResponseJson> serializer() {
            return AuthRegisterCompletionResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authRegisterCompletionResponseJson.abra_access_token)) {
            c9j5.AAV(authRegisterCompletionResponseJson.abra_access_token, c9iZ, 0);
        }
        if (zAfR || !"".equals(authRegisterCompletionResponseJson.abra_user_id)) {
            c9j5.AAV(authRegisterCompletionResponseJson.abra_user_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(authRegisterCompletionResponseJson.frl_access_token)) {
            c9j5.AAV(authRegisterCompletionResponseJson.frl_access_token, c9iZ, 2);
        }
        if (zAfR || !"".equals(authRegisterCompletionResponseJson.frl_account_id)) {
            c9j5.AAV(authRegisterCompletionResponseJson.frl_account_id, c9iZ, 3);
        }
        if (zAfR || !"".equals(authRegisterCompletionResponseJson.refresh_token)) {
            c9j5.AAV(authRegisterCompletionResponseJson.refresh_token, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthRegisterCompletionResponseJson) {
                AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson = (AuthRegisterCompletionResponseJson) obj;
                if (!C7384Etj.areEqual(this.abra_access_token, authRegisterCompletionResponseJson.abra_access_token) || !C7384Etj.areEqual(this.abra_user_id, authRegisterCompletionResponseJson.abra_user_id) || !C7384Etj.areEqual(this.frl_access_token, authRegisterCompletionResponseJson.frl_access_token) || !C7384Etj.areEqual(this.frl_account_id, authRegisterCompletionResponseJson.frl_account_id) || !C7384Etj.areEqual(this.refresh_token, authRegisterCompletionResponseJson.refresh_token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthRegisterCompletionResponseJson copy$default(AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authRegisterCompletionResponseJson.abra_access_token;
        }
        if ((i & 2) != 0) {
            str2 = authRegisterCompletionResponseJson.abra_user_id;
        }
        if ((i & 4) != 0) {
            str3 = authRegisterCompletionResponseJson.frl_access_token;
        }
        if ((i & 8) != 0) {
            str4 = authRegisterCompletionResponseJson.frl_account_id;
        }
        if ((i & 16) != 0) {
            str5 = authRegisterCompletionResponseJson.refresh_token;
        }
        return authRegisterCompletionResponseJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.abra_access_token;
    }

    public final String component2() {
        return this.abra_user_id;
    }

    public final String component3() {
        return this.frl_access_token;
    }

    public final String component4() {
        return this.frl_account_id;
    }

    public final String component5() {
        return this.refresh_token;
    }

    public final String getAbra_access_token() {
        return this.abra_access_token;
    }

    public final String getAbra_user_id() {
        return this.abra_user_id;
    }

    public final String getFrl_access_token() {
        return this.frl_access_token;
    }

    public final String getFrl_account_id() {
        return this.frl_account_id;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.refresh_token, AnonymousClass005.A0I(this.frl_account_id, AnonymousClass005.A0I(this.frl_access_token, AnonymousClass005.A0I(this.abra_user_id, AnonymousClass001.A0G(this.abra_access_token)))));
    }

    public AuthRegisterCompletionResponseJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.abra_access_token = str;
        this.abra_user_id = str2;
        this.frl_access_token = str3;
        this.frl_account_id = str4;
        this.refresh_token = str5;
    }

    public final AuthRegisterCompletionResponseJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new AuthRegisterCompletionResponseJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthRegisterCompletionResponseJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public /* synthetic */ AuthRegisterCompletionResponseJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.abra_access_token = "";
        } else {
            this.abra_access_token = str;
        }
        if ((i & 2) == 0) {
            this.abra_user_id = "";
        } else {
            this.abra_user_id = str2;
        }
        if ((i & 4) == 0) {
            this.frl_access_token = "";
        } else {
            this.frl_access_token = str3;
        }
        if ((i & 8) == 0) {
            this.frl_account_id = "";
        } else {
            this.frl_account_id = str4;
        }
        if ((i & 16) == 0) {
            this.refresh_token = "";
        } else {
            this.refresh_token = str5;
        }
    }

    public AuthRegisterCompletionResponseJson() {
        this("", "", "", "", "");
    }
}
