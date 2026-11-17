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
public final class AuthSendSavedAccountOtpRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String account_cuid;
    public final String aymh_device_id;
    public final String device_id;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthSendSavedAccountOtpRequestJson> serializer() {
            return AuthSendSavedAccountOtpRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSendSavedAccountOtpRequestJson authSendSavedAccountOtpRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(authSendSavedAccountOtpRequestJson.account_cuid, c9iZ, 0);
        c9j5.AAV(authSendSavedAccountOtpRequestJson.aymh_device_id, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || authSendSavedAccountOtpRequestJson.device_id != null) {
            c9j5.AAP(authSendSavedAccountOtpRequestJson.device_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || authSendSavedAccountOtpRequestJson.waterfall_id != null) {
            c9j5.AAP(authSendSavedAccountOtpRequestJson.waterfall_id, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSendSavedAccountOtpRequestJson) {
                AuthSendSavedAccountOtpRequestJson authSendSavedAccountOtpRequestJson = (AuthSendSavedAccountOtpRequestJson) obj;
                if (!C7384Etj.areEqual(this.account_cuid, authSendSavedAccountOtpRequestJson.account_cuid) || !C7384Etj.areEqual(this.aymh_device_id, authSendSavedAccountOtpRequestJson.aymh_device_id) || !C7384Etj.areEqual(this.device_id, authSendSavedAccountOtpRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authSendSavedAccountOtpRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthSendSavedAccountOtpRequestJson copy$default(AuthSendSavedAccountOtpRequestJson authSendSavedAccountOtpRequestJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSendSavedAccountOtpRequestJson.account_cuid;
        }
        if ((i & 2) != 0) {
            str2 = authSendSavedAccountOtpRequestJson.aymh_device_id;
        }
        if ((i & 4) != 0) {
            str3 = authSendSavedAccountOtpRequestJson.device_id;
        }
        if ((i & 8) != 0) {
            str4 = authSendSavedAccountOtpRequestJson.waterfall_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new AuthSendSavedAccountOtpRequestJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.account_cuid;
    }

    public final String component2() {
        return this.aymh_device_id;
    }

    public final String component3() {
        return this.device_id;
    }

    public final String component4() {
        return this.waterfall_id;
    }

    public final String getAccount_cuid() {
        return this.account_cuid;
    }

    public final String getAymh_device_id() {
        return this.aymh_device_id;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.aymh_device_id, AnonymousClass001.A0G(this.account_cuid)) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public AuthSendSavedAccountOtpRequestJson(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.account_cuid = str;
        this.aymh_device_id = str2;
        this.device_id = str3;
        this.waterfall_id = str4;
    }

    public final AuthSendSavedAccountOtpRequestJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new AuthSendSavedAccountOtpRequestJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthSendSavedAccountOtpRequestJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthSendSavedAccountOtpRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.account_cuid = str;
        this.aymh_device_id = str2;
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

    public /* synthetic */ AuthSendSavedAccountOtpRequestJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
