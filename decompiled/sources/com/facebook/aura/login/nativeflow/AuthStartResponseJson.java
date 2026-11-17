package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
public final class AuthStartResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String access_token;
    public final String id_for_aymh;

    public final class Companion {
        public final C9hr<AuthStartResponseJson> serializer() {
            return AuthStartResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthStartResponseJson authStartResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authStartResponseJson.access_token)) {
            c9j5.AAV(authStartResponseJson.access_token, c9iZ, 0);
        }
        if (zAfR || !"".equals(authStartResponseJson.id_for_aymh)) {
            c9j5.AAV(authStartResponseJson.id_for_aymh, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthStartResponseJson) {
                AuthStartResponseJson authStartResponseJson = (AuthStartResponseJson) obj;
                if (!C7384Etj.areEqual(this.access_token, authStartResponseJson.access_token) || !C7384Etj.areEqual(this.id_for_aymh, authStartResponseJson.id_for_aymh)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthStartResponseJson copy$default(AuthStartResponseJson authStartResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authStartResponseJson.access_token;
        }
        if ((i & 2) != 0) {
            str2 = authStartResponseJson.id_for_aymh;
        }
        AnonymousClass003.A0u(str, str2);
        return new AuthStartResponseJson(str, str2);
    }

    public final String component1() {
        return this.access_token;
    }

    public final String component2() {
        return this.id_for_aymh;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getId_for_aymh() {
        return this.id_for_aymh;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.id_for_aymh, AnonymousClass001.A0G(this.access_token));
    }

    public AuthStartResponseJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.access_token = str;
        this.id_for_aymh = str2;
    }

    public final AuthStartResponseJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new AuthStartResponseJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthStartResponseJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.access_token = "";
        } else {
            this.access_token = str;
        }
        if ((i & 2) == 0) {
            this.id_for_aymh = "";
        } else {
            this.id_for_aymh = str2;
        }
    }

    public /* synthetic */ AuthStartResponseJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public AuthStartResponseJson() {
        this("", "");
    }
}
