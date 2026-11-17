package com.hatch.browser.protocol;

import X.C06H;
import X.C3cF;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class ObservationRelease {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Available extends ObservationRelease {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final Observation observation;

        public Available(Observation observation) {
            C7384Etj.A0Y(observation, 0);
            this.observation = observation;
        }

        public final Available copy(Observation observation) {
            C7384Etj.A0Y(observation, 0);
            return new Available(observation);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Available) && C7384Etj.areEqual(this.observation, ((Available) obj).observation));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Available copy$default(Available available, Observation observation, int i, Object obj) {
            if ((i & 1) != 0) {
                observation = available.observation;
            }
            C7384Etj.A0Y(observation, 0);
            return new Available(observation);
        }

        public final Observation component1() {
            return this.observation;
        }

        public final Observation getObservation() {
            return this.observation;
        }

        public int hashCode() {
            return this.observation.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Available(observation=", this.observation);
        }
    }

    public final class NotRequested extends ObservationRelease {
        public static final int $stable = 0;
        public static final NotRequested INSTANCE = new NotRequested();
    }

    public final class Unavailable extends ObservationRelease {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final ReleaseReason reason;

        public Unavailable(ReleaseReason releaseReason) {
            C7384Etj.A0Y(releaseReason, 0);
            this.reason = releaseReason;
        }

        public final Unavailable copy(ReleaseReason releaseReason) {
            C7384Etj.A0Y(releaseReason, 0);
            return new Unavailable(releaseReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Unavailable) && this.reason == ((Unavailable) obj).reason);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, ReleaseReason releaseReason, int i, Object obj) {
            if ((i & 1) != 0) {
                releaseReason = unavailable.reason;
            }
            C7384Etj.A0Y(releaseReason, 0);
            return new Unavailable(releaseReason);
        }

        public final ReleaseReason component1() {
            return this.reason;
        }

        public final ReleaseReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return C3cJ.A0M(C3cF.A00(17), this.reason);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public ObservationRelease() {
    }

    public /* synthetic */ ObservationRelease(C06H c06h) {
    }
}
