package com.facebook.aura.auth;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class RefreshAccessTokenResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String access_token;
    public final String refresh_token;

    public final class Companion {
        public final C9hr<RefreshAccessTokenResponseJson> serializer() {
            return RefreshAccessTokenResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_auth_auth(RefreshAccessTokenResponseJson refreshAccessTokenResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(refreshAccessTokenResponseJson.access_token)) {
            c9j5.AAV(refreshAccessTokenResponseJson.access_token, c9iZ, 0);
        }
        if (zAfR || !"".equals(refreshAccessTokenResponseJson.refresh_token)) {
            c9j5.AAV(refreshAccessTokenResponseJson.refresh_token, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RefreshAccessTokenResponseJson) {
                RefreshAccessTokenResponseJson refreshAccessTokenResponseJson = (RefreshAccessTokenResponseJson) obj;
                if (!C7384Etj.areEqual(this.access_token, refreshAccessTokenResponseJson.access_token) || !C7384Etj.areEqual(this.refresh_token, refreshAccessTokenResponseJson.refresh_token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RefreshAccessTokenResponseJson copy$default(RefreshAccessTokenResponseJson refreshAccessTokenResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshAccessTokenResponseJson.access_token;
        }
        if ((i & 2) != 0) {
            str2 = refreshAccessTokenResponseJson.refresh_token;
        }
        AnonymousClass003.A0u(str, str2);
        return new RefreshAccessTokenResponseJson(str, str2);
    }

    public final String component1() {
        return this.access_token;
    }

    public final String component2() {
        return this.refresh_token;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.refresh_token, AnonymousClass001.A0G(this.access_token));
    }

    public RefreshAccessTokenResponseJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.access_token = str;
        this.refresh_token = str2;
    }

    public final RefreshAccessTokenResponseJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new RefreshAccessTokenResponseJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RefreshAccessTokenResponseJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.access_token = "";
        } else {
            this.access_token = str;
        }
        if ((i & 2) == 0) {
            this.refresh_token = "";
        } else {
            this.refresh_token = str2;
        }
    }

    public /* synthetic */ RefreshAccessTokenResponseJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public RefreshAccessTokenResponseJson() {
        this("", "");
    }
}
