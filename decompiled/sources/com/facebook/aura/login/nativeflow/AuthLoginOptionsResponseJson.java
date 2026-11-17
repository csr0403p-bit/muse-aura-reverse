package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthLoginOptionsResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String auth_state;
    public final String flow;
    public final String ntp_source_app;
    public final PasskeyRequestOptionsJson passkey_request_options;
    public final boolean password_login_available;
    public final String registration_state;

    public final class Companion {
        public final C9hr<AuthLoginOptionsResponseJson> serializer() {
            return AuthLoginOptionsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthLoginOptionsResponseJson() {
        this("", "", false, null, null, null);
    }

    public static /* synthetic */ AuthLoginOptionsResponseJson copy$default(AuthLoginOptionsResponseJson authLoginOptionsResponseJson, String str, String str2, boolean z, String str3, String str4, PasskeyRequestOptionsJson passkeyRequestOptionsJson, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        boolean z2 = z;
        String str7 = str3;
        String str8 = str4;
        PasskeyRequestOptionsJson passkeyRequestOptionsJson2 = passkeyRequestOptionsJson;
        if ((i & 1) != 0) {
            str5 = authLoginOptionsResponseJson.registration_state;
        }
        if ((i & 2) != 0) {
            str6 = authLoginOptionsResponseJson.auth_state;
        }
        if ((i & 4) != 0) {
            z2 = authLoginOptionsResponseJson.password_login_available;
        }
        if ((i & 8) != 0) {
            str7 = authLoginOptionsResponseJson.flow;
        }
        if ((i & 16) != 0) {
            str8 = authLoginOptionsResponseJson.ntp_source_app;
        }
        if ((i & 32) != 0) {
            passkeyRequestOptionsJson2 = authLoginOptionsResponseJson.passkey_request_options;
        }
        AnonymousClass003.A0u(str5, str6);
        return new AuthLoginOptionsResponseJson(str5, str6, z2, str7, str8, passkeyRequestOptionsJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthLoginOptionsResponseJson authLoginOptionsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authLoginOptionsResponseJson.registration_state)) {
            c9j5.AAV(authLoginOptionsResponseJson.registration_state, c9iZ, 0);
        }
        if (zAfR || !"".equals(authLoginOptionsResponseJson.auth_state)) {
            c9j5.AAV(authLoginOptionsResponseJson.auth_state, c9iZ, 1);
        }
        if (zAfR || authLoginOptionsResponseJson.password_login_available) {
            c9j5.AA7(c9iZ, 2, authLoginOptionsResponseJson.password_login_available);
        }
        if (zAfR || authLoginOptionsResponseJson.flow != null) {
            c9j5.AAP(authLoginOptionsResponseJson.flow, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || authLoginOptionsResponseJson.ntp_source_app != null) {
            c9j5.AAP(authLoginOptionsResponseJson.ntp_source_app, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || authLoginOptionsResponseJson.passkey_request_options != null) {
            c9j5.AAP(authLoginOptionsResponseJson.passkey_request_options, PasskeyRequestOptionsJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthLoginOptionsResponseJson) {
                AuthLoginOptionsResponseJson authLoginOptionsResponseJson = (AuthLoginOptionsResponseJson) obj;
                if (!C7384Etj.areEqual(this.registration_state, authLoginOptionsResponseJson.registration_state) || !C7384Etj.areEqual(this.auth_state, authLoginOptionsResponseJson.auth_state) || this.password_login_available != authLoginOptionsResponseJson.password_login_available || !C7384Etj.areEqual(this.flow, authLoginOptionsResponseJson.flow) || !C7384Etj.areEqual(this.ntp_source_app, authLoginOptionsResponseJson.ntp_source_app) || !C7384Etj.areEqual(this.passkey_request_options, authLoginOptionsResponseJson.passkey_request_options)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.registration_state;
    }

    public final String component2() {
        return this.auth_state;
    }

    public final boolean component3() {
        return this.password_login_available;
    }

    public final String component4() {
        return this.flow;
    }

    public final String component5() {
        return this.ntp_source_app;
    }

    public final PasskeyRequestOptionsJson component6() {
        return this.passkey_request_options;
    }

    public final String getAuth_state() {
        return this.auth_state;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getNtp_source_app() {
        return this.ntp_source_app;
    }

    public final PasskeyRequestOptionsJson getPasskey_request_options() {
        return this.passkey_request_options;
    }

    public final boolean getPassword_login_available() {
        return this.password_login_available;
    }

    public final String getRegistration_state() {
        return this.registration_state;
    }

    public int hashCode() {
        return ((((C0KA.A01(AnonymousClass005.A0I(this.auth_state, AnonymousClass001.A0G(this.registration_state)), this.password_login_available) + AnonymousClass006.A0G(this.flow)) * 31) + AnonymousClass006.A0G(this.ntp_source_app)) * 31) + C3cH.A02(this.passkey_request_options);
    }

    public final AuthLoginOptionsResponseJson copy(String str, String str2, boolean z, String str3, String str4, PasskeyRequestOptionsJson passkeyRequestOptionsJson) {
        AnonymousClass003.A0u(str, str2);
        return new AuthLoginOptionsResponseJson(str, str2, z, str3, str4, passkeyRequestOptionsJson);
    }

    public String toString() {
        return super.toString();
    }

    public AuthLoginOptionsResponseJson(String str, String str2, boolean z, String str3, String str4, PasskeyRequestOptionsJson passkeyRequestOptionsJson) {
        AnonymousClass003.A0u(str, str2);
        this.registration_state = str;
        this.auth_state = str2;
        this.password_login_available = z;
        this.flow = str3;
        this.ntp_source_app = str4;
        this.passkey_request_options = passkeyRequestOptionsJson;
    }

    public /* synthetic */ AuthLoginOptionsResponseJson(String str, String str2, boolean z, String str3, String str4, PasskeyRequestOptionsJson passkeyRequestOptionsJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : passkeyRequestOptionsJson);
    }

    public /* synthetic */ AuthLoginOptionsResponseJson(int i, String str, String str2, boolean z, String str3, String str4, PasskeyRequestOptionsJson passkeyRequestOptionsJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.registration_state = "";
        } else {
            this.registration_state = str;
        }
        if ((i & 2) == 0) {
            this.auth_state = "";
        } else {
            this.auth_state = str2;
        }
        if ((i & 4) == 0) {
            this.password_login_available = false;
        } else {
            this.password_login_available = z;
        }
        if ((i & 8) == 0) {
            this.flow = null;
        } else {
            this.flow = str3;
        }
        if ((i & 16) == 0) {
            this.ntp_source_app = null;
        } else {
            this.ntp_source_app = str4;
        }
        if ((i & 32) == 0) {
            this.passkey_request_options = null;
        } else {
            this.passkey_request_options = passkeyRequestOptionsJson;
        }
    }
}
