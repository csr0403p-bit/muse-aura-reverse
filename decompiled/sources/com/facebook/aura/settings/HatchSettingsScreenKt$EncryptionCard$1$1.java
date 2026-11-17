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
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchIntroScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$EncryptionCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onEncryptionSettingsClick;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$EncryptionCard$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator) {
            super(0);
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraNavigator auraNavigator = this.$navigator;
            F0C<C9hr<Object>>[] f0cArr = ConfidentialVmSwitchIntroScreenKey.$childSerializers;
            auraNavigator.navigate((AuraNavKey) new ConfidentialVmSwitchIntroScreenKey(ConfidentialVmSwitchEntryPoint.SETTINGS), false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$EncryptionCard$1$1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$onEncryptionSettingsClick = function0;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.TAB_SETTINGS, HatchScreen.SETTINGS_MAIN, HatchComponent.ENCRYPTION_BUTTON, null, null, null);
        HatchClientCvmEventLogger.INSTANCE.logEncryptionSettingsClick();
        this.$viewModel.onSettingsClick(new AnonymousClass1(this.$navigator), this.$onEncryptionSettingsClick);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
