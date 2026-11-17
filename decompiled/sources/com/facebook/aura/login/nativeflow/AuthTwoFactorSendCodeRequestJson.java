package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
public final class AuthTwoFactorSendCodeRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String device_id;
    public final String method_id;
    public final String two_factor_state;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthTwoFactorSendCodeRequestJson> serializer() {
            return AuthTwoFactorSendCodeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTwoFactorSendCodeRequestJson authTwoFactorSendCodeRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(authTwoFactorSendCodeRequestJson.two_factor_state, c9iZ, 0);
        c9j5.AAV(authTwoFactorSendCodeRequestJson.method_id, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || authTwoFactorSendCodeRequestJson.device_id != null) {
            c9j5.AAP(authTwoFactorSendCodeRequestJson.device_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || authTwoFactorSendCodeRequestJson.waterfall_id != null) {
            c9j5.AAP(authTwoFactorSendCodeRequestJson.waterfall_id, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTwoFactorSendCodeRequestJson) {
                AuthTwoFactorSendCodeRequestJson authTwoFactorSendCodeRequestJson = (AuthTwoFactorSendCodeRequestJson) obj;
                if (!C7384Etj.areEqual(this.two_factor_state, authTwoFactorSendCodeRequestJson.two_factor_state) || !C7384Etj.areEqual(this.method_id, authTwoFactorSendCodeRequestJson.method_id) || !C7384Etj.areEqual(this.device_id, authTwoFactorSendCodeRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authTwoFactorSendCodeRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthTwoFactorSendCodeRequestJson copy$default(AuthTwoFactorSendCodeRequestJson authTwoFactorSendCodeRequestJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTwoFactorSendCodeRequestJson.two_factor_state;
        }
        if ((i & 2) != 0) {
            str2 = authTwoFactorSendCodeRequestJson.method_id;
        }
        if ((i & 4) != 0) {
            str3 = authTwoFactorSendCodeRequestJson.device_id;
        }
        if ((i & 8) != 0) {
            str4 = authTwoFactorSendCodeRequestJson.waterfall_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new AuthTwoFactorSendCodeRequestJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.two_factor_state;
    }

    public final String component2() {
        return this.method_id;
    }

    public final String component3() {
        return this.device_id;
    }

    public final String component4() {
        return this.waterfall_id;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getMethod_id() {
        return this.method_id;
    }

    public final String getTwo_factor_state() {
        return this.two_factor_state;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.method_id, AnonymousClass001.A0G(this.two_factor_state)) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public AuthTwoFactorSendCodeRequestJson(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.two_factor_state = str;
        this.method_id = str2;
        this.device_id = str3;
        this.waterfall_id = str4;
    }

    public final AuthTwoFactorSendCodeRequestJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new AuthTwoFactorSendCodeRequestJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthTwoFactorSendCodeRequestJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthTwoFactorSendCodeRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.two_factor_state = str;
        this.method_id = str2;
        if ((i & 4) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str3;
        }
        if ((i & 8) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str4;
        }
    }

    public /* synthetic */ AuthTwoFactorSendCodeRequestJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
