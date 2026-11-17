package com.facebook.aura.auth;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class RefreshedTokens extends C06G {
    public final String accessToken;
    public final String refreshToken;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RefreshedTokens) {
                RefreshedTokens refreshedTokens = (RefreshedTokens) obj;
                if (!C7384Etj.areEqual(this.accessToken, refreshedTokens.accessToken) || !C7384Etj.areEqual(this.refreshToken, refreshedTokens.refreshToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RefreshedTokens copy$default(RefreshedTokens refreshedTokens, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshedTokens.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = refreshedTokens.refreshToken;
        }
        AnonymousClass003.A0u(str, str2);
        return new RefreshedTokens(str, str2);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.refreshToken;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.refreshToken, AnonymousClass001.A0G(this.accessToken));
    }

    public RefreshedTokens(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.accessToken = str;
        this.refreshToken = str2;
    }

    public final RefreshedTokens copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new RefreshedTokens(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
