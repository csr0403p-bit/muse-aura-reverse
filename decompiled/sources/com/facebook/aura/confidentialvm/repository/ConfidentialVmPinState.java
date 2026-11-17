package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.C8j4;

/* loaded from: classes4.dex */
public final class ConfidentialVmPinState extends C06G {
    public final String encryptedPinVerifier;
    public final long lastSuccessfulEntryAtMs;
    public final long reminderIntervalDays;
    public final String replacesUpdateId;
    public final long stateRevision;
    public final String updateId;

    public ConfidentialVmPinState(long j, String str, String str2, String str3, long j2, long j3) {
        AnonymousClass002.A1B(str, 1, str3);
        this.stateRevision = j;
        this.updateId = str;
        this.replacesUpdateId = str2;
        this.encryptedPinVerifier = str3;
        this.lastSuccessfulEntryAtMs = j2;
        this.reminderIntervalDays = j3;
    }

    public final ConfidentialVmPinState copy(long j, String str, String str2, String str3, long j2, long j3) {
        AnonymousClass002.A1B(str, 1, str3);
        return new ConfidentialVmPinState(j, str, str2, str3, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmPinState) {
                ConfidentialVmPinState confidentialVmPinState = (ConfidentialVmPinState) obj;
                if (this.stateRevision != confidentialVmPinState.stateRevision || !C7384Etj.areEqual(this.updateId, confidentialVmPinState.updateId) || !C7384Etj.areEqual(this.replacesUpdateId, confidentialVmPinState.replacesUpdateId) || !C7384Etj.areEqual(this.encryptedPinVerifier, confidentialVmPinState.encryptedPinVerifier) || this.lastSuccessfulEntryAtMs != confidentialVmPinState.lastSuccessfulEntryAtMs || this.reminderIntervalDays != confidentialVmPinState.reminderIntervalDays) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmPinState copy$default(ConfidentialVmPinState confidentialVmPinState, long j, String str, String str2, String str3, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = confidentialVmPinState.stateRevision;
        }
        if ((i & 2) != 0) {
            str = confidentialVmPinState.updateId;
        }
        if ((i & 4) != 0) {
            str2 = confidentialVmPinState.replacesUpdateId;
        }
        if ((i & 8) != 0) {
            str3 = confidentialVmPinState.encryptedPinVerifier;
        }
        if ((i & 16) != 0) {
            j2 = confidentialVmPinState.lastSuccessfulEntryAtMs;
        }
        if ((i & 32) != 0) {
            j3 = confidentialVmPinState.reminderIntervalDays;
        }
        return confidentialVmPinState.copy(j, str, str2, str3, j2, j3);
    }

    public final long component1() {
        return this.stateRevision;
    }

    public final String component2() {
        return this.updateId;
    }

    public final String component3() {
        return this.replacesUpdateId;
    }

    public final String component4() {
        return this.encryptedPinVerifier;
    }

    public final long component5() {
        return this.lastSuccessfulEntryAtMs;
    }

    public final long component6() {
        return this.reminderIntervalDays;
    }

    public final String getEncryptedPinVerifier() {
        return this.encryptedPinVerifier;
    }

    public final long getLastSuccessfulEntryAtMs() {
        return this.lastSuccessfulEntryAtMs;
    }

    public final long getReminderIntervalDays() {
        return this.reminderIntervalDays;
    }

    public final String getReplacesUpdateId() {
        return this.replacesUpdateId;
    }

    public final long getStateRevision() {
        return this.stateRevision;
    }

    public final String getUpdateId() {
        return this.updateId;
    }

    public int hashCode() {
        return C8j4.A0B(this.reminderIntervalDays, AnonymousClass006.A06(this.lastSuccessfulEntryAtMs, AnonymousClass005.A0I(this.encryptedPinVerifier, (AnonymousClass005.A0I(this.updateId, AnonymousClass005.A07(this.stateRevision)) + AnonymousClass006.A0G(this.replacesUpdateId)) * 31)));
    }

    public String toString() {
        return super.toString();
    }
}
