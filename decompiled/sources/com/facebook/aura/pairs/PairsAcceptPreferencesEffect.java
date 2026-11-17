package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface PairsAcceptPreferencesEffect {

    public final class Accepted implements PairsAcceptPreferencesEffect {
        public static final int $stable = 0;
        public final String generationId;

        public Accepted(String str) {
            C7384Etj.A0Y(str, 0);
            this.generationId = str;
        }

        public final String getGenerationId() {
            return this.generationId;
        }
    }

    public final class Conflict implements PairsAcceptPreferencesEffect {
        public static final int $stable = PairsContact.$stable;
        public final PairsContact earlierRequest;

        public final PairsContact getEarlierRequest() {
            return this.earlierRequest;
        }

        public Conflict(PairsContact pairsContact) {
            this.earlierRequest = pairsContact;
        }
    }

    public final class Message implements PairsAcceptPreferencesEffect {
        public static final int $stable = 0;
        public final int res;

        public final int getRes() {
            return this.res;
        }

        public Message(int i) {
            this.res = i;
        }
    }
}
