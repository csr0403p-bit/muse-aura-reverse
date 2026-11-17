package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface ConnectionsShareStatusUiState {

    public final class Known implements ConnectionsShareStatusUiState {
        public static final int $stable = 0;
        public final ConnectionsShareStatus status;

        public Known(ConnectionsShareStatus connectionsShareStatus) {
            C7384Etj.A0Y(connectionsShareStatus, 0);
            this.status = connectionsShareStatus;
        }

        public final ConnectionsShareStatus getStatus() {
            return this.status;
        }
    }

    public final class Loading implements ConnectionsShareStatusUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -1948858038;
        }
    }

    public final class Unavailable implements ConnectionsShareStatusUiState {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -1414723234;
        }
    }
}
