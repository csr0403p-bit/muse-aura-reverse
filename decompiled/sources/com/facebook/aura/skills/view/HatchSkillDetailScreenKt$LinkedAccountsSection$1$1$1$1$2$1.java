package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SkillLinkedAccountUiModel $account;
    public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$2$1(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, SkillLinkedAccountUiModel skillLinkedAccountUiModel) {
        super(0);
        this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
        this.$account = skillLinkedAccountUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$linkedAccountsViewModel.reconnect(this.$account);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
