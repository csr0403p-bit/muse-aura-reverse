package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$3$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ C1BO<SkillAccountsUiState> $uiState$delegate;
    public final /* synthetic */ SkillLinkedAccountsViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        G0W<C07C, BFM, Integer, Unit> g0w;
        C7384Etj.A0Y(hatchSectionScope, 0);
        if (this.$uiState$delegate.getValue().isLoading) {
            g0w = ComposableSingletons$SkillManageAccountsBottomSheetKt.lambda$422922550;
        } else {
            if (!this.$uiState$delegate.getValue().allLinkedAccounts.isEmpty()) {
                List<OAuthLinkedAccount> list = this.$uiState$delegate.getValue().allLinkedAccounts;
                SkillLinkedAccountsViewModel skillLinkedAccountsViewModel = this.$viewModel;
                C1BO<SkillAccountsUiState> c1bo = this.$uiState$delegate;
                Iterator<OAuthLinkedAccount> it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass006.A1E(hatchSectionScope, new SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$3$1$1$1$1$1(it.next(), skillLinkedAccountsViewModel, c1bo), 1133582545);
                }
                return;
            }
            g0w = ComposableSingletons$SkillManageAccountsBottomSheetKt.f282lambda$1733511571;
        }
        hatchSectionScope.item(g0w);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$3$1$1$1(C1BO<SkillAccountsUiState> c1bo, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel) {
        super(1);
        this.$uiState$delegate = c1bo;
        this.$viewModel = skillLinkedAccountsViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
