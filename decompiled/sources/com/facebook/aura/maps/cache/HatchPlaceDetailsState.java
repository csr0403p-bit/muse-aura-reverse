package com.facebook.aura.maps.cache;

import X.C7384Etj;
import X.C9VN;

/* loaded from: classes4.dex */
public interface HatchPlaceDetailsState {

    public final class Loading implements HatchPlaceDetailsState {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 418960855;
        }
    }

    public final class Resolved implements HatchPlaceDetailsState {
        public final C9VN details;

        public Resolved(C9VN c9vn) {
            C7384Etj.A0Y(c9vn, 0);
            this.details = c9vn;
        }

        public final C9VN getDetails() {
            return this.details;
        }
    }

    public final class Unavailable implements HatchPlaceDetailsState {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -2001991829;
        }
    }
}
