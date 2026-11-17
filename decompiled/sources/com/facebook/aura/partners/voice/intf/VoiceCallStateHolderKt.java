package com.facebook.aura.partners.voice.intf;

import X.AGH;
import X.BFI;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class VoiceCallStateHolderKt {
    public static final long AGENT_ACTIVITY_STALE_TIMEOUT_MS = 900000;
    public static final String APP_AUDIO_DEVICE = "app-audio";
    public static final String CALL_ID_PARAM = "call_id";
    public static final String DEVICE_PARAM = "device";
    public static final long EMBODIMENT_STATE_REASON_TTL_MS = 2000;
    public static final String OUTPUT_MODALITY_PARAM = "output_modality";
    public static final long PRE_CONNECT_FAILURE_NOTICE_TTL_MS = 30000;
    public static final String TAG = "VoiceCallStateHolder";
    public static final long UNDELIVERED_SPEECH_CLAIM_TIMEOUT_MS = 1000;
    public static final long UNDELIVERED_SPEECH_SETTLE_TIMEOUT_MS = 8000;
    public static final long UNDELIVERED_SPEECH_TRANSCRIBE_TIMEOUT_MS = 6000;
    public static final String VOICE_OUTPUT_MODALITY = "voice";

    public static final Map<String, Object> withActiveVoiceCallRouting(Map<String, ? extends Object> map, ActiveAppAudioCall activeAppAudioCall, String str) {
        C7384Etj.A0Y(map, 0);
        Map<String, Object> mapA07 = AGH.A07(BFI.A0H(new String[]{OUTPUT_MODALITY_PARAM, CALL_ID_PARAM}), map);
        if (C7384Etj.areEqual(mapA07.get("device"), "app-audio")) {
            mapA07 = AGH.A09("device", mapA07);
        }
        if (activeAppAudioCall == null || !C7384Etj.areEqual(activeAppAudioCall.threadId, str)) {
            return mapA07;
        }
        return AGH.A02(mapA07, C3cH.A0m(CALL_ID_PARAM, activeAppAudioCall.callId, C3cG.A0r("device", "app-audio"), C3cG.A0r(OUTPUT_MODALITY_PARAM, "voice")));
    }
}
