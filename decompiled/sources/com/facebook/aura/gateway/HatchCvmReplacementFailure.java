package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.BFI;
import java.util.Set;

/* loaded from: classes5.dex */
public final class HatchCvmReplacementFailure {
    public static final int $stable = 0;
    public static final HatchCvmReplacementFailure INSTANCE = new HatchCvmReplacementFailure();
    public static final String STATE_UNAVAILABLE = "cvm.replacement_state_unavailable";
    public static final String STATE_UNKNOWN = "cvm.replacement_state_unknown";
    public static final String IN_PROGRESS = "cvm.replacement_in_progress";
    public static final String ATTESTATION_FAILED = "cvm.replacement_attestation_failed";
    public static final Set<String> ALL = BFI.A0H(new String[]{STATE_UNAVAILABLE, STATE_UNKNOWN, IN_PROGRESS, ATTESTATION_FAILED});

    public final boolean matches(String str) {
        return AbstractC0878AGe.A0k(ALL, str);
    }
}
