package com.facebook.aura.login.nativeflow;

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
public final class AuthSsoLinkedAccountJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String display_name;
    public final String platform;
    public final String profile_pic_url;

    public final class Companion {
        public final C9hr<AuthSsoLinkedAccountJson> serializer() {
            return AuthSsoLinkedAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSsoLinkedAccountJson authSsoLinkedAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || authSsoLinkedAccountJson.platform != null) {
            c9j5.AAP(authSsoLinkedAccountJson.platform, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || authSsoLinkedAccountJson.profile_pic_url != null) {
            c9j5.AAP(authSsoLinkedAccountJson.profile_pic_url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || authSsoLinkedAccountJson.display_name != null) {
            c9j5.AAP(authSsoLinkedAccountJson.display_name, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSsoLinkedAccountJson) {
                AuthSsoLinkedAccountJson authSsoLinkedAccountJson = (AuthSsoLinkedAccountJson) obj;
                if (!C7384Etj.areEqual(this.platform, authSsoLinkedAccountJson.platform) || !C7384Etj.areEqual(this.profile_pic_url, authSsoLinkedAccountJson.profile_pic_url) || !C7384Etj.areEqual(this.display_name, authSsoLinkedAccountJson.display_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthSsoLinkedAccountJson copy$default(AuthSsoLinkedAccountJson authSsoLinkedAccountJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSsoLinkedAccountJson.platform;
        }
        if ((i & 2) != 0) {
            str2 = authSsoLinkedAccountJson.profile_pic_url;
        }
        if ((i & 4) != 0) {
            str3 = authSsoLinkedAccountJson.display_name;
        }
        return new AuthSsoLinkedAccountJson(str, str2, str3);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.profile_pic_url;
    }

    public final String component3() {
        return this.display_name;
    }

    public final AuthSsoLinkedAccountJson copy(String str, String str2, String str3) {
        return new AuthSsoLinkedAccountJson(str, str2, str3);
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
        return (((AnonymousClass006.A0G(this.platform) * 31) + AnonymousClass006.A0G(this.profile_pic_url)) * 31) + AnonymousClass005.A0H(this.display_name);
    }

    public AuthSsoLinkedAccountJson(String str, String str2, String str3) {
        this.platform = str;
        this.profile_pic_url = str2;
        this.display_name = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthSsoLinkedAccountJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.platform = null;
        } else {
            this.platform = str;
        }
        if ((i & 2) == 0) {
            this.profile_pic_url = null;
        } else {
            this.profile_pic_url = str2;
        }
        if ((i & 4) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str3;
        }
    }

    public /* synthetic */ AuthSsoLinkedAccountJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public AuthSsoLinkedAccountJson() {
        this(null, null, null);
    }
}
