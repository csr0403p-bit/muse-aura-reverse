package com.facebook.aura.auth;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class TokenExchangeResult extends C06G {
    public final String accessToken;
    public final String refreshToken;
    public final String userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TokenExchangeResult) {
                TokenExchangeResult tokenExchangeResult = (TokenExchangeResult) obj;
                if (!C7384Etj.areEqual(this.accessToken, tokenExchangeResult.accessToken) || !C7384Etj.areEqual(this.userId, tokenExchangeResult.userId) || !C7384Etj.areEqual(this.refreshToken, tokenExchangeResult.refreshToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TokenExchangeResult copy$default(TokenExchangeResult tokenExchangeResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenExchangeResult.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = tokenExchangeResult.userId;
        }
        if ((i & 4) != 0) {
            str3 = tokenExchangeResult.refreshToken;
        }
        return tokenExchangeResult.copy(str, str2, str3);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.refreshToken;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.userId, AnonymousClass001.A0G(this.accessToken)) + AnonymousClass006.A0G(this.refreshToken);
    }

    public TokenExchangeResult(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.accessToken = str;
        this.userId = str2;
        this.refreshToken = str3;
    }

    public final TokenExchangeResult copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new TokenExchangeResult(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
