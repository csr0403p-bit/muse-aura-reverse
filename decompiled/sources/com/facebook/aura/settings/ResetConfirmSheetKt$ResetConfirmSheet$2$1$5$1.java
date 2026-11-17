package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ResetConfirmSheetKt$ResetConfirmSheet$2$1$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ MutableState<Boolean> $isExitLogged$delegate;
    public final /* synthetic */ boolean $isPreview;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchSurface $surface;
    public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetConfirmSheetKt$ResetConfirmSheet$2$1$5$1(HatchSurface hatchSurface, boolean z, AuraNavigator auraNavigator, HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, Activity activity, MutableState<Boolean> mutableState) {
        super(0);
        this.$surface = hatchSurface;
        this.$isPreview = z;
        this.$navigator = auraNavigator;
        this.$viewModel = hatchDataPrivacySettingsViewModel;
        this.$activity = activity;
        this.$isExitLogged$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(this.$surface, null, HatchScreen.RESET_CONFIRMATION_SHEET, HatchComponent.CONFIRM_BUTTON, null, null, null);
        HatchSurface hatchSurface = this.$surface;
        HatchSurface hatchSurface2 = HatchSurface.CVM_PIN_RECOVERY;
        if (hatchSurface == hatchSurface2) {
            HatchClientCvmEventLogger.INSTANCE.logRecoveryPinResetClick();
        }
        if (!this.$isPreview) {
            this.$viewModel.resetHatch(this.$activity, this.$surface == hatchSurface2);
            return;
        }
        MutableState.A09(true, this.$isExitLogged$delegate);
        ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f12112c);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
