package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$3$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchDataPrivacySettingsViewModel $dataPrivacyViewModel;
    public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmDeleteDataSheetKt$ConfidentialVmDeleteDataSheet$3$1$1$1$1$1$1(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, Context context) {
        super(0);
        this.$viewModel = confidentialVmSwitchViewModel;
        this.$dataPrivacyViewModel = hatchDataPrivacySettingsViewModel;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onDeleteSheetDownloadClick();
        this.$dataPrivacyViewModel.exportData(this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
