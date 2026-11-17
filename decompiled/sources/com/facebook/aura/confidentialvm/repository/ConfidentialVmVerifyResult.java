package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;

/* loaded from: classes.dex */
public interface ConfidentialVmVerifyResult {

    public final class Failure implements ConfidentialVmVerifyResult {
        public static final Failure INSTANCE = new Failure();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public String toString() {
            return "Failure";
        }

        public int hashCode() {
            return -442110890;
        }
    }

    public final class LockedOut extends C06G implements ConfidentialVmVerifyResult {
        public final boolean afterIncorrectPin;
        public final Integer attemptsRemaining;
        public final Integer backoffInSeconds;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LockedOut) {
                    LockedOut lockedOut = (LockedOut) obj;
                    if (!C7384Etj.areEqual(this.backoffInSeconds, lockedOut.backoffInSeconds) || !C7384Etj.areEqual(this.attemptsRemaining, lockedOut.attemptsRemaining) || this.afterIncorrectPin != lockedOut.afterIncorrectPin) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ LockedOut copy$default(LockedOut lockedOut, Integer num, Integer num2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                num = lockedOut.backoffInSeconds;
            }
            if ((i & 2) != 0) {
                num2 = lockedOut.attemptsRemaining;
            }
            if ((i & 4) != 0) {
                z = lockedOut.afterIncorrectPin;
            }
            return new LockedOut(num, num2, z);
        }

        public final Integer component1() {
            return this.backoffInSeconds;
        }

        public final Integer component2() {
            return this.attemptsRemaining;
        }

        public final boolean component3() {
            return this.afterIncorrectPin;
        }

        public final LockedOut copy(Integer num, Integer num2, boolean z) {
            return new LockedOut(num, num2, z);
        }

        public final boolean getAfterIncorrectPin() {
            return this.afterIncorrectPin;
        }

        public final Integer getAttemptsRemaining() {
            return this.attemptsRemaining;
        }

        public final Integer getBackoffInSeconds() {
            return this.backoffInSeconds;
        }

        public int hashCode() {
            return C0KA.A00(((AnonymousClass006.A0D(this.backoffInSeconds) * 31) + C06G.A04(this.attemptsRemaining)) * 31, this.afterIncorrectPin);
        }

        public LockedOut(Integer num, Integer num2, boolean z) {
            this.backoffInSeconds = num;
            this.attemptsRemaining = num2;
            this.afterIncorrectPin = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class PermanentlyLocked implements ConfidentialVmVerifyResult {
        public static final PermanentlyLocked INSTANCE = new PermanentlyLocked();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PermanentlyLocked);
        }

        public String toString() {
            return "PermanentlyLocked";
        }

        public int hashCode() {
            return 769360241;
        }
    }

    public final class Success implements ConfidentialVmVerifyResult {
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return -1222706481;
        }
    }

    public final class WrongPin extends C06G implements ConfidentialVmVerifyResult {
        public final Integer attemptsRemaining;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof WrongPin) && C7384Etj.areEqual(this.attemptsRemaining, ((WrongPin) obj).attemptsRemaining));
        }

        public static /* synthetic */ WrongPin copy$default(WrongPin wrongPin, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = wrongPin.attemptsRemaining;
            }
            return new WrongPin(num);
        }

        public final Integer component1() {
            return this.attemptsRemaining;
        }

        public final WrongPin copy(Integer num) {
            return new WrongPin(num);
        }

        public final Integer getAttemptsRemaining() {
            return this.attemptsRemaining;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.attemptsRemaining);
        }

        public WrongPin(Integer num) {
            this.attemptsRemaining = num;
        }

        public String toString() {
            return super.toString();
        }
    }
}
