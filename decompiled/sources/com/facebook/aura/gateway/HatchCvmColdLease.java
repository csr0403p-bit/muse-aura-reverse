package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchCvmColdLease extends C06G {
    public static final int $stable = 0;
    public final boolean created;
    public final String vmId;

    public HatchCvmColdLease(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.vmId = str;
        this.created = z;
    }

    public final HatchCvmColdLease copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new HatchCvmColdLease(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCvmColdLease) {
                HatchCvmColdLease hatchCvmColdLease = (HatchCvmColdLease) obj;
                if (!C7384Etj.areEqual(this.vmId, hatchCvmColdLease.vmId) || this.created != hatchCvmColdLease.created) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCvmColdLease copy$default(HatchCvmColdLease hatchCvmColdLease, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCvmColdLease.vmId;
        }
        if ((i & 2) != 0) {
            z = hatchCvmColdLease.created;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchCvmColdLease(str, z);
    }

    public final String component1() {
        return this.vmId;
    }

    public final boolean component2() {
        return this.created;
    }

    public final boolean getCreated() {
        return this.created;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.vmId), this.created);
    }

    public String toString() {
        return super.toString();
    }
}
