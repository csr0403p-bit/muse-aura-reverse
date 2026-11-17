package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class PageCloseOutcome {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Closed extends PageCloseOutcome {
        public static final int $stable = 0;
        public static final Closed INSTANCE = new Closed();
    }

    public final class NotStarted extends PageCloseOutcome {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final Failure failure;

        public NotStarted(Failure failure) {
            C7384Etj.A0Y(failure, 0);
            this.failure = failure;
        }

        public final NotStarted copy(Failure failure) {
            C7384Etj.A0Y(failure, 0);
            return new NotStarted(failure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NotStarted) && C7384Etj.areEqual(this.failure, ((NotStarted) obj).failure));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, Failure failure, int i, Object obj) {
            if ((i & 1) != 0) {
                failure = notStarted.failure;
            }
            C7384Etj.A0Y(failure, 0);
            return new NotStarted(failure);
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
            return C3cJ.A0M("NotStarted(failure=", this.failure);
        }
    }

    public final class Released extends PageCloseOutcome {
        public static final int $stable = 0;
        public static final Released INSTANCE = new Released();
    }

    public final class Unknown extends PageCloseOutcome {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final Failure failure;

        public Unknown(Failure failure) {
            C7384Etj.A0Y(failure, 0);
            this.failure = failure;
        }

        public final Unknown copy(Failure failure) {
            C7384Etj.A0Y(failure, 0);
            return new Unknown(failure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Unknown) && C7384Etj.areEqual(this.failure, ((Unknown) obj).failure));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, Failure failure, int i, Object obj) {
            if ((i & 1) != 0) {
                failure = unknown.failure;
            }
            C7384Etj.A0Y(failure, 0);
            return new Unknown(failure);
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
            return C3cJ.A0M("Unknown(failure=", this.failure);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public PageCloseOutcome() {
    }

    public /* synthetic */ PageCloseOutcome(C06H c06h) {
    }
}
