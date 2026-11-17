package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$uiState$3", f = "HatchDataPrivacySettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsViewModel$uiState$3 extends AbstractC07127nr implements G0W<HatchDataPrivacySettingsViewModel.DataPrivacyUiState, HatchAiTrainingSetting, HtJ<? super HatchDataPrivacySettingsViewModel.DataPrivacyUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchDataPrivacySettingsViewModel$uiState$3(HtJ<? super HatchDataPrivacySettingsViewModel$uiState$3> htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchDataPrivacySettingsViewModel.DataPrivacyUiState dataPrivacyUiState = (HatchDataPrivacySettingsViewModel.DataPrivacyUiState) this.L$0;
        HatchAiTrainingSetting hatchAiTrainingSetting = (HatchAiTrainingSetting) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchDataPrivacySettingsViewModel.AiTrainingUiState aiTrainingUiState = hatchAiTrainingSetting != null ? new HatchDataPrivacySettingsViewModel.AiTrainingUiState(hatchAiTrainingSetting.isEnabled, hatchAiTrainingSetting.isLockedOff()) : null;
        String str = dataPrivacyUiState.botName;
        HatchDataPrivacySettingsViewModel.ResetState resetState = dataPrivacyUiState.resetState;
        HatchDataExportState hatchDataExportState = dataPrivacyUiState.exportState;
        AnonymousClass005.A0x(str, resetState, hatchDataExportState);
        return new HatchDataPrivacySettingsViewModel.DataPrivacyUiState(str, resetState, hatchDataExportState, aiTrainingUiState);
    }

    @Override // X.G0W
    public final Object invoke(HatchDataPrivacySettingsViewModel.DataPrivacyUiState dataPrivacyUiState, HatchAiTrainingSetting hatchAiTrainingSetting, HtJ<? super HatchDataPrivacySettingsViewModel.DataPrivacyUiState> htJ) {
        HatchDataPrivacySettingsViewModel$uiState$3 hatchDataPrivacySettingsViewModel$uiState$3 = new HatchDataPrivacySettingsViewModel$uiState$3(htJ);
        hatchDataPrivacySettingsViewModel$uiState$3.L$0 = dataPrivacyUiState;
        hatchDataPrivacySettingsViewModel$uiState$3.L$1 = hatchAiTrainingSetting;
        return hatchDataPrivacySettingsViewModel$uiState$3.invokeSuspend(Unit.INSTANCE);
    }
}
