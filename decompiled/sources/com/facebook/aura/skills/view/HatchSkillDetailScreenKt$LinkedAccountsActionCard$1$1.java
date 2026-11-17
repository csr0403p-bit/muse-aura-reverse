package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$LinkedAccountsActionCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FirstPartyConnectorConfig $firstPartyConnectorConfig;
    public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ SkillAccountsUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$LinkedAccountsActionCard$1$1(SkillAccountsUiState skillAccountsUiState, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, FirstPartyConnectorConfig firstPartyConnectorConfig, AuraNavigator auraNavigator) {
        super(0);
        this.$uiState = skillAccountsUiState;
        this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
        this.$firstPartyConnectorConfig = firstPartyConnectorConfig;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SkillAccountsUiState skillAccountsUiState = this.$uiState;
        if (skillAccountsUiState.isUpdating) {
            return;
        }
        HatchSkillDetailScreenKt.handleLinkedAccountsActionClick(skillAccountsUiState.accountAction, this.$linkedAccountsViewModel, this.$firstPartyConnectorConfig, this.$navigator);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
