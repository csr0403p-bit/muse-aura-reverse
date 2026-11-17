package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class VoiceAgentActivityCancelToken extends C06G {
    public static final int $stable = 0;
    public final long revision;
    public final String threadId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceAgentActivityCancelToken) {
                VoiceAgentActivityCancelToken voiceAgentActivityCancelToken = (VoiceAgentActivityCancelToken) obj;
                if (!C7384Etj.areEqual(this.threadId, voiceAgentActivityCancelToken.threadId) || this.revision != voiceAgentActivityCancelToken.revision) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceAgentActivityCancelToken copy$default(VoiceAgentActivityCancelToken voiceAgentActivityCancelToken, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceAgentActivityCancelToken.threadId;
        }
        if ((i & 2) != 0) {
            j = voiceAgentActivityCancelToken.revision;
        }
        return new VoiceAgentActivityCancelToken(str, j);
    }

    public final String component1() {
        return this.threadId;
    }

    public final long component2() {
        return this.revision;
    }

    public final VoiceAgentActivityCancelToken copy(String str, long j) {
        return new VoiceAgentActivityCancelToken(str, j);
    }

    public final long getRevision() {
        return this.revision;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.revision, AnonymousClass006.A0G(this.threadId) * 31);
    }

    public VoiceAgentActivityCancelToken(String str, long j) {
        this.threadId = str;
        this.revision = j;
    }

    public String toString() {
        return super.toString();
    }
}
