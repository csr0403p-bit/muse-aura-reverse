package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C60N;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface ConfidentialVmPinMutationOutcome {

    public final class Accepted implements ConfidentialVmPinMutationOutcome {
        public static final Accepted INSTANCE = new Accepted();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Accepted);
        }

        public String toString() {
            return "Accepted";
        }

        public int hashCode() {
            return 1582277373;
        }
    }

    public final class Conflict implements ConfidentialVmPinMutationOutcome {
        public static final Conflict INSTANCE = new Conflict();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Conflict);
        }

        public String toString() {
            return C60N.A00(12);
        }

        public int hashCode() {
            return -1146212568;
        }
    }

    public final class Failed extends C06G implements ConfidentialVmPinMutationOutcome {
        public final String message;
        public final Integer statusCode;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (!C7384Etj.areEqual(this.statusCode, failed.statusCode) || !C7384Etj.areEqual(this.message, failed.message)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = failed.statusCode;
            }
            if ((i & 2) != 0) {
                str = failed.message;
            }
            return new Failed(num, str);
        }

        public final Integer component1() {
            return this.statusCode;
        }

        public final String component2() {
            return this.message;
        }

        public final Failed copy(Integer num, String str) {
            return new Failed(num, str);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            return (AnonymousClass006.A0D(this.statusCode) * 31) + AnonymousClass005.A0H(this.message);
        }

        public final boolean isRetriable() {
            int iIntValue;
            Integer num = this.statusCode;
            return num == null || (iIntValue = num.intValue()) >= 500 || iIntValue == 408 || iIntValue == 429;
        }

        public Failed(Integer num, String str) {
            this.statusCode = num;
            this.message = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class RejectedWithoutState implements ConfidentialVmPinMutationOutcome {
        public static final RejectedWithoutState INSTANCE = new RejectedWithoutState();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RejectedWithoutState);
        }

        public String toString() {
            return "RejectedWithoutState";
        }

        public int hashCode() {
            return -1997971811;
        }
    }

    public final class Stale extends C06G implements ConfidentialVmPinMutationOutcome {
        public final ConfidentialVmPinState authoritativeState;

        public Stale(ConfidentialVmPinState confidentialVmPinState) {
            C7384Etj.A0Y(confidentialVmPinState, 0);
            this.authoritativeState = confidentialVmPinState;
        }

        public final Stale copy(ConfidentialVmPinState confidentialVmPinState) {
            C7384Etj.A0Y(confidentialVmPinState, 0);
            return new Stale(confidentialVmPinState);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Stale) && C7384Etj.areEqual(this.authoritativeState, ((Stale) obj).authoritativeState));
        }

        public static /* synthetic */ Stale copy$default(Stale stale, ConfidentialVmPinState confidentialVmPinState, int i, Object obj) {
            if ((i & 1) != 0) {
                confidentialVmPinState = stale.authoritativeState;
            }
            C7384Etj.A0Y(confidentialVmPinState, 0);
            return new Stale(confidentialVmPinState);
        }

        public final ConfidentialVmPinState component1() {
            return this.authoritativeState;
        }

        public final ConfidentialVmPinState getAuthoritativeState() {
            return this.authoritativeState;
        }

        public int hashCode() {
            return this.authoritativeState.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
