package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.FGI;
import X.HwO;

/* loaded from: classes6.dex */
public abstract class DownloadPublishOutcome {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class NotStarted extends DownloadPublishOutcome {
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

    public final class Published extends DownloadPublishOutcome {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final long bytes;
        public final String sha256;

        public Published(long j, String str) {
            C7384Etj.A0Y(str, 1);
            this.bytes = j;
            this.sha256 = str;
        }

        /* renamed from: copy-4PLdz1A, reason: not valid java name */
        public final Published m3321copy4PLdz1A(long j, String str) {
            C7384Etj.A0Y(str, 1);
            return new Published(j, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Published) {
                    Published published = (Published) obj;
                    if (this.bytes != published.bytes || !C7384Etj.areEqual(this.sha256, published.sha256)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        /* renamed from: copy-4PLdz1A$default, reason: not valid java name */
        public static /* synthetic */ Published m3319copy4PLdz1A$default(Published published, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = published.bytes;
            }
            if ((i & 2) != 0) {
                str = published.sha256;
            }
            C7384Etj.A0Y(str, 1);
            return new Published(j, str);
        }

        /* renamed from: component1-s-VKNKU, reason: not valid java name */
        public final long m3320component1sVKNKU() {
            return this.bytes;
        }

        public final String component2() {
            return this.sha256;
        }

        /* renamed from: getBytes-s-VKNKU, reason: not valid java name */
        public final long m3322getBytessVKNKU() {
            return this.bytes;
        }

        public final String getSha256() {
            return this.sha256;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.sha256, C3cI.A01(this.bytes));
        }

        public String toString() {
            return FGI.A0c("Published(bytes=", HwO.A00(this.bytes), ", sha256=", this.sha256);
        }

        public /* synthetic */ Published(long j, String str, C06H c06h) {
            this(j, str);
        }
    }

    public final class Unknown extends DownloadPublishOutcome {
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

    public DownloadPublishOutcome() {
    }

    public /* synthetic */ DownloadPublishOutcome(C06H c06h) {
    }
}
