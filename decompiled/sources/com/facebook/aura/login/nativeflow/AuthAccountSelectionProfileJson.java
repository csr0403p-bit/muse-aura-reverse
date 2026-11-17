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
/* loaded from: classes2.dex */
public final class AuthAccountSelectionProfileJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String platform;
    public final String profile_pic_url;

    public final class Companion {
        public final C9hr<AuthAccountSelectionProfileJson> serializer() {
            return AuthAccountSelectionProfileJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthAccountSelectionProfileJson authAccountSelectionProfileJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authAccountSelectionProfileJson.platform)) {
            c9j5.AAV(authAccountSelectionProfileJson.platform, c9iZ, 0);
        }
        if (zAfR || !"".equals(authAccountSelectionProfileJson.display_name)) {
            c9j5.AAV(authAccountSelectionProfileJson.display_name, c9iZ, 1);
        }
        if (zAfR || authAccountSelectionProfileJson.profile_pic_url != null) {
            c9j5.AAP(authAccountSelectionProfileJson.profile_pic_url, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthAccountSelectionProfileJson) {
                AuthAccountSelectionProfileJson authAccountSelectionProfileJson = (AuthAccountSelectionProfileJson) obj;
                if (!C7384Etj.areEqual(this.platform, authAccountSelectionProfileJson.platform) || !C7384Etj.areEqual(this.display_name, authAccountSelectionProfileJson.display_name) || !C7384Etj.areEqual(this.profile_pic_url, authAccountSelectionProfileJson.profile_pic_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthAccountSelectionProfileJson copy$default(AuthAccountSelectionProfileJson authAccountSelectionProfileJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authAccountSelectionProfileJson.platform;
        }
        if ((i & 2) != 0) {
            str2 = authAccountSelectionProfileJson.display_name;
        }
        if ((i & 4) != 0) {
            str3 = authAccountSelectionProfileJson.profile_pic_url;
        }
        return authAccountSelectionProfileJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.display_name;
    }

    public final String component3() {
        return this.profile_pic_url;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getProfile_pic_url() {
        return this.profile_pic_url;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.display_name, AnonymousClass001.A0G(this.platform)) + AnonymousClass006.A0G(this.profile_pic_url);
    }

    public AuthAccountSelectionProfileJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.platform = str;
        this.display_name = str2;
        this.profile_pic_url = str3;
    }

    public final AuthAccountSelectionProfileJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new AuthAccountSelectionProfileJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthAccountSelectionProfileJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.platform = "";
        } else {
            this.platform = str;
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
    }

    public /* synthetic */ AuthAccountSelectionProfileJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public AuthAccountSelectionProfileJson() {
        this("", "", null);
    }
}
