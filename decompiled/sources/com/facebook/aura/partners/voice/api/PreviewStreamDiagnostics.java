package com.facebook.aura.partners.voice.api;

import X.AGH;
import X.AIW;
import X.AnonymousClass003;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PreviewStreamDiagnostics {
    public static final int $stable = 8;
    public volatile String answeredBy;
    public volatile Map<String, String> fields = AGH.A0E();
    public volatile boolean secondRequestSent;
    public volatile String vmError;

    public final void recordSecondRequestSent$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api() {
        this.secondRequestSent = true;
    }

    public final void recordVmError$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(String str) {
        C7384Etj.A0Y(str, 0);
        this.vmError = str;
    }

    public final void recordAnsweredBy$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(boolean z) {
        this.answeredBy = z ? "second" : "first";
    }

    public final void record$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(PreviewStreamResult previewStreamResult, Integer num, TtsStreamStats ttsStreamStats) {
        AnonymousClass003.A0v(previewStreamResult, ttsStreamStats);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("stream_result", previewStreamResult.getValue());
        if (num != null) {
            c0924AIaA0u.put("stream_http_status", String.valueOf(num.intValue()));
        }
        c0924AIaA0u.put("stream_bytes", String.valueOf(ttsStreamStats.bytes));
        c0924AIaA0u.put("stream_audio_frames", String.valueOf(ttsStreamStats.audioFrames));
        c0924AIaA0u.put("stream_done_frames", String.valueOf(ttsStreamStats.doneFrames));
        c0924AIaA0u.put("stream_other_frames", String.valueOf(ttsStreamStats.otherFrames));
        c0924AIaA0u.put("stream_malformed_frames", String.valueOf(ttsStreamStats.malformedFrames));
        c0924AIaA0u.put("stream_invalid_audio_frames", String.valueOf(ttsStreamStats.invalidAudioFrames));
        c0924AIaA0u.put("stream_oversized_lines", String.valueOf(ttsStreamStats.oversizedLines));
        this.fields = AIW.A0K(c0924AIaA0u);
    }

    public final Map<String, String> toFields() {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.putAll(this.fields);
        String str = this.vmError;
        if (str != null) {
            c0924AIaA0u.put("vm_error", str);
        }
        if (this.secondRequestSent) {
            c0924AIaA0u.put("stream_attempts", "2");
            String str2 = this.answeredBy;
            if (str2 != null) {
                c0924AIaA0u.put("stream_answered_by", str2);
            }
        }
        return AIW.A0K(c0924AIaA0u);
    }
}
