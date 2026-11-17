package com.facebook.aura.skills.connect;

import X.C78g;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;

/* loaded from: classes.dex */
public final class SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ SkillLinkedAccountsViewModel $viewModel$inlined;

    public SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$1$1$invoke$$inlined$onDispose$1(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel) {
        this.$viewModel$inlined = skillLinkedAccountsViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        this.$viewModel$inlined.resetAccountSelection();
    }
}
