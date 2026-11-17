package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.model.VoiceOptionData;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$widgetUiState$1", f = "VoiceControlsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoiceControlsViewModel$widgetUiState$1 extends AbstractC07127nr implements G0W<VoiceControlsViewModel.UiState, VoiceOptionData, HtJ<? super VoiceControlsViewModel.WidgetUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public VoiceControlsViewModel$widgetUiState$1(HtJ<? super VoiceControlsViewModel$widgetUiState$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(VoiceControlsViewModel.UiState uiState, VoiceOptionData voiceOptionData, HtJ<? super VoiceControlsViewModel.WidgetUiState> htJ) {
        VoiceControlsViewModel$widgetUiState$1 voiceControlsViewModel$widgetUiState$1 = new VoiceControlsViewModel$widgetUiState$1(htJ);
        voiceControlsViewModel$widgetUiState$1.L$0 = uiState;
        voiceControlsViewModel$widgetUiState$1.L$1 = voiceOptionData;
        return voiceControlsViewModel$widgetUiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        VoiceControlsViewModel.UiState.Loaded loaded;
        boolean z;
        VoiceControlsViewModel.UiState uiState = (VoiceControlsViewModel.UiState) this.L$0;
        VoiceOptionData voiceOptionData = (VoiceOptionData) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (uiState instanceof VoiceControlsViewModel.UiState.Loaded) {
            loaded = (VoiceControlsViewModel.UiState.Loaded) uiState;
            if (loaded != null && voiceOptionData != null) {
                z = true;
                if (C7384Etj.areEqual(voiceOptionData.voiceId, loaded.selectedVoiceId)) {
                }
            }
            return new VoiceControlsViewModel.WidgetUiState(loaded, voiceOptionData, z);
        }
        loaded = null;
        z = false;
        return new VoiceControlsViewModel.WidgetUiState(loaded, voiceOptionData, z);
    }
}
