package com.facebook.aura.storagerecovery.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import X.HsK;

/* loaded from: classes3.dex */
public final class HatchStorageRecoveryStatus extends C06G {
    public final long availableBytes;
    public final boolean canDelete;
    public final boolean canList;
    public final HatchStorageRecoveryServerStatus status;
    public final long totalBytes;
    public final double usagePercentage;

    public HatchStorageRecoveryStatus(HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus, long j, long j2, double d, boolean z, boolean z2) {
        C7384Etj.A0Y(hatchStorageRecoveryServerStatus, 0);
        this.status = hatchStorageRecoveryServerStatus;
        this.totalBytes = j;
        this.availableBytes = j2;
        this.usagePercentage = d;
        this.canList = z;
        this.canDelete = z2;
    }

    public final HatchStorageRecoveryStatus copy(HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus, long j, long j2, double d, boolean z, boolean z2) {
        C7384Etj.A0Y(hatchStorageRecoveryServerStatus, 0);
        return new HatchStorageRecoveryStatus(hatchStorageRecoveryServerStatus, j, j2, d, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStorageRecoveryStatus) {
                HatchStorageRecoveryStatus hatchStorageRecoveryStatus = (HatchStorageRecoveryStatus) obj;
                if (this.status != hatchStorageRecoveryStatus.status || this.totalBytes != hatchStorageRecoveryStatus.totalBytes || this.availableBytes != hatchStorageRecoveryStatus.availableBytes || Double.compare(this.usagePercentage, hatchStorageRecoveryStatus.usagePercentage) != 0 || this.canList != hatchStorageRecoveryStatus.canList || this.canDelete != hatchStorageRecoveryStatus.canDelete) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchStorageRecoveryStatus copy$default(HatchStorageRecoveryStatus hatchStorageRecoveryStatus, HatchStorageRecoveryServerStatus hatchStorageRecoveryServerStatus, long j, long j2, double d, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchStorageRecoveryServerStatus = hatchStorageRecoveryStatus.status;
        }
        if ((i & 2) != 0) {
            j = hatchStorageRecoveryStatus.totalBytes;
        }
        if ((i & 4) != 0) {
            j2 = hatchStorageRecoveryStatus.availableBytes;
        }
        if ((i & 8) != 0) {
            d = hatchStorageRecoveryStatus.usagePercentage;
        }
        if ((i & 16) != 0) {
            z = hatchStorageRecoveryStatus.canList;
        }
        if ((i & 32) != 0) {
            z2 = hatchStorageRecoveryStatus.canDelete;
        }
        return hatchStorageRecoveryStatus.copy(hatchStorageRecoveryServerStatus, j, j2, d, z, z2);
    }

    public final HatchStorageRecoveryServerStatus component1() {
        return this.status;
    }

    public final long component2() {
        return this.totalBytes;
    }

    public final long component3() {
        return this.availableBytes;
    }

    public final double component4() {
        return this.usagePercentage;
    }

    public final boolean component5() {
        return this.canList;
    }

    public final boolean component6() {
        return this.canDelete;
    }

    public final long getAvailableBytes() {
        return this.availableBytes;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final boolean getCanList() {
        return this.canList;
    }

    public final HatchStorageRecoveryServerStatus getStatus() {
        return this.status;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final double getUsagePercentage() {
        return this.usagePercentage;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((AnonymousClass006.A06(this.availableBytes, AnonymousClass006.A06(this.totalBytes, AnonymousClass005.A0E(this.status))) + HsK.A00(this.usagePercentage)) * 31, this.canList), this.canDelete);
    }

    public String toString() {
        return super.toString();
    }
}
