package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
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
public final class AuthTosBodyRunJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String text;
    public final String url;

    public final class Companion {
        public final C9hr<AuthTosBodyRunJson> serializer() {
            return AuthTosBodyRunJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthTosBodyRunJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.url = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTosBodyRunJson authTosBodyRunJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authTosBodyRunJson.text)) {
            c9j5.AAV(authTosBodyRunJson.text, c9iZ, 0);
        }
        if (zAfR || authTosBodyRunJson.url != null) {
            c9j5.AAP(authTosBodyRunJson.url, C07779iq.A01, c9iZ, 1);
        }
    }

    public final AuthTosBodyRunJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new AuthTosBodyRunJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTosBodyRunJson) {
                AuthTosBodyRunJson authTosBodyRunJson = (AuthTosBodyRunJson) obj;
                if (!C7384Etj.areEqual(this.text, authTosBodyRunJson.text) || !C7384Etj.areEqual(this.url, authTosBodyRunJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthTosBodyRunJson copy$default(AuthTosBodyRunJson authTosBodyRunJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTosBodyRunJson.text;
        }
        if ((i & 2) != 0) {
            str2 = authTosBodyRunJson.url;
        }
        C7384Etj.A0Y(str, 0);
        return new AuthTosBodyRunJson(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.url;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.text) + AnonymousClass006.A0G(this.url);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthTosBodyRunJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, AnonymousClass006.A0s(i, str2));
    }

    public /* synthetic */ AuthTosBodyRunJson(int i, String str, String str2, C2hx c2hx) {
        this.text = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
    }

    public AuthTosBodyRunJson() {
        this("", null);
    }
}
