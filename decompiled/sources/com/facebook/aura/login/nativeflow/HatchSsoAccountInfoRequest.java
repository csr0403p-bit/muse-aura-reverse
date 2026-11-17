package com.facebook.aura.login.nativeflow;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchSsoAccountInfoRequest extends C06G {
    public final String accessToken;
    public final String ref;
    public final HatchSsoSourceApp sourceApp;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSsoAccountInfoRequest) {
                HatchSsoAccountInfoRequest hatchSsoAccountInfoRequest = (HatchSsoAccountInfoRequest) obj;
                if (this.sourceApp != hatchSsoAccountInfoRequest.sourceApp || !C7384Etj.areEqual(this.accessToken, hatchSsoAccountInfoRequest.accessToken) || !C7384Etj.areEqual(this.ref, hatchSsoAccountInfoRequest.ref)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSsoAccountInfoRequest copy$default(HatchSsoAccountInfoRequest hatchSsoAccountInfoRequest, HatchSsoSourceApp hatchSsoSourceApp, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSsoSourceApp = hatchSsoAccountInfoRequest.sourceApp;
        }
        if ((i & 2) != 0) {
            str = hatchSsoAccountInfoRequest.accessToken;
        }
        if ((i & 4) != 0) {
            str2 = hatchSsoAccountInfoRequest.ref;
        }
        return hatchSsoAccountInfoRequest.copy(hatchSsoSourceApp, str, str2);
    }

    public final HatchSsoSourceApp component1() {
        return this.sourceApp;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final String component3() {
        return this.ref;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRef() {
        return this.ref;
    }

    public final HatchSsoSourceApp getSourceApp() {
        return this.sourceApp;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.accessToken, AnonymousClass005.A0E(this.sourceApp)) + AnonymousClass006.A0G(this.ref);
    }

    public HatchSsoAccountInfoRequest(HatchSsoSourceApp hatchSsoSourceApp, String str, String str2) {
        AnonymousClass003.A0u(hatchSsoSourceApp, str);
        this.sourceApp = hatchSsoSourceApp;
        this.accessToken = str;
        this.ref = str2;
    }

    public final HatchSsoAccountInfoRequest copy(HatchSsoSourceApp hatchSsoSourceApp, String str, String str2) {
        AnonymousClass003.A0u(hatchSsoSourceApp, str);
        return new HatchSsoAccountInfoRequest(hatchSsoSourceApp, str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSsoAccountInfoRequest(HatchSsoSourceApp hatchSsoSourceApp, String str, String str2, int i, C06H c06h) {
        this(hatchSsoSourceApp, str, AnonymousClass006.A0t(i, str2));
    }
}
