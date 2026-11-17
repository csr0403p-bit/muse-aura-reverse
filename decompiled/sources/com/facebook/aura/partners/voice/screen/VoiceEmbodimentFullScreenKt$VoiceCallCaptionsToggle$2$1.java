package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$VoiceCallCaptionsToggle$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$VoiceCallCaptionsToggle$2$1(VoiceCallViewModel voiceCallViewModel) {
        super(1);
        this.$viewModel = voiceCallViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        this.$viewModel.toggleCaptions();
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$viewModel.toggleCaptions();
    }
}
