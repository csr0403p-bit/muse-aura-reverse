package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$uiState$1", f = "VoiceControlsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class VoiceControlsViewModel$uiState$1 extends AbstractC07127nr implements G0W<VoiceControlsViewModel.UiState, VoicePreviewPlayback, HtJ<? super VoiceControlsViewModel.UiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ VoiceControlsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceControlsViewModel$uiState$1(VoiceControlsViewModel voiceControlsViewModel, HtJ<? super VoiceControlsViewModel$uiState$1> htJ) {
        super(3, htJ);
        this.this$0 = voiceControlsViewModel;
    }

    @Override // X.G0W
    public final Object invoke(VoiceControlsViewModel.UiState uiState, VoicePreviewPlayback voicePreviewPlayback, HtJ<? super VoiceControlsViewModel.UiState> htJ) {
        VoiceControlsViewModel$uiState$1 voiceControlsViewModel$uiState$1 = new VoiceControlsViewModel$uiState$1(this.this$0, htJ);
        voiceControlsViewModel$uiState$1.L$0 = uiState;
        voiceControlsViewModel$uiState$1.L$1 = voicePreviewPlayback;
        return voiceControlsViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        VoiceControlsViewModel.UiState uiState = (VoiceControlsViewModel.UiState) this.L$0;
        VoicePreviewPlayback voicePreviewPlayback = (VoicePreviewPlayback) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return this.this$0.withPreview(uiState, voicePreviewPlayback);
    }
}
