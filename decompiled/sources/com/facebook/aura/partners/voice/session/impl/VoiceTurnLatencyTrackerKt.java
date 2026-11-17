package com.facebook.aura.partners.voice.session.impl;

import X.BFI;
import X.BGK;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class VoiceTurnLatencyTrackerKt {
    public static final Set<String> VOICE_TURN_CANCELLATION_REASONS;
    public static final Set<String> VOICE_TURN_CANONICAL_END_REASONS;
    public static final Set<String> VOICE_TURN_FAILURE_REASONS;

    static {
        Set<String> setA0H = BFI.A0H(new String[]{VoiceCallConnectionTracker.END_REASON_USER_HANGUP, VoiceCallConnectionTracker.END_REASON_APP_BACKGROUND, VoiceCallConnectionTracker.END_REASON_CANCELLED_CONNECTING, "superseded", VoiceCallConnectionTracker.END_REASON_TEARDOWN, VoiceCallConnectionTracker.END_REASON_RESTART, VoiceCallConnectionTracker.END_REASON_RTC_REJOIN, VoiceCallConnectionTracker.END_REASON_REMOTE_COMMAND, VoiceCallConnectionTracker.END_REASON_REMOTE_USER_REQUEST, VoiceCallConnectionTracker.END_REASON_NO_MIC_PERMISSION, VoiceCallConnectionTracker.END_REASON_SERVICE_RESTARTING, VoiceCallConnectionTracker.END_REASON_OTHER_SESSION_ACTIVE, VoiceCallConnectionTracker.END_REASON_SESSION_ALREADY_ACTIVE, "out_of_credits", "thread_deleted"});
        VOICE_TURN_CANCELLATION_REASONS = setA0H;
        Set<String> setA0H2 = BFI.A0H(new String[]{VoiceCallConnectionTracker.END_REASON_AGENT_INACTIVITY, VoiceCallConnectionTracker.END_REASON_START_ERROR, VoiceCallConnectionTracker.END_REASON_SERVER_TIMEOUT, VoiceCallConnectionTracker.END_REASON_NETWORK_DROP, VoiceCallConnectionTracker.END_REASON_SERVER_ENDED, VoiceCallConnectionTracker.END_REASON_REMOTE_ERROR, VoiceCallConnectionTracker.END_REASON_NO_NETWORK, VoiceCallConnectionTracker.END_REASON_START_FAILED, VoiceCallConnectionTracker.END_REASON_CONNECT_TIMEOUT});
        VOICE_TURN_FAILURE_REASONS = setA0H2;
        VOICE_TURN_CANONICAL_END_REASONS = BGK.A01(setA0H2, setA0H);
    }

    public static final String canonicalVoiceTurnEndReason(String str) {
        return "inactivity".equals(str) ? VoiceCallConnectionTracker.END_REASON_AGENT_INACTIVITY : !VOICE_TURN_CANONICAL_END_REASONS.contains(str) ? VoiceCallConnectionTracker.END_REASON_REMOTE_ERROR : str;
    }

    public static final boolean isVoiceTurnCancellationReason(String str) {
        return VOICE_TURN_CANCELLATION_REASONS.contains(str);
    }

    public static final VoiceResponseCorrelation voiceResponseCorrelation(String str, String str2) {
        return str2 == null ? VoiceResponseCorrelation.OPEN_TURN_FALLBACK : str2.equals(str) ? VoiceResponseCorrelation.EXPLICIT_REPLY_TO : VoiceResponseCorrelation.MISMATCH;
    }
}
