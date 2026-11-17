package com.facebook.aura.partners.voice.screen;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$3$1(VoiceAvatarFullScreenState voiceAvatarFullScreenState, AbstractC3358CGz abstractC3358CGz, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(1);
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$userSession = abstractC3358CGz;
        this.$metrics = hatchStatusPillMetrics;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$fullScreen.getActive()) {
            VoiceCallStateHolder.Companion.getInstance(this.$userSession).noteEmbodimentStateReason(VoiceEmbodimentStateReason.NAVIGATION);
            this.$fullScreen.collapse(this.$metrics, true);
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreenEffect$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
