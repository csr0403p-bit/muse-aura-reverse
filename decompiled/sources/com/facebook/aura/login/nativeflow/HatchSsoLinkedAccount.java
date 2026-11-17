package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchSsoLinkedAccount extends C06G {
    public final String displayName;
    public final String platform;
    public final String profilePicUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSsoLinkedAccount) {
                HatchSsoLinkedAccount hatchSsoLinkedAccount = (HatchSsoLinkedAccount) obj;
                if (!C7384Etj.areEqual(this.platform, hatchSsoLinkedAccount.platform) || !C7384Etj.areEqual(this.profilePicUrl, hatchSsoLinkedAccount.profilePicUrl) || !C7384Etj.areEqual(this.displayName, hatchSsoLinkedAccount.displayName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSsoLinkedAccount copy$default(HatchSsoLinkedAccount hatchSsoLinkedAccount, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSsoLinkedAccount.platform;
        }
        if ((i & 2) != 0) {
            str2 = hatchSsoLinkedAccount.profilePicUrl;
        }
        if ((i & 4) != 0) {
            str3 = hatchSsoLinkedAccount.displayName;
        }
        return new HatchSsoLinkedAccount(str, str2, str3);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.profilePicUrl;
    }

    public final String component3() {
        return this.displayName;
    }

    public final HatchSsoLinkedAccount copy(String str, String str2, String str3) {
        return new HatchSsoLinkedAccount(str, str2, str3);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getProfilePicUrl() {
        return this.profilePicUrl;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.platform) * 31) + AnonymousClass006.A0G(this.profilePicUrl)) * 31) + AnonymousClass005.A0H(this.displayName);
    }

    public HatchSsoLinkedAccount(String str, String str2, String str3) {
        this.platform = str;
        this.profilePicUrl = str2;
        this.displayName = str3;
    }

    public String toString() {
        return super.toString();
    }
}
