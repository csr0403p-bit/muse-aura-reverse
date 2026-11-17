package com.facebook.aura.pairs;

import X.AnonymousClass003;
import X.BQI;
import X.C06H;
import X.C0943AIw;

/* loaded from: classes3.dex */
public interface SpaceCollaboratorsUiState {

    public final class Failed implements SpaceCollaboratorsUiState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -1451314342;
        }
    }

    public final class Loaded implements SpaceCollaboratorsUiState {
        public static final int $stable = SpaceViewerProfileJson.$stable | SpaceCollaborators.$stable;
        public final BQI<String> busy;
        public final SpaceCollaborators collaborators;
        public final SpaceViewerProfileJson owner;

        public final BQI<String> getBusy() {
            return this.busy;
        }

        public final SpaceCollaborators getCollaborators() {
            return this.collaborators;
        }

        public final SpaceViewerProfileJson getOwner() {
            return this.owner;
        }

        public Loaded(SpaceCollaborators spaceCollaborators, SpaceViewerProfileJson spaceViewerProfileJson, BQI<String> bqi) {
            AnonymousClass003.A0v(spaceCollaborators, bqi);
            this.collaborators = spaceCollaborators;
            this.owner = spaceViewerProfileJson;
            this.busy = bqi;
        }

        public /* synthetic */ Loaded(SpaceCollaborators spaceCollaborators, SpaceViewerProfileJson spaceViewerProfileJson, BQI bqi, int i, C06H c06h) {
            this(spaceCollaborators, spaceViewerProfileJson, (i & 4) != 0 ? C0943AIw.A03 : bqi);
        }
    }

    public final class Loading implements SpaceCollaboratorsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -617830977;
        }
    }
}
