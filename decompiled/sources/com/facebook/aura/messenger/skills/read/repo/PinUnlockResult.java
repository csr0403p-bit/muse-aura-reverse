package com.facebook.aura.messenger.skills.read.repo;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;
import com.facebook.aura.messenger.skills.read.model.PinError;

/* loaded from: classes3.dex */
public interface PinUnlockResult {

    public final class ConnectivityError implements PinUnlockResult {
        public static final ConnectivityError INSTANCE = new ConnectivityError();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectivityError);
        }

        public String toString() {
            return "ConnectivityError";
        }

        public int hashCode() {
            return -1521565164;
        }
    }

    public final class Success implements PinUnlockResult {
        public static final Success INSTANCE = new Success();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public String toString() {
            return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
        }

        public int hashCode() {
            return 1477904198;
        }
    }

    public final class WrongPin extends C06G implements PinUnlockResult {
        public final PinError error;

        public WrongPin(PinError pinError) {
            C7384Etj.A0Y(pinError, 0);
            this.error = pinError;
        }

        public final WrongPin copy(PinError pinError) {
            C7384Etj.A0Y(pinError, 0);
            return new WrongPin(pinError);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof WrongPin) && C7384Etj.areEqual(this.error, ((WrongPin) obj).error));
        }

        public static /* synthetic */ WrongPin copy$default(WrongPin wrongPin, PinError pinError, int i, Object obj) {
            if ((i & 1) != 0) {
                pinError = wrongPin.error;
            }
            C7384Etj.A0Y(pinError, 0);
            return new WrongPin(pinError);
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
}
