package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$handleShown$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ VoiceEmbodimentResize $resize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$handleShown$2$1(VoiceEmbodimentResize voiceEmbodimentResize) {
        super(0);
        this.$resize = voiceEmbodimentResize;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1N((this.$resize.handleAlpha() > 0.0f ? 1 : (this.$resize.handleAlpha() == 0.0f ? 0 : -1))));
    }
}
