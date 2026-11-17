package com.facebook.aura.confidentialvm;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.confidentialvm.HatchVmAccessState;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration;
import com.facebook.aura.gateway.HatchCvmAuthenticationState;
import com.facebook.aura.gateway.HatchCvmReplaceStoreKt;
import com.facebook.aura.gateway.HatchCvmReplacement;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;

/* loaded from: classes2.dex */
public abstract class HatchVmAccessControllerKt {
    public static final String NOISE_ATTESTATION_FAILED = "noise.handshake.attestation_failed";
    public static final String NOISE_FRESH_KEY_UNPINNED = "noise.handshake.private_auth.fresh_key_unpinned";
    public static final String NOISE_VM_PROOF_FAILED = "noise.handshake.private_auth.vm_proof_failed";

    public static final boolean completesCredentialReconnect(int i, HatchVmAccessState hatchVmAccessState, int i2) {
        C7384Etj.A0Y(hatchVmAccessState, 1);
        return i >= i2 && hatchVmAccessState.endsCredentialSubmission();
    }

    public static final HatchVmAccessState enrollmentPromptState(ConfidentialVmVestaRegistration confidentialVmVestaRegistration) {
        HatchVmAccessState hatchVmAccessState;
        int iA0E = AnonymousClass001.A0E(confidentialVmVestaRegistration, 0);
        if (iA0E == 0) {
            hatchVmAccessState = HatchVmAccessState.EnrollmentRecoveryRequired.INSTANCE;
        } else if (iA0E == 1) {
            hatchVmAccessState = HatchVmAccessState.EnrollmentRequired.INSTANCE;
        } else {
            if (iA0E != 2) {
                throw C3cG.A0q();
            }
            hatchVmAccessState = HatchVmAccessState.RetriableFailure.INSTANCE;
        }
        return hatchVmAccessState;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.confidentialvm.HatchVmAccessState reduceHatchVmAccessState(com.facebook.aura.user.provider.AuraUserData r3, com.facebook.aura.gateway.HatchGatewayStateSnapshot r4, com.facebook.aura.confidentialvm.HatchVmPeerType r5) {
        /*
            r2 = 1
            X.C7384Etj.A0Y(r4, r2)
            if (r3 == 0) goto L15
            java.lang.Boolean r1 = r3.hasHatchAccess
            r0 = 0
            boolean r0 = X.AnonymousClass002.A1b(r1, r0)
            if (r0 != 0) goto L15
            boolean r0 = r3.hasCompletedHatchActivation
            if (r1 != 0) goto L1a
            if (r0 != 0) goto L1a
        L15:
            com.facebook.aura.confidentialvm.HatchVmAccessState$AwaitingEligibility r1 = com.facebook.aura.confidentialvm.HatchVmAccessState.AwaitingEligibility.INSTANCE
        L17:
            com.facebook.aura.confidentialvm.HatchVmAccessState r1 = (com.facebook.aura.confidentialvm.HatchVmAccessState) r1
            return r1
        L1a:
            java.lang.Boolean r0 = r3.hasProvisionedVm
            boolean r0 = X.AnonymousClass002.A1b(r0, r2)
            if (r0 == 0) goto L15
            com.facebook.aura.gateway.HatchCvmAuthenticationState r3 = r4.authentication
            com.facebook.aura.gateway.HatchCvmAuthenticationState$EnrollmentRequired r0 = com.facebook.aura.gateway.HatchCvmAuthenticationState.EnrollmentRequired.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 == 0) goto L2f
            com.facebook.aura.confidentialvm.HatchVmAccessState$EnrollmentRequired r1 = com.facebook.aura.confidentialvm.HatchVmAccessState.EnrollmentRequired.INSTANCE
            goto L17
        L2f:
            com.facebook.aura.gateway.HatchCvmAuthenticationState$RecoveryRequired r0 = com.facebook.aura.gateway.HatchCvmAuthenticationState.RecoveryRequired.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 != 0) goto Lb3
            com.facebook.aura.gateway.HatchCvmAuthenticationState$VerificationFailed r0 = com.facebook.aura.gateway.HatchCvmAuthenticationState.VerificationFailed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            r1 = 0
            if (r0 == 0) goto L62
            com.facebook.aura.gateway.HatchGatewayConnectionState r2 = r4.connection
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
            if (r0 == 0) goto L4c
            com.facebook.aura.gateway.HatchGatewayConnectionState$Error r2 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Error) r2
            if (r2 == 0) goto L4c
            java.lang.String r1 = r2.message
        L4c:
            java.lang.String r0 = "noise.handshake.attestation_failed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L57
            com.facebook.aura.confidentialvm.HatchVmAccessState$AttestationFailure r1 = com.facebook.aura.confidentialvm.HatchVmAccessState.AttestationFailure.INSTANCE
            goto L17
        L57:
            java.lang.String r0 = "noise.handshake.private_auth.vm_proof_failed"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb3
            com.facebook.aura.confidentialvm.HatchVmAccessState$SecurityFailure r1 = com.facebook.aura.confidentialvm.HatchVmAccessState.SecurityFailure.INSTANCE
            goto L17
        L62:
            com.facebook.aura.gateway.HatchCvmAuthenticationState$Ready r0 = com.facebook.aura.gateway.HatchCvmAuthenticationState.Ready.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 == 0) goto L7c
            com.facebook.aura.gateway.HatchGatewayConnectionState r1 = r4.connection
            com.facebook.aura.gateway.HatchGatewayConnectionState$Connected r0 = com.facebook.aura.gateway.HatchGatewayConnectionState.Connected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto Lb7
            com.facebook.aura.confidentialvm.HatchVmPeerType r0 = com.facebook.aura.confidentialvm.HatchVmPeerType.CONFIDENTIAL
        L76:
            com.facebook.aura.confidentialvm.HatchVmAccessState$Ready r1 = new com.facebook.aura.confidentialvm.HatchVmAccessState$Ready
            r1.<init>(r0)
            return r1
        L7c:
            com.facebook.aura.gateway.HatchCvmAuthenticationState$Disabled r0 = com.facebook.aura.gateway.HatchCvmAuthenticationState.Disabled.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 == 0) goto L91
            com.facebook.aura.gateway.HatchGatewayConnectionState r1 = r4.connection
            com.facebook.aura.gateway.HatchGatewayConnectionState$Connected r0 = com.facebook.aura.gateway.HatchGatewayConnectionState.Connected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto Lb7
            com.facebook.aura.confidentialvm.HatchVmPeerType r0 = com.facebook.aura.confidentialvm.HatchVmPeerType.STANDARD
            goto L76
        L91:
            com.facebook.aura.gateway.HatchCvmAuthenticationState$Verifying r0 = com.facebook.aura.gateway.HatchCvmAuthenticationState.Verifying.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 != 0) goto Lc7
            com.facebook.aura.gateway.HatchCvmAuthenticationState$Failed r0 = com.facebook.aura.gateway.HatchCvmAuthenticationState.Failed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 == 0) goto Lc2
            com.facebook.aura.gateway.HatchGatewayConnectionState r1 = r4.connection
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
            if (r0 == 0) goto Lc7
            com.facebook.aura.gateway.HatchGatewayConnectionState$Error r1 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Error) r1
            if (r1 == 0) goto Lc7
            boolean r0 = r1.retriesExhausted
            if (r0 != r2) goto Lc7
            com.facebook.aura.confidentialvm.HatchVmAccessState$RetriableFailure r1 = com.facebook.aura.confidentialvm.HatchVmAccessState.RetriableFailure.INSTANCE
            goto L17
        Lb3:
            com.facebook.aura.confidentialvm.HatchVmAccessState$RecoveryRequired r1 = com.facebook.aura.confidentialvm.HatchVmAccessState.RecoveryRequired.INSTANCE
            goto L17
        Lb7:
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Error
            if (r0 == 0) goto Lc7
            com.facebook.aura.gateway.HatchGatewayConnectionState$Error r1 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Error) r1
            com.facebook.aura.confidentialvm.HatchVmAccessState r1 = reduceHatchVmAccessState$terminalOrResuming(r5, r1)
            return r1
        Lc2:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lc7:
            com.facebook.aura.confidentialvm.HatchVmAccessState r1 = reduceHatchVmAccessState$resumingOrResolving(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.HatchVmAccessControllerKt.reduceHatchVmAccessState(com.facebook.aura.user.provider.AuraUserData, com.facebook.aura.gateway.HatchGatewayStateSnapshot, com.facebook.aura.confidentialvm.HatchVmPeerType):com.facebook.aura.confidentialvm.HatchVmAccessState");
    }

    public static final boolean shouldApplyStoredCredentialContinuation(HatchCvmAuthenticationState hatchCvmAuthenticationState) {
        C7384Etj.A0Y(hatchCvmAuthenticationState, 0);
        return hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.RecoveryRequired.INSTANCE) || hatchCvmAuthenticationState.equals(HatchCvmAuthenticationState.EnrollmentRequired.INSTANCE);
    }

    public static final StoredCredentialContinuation storedCredentialContinuation(ConfidentialVmRvKeyResolution confidentialVmRvKeyResolution, boolean z) {
        C7384Etj.A0Y(confidentialVmRvKeyResolution, 0);
        if (confidentialVmRvKeyResolution instanceof ConfidentialVmRvKeyResolution.Available) {
            ((ConfidentialVmRvKeyResolution.Available) confidentialVmRvKeyResolution).key.close();
            return z ? StoredCredentialContinuation.SECURITY_FAILURE : StoredCredentialContinuation.RETRY;
        }
        if (confidentialVmRvKeyResolution.equals(ConfidentialVmRvKeyResolution.NoStoredSecret.INSTANCE) || confidentialVmRvKeyResolution.equals(ConfidentialVmRvKeyResolution.UnreadableSecret.INSTANCE)) {
            return StoredCredentialContinuation.SHOW_PROMPT;
        }
        if (confidentialVmRvKeyResolution.equals(ConfidentialVmRvKeyResolution.DeviceLocked.INSTANCE) || confidentialVmRvKeyResolution.equals(ConfidentialVmRvKeyResolution.Failure.INSTANCE)) {
            return StoredCredentialContinuation.RETRIABLE_FAILURE;
        }
        throw C3cG.A0q();
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmVestaRegistration.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmVestaRegistration.REGISTERED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmVestaRegistration.NOT_REGISTERED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmVestaRegistration.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String accessStateForLog(HatchVmAccessState hatchVmAccessState) {
        String strName;
        String str;
        if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.AwaitingEligibility.INSTANCE)) {
            return "awaiting_eligibility";
        }
        if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.Resolving.INSTANCE)) {
            return "resolving";
        }
        if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.RecoveryRequired.INSTANCE)) {
            return "recovery_required";
        }
        if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.EnrollmentRecoveryRequired.INSTANCE)) {
            return "enrollment_recovery_required";
        }
        if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.EnrollmentRequired.INSTANCE)) {
            return "enrollment_required";
        }
        if (hatchVmAccessState instanceof HatchVmAccessState.Ready) {
            strName = ((HatchVmAccessState.Ready) hatchVmAccessState).peerType.name();
            str = "ready_";
        } else {
            if (!(hatchVmAccessState instanceof HatchVmAccessState.Resuming)) {
                if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.RetriableFailure.INSTANCE)) {
                    return "retriable_failure";
                }
                if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.AttestationFailure.INSTANCE)) {
                    return "attestation_failure";
                }
                if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.SecurityFailure.INSTANCE)) {
                    return "security_failure";
                }
                throw C3cG.A0q();
            }
            strName = ((HatchVmAccessState.Resuming) hatchVmAccessState).peerType.name();
            str = "resuming_";
        }
        return FGI.A0M(str, strName);
    }

    public static final boolean isFreshKeyUnpinned(HatchGatewayStateSnapshot hatchGatewayStateSnapshot) {
        HatchGatewayConnectionState.Error error;
        HatchGatewayConnectionState hatchGatewayConnectionState = hatchGatewayStateSnapshot.connection;
        String str = null;
        if ((hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Error) && (error = (HatchGatewayConnectionState.Error) hatchGatewayConnectionState) != null) {
            str = error.message;
        }
        return NOISE_FRESH_KEY_UNPINNED.equals(str);
    }

    public static final HatchVmAccessState reduceHatchVmAccessState$resumingOrResolving(HatchVmPeerType hatchVmPeerType) {
        return hatchVmPeerType != null ? new HatchVmAccessState.Resuming(hatchVmPeerType) : HatchVmAccessState.Resolving.INSTANCE;
    }

    public static final HatchVmAccessState reduceHatchVmAccessState$terminalOrResuming(HatchVmPeerType hatchVmPeerType, HatchGatewayConnectionState.Error error) {
        return error.retriesExhausted ? HatchVmAccessState.RetriableFailure.INSTANCE : reduceHatchVmAccessState$resumingOrResolving(hatchVmPeerType);
    }

    public static final boolean showsMaintenance(HatchCvmReplacement.Active active, HatchVmAccessState hatchVmAccessState) {
        boolean zIsAwaitingChipPinnedUnlock;
        if (C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.RecoveryRequired.INSTANCE)) {
            if (!HatchCvmReplaceStoreKt.isAwaitingChipPinnedUnlock(active)) {
                zIsAwaitingChipPinnedUnlock = HatchCvmReplaceStoreKt.isAwaitingChipSelection(active);
            }
        }
        if (!C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.EnrollmentRequired.INSTANCE) && !C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.EnrollmentRecoveryRequired.INSTANCE) && !(hatchVmAccessState instanceof HatchVmAccessState.Ready)) {
            if (!C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.AwaitingEligibility.INSTANCE) && !C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.Resolving.INSTANCE) && !(hatchVmAccessState instanceof HatchVmAccessState.Resuming) && !C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.RetriableFailure.INSTANCE) && !C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.AttestationFailure.INSTANCE) && !C7384Etj.areEqual(hatchVmAccessState, HatchVmAccessState.SecurityFailure.INSTANCE)) {
                throw C3cG.A0q();
            }
        }
        zIsAwaitingChipPinnedUnlock = HatchCvmReplaceStoreKt.isAwaitingChipPinnedUnlock(active);
        return !zIsAwaitingChipPinnedUnlock;
    }
}
