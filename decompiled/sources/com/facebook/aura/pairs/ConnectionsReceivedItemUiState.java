package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface ConnectionsReceivedItemUiState {

    public final class Failed implements ConnectionsReceivedItemUiState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -337764750;
        }
    }

    public final class Loaded implements ConnectionsReceivedItemUiState {
        public static final int $stable = ConnectionsReceivedItem.$stable;
        public final ConnectionsReceivedItem item;

        public Loaded(ConnectionsReceivedItem connectionsReceivedItem) {
            C7384Etj.A0Y(connectionsReceivedItem, 0);
            this.item = connectionsReceivedItem;
        }

        public final ConnectionsReceivedItem getItem() {
            return this.item;
        }
    }

    public final class Loading implements ConnectionsReceivedItemUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -457531993;
        }
    }
}
