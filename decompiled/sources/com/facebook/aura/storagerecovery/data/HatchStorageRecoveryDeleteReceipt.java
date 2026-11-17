package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C60R;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchStorageRecoveryDeleteReceipt extends C06G {
    public final Long availableBytesAfter;
    public final long entriesDeleted;
    public final HatchStorageRecoveryDeleteOutcome outcome;
    public final HatchStorageRecoveryServerStatus serverStatusAfter;
    public final Double usagePercentageAfter;

    public HatchStorageRecoveryDeleteReceipt(HatchStorageRecoveryDeleteOutcome hatchStorageRecoveryDeleteOutcome, long j, Long l, Double d, HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus) {
        C7384Etj.A0Y(hatchStorageRecoveryDeleteOutcome, 0);
        this.outcome = hatchStorageRecoveryDeleteOutcome;
        this.entriesDeleted = j;
        this.availableBytesAfter = l;
        this.usagePercentageAfter = d;
        this.serverStatusAfter = hatchStorageRecoveryServerStatus;
    }

    public final HatchStorageRecoveryDeleteReceipt copy(HatchStorageRecoveryDeleteOutcome hatchStorageRecoveryDeleteOutcome, long j, Long l, Double d, HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus) {
        C7384Etj.A0Y(hatchStorageRecoveryDeleteOutcome, 0);
        return new HatchStorageRecoveryDeleteReceipt(hatchStorageRecoveryDeleteOutcome, j, l, d, hatchStorageRecoveryServerStatus);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStorageRecoveryDeleteReceipt) {
                HatchStorageRecoveryDeleteReceipt hatchStorageRecoveryDeleteReceipt = (HatchStorageRecoveryDeleteReceipt) obj;
                if (this.outcome != hatchStorageRecoveryDeleteReceipt.outcome || this.entriesDeleted != hatchStorageRecoveryDeleteReceipt.entriesDeleted || !C7384Etj.areEqual(this.availableBytesAfter, hatchStorageRecoveryDeleteReceipt.availableBytesAfter) || !C7384Etj.areEqual(this.usagePercentageAfter, hatchStorageRecoveryDeleteReceipt.usagePercentageAfter) || this.serverStatusAfter != hatchStorageRecoveryDeleteReceipt.serverStatusAfter) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchStorageRecoveryDeleteReceipt copy$default(HatchStorageRecoveryDeleteReceipt hatchStorageRecoveryDeleteReceipt, HatchStorageRecoveryDeleteOutcome hatchStorageRecoveryDeleteOutcome, long j, Long l, Double d, HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchStorageRecoveryDeleteOutcome = hatchStorageRecoveryDeleteReceipt.outcome;
        }
        if ((i & 2) != 0) {
            j = hatchStorageRecoveryDeleteReceipt.entriesDeleted;
        }
        if ((i & 4) != 0) {
            l = hatchStorageRecoveryDeleteReceipt.availableBytesAfter;
        }
        if ((i & 8) != 0) {
            d = hatchStorageRecoveryDeleteReceipt.usagePercentageAfter;
        }
        if ((i & 16) != 0) {
            hatchStorageRecoveryServerStatus = hatchStorageRecoveryDeleteReceipt.serverStatusAfter;
        }
        return hatchStorageRecoveryDeleteReceipt.copy(hatchStorageRecoveryDeleteOutcome, j, l, d, hatchStorageRecoveryServerStatus);
    }

    public final HatchStorageRecoveryDeleteOutcome component1() {
        return this.outcome;
    }

    public final long component2() {
        return this.entriesDeleted;
    }

    public final Long component3() {
        return this.availableBytesAfter;
    }

    public final Double component4() {
        return this.usagePercentageAfter;
    }

    public final HatchStorageRecoveryServerStatus component5() {
        return this.serverStatusAfter;
    }

    public final Long getAvailableBytesAfter() {
        return this.availableBytesAfter;
    }

    public final long getEntriesDeleted() {
        return this.entriesDeleted;
    }

    public final HatchStorageRecoveryDeleteOutcome getOutcome() {
        return this.outcome;
    }

    public final HatchStorageRecoveryServerStatus getServerStatusAfter() {
        return this.serverStatusAfter;
    }

    public final Double getUsagePercentageAfter() {
        return this.usagePercentageAfter;
    }

    public int hashCode() {
        return ((((C60R.A00(this.entriesDeleted, AnonymousClass005.A0E(this.outcome)) + AnonymousClass006.A0D(this.availableBytesAfter)) * 31) + AnonymousClass006.A0D(this.usagePercentageAfter)) * 31) + C3cH.A02(this.serverStatusAfter);
    }

    public String toString() {
        return super.toString();
    }
}
