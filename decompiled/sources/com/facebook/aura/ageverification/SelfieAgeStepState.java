package com.facebook.aura.ageverification;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;

/* loaded from: classes3.dex */
public interface SelfieAgeStepState {

    public final class Capturing extends C06G implements SelfieAgeStepState {
        public static final int $stable = 0;
        public final int captureKey;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Capturing) && this.captureKey == ((Capturing) obj).captureKey);
        }

        public static /* synthetic */ Capturing copy$default(Capturing capturing, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = capturing.captureKey;
            }
            return new Capturing(i);
        }

        public final int component1() {
            return this.captureKey;
        }

        public final Capturing copy(int i) {
            return new Capturing(i);
        }

        public final int getCaptureKey() {
            return this.captureKey;
        }

        public int hashCode() {
            return this.captureKey;
        }

        public Capturing(int i) {
            this.captureKey = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Confirmed implements SelfieAgeStepState {
        public static final int $stable = 0;
        public static final Confirmed INSTANCE = new Confirmed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirmed);
        }

        public String toString() {
            return "Confirmed";
        }

        public int hashCode() {
            return -356947773;
        }
    }

    public final class Confirming implements SelfieAgeStepState {
        public static final int $stable = 0;
        public static final Confirming INSTANCE = new Confirming();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirming);
        }

        public String toString() {
            return "Confirming";
        }

        public int hashCode() {
            return 1819525182;
        }
    }

    public final class Error extends C06G implements SelfieAgeStepState {
        public static final int $stable = 0;
        public final RetryAction retry;
        public final boolean retryOnResume;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Error) {
                    Error error = (Error) obj;
                    if (this.retry != error.retry || this.retryOnResume != error.retryOnResume) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Error copy$default(Error error, RetryAction retryAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                retryAction = error.retry;
            }
            if ((i & 2) != 0) {
                z = error.retryOnResume;
            }
            return new Error(retryAction, z);
        }

        public final RetryAction component1() {
            return this.retry;
        }

        public final boolean component2() {
            return this.retryOnResume;
        }

        public final Error copy(RetryAction retryAction, boolean z) {
            return new Error(retryAction, z);
        }

        public final RetryAction getRetry() {
            return this.retry;
        }

        public final boolean getRetryOnResume() {
            return this.retryOnResume;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass006.A0D(this.retry) * 31, this.retryOnResume);
        }

        public Error(RetryAction retryAction, boolean z) {
            this.retry = retryAction;
            this.retryOnResume = z;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Error(RetryAction retryAction, boolean z, int i, C06H c06h) {
            this(retryAction, AnonymousClass001.A1Q(i, z));
        }
    }

    public final class Intro extends C06G implements SelfieAgeStepState {
        public static final int $stable = 0;
        public final boolean preparing;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Intro) && this.preparing == ((Intro) obj).preparing);
        }

        public static /* synthetic */ Intro copy$default(Intro intro, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = intro.preparing;
            }
            return new Intro(z);
        }

        public final boolean component1() {
            return this.preparing;
        }

        public final Intro copy(boolean z) {
            return new Intro(z);
        }

        public final boolean getPreparing() {
            return this.preparing;
        }

        public int hashCode() {
            return this.preparing ? 1231 : 1237;
        }

        public /* synthetic */ Intro(boolean z, int i, C06H c06h) {
            this(AnonymousClass001.A1P(i, z));
        }

        public String toString() {
            return super.toString();
        }

        public Intro(boolean z) {
            this.preparing = z;
        }

        public Intro() {
            this(false);
        }
    }

    public final class Recapture extends C06G implements SelfieAgeStepState {
        public static final int $stable = 0;
        public final int captureKey;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Recapture) && this.captureKey == ((Recapture) obj).captureKey);
        }

        public static /* synthetic */ Recapture copy$default(Recapture recapture, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = recapture.captureKey;
            }
            return new Recapture(i);
        }

        public final int component1() {
            return this.captureKey;
        }

        public final Recapture copy(int i) {
            return new Recapture(i);
        }

        public final int getCaptureKey() {
            return this.captureKey;
        }

        public int hashCode() {
            return this.captureKey;
        }

        public Recapture(int i) {
            this.captureKey = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Resolved extends C06G implements SelfieAgeStepState {
        public static final int $stable = 0;
        public final boolean afterConfirmed;
        public final boolean afterFinalFailure;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Resolved) {
                    Resolved resolved = (Resolved) obj;
                    if (this.afterConfirmed != resolved.afterConfirmed || this.afterFinalFailure != resolved.afterFinalFailure) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Resolved copy$default(Resolved resolved, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = resolved.afterConfirmed;
            }
            if ((i & 2) != 0) {
                z2 = resolved.afterFinalFailure;
            }
            return new Resolved(z, z2);
        }

        public final boolean component1() {
            return this.afterConfirmed;
        }

        public final boolean component2() {
            return this.afterFinalFailure;
        }

        public final Resolved copy(boolean z, boolean z2) {
            return new Resolved(z, z2);
        }

        public final boolean getAfterConfirmed() {
            return this.afterConfirmed;
        }

        public final boolean getAfterFinalFailure() {
            return this.afterFinalFailure;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A02(this.afterConfirmed), this.afterFinalFailure);
        }

        public Resolved(boolean z, boolean z2) {
            this.afterConfirmed = z;
            this.afterFinalFailure = z2;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Resolved(boolean z, boolean z2, int i, C06H c06h) {
            this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2));
        }

        public Resolved() {
            this(false, false);
        }
    }

    public final class Resolving implements SelfieAgeStepState {
        public static final int $stable = 0;
        public static final Resolving INSTANCE = new Resolving();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Resolving);
        }

        public String toString() {
            return "Resolving";
        }

        public int hashCode() {
            return -1544095475;
        }
    }

    public final class Submitting implements SelfieAgeStepState {
        public static final int $stable = 0;
        public static final Submitting INSTANCE = new Submitting();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Submitting);
        }

        public String toString() {
            return AnonymousClass000.A00(25);
        }

        public int hashCode() {
            return -1098756574;
        }
    }
}
