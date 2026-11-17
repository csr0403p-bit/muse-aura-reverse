package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$PublishVoiceCallSlotAnimation$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ VoiceCallChromeState $chrome;
    public final /* synthetic */ VoiceCallSlotAnimation $published;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$PublishVoiceCallSlotAnimation$1$1(VoiceCallChromeState voiceCallChromeState, VoiceCallSlotAnimation voiceCallSlotAnimation) {
        super(1);
        this.$chrome = voiceCallChromeState;
        this.$published = voiceCallSlotAnimation;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$chrome.setMorphAnimation$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome(this.$published);
        final VoiceCallChromeState voiceCallChromeState = this.$chrome;
        final VoiceCallSlotAnimation voiceCallSlotAnimation = this.$published;
        return new C78g() { // from class: com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt$PublishVoiceCallSlotAnimation$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (voiceCallChromeState.getMorphAnimation$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome() == voiceCallSlotAnimation) {
                    voiceCallChromeState.setMorphAnimation$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome(null);
                }
            }
        };
    }
}
