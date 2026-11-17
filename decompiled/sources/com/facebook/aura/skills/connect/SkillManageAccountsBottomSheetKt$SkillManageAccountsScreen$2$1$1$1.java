package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.F2X;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ SkillLinkedAccountsViewModel $viewModel;

    /* renamed from: com.facebook.aura.skills.connect.SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$2$1$1$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends F2X implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, AuraNavigator.class, "back", "back()Z", 8);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            AnonymousClass005.A19(this);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnonymousClass005.A19(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillManageAccountsBottomSheetKt$SkillManageAccountsScreen$2$1$1$1(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = skillLinkedAccountsViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.updateAccountSelection(new AnonymousClass1(this.$navigator));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
