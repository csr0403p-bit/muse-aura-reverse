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
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class AuthTosConsentScreenJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String agree_to_all_label;
    public final String confirm_label;
    public final String decline_label;
    public final String footer;
    public final String subtitle;
    public final String title;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C9hr<AuthTosConsentScreenJson> serializer() {
            return AuthTosConsentScreenJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthTosConsentScreenJson() {
        this("", null, "", null, "", null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTosConsentScreenJson authTosConsentScreenJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authTosConsentScreenJson.title)) {
            c9j5.AAV(authTosConsentScreenJson.title, c9iZ, 0);
        }
        if (zAfR || authTosConsentScreenJson.subtitle != null) {
            c9j5.AAP(authTosConsentScreenJson.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"".equals(authTosConsentScreenJson.agree_to_all_label)) {
            c9j5.AAV(authTosConsentScreenJson.agree_to_all_label, c9iZ, 2);
        }
        if (zAfR || authTosConsentScreenJson.footer != null) {
            c9j5.AAP(authTosConsentScreenJson.footer, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || !"".equals(authTosConsentScreenJson.confirm_label)) {
            c9j5.AAV(authTosConsentScreenJson.confirm_label, c9iZ, 4);
        }
        if (zAfR || authTosConsentScreenJson.decline_label != null) {
            c9j5.AAP(authTosConsentScreenJson.decline_label, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTosConsentScreenJson) {
                AuthTosConsentScreenJson authTosConsentScreenJson = (AuthTosConsentScreenJson) obj;
                if (!C7384Etj.areEqual(this.title, authTosConsentScreenJson.title) || !C7384Etj.areEqual(this.subtitle, authTosConsentScreenJson.subtitle) || !C7384Etj.areEqual(this.agree_to_all_label, authTosConsentScreenJson.agree_to_all_label) || !C7384Etj.areEqual(this.footer, authTosConsentScreenJson.footer) || !C7384Etj.areEqual(this.confirm_label, authTosConsentScreenJson.confirm_label) || !C7384Etj.areEqual(this.decline_label, authTosConsentScreenJson.decline_label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthTosConsentScreenJson copy$default(AuthTosConsentScreenJson authTosConsentScreenJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTosConsentScreenJson.title;
        }
        if ((i & 2) != 0) {
            str2 = authTosConsentScreenJson.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = authTosConsentScreenJson.agree_to_all_label;
        }
        if ((i & 8) != 0) {
            str4 = authTosConsentScreenJson.footer;
        }
        if ((i & 16) != 0) {
            str5 = authTosConsentScreenJson.confirm_label;
        }
        if ((i & 32) != 0) {
            str6 = authTosConsentScreenJson.decline_label;
        }
        return authTosConsentScreenJson.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.agree_to_all_label;
    }

    public final String component4() {
        return this.footer;
    }

    public final String component5() {
        return this.confirm_label;
    }

    public final String component6() {
        return this.decline_label;
    }

    public final String getAgree_to_all_label() {
        return this.agree_to_all_label;
    }

    public final String getConfirm_label() {
        return this.confirm_label;
    }

    public final String getDecline_label() {
        return this.decline_label;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.confirm_label, (AnonymousClass005.A0I(this.agree_to_all_label, (AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.footer)) * 31) + AnonymousClass005.A0H(this.decline_label);
    }

    public final AuthTosConsentScreenJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0v(str, str3);
        C7384Etj.A0Y(str5, 4);
        return new AuthTosConsentScreenJson(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthTosConsentScreenJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6);
    }

    public AuthTosConsentScreenJson(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0v(str, str3);
        C7384Etj.A0Y(str5, 4);
        this.title = str;
        this.subtitle = str2;
        this.agree_to_all_label = str3;
        this.footer = str4;
        this.confirm_label = str5;
        this.decline_label = str6;
    }

    public /* synthetic */ AuthTosConsentScreenJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.agree_to_all_label = "";
        } else {
            this.agree_to_all_label = str3;
        }
        if ((i & 8) == 0) {
            this.footer = null;
        } else {
            this.footer = str4;
        }
        if ((i & 16) == 0) {
            this.confirm_label = "";
        } else {
            this.confirm_label = str5;
        }
        if ((i & 32) == 0) {
            this.decline_label = null;
        } else {
            this.decline_label = str6;
        }
    }
}
