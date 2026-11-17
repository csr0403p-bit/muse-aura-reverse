package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$callAvatarMediaHandoff$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Boolean> $mediaOpaque$delegate;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$callAvatarMediaHandoff$3$1(VoiceAvatarTakeoverState voiceAvatarTakeoverState, C1BO<Boolean> c1bo) {
        super(1);
        this.$takeoverState = voiceAvatarTakeoverState;
        this.$mediaOpaque$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$takeoverState.setMediaVisible(C1BO.A0F(this.$mediaOpaque$delegate));
        final VoiceAvatarTakeoverState voiceAvatarTakeoverState = this.$takeoverState;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$callAvatarMediaHandoff$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                voiceAvatarTakeoverState.setMediaVisible(false);
            }
        };
    }
}
