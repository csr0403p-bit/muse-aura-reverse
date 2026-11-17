package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConfidentialVmRegisterPinScreenKey;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EncryptionSettingScreenKt$EncryptionSettingScreen$3$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionSettingScreenKt$EncryptionSettingScreen$3$1$1$1$1$1$1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.ENCRYPTION, HatchScreen.ENCRYPTION, HatchComponent.CHANGE_RECOVERY_PIN_BUTTON, null, null, null);
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinChangeClick();
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = ConfidentialVmRegisterPinScreenKey.$childSerializers;
        auraNavigator.navigate((AuraNavKey) new ConfidentialVmRegisterPinScreenKey(RegisterPinEntryPoint.SETTINGS), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
