package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class FirstPartyConnectorConfig extends C06G {
    public final AccountIdentity accountIdentity;
    public final boolean canManageAccountSelection;
    public final boolean compactLinkedAccounts;
    public final String connectPath;
    public final String disconnectPath;
    public final String displayName;
    public final String id;
    public final boolean isAccountsCenterManaged;
    public final boolean requiresLinkedAccountSelection;
    public final boolean showsLinkedAccountsOnConnect;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FirstPartyConnectorConfig) {
                FirstPartyConnectorConfig firstPartyConnectorConfig = (FirstPartyConnectorConfig) obj;
                if (!C7384Etj.areEqual(this.id, firstPartyConnectorConfig.id) || !C7384Etj.areEqual(this.displayName, firstPartyConnectorConfig.displayName) || this.requiresLinkedAccountSelection != firstPartyConnectorConfig.requiresLinkedAccountSelection || this.isAccountsCenterManaged != firstPartyConnectorConfig.isAccountsCenterManaged || this.accountIdentity != firstPartyConnectorConfig.accountIdentity || !C7384Etj.areEqual(this.connectPath, firstPartyConnectorConfig.connectPath) || !C7384Etj.areEqual(this.disconnectPath, firstPartyConnectorConfig.disconnectPath) || this.canManageAccountSelection != firstPartyConnectorConfig.canManageAccountSelection || this.showsLinkedAccountsOnConnect != firstPartyConnectorConfig.showsLinkedAccountsOnConnect || this.compactLinkedAccounts != firstPartyConnectorConfig.compactLinkedAccounts) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FirstPartyConnectorConfig copy$default(FirstPartyConnectorConfig firstPartyConnectorConfig, String str, String str2, boolean z, boolean z2, AccountIdentity accountIdentity, String str3, String str4, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firstPartyConnectorConfig.id;
        }
        if ((i & 2) != 0) {
            str2 = firstPartyConnectorConfig.displayName;
        }
        if ((i & 4) != 0) {
            z = firstPartyConnectorConfig.requiresLinkedAccountSelection;
        }
        if ((i & 8) != 0) {
            z2 = firstPartyConnectorConfig.isAccountsCenterManaged;
        }
        if ((i & 16) != 0) {
            accountIdentity = firstPartyConnectorConfig.accountIdentity;
        }
        if ((i & 32) != 0) {
            str3 = firstPartyConnectorConfig.connectPath;
        }
        if ((i & 64) != 0) {
            str4 = firstPartyConnectorConfig.disconnectPath;
        }
        if ((i & 128) != 0) {
            z3 = firstPartyConnectorConfig.canManageAccountSelection;
        }
        if ((i & 256) != 0) {
            z4 = firstPartyConnectorConfig.showsLinkedAccountsOnConnect;
        }
        if ((i & 512) != 0) {
            z5 = firstPartyConnectorConfig.compactLinkedAccounts;
        }
        return firstPartyConnectorConfig.copy(str, str2, z, z2, accountIdentity, str3, str4, z3, z4, z5);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.compactLinkedAccounts;
    }

    public final String component2() {
        return this.displayName;
    }

    public final boolean component3() {
        return this.requiresLinkedAccountSelection;
    }

    public final boolean component4() {
        return this.isAccountsCenterManaged;
    }

    public final AccountIdentity component5() {
        return this.accountIdentity;
    }

    public final String component6() {
        return this.connectPath;
    }

    public final String component7() {
        return this.disconnectPath;
    }

    public final boolean component8() {
        return this.canManageAccountSelection;
    }

    public final boolean component9() {
        return this.showsLinkedAccountsOnConnect;
    }

    public final AccountIdentity getAccountIdentity() {
        return this.accountIdentity;
    }

    public final boolean getCanManageAccountSelection() {
        return this.canManageAccountSelection;
    }

    public final boolean getCompactLinkedAccounts() {
        return this.compactLinkedAccounts;
    }

    public final String getConnectPath() {
        return this.connectPath;
    }

    public final String getDisconnectPath() {
        return this.disconnectPath;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getRequiresLinkedAccountSelection() {
        return this.requiresLinkedAccountSelection;
    }

    public final boolean getShowsLinkedAccounts() {
        return this.isAccountsCenterManaged || this.canManageAccountSelection || this.requiresLinkedAccountSelection;
    }

    public final boolean getShowsLinkedAccountsOnConnect() {
        return this.showsLinkedAccountsOnConnect;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.disconnectPath, AnonymousClass005.A0I(this.connectPath, AnonymousClass005.A0F(this.accountIdentity, C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.id)), this.requiresLinkedAccountSelection), this.isAccountsCenterManaged)))), this.canManageAccountSelection), this.showsLinkedAccountsOnConnect), this.compactLinkedAccounts);
    }

    public final boolean isAccountsCenterManaged() {
        return this.isAccountsCenterManaged;
    }

    public FirstPartyConnectorConfig(String str, String str2, boolean z, boolean z2, AccountIdentity accountIdentity, String str3, String str4, boolean z3, boolean z4, boolean z5) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(accountIdentity, 4);
        AnonymousClass003.A0z(str3, str4);
        this.id = str;
        this.displayName = str2;
        this.requiresLinkedAccountSelection = z;
        this.isAccountsCenterManaged = z2;
        this.accountIdentity = accountIdentity;
        this.connectPath = str3;
        this.disconnectPath = str4;
        this.canManageAccountSelection = z3;
        this.showsLinkedAccountsOnConnect = z4;
        this.compactLinkedAccounts = z5;
    }

    public final FirstPartyConnectorConfig copy(String str, String str2, boolean z, boolean z2, AccountIdentity accountIdentity, String str3, String str4, boolean z3, boolean z4, boolean z5) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(accountIdentity, 4);
        AnonymousClass003.A0z(str3, str4);
        return new FirstPartyConnectorConfig(str, str2, z, z2, accountIdentity, str3, str4, z3, z4, z5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FirstPartyConnectorConfig(String str, String str2, boolean z, boolean z2, AccountIdentity accountIdentity, String str3, String str4, boolean z3, boolean z4, boolean z5, int i, C06H c06h) {
        this(str, str2, z, z2, accountIdentity, str3, str4, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? z : z4, C3cG.A1K(i & 512, z5));
    }
}
