package com.facebook.aura.storagerecovery.data;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface HatchStorageRecoveryState {

    public final class Active extends C06G implements HatchStorageRecoveryState {
        public final HatchStorageRecoveryStatus status;

        public Active(HatchStorageRecoveryStatus hatchStorageRecoveryStatus) {
            C7384Etj.A0Y(hatchStorageRecoveryStatus, 0);
            this.status = hatchStorageRecoveryStatus;
        }

        public final Active copy(HatchStorageRecoveryStatus hatchStorageRecoveryStatus) {
            C7384Etj.A0Y(hatchStorageRecoveryStatus, 0);
            return new Active(hatchStorageRecoveryStatus);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Active) && C7384Etj.areEqual(this.status, ((Active) obj).status));
        }

        public static /* synthetic */ Active copy$default(Active active, HatchStorageRecoveryStatus hatchStorageRecoveryStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchStorageRecoveryStatus = active.status;
            }
            C7384Etj.A0Y(hatchStorageRecoveryStatus, 0);
            return new Active(hatchStorageRecoveryStatus);
        }

        public final HatchStorageRecoveryStatus component1() {
            return this.status;
        }

        public final HatchStorageRecoveryStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Available implements HatchStorageRecoveryState {
        public static final Available INSTANCE = new Available();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Available);
        }

        public String toString() {
            return "Available";
        }

        public int hashCode() {
            return -231024794;
        }
    }

    public final class Inactive implements HatchStorageRecoveryState {
        public static final Inactive INSTANCE = new Inactive();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Inactive);
        }

        public String toString() {
            return "Inactive";
        }

        public int hashCode() {
            return 1426360366;
        }
    }

    public final class Reconnecting implements HatchStorageRecoveryState {
        public static final Reconnecting INSTANCE = new Reconnecting();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Reconnecting);
        }

        public String toString() {
            return "Reconnecting";
        }

        public int hashCode() {
            return 324352878;
        }
    }

    public final class Required implements HatchStorageRecoveryState {
        public static final Required INSTANCE = new Required();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Required);
        }

        public String toString() {
            return "Required";
        }

        public int hashCode() {
            return 1008555874;
        }
    }
}
