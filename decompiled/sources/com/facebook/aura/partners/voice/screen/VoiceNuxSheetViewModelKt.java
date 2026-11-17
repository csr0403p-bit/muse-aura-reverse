package com.facebook.aura.partners.voice.screen;

import X.AIW;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0924AIa;
import X.C3cG;
import X.C3cI;
import X.C7BY;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class VoiceNuxSheetViewModelKt {
    public static final String UTM_CAMPAIGN = "utm_campaign";

    public static final Map<String, String> voiceNuxLogMetadata(AbstractC3358CGz abstractC3358CGz, VoiceCallStart voiceCallStart) {
        VoiceCallEntryPoint voiceCallEntryPoint;
        AnonymousClass003.A0u(abstractC3358CGz, voiceCallStart);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        String value = voiceCallStart.attribution.get("utm_campaign");
        if ((value != null && voiceCallStart.entryPoint == VoiceCallEntryPoint.META_APP && !C7BY.A0j(value)) || ((voiceCallEntryPoint = voiceCallStart.entryPoint) != null && (value = voiceCallEntryPoint.getValue()) != null)) {
            AnonymousClass001.A1C(HatchMetadataKey.ENTRY_POINT, value, c0924AIaA0u);
        }
        C3cI.A1K(HatchMetadataKey.HAS_SEEN_VOICE_NUX.getValue(), c0924AIaA0u, VoicePrefs.INSTANCE.hasSeenVoiceNux(abstractC3358CGz));
        return AIW.A0K(c0924AIaA0u);
    }
}
