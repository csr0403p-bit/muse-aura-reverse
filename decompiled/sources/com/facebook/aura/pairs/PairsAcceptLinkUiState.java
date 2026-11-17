package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface PairsAcceptLinkUiState {

    public final class AlreadyPaired implements PairsAcceptLinkUiState {
        public static final int $stable = 0;
        public final String museId;

        public final String getMuseId() {
            return this.museId;
        }

        public AlreadyPaired(String str) {
            this.museId = str;
        }
    }

    public final class Loading implements PairsAcceptLinkUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 1281019925;
        }
    }

    public final class Message implements PairsAcceptLinkUiState {
        public static final int $stable = 0;
        public final PairsAcceptLinkFailure failure;

        public Message(PairsAcceptLinkFailure pairsAcceptLinkFailure) {
            C7384Etj.A0Y(pairsAcceptLinkFailure, 0);
            this.failure = pairsAcceptLinkFailure;
        }

        public final PairsAcceptLinkFailure getFailure() {
            return this.failure;
        }
    }

    public final class PostedToChat implements PairsAcceptLinkUiState {
        public static final int $stable = 0;
        public static final PostedToChat INSTANCE = new PostedToChat();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PostedToChat);
        }

        public String toString() {
            return "PostedToChat";
        }

        public int hashCode() {
            return 893488985;
        }
    }

    public final class Ready implements PairsAcceptLinkUiState {
        public static final int $stable = PairsHeldInvite.$stable;
        public final PairsHeldInvite invite;

        public Ready(PairsHeldInvite pairsHeldInvite) {
            C7384Etj.A0Y(pairsHeldInvite, 0);
            this.invite = pairsHeldInvite;
        }

        public final PairsHeldInvite getInvite() {
            return this.invite;
        }
    }
}
