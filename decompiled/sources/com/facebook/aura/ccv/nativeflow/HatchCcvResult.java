package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface HatchCcvResult {

    public final class Failed extends C06G implements HatchCcvResult {
        public final HatchCcvError error;
        public final String serverMessage;
        public final String serverTitle;

        public Failed(HatchCcvError hatchCcvError, String str, String str2) {
            C7384Etj.A0Y(hatchCcvError, 0);
            this.error = hatchCcvError;
            this.serverTitle = str;
            this.serverMessage = str2;
        }

        public final Failed copy(HatchCcvError hatchCcvError, String str, String str2) {
            C7384Etj.A0Y(hatchCcvError, 0);
            return new Failed(hatchCcvError, str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failed) {
                    Failed failed = (Failed) obj;
                    if (this.error != failed.error || !C7384Etj.areEqual(this.serverTitle, failed.serverTitle) || !C7384Etj.areEqual(this.serverMessage, failed.serverMessage)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, HatchCcvError hatchCcvError, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchCcvError = failed.error;
            }
            if ((i & 2) != 0) {
                str = failed.serverTitle;
            }
            if ((i & 4) != 0) {
                str2 = failed.serverMessage;
            }
            return failed.copy(hatchCcvError, str, str2);
        }

        public final HatchCcvError component1() {
            return this.error;
        }

        public final String component2() {
            return this.serverTitle;
        }

        public final String component3() {
            return this.serverMessage;
        }

        public final HatchCcvError getError() {
            return this.error;
        }

        public final String getServerMessage() {
            return this.serverMessage;
        }

        public final String getServerTitle() {
            return this.serverTitle;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0E(this.error) + AnonymousClass006.A0G(this.serverTitle)) * 31) + AnonymousClass005.A0H(this.serverMessage);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Failed(HatchCcvError hatchCcvError, String str, String str2, int i, C06H c06h) {
            this(hatchCcvError, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    public final class InvalidThreeDSStepUp implements HatchCcvResult {
        public static final InvalidThreeDSStepUp INSTANCE = new InvalidThreeDSStepUp();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidThreeDSStepUp);
        }

        public String toString() {
            return "InvalidThreeDSStepUp";
        }

        public int hashCode() {
            return -1439543881;
        }
    }

    public final class Pending extends C06G implements HatchCcvResult {
        public final String orderId;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Pending) && C7384Etj.areEqual(this.orderId, ((Pending) obj).orderId));
        }

        public static /* synthetic */ Pending copy$default(Pending pending, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pending.orderId;
            }
            return new Pending(str);
        }

        public final String component1() {
            return this.orderId;
        }

        public final Pending copy(String str) {
            return new Pending(str);
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.orderId);
        }

        public Pending(String str) {
            this.orderId = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success extends C06G implements HatchCcvResult {
        public final String orderId;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.orderId, ((Success) obj).orderId));
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.orderId;
            }
            return new Success(str);
        }

        public final String component1() {
            return this.orderId;
        }

        public final Success copy(String str) {
            return new Success(str);
        }

        public final String getOrderId() {
            return this.orderId;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.orderId);
        }

        public Success(String str) {
            this.orderId = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ThreeDSStepUpRequired extends C06G implements HatchCcvResult {
        public final HatchCheckoutCharge charge;
        public final HatchThreeDSStepUp stepUp;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ThreeDSStepUpRequired) {
                    ThreeDSStepUpRequired threeDSStepUpRequired = (ThreeDSStepUpRequired) obj;
                    if (!C7384Etj.areEqual(this.stepUp, threeDSStepUpRequired.stepUp) || !C7384Etj.areEqual(this.charge, threeDSStepUpRequired.charge)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ThreeDSStepUpRequired copy$default(ThreeDSStepUpRequired threeDSStepUpRequired, HatchThreeDSStepUp hatchThreeDSStepUp, HatchCheckoutCharge hatchCheckoutCharge, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchThreeDSStepUp = threeDSStepUpRequired.stepUp;
            }
            if ((i & 2) != 0) {
                hatchCheckoutCharge = threeDSStepUpRequired.charge;
            }
            AnonymousClass003.A0u(hatchThreeDSStepUp, hatchCheckoutCharge);
            return new ThreeDSStepUpRequired(hatchThreeDSStepUp, hatchCheckoutCharge);
        }

        public final HatchThreeDSStepUp component1() {
            return this.stepUp;
        }

        public final HatchCheckoutCharge component2() {
            return this.charge;
        }

        public final HatchCheckoutCharge getCharge() {
            return this.charge;
        }

        public final HatchThreeDSStepUp getStepUp() {
            return this.stepUp;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.charge, AnonymousClass005.A0E(this.stepUp));
        }

        public ThreeDSStepUpRequired(HatchThreeDSStepUp hatchThreeDSStepUp, HatchCheckoutCharge hatchCheckoutCharge) {
            AnonymousClass003.A0u(hatchThreeDSStepUp, hatchCheckoutCharge);
            this.stepUp = hatchThreeDSStepUp;
            this.charge = hatchCheckoutCharge;
        }

        public final ThreeDSStepUpRequired copy(HatchThreeDSStepUp hatchThreeDSStepUp, HatchCheckoutCharge hatchCheckoutCharge) {
            AnonymousClass003.A0u(hatchThreeDSStepUp, hatchCheckoutCharge);
            return new ThreeDSStepUpRequired(hatchThreeDSStepUp, hatchCheckoutCharge);
        }

        public String toString() {
            return super.toString();
        }
    }
}
