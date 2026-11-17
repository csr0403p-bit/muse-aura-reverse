package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchAccountSelectionProfile extends C06G {
    public final String displayName;
    public final String platform;
    public final String profilePicUrl;

    public HatchAccountSelectionProfile(String str, String str2, String str3) {
        C7384Etj.A0Y(str2, 1);
        this.platform = str;
        this.displayName = str2;
        this.profilePicUrl = str3;
    }

    public final HatchAccountSelectionProfile copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str2, 1);
        return new HatchAccountSelectionProfile(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAccountSelectionProfile) {
                HatchAccountSelectionProfile hatchAccountSelectionProfile = (HatchAccountSelectionProfile) obj;
                if (!C7384Etj.areEqual(this.platform, hatchAccountSelectionProfile.platform) || !C7384Etj.areEqual(this.displayName, hatchAccountSelectionProfile.displayName) || !C7384Etj.areEqual(this.profilePicUrl, hatchAccountSelectionProfile.profilePicUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAccountSelectionProfile copy$default(HatchAccountSelectionProfile hatchAccountSelectionProfile, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAccountSelectionProfile.platform;
        }
        if ((i & 2) != 0) {
            str2 = hatchAccountSelectionProfile.displayName;
        }
        if ((i & 4) != 0) {
            str3 = hatchAccountSelectionProfile.profilePicUrl;
        }
        return hatchAccountSelectionProfile.copy(str, str2, str3);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.profilePicUrl;
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
        return AnonymousClass005.A0I(this.displayName, AnonymousClass006.A0G(this.platform) * 31) + AnonymousClass005.A0H(this.profilePicUrl);
    }

    public String toString() {
        return super.toString();
    }
}
