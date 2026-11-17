package com.facebook.aura.flights;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface FlightDetailPrimaryAction {

    public final class ReviewBooking implements FlightDetailPrimaryAction {
        public static final int $stable = 0;
        public static final ReviewBooking INSTANCE = new ReviewBooking();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReviewBooking);
        }

        public String toString() {
            return "ReviewBooking";
        }

        public int hashCode() {
            return 718601839;
        }
    }

    public final class SendSelection extends C06G implements FlightDetailPrimaryAction {
        public static final int $stable = 0;
        public final String label;

        public SendSelection(String str) {
            C7384Etj.A0Y(str, 0);
            this.label = str;
        }

        public final SendSelection copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SendSelection(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SendSelection) && C7384Etj.areEqual(this.label, ((SendSelection) obj).label));
        }

        public static /* synthetic */ SendSelection copy$default(SendSelection sendSelection, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sendSelection.label;
            }
            C7384Etj.A0Y(str, 0);
            return new SendSelection(str);
        }

        public final String component1() {
            return this.label;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
