package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthNtpUpsellChoiceRowJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String display_label;
    public final boolean is_f3;
    public final List<AuthSsoLinkedAccountJson> linked_accounts;
    public final AuthNtpUpsellJson ntp_upsell;
    public final String profile_pic_url;
    public final String source_app;
    public final List<TwoFactorMethodJson> two_factor_methods;
    public final String two_factor_source_app;
    public final String two_factor_state;

    public final class Companion {
        public final C9hr<AuthNtpUpsellChoiceRowJson> serializer() {
            return AuthNtpUpsellChoiceRowJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, AbstractC5321DgF.A02(num, AuthNtpUpsellChoiceRowJson$Companion$$childSerializers$1.INSTANCE), null, null, null, AbstractC5321DgF.A02(num, AuthNtpUpsellChoiceRowJson$Companion$$childSerializers$2.INSTANCE)};
    }

    public final AuthNtpUpsellChoiceRowJson copy(String str, String str2, AuthNtpUpsellJson authNtpUpsellJson, String str3, List<TwoFactorMethodJson> list, String str4, boolean z, String str5, List<AuthSsoLinkedAccountJson> list2) {
        AnonymousClass005.A12(str, str3, list, 0);
        C7384Etj.A0Y(list2, 8);
        return new AuthNtpUpsellChoiceRowJson(str, str2, authNtpUpsellJson, str3, list, str4, z, str5, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthNtpUpsellChoiceRowJson) {
                AuthNtpUpsellChoiceRowJson authNtpUpsellChoiceRowJson = (AuthNtpUpsellChoiceRowJson) obj;
                if (!C7384Etj.areEqual(this.source_app, authNtpUpsellChoiceRowJson.source_app) || !C7384Etj.areEqual(this.profile_pic_url, authNtpUpsellChoiceRowJson.profile_pic_url) || !C7384Etj.areEqual(this.ntp_upsell, authNtpUpsellChoiceRowJson.ntp_upsell) || !C7384Etj.areEqual(this.two_factor_state, authNtpUpsellChoiceRowJson.two_factor_state) || !C7384Etj.areEqual(this.two_factor_methods, authNtpUpsellChoiceRowJson.two_factor_methods) || !C7384Etj.areEqual(this.two_factor_source_app, authNtpUpsellChoiceRowJson.two_factor_source_app) || this.is_f3 != authNtpUpsellChoiceRowJson.is_f3 || !C7384Etj.areEqual(this.display_label, authNtpUpsellChoiceRowJson.display_label) || !C7384Etj.areEqual(this.linked_accounts, authNtpUpsellChoiceRowJson.linked_accounts)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AuthNtpUpsellChoiceRowJson(String str, String str2, AuthNtpUpsellJson authNtpUpsellJson, String str3, List list, String str4, boolean z, String str5, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : authNtpUpsellJson, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? C0881AGi.A00 : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? C0881AGi.A00 : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthNtpUpsellChoiceRowJson copy$default(AuthNtpUpsellChoiceRowJson authNtpUpsellChoiceRowJson, String str, String str2, AuthNtpUpsellJson authNtpUpsellJson, String str3, List list, String str4, boolean z, String str5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authNtpUpsellChoiceRowJson.source_app;
        }
        if ((i & 2) != 0) {
            str2 = authNtpUpsellChoiceRowJson.profile_pic_url;
        }
        if ((i & 4) != 0) {
            authNtpUpsellJson = authNtpUpsellChoiceRowJson.ntp_upsell;
        }
        if ((i & 8) != 0) {
            str3 = authNtpUpsellChoiceRowJson.two_factor_state;
        }
        if ((i & 16) != 0) {
            list = authNtpUpsellChoiceRowJson.two_factor_methods;
        }
        if ((i & 32) != 0) {
            str4 = authNtpUpsellChoiceRowJson.two_factor_source_app;
        }
        if ((i & 64) != 0) {
            z = authNtpUpsellChoiceRowJson.is_f3;
        }
        if ((i & 128) != 0) {
            str5 = authNtpUpsellChoiceRowJson.display_label;
        }
        if ((i & 256) != 0) {
            list2 = authNtpUpsellChoiceRowJson.linked_accounts;
        }
        return authNtpUpsellChoiceRowJson.copy(str, str2, authNtpUpsellJson, str3, list, str4, z, str5, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthNtpUpsellChoiceRowJson authNtpUpsellChoiceRowJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authNtpUpsellChoiceRowJson.source_app)) {
            c9j5.AAV(authNtpUpsellChoiceRowJson.source_app, c9iZ, 0);
        }
        if (zAfR || authNtpUpsellChoiceRowJson.profile_pic_url != null) {
            c9j5.AAP(authNtpUpsellChoiceRowJson.profile_pic_url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || authNtpUpsellChoiceRowJson.ntp_upsell != null) {
            c9j5.AAP(authNtpUpsellChoiceRowJson.ntp_upsell, AuthNtpUpsellJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || !"".equals(authNtpUpsellChoiceRowJson.two_factor_state)) {
            c9j5.AAV(authNtpUpsellChoiceRowJson.two_factor_state, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(authNtpUpsellChoiceRowJson.two_factor_methods)) {
            c9j5.AAQ(authNtpUpsellChoiceRowJson.two_factor_methods, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || authNtpUpsellChoiceRowJson.two_factor_source_app != null) {
            c9j5.AAP(authNtpUpsellChoiceRowJson.two_factor_source_app, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || authNtpUpsellChoiceRowJson.is_f3) {
            c9j5.AA7(c9iZ, 6, authNtpUpsellChoiceRowJson.is_f3);
        }
        if (zAfR || authNtpUpsellChoiceRowJson.display_label != null) {
            c9j5.AAP(authNtpUpsellChoiceRowJson.display_label, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || !C3cG.A1L(authNtpUpsellChoiceRowJson.linked_accounts)) {
            c9j5.AAQ(authNtpUpsellChoiceRowJson.linked_accounts, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
    }

    public final String component1() {
        return this.source_app;
    }

    public final String component2() {
        return this.profile_pic_url;
    }

    public final AuthNtpUpsellJson component3() {
        return this.ntp_upsell;
    }

    public final String component4() {
        return this.two_factor_state;
    }

    public final List<TwoFactorMethodJson> component5() {
        return this.two_factor_methods;
    }

    public final String component6() {
        return this.two_factor_source_app;
    }

    public final boolean component7() {
        return this.is_f3;
    }

    public final String component8() {
        return this.display_label;
    }

    public final List<AuthSsoLinkedAccountJson> component9() {
        return this.linked_accounts;
    }

    public final String getDisplay_label() {
        return this.display_label;
    }

    public final List<AuthSsoLinkedAccountJson> getLinked_accounts() {
        return this.linked_accounts;
    }

    public final AuthNtpUpsellJson getNtp_upsell() {
        return this.ntp_upsell;
    }

    public final String getProfile_pic_url() {
        return this.profile_pic_url;
    }

    public final String getSource_app() {
        return this.source_app;
    }

    public final List<TwoFactorMethodJson> getTwo_factor_methods() {
        return this.two_factor_methods;
    }

    public final String getTwo_factor_source_app() {
        return this.two_factor_source_app;
    }

    public final String getTwo_factor_state() {
        return this.two_factor_state;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.linked_accounts, (C0KA.A01((AnonymousClass005.A0F(this.two_factor_methods, AnonymousClass005.A0I(this.two_factor_state, (((AnonymousClass001.A0G(this.source_app) + AnonymousClass006.A0G(this.profile_pic_url)) * 31) + AnonymousClass006.A0D(this.ntp_upsell)) * 31)) + AnonymousClass006.A0G(this.two_factor_source_app)) * 31, this.is_f3) + AnonymousClass005.A0H(this.display_label)) * 31);
    }

    public final boolean is_f3() {
        return this.is_f3;
    }

    public String toString() {
        return super.toString();
    }

    public AuthNtpUpsellChoiceRowJson(String str, String str2, AuthNtpUpsellJson authNtpUpsellJson, String str3, List<TwoFactorMethodJson> list, String str4, boolean z, String str5, List<AuthSsoLinkedAccountJson> list2) {
        AnonymousClass005.A12(str, str3, list, 0);
        C7384Etj.A0Y(list2, 8);
        this.source_app = str;
        this.profile_pic_url = str2;
        this.ntp_upsell = authNtpUpsellJson;
        this.two_factor_state = str3;
        this.two_factor_methods = list;
        this.two_factor_source_app = str4;
        this.is_f3 = z;
        this.display_label = str5;
        this.linked_accounts = list2;
    }

    public /* synthetic */ AuthNtpUpsellChoiceRowJson(int i, String str, String str2, AuthNtpUpsellJson authNtpUpsellJson, String str3, List list, String str4, boolean z, String str5, List list2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.source_app = "";
        } else {
            this.source_app = str;
        }
        if ((i & 2) == 0) {
            this.profile_pic_url = null;
        } else {
            this.profile_pic_url = str2;
        }
        if ((i & 4) == 0) {
            this.ntp_upsell = null;
        } else {
            this.ntp_upsell = authNtpUpsellJson;
        }
        if ((i & 8) == 0) {
            this.two_factor_state = "";
        } else {
            this.two_factor_state = str3;
        }
        if ((i & 16) == 0) {
            this.two_factor_methods = C0881AGi.A00;
        } else {
            this.two_factor_methods = list;
        }
        if ((i & 32) == 0) {
            this.two_factor_source_app = null;
        } else {
            this.two_factor_source_app = str4;
        }
        if ((i & 64) == 0) {
            this.is_f3 = false;
        } else {
            this.is_f3 = z;
        }
        if ((i & 128) == 0) {
            this.display_label = null;
        } else {
            this.display_label = str5;
        }
        if ((i & 256) == 0) {
            this.linked_accounts = C0881AGi.A00;
        } else {
            this.linked_accounts = list2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthNtpUpsellChoiceRowJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", null, null, "", c0881AGi, null, false, null, c0881AGi);
    }
}
