package com.facebook.aura.auth;

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
/* loaded from: classes4.dex */
public final class TokenExchangeErrorJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String detail;
    public final String error;
    public final String message;

    public final class Companion {
        public final C9hr<TokenExchangeErrorJson> serializer() {
            return TokenExchangeErrorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_auth_auth(TokenExchangeErrorJson tokenExchangeErrorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || tokenExchangeErrorJson.detail != null) {
            c9j5.AAP(tokenExchangeErrorJson.detail, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || tokenExchangeErrorJson.message != null) {
            c9j5.AAP(tokenExchangeErrorJson.message, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || tokenExchangeErrorJson.error != null) {
            c9j5.AAP(tokenExchangeErrorJson.error, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TokenExchangeErrorJson) {
                TokenExchangeErrorJson tokenExchangeErrorJson = (TokenExchangeErrorJson) obj;
                if (!C7384Etj.areEqual(this.detail, tokenExchangeErrorJson.detail) || !C7384Etj.areEqual(this.message, tokenExchangeErrorJson.message) || !C7384Etj.areEqual(this.error, tokenExchangeErrorJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TokenExchangeErrorJson copy$default(TokenExchangeErrorJson tokenExchangeErrorJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenExchangeErrorJson.detail;
        }
        if ((i & 2) != 0) {
            str2 = tokenExchangeErrorJson.message;
        }
        if ((i & 4) != 0) {
            str3 = tokenExchangeErrorJson.error;
        }
        return new TokenExchangeErrorJson(str, str2, str3);
    }

    public final String component1() {
        return this.detail;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.error;
    }

    public final TokenExchangeErrorJson copy(String str, String str2, String str3) {
        return new TokenExchangeErrorJson(str, str2, str3);
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.detail) * 31) + AnonymousClass006.A0G(this.message)) * 31) + AnonymousClass005.A0H(this.error);
    }

    public TokenExchangeErrorJson(String str, String str2, String str3) {
        this.detail = str;
        this.message = str2;
        this.error = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TokenExchangeErrorJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.detail = null;
        } else {
            this.detail = str;
        }
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str2;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = str3;
        }
    }

    public /* synthetic */ TokenExchangeErrorJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public TokenExchangeErrorJson() {
        this(null, null, null);
    }
}
