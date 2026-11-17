package com.facebook.aura.confidentialvm;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface HatchVmAccessState {

    /* renamed from: com.facebook.aura.confidentialvm.HatchVmAccessState$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static boolean $default$endsCredentialSubmission(HatchVmAccessState hatchVmAccessState) {
            return (hatchVmAccessState instanceof Ready) || (hatchVmAccessState instanceof RecoveryRequired) || (hatchVmAccessState instanceof EnrollmentRecoveryRequired) || (hatchVmAccessState instanceof EnrollmentRequired) || (hatchVmAccessState instanceof RetriableFailure) || (hatchVmAccessState instanceof AttestationFailure) || (hatchVmAccessState instanceof SecurityFailure);
        }
    }

    /* loaded from: classes.dex */
    public final class AttestationFailure implements HatchVmAccessState {
        public static final AttestationFailure INSTANCE = new AttestationFailure();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AttestationFailure);
        }

        public String toString() {
            return "AttestationFailure";
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public int hashCode() {
            return 1548428595;
        }
    }

    /* loaded from: classes.dex */
    public final class AwaitingEligibility implements HatchVmAccessState {
        public static final AwaitingEligibility INSTANCE = new AwaitingEligibility();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AwaitingEligibility);
        }

        public String toString() {
            return "AwaitingEligibility";
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public int hashCode() {
            return -1355977816;
        }
    }

    /* loaded from: classes.dex */
    public final class EnrollmentRecoveryRequired implements HatchVmAccessState {
        public static final EnrollmentRecoveryRequired INSTANCE = new EnrollmentRecoveryRequired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnrollmentRecoveryRequired);
        }

        public String toString() {
            return "EnrollmentRecoveryRequired";
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public int hashCode() {
            return 1649591569;
        }
    }

    /* loaded from: classes.dex */
    public final class EnrollmentRequired implements HatchVmAccessState {
        public static final EnrollmentRequired INSTANCE = new EnrollmentRequired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnrollmentRequired);
        }

        public String toString() {
            return "EnrollmentRequired";
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public int hashCode() {
            return 499471196;
        }
    }

    public final class Ready extends C06G implements HatchVmAccessState {
        public final HatchVmPeerType peerType;

        public Ready(HatchVmPeerType hatchVmPeerType) {
            C7384Etj.A0Y(hatchVmPeerType, 0);
            this.peerType = hatchVmPeerType;
        }

        public final Ready copy(HatchVmPeerType hatchVmPeerType) {
            C7384Etj.A0Y(hatchVmPeerType, 0);
            return new Ready(hatchVmPeerType);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Ready) && this.peerType == ((Ready) obj).peerType);
        }

        public static /* synthetic */ Ready copy$default(Ready ready, HatchVmPeerType hatchVmPeerType, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchVmPeerType = ready.peerType;
            }
            C7384Etj.A0Y(hatchVmPeerType, 0);
            return new Ready(hatchVmPeerType);
        }

        public final HatchVmPeerType component1() {
            return this.peerType;
        }

        public final HatchVmPeerType getPeerType() {
            return this.peerType;
        }

        public int hashCode() {
            return this.peerType.hashCode();
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class RecoveryRequired implements HatchVmAccessState {
        public static final RecoveryRequired INSTANCE = new RecoveryRequired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RecoveryRequired);
        }

        public String toString() {
            return "RecoveryRequired";
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public int hashCode() {
            return 2009178413;
        }
    }

    public final class Resolving implements HatchVmAccessState {
        public static final Resolving INSTANCE = new Resolving();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Resolving);
        }

        public String toString() {
            return "Resolving";
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public int hashCode() {
            return -2016612624;
        }
    }

    public final class Resuming extends C06G implements HatchVmAccessState {
        public final HatchVmPeerType peerType;

        public Resuming(HatchVmPeerType hatchVmPeerType) {
            C7384Etj.A0Y(hatchVmPeerType, 0);
            this.peerType = hatchVmPeerType;
        }

        public final Resuming copy(HatchVmPeerType hatchVmPeerType) {
            C7384Etj.A0Y(hatchVmPeerType, 0);
            return new Resuming(hatchVmPeerType);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Resuming) && this.peerType == ((Resuming) obj).peerType);
        }

        public static /* synthetic */ Resuming copy$default(Resuming resuming, HatchVmPeerType hatchVmPeerType, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchVmPeerType = resuming.peerType;
            }
            C7384Etj.A0Y(hatchVmPeerType, 0);
            return new Resuming(hatchVmPeerType);
        }

        public final HatchVmPeerType component1() {
            return this.peerType;
        }

        public final HatchVmPeerType getPeerType() {
            return this.peerType;
        }

        public int hashCode() {
            return this.peerType.hashCode();
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class RetriableFailure implements HatchVmAccessState {
        public static final RetriableFailure INSTANCE = new RetriableFailure();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RetriableFailure);
        }

        public String toString() {
            return "RetriableFailure";
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public int hashCode() {
            return -247717871;
        }
    }

    /* loaded from: classes.dex */
    public final class SecurityFailure implements HatchVmAccessState {
        public static final SecurityFailure INSTANCE = new SecurityFailure();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SecurityFailure);
        }

        public String toString() {
            return "SecurityFailure";
        }

        @Override // com.facebook.aura.confidentialvm.HatchVmAccessState
        public /* bridge */ boolean endsCredentialSubmission() {
            return CC.$default$endsCredentialSubmission(this);
        }

        public int hashCode() {
            return -2036272079;
        }
    }

    boolean endsCredentialSubmission();

    /* loaded from: classes.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static boolean endsCredentialSubmission(HatchVmAccessState hatchVmAccessState) {
            return CC.$default$endsCredentialSubmission(hatchVmAccessState);
        }
    }
}
