package com.facebook.aura.partners.voice.intf;

import X.C06G;
import X.C3cG;

/* loaded from: classes2.dex */
public final class VoicePreConnectFailure extends C06G {
    public static final int $stable = 0;
    public final long callAttemptGeneration;
    public final long failedAtElapsedRealtimeMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePreConnectFailure) {
                VoicePreConnectFailure voicePreConnectFailure = (VoicePreConnectFailure) obj;
                if (this.callAttemptGeneration != voicePreConnectFailure.callAttemptGeneration || this.failedAtElapsedRealtimeMs != voicePreConnectFailure.failedAtElapsedRealtimeMs) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoicePreConnectFailure copy$default(VoicePreConnectFailure voicePreConnectFailure, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = voicePreConnectFailure.callAttemptGeneration;
        }
        if ((i & 2) != 0) {
            j2 = voicePreConnectFailure.failedAtElapsedRealtimeMs;
        }
        return new VoicePreConnectFailure(j, j2);
    }

    public final long component1() {
        return this.callAttemptGeneration;
    }

    public final long component2() {
        return this.failedAtElapsedRealtimeMs;
    }

    public final VoicePreConnectFailure copy(long j, long j2) {
        return new VoicePreConnectFailure(j, j2);
    }

    public final long getCallAttemptGeneration() {
        return this.callAttemptGeneration;
    }

    public final long getFailedAtElapsedRealtimeMs() {
        return this.failedAtElapsedRealtimeMs;
    }

    public int hashCode() {
        return (C3cG.A02(this.callAttemptGeneration) * 31) + C3cG.A02(this.failedAtElapsedRealtimeMs);
    }

    public VoicePreConnectFailure(long j, long j2) {
        this.callAttemptGeneration = j;
        this.failedAtElapsedRealtimeMs = j2;
    }

    public String toString() {
        return super.toString();
    }
}
