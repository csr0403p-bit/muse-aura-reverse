package com.facebook.aura.pairs;

import X.AHD;
import X.AnonymousClass005;
import X.BQI;
import X.C06H;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public interface ConnectionsUiState {

    public final class Failed implements ConnectionsUiState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 43314366;
        }
    }

    public final class Loaded implements ConnectionsUiState {
        public static final int $stable = 8;
        public final AHD<ConnectionsActivity> activity;
        public final BQI<String> busyIds;
        public final AHD<ConnectionsPerson> connections;
        public final AHD<ConnectionsGroup> groups;
        public final boolean hasOlderActivity;
        public final Map<String, AuraNavKey> personTargets;
        public final BQI<String> sentIds;
        public final AHD<PairsSuggestion> suggestions;

        public final AHD<ConnectionsActivity> getActivity() {
            return this.activity;
        }

        public final BQI<String> getBusyIds() {
            return this.busyIds;
        }

        public final AHD<ConnectionsPerson> getConnections() {
            return this.connections;
        }

        public final AHD<ConnectionsGroup> getGroups() {
            return this.groups;
        }

        public final boolean getHasOlderActivity() {
            return this.hasOlderActivity;
        }

        public final Map<String, AuraNavKey> getPersonTargets() {
            return this.personTargets;
        }

        public final BQI<String> getSentIds() {
            return this.sentIds;
        }

        public final AHD<PairsSuggestion> getSuggestions() {
            return this.suggestions;
        }

        public /* synthetic */ Loaded(AHD ahd, AHD ahd2, AHD ahd3, AHD ahd4, BQI bqi, BQI bqi2, boolean z, int i, C06H c06h) {
            this(ahd, ahd2, ahd3, ahd4, bqi, bqi2, C3cH.A1M(i, z));
        }

        public Loaded(AHD<ConnectionsPerson> ahd, AHD<ConnectionsGroup> ahd2, AHD<ConnectionsActivity> ahd3, AHD<PairsSuggestion> ahd4, BQI<String> bqi, BQI<String> bqi2, boolean z) {
            AnonymousClass005.A17(ahd, ahd2, ahd3, ahd4, bqi);
            C7384Etj.A0Y(bqi2, 5);
            this.connections = ahd;
            this.groups = ahd2;
            this.activity = ahd3;
            this.suggestions = ahd4;
            this.sentIds = bqi;
            this.busyIds = bqi2;
            this.hasOlderActivity = z;
            LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(ahd));
            for (ConnectionsPerson connectionsPerson : ahd) {
                linkedHashMapA15.put(connectionsPerson.contact.museId, connectionsPerson.target);
            }
            this.personTargets = linkedHashMapA15;
        }
    }

    public final class Loading implements ConnectionsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -1528981285;
        }
    }

    public final class Unavailable implements ConnectionsUiState {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return 1051699311;
        }
    }
}
