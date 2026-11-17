package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ResetHatchConfirmationSheetKt$ResetHatchConfirmationSheet$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetHatchConfirmationSheetKt$ResetHatchConfirmationSheet$1$1$1(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, Activity activity) {
        super(0);
        this.$viewModel = hatchDataPrivacySettingsViewModel;
        this.$activity = activity;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.resetHatch(this.$activity, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
