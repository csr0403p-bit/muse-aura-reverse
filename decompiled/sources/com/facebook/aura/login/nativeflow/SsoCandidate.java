package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class SsoCandidate extends C06G {
    public final String accessToken;
    public final boolean isActive;
    public final HatchSsoSourceApp sourceApp;
    public final String userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SsoCandidate) {
                SsoCandidate ssoCandidate = (SsoCandidate) obj;
                if (!C7384Etj.areEqual(this.userId, ssoCandidate.userId) || this.sourceApp != ssoCandidate.sourceApp || !C7384Etj.areEqual(this.accessToken, ssoCandidate.accessToken) || this.isActive != ssoCandidate.isActive) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SsoCandidate copy$default(SsoCandidate ssoCandidate, String str, HatchSsoSourceApp hatchSsoSourceApp, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ssoCandidate.userId;
        }
        if ((i & 2) != 0) {
            hatchSsoSourceApp = ssoCandidate.sourceApp;
        }
        if ((i & 4) != 0) {
            str2 = ssoCandidate.accessToken;
        }
        if ((i & 8) != 0) {
            z = ssoCandidate.isActive;
        }
        AnonymousClass005.A0x(str, hatchSsoSourceApp, str2);
        return new SsoCandidate(str, hatchSsoSourceApp, str2, z);
    }

    public final String component1() {
        return this.userId;
    }

    public final HatchSsoSourceApp component2() {
        return this.sourceApp;
    }

    public final String component3() {
        return this.accessToken;
    }

    public final boolean component4() {
        return this.isActive;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final HatchSsoSourceApp getSourceApp() {
        return this.sourceApp;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.accessToken, AnonymousClass005.A0F(this.sourceApp, AnonymousClass001.A0G(this.userId))), this.isActive);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public SsoCandidate(String str, HatchSsoSourceApp hatchSsoSourceApp, String str2, boolean z) {
        AnonymousClass005.A0x(str, hatchSsoSourceApp, str2);
        this.userId = str;
        this.sourceApp = hatchSsoSourceApp;
        this.accessToken = str2;
        this.isActive = z;
    }

    public final SsoCandidate copy(String str, HatchSsoSourceApp hatchSsoSourceApp, String str2, boolean z) {
        AnonymousClass005.A0x(str, hatchSsoSourceApp, str2);
        return new SsoCandidate(str, hatchSsoSourceApp, str2, z);
    }

    public String toString() {
        return super.toString();
    }
}
