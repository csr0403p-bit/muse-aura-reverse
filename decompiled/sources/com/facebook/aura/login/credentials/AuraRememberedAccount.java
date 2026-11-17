package com.facebook.aura.login.credentials;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class AuraRememberedAccount extends C06G {
    public final String abraUserId;
    public final String contactPoint;
    public final int linkedAccountCount;
    public final List<AuraRememberedLinkedAccount> linkedAccounts;
    public final String metaAccountId;
    public final String name;
    public final String profilePictureUrl;
    public final String savedAccountId;
    public final String username;

    public final AuraRememberedAccount copy(String str, String str2, String str3, String str4, String str5, String str6, List<AuraRememberedLinkedAccount> list, int i, String str7) {
        AnonymousClass002.A1E(str, 0, list);
        return new AuraRememberedAccount(str, str2, str3, str4, str5, str6, list, i, str7);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraRememberedAccount) {
                AuraRememberedAccount auraRememberedAccount = (AuraRememberedAccount) obj;
                if (!C7384Etj.areEqual(this.abraUserId, auraRememberedAccount.abraUserId) || !C7384Etj.areEqual(this.metaAccountId, auraRememberedAccount.metaAccountId) || !C7384Etj.areEqual(this.contactPoint, auraRememberedAccount.contactPoint) || !C7384Etj.areEqual(this.name, auraRememberedAccount.name) || !C7384Etj.areEqual(this.username, auraRememberedAccount.username) || !C7384Etj.areEqual(this.profilePictureUrl, auraRememberedAccount.profilePictureUrl) || !C7384Etj.areEqual(this.linkedAccounts, auraRememberedAccount.linkedAccounts) || this.linkedAccountCount != auraRememberedAccount.linkedAccountCount || !C7384Etj.areEqual(this.savedAccountId, auraRememberedAccount.savedAccountId)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AuraRememberedAccount(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, String str7, int i2, C06H c06h) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? C0881AGi.A00 : list, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? null : str7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuraRememberedAccount copy$default(AuraRememberedAccount auraRememberedAccount, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = auraRememberedAccount.abraUserId;
        }
        if ((i2 & 2) != 0) {
            str2 = auraRememberedAccount.metaAccountId;
        }
        if ((i2 & 4) != 0) {
            str3 = auraRememberedAccount.contactPoint;
        }
        if ((i2 & 8) != 0) {
            str4 = auraRememberedAccount.name;
        }
        if ((i2 & 16) != 0) {
            str5 = auraRememberedAccount.username;
        }
        if ((i2 & 32) != 0) {
            str6 = auraRememberedAccount.profilePictureUrl;
        }
        if ((i2 & 64) != 0) {
            list = auraRememberedAccount.linkedAccounts;
        }
        if ((i2 & 128) != 0) {
            i = auraRememberedAccount.linkedAccountCount;
        }
        if ((i2 & 256) != 0) {
            str7 = auraRememberedAccount.savedAccountId;
        }
        return auraRememberedAccount.copy(str, str2, str3, str4, str5, str6, list, i, str7);
    }

    public final String component1() {
        return this.abraUserId;
    }

    public final String component2() {
        return this.metaAccountId;
    }

    public final String component3() {
        return this.contactPoint;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.username;
    }

    public final String component6() {
        return this.profilePictureUrl;
    }

    public final List<AuraRememberedLinkedAccount> component7() {
        return this.linkedAccounts;
    }

    public final int component8() {
        return this.linkedAccountCount;
    }

    public final String component9() {
        return this.savedAccountId;
    }

    public final String getAbraUserId() {
        return this.abraUserId;
    }

    public final String getContactPoint() {
        return this.contactPoint;
    }

    public final int getLinkedAccountCount() {
        return this.linkedAccountCount;
    }

    public final List<AuraRememberedLinkedAccount> getLinkedAccounts() {
        return this.linkedAccounts;
    }

    public final String getMetaAccountId() {
        return this.metaAccountId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final String getSavedAccountId() {
        return this.savedAccountId;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.linkedAccounts, (((((((((AnonymousClass001.A0G(this.abraUserId) + AnonymousClass006.A0G(this.metaAccountId)) * 31) + AnonymousClass006.A0G(this.contactPoint)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.username)) * 31) + AnonymousClass006.A0G(this.profilePictureUrl)) * 31) + this.linkedAccountCount) * 31) + AnonymousClass005.A0H(this.savedAccountId);
    }

    public String toString() {
        return super.toString();
    }

    public AuraRememberedAccount(String str, String str2, String str3, String str4, String str5, String str6, List<AuraRememberedLinkedAccount> list, int i, String str7) {
        AnonymousClass002.A1E(str, 0, list);
        this.abraUserId = str;
        this.metaAccountId = str2;
        this.contactPoint = str3;
        this.name = str4;
        this.username = str5;
        this.profilePictureUrl = str6;
        this.linkedAccounts = list;
        this.linkedAccountCount = i;
        this.savedAccountId = str7;
    }
}
