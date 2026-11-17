package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C3cH;
import X.C78g;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isCompactHost;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ EmbodimentSurfaceBinding $surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$4$1(VoiceCallStateHolder voiceCallStateHolder, boolean z, EmbodimentSurfaceBinding embodimentSurfaceBinding) {
        super(1);
        this.$stateHolder = voiceCallStateHolder;
        this.$isCompactHost = z;
        this.$surface = embodimentSurfaceBinding;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C3cH.A1R(this.$stateHolder.isCompactPresentationActive) == this.$isCompactHost) {
            this.$stateHolder.setEmbodimentVisible(this.$surface.playbackEnabled);
        }
        final VoiceCallStateHolder voiceCallStateHolder = this.$stateHolder;
        final boolean z = this.$isCompactHost;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (C3cH.A1R(voiceCallStateHolder.isCompactPresentationActive) == z) {
                    voiceCallStateHolder.setEmbodimentVisible(false);
                }
            }
        };
    }
}
