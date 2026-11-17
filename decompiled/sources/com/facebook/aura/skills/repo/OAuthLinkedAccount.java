package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class OAuthLinkedAccount extends C06G {
    public final String accountId;
    public final boolean connected;
    public final String profilePictureUrl;
    public final String username;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OAuthLinkedAccount) {
                OAuthLinkedAccount oAuthLinkedAccount = (OAuthLinkedAccount) obj;
                if (!C7384Etj.areEqual(this.accountId, oAuthLinkedAccount.accountId) || !C7384Etj.areEqual(this.username, oAuthLinkedAccount.username) || !C7384Etj.areEqual(this.profilePictureUrl, oAuthLinkedAccount.profilePictureUrl) || this.connected != oAuthLinkedAccount.connected) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OAuthLinkedAccount copy$default(OAuthLinkedAccount oAuthLinkedAccount, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oAuthLinkedAccount.accountId;
        }
        if ((i & 2) != 0) {
            str2 = oAuthLinkedAccount.username;
        }
        if ((i & 4) != 0) {
            str3 = oAuthLinkedAccount.profilePictureUrl;
        }
        if ((i & 8) != 0) {
            z = oAuthLinkedAccount.connected;
        }
        AnonymousClass003.A0u(str, str2);
        return new OAuthLinkedAccount(str, str2, str3, z);
    }

    public final String component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.profilePictureUrl;
    }

    public final boolean component4() {
        return this.connected;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0I(this.username, AnonymousClass001.A0G(this.accountId)) + AnonymousClass006.A0G(this.profilePictureUrl)) * 31, this.connected);
    }

    public OAuthLinkedAccount(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.accountId = str;
        this.username = str2;
        this.profilePictureUrl = str3;
        this.connected = z;
    }

    public final OAuthLinkedAccount copy(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new OAuthLinkedAccount(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }
}
