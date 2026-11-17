package com.facebook.aura.pairs;

import X.AnonymousClass005;
import X.C06H;
import X.C3cH;
import java.util.List;

/* loaded from: classes3.dex */
public interface ConnectionsTabSnapshot {

    public final class Failed implements ConnectionsTabSnapshot {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 863071010;
        }
    }

    public final class Loaded implements ConnectionsTabSnapshot {
        public static final int $stable = PairsHubSnapshot.$stable;
        public final List<PeerActivityJson> feed;
        public final String feedCursor;
        public final List<ConnectionsGroup> groups;
        public final boolean hasLoadedOlderFeed;
        public final PairsHubSnapshot hub;
        public final List<PairsContact> people;
        public final List<PairsSuggestion> suggestions;

        public /* synthetic */ Loaded(PairsHubSnapshot pairsHubSnapshot, List list, List list2, List list3, List list4, String str, boolean z, int i, C06H c06h) {
            this(pairsHubSnapshot, list, list2, list3, list4, (i & 32) != 0 ? null : str, C3cH.A1M(i, z));
        }

        public final List<PeerActivityJson> getFeed() {
            return this.feed;
        }

        public final String getFeedCursor() {
            return this.feedCursor;
        }

        public final List<ConnectionsGroup> getGroups() {
            return this.groups;
        }

        public final boolean getHasLoadedOlderFeed() {
            return this.hasLoadedOlderFeed;
        }

        public final PairsHubSnapshot getHub() {
            return this.hub;
        }

        public final List<PairsContact> getPeople() {
            return this.people;
        }

        public final List<PairsSuggestion> getSuggestions() {
            return this.suggestions;
        }

        public Loaded(PairsHubSnapshot pairsHubSnapshot, List<PeerActivityJson> list, List<PairsSuggestion> list2, List<ConnectionsGroup> list3, List<PairsContact> list4, String str, boolean z) {
            AnonymousClass005.A11(pairsHubSnapshot, list2, list3, 0);
            this.hub = pairsHubSnapshot;
            this.feed = list;
            this.suggestions = list2;
            this.groups = list3;
            this.people = list4;
            this.feedCursor = str;
            this.hasLoadedOlderFeed = z;
        }
    }

    public final class Unavailable implements ConnectionsTabSnapshot {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -459896693;
        }
    }
}
