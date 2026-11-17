package com.facebook.aura.login.credentials;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class AuraRememberedLinkedAccount extends C06G {
    public final String platform;
    public final String profilePictureUrl;

    public AuraRememberedLinkedAccount(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        this.platform = str;
        this.profilePictureUrl = str2;
    }

    public final AuraRememberedLinkedAccount copy(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        return new AuraRememberedLinkedAccount(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraRememberedLinkedAccount) {
                AuraRememberedLinkedAccount auraRememberedLinkedAccount = (AuraRememberedLinkedAccount) obj;
                if (!C7384Etj.areEqual(this.platform, auraRememberedLinkedAccount.platform) || !C7384Etj.areEqual(this.profilePictureUrl, auraRememberedLinkedAccount.profilePictureUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraRememberedLinkedAccount copy$default(AuraRememberedLinkedAccount auraRememberedLinkedAccount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraRememberedLinkedAccount.platform;
        }
        if ((i & 2) != 0) {
            str2 = auraRememberedLinkedAccount.profilePictureUrl;
        }
        C7384Etj.A0Y(str2, 1);
        return new AuraRememberedLinkedAccount(str, str2);
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.profilePictureUrl;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.profilePictureUrl, AnonymousClass006.A0G(this.platform) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
