package com.facebook.aura.partners.voice.session.impl;

import X.AGH;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV3;
import X.C3cG;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolderKt;

/* loaded from: classes2.dex */
public final class UndeliveredSpeechTelemetry {
    public static final UndeliveredSpeechTelemetry INSTANCE = new UndeliveredSpeechTelemetry();

    public final void logOutcome(String str, String str2, String str3, CapturedSpeech capturedSpeech, UndeliveredSpeechOutcome undeliveredSpeechOutcome, UndeliveredSpeechSource undeliveredSpeechSource, long j, int i) {
        AnonymousClass005.A14(str, str2, str3, capturedSpeech);
        AnonymousClass003.A0y(undeliveredSpeechOutcome, undeliveredSpeechSource);
        HatchAppEventLogger.INSTANCE.logEvent("voice_undelivered_speech", "voice", null, "outcome", "undelivered_speech", AGH.A0D(C3cG.A0r(VoiceCallStateHolderKt.CALL_ID_PARAM, str), C3cG.A0r(BV3.A00(55), str2), C3cG.A0r("end_reason", str3), C3cG.A0r("outcome", undeliveredSpeechOutcome.getValue()), C3cG.A0r("transcript_source", undeliveredSpeechSource.getValue()), C3cG.A0r("speech_ms", String.valueOf(capturedSpeech.voicedMs)), C3cG.A0r("audio_ms", String.valueOf((capturedSpeech.pcm.length * 1000) / VoyagerAsrSession.OPUS_RELEASE_SLICE_BYTES)), C3cG.A0r("transcribe_ms", String.valueOf(j)), C3cG.A0r("transcript_characters", String.valueOf(i))), null);
    }
}
