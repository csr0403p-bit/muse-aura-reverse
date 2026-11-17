package com.facebook.aura.partners.voice.screen;

import X.C78g;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceSelectionListSheet$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ VoiceControlsViewModel $viewModel$inlined;

    public VoiceSelectionListScreenKt$VoiceSelectionListSheet$1$1$invoke$$inlined$onDispose$1(VoiceControlsViewModel voiceControlsViewModel) {
        this.$viewModel$inlined = voiceControlsViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        this.$viewModel$inlined.stopPreview();
    }
}
