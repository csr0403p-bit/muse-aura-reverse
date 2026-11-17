package com.facebook.aura.partners.voice.viewmodel;

import X.C7BY;
import X.CFK;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff;

/* loaded from: classes2.dex */
public abstract class VoiceCallViewModelKt {
    public static final long TAB_ROOT_CAPTION_LINGER_MS = 4000;
    public static final String TAG = "VoiceCallViewModel";

    public static final String conversationThread(String str) {
        String strNormalizedThreadId = VoiceCallStateHolder.Companion.normalizedThreadId(str);
        if (strNormalizedThreadId == null || strNormalizedThreadId.equals("primary_session_id")) {
            return null;
        }
        return strNormalizedThreadId;
    }

    public static final void logStillHandoff(String str, String str2, VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff, VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff2) {
        String strA0R;
        String strA0R2;
        String strA0S;
        if ("failed".equals(str) && voiceEmbodimentStillHandoff.incoming != null && voiceEmbodimentStillHandoff2.incoming == null) {
            str = "gave_up";
        }
        String str3 = "none";
        if (str2 == null || (strA0S = C7BY.A0S(str2, str2, '?')) == null || (strA0R = C7BY.A0R(strA0S, strA0S, '/')) == null) {
            strA0R = "none";
        }
        String str4 = voiceEmbodimentStillHandoff2.incomingKey;
        if (str4 != null && (strA0R2 = C7BY.A0R(str4, str4, '/')) != null) {
            str3 = strA0R2;
        }
        CFK.A0G(TAG, "live_avatar.still_handoff.%s still=%s incoming=%s attempt=%d failures=%d", str, strA0R, str3, Integer.valueOf(voiceEmbodimentStillHandoff2.incomingAttempt), Integer.valueOf(voiceEmbodimentStillHandoff2.incomingFailures));
    }
}
