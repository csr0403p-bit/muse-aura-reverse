package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConfidentialVmDataChoiceScreenKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EncryptionSettingScreenKt$EncryptionSettingScreen$3$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionSettingScreenKt$EncryptionSettingScreen$3$1$2$1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onSwitchBackConfirmed(ConfidentialVmSwitchEntryPoint.SETTINGS);
        this.$navigator.navigate((AuraNavKey) ConfidentialVmDataChoiceScreenKey.INSTANCE, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
