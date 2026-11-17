package com.facebook.aura.skills.viewmodel;

import X.A3q;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class SkillAccountsUiState extends C06G {
    public final SkillAccountsAction accountAction;
    public final SkillLinkedAccountUiModel accountPendingRemoval;
    public final String accountsCenterFootnoteDisplayName;
    public final List<OAuthLinkedAccount> allLinkedAccounts;
    public final boolean hasLinkedAccounts;
    public final boolean hasMultipleLinkedAccounts;
    public final boolean isLoading;
    public final boolean isRemovingAccount;
    public final boolean isUpdating;
    public final List<SkillLinkedAccountUiModel> linkedAccounts;
    public final Set<String> savedAccountIds;
    public final Set<String> selectedAccountIds;
    public final boolean shouldShowAccountsSection;

    /* JADX WARN: Illegal instructions before constructor call */
    public SkillAccountsUiState() {
        C0881AGi c0881AGi = C0881AGi.A00;
        A3q a3q = A3q.A00;
        this(false, false, c0881AGi, c0881AGi, a3q, a3q, false, false, false, null, SkillAccountsAction.NONE, null, false);
    }

    public final SkillAccountsUiState copy(boolean z, boolean z2, List<SkillLinkedAccountUiModel> list, List<OAuthLinkedAccount> list2, Set<String> set, Set<String> set2, boolean z3, boolean z4, boolean z5, String str, SkillAccountsAction skillAccountsAction, SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z6) {
        AnonymousClass005.A16(list, list2, set, set2, 2);
        C7384Etj.A0Y(skillAccountsAction, 10);
        return new SkillAccountsUiState(z, z2, list, list2, set, set2, z3, z4, z5, str, skillAccountsAction, skillLinkedAccountUiModel, z6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillAccountsUiState) {
                SkillAccountsUiState skillAccountsUiState = (SkillAccountsUiState) obj;
                if (this.isLoading != skillAccountsUiState.isLoading || this.isUpdating != skillAccountsUiState.isUpdating || !C7384Etj.areEqual(this.linkedAccounts, skillAccountsUiState.linkedAccounts) || !C7384Etj.areEqual(this.allLinkedAccounts, skillAccountsUiState.allLinkedAccounts) || !C7384Etj.areEqual(this.selectedAccountIds, skillAccountsUiState.selectedAccountIds) || !C7384Etj.areEqual(this.savedAccountIds, skillAccountsUiState.savedAccountIds) || this.hasLinkedAccounts != skillAccountsUiState.hasLinkedAccounts || this.hasMultipleLinkedAccounts != skillAccountsUiState.hasMultipleLinkedAccounts || this.shouldShowAccountsSection != skillAccountsUiState.shouldShowAccountsSection || !C7384Etj.areEqual(this.accountsCenterFootnoteDisplayName, skillAccountsUiState.accountsCenterFootnoteDisplayName) || this.accountAction != skillAccountsUiState.accountAction || !C7384Etj.areEqual(this.accountPendingRemoval, skillAccountsUiState.accountPendingRemoval) || this.isRemovingAccount != skillAccountsUiState.isRemovingAccount) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkillAccountsUiState copy$default(SkillAccountsUiState skillAccountsUiState, boolean z, boolean z2, List list, List list2, Set set, Set set2, boolean z3, boolean z4, boolean z5, String str, SkillAccountsAction skillAccountsAction, SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = skillAccountsUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = skillAccountsUiState.isUpdating;
        }
        if ((i & 4) != 0) {
            list = skillAccountsUiState.linkedAccounts;
        }
        if ((i & 8) != 0) {
            list2 = skillAccountsUiState.allLinkedAccounts;
        }
        if ((i & 16) != 0) {
            set = skillAccountsUiState.selectedAccountIds;
        }
        if ((i & 32) != 0) {
            set2 = skillAccountsUiState.savedAccountIds;
        }
        if ((i & 64) != 0) {
            z3 = skillAccountsUiState.hasLinkedAccounts;
        }
        if ((i & 128) != 0) {
            z4 = skillAccountsUiState.hasMultipleLinkedAccounts;
        }
        if ((i & 256) != 0) {
            z5 = skillAccountsUiState.shouldShowAccountsSection;
        }
        if ((i & 512) != 0) {
            str = skillAccountsUiState.accountsCenterFootnoteDisplayName;
        }
        if ((i & 1024) != 0) {
            skillAccountsAction = skillAccountsUiState.accountAction;
        }
        if ((i & 2048) != 0) {
            skillLinkedAccountUiModel = skillAccountsUiState.accountPendingRemoval;
        }
        if ((i & 4096) != 0) {
            z6 = skillAccountsUiState.isRemovingAccount;
        }
        return skillAccountsUiState.copy(z, z2, list, list2, set, set2, z3, z4, z5, str, skillAccountsAction, skillLinkedAccountUiModel, z6);
    }

    public final boolean component1() {
        return this.isLoading;
    }

    public final String component10() {
        return this.accountsCenterFootnoteDisplayName;
    }

    public final SkillAccountsAction component11() {
        return this.accountAction;
    }

    public final SkillLinkedAccountUiModel component12() {
        return this.accountPendingRemoval;
    }

    public final boolean component13() {
        return this.isRemovingAccount;
    }

    public final boolean component2() {
        return this.isUpdating;
    }

    public final List<SkillLinkedAccountUiModel> component3() {
        return this.linkedAccounts;
    }

    public final List<OAuthLinkedAccount> component4() {
        return this.allLinkedAccounts;
    }

    public final Set<String> component5() {
        return this.selectedAccountIds;
    }

    public final Set<String> component6() {
        return this.savedAccountIds;
    }

    public final boolean component7() {
        return this.hasLinkedAccounts;
    }

    public final boolean component8() {
        return this.hasMultipleLinkedAccounts;
    }

    public final boolean component9() {
        return this.shouldShowAccountsSection;
    }

    public final SkillAccountsAction getAccountAction() {
        return this.accountAction;
    }

    public final SkillLinkedAccountUiModel getAccountPendingRemoval() {
        return this.accountPendingRemoval;
    }

    public final String getAccountsCenterFootnoteDisplayName() {
        return this.accountsCenterFootnoteDisplayName;
    }

    public final List<OAuthLinkedAccount> getAllLinkedAccounts() {
        return this.allLinkedAccounts;
    }

    public final boolean getCanUpdateAccountSelection() {
        return (this.isLoading || this.isUpdating || this.selectedAccountIds.isEmpty() || C7384Etj.areEqual(this.selectedAccountIds, this.savedAccountIds)) ? false : true;
    }

    public final boolean getHasLinkedAccounts() {
        return this.hasLinkedAccounts;
    }

    public final boolean getHasMultipleLinkedAccounts() {
        return this.hasMultipleLinkedAccounts;
    }

    public final List<SkillLinkedAccountUiModel> getLinkedAccounts() {
        return this.linkedAccounts;
    }

    public final Set<String> getSavedAccountIds() {
        return this.savedAccountIds;
    }

    public final Set<String> getSelectedAccountIds() {
        return this.selectedAccountIds;
    }

    public final boolean getShouldShowAccountsSection() {
        return this.shouldShowAccountsSection;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.accountAction, (C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.savedAccountIds, AnonymousClass005.A0F(this.selectedAccountIds, AnonymousClass005.A0F(this.allLinkedAccounts, AnonymousClass005.A0F(this.linkedAccounts, C0KA.A01(C0KA.A02(this.isLoading), this.isUpdating))))), this.hasLinkedAccounts), this.hasMultipleLinkedAccounts), this.shouldShowAccountsSection) + AnonymousClass006.A0G(this.accountsCenterFootnoteDisplayName)) * 31) + C3cH.A02(this.accountPendingRemoval)) * 31, this.isRemovingAccount);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRemovingAccount() {
        return this.isRemovingAccount;
    }

    public final boolean isUpdating() {
        return this.isUpdating;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillAccountsUiState(boolean z, boolean z2, List list, List list2, Set set, Set set2, boolean z3, boolean z4, boolean z5, String str, SkillAccountsAction skillAccountsAction, SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z6, int i, C06H c06h) {
        this(C3cG.A1K(i & 1, z), C3cG.A1K(i & 2, z2), (i & 4) != 0 ? C0881AGi.A00 : list, (i & 8) != 0 ? C0881AGi.A00 : list2, (i & 16) != 0 ? A3q.A00 : set, (i & 32) != 0 ? A3q.A00 : set2, C3cH.A1M(i, z3), C3cH.A1N(i, z4), C3cG.A1K(i & 256, z5), (i & 512) != 0 ? null : str, (i & 1024) != 0 ? SkillAccountsAction.NONE : skillAccountsAction, (i & 2048) == 0 ? skillLinkedAccountUiModel : null, C3cG.A1K(i & 4096, z6));
    }

    public SkillAccountsUiState(boolean z, boolean z2, List<SkillLinkedAccountUiModel> list, List<OAuthLinkedAccount> list2, Set<String> set, Set<String> set2, boolean z3, boolean z4, boolean z5, String str, SkillAccountsAction skillAccountsAction, SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z6) {
        AnonymousClass005.A16(list, list2, set, set2, 2);
        C7384Etj.A0Y(skillAccountsAction, 10);
        this.isLoading = z;
        this.isUpdating = z2;
        this.linkedAccounts = list;
        this.allLinkedAccounts = list2;
        this.selectedAccountIds = set;
        this.savedAccountIds = set2;
        this.hasLinkedAccounts = z3;
        this.hasMultipleLinkedAccounts = z4;
        this.shouldShowAccountsSection = z5;
        this.accountsCenterFootnoteDisplayName = str;
        this.accountAction = skillAccountsAction;
        this.accountPendingRemoval = skillLinkedAccountUiModel;
        this.isRemovingAccount = z6;
    }
}
