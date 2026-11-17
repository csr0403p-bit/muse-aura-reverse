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
public final class AuthNtpUpsellJson extends C06G {
    public static final Companion Companion = new Companion();
    public final AuthNtpUpsellAccountJson account;
    public final String contact_point;
    public final boolean is_f3;
    public final String landing_presentation;
    public final String link_handle;
    public final boolean show_muse_transparency;
    public final boolean suppress_tos_clause;
    public final AuthTosJson tos;

    public final class Companion {
        public final C9hr<AuthNtpUpsellJson> serializer() {
            return AuthNtpUpsellJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthNtpUpsellJson authNtpUpsellJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authNtpUpsellJson.link_handle)) {
            c9j5.AAV(authNtpUpsellJson.link_handle, c9iZ, 0);
        }
        if (zAfR || authNtpUpsellJson.contact_point != null) {
            c9j5.AAP(authNtpUpsellJson.contact_point, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || authNtpUpsellJson.account != null) {
            c9j5.AAP(authNtpUpsellJson.account, AuthNtpUpsellAccountJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || authNtpUpsellJson.tos != null) {
            c9j5.AAP(authNtpUpsellJson.tos, AuthTosJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || authNtpUpsellJson.show_muse_transparency) {
            c9j5.AA7(c9iZ, 4, authNtpUpsellJson.show_muse_transparency);
        }
        if (zAfR || authNtpUpsellJson.is_f3) {
            c9j5.AA7(c9iZ, 5, authNtpUpsellJson.is_f3);
        }
        if (zAfR || authNtpUpsellJson.suppress_tos_clause) {
            c9j5.AA7(c9iZ, 6, authNtpUpsellJson.suppress_tos_clause);
        }
        if (zAfR || !"".equals(authNtpUpsellJson.landing_presentation)) {
            c9j5.AAV(authNtpUpsellJson.landing_presentation, c9iZ, 7);
        }
    }

    public final AuthNtpUpsellJson copy(String str, String str2, AuthNtpUpsellAccountJson authNtpUpsellAccountJson, AuthTosJson authTosJson, boolean z, boolean z2, boolean z3, String str3) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str3, 7);
        return new AuthNtpUpsellJson(str, str2, authNtpUpsellAccountJson, authTosJson, z, z2, z3, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthNtpUpsellJson) {
                AuthNtpUpsellJson authNtpUpsellJson = (AuthNtpUpsellJson) obj;
                if (!C7384Etj.areEqual(this.link_handle, authNtpUpsellJson.link_handle) || !C7384Etj.areEqual(this.contact_point, authNtpUpsellJson.contact_point) || !C7384Etj.areEqual(this.account, authNtpUpsellJson.account) || !C7384Etj.areEqual(this.tos, authNtpUpsellJson.tos) || this.show_muse_transparency != authNtpUpsellJson.show_muse_transparency || this.is_f3 != authNtpUpsellJson.is_f3 || this.suppress_tos_clause != authNtpUpsellJson.suppress_tos_clause || !C7384Etj.areEqual(this.landing_presentation, authNtpUpsellJson.landing_presentation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthNtpUpsellJson copy$default(AuthNtpUpsellJson authNtpUpsellJson, String str, String str2, AuthNtpUpsellAccountJson authNtpUpsellAccountJson, AuthTosJson authTosJson, boolean z, boolean z2, boolean z3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authNtpUpsellJson.link_handle;
        }
        if ((i & 2) != 0) {
            str2 = authNtpUpsellJson.contact_point;
        }
        if ((i & 4) != 0) {
            authNtpUpsellAccountJson = authNtpUpsellJson.account;
        }
        if ((i & 8) != 0) {
            authTosJson = authNtpUpsellJson.tos;
        }
        if ((i & 16) != 0) {
            z = authNtpUpsellJson.show_muse_transparency;
        }
        if ((i & 32) != 0) {
            z2 = authNtpUpsellJson.is_f3;
        }
        if ((i & 64) != 0) {
            z3 = authNtpUpsellJson.suppress_tos_clause;
        }
        if ((i & 128) != 0) {
            str3 = authNtpUpsellJson.landing_presentation;
        }
        return authNtpUpsellJson.copy(str, str2, authNtpUpsellAccountJson, authTosJson, z, z2, z3, str3);
    }

    public final String component1() {
        return this.link_handle;
    }

    public final String component2() {
        return this.contact_point;
    }

    public final AuthNtpUpsellAccountJson component3() {
        return this.account;
    }

    public final AuthTosJson component4() {
        return this.tos;
    }

    public final boolean component5() {
        return this.show_muse_transparency;
    }

    public final boolean component6() {
        return this.is_f3;
    }

    public final boolean component7() {
        return this.suppress_tos_clause;
    }

    public final String component8() {
        return this.landing_presentation;
    }

    public final AuthNtpUpsellAccountJson getAccount() {
        return this.account;
    }

    public final String getContact_point() {
        return this.contact_point;
    }

    public final String getLanding_presentation() {
        return this.landing_presentation;
    }

    public final String getLink_handle() {
        return this.link_handle;
    }

    public final boolean getShow_muse_transparency() {
        return this.show_muse_transparency;
    }

    public final boolean getSuppress_tos_clause() {
        return this.suppress_tos_clause;
    }

    public final AuthTosJson getTos() {
        return this.tos;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.landing_presentation, C0KA.A01(C0KA.A01(C0KA.A01((((((AnonymousClass001.A0G(this.link_handle) + AnonymousClass006.A0G(this.contact_point)) * 31) + AnonymousClass006.A0D(this.account)) * 31) + C3cH.A02(this.tos)) * 31, this.show_muse_transparency), this.is_f3), this.suppress_tos_clause));
    }

    public final boolean is_f3() {
        return this.is_f3;
    }

    public /* synthetic */ AuthNtpUpsellJson(int i, String str, String str2, AuthNtpUpsellAccountJson authNtpUpsellAccountJson, AuthTosJson authTosJson, boolean z, boolean z2, boolean z3, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.link_handle = "";
        } else {
            this.link_handle = str;
        }
        if ((i & 2) == 0) {
            this.contact_point = null;
        } else {
            this.contact_point = str2;
        }
        if ((i & 4) == 0) {
            this.account = null;
        } else {
            this.account = authNtpUpsellAccountJson;
        }
        if ((i & 8) == 0) {
            this.tos = null;
        } else {
            this.tos = authTosJson;
        }
        if ((i & 16) == 0) {
            this.show_muse_transparency = false;
        } else {
            this.show_muse_transparency = z;
        }
        if ((i & 32) == 0) {
            this.is_f3 = false;
        } else {
            this.is_f3 = z2;
        }
        if ((i & 64) == 0) {
            this.suppress_tos_clause = false;
        } else {
            this.suppress_tos_clause = z3;
        }
        if ((i & 128) == 0) {
            this.landing_presentation = "";
        } else {
            this.landing_presentation = str3;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AuthNtpUpsellJson(String str, String str2, AuthNtpUpsellAccountJson authNtpUpsellAccountJson, AuthTosJson authTosJson, boolean z, boolean z2, boolean z3, String str3) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str3, 7);
        this.link_handle = str;
        this.contact_point = str2;
        this.account = authNtpUpsellAccountJson;
        this.tos = authTosJson;
        this.show_muse_transparency = z;
        this.is_f3 = z2;
        this.suppress_tos_clause = z3;
        this.landing_presentation = str3;
    }

    public /* synthetic */ AuthNtpUpsellJson(String str, String str2, AuthNtpUpsellAccountJson authNtpUpsellAccountJson, AuthTosJson authTosJson, boolean z, boolean z2, boolean z3, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : authNtpUpsellAccountJson, (i & 8) != 0 ? null : authTosJson, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? "" : str3);
    }

    public AuthNtpUpsellJson() {
        this("", null, null, null, false, false, false, "");
    }
}
