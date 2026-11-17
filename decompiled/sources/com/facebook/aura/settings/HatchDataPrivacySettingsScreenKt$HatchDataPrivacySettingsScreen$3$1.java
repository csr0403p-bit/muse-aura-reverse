package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import android.app.Activity;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$3$1(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, Activity activity) {
        super(0);
        this.$viewModel = hatchDataPrivacySettingsViewModel;
        this.$activity = activity;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DATA_CONTROLS, HatchScreen.RESET_HATCH_DIALOG, HatchComponent.CONFIRM_BUTTON, null, null, null);
        this.$viewModel.resetHatch(this.$activity, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
