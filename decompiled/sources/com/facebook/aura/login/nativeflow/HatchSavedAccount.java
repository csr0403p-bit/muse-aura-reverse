package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchSavedAccount extends C06G {
    public final String accountCuid;
    public final String displayLabel;
    public final boolean isEmail;
    public final HatchMuseProfile museProfile;
    public final String savedAccountId;
    public final boolean usesDbl;

    public static /* synthetic */ HatchSavedAccount copy$default(HatchSavedAccount hatchSavedAccount, String str, String str2, boolean z, String str3, boolean z2, HatchMuseProfile hatchMuseProfile, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        boolean z3 = z;
        String str6 = str3;
        boolean z4 = z2;
        HatchMuseProfile hatchMuseProfile2 = hatchMuseProfile;
        if ((i & 1) != 0) {
            str4 = hatchSavedAccount.savedAccountId;
        }
        if ((i & 2) != 0) {
            str5 = hatchSavedAccount.accountCuid;
        }
        if ((i & 4) != 0) {
            z3 = hatchSavedAccount.usesDbl;
        }
        if ((i & 8) != 0) {
            str6 = hatchSavedAccount.displayLabel;
        }
        if ((i & 16) != 0) {
            z4 = hatchSavedAccount.isEmail;
        }
        if ((i & 32) != 0) {
            hatchMuseProfile2 = hatchSavedAccount.museProfile;
        }
        AnonymousClass005.A0y(str4, str5, str6);
        return new HatchSavedAccount(str4, str5, z3, str6, z4, hatchMuseProfile2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSavedAccount) {
                HatchSavedAccount hatchSavedAccount = (HatchSavedAccount) obj;
                if (!C7384Etj.areEqual(this.savedAccountId, hatchSavedAccount.savedAccountId) || !C7384Etj.areEqual(this.accountCuid, hatchSavedAccount.accountCuid) || this.usesDbl != hatchSavedAccount.usesDbl || !C7384Etj.areEqual(this.displayLabel, hatchSavedAccount.displayLabel) || this.isEmail != hatchSavedAccount.isEmail || !C7384Etj.areEqual(this.museProfile, hatchSavedAccount.museProfile)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchSavedAccount(String str, String str2, boolean z, String str3, boolean z2, HatchMuseProfile hatchMuseProfile, int i, C06H c06h) {
        this(str, str2, z, (i & 8) != 0 ? "" : str3, C3cI.A1S(i, z2), (i & 32) != 0 ? null : hatchMuseProfile);
    }

    public final String component1() {
        return this.savedAccountId;
    }

    public final String component2() {
        return this.accountCuid;
    }

    public final boolean component3() {
        return this.usesDbl;
    }

    public final String component4() {
        return this.displayLabel;
    }

    public final boolean component5() {
        return this.isEmail;
    }

    public final HatchMuseProfile component6() {
        return this.museProfile;
    }

    public final String getAccountCuid() {
        return this.accountCuid;
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final HatchMuseProfile getMuseProfile() {
        return this.museProfile;
    }

    public final String getSavedAccountId() {
        return this.savedAccountId;
    }

    public final boolean getUsesDbl() {
        return this.usesDbl;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0I(this.displayLabel, C0KA.A01(AnonymousClass005.A0I(this.accountCuid, AnonymousClass001.A0G(this.savedAccountId)), this.usesDbl)), this.isEmail) + AnonymousClass006.A0D(this.museProfile);
    }

    public final boolean isEmail() {
        return this.isEmail;
    }

    public final HatchSavedAccount copy(String str, String str2, boolean z, String str3, boolean z2, HatchMuseProfile hatchMuseProfile) {
        AnonymousClass005.A0y(str, str2, str3);
        return new HatchSavedAccount(str, str2, z, str3, z2, hatchMuseProfile);
    }

    public String toString() {
        return super.toString();
    }

    public HatchSavedAccount(String str, String str2, boolean z, String str3, boolean z2, HatchMuseProfile hatchMuseProfile) {
        AnonymousClass005.A0y(str, str2, str3);
        this.savedAccountId = str;
        this.accountCuid = str2;
        this.usesDbl = z;
        this.displayLabel = str3;
        this.isEmail = z2;
        this.museProfile = hatchMuseProfile;
    }
}
