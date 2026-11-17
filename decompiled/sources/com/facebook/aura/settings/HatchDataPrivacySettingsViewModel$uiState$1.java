package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.settings.HatchDataExportState;
import com.facebook.aura.settings.HatchDataPrivacySettingsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$uiState$1", f = "HatchDataPrivacySettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsViewModel$uiState$1 extends AbstractC07127nr implements G0W<String, HatchDataPrivacySettingsViewModel.ResetState, HtJ<? super HatchDataPrivacySettingsViewModel.DataPrivacyUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchDataPrivacySettingsViewModel$uiState$1(HtJ<? super HatchDataPrivacySettingsViewModel$uiState$1> htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        HatchDataPrivacySettingsViewModel.ResetState resetState = (HatchDataPrivacySettingsViewModel.ResetState) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return new HatchDataPrivacySettingsViewModel.DataPrivacyUiState(str, resetState, HatchDataExportState.Idle.INSTANCE, null);
    }

    @Override // X.G0W
    public final Object invoke(String str, HatchDataPrivacySettingsViewModel.ResetState resetState, HtJ<? super HatchDataPrivacySettingsViewModel.DataPrivacyUiState> htJ) {
        HatchDataPrivacySettingsViewModel$uiState$1 hatchDataPrivacySettingsViewModel$uiState$1 = new HatchDataPrivacySettingsViewModel$uiState$1(htJ);
        hatchDataPrivacySettingsViewModel$uiState$1.L$0 = str;
        hatchDataPrivacySettingsViewModel$uiState$1.L$1 = resetState;
        return hatchDataPrivacySettingsViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }
}
