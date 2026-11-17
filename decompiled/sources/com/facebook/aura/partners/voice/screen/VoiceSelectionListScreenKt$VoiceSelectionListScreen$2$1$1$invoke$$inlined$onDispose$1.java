package com.facebook.aura.partners.voice.screen;

import X.C78g;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;

/* loaded from: classes.dex */
public final class VoiceSelectionListScreenKt$VoiceSelectionListScreen$2$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ VoiceControlsViewModel $previewViewModel$inlined;

    public VoiceSelectionListScreenKt$VoiceSelectionListScreen$2$1$1$invoke$$inlined$onDispose$1(VoiceControlsViewModel voiceControlsViewModel) {
        this.$previewViewModel$inlined = voiceControlsViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        this.$previewViewModel$inlined.stopPreview();
    }
}
