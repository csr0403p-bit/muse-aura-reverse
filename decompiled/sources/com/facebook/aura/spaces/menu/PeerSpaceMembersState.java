package com.facebook.aura.spaces.menu;

import X.AHD;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface PeerSpaceMembersState {

    public final class Failed implements PeerSpaceMembersState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 492533645;
        }
    }

    public final class Loaded implements PeerSpaceMembersState {
        public static final int $stable = PeerSpaceMember.$stable;
        public final AHD<PeerSpaceMember> members;

        public Loaded(AHD<PeerSpaceMember> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.members = ahd;
        }

        public final AHD<PeerSpaceMember> getMembers() {
            return this.members;
        }
    }

    public final class Loading implements PeerSpaceMembersState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return -488085524;
        }
    }

    public final class Unavailable implements PeerSpaceMembersState {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -844462336;
        }
    }
}
