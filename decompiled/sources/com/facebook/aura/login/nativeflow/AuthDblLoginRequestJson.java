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
public final class AuthDblLoginRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String account_cuid;
    public final String aymh_device_id;
    public final String device_id;
    public final String nonce;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthDblLoginRequestJson> serializer() {
            return AuthDblLoginRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthDblLoginRequestJson authDblLoginRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(authDblLoginRequestJson.account_cuid, c9iZ, 0);
        c9j5.AAV(authDblLoginRequestJson.nonce, c9iZ, 1);
        c9j5.AAV(authDblLoginRequestJson.aymh_device_id, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || authDblLoginRequestJson.device_id != null) {
            c9j5.AAP(authDblLoginRequestJson.device_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || authDblLoginRequestJson.waterfall_id != null) {
            c9j5.AAP(authDblLoginRequestJson.waterfall_id, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthDblLoginRequestJson) {
                AuthDblLoginRequestJson authDblLoginRequestJson = (AuthDblLoginRequestJson) obj;
                if (!C7384Etj.areEqual(this.account_cuid, authDblLoginRequestJson.account_cuid) || !C7384Etj.areEqual(this.nonce, authDblLoginRequestJson.nonce) || !C7384Etj.areEqual(this.aymh_device_id, authDblLoginRequestJson.aymh_device_id) || !C7384Etj.areEqual(this.device_id, authDblLoginRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authDblLoginRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthDblLoginRequestJson copy$default(AuthDblLoginRequestJson authDblLoginRequestJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authDblLoginRequestJson.account_cuid;
        }
        if ((i & 2) != 0) {
            str2 = authDblLoginRequestJson.nonce;
        }
        if ((i & 4) != 0) {
            str3 = authDblLoginRequestJson.aymh_device_id;
        }
        if ((i & 8) != 0) {
            str4 = authDblLoginRequestJson.device_id;
        }
        if ((i & 16) != 0) {
            str5 = authDblLoginRequestJson.waterfall_id;
        }
        return authDblLoginRequestJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.account_cuid;
    }

    public final String component2() {
        return this.nonce;
    }

    public final String component3() {
        return this.aymh_device_id;
    }

    public final String component4() {
        return this.device_id;
    }

    public final String component5() {
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

    public final String getNonce() {
        return this.nonce;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.aymh_device_id, AnonymousClass005.A0I(this.nonce, AnonymousClass001.A0G(this.account_cuid))) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public AuthDblLoginRequestJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        this.account_cuid = str;
        this.nonce = str2;
        this.aymh_device_id = str3;
        this.device_id = str4;
        this.waterfall_id = str5;
    }

    public final AuthDblLoginRequestJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, str2, str3);
        return new AuthDblLoginRequestJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthDblLoginRequestJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public /* synthetic */ AuthDblLoginRequestJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(AuthDblLoginRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.account_cuid = str;
        this.nonce = str2;
        this.aymh_device_id = str3;
        if ((i & 8) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str4;
        }
        if ((i & 16) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str5;
        }
    }
}
