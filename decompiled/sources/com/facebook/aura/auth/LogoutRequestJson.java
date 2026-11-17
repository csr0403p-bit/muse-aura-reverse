package com.facebook.aura.auth;

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
/* loaded from: classes4.dex */
public final class LogoutRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String refresh_token;

    public final class Companion {
        public final C9hr<LogoutRequestJson> serializer() {
            return LogoutRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_auth_auth(LogoutRequestJson logoutRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || logoutRequestJson.refresh_token != null) {
            c9j5.AAP(logoutRequestJson.refresh_token, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LogoutRequestJson) && C7384Etj.areEqual(this.refresh_token, ((LogoutRequestJson) obj).refresh_token));
    }

    public static /* synthetic */ LogoutRequestJson copy$default(LogoutRequestJson logoutRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logoutRequestJson.refresh_token;
        }
        return new LogoutRequestJson(str);
    }

    public final String component1() {
        return this.refresh_token;
    }

    public final LogoutRequestJson copy(String str) {
        return new LogoutRequestJson(str);
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.refresh_token);
    }

    public /* synthetic */ LogoutRequestJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.refresh_token = null;
        } else {
            this.refresh_token = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public LogoutRequestJson(String str) {
        this.refresh_token = str;
    }

    public /* synthetic */ LogoutRequestJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public LogoutRequestJson() {
        this(null);
    }
}
