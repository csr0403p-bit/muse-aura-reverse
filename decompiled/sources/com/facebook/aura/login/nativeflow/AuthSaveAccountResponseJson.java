package com.facebook.aura.login.nativeflow;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthSaveAccountResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String saved_account_id;

    public final class Companion {
        public final C9hr<AuthSaveAccountResponseJson> serializer() {
            return AuthSaveAccountResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSaveAccountResponseJson authSaveAccountResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(authSaveAccountResponseJson.saved_account_id)) {
            c9j5.AAV(authSaveAccountResponseJson.saved_account_id, c9iZ, 0);
        }
    }

    public final AuthSaveAccountResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AuthSaveAccountResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuthSaveAccountResponseJson) && C7384Etj.areEqual(this.saved_account_id, ((AuthSaveAccountResponseJson) obj).saved_account_id));
    }

    public static /* synthetic */ AuthSaveAccountResponseJson copy$default(AuthSaveAccountResponseJson authSaveAccountResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSaveAccountResponseJson.saved_account_id;
        }
        C7384Etj.A0Y(str, 0);
        return new AuthSaveAccountResponseJson(str);
    }

    public final String component1() {
        return this.saved_account_id;
    }

    public final String getSaved_account_id() {
        return this.saved_account_id;
    }

    public int hashCode() {
        return this.saved_account_id.hashCode();
    }

    public /* synthetic */ AuthSaveAccountResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.saved_account_id = "";
        } else {
            this.saved_account_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AuthSaveAccountResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.saved_account_id = str;
    }

    public /* synthetic */ AuthSaveAccountResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public AuthSaveAccountResponseJson() {
        this("");
    }
}
