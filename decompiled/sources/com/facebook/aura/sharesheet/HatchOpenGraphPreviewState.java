package com.facebook.aura.sharesheet;

import X.AHD;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface HatchOpenGraphPreviewState {

    public final class Available extends C06G implements HatchOpenGraphPreviewState {
        public static final int $stable = 0;
        public final AHD<String> imageUrls;

        public Available(AHD<String> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.imageUrls = ahd;
        }

        public final Available copy(AHD<String> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Available(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Available) && C7384Etj.areEqual(this.imageUrls, ((Available) obj).imageUrls));
        }

        public static /* synthetic */ Available copy$default(Available available, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = available.imageUrls;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Available(ahd);
        }

        public final AHD<String> component1() {
            return this.imageUrls;
        }

        public final AHD<String> getImageUrls() {
            return this.imageUrls;
        }

        public int hashCode() {
            return this.imageUrls.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading implements HatchOpenGraphPreviewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();
    }

    public final class Unavailable implements HatchOpenGraphPreviewState {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();
    }
}
