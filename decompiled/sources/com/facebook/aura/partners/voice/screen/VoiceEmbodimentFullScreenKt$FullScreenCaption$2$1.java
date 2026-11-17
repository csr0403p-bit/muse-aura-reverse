package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C7384Etj;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$FullScreenCaption$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;
    public final /* synthetic */ CaptionBoundsWrite $written;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$FullScreenCaption$2$1(VoiceAvatarTakeoverState voiceAvatarTakeoverState, CaptionBoundsWrite captionBoundsWrite) {
        super(1);
        this.$takeoverState = voiceAvatarTakeoverState;
        this.$written = captionBoundsWrite;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final VoiceAvatarTakeoverState voiceAvatarTakeoverState = this.$takeoverState;
        final CaptionBoundsWrite captionBoundsWrite = this.$written;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentFullScreenKt$FullScreenCaption$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (C7384Etj.areEqual(voiceAvatarTakeoverState.getCaptionBounds(), captionBoundsWrite.bounds)) {
                    voiceAvatarTakeoverState.setCaptionBounds(null);
                }
            }
        };
    }
}
