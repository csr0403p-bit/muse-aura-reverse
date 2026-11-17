package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
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
/* loaded from: classes2.dex */
public final class AuthSavedAccountsRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String device_id;
    public final String id_for_aymh;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthSavedAccountsRequestJson> serializer() {
            return AuthSavedAccountsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthSavedAccountsRequestJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.id_for_aymh = str;
        this.device_id = str2;
        this.waterfall_id = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSavedAccountsRequestJson authSavedAccountsRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(authSavedAccountsRequestJson.id_for_aymh, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || authSavedAccountsRequestJson.device_id != null) {
            c9j5.AAP(authSavedAccountsRequestJson.device_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || authSavedAccountsRequestJson.waterfall_id != null) {
            c9j5.AAP(authSavedAccountsRequestJson.waterfall_id, C07779iq.A01, c9iZ, 2);
        }
    }

    public final AuthSavedAccountsRequestJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new AuthSavedAccountsRequestJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSavedAccountsRequestJson) {
                AuthSavedAccountsRequestJson authSavedAccountsRequestJson = (AuthSavedAccountsRequestJson) obj;
                if (!C7384Etj.areEqual(this.id_for_aymh, authSavedAccountsRequestJson.id_for_aymh) || !C7384Etj.areEqual(this.device_id, authSavedAccountsRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authSavedAccountsRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthSavedAccountsRequestJson copy$default(AuthSavedAccountsRequestJson authSavedAccountsRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSavedAccountsRequestJson.id_for_aymh;
        }
        if ((i & 2) != 0) {
            str2 = authSavedAccountsRequestJson.device_id;
        }
        if ((i & 4) != 0) {
            str3 = authSavedAccountsRequestJson.waterfall_id;
        }
        return authSavedAccountsRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id_for_aymh;
    }

    public final String component2() {
        return this.device_id;
    }

    public final String component3() {
        return this.waterfall_id;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getId_for_aymh() {
        return this.id_for_aymh;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.id_for_aymh) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthSavedAccountsRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AuthSavedAccountsRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.id_for_aymh = str;
        if ((i & 2) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str2;
        }
        if ((i & 4) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str3;
        }
    }

    public /* synthetic */ AuthSavedAccountsRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
