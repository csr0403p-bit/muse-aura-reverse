package com.facebook.aura.library.repo;

/* loaded from: classes.dex */
public interface ArtifactPlacementOutcome {

    public final class ArtifactChanged implements ArtifactPlacementOutcome {
        public static final ArtifactChanged INSTANCE = new ArtifactChanged();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactChanged);
        }

        public String toString() {
            return "ArtifactChanged";
        }

        public int hashCode() {
            return 394199596;
        }
    }

    public final class Forbidden implements ArtifactPlacementOutcome {
        public static final Forbidden INSTANCE = new Forbidden();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Forbidden);
        }

        public String toString() {
            return "Forbidden";
        }

        public int hashCode() {
            return 750682403;
        }
    }

    public final class Moved implements ArtifactPlacementOutcome {
        public static final Moved INSTANCE = new Moved();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Moved);
        }

        public String toString() {
            return "Moved";
        }

        public int hashCode() {
            return 77154525;
        }
    }

    public final class SidebarFull implements ArtifactPlacementOutcome {
        public static final SidebarFull INSTANCE = new SidebarFull();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SidebarFull);
        }

        public String toString() {
            return "SidebarFull";
        }

        public int hashCode() {
            return 1916393141;
        }
    }

    public final class Unavailable implements ArtifactPlacementOutcome {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return 1662065402;
        }
    }

    public final class Uncertain implements ArtifactPlacementOutcome {
        public static final Uncertain INSTANCE = new Uncertain();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Uncertain);
        }

        public String toString() {
            return "Uncertain";
        }

        public int hashCode() {
            return 1627845907;
        }
    }
}
