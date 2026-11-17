package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectorLinkedAccount extends C06G {
    public final String accountId;
    public final boolean connected;
    public final String displayName;
    public final boolean isDefault;
    public final boolean needsReauth;
    public final String profilePictureUrl;

    public static /* synthetic */ ConnectorLinkedAccount copy$default(ConnectorLinkedAccount connectorLinkedAccount, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i & 1) != 0) {
            str4 = connectorLinkedAccount.accountId;
        }
        if ((i & 2) != 0) {
            str5 = connectorLinkedAccount.displayName;
        }
        if ((i & 4) != 0) {
            str6 = connectorLinkedAccount.profilePictureUrl;
        }
        if ((i & 8) != 0) {
            z4 = connectorLinkedAccount.connected;
        }
        if ((i & 16) != 0) {
            z5 = connectorLinkedAccount.isDefault;
        }
        if ((i & 32) != 0) {
            z6 = connectorLinkedAccount.needsReauth;
        }
        AnonymousClass003.A0u(str4, str5);
        return new ConnectorLinkedAccount(str4, str5, str6, z4, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorLinkedAccount) {
                ConnectorLinkedAccount connectorLinkedAccount = (ConnectorLinkedAccount) obj;
                if (!C7384Etj.areEqual(this.accountId, connectorLinkedAccount.accountId) || !C7384Etj.areEqual(this.displayName, connectorLinkedAccount.displayName) || !C7384Etj.areEqual(this.profilePictureUrl, connectorLinkedAccount.profilePictureUrl) || this.connected != connectorLinkedAccount.connected || this.isDefault != connectorLinkedAccount.isDefault || this.needsReauth != connectorLinkedAccount.needsReauth) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.profilePictureUrl;
    }

    public final boolean component4() {
        return this.connected;
    }

    public final boolean component5() {
        return this.isDefault;
    }

    public final boolean component6() {
        return this.needsReauth;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getNeedsReauth() {
        return this.needsReauth;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01((AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.accountId)) + AnonymousClass006.A0G(this.profilePictureUrl)) * 31, this.connected), this.isDefault), this.needsReauth);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public ConnectorLinkedAccount(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        this.accountId = str;
        this.displayName = str2;
        this.profilePictureUrl = str3;
        this.connected = z;
        this.isDefault = z2;
        this.needsReauth = z3;
    }

    public final ConnectorLinkedAccount copy(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        return new ConnectorLinkedAccount(str, str2, str3, z, z2, z3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorLinkedAccount(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this(str, str2, str3, z, z2, AnonymousClass002.A1R(i, z3));
    }
}
