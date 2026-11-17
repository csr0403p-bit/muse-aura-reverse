package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $showDownloadDialog$delegate;
    public final /* synthetic */ HatchDataPrivacySettingsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$6$1(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, Context context, MutableState<Boolean> mutableState) {
        super(0);
        this.$viewModel = hatchDataPrivacySettingsViewModel;
        this.$context = context;
        this.$showDownloadDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$showDownloadDialog$delegate);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DATA_CONTROLS, HatchScreen.DOWNLOAD_AGENT_DATA_DIALOG, HatchComponent.CONFIRM_BUTTON, null, null, null);
        this.$viewModel.exportData(this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
