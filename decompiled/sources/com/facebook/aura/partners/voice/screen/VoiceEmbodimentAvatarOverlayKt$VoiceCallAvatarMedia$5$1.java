package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$5$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ float $liveCropTop;
    public final /* synthetic */ boolean $ownsDragHandleTone;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;
    public final /* synthetic */ MutableState<VoiceDragHandleStill> $toneStill$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$5$1(boolean z, VoiceAvatarTakeoverState voiceAvatarTakeoverState, MutableState<VoiceDragHandleStill> mutableState, float f) {
        super(1);
        this.$ownsDragHandleTone = z;
        this.$takeoverState = voiceAvatarTakeoverState;
        this.$toneStill$delegate = mutableState;
        this.$liveCropTop = f;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        VoiceDragHandleStill value = this.$toneStill$delegate.getValue();
        final VoiceDragHandleToneSource voiceDragHandleToneSource = null;
        if (value != null && this.$ownsDragHandleTone) {
            voiceDragHandleToneSource = new VoiceDragHandleToneSource(value, this.$liveCropTop);
        }
        if (this.$ownsDragHandleTone) {
            this.$takeoverState.setDragHandleToneSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(voiceDragHandleToneSource);
        }
        final VoiceAvatarTakeoverState voiceAvatarTakeoverState = this.$takeoverState;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$5$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (voiceDragHandleToneSource != null && voiceAvatarTakeoverState.getDragHandleToneSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen() == voiceDragHandleToneSource) {
                    voiceAvatarTakeoverState.setDragHandleToneSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(null);
                }
                if (voiceDragHandleToneSource != null) {
                    VoiceDragHandleMeasurement dragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen = voiceAvatarTakeoverState.getDragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen();
                    if ((dragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen != null ? dragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen.source : null) == voiceDragHandleToneSource) {
                        voiceAvatarTakeoverState.setDragHandleMeasurement$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(null);
                    }
                }
            }
        };
    }
}
