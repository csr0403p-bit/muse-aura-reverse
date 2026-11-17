package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class NativeLoginSsoAccount extends C06G {
    public final String accessToken;
    public final HatchSsoSourceApp sourceApp;
    public final String userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginSsoAccount) {
                NativeLoginSsoAccount nativeLoginSsoAccount = (NativeLoginSsoAccount) obj;
                if (!C7384Etj.areEqual(this.userId, nativeLoginSsoAccount.userId) || this.sourceApp != nativeLoginSsoAccount.sourceApp || !C7384Etj.areEqual(this.accessToken, nativeLoginSsoAccount.accessToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginSsoAccount copy$default(NativeLoginSsoAccount nativeLoginSsoAccount, String str, HatchSsoSourceApp hatchSsoSourceApp, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeLoginSsoAccount.userId;
        }
        if ((i & 2) != 0) {
            hatchSsoSourceApp = nativeLoginSsoAccount.sourceApp;
        }
        if ((i & 4) != 0) {
            str2 = nativeLoginSsoAccount.accessToken;
        }
        return nativeLoginSsoAccount.copy(str, hatchSsoSourceApp, str2);
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
        return AnonymousClass001.A0H(this.accessToken, AnonymousClass005.A0F(this.sourceApp, AnonymousClass001.A0G(this.userId)));
    }

    public NativeLoginSsoAccount(String str, HatchSsoSourceApp hatchSsoSourceApp, String str2) {
        AnonymousClass005.A0x(str, hatchSsoSourceApp, str2);
        this.userId = str;
        this.sourceApp = hatchSsoSourceApp;
        this.accessToken = str2;
    }

    public final NativeLoginSsoAccount copy(String str, HatchSsoSourceApp hatchSsoSourceApp, String str2) {
        AnonymousClass005.A0x(str, hatchSsoSourceApp, str2);
        return new NativeLoginSsoAccount(str, hatchSsoSourceApp, str2);
    }

    public String toString() {
        return super.toString();
    }
}
