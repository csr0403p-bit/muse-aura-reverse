package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass002;
import X.C06G;

/* loaded from: classes6.dex */
public interface VoiceNotification {

    public final class SessionTimeoutWarning extends C06G implements VoiceNotification {
        public final long remainingMs;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SessionTimeoutWarning) && this.remainingMs == ((SessionTimeoutWarning) obj).remainingMs);
        }

        public static /* synthetic */ SessionTimeoutWarning copy$default(SessionTimeoutWarning sessionTimeoutWarning, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionTimeoutWarning.remainingMs;
            }
            return new SessionTimeoutWarning(j);
        }

        public final long component1() {
            return this.remainingMs;
        }

        public final SessionTimeoutWarning copy(long j) {
            return new SessionTimeoutWarning(j);
        }

        public final long getRemainingMs() {
            return this.remainingMs;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.remainingMs);
        }

        public SessionTimeoutWarning(long j) {
            this.remainingMs = j;
        }

        public String toString() {
            return super.toString();
        }
    }
}
