package com.facebook.aura.pairs;

import X.AHD;
import X.AnonymousClass005;

/* loaded from: classes3.dex */
public interface PairsAcceptPreferencesUiState {

    public final class Loading implements PairsAcceptPreferencesUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -347159793;
        }
    }

    public final class Message implements PairsAcceptPreferencesUiState {
        public static final int $stable = 0;
        public final int message;

        public final int getMessage() {
            return this.message;
        }

        public Message(int i) {
            this.message = i;
        }
    }

    public final class Ready implements PairsAcceptPreferencesUiState {
        public static final int $stable = PairsHeldInvite.$stable;
        public final PairsHeldInvite invite;
        public final boolean isAccepting;
        public final AHD<PairsLevel> levels;
        public final PairsLevel selectedLevel;

        public final PairsHeldInvite getInvite() {
            return this.invite;
        }

        public final AHD<PairsLevel> getLevels() {
            return this.levels;
        }

        public final PairsLevel getSelectedLevel() {
            return this.selectedLevel;
        }

        public final boolean isAccepting() {
            return this.isAccepting;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ready(PairsHeldInvite pairsHeldInvite, AHD<? extends PairsLevel> ahd, PairsLevel pairsLevel, boolean z) {
            AnonymousClass005.A0x(pairsHeldInvite, ahd, pairsLevel);
            this.invite = pairsHeldInvite;
            this.levels = ahd;
            this.selectedLevel = pairsLevel;
            this.isAccepting = z;
        }
    }
}
