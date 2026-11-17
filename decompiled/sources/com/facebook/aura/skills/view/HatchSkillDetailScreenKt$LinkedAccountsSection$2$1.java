package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$LinkedAccountsSection$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $onAccountsCenterClick;
    public final /* synthetic */ SkillAccountsUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSkillDetailScreenKt$LinkedAccountsSection$2$1(G0U<? super Boolean, Unit> g0u, SkillAccountsUiState skillAccountsUiState) {
        super(0);
        this.$onAccountsCenterClick = g0u;
        this.$uiState = skillAccountsUiState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1K(this.$uiState.hasLinkedAccounts, this.$onAccountsCenterClick);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
