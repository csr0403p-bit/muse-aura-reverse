package com.facebook.aura.widgets;

import X.AHD;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.spaces.repo.SpaceCard;

/* loaded from: classes.dex */
public interface SpaceWidgetPickerUiState {

    public final class Empty implements SpaceWidgetPickerUiState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public String toString() {
            return "Empty";
        }

        public int hashCode() {
            return 954551923;
        }
    }

    public final class Loaded extends C06G implements SpaceWidgetPickerUiState {
        public static final int $stable = 8;
        public final AHD<SpaceCard> spaces;

        public Loaded(AHD<SpaceCard> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.spaces = ahd;
        }

        public final Loaded copy(AHD<SpaceCard> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Loaded(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Loaded) && C7384Etj.areEqual(this.spaces, ((Loaded) obj).spaces));
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = loaded.spaces;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Loaded(ahd);
        }

        public final AHD<SpaceCard> component1() {
            return this.spaces;
        }

        public final AHD<SpaceCard> getSpaces() {
            return this.spaces;
        }

        public int hashCode() {
            return this.spaces.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading implements SpaceWidgetPickerUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 161872098;
        }
    }

    public final class SignedOut implements SpaceWidgetPickerUiState {
        public static final int $stable = 0;
        public static final SignedOut INSTANCE = new SignedOut();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SignedOut);
        }

        public String toString() {
            return "SignedOut";
        }

        public int hashCode() {
            return 618391736;
        }
    }
}
