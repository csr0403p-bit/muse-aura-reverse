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
public final class RefreshAccessTokenRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String refresh_token;

    public final class Companion {
        public final C9hr<RefreshAccessTokenRequestJson> serializer() {
            return RefreshAccessTokenRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final RefreshAccessTokenRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new RefreshAccessTokenRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RefreshAccessTokenRequestJson) && C7384Etj.areEqual(this.refresh_token, ((RefreshAccessTokenRequestJson) obj).refresh_token));
    }

    public /* synthetic */ RefreshAccessTokenRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(RefreshAccessTokenRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.refresh_token = str;
    }

    public static /* synthetic */ RefreshAccessTokenRequestJson copy$default(RefreshAccessTokenRequestJson refreshAccessTokenRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshAccessTokenRequestJson.refresh_token;
        }
        C7384Etj.A0Y(str, 0);
        return new RefreshAccessTokenRequestJson(str);
    }

    public final String component1() {
        return this.refresh_token;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public int hashCode() {
        return this.refresh_token.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public RefreshAccessTokenRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.refresh_token = str;
    }
}
