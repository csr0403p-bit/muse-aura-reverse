package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthZariExchangeResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final AuthRegisterCompletionResponseJson credentials;
    public final boolean matched;

    public final class Companion {
        public final C9hr<AuthZariExchangeResponseJson> serializer() {
            return AuthZariExchangeResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthZariExchangeResponseJson authZariExchangeResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || authZariExchangeResponseJson.matched) {
            c9j5.AA7(c9iZ, 0, authZariExchangeResponseJson.matched);
        }
        if (zAfR || authZariExchangeResponseJson.credentials != null) {
            c9j5.AAP(authZariExchangeResponseJson.credentials, AuthRegisterCompletionResponseJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthZariExchangeResponseJson) {
                AuthZariExchangeResponseJson authZariExchangeResponseJson = (AuthZariExchangeResponseJson) obj;
                if (this.matched != authZariExchangeResponseJson.matched || !C7384Etj.areEqual(this.credentials, authZariExchangeResponseJson.credentials)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthZariExchangeResponseJson copy$default(AuthZariExchangeResponseJson authZariExchangeResponseJson, boolean z, AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authZariExchangeResponseJson.matched;
        }
        if ((i & 2) != 0) {
            authRegisterCompletionResponseJson = authZariExchangeResponseJson.credentials;
        }
        return new AuthZariExchangeResponseJson(z, authRegisterCompletionResponseJson);
    }

    public final boolean component1() {
        return this.matched;
    }

    public final AuthRegisterCompletionResponseJson component2() {
        return this.credentials;
    }

    public final AuthZariExchangeResponseJson copy(boolean z, AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson) {
        return new AuthZariExchangeResponseJson(z, authRegisterCompletionResponseJson);
    }

    public final AuthRegisterCompletionResponseJson getCredentials() {
        return this.credentials;
    }

    public final boolean getMatched() {
        return this.matched;
    }

    public int hashCode() {
        return C0KA.A02(this.matched) + AnonymousClass006.A0D(this.credentials);
    }

    public AuthZariExchangeResponseJson(boolean z, AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson) {
        this.matched = z;
        this.credentials = authRegisterCompletionResponseJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthZariExchangeResponseJson(int i, boolean z, AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson, C2hx c2hx) {
        this.matched = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.credentials = null;
        } else {
            this.credentials = authRegisterCompletionResponseJson;
        }
    }

    public /* synthetic */ AuthZariExchangeResponseJson(boolean z, AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : authRegisterCompletionResponseJson);
    }

    public AuthZariExchangeResponseJson() {
        this(false, null);
    }
}
