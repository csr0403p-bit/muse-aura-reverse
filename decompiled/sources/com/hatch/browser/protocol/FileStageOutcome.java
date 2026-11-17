package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FileStageOutcome {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Bytes extends FileStageOutcome {
        public static final int $stable = 0;
        public static final Bytes INSTANCE = new Bytes();
    }

    public final class NotStarted extends FileStageOutcome {
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

    public final class Paths extends FileStageOutcome {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final List<String> paths;

        public Paths(List<String> list) {
            C7384Etj.A0Y(list, 0);
            this.paths = list;
        }

        public final Paths copy(List<String> list) {
            C7384Etj.A0Y(list, 0);
            return new Paths(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Paths) && C7384Etj.areEqual(this.paths, ((Paths) obj).paths));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Paths copy$default(Paths paths, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = paths.paths;
            }
            C7384Etj.A0Y(list, 0);
            return new Paths(list);
        }

        public final List<String> component1() {
            return this.paths;
        }

        public final List<String> getPaths() {
            return this.paths;
        }

        public int hashCode() {
            return this.paths.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Paths(paths=", this.paths);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public FileStageOutcome() {
    }

    public /* synthetic */ FileStageOutcome(C06H c06h) {
    }
}
