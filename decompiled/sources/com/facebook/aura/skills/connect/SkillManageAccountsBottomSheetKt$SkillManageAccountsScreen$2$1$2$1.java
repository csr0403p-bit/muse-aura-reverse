package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$2$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ SkillLinkedAccountsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$2$1$2$1(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = skillLinkedAccountsViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onManageAccountsCancelTapped();
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
