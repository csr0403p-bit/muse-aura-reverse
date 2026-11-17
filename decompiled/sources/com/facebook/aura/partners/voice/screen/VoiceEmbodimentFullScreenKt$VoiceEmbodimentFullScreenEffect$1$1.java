package com.facebook.aura.partners.voice.screen;

import X.AaC;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AaC $destination;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ float $statusTop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$1$1(VoiceAvatarFullScreenState voiceAvatarFullScreenState, AaC aaC, float f) {
        super(1);
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$destination = aaC;
        this.$statusTop = f;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$fullScreen.setDestination(this.$destination);
        this.$fullScreen.setStatusTopPx(this.$statusTop);
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
