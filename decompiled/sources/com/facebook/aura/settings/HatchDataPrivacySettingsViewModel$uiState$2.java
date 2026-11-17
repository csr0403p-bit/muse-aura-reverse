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

@DebugMetadata(c = "com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$uiState$2", f = "HatchDataPrivacySettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsViewModel$uiState$2 extends AbstractC07127nr implements G0W<HatchDataPrivacySettingsViewModel.DataPrivacyUiState, HatchDataExportState, HtJ<? super HatchDataPrivacySettingsViewModel.DataPrivacyUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchDataPrivacySettingsViewModel$uiState$2(HtJ<? super HatchDataPrivacySettingsViewModel$uiState$2> htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchDataPrivacySettingsViewModel.DataPrivacyUiState dataPrivacyUiState = (HatchDataPrivacySettingsViewModel.DataPrivacyUiState) this.L$0;
        HatchDataExportState hatchDataExportState = (HatchDataExportState) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String str = dataPrivacyUiState.botName;
        HatchDataPrivacySettingsViewModel.ResetState resetState = dataPrivacyUiState.resetState;
        HatchDataPrivacySettingsViewModel.AiTrainingUiState aiTrainingUiState = dataPrivacyUiState.aiTraining;
        AnonymousClass005.A0x(str, resetState, hatchDataExportState);
        return new HatchDataPrivacySettingsViewModel.DataPrivacyUiState(str, resetState, hatchDataExportState, aiTrainingUiState);
    }

    @Override // X.G0W
    public final Object invoke(HatchDataPrivacySettingsViewModel.DataPrivacyUiState dataPrivacyUiState, HatchDataExportState hatchDataExportState, HtJ<? super HatchDataPrivacySettingsViewModel.DataPrivacyUiState> htJ) {
        HatchDataPrivacySettingsViewModel$uiState$2 hatchDataPrivacySettingsViewModel$uiState$2 = new HatchDataPrivacySettingsViewModel$uiState$2(htJ);
        hatchDataPrivacySettingsViewModel$uiState$2.L$0 = dataPrivacyUiState;
        hatchDataPrivacySettingsViewModel$uiState$2.L$1 = hatchDataExportState;
        return hatchDataPrivacySettingsViewModel$uiState$2.invokeSuspend(Unit.INSTANCE);
    }
}
