package com.facebook.aura.confidentialvm.repository;

import X.C7384Etj;

/* loaded from: classes4.dex */
public abstract class ConfidentialVmPinReminderJsonKt {
    public static final int HTTP_CONFLICT = 409;
    public static final String TAG = "ConfidentialVmPinReminderJson";

    public static final ConfidentialVmPinState toDomain(PinStateJson pinStateJson) {
        C7384Etj.A0Y(pinStateJson, 0);
        return new ConfidentialVmPinState(pinStateJson.state_revision, pinStateJson.update_id, pinStateJson.replaces_update_id, pinStateJson.encrypted_pin_verifier, pinStateJson.last_successful_entry_at_ms, pinStateJson.reminder_interval_days);
    }

    public static final PinStateJson toJson(ConfidentialVmPinState confidentialVmPinState) {
        C7384Etj.A0Y(confidentialVmPinState, 0);
        return new PinStateJson(confidentialVmPinState.stateRevision, confidentialVmPinState.updateId, confidentialVmPinState.replacesUpdateId, confidentialVmPinState.encryptedPinVerifier, confidentialVmPinState.lastSuccessfulEntryAtMs, confidentialVmPinState.reminderIntervalDays);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[PHI: r2
  0x0042: PHI (r2v1 java.lang.Integer) = (r2v0 java.lang.Integer), (r2v0 java.lang.Integer), (r2v2 java.lang.Integer) binds: [B:15:0x002e, B:17:0x0033, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome toPinMutationOutcome(java.lang.Object r4) {
        /*
            java.lang.Throwable r3 = X.HsJ.A00(r4)
            if (r3 != 0) goto L2b
            com.facebook.aura.confidentialvm.repository.PinMutationResultJson r4 = (com.facebook.aura.confidentialvm.repository.PinMutationResultJson) r4
            com.facebook.aura.confidentialvm.repository.PinStateJson r1 = r4.current_pin_state
            boolean r0 = r4.accepted
            if (r0 == 0) goto L1c
            if (r1 == 0) goto L17
            java.lang.String r1 = "ConfidentialVmPinReminderJson"
            java.lang.String r0 = "toPinMutationOutcome: ignoring current_pin_state on an accepted write"
            X.CFK.A06(r1, r0)
        L17:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome$Accepted r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome.Accepted.INSTANCE
        L19:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome r1 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome) r1
            return r1
        L1c:
            if (r1 == 0) goto L28
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState r0 = toDomain(r1)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome$Stale r1 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome$Stale
            r1.<init>(r0)
            goto L19
        L28:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome$RejectedWithoutState r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome.RejectedWithoutState.INSTANCE
            goto L19
        L2b:
            boolean r0 = r3 instanceof com.facebook.aura.json.NetworkException
            r2 = 0
            if (r0 == 0) goto L42
            r0 = r3
            com.facebook.aura.json.NetworkException r0 = (com.facebook.aura.json.NetworkException) r0
            if (r0 == 0) goto L42
            int r1 = r0.httpResponseCode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L42
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome$Conflict r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome.Conflict.INSTANCE
            goto L19
        L42:
            java.lang.String r0 = r3.getMessage()
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome$Failed r1 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome$Failed
            r1.<init>(r2, r0)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderJsonKt.toPinMutationOutcome(java.lang.Object):com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome");
    }
}
