package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverKt$statusFocusTarget$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$statusFocusTarget$1$1(VoiceAvatarTakeoverState voiceAvatarTakeoverState) {
        super(1);
        this.$takeoverState = voiceAvatarTakeoverState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final VoiceAvatarTakeoverState voiceAvatarTakeoverState = this.$takeoverState;
        voiceAvatarTakeoverState.statusFocusTargets++;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$statusFocusTarget$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                VoiceAvatarTakeoverState voiceAvatarTakeoverState2 = voiceAvatarTakeoverState;
                voiceAvatarTakeoverState2.statusFocusTargets--;
            }
        };
    }
}
