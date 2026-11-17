package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
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
public final class AuthConfirmPasskeyRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String auth_state;
    public final String device_id;
    public final String passkey_response;
    public final boolean supports_reactivation;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthConfirmPasskeyRequestJson> serializer() {
            return AuthConfirmPasskeyRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthConfirmPasskeyRequestJson(String str, String str2, boolean z, String str3, String str4) {
        C7384Etj.A0Y(str2, 1);
        this.auth_state = str;
        this.passkey_response = str2;
        this.supports_reactivation = z;
        this.device_id = str3;
        this.waterfall_id = str4;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthConfirmPasskeyRequestJson authConfirmPasskeyRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || authConfirmPasskeyRequestJson.auth_state != null) {
            c9j5.AAP(authConfirmPasskeyRequestJson.auth_state, C07779iq.A01, c9iZ, 0);
        }
        c9j5.AAV(authConfirmPasskeyRequestJson.passkey_response, c9iZ, 1);
        if (zAfR || !authConfirmPasskeyRequestJson.supports_reactivation) {
            c9j5.AA7(c9iZ, 2, authConfirmPasskeyRequestJson.supports_reactivation);
        }
        if (zAfR || authConfirmPasskeyRequestJson.device_id != null) {
            c9j5.AAP(authConfirmPasskeyRequestJson.device_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || authConfirmPasskeyRequestJson.waterfall_id != null) {
            c9j5.AAP(authConfirmPasskeyRequestJson.waterfall_id, C07779iq.A01, c9iZ, 4);
        }
    }

    public final AuthConfirmPasskeyRequestJson copy(String str, String str2, boolean z, String str3, String str4) {
        C7384Etj.A0Y(str2, 1);
        return new AuthConfirmPasskeyRequestJson(str, str2, z, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthConfirmPasskeyRequestJson) {
                AuthConfirmPasskeyRequestJson authConfirmPasskeyRequestJson = (AuthConfirmPasskeyRequestJson) obj;
                if (!C7384Etj.areEqual(this.auth_state, authConfirmPasskeyRequestJson.auth_state) || !C7384Etj.areEqual(this.passkey_response, authConfirmPasskeyRequestJson.passkey_response) || this.supports_reactivation != authConfirmPasskeyRequestJson.supports_reactivation || !C7384Etj.areEqual(this.device_id, authConfirmPasskeyRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authConfirmPasskeyRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthConfirmPasskeyRequestJson copy$default(AuthConfirmPasskeyRequestJson authConfirmPasskeyRequestJson, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authConfirmPasskeyRequestJson.auth_state;
        }
        if ((i & 2) != 0) {
            str2 = authConfirmPasskeyRequestJson.passkey_response;
        }
        if ((i & 4) != 0) {
            z = authConfirmPasskeyRequestJson.supports_reactivation;
        }
        if ((i & 8) != 0) {
            str3 = authConfirmPasskeyRequestJson.device_id;
        }
        if ((i & 16) != 0) {
            str4 = authConfirmPasskeyRequestJson.waterfall_id;
        }
        return authConfirmPasskeyRequestJson.copy(str, str2, z, str3, str4);
    }

    public final String component1() {
        return this.auth_state;
    }

    public final String component2() {
        return this.passkey_response;
    }

    public final boolean component3() {
        return this.supports_reactivation;
    }

    public final String component4() {
        return this.device_id;
    }

    public final String component5() {
        return this.waterfall_id;
    }

    public final String getAuth_state() {
        return this.auth_state;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getPasskey_response() {
        return this.passkey_response;
    }

    public final boolean getSupports_reactivation() {
        return this.supports_reactivation;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((C0KA.A01(AnonymousClass005.A0I(this.passkey_response, AnonymousClass006.A0G(this.auth_state) * 31), this.supports_reactivation) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthConfirmPasskeyRequestJson(String str, String str2, boolean z, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public /* synthetic */ AuthConfirmPasskeyRequestJson(int i, String str, String str2, boolean z, String str3, String str4, C2hx c2hx) {
        if (2 != (i & 2)) {
            C9iI.A00(AuthConfirmPasskeyRequestJson$$serializer.descriptor, i, 2);
            throw F60.createAndThrow();
        }
        if ((i & 1) == 0) {
            this.auth_state = null;
        } else {
            this.auth_state = str;
        }
        this.passkey_response = str2;
        if ((i & 4) == 0) {
            this.supports_reactivation = true;
        } else {
            this.supports_reactivation = z;
        }
        if ((i & 8) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str3;
        }
        if ((i & 16) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str4;
        }
    }
}
