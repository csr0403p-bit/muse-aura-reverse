package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$2$1(VoiceAvatarTakeoverState voiceAvatarTakeoverState) {
        super(1);
        this.$takeoverState = voiceAvatarTakeoverState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final boolean z = false;
        if (this.$takeoverState.getBackdropColor() == null) {
            z = true;
            this.$takeoverState.setBackdropColor(Integer.valueOf(HatchEmbodimentVideoKt.HATCH_VIDEO_FALLBACK_BACKDROP));
        }
        final VoiceAvatarTakeoverState voiceAvatarTakeoverState = this.$takeoverState;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Integer backdropColor;
                if (z && (backdropColor = voiceAvatarTakeoverState.getBackdropColor()) != null && backdropColor.intValue() == -65542) {
                    voiceAvatarTakeoverState.setBackdropColor(null);
                }
            }
        };
    }
}
