package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.partners.voice.gating.VoiceGating;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$2$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        if (this.$fullScreen.getActive() && VoiceGating.INSTANCE.isFullScreenExpandedViewDisabled()) {
            this.$fullScreen.collapse(this.$metrics, false);
        }
        return new InterfaceC06807bD() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$2$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$2$1(VoiceAvatarFullScreenState voiceAvatarFullScreenState, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(1);
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$metrics = hatchStatusPillMetrics;
    }
}
