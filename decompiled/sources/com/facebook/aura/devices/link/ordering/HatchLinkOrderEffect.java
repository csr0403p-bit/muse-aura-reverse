package com.facebook.aura.devices.link.ordering;

/* loaded from: classes4.dex */
public interface HatchLinkOrderEffect {

    public final class Dismiss implements HatchLinkOrderEffect {
        public static final int $stable = 0;
        public static final Dismiss INSTANCE = new Dismiss();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public String toString() {
            return "Dismiss";
        }

        public int hashCode() {
            return 104424968;
        }
    }

    public final class LoadSavedDetails implements HatchLinkOrderEffect {
        public static final int $stable = 0;
        public static final LoadSavedDetails INSTANCE = new LoadSavedDetails();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadSavedDetails);
        }

        public String toString() {
            return "LoadSavedDetails";
        }

        public int hashCode() {
            return 1095716867;
        }
    }

    public final class PrepareDetails implements HatchLinkOrderEffect {
        public static final int $stable = 0;
        public static final PrepareDetails INSTANCE = new PrepareDetails();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PrepareDetails);
        }

        public String toString() {
            return "PrepareDetails";
        }

        public int hashCode() {
            return 1438259709;
        }
    }

    public final class Submit implements HatchLinkOrderEffect {
        public static final int $stable = 0;
        public static final Submit INSTANCE = new Submit();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public String toString() {
            return "Submit";
        }

        public int hashCode() {
            return -249355046;
        }
    }
}
