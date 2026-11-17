package com.facebook.aura.status.viewmodel;

import X.AHD;
import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.browsertask.data.HatchDesktopImage;
import com.facebook.aura.model.BrowserTaskPresentation;

/* loaded from: classes2.dex */
public interface DesktopUiState {

    public final class Loaded extends C06G implements DesktopUiState {
        public final HatchDesktopImage desktopImage;
        public final AHD<BrowserTaskPresentation> tasks;

        public Loaded(AHD<BrowserTaskPresentation> ahd, HatchDesktopImage hatchDesktopImage) {
            C7384Etj.A0Y(ahd, 0);
            this.tasks = ahd;
            this.desktopImage = hatchDesktopImage;
        }

        public final Loaded copy(AHD<BrowserTaskPresentation> ahd, HatchDesktopImage hatchDesktopImage) {
            C7384Etj.A0Y(ahd, 0);
            return new Loaded(ahd, hatchDesktopImage);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loaded) {
                    Loaded loaded = (Loaded) obj;
                    if (!C7384Etj.areEqual(this.tasks, loaded.tasks) || !C7384Etj.areEqual(this.desktopImage, loaded.desktopImage)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, AHD ahd, HatchDesktopImage hatchDesktopImage, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = loaded.tasks;
            }
            if ((i & 2) != 0) {
                hatchDesktopImage = loaded.desktopImage;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Loaded(ahd, hatchDesktopImage);
        }

        public final AHD<BrowserTaskPresentation> component1() {
            return this.tasks;
        }

        public final HatchDesktopImage component2() {
            return this.desktopImage;
        }

        public final HatchDesktopImage getDesktopImage() {
            return this.desktopImage;
        }

        public final AHD<BrowserTaskPresentation> getTasks() {
            return this.tasks;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.tasks) + AnonymousClass006.A0D(this.desktopImage);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading implements DesktopUiState {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return AnonymousClass000.A00(22);
        }

        public int hashCode() {
            return 1031726821;
        }
    }

    public final class Unavailable implements DesktopUiState {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -360259207;
        }
    }
}
