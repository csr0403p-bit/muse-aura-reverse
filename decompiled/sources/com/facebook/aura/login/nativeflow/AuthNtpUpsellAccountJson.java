package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
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
public final class AuthNtpUpsellAccountJson extends C06G {
    public final String display_label;
    public final String display_name;
    public final String email;
    public final List<AuthSsoLinkedAccountJson> linked_accounts;
    public final String profile_pic_url;
    public final String source_app;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, AuthNtpUpsellAccountJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<AuthNtpUpsellAccountJson> serializer() {
            return AuthNtpUpsellAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthNtpUpsellAccountJson() {
        this("", "", null, null, null, C0881AGi.A00);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthNtpUpsellAccountJson) {
                AuthNtpUpsellAccountJson authNtpUpsellAccountJson = (AuthNtpUpsellAccountJson) obj;
                if (!C7384Etj.areEqual(this.source_app, authNtpUpsellAccountJson.source_app) || !C7384Etj.areEqual(this.display_name, authNtpUpsellAccountJson.display_name) || !C7384Etj.areEqual(this.profile_pic_url, authNtpUpsellAccountJson.profile_pic_url) || !C7384Etj.areEqual(this.email, authNtpUpsellAccountJson.email) || !C7384Etj.areEqual(this.display_label, authNtpUpsellAccountJson.display_label) || !C7384Etj.areEqual(this.linked_accounts, authNtpUpsellAccountJson.linked_accounts)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthNtpUpsellAccountJson copy$default(AuthNtpUpsellAccountJson authNtpUpsellAccountJson, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authNtpUpsellAccountJson.source_app;
        }
        if ((i & 2) != 0) {
            str2 = authNtpUpsellAccountJson.display_name;
        }
        if ((i & 4) != 0) {
            str3 = authNtpUpsellAccountJson.profile_pic_url;
        }
        if ((i & 8) != 0) {
            str4 = authNtpUpsellAccountJson.email;
        }
        if ((i & 16) != 0) {
            str5 = authNtpUpsellAccountJson.display_label;
        }
        if ((i & 32) != 0) {
            list = authNtpUpsellAccountJson.linked_accounts;
        }
        return authNtpUpsellAccountJson.copy(str, str2, str3, str4, str5, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthNtpUpsellAccountJson authNtpUpsellAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authNtpUpsellAccountJson.source_app)) {
            c9j5.AAV(authNtpUpsellAccountJson.source_app, c9iZ, 0);
        }
        if (zAfR || !"".equals(authNtpUpsellAccountJson.display_name)) {
            c9j5.AAV(authNtpUpsellAccountJson.display_name, c9iZ, 1);
        }
        if (zAfR || authNtpUpsellAccountJson.profile_pic_url != null) {
            c9j5.AAP(authNtpUpsellAccountJson.profile_pic_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || authNtpUpsellAccountJson.email != null) {
            c9j5.AAP(authNtpUpsellAccountJson.email, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || authNtpUpsellAccountJson.display_label != null) {
            c9j5.AAP(authNtpUpsellAccountJson.display_label, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !C3cG.A1L(authNtpUpsellAccountJson.linked_accounts)) {
            c9j5.AAQ(authNtpUpsellAccountJson.linked_accounts, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
    }

    public final String component1() {
        return this.source_app;
    }

    public final String component2() {
        return this.display_name;
    }

    public final String component3() {
        return this.profile_pic_url;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.display_label;
    }

    public final List<AuthSsoLinkedAccountJson> component6() {
        return this.linked_accounts;
    }

    public final String getDisplay_label() {
        return this.display_label;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final List<AuthSsoLinkedAccountJson> getLinked_accounts() {
        return this.linked_accounts;
    }

    public final String getProfile_pic_url() {
        return this.profile_pic_url;
    }

    public final String getSource_app() {
        return this.source_app;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.linked_accounts, (((((AnonymousClass005.A0I(this.display_name, AnonymousClass001.A0G(this.source_app)) + AnonymousClass006.A0G(this.profile_pic_url)) * 31) + AnonymousClass006.A0G(this.email)) * 31) + AnonymousClass005.A0H(this.display_label)) * 31);
    }

    public final AuthNtpUpsellAccountJson copy(String str, String str2, String str3, String str4, String str5, List<AuthSsoLinkedAccountJson> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 5);
        return new AuthNtpUpsellAccountJson(str, str2, str3, str4, str5, list);
    }

    public String toString() {
        return super.toString();
    }

    public AuthNtpUpsellAccountJson(String str, String str2, String str3, String str4, String str5, List<AuthSsoLinkedAccountJson> list) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(list, 5);
        this.source_app = str;
        this.display_name = str2;
        this.profile_pic_url = str3;
        this.email = str4;
        this.display_label = str5;
        this.linked_accounts = list;
    }

    public /* synthetic */ AuthNtpUpsellAccountJson(String str, String str2, String str3, String str4, String str5, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ AuthNtpUpsellAccountJson(int i, String str, String str2, String str3, String str4, String str5, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.source_app = "";
        } else {
            this.source_app = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.profile_pic_url = null;
        } else {
            this.profile_pic_url = str3;
        }
        if ((i & 8) == 0) {
            this.email = null;
        } else {
            this.email = str4;
        }
        if ((i & 16) == 0) {
            this.display_label = null;
        } else {
            this.display_label = str5;
        }
        if ((i & 32) == 0) {
            this.linked_accounts = C0881AGi.A00;
        } else {
            this.linked_accounts = list;
        }
    }
}
