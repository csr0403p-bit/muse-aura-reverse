package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.json.HatchPasswordCopyJson;
import com.facebook.aura.json.HatchPasswordCopyJson$$serializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthSendOtpResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String auth_state;
    public final String flow;
    public final Boolean has_muse_account;
    public final String ntp_source_app;
    public final HatchPasswordCopyJson password_copy;
    public final boolean password_login_available;
    public final String registration_state;

    public final class Companion {
        public final C9hr<AuthSendOtpResponseJson> serializer() {
            return AuthSendOtpResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthSendOtpResponseJson() {
        this("", "", false, null, null, null, null);
    }

    public static /* synthetic */ AuthSendOtpResponseJson copy$default(AuthSendOtpResponseJson authSendOtpResponseJson, String str, String str2, boolean z, String str3, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        boolean z2 = z;
        String str7 = str3;
        String str8 = str4;
        Boolean bool2 = bool;
        HatchPasswordCopyJson hatchPasswordCopyJson2 = hatchPasswordCopyJson;
        if ((i & 1) != 0) {
            str5 = authSendOtpResponseJson.registration_state;
        }
        if ((i & 2) != 0) {
            str6 = authSendOtpResponseJson.auth_state;
        }
        if ((i & 4) != 0) {
            z2 = authSendOtpResponseJson.password_login_available;
        }
        if ((i & 8) != 0) {
            str7 = authSendOtpResponseJson.flow;
        }
        if ((i & 16) != 0) {
            str8 = authSendOtpResponseJson.ntp_source_app;
        }
        if ((i & 32) != 0) {
            bool2 = authSendOtpResponseJson.has_muse_account;
        }
        if ((i & 64) != 0) {
            hatchPasswordCopyJson2 = authSendOtpResponseJson.password_copy;
        }
        AnonymousClass003.A0u(str5, str6);
        return new AuthSendOtpResponseJson(str5, str6, z2, str7, str8, bool2, hatchPasswordCopyJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSendOtpResponseJson authSendOtpResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authSendOtpResponseJson.registration_state)) {
            c9j5.AAV(authSendOtpResponseJson.registration_state, c9iZ, 0);
        }
        if (zAfR || !"".equals(authSendOtpResponseJson.auth_state)) {
            c9j5.AAV(authSendOtpResponseJson.auth_state, c9iZ, 1);
        }
        if (zAfR || authSendOtpResponseJson.password_login_available) {
            c9j5.AA7(c9iZ, 2, authSendOtpResponseJson.password_login_available);
        }
        if (zAfR || authSendOtpResponseJson.flow != null) {
            c9j5.AAP(authSendOtpResponseJson.flow, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || authSendOtpResponseJson.ntp_source_app != null) {
            c9j5.AAP(authSendOtpResponseJson.ntp_source_app, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || authSendOtpResponseJson.has_muse_account != null) {
            c9j5.AAP(authSendOtpResponseJson.has_muse_account, C07839ix.A00, c9iZ, 5);
        }
        if (zAfR || authSendOtpResponseJson.password_copy != null) {
            c9j5.AAP(authSendOtpResponseJson.password_copy, HatchPasswordCopyJson$$serializer.INSTANCE, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSendOtpResponseJson) {
                AuthSendOtpResponseJson authSendOtpResponseJson = (AuthSendOtpResponseJson) obj;
                if (!C7384Etj.areEqual(this.registration_state, authSendOtpResponseJson.registration_state) || !C7384Etj.areEqual(this.auth_state, authSendOtpResponseJson.auth_state) || this.password_login_available != authSendOtpResponseJson.password_login_available || !C7384Etj.areEqual(this.flow, authSendOtpResponseJson.flow) || !C7384Etj.areEqual(this.ntp_source_app, authSendOtpResponseJson.ntp_source_app) || !C7384Etj.areEqual(this.has_muse_account, authSendOtpResponseJson.has_muse_account) || !C7384Etj.areEqual(this.password_copy, authSendOtpResponseJson.password_copy)) {
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

    public final Boolean component6() {
        return this.has_muse_account;
    }

    public final HatchPasswordCopyJson component7() {
        return this.password_copy;
    }

    public final String getAuth_state() {
        return this.auth_state;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final Boolean getHas_muse_account() {
        return this.has_muse_account;
    }

    public final String getNtp_source_app() {
        return this.ntp_source_app;
    }

    public final HatchPasswordCopyJson getPassword_copy() {
        return this.password_copy;
    }

    public final boolean getPassword_login_available() {
        return this.password_login_available;
    }

    public final String getRegistration_state() {
        return this.registration_state;
    }

    public int hashCode() {
        return ((((((C0KA.A01(AnonymousClass005.A0I(this.auth_state, AnonymousClass001.A0G(this.registration_state)), this.password_login_available) + AnonymousClass006.A0G(this.flow)) * 31) + AnonymousClass006.A0G(this.ntp_source_app)) * 31) + AnonymousClass006.A0D(this.has_muse_account)) * 31) + C3cH.A02(this.password_copy);
    }

    public final AuthSendOtpResponseJson copy(String str, String str2, boolean z, String str3, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson) {
        AnonymousClass003.A0u(str, str2);
        return new AuthSendOtpResponseJson(str, str2, z, str3, str4, bool, hatchPasswordCopyJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthSendOtpResponseJson(int i, String str, String str2, boolean z, String str3, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson, C2hx c2hx) {
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
            this.has_muse_account = null;
        } else {
            this.has_muse_account = bool;
        }
        if ((i & 64) == 0) {
            this.password_copy = null;
        } else {
            this.password_copy = hatchPasswordCopyJson;
        }
    }

    public AuthSendOtpResponseJson(String str, String str2, boolean z, String str3, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson) {
        AnonymousClass003.A0u(str, str2);
        this.registration_state = str;
        this.auth_state = str2;
        this.password_login_available = z;
        this.flow = str3;
        this.ntp_source_app = str4;
        this.has_muse_account = bool;
        this.password_copy = hatchPasswordCopyJson;
    }

    public /* synthetic */ AuthSendOtpResponseJson(String str, String str2, boolean z, String str3, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : hatchPasswordCopyJson);
    }
}
