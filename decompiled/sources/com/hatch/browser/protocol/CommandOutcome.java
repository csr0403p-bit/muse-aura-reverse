package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class CommandOutcome {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Finished extends CommandOutcome {
        public static final int $stable = 0;
        public static final Finished INSTANCE = new Finished();
    }

    public final class Interrupted extends CommandOutcome {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final Failure failure;

        public Interrupted(Failure failure) {
            C7384Etj.A0Y(failure, 0);
            this.failure = failure;
        }

        public final Interrupted copy(Failure failure) {
            C7384Etj.A0Y(failure, 0);
            return new Interrupted(failure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Interrupted) && C7384Etj.areEqual(this.failure, ((Interrupted) obj).failure));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Interrupted copy$default(Interrupted interrupted, Failure failure, int i, Object obj) {
            if ((i & 1) != 0) {
                failure = interrupted.failure;
            }
            C7384Etj.A0Y(failure, 0);
            return new Interrupted(failure);
        }

        public final Failure component1() {
            return this.failure;
        }

        public final Failure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Interrupted(failure=", this.failure);
        }
    }

    public final class Rejected extends CommandOutcome {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final Failure failure;

        public Rejected(Failure failure) {
            C7384Etj.A0Y(failure, 0);
            this.failure = failure;
        }

        public final Rejected copy(Failure failure) {
            C7384Etj.A0Y(failure, 0);
            return new Rejected(failure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Rejected) && C7384Etj.areEqual(this.failure, ((Rejected) obj).failure));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Rejected copy$default(Rejected rejected, Failure failure, int i, Object obj) {
            if ((i & 1) != 0) {
                failure = rejected.failure;
            }
            C7384Etj.A0Y(failure, 0);
            return new Rejected(failure);
        }

        public final Failure component1() {
            return this.failure;
        }

        public final Failure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Rejected(failure=", this.failure);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public CommandOutcome() {
    }

    public /* synthetic */ CommandOutcome(C06H c06h) {
    }
}
