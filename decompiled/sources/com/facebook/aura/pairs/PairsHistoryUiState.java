package com.facebook.aura.pairs;

import X.AHD;
import X.AnonymousClass002;

/* loaded from: classes3.dex */
public interface PairsHistoryUiState {

    public final class Failed implements PairsHistoryUiState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 330410958;
        }
    }

    public final class Loading implements PairsHistoryUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -1218921525;
        }
    }

    public final class Missing implements PairsHistoryUiState {
        public static final int $stable = 0;
        public static final Missing INSTANCE = new Missing();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Missing);
        }

        public String toString() {
            return "Missing";
        }

        public int hashCode() {
            return -486122507;
        }
    }

    public final class Ready implements PairsHistoryUiState {
        public static final int $stable = PairsContact.$stable | PairsHistoryMessage.$stable;
        public final PairsContact contact;
        public final boolean hasMore;
        public final boolean isLoadingOlder;
        public final AHD<PairsHistoryMessage> messages;
        public final boolean olderFailed;
        public final Long oldestSeq;

        public Ready(AHD<PairsHistoryMessage> ahd, boolean z, boolean z2, boolean z3, PairsContact pairsContact, Long l) {
            AnonymousClass002.A1C(ahd, 0, pairsContact);
            this.messages = ahd;
            this.hasMore = z;
            this.isLoadingOlder = z2;
            this.olderFailed = z3;
            this.contact = pairsContact;
            this.oldestSeq = l;
        }

        public final PairsContact getContact() {
            return this.contact;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final AHD<PairsHistoryMessage> getMessages() {
            return this.messages;
        }

        public final boolean getOlderFailed() {
            return this.olderFailed;
        }

        public final Long getOldestSeq() {
            return this.oldestSeq;
        }

        public final boolean isEmpty() {
            return (!this.messages.isEmpty() || this.hasMore || this.olderFailed) ? false : true;
        }

        public final boolean isLoadingOlder() {
            return this.isLoadingOlder;
        }
    }
}
