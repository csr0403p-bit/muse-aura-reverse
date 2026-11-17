package com.facebook.aura.activation.model;

import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.confidentialvm.HatchVmAccessState;

/* loaded from: classes2.dex */
public abstract class AuraActivationViewModelKt {
    public static final char AGE_CHOICE_SEPARATOR = '/';
    public static final String FAILURE_REASON_EXCEPTION = "exception";
    public static final String FAILURE_REASON_NO_VMS = "no_vms";
    public static final String KEY_AGE_CHOICE = "age_step_choice";
    public static final int LEASE_MAX_ATTEMPTS = 3;
    public static final String OTHER_AGE_METHODS = "OTHER_METHODS";
    public static final String SELFIE_UNAVAILABLE = "SELFIE_UNAVAILABLE";
    public static final String TAG = "AuraActivationViewModel";
    public static final String VM_REQUEST_TYPE_FETCH = "fetch_vms";
    public static final String VM_REQUEST_TYPE_LEASE = "lease_vm";
    public static final String VM_REQUEST_TYPE_NONE = "none";

    public static final boolean resolveVmAdmissionReadiness(Boolean bool, HatchVmAccessState hatchVmAccessState, boolean z) {
        C7384Etj.A0Y(hatchVmAccessState, 1);
        if (bool == null) {
            return false;
        }
        if (bool.equals(false)) {
            return z;
        }
        if (bool.equals(true)) {
            return hatchVmAccessState instanceof HatchVmAccessState.Ready;
        }
        throw C3cG.A0q();
    }
}
