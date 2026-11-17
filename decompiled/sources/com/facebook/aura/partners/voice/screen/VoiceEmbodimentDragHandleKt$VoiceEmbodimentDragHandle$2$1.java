package com.facebook.aura.partners.voice.screen;

import X.AXN;
import X.AbstractC7559F3s;
import X.C2ae;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$2$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ VoiceEmbodimentResize $resize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentDragHandleKt$VoiceEmbodimentDragHandle$2$1(VoiceEmbodimentResize voiceEmbodimentResize) {
        super(1);
        this.$resize = voiceEmbodimentResize;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(this.$resize.m1775handleTopLeftnOccac());
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1773invokeBjo55l4(AXN axn) {
        return this.$resize.m1775handleTopLeftnOccac();
    }
}
