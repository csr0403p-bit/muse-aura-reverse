package com.facebook.aura.confidentialvm.model;

import X.C7384Etj;
import com.facebook.aura.confidentialvm.HatchVmAccessState;

/* loaded from: classes.dex */
public abstract class ConfidentialVmRegisterPinViewModelKt {
    public static final int RECOVERY_PIN_LENGTH = 6;
    public static final String TAG = "ConfidentialVmRegisterPinViewModel";

    public static final boolean shouldReconnectAfterCredentialAvailable(boolean z, HatchVmAccessState hatchVmAccessState) {
        C7384Etj.A0Y(hatchVmAccessState, 1);
        return !z || (hatchVmAccessState instanceof HatchVmAccessState.EnrollmentRequired) || (hatchVmAccessState instanceof HatchVmAccessState.EnrollmentRecoveryRequired) || (hatchVmAccessState instanceof HatchVmAccessState.RecoveryRequired);
    }
}
