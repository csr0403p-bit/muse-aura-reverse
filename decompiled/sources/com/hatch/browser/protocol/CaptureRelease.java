package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class CaptureRelease {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Available extends CaptureRelease {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final PageCapture capture;

        public Available(PageCapture pageCapture) {
            C7384Etj.A0Y(pageCapture, 0);
            this.capture = pageCapture;
        }

        public final Available copy(PageCapture pageCapture) {
            C7384Etj.A0Y(pageCapture, 0);
            return new Available(pageCapture);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Available) && C7384Etj.areEqual(this.capture, ((Available) obj).capture));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Available copy$default(Available available, PageCapture pageCapture, int i, Object obj) {
            if ((i & 1) != 0) {
                pageCapture = available.capture;
            }
            C7384Etj.A0Y(pageCapture, 0);
            return new Available(pageCapture);
        }

        public final PageCapture component1() {
            return this.capture;
        }

        public final PageCapture getCapture() {
            return this.capture;
        }

        public int hashCode() {
            return this.capture.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Available(capture=", this.capture);
        }
    }

    public final class Withheld extends CaptureRelease {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final ReleaseReason reason;

        public Withheld(ReleaseReason releaseReason) {
            C7384Etj.A0Y(releaseReason, 0);
            this.reason = releaseReason;
        }

        public final Withheld copy(ReleaseReason releaseReason) {
            C7384Etj.A0Y(releaseReason, 0);
            return new Withheld(releaseReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Withheld) && this.reason == ((Withheld) obj).reason);
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Withheld copy$default(Withheld withheld, ReleaseReason releaseReason, int i, Object obj) {
            if ((i & 1) != 0) {
                releaseReason = withheld.reason;
            }
            C7384Etj.A0Y(releaseReason, 0);
            return new Withheld(releaseReason);
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
            return C3cJ.A0M("Withheld(reason=", this.reason);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public CaptureRelease() {
    }

    public /* synthetic */ CaptureRelease(C06H c06h) {
    }
}
