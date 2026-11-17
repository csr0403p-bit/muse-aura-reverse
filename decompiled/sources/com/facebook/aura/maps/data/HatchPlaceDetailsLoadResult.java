package com.facebook.aura.maps.data;

import X.C9VN;

/* loaded from: classes4.dex */
public interface HatchPlaceDetailsLoadResult {

    public final class Failure implements HatchPlaceDetailsLoadResult {
        public static final Failure INSTANCE = new Failure();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public String toString() {
            return "Failure";
        }

        public int hashCode() {
            return 754518813;
        }
    }

    public final class Success implements HatchPlaceDetailsLoadResult {
        public final C9VN details;

        public final C9VN getDetails() {
            return this.details;
        }

        public Success(C9VN c9vn) {
            this.details = c9vn;
        }
    }
}
