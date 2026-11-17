package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass005;
import java.util.Set;

/* loaded from: classes2.dex */
public final class VoiceCallReconnectEpisode {
    public final VoiceCallReconnectCause cause;
    public final Set<VoiceCallReconnectCause> causes;
    public final long durationMs;
    public final int index;
    public final String networkTypeEnd;
    public final String networkTypeStart;
    public final VoiceCallReconnectOutcome outcome;
    public final VoiceCallRejoinOutcome rejoinOutcome;
    public final long sinceConnectMs;

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCallReconnectEpisode(int i, VoiceCallReconnectCause voiceCallReconnectCause, Set<? extends VoiceCallReconnectCause> set, VoiceCallReconnectOutcome voiceCallReconnectOutcome, long j, long j2, VoiceCallRejoinOutcome voiceCallRejoinOutcome, String str, String str2) {
        AnonymousClass005.A11(voiceCallReconnectCause, set, voiceCallReconnectOutcome, 1);
        this.index = i;
        this.cause = voiceCallReconnectCause;
        this.causes = set;
        this.outcome = voiceCallReconnectOutcome;
        this.durationMs = j;
        this.sinceConnectMs = j2;
        this.rejoinOutcome = voiceCallRejoinOutcome;
        this.networkTypeStart = str;
        this.networkTypeEnd = str2;
    }

    public final VoiceCallReconnectCause getCause() {
        return this.cause;
    }

    public final Set<VoiceCallReconnectCause> getCauses() {
        return this.causes;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getNetworkTypeEnd() {
        return this.networkTypeEnd;
    }

    public final String getNetworkTypeStart() {
        return this.networkTypeStart;
    }

    public final VoiceCallReconnectOutcome getOutcome() {
        return this.outcome;
    }

    public final VoiceCallRejoinOutcome getRejoinOutcome() {
        return this.rejoinOutcome;
    }

    public final long getSinceConnectMs() {
        return this.sinceConnectMs;
    }
}
