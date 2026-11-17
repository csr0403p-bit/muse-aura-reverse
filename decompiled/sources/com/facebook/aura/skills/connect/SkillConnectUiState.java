package com.facebook.aura.skills.connect;

import X.A3q;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.skills.connect.LinkedAccountsTitle;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import com.facebook.aura.skills.repo.OAuthLinkedAccountGroup;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class SkillConnectUiState extends C06G {
    public static final int $stable = 0;
    public final boolean compactAccounts;
    public final ConnectButtonState connectButtonState;
    public final boolean isFetchingAccounts;
    public final List<OAuthLinkedAccountGroup> linkedAccountGroups;
    public final List<OAuthLinkedAccount> linkedAccounts;
    public final LinkedAccountsTitle linkedAccountsTitle;
    public final boolean requiresAccountSelection;
    public final Set<String> selectedAccountIds;
    public final boolean showLinkUpsell;
    public final boolean showsLinkedAccountList;

    public final SkillConnectUiState copy(boolean z, boolean z2, boolean z3, List<OAuthLinkedAccount> list, List<OAuthLinkedAccountGroup> list2, Set<String> set, ConnectButtonState connectButtonState, boolean z4, LinkedAccountsTitle linkedAccountsTitle, boolean z5) {
        AnonymousClass002.A1C(list, 3, list2);
        AnonymousClass003.A0z(set, connectButtonState);
        C7384Etj.A0Y(linkedAccountsTitle, 8);
        return new SkillConnectUiState(z, z2, z3, list, list2, set, connectButtonState, z4, linkedAccountsTitle, z5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillConnectUiState) {
                SkillConnectUiState skillConnectUiState = (SkillConnectUiState) obj;
                if (this.compactAccounts != skillConnectUiState.compactAccounts || this.requiresAccountSelection != skillConnectUiState.requiresAccountSelection || this.isFetchingAccounts != skillConnectUiState.isFetchingAccounts || !C7384Etj.areEqual(this.linkedAccounts, skillConnectUiState.linkedAccounts) || !C7384Etj.areEqual(this.linkedAccountGroups, skillConnectUiState.linkedAccountGroups) || !C7384Etj.areEqual(this.selectedAccountIds, skillConnectUiState.selectedAccountIds) || this.connectButtonState != skillConnectUiState.connectButtonState || this.showLinkUpsell != skillConnectUiState.showLinkUpsell || !C7384Etj.areEqual(this.linkedAccountsTitle, skillConnectUiState.linkedAccountsTitle) || this.showsLinkedAccountList != skillConnectUiState.showsLinkedAccountList) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public SkillConnectUiState() {
        boolean z = false;
        this(z, z, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, 1023, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkillConnectUiState copy$default(SkillConnectUiState skillConnectUiState, boolean z, boolean z2, boolean z3, List list, List list2, Set set, ConnectButtonState connectButtonState, boolean z4, LinkedAccountsTitle linkedAccountsTitle, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = skillConnectUiState.compactAccounts;
        }
        if ((i & 2) != 0) {
            z2 = skillConnectUiState.requiresAccountSelection;
        }
        if ((i & 4) != 0) {
            z3 = skillConnectUiState.isFetchingAccounts;
        }
        if ((i & 8) != 0) {
            list = skillConnectUiState.linkedAccounts;
        }
        if ((i & 16) != 0) {
            list2 = skillConnectUiState.linkedAccountGroups;
        }
        if ((i & 32) != 0) {
            set = skillConnectUiState.selectedAccountIds;
        }
        if ((i & 64) != 0) {
            connectButtonState = skillConnectUiState.connectButtonState;
        }
        if ((i & 128) != 0) {
            z4 = skillConnectUiState.showLinkUpsell;
        }
        if ((i & 256) != 0) {
            linkedAccountsTitle = skillConnectUiState.linkedAccountsTitle;
        }
        if ((i & 512) != 0) {
            z5 = skillConnectUiState.showsLinkedAccountList;
        }
        return skillConnectUiState.copy(z, z2, z3, list, list2, set, connectButtonState, z4, linkedAccountsTitle, z5);
    }

    public final boolean component1() {
        return this.compactAccounts;
    }

    public final boolean component10() {
        return this.showsLinkedAccountList;
    }

    public final boolean component2() {
        return this.requiresAccountSelection;
    }

    public final boolean component3() {
        return this.isFetchingAccounts;
    }

    public final List<OAuthLinkedAccount> component4() {
        return this.linkedAccounts;
    }

    public final List<OAuthLinkedAccountGroup> component5() {
        return this.linkedAccountGroups;
    }

    public final Set<String> component6() {
        return this.selectedAccountIds;
    }

    public final ConnectButtonState component7() {
        return this.connectButtonState;
    }

    public final boolean component8() {
        return this.showLinkUpsell;
    }

    public final LinkedAccountsTitle component9() {
        return this.linkedAccountsTitle;
    }

    public final boolean getCompactAccounts() {
        return this.compactAccounts;
    }

    public final ConnectButtonState getConnectButtonState() {
        return this.connectButtonState;
    }

    public final List<OAuthLinkedAccountGroup> getLinkedAccountGroups() {
        return this.linkedAccountGroups;
    }

    public final List<OAuthLinkedAccount> getLinkedAccounts() {
        return this.linkedAccounts;
    }

    public final LinkedAccountsTitle getLinkedAccountsTitle() {
        return this.linkedAccountsTitle;
    }

    public final boolean getNeedsAccountToContinue() {
        return this.requiresAccountSelection && !this.isFetchingAccounts && this.linkedAccounts.isEmpty() && this.linkedAccountGroups.isEmpty();
    }

    public final boolean getRequiresAccountSelection() {
        return this.requiresAccountSelection;
    }

    public final Set<String> getSelectedAccountIds() {
        return this.selectedAccountIds;
    }

    public final boolean getShowLinkUpsell() {
        return this.showLinkUpsell;
    }

    public final boolean getShowsLinkedAccountList() {
        return this.showsLinkedAccountList;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.linkedAccountsTitle, C0KA.A01(AnonymousClass005.A0F(this.connectButtonState, AnonymousClass005.A0F(this.selectedAccountIds, AnonymousClass005.A0F(this.linkedAccountGroups, AnonymousClass005.A0F(this.linkedAccounts, C0KA.A01(C0KA.A01(C0KA.A02(this.compactAccounts), this.requiresAccountSelection), this.isFetchingAccounts))))), this.showLinkUpsell)), this.showsLinkedAccountList);
    }

    public final boolean isFetchingAccounts() {
        return this.isFetchingAccounts;
    }

    public String toString() {
        return super.toString();
    }

    public SkillConnectUiState(boolean z, boolean z2, boolean z3, List<OAuthLinkedAccount> list, List<OAuthLinkedAccountGroup> list2, Set<String> set, ConnectButtonState connectButtonState, boolean z4, LinkedAccountsTitle linkedAccountsTitle, boolean z5) {
        AnonymousClass002.A1C(list, 3, list2);
        AnonymousClass003.A0z(set, connectButtonState);
        C7384Etj.A0Y(linkedAccountsTitle, 8);
        this.compactAccounts = z;
        this.requiresAccountSelection = z2;
        this.isFetchingAccounts = z3;
        this.linkedAccounts = list;
        this.linkedAccountGroups = list2;
        this.selectedAccountIds = set;
        this.connectButtonState = connectButtonState;
        this.showLinkUpsell = z4;
        this.linkedAccountsTitle = linkedAccountsTitle;
        this.showsLinkedAccountList = z5;
    }

    public /* synthetic */ SkillConnectUiState(boolean z, boolean z2, boolean z3, List list, List list2, Set set, ConnectButtonState connectButtonState, boolean z4, LinkedAccountsTitle linkedAccountsTitle, boolean z5, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? C0881AGi.A00 : list2, (i & 32) != 0 ? A3q.A00 : set, (i & 64) != 0 ? ConnectButtonState.DISABLED : connectButtonState, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? LinkedAccountsTitle.None.INSTANCE : linkedAccountsTitle, C3cG.A1K(i & 512, z5));
    }
}
