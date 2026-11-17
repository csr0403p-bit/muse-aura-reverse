package com.facebook.aura.spacesharing.impl;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.library.repo.ArtifactAudienceVisibility;

/* loaded from: classes3.dex */
public interface SavedSpaceAudience {

    public final class Known extends C06G implements SavedSpaceAudience {
        public static final int $stable = 0;
        public final AHD<SavedSpaceAudienceRow> rows;
        public final boolean viewerRoleKnown;
        public final ArtifactAudienceVisibility visibility;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Known) {
                    Known known = (Known) obj;
                    if (this.visibility != known.visibility || !C7384Etj.areEqual(this.rows, known.rows) || this.viewerRoleKnown != known.viewerRoleKnown) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Known copy$default(Known known, ArtifactAudienceVisibility artifactAudienceVisibility, AHD ahd, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                artifactAudienceVisibility = known.visibility;
            }
            if ((i & 2) != 0) {
                ahd = known.rows;
            }
            if ((i & 4) != 0) {
                z = known.viewerRoleKnown;
            }
            return known.copy(artifactAudienceVisibility, ahd, z);
        }

        public final ArtifactAudienceVisibility component1() {
            return this.visibility;
        }

        public final AHD<SavedSpaceAudienceRow> component2() {
            return this.rows;
        }

        public final boolean component3() {
            return this.viewerRoleKnown;
        }

        public final AHD<SavedSpaceAudienceRow> getRows() {
            return this.rows;
        }

        public final boolean getViewerRoleKnown() {
            return this.viewerRoleKnown;
        }

        public final ArtifactAudienceVisibility getVisibility() {
            return this.visibility;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.rows, AnonymousClass005.A0E(this.visibility)), this.viewerRoleKnown);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Known(ArtifactAudienceVisibility artifactAudienceVisibility, AHD<? extends SavedSpaceAudienceRow> ahd, boolean z) {
            AnonymousClass003.A0u(artifactAudienceVisibility, ahd);
            this.visibility = artifactAudienceVisibility;
            this.rows = ahd;
            this.viewerRoleKnown = z;
        }

        public final Known copy(ArtifactAudienceVisibility artifactAudienceVisibility, AHD<? extends SavedSpaceAudienceRow> ahd, boolean z) {
            AnonymousClass003.A0u(artifactAudienceVisibility, ahd);
            return new Known(artifactAudienceVisibility, ahd, z);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Loading implements SavedSpaceAudience {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 2103456247;
        }
    }

    public final class Revoked implements SavedSpaceAudience {
        public static final int $stable = 0;
        public static final Revoked INSTANCE = new Revoked();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Revoked);
        }

        public String toString() {
            return "Revoked";
        }

        public int hashCode() {
            return -1428024487;
        }
    }

    public final class Unavailable implements SavedSpaceAudience {
        public static final int $stable = 0;
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return 1942508427;
        }
    }
}
