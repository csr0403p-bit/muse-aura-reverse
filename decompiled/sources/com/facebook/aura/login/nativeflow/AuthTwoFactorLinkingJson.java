package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthTwoFactorLinkingJson extends C06G {
    public static final Companion Companion = new Companion();
    public final AuthTosJson tos;

    public final class Companion {
        public final C9hr<AuthTwoFactorLinkingJson> serializer() {
            return AuthTwoFactorLinkingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTwoFactorLinkingJson authTwoFactorLinkingJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || authTwoFactorLinkingJson.tos != null) {
            c9j5.AAP(authTwoFactorLinkingJson.tos, AuthTosJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuthTwoFactorLinkingJson) && C7384Etj.areEqual(this.tos, ((AuthTwoFactorLinkingJson) obj).tos));
    }

    public static /* synthetic */ AuthTwoFactorLinkingJson copy$default(AuthTwoFactorLinkingJson authTwoFactorLinkingJson, AuthTosJson authTosJson, int i, Object obj) {
        if ((i & 1) != 0) {
            authTosJson = authTwoFactorLinkingJson.tos;
        }
        return new AuthTwoFactorLinkingJson(authTosJson);
    }

    public final AuthTosJson component1() {
        return this.tos;
    }

    public final AuthTwoFactorLinkingJson copy(AuthTosJson authTosJson) {
        return new AuthTwoFactorLinkingJson(authTosJson);
    }

    public final AuthTosJson getTos() {
        return this.tos;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.tos);
    }

    public /* synthetic */ AuthTwoFactorLinkingJson(int i, AuthTosJson authTosJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.tos = null;
        } else {
            this.tos = authTosJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AuthTwoFactorLinkingJson(AuthTosJson authTosJson) {
        this.tos = authTosJson;
    }

    public /* synthetic */ AuthTwoFactorLinkingJson(AuthTosJson authTosJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : authTosJson);
    }

    public AuthTwoFactorLinkingJson() {
        this(null);
    }
}
