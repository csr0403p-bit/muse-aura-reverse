package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1HY;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceConversationHeaderAction$rememberAction$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ VoiceCallChromeState $chrome;
    public final /* synthetic */ C1HY $lifecycleOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceConversationHeaderAction$rememberAction$1$1(VoiceCallChromeState voiceCallChromeState, C1HY c1hy) {
        super(1);
        this.$chrome = voiceCallChromeState;
        this.$lifecycleOwner = c1hy;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final VoiceCallChromeState voiceCallChromeState = this.$chrome;
        final C1HY c1hy = this.$lifecycleOwner;
        return new C78g() { // from class: com.facebook.aura.partners.voice.chrome.VoiceConversationHeaderAction$rememberAction$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                VoiceCallChromeState voiceCallChromeState2 = voiceCallChromeState;
                if (voiceCallChromeState2 != null) {
                    CallButtonSource callButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome = voiceCallChromeState2.getCallButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome();
                    if ((callButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome != null ? callButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome.owner : null) == c1hy) {
                        voiceCallChromeState.setCallButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome(null);
                    }
                }
            }
        };
    }
}
