package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ActivationSettingsScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$2$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConfidentialVmChipBudgetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$2$1(ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel, AuraNavigator auraNavigator) {
        super(1);
        this.$viewModel = confidentialVmChipBudgetViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        HatchClientCvmEventLogger.INSTANCE.logCvmReplacementChipBudgetSettingsClick();
        this.$navigator.navigate((AuraNavKey) ActivationSettingsScreenKey.INSTANCE, false);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
