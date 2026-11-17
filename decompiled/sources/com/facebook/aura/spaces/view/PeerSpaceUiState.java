package com.facebook.aura.spaces.view;

import X.C7384Etj;

/* loaded from: classes.dex */
public interface PeerSpaceUiState {

    public final class Checking implements PeerSpaceUiState {
        public static final int $stable = 0;
        public static final Checking INSTANCE = new Checking();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Checking);
        }

        public String toString() {
            return "Checking";
        }

        public int hashCode() {
            return 1921184503;
        }
    }

    public final class Failed implements PeerSpaceUiState {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 278197402;
        }
    }

    public final class Ready implements PeerSpaceUiState {
        public static final int $stable = 0;
        public final String documentUrl;

        public Ready(String str) {
            C7384Etj.A0Y(str, 0);
            this.documentUrl = str;
        }

        public final String getDocumentUrl() {
            return this.documentUrl;
        }
    }

    public final class Unavailable implements PeerSpaceUiState {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return 1510353427;
        }
    }
}
