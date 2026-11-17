package com.facebook.aura.auth;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class TokenExchangeRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String frl_access_token;

    public final class Companion {
        public final C9hr<TokenExchangeRequestJson> serializer() {
            return TokenExchangeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final TokenExchangeRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new TokenExchangeRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TokenExchangeRequestJson) && C7384Etj.areEqual(this.frl_access_token, ((TokenExchangeRequestJson) obj).frl_access_token));
    }

    public /* synthetic */ TokenExchangeRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(TokenExchangeRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.frl_access_token = str;
    }

    public static /* synthetic */ TokenExchangeRequestJson copy$default(TokenExchangeRequestJson tokenExchangeRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenExchangeRequestJson.frl_access_token;
        }
        C7384Etj.A0Y(str, 0);
        return new TokenExchangeRequestJson(str);
    }

    public final String component1() {
        return this.frl_access_token;
    }

    public final String getFrl_access_token() {
        return this.frl_access_token;
    }

    public int hashCode() {
        return this.frl_access_token.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public TokenExchangeRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.frl_access_token = str;
    }
}
