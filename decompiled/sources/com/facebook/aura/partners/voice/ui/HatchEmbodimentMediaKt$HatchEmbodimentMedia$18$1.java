package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$18$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ VoiceEmbodimentMediaController $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$18$1(VoiceEmbodimentMediaController voiceEmbodimentMediaController) {
        super(1);
        this.$controller = voiceEmbodimentMediaController;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$controller.start();
        final VoiceEmbodimentMediaController voiceEmbodimentMediaController = this.$controller;
        return new C78g() { // from class: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$HatchEmbodimentMedia$18$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                voiceEmbodimentMediaController.close();
            }
        };
    }
}
