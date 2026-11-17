package com.facebook.aura.gateway.connection;

import X.C06G;

/* loaded from: classes6.dex */
public interface ReconnectGiveUpReason {

    public final class MaxAttemptsExceeded extends C06G implements ReconnectGiveUpReason {
        public final int maxAttempts;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof MaxAttemptsExceeded) && this.maxAttempts == ((MaxAttemptsExceeded) obj).maxAttempts);
        }

        public static /* synthetic */ MaxAttemptsExceeded copy$default(MaxAttemptsExceeded maxAttemptsExceeded, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = maxAttemptsExceeded.maxAttempts;
            }
            return new MaxAttemptsExceeded(i);
        }

        public final int component1() {
            return this.maxAttempts;
        }

        public final MaxAttemptsExceeded copy(int i) {
            return new MaxAttemptsExceeded(i);
        }

        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        public int hashCode() {
            return this.maxAttempts;
        }

        public MaxAttemptsExceeded(int i) {
            this.maxAttempts = i;
        }

        public String toString() {
            return super.toString();
        }
    }
}
