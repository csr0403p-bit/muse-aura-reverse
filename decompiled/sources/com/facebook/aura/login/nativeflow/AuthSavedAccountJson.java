package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
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
public final class AuthSavedAccountJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String account_cuid;
    public final String contact_point_type;
    public final String display_label;
    public final AuthSsoMuseProfileJson muse_profile;
    public final String saved_account_id;
    public final boolean uses_dbl;

    public final class Companion {
        public final C9hr<AuthSavedAccountJson> serializer() {
            return AuthSavedAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthSavedAccountJson() {
        this("", "", false, "", null, null);
    }

    public static /* synthetic */ AuthSavedAccountJson copy$default(AuthSavedAccountJson authSavedAccountJson, String str, String str2, boolean z, String str3, String str4, AuthSsoMuseProfileJson authSsoMuseProfileJson, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        boolean z2 = z;
        String str7 = str3;
        String str8 = str4;
        AuthSsoMuseProfileJson authSsoMuseProfileJson2 = authSsoMuseProfileJson;
        if ((i & 1) != 0) {
            str5 = authSavedAccountJson.saved_account_id;
        }
        if ((i & 2) != 0) {
            str6 = authSavedAccountJson.account_cuid;
        }
        if ((i & 4) != 0) {
            z2 = authSavedAccountJson.uses_dbl;
        }
        if ((i & 8) != 0) {
            str7 = authSavedAccountJson.display_label;
        }
        if ((i & 16) != 0) {
            str8 = authSavedAccountJson.contact_point_type;
        }
        if ((i & 32) != 0) {
            authSsoMuseProfileJson2 = authSavedAccountJson.muse_profile;
        }
        AnonymousClass005.A0y(str5, str6, str7);
        return new AuthSavedAccountJson(str5, str6, z2, str7, str8, authSsoMuseProfileJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSavedAccountJson authSavedAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authSavedAccountJson.saved_account_id)) {
            c9j5.AAV(authSavedAccountJson.saved_account_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(authSavedAccountJson.account_cuid)) {
            c9j5.AAV(authSavedAccountJson.account_cuid, c9iZ, 1);
        }
        if (zAfR || authSavedAccountJson.uses_dbl) {
            c9j5.AA7(c9iZ, 2, authSavedAccountJson.uses_dbl);
        }
        if (zAfR || !"".equals(authSavedAccountJson.display_label)) {
            c9j5.AAV(authSavedAccountJson.display_label, c9iZ, 3);
        }
        if (zAfR || authSavedAccountJson.contact_point_type != null) {
            c9j5.AAP(authSavedAccountJson.contact_point_type, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || authSavedAccountJson.muse_profile != null) {
            c9j5.AAP(authSavedAccountJson.muse_profile, AuthSsoMuseProfileJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSavedAccountJson) {
                AuthSavedAccountJson authSavedAccountJson = (AuthSavedAccountJson) obj;
                if (!C7384Etj.areEqual(this.saved_account_id, authSavedAccountJson.saved_account_id) || !C7384Etj.areEqual(this.account_cuid, authSavedAccountJson.account_cuid) || this.uses_dbl != authSavedAccountJson.uses_dbl || !C7384Etj.areEqual(this.display_label, authSavedAccountJson.display_label) || !C7384Etj.areEqual(this.contact_point_type, authSavedAccountJson.contact_point_type) || !C7384Etj.areEqual(this.muse_profile, authSavedAccountJson.muse_profile)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.saved_account_id;
    }

    public final String component2() {
        return this.account_cuid;
    }

    public final boolean component3() {
        return this.uses_dbl;
    }

    public final String component4() {
        return this.display_label;
    }

    public final String component5() {
        return this.contact_point_type;
    }

    public final AuthSsoMuseProfileJson component6() {
        return this.muse_profile;
    }

    public final String getAccount_cuid() {
        return this.account_cuid;
    }

    public final String getContact_point_type() {
        return this.contact_point_type;
    }

    public final String getDisplay_label() {
        return this.display_label;
    }

    public final AuthSsoMuseProfileJson getMuse_profile() {
        return this.muse_profile;
    }

    public final String getSaved_account_id() {
        return this.saved_account_id;
    }

    public final boolean getUses_dbl() {
        return this.uses_dbl;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.display_label, C0KA.A01(AnonymousClass005.A0I(this.account_cuid, AnonymousClass001.A0G(this.saved_account_id)), this.uses_dbl)) + AnonymousClass006.A0G(this.contact_point_type)) * 31) + C3cH.A02(this.muse_profile);
    }

    public final HatchSavedAccount toDomain() {
        String str = this.saved_account_id;
        String str2 = this.account_cuid;
        boolean z = this.uses_dbl;
        String str3 = this.display_label;
        boolean zEquals = "email".equals(this.contact_point_type);
        AuthSsoMuseProfileJson authSsoMuseProfileJson = this.muse_profile;
        return new HatchSavedAccount(str, str2, z, str3, zEquals, authSsoMuseProfileJson != null ? HatchAuthApiJsonKt.toDomain(authSsoMuseProfileJson) : null);
    }

    public final AuthSavedAccountJson copy(String str, String str2, boolean z, String str3, String str4, AuthSsoMuseProfileJson authSsoMuseProfileJson) {
        AnonymousClass005.A0y(str, str2, str3);
        return new AuthSavedAccountJson(str, str2, z, str3, str4, authSsoMuseProfileJson);
    }

    public String toString() {
        return super.toString();
    }

    public AuthSavedAccountJson(String str, String str2, boolean z, String str3, String str4, AuthSsoMuseProfileJson authSsoMuseProfileJson) {
        AnonymousClass005.A0y(str, str2, str3);
        this.saved_account_id = str;
        this.account_cuid = str2;
        this.uses_dbl = z;
        this.display_label = str3;
        this.contact_point_type = str4;
        this.muse_profile = authSsoMuseProfileJson;
    }

    public /* synthetic */ AuthSavedAccountJson(String str, String str2, boolean z, String str3, String str4, AuthSsoMuseProfileJson authSsoMuseProfileJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : authSsoMuseProfileJson);
    }

    public /* synthetic */ AuthSavedAccountJson(int i, String str, String str2, boolean z, String str3, String str4, AuthSsoMuseProfileJson authSsoMuseProfileJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.saved_account_id = "";
        } else {
            this.saved_account_id = str;
        }
        if ((i & 2) == 0) {
            this.account_cuid = "";
        } else {
            this.account_cuid = str2;
        }
        if ((i & 4) == 0) {
            this.uses_dbl = false;
        } else {
            this.uses_dbl = z;
        }
        if ((i & 8) == 0) {
            this.display_label = "";
        } else {
            this.display_label = str3;
        }
        if ((i & 16) == 0) {
            this.contact_point_type = null;
        } else {
            this.contact_point_type = str4;
        }
        if ((i & 32) == 0) {
            this.muse_profile = null;
        } else {
            this.muse_profile = authSsoMuseProfileJson;
        }
    }
}
