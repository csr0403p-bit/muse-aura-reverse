package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C78N;
import X.G0W;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$3$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ OAuthLinkedAccount $account;
    public final /* synthetic */ C1BO<SkillAccountsUiState> $uiState$delegate;
    public final /* synthetic */ SkillLinkedAccountsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$3$1$1$1$1$1(OAuthLinkedAccount oAuthLinkedAccount, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, C1BO<SkillAccountsUiState> c1bo) {
        super(3);
        this.$account = oAuthLinkedAccount;
        this.$viewModel = skillLinkedAccountsViewModel;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            OAuthLinkedAccount oAuthLinkedAccount = this.$account;
            String str = oAuthLinkedAccount.username;
            String str2 = oAuthLinkedAccount.profilePictureUrl;
            boolean zContains = this.$uiState$delegate.getValue().selectedAccountIds.contains(this.$account.accountId);
            boolean z = !this.$uiState$delegate.getValue().isUpdating;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$account, bfm.A67(this.$viewModel));
            SkillLinkedAccountsViewModel skillLinkedAccountsViewModel = this.$viewModel;
            OAuthLinkedAccount oAuthLinkedAccount2 = this.$account;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$3$1$1$1$1$1$1$1(skillLinkedAccountsViewModel, oAuthLinkedAccount2);
                bfm.Ai0(objAaT);
            }
            SkillConnectBottomSheetKt.LinkedAccountRow(str, str2, zContains, z, (Function0) objAaT, null, false, bfm, 0, 96);
            return;
        }
        bfm.Afo();
    }
}
