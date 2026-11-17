package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public interface PairsStatusUiState {

    public final class Failed implements PairsStatusUiState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 1745964820;
        }
    }

    public final class Loaded implements PairsStatusUiState {
        public static final int $stable = (PairsHeldInvite.$stable | PairsContact.$stable) | PairsAccess.$stable;
        public final boolean isRemoving;
        public final PairsStatusKind kind;
        public final PairsCodeProgress progress;
        public final PairsStatusSnapshot snapshot;

        public final PairsStatusKind getKind() {
            return this.kind;
        }

        public final PairsCodeProgress getProgress() {
            return this.progress;
        }

        public final PairsStatusSnapshot getSnapshot() {
            return this.snapshot;
        }

        public final boolean isRemoving() {
            return this.isRemoving;
        }

        public Loaded(PairsStatusSnapshot pairsStatusSnapshot, PairsCodeProgress pairsCodeProgress, PairsStatusKind pairsStatusKind, boolean z) {
            AnonymousClass005.A0x(pairsStatusSnapshot, pairsCodeProgress, pairsStatusKind);
            this.snapshot = pairsStatusSnapshot;
            this.progress = pairsCodeProgress;
            this.kind = pairsStatusKind;
            this.isRemoving = z;
        }
    }

    public final class Loading implements PairsStatusUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -286424763;
        }
    }

    public final class Unavailable implements PairsStatusUiState {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -1268692007;
        }
    }
}
