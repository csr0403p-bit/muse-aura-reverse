package com.facebook.aura.confidentialvm.model;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;

/* loaded from: classes.dex */
public interface ConfidentialVmSwitchStep {

    public final class Close implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public static final Close INSTANCE = new Close();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public String toString() {
            return "Close";
        }

        public int hashCode() {
            return -2035087155;
        }
    }

    public final class ConfirmDelete implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public static final ConfirmDelete INSTANCE = new ConfirmDelete();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmDelete);
        }

        public String toString() {
            return "ConfirmDelete";
        }

        public int hashCode() {
            return -1349005728;
        }
    }

    public final class CreatePin extends C06G implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public final RegisterPinEntryPoint entryPoint;

        public CreatePin(RegisterPinEntryPoint registerPinEntryPoint) {
            C7384Etj.A0Y(registerPinEntryPoint, 0);
            this.entryPoint = registerPinEntryPoint;
        }

        public final CreatePin copy(RegisterPinEntryPoint registerPinEntryPoint) {
            C7384Etj.A0Y(registerPinEntryPoint, 0);
            return new CreatePin(registerPinEntryPoint);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CreatePin) && this.entryPoint == ((CreatePin) obj).entryPoint);
        }

        public static /* synthetic */ CreatePin copy$default(CreatePin createPin, RegisterPinEntryPoint registerPinEntryPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                registerPinEntryPoint = createPin.entryPoint;
            }
            C7384Etj.A0Y(registerPinEntryPoint, 0);
            return new CreatePin(registerPinEntryPoint);
        }

        public final RegisterPinEntryPoint component1() {
            return this.entryPoint;
        }

        public final RegisterPinEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class DataChoice implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public static final DataChoice INSTANCE = new DataChoice();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DataChoice);
        }

        public String toString() {
            return "DataChoice";
        }

        public int hashCode() {
            return 1715119158;
        }
    }

    public final class DataChoiceAfterSubscribing implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public static final DataChoiceAfterSubscribing INSTANCE = new DataChoiceAfterSubscribing();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DataChoiceAfterSubscribing);
        }

        public String toString() {
            return "DataChoiceAfterSubscribing";
        }

        public int hashCode() {
            return 278998113;
        }
    }

    public final class DataTransferConfirm implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public static final DataTransferConfirm INSTANCE = new DataTransferConfirm();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DataTransferConfirm);
        }

        public String toString() {
            return "DataTransferConfirm";
        }

        public int hashCode() {
            return 340355424;
        }
    }

    public final class DataTransferProgress extends C06G implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public final ConfidentialVmSwitchDirection direction;

        public DataTransferProgress(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
            C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
            this.direction = confidentialVmSwitchDirection;
        }

        public final DataTransferProgress copy(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
            C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
            return new DataTransferProgress(confidentialVmSwitchDirection);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DataTransferProgress) && this.direction == ((DataTransferProgress) obj).direction);
        }

        public static /* synthetic */ DataTransferProgress copy$default(DataTransferProgress dataTransferProgress, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, int i, Object obj) {
            if ((i & 1) != 0) {
                confidentialVmSwitchDirection = dataTransferProgress.direction;
            }
            C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
            return new DataTransferProgress(confidentialVmSwitchDirection);
        }

        public final ConfidentialVmSwitchDirection component1() {
            return this.direction;
        }

        public final ConfidentialVmSwitchDirection getDirection() {
            return this.direction;
        }

        public int hashCode() {
            return this.direction.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class EnterPin extends C06G implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public final RegisterPinEntryPoint entryPoint;

        public EnterPin(RegisterPinEntryPoint registerPinEntryPoint) {
            C7384Etj.A0Y(registerPinEntryPoint, 0);
            this.entryPoint = registerPinEntryPoint;
        }

        public final EnterPin copy(RegisterPinEntryPoint registerPinEntryPoint) {
            C7384Etj.A0Y(registerPinEntryPoint, 0);
            return new EnterPin(registerPinEntryPoint);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof EnterPin) && this.entryPoint == ((EnterPin) obj).entryPoint);
        }

        public static /* synthetic */ EnterPin copy$default(EnterPin enterPin, RegisterPinEntryPoint registerPinEntryPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                registerPinEntryPoint = enterPin.entryPoint;
            }
            C7384Etj.A0Y(registerPinEntryPoint, 0);
            return new EnterPin(registerPinEntryPoint);
        }

        public final RegisterPinEntryPoint component1() {
            return this.entryPoint;
        }

        public final RegisterPinEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Progress extends C06G implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public final ConfidentialVmSwitchDirection direction;

        public Progress(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
            C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
            this.direction = confidentialVmSwitchDirection;
        }

        public final Progress copy(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
            C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
            return new Progress(confidentialVmSwitchDirection);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Progress) && this.direction == ((Progress) obj).direction);
        }

        public static /* synthetic */ Progress copy$default(Progress progress, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, int i, Object obj) {
            if ((i & 1) != 0) {
                confidentialVmSwitchDirection = progress.direction;
            }
            C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
            return new Progress(confidentialVmSwitchDirection);
        }

        public final ConfidentialVmSwitchDirection component1() {
            return this.direction;
        }

        public final ConfidentialVmSwitchDirection getDirection() {
            return this.direction;
        }

        public int hashCode() {
            return this.direction.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ReturnToDataChoice implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public static final ReturnToDataChoice INSTANCE = new ReturnToDataChoice();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReturnToDataChoice);
        }

        public String toString() {
            return "ReturnToDataChoice";
        }

        public int hashCode() {
            return 495370081;
        }
    }

    public final class ReviewArtifacts implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public static final ReviewArtifacts INSTANCE = new ReviewArtifacts();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReviewArtifacts);
        }

        public String toString() {
            return "ReviewArtifacts";
        }

        public int hashCode() {
            return -634387202;
        }
    }

    public final class Subscribe implements ConfidentialVmSwitchStep {
        public static final int $stable = 0;
        public static final Subscribe INSTANCE = new Subscribe();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Subscribe);
        }

        public String toString() {
            return "Subscribe";
        }

        public int hashCode() {
            return -1395550817;
        }
    }
}
