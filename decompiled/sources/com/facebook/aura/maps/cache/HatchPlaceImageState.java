package com.facebook.aura.maps.cache;

import X.C7384Etj;
import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public interface HatchPlaceImageState {

    public final class Loaded implements HatchPlaceImageState {
        public final Bitmap bitmap;

        public Loaded(Bitmap bitmap) {
            C7384Etj.A0Y(bitmap, 0);
            this.bitmap = bitmap;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }
    }

    public final class Loading implements HatchPlaceImageState {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 1151595998;
        }
    }

    public final class Unavailable implements HatchPlaceImageState {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -1440101390;
        }
    }
}
