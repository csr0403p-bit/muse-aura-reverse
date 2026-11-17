package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface ConnectionsSheetState {

    public final class Found implements ConnectionsSheetState {
        public static final int $stable = 8;
        public final ConnectionsSheetItem item;

        public Found(ConnectionsSheetItem connectionsSheetItem) {
            C7384Etj.A0Y(connectionsSheetItem, 0);
            this.item = connectionsSheetItem;
        }

        public final ConnectionsSheetItem getItem() {
            return this.item;
        }
    }

    public final class Loading implements ConnectionsSheetState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 981734736;
        }
    }

    public final class Missing implements ConnectionsSheetState {
        public static final int $stable = 0;
        public static final Missing INSTANCE = new Missing();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Missing);
        }

        public String toString() {
            return "Missing";
        }

        public int hashCode() {
            return 1714533754;
        }
    }
}
