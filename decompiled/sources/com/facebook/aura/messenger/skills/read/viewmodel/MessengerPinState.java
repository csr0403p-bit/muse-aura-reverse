package com.facebook.aura.messenger.skills.read.viewmodel;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;
import com.facebook.aura.messenger.skills.read.model.PinError;
import com.facebook.aura.navigation.key.MessengerPinLockoutReason;

/* loaded from: classes3.dex */
public interface MessengerPinState {

    public final class CheckingPinStatus implements MessengerPinState {
        public static final CheckingPinStatus INSTANCE = new CheckingPinStatus();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckingPinStatus);
        }

        public String toString() {
            return "CheckingPinStatus";
        }

        public int hashCode() {
            return 1254776653;
        }
    }

    public final class ConnectivityError implements MessengerPinState {
        public static final ConnectivityError INSTANCE = new ConnectivityError();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectivityError);
        }

        public String toString() {
            return "ConnectivityError";
        }

        public int hashCode() {
            return 1905281201;
        }
    }

    public final class Error extends C06G implements MessengerPinState {
        public final PinError error;

        public Error(PinError pinError) {
            C7384Etj.A0Y(pinError, 0);
            this.error = pinError;
        }

        public final Error copy(PinError pinError) {
            C7384Etj.A0Y(pinError, 0);
            return new Error(pinError);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Error) && C7384Etj.areEqual(this.error, ((Error) obj).error));
        }

        public static /* synthetic */ Error copy$default(Error error, PinError pinError, int i, Object obj) {
            if ((i & 1) != 0) {
                pinError = error.error;
            }
            C7384Etj.A0Y(pinError, 0);
            return new Error(pinError);
        }

        public final PinError component1() {
            return this.error;
        }

        public final PinError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Idle implements MessengerPinState {
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return 1525577140;
        }
    }

    public final class LockedOut extends C06G implements MessengerPinState {
        public final MessengerPinLockoutReason reason;

        public LockedOut(MessengerPinLockoutReason messengerPinLockoutReason) {
            C7384Etj.A0Y(messengerPinLockoutReason, 0);
            this.reason = messengerPinLockoutReason;
        }

        public final LockedOut copy(MessengerPinLockoutReason messengerPinLockoutReason) {
            C7384Etj.A0Y(messengerPinLockoutReason, 0);
            return new LockedOut(messengerPinLockoutReason);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LockedOut) && this.reason == ((LockedOut) obj).reason);
        }

        public static /* synthetic */ LockedOut copy$default(LockedOut lockedOut, MessengerPinLockoutReason messengerPinLockoutReason, int i, Object obj) {
            if ((i & 1) != 0) {
                messengerPinLockoutReason = lockedOut.reason;
            }
            C7384Etj.A0Y(messengerPinLockoutReason, 0);
            return new LockedOut(messengerPinLockoutReason);
        }

        public final MessengerPinLockoutReason component1() {
            return this.reason;
        }

        public final MessengerPinLockoutReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success implements MessengerPinState {
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return -111821277;
        }
    }

    public final class Verifying implements MessengerPinState {
        public static final Verifying INSTANCE = new Verifying();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Verifying);
        }

        public String toString() {
            return "Verifying";
        }

        public int hashCode() {
            return 1566869225;
        }
    }
}
