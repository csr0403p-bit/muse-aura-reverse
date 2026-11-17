package com.facebook.aura.partners.voice.screen;

import X.AaC;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$6$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AtomicReference<AaC> $placedHalfScreenMedia;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$6$1(AtomicReference<AaC> atomicReference, VoiceAvatarTakeoverState voiceAvatarTakeoverState) {
        super(1);
        this.$placedHalfScreenMedia = atomicReference;
        this.$takeoverState = voiceAvatarTakeoverState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AtomicReference<AaC> atomicReference = this.$placedHalfScreenMedia;
        final VoiceAvatarTakeoverState voiceAvatarTakeoverState = this.$takeoverState;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$6$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Object andSet = atomicReference.getAndSet(null);
                if (andSet == null || !C7384Etj.areEqual(voiceAvatarTakeoverState.getHalfScreenMediaBounds$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(), andSet)) {
                    return;
                }
                voiceAvatarTakeoverState.setHalfScreenMediaBounds$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(null);
            }
        };
    }
}
