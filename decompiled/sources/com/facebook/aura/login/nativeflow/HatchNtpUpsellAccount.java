package com.facebook.aura.login.nativeflow;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchNtpUpsellAccount extends C06G {
    public final String displayLabel;
    public final String displayName;
    public final List<HatchSsoLinkedAccount> linkedAccounts;
    public final String profilePicUrl;
    public final String sourceApp;

    public HatchNtpUpsellAccount(String str, String str2, String str3, List<HatchSsoLinkedAccount> list, String str4) {
        AnonymousClass002.A1B(str2, 1, list);
        this.sourceApp = str;
        this.displayLabel = str2;
        this.profilePicUrl = str3;
        this.linkedAccounts = list;
        this.displayName = str4;
    }

    public final HatchNtpUpsellAccount copy(String str, String str2, String str3, List<HatchSsoLinkedAccount> list, String str4) {
        AnonymousClass002.A1B(str2, 1, list);
        return new HatchNtpUpsellAccount(str, str2, str3, list, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNtpUpsellAccount) {
                HatchNtpUpsellAccount hatchNtpUpsellAccount = (HatchNtpUpsellAccount) obj;
                if (!C7384Etj.areEqual(this.sourceApp, hatchNtpUpsellAccount.sourceApp) || !C7384Etj.areEqual(this.displayLabel, hatchNtpUpsellAccount.displayLabel) || !C7384Etj.areEqual(this.profilePicUrl, hatchNtpUpsellAccount.profilePicUrl) || !C7384Etj.areEqual(this.linkedAccounts, hatchNtpUpsellAccount.linkedAccounts) || !C7384Etj.areEqual(this.displayName, hatchNtpUpsellAccount.displayName)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchNtpUpsellAccount copy$default(HatchNtpUpsellAccount hatchNtpUpsellAccount, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchNtpUpsellAccount.sourceApp;
        }
        if ((i & 2) != 0) {
            str2 = hatchNtpUpsellAccount.displayLabel;
        }
        if ((i & 4) != 0) {
            str3 = hatchNtpUpsellAccount.profilePicUrl;
        }
        if ((i & 8) != 0) {
            list = hatchNtpUpsellAccount.linkedAccounts;
        }
        if ((i & 16) != 0) {
            str4 = hatchNtpUpsellAccount.displayName;
        }
        return hatchNtpUpsellAccount.copy(str, str2, str3, list, str4);
    }

    public final String component1() {
        return this.sourceApp;
    }

    public final String component2() {
        return this.displayLabel;
    }

    public final String component3() {
        return this.profilePicUrl;
    }

    public final List<HatchSsoLinkedAccount> component4() {
        return this.linkedAccounts;
    }

    public final String component5() {
        return this.displayName;
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<HatchSsoLinkedAccount> getLinkedAccounts() {
        return this.linkedAccounts;
    }

    public final String getProfilePicUrl() {
        return this.profilePicUrl;
    }

    public final String getSourceApp() {
        return this.sourceApp;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.linkedAccounts, (AnonymousClass005.A0I(this.displayLabel, AnonymousClass006.A0G(this.sourceApp) * 31) + AnonymousClass006.A0G(this.profilePicUrl)) * 31) + AnonymousClass005.A0H(this.displayName);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchNtpUpsellAccount(String str, String str2, String str3, List list, String str4, int i, C06H c06h) {
        this(str, str2, str3, list, (i & 16) != 0 ? null : str4);
    }
}
