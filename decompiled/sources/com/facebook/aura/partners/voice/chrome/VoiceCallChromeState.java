package com.facebook.aura.partners.voice.chrome;

import X.AGE;
import X.AGF;
import X.C3cG;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class VoiceCallChromeState {
    public static final int $stable = 0;
    public final MutableState callButtonSource$delegate;
    public final MutableState morphAnimation$delegate;

    public final CallButtonSource getCallButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome() {
        return (CallButtonSource) this.callButtonSource$delegate.getValue();
    }

    public final VoiceCallSlotAnimation getMorphAnimation$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome() {
        return (VoiceCallSlotAnimation) this.morphAnimation$delegate.getValue();
    }

    public final void setCallButtonSource$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome(CallButtonSource callButtonSource) {
        this.callButtonSource$delegate.Af8(callButtonSource);
    }

    public final void setMorphAnimation$fbandroid_express_aura_java_com_facebook_aura_partners_voice_chrome_chrome(VoiceCallSlotAnimation voiceCallSlotAnimation) {
        this.morphAnimation$delegate.Af8(voiceCallSlotAnimation);
    }

    public VoiceCallChromeState() {
        AGE ageA01 = AGF.A01();
        this.morphAnimation$delegate = C3cG.A08(ageA01, null);
        this.callButtonSource$delegate = C3cG.A08(ageA01, null);
    }
}
