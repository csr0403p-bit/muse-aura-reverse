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
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthConfirmPasswordRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String auth_state;
    public final String device_id;
    public final String password;
    public final boolean supports_account_selection;
    public final boolean supports_muse_link_transparency;
    public final boolean supports_reactivation;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthConfirmPasswordRequestJson> serializer() {
            return AuthConfirmPasswordRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ AuthConfirmPasswordRequestJson copy$default(AuthConfirmPasswordRequestJson authConfirmPasswordRequestJson, String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        String str7 = str3;
        String str8 = str4;
        if ((i & 1) != 0) {
            str5 = authConfirmPasswordRequestJson.auth_state;
        }
        if ((i & 2) != 0) {
            str6 = authConfirmPasswordRequestJson.password;
        }
        if ((i & 4) != 0) {
            z4 = authConfirmPasswordRequestJson.supports_account_selection;
        }
        if ((i & 8) != 0) {
            z5 = authConfirmPasswordRequestJson.supports_muse_link_transparency;
        }
        if ((i & 16) != 0) {
            z6 = authConfirmPasswordRequestJson.supports_reactivation;
        }
        if ((i & 32) != 0) {
            str7 = authConfirmPasswordRequestJson.device_id;
        }
        if ((i & 64) != 0) {
            str8 = authConfirmPasswordRequestJson.waterfall_id;
        }
        AnonymousClass003.A0u(str5, str6);
        return new AuthConfirmPasswordRequestJson(str5, str6, z4, z5, z6, str7, str8);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthConfirmPasswordRequestJson authConfirmPasswordRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(authConfirmPasswordRequestJson.auth_state, c9iZ, 0);
        c9j5.AAV(authConfirmPasswordRequestJson.password, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !authConfirmPasswordRequestJson.supports_account_selection) {
            c9j5.AA7(c9iZ, 2, authConfirmPasswordRequestJson.supports_account_selection);
        }
        if (zAfR || !authConfirmPasswordRequestJson.supports_muse_link_transparency) {
            c9j5.AA7(c9iZ, 3, authConfirmPasswordRequestJson.supports_muse_link_transparency);
        }
        if (zAfR || !authConfirmPasswordRequestJson.supports_reactivation) {
            c9j5.AA7(c9iZ, 4, authConfirmPasswordRequestJson.supports_reactivation);
        }
        if (zAfR || authConfirmPasswordRequestJson.device_id != null) {
            c9j5.AAP(authConfirmPasswordRequestJson.device_id, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || authConfirmPasswordRequestJson.waterfall_id != null) {
            c9j5.AAP(authConfirmPasswordRequestJson.waterfall_id, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthConfirmPasswordRequestJson) {
                AuthConfirmPasswordRequestJson authConfirmPasswordRequestJson = (AuthConfirmPasswordRequestJson) obj;
                if (!C7384Etj.areEqual(this.auth_state, authConfirmPasswordRequestJson.auth_state) || !C7384Etj.areEqual(this.password, authConfirmPasswordRequestJson.password) || this.supports_account_selection != authConfirmPasswordRequestJson.supports_account_selection || this.supports_muse_link_transparency != authConfirmPasswordRequestJson.supports_muse_link_transparency || this.supports_reactivation != authConfirmPasswordRequestJson.supports_reactivation || !C7384Etj.areEqual(this.device_id, authConfirmPasswordRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authConfirmPasswordRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AuthConfirmPasswordRequestJson(int i, String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthConfirmPasswordRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.auth_state = str;
        this.password = str2;
        if ((i & 4) == 0) {
            this.supports_account_selection = true;
        } else {
            this.supports_account_selection = z;
        }
        if ((i & 8) == 0) {
            this.supports_muse_link_transparency = true;
        } else {
            this.supports_muse_link_transparency = z2;
        }
        if ((i & 16) == 0) {
            this.supports_reactivation = true;
        } else {
            this.supports_reactivation = z3;
        }
        if ((i & 32) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str3;
        }
        if ((i & 64) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str4;
        }
    }

    public final String component1() {
        return this.auth_state;
    }

    public final String component2() {
        return this.password;
    }

    public final boolean component3() {
        return this.supports_account_selection;
    }

    public final boolean component4() {
        return this.supports_muse_link_transparency;
    }

    public final boolean component5() {
        return this.supports_reactivation;
    }

    public final String component6() {
        return this.device_id;
    }

    public final String component7() {
        return this.waterfall_id;
    }

    public final String getAuth_state() {
        return this.auth_state;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getPassword() {
        return this.password;
    }

    public final boolean getSupports_account_selection() {
        return this.supports_account_selection;
    }

    public final boolean getSupports_muse_link_transparency() {
        return this.supports_muse_link_transparency;
    }

    public final boolean getSupports_reactivation() {
        return this.supports_reactivation;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.password, AnonymousClass001.A0G(this.auth_state)), this.supports_account_selection), this.supports_muse_link_transparency), this.supports_reactivation) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public final AuthConfirmPasswordRequestJson copy(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new AuthConfirmPasswordRequestJson(str, str2, z, z2, z3, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthConfirmPasswordRequestJson(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    public AuthConfirmPasswordRequestJson(String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.auth_state = str;
        this.password = str2;
        this.supports_account_selection = z;
        this.supports_muse_link_transparency = z2;
        this.supports_reactivation = z3;
        this.device_id = str3;
        this.waterfall_id = str4;
    }
}
