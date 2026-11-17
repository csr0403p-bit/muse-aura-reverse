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
public final class AuthSsoMuseProfileJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String name;
    public final String profile_picture_url;

    public final class Companion {
        public final C9hr<AuthSsoMuseProfileJson> serializer() {
            return AuthSsoMuseProfileJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSsoMuseProfileJson authSsoMuseProfileJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || authSsoMuseProfileJson.name != null) {
            c9j5.AAP(authSsoMuseProfileJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || authSsoMuseProfileJson.profile_picture_url != null) {
            c9j5.AAP(authSsoMuseProfileJson.profile_picture_url, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSsoMuseProfileJson) {
                AuthSsoMuseProfileJson authSsoMuseProfileJson = (AuthSsoMuseProfileJson) obj;
                if (!C7384Etj.areEqual(this.name, authSsoMuseProfileJson.name) || !C7384Etj.areEqual(this.profile_picture_url, authSsoMuseProfileJson.profile_picture_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthSsoMuseProfileJson copy$default(AuthSsoMuseProfileJson authSsoMuseProfileJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSsoMuseProfileJson.name;
        }
        if ((i & 2) != 0) {
            str2 = authSsoMuseProfileJson.profile_picture_url;
        }
        return new AuthSsoMuseProfileJson(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.profile_picture_url;
    }

    public final AuthSsoMuseProfileJson copy(String str, String str2) {
        return new AuthSsoMuseProfileJson(str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfile_picture_url() {
        return this.profile_picture_url;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.profile_picture_url);
    }

    public AuthSsoMuseProfileJson(String str, String str2) {
        this.name = str;
        this.profile_picture_url = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthSsoMuseProfileJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.profile_picture_url = null;
        } else {
            this.profile_picture_url = str2;
        }
    }

    public /* synthetic */ AuthSsoMuseProfileJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public AuthSsoMuseProfileJson() {
        this(null, null);
    }
}
