package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchTwoFactorMetaAccount extends C06G {
    public final String displayLabel;
    public final List<HatchSsoLinkedAccount> linkedAccounts;

    public HatchTwoFactorMetaAccount(String str, List<HatchSsoLinkedAccount> list) {
        C7384Etj.A0Y(list, 1);
        this.displayLabel = str;
        this.linkedAccounts = list;
    }

    public final HatchTwoFactorMetaAccount copy(String str, List<HatchSsoLinkedAccount> list) {
        C7384Etj.A0Y(list, 1);
        return new HatchTwoFactorMetaAccount(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTwoFactorMetaAccount) {
                HatchTwoFactorMetaAccount hatchTwoFactorMetaAccount = (HatchTwoFactorMetaAccount) obj;
                if (!C7384Etj.areEqual(this.displayLabel, hatchTwoFactorMetaAccount.displayLabel) || !C7384Etj.areEqual(this.linkedAccounts, hatchTwoFactorMetaAccount.linkedAccounts)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTwoFactorMetaAccount copy$default(HatchTwoFactorMetaAccount hatchTwoFactorMetaAccount, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTwoFactorMetaAccount.displayLabel;
        }
        if ((i & 2) != 0) {
            list = hatchTwoFactorMetaAccount.linkedAccounts;
        }
        C7384Etj.A0Y(list, 1);
        return new HatchTwoFactorMetaAccount(str, list);
    }

    public final String component1() {
        return this.displayLabel;
    }

    public final List<HatchSsoLinkedAccount> component2() {
        return this.linkedAccounts;
    }

    public final String getDisplayLabel() {
        return this.displayLabel;
    }

    public final List<HatchSsoLinkedAccount> getLinkedAccounts() {
        return this.linkedAccounts;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.linkedAccounts, AnonymousClass006.A0G(this.displayLabel) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
