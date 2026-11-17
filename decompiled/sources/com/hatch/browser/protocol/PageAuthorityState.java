package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class PageAuthorityState {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Alive extends PageAuthorityState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final Availability availability;

        public Alive(Availability availability) {
            C7384Etj.A0Y(availability, 0);
            this.availability = availability;
        }

        public final Alive copy(Availability availability) {
            C7384Etj.A0Y(availability, 0);
            return new Alive(availability);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Alive) && this.availability == ((Alive) obj).availability);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Alive copy$default(Alive alive, Availability availability, int i, Object obj) {
            if ((i & 1) != 0) {
                availability = alive.availability;
            }
            C7384Etj.A0Y(availability, 0);
            return new Alive(availability);
        }

        public final Availability component1() {
            return this.availability;
        }

        public final Availability getAvailability() {
            return this.availability;
        }

        public int hashCode() {
            return this.availability.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Alive(availability=", this.availability);
        }
    }

    public final class Destroyed extends PageAuthorityState {
        public static final int $stable = 0;
        public static final Destroyed INSTANCE = new Destroyed();
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public PageAuthorityState() {
    }

    public /* synthetic */ PageAuthorityState(C06H c06h) {
    }
}
