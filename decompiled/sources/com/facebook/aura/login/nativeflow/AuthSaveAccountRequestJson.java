package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
/* loaded from: classes2.dex */
public final class AuthSaveAccountRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String aymh_device_id;
    public final String frl_access_token;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthSaveAccountRequestJson> serializer() {
            return AuthSaveAccountRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSaveAccountRequestJson authSaveAccountRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(authSaveAccountRequestJson.frl_access_token, c9iZ, 0);
        c9j5.AAV(authSaveAccountRequestJson.aymh_device_id, c9iZ, 1);
        if (c9j5.AfR() || authSaveAccountRequestJson.waterfall_id != null) {
            c9j5.AAP(authSaveAccountRequestJson.waterfall_id, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSaveAccountRequestJson) {
                AuthSaveAccountRequestJson authSaveAccountRequestJson = (AuthSaveAccountRequestJson) obj;
                if (!C7384Etj.areEqual(this.frl_access_token, authSaveAccountRequestJson.frl_access_token) || !C7384Etj.areEqual(this.aymh_device_id, authSaveAccountRequestJson.aymh_device_id) || !C7384Etj.areEqual(this.waterfall_id, authSaveAccountRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthSaveAccountRequestJson copy$default(AuthSaveAccountRequestJson authSaveAccountRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSaveAccountRequestJson.frl_access_token;
        }
        if ((i & 2) != 0) {
            str2 = authSaveAccountRequestJson.aymh_device_id;
        }
        if ((i & 4) != 0) {
            str3 = authSaveAccountRequestJson.waterfall_id;
        }
        return authSaveAccountRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.frl_access_token;
    }

    public final String component2() {
        return this.aymh_device_id;
    }

    public final String component3() {
        return this.waterfall_id;
    }

    public final String getAymh_device_id() {
        return this.aymh_device_id;
    }

    public final String getFrl_access_token() {
        return this.frl_access_token;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.aymh_device_id, AnonymousClass001.A0G(this.frl_access_token)) + AnonymousClass006.A0G(this.waterfall_id);
    }

    public AuthSaveAccountRequestJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.frl_access_token = str;
        this.aymh_device_id = str2;
        this.waterfall_id = str3;
    }

    public final AuthSaveAccountRequestJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new AuthSaveAccountRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthSaveAccountRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthSaveAccountRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.frl_access_token = str;
        this.aymh_device_id = str2;
        this.waterfall_id = C3cI.A0W(i, str3);
    }

    public /* synthetic */ AuthSaveAccountRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
