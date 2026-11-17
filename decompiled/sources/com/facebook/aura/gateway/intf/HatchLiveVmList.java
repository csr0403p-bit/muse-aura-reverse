package com.facebook.aura.gateway.intf;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchLiveVmList extends C06G {
    public final String cvmEligibilityState;
    public final boolean isConfidentialVmSelected;
    public final String selectedVmId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLiveVmList) {
                HatchLiveVmList hatchLiveVmList = (HatchLiveVmList) obj;
                if (!C7384Etj.areEqual(this.selectedVmId, hatchLiveVmList.selectedVmId) || this.isConfidentialVmSelected != hatchLiveVmList.isConfidentialVmSelected || !C7384Etj.areEqual(this.cvmEligibilityState, hatchLiveVmList.cvmEligibilityState)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchLiveVmList copy$default(HatchLiveVmList hatchLiveVmList, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchLiveVmList.selectedVmId;
        }
        if ((i & 2) != 0) {
            z = hatchLiveVmList.isConfidentialVmSelected;
        }
        if ((i & 4) != 0) {
            str2 = hatchLiveVmList.cvmEligibilityState;
        }
        return new HatchLiveVmList(str, z, str2);
    }

    public final String component1() {
        return this.selectedVmId;
    }

    public final boolean component2() {
        return this.isConfidentialVmSelected;
    }

    public final String component3() {
        return this.cvmEligibilityState;
    }

    public final HatchLiveVmList copy(String str, boolean z, String str2) {
        return new HatchLiveVmList(str, z, str2);
    }

    public final String getCvmEligibilityState() {
        return this.cvmEligibilityState;
    }

    public final String getSelectedVmId() {
        return this.selectedVmId;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass006.A0G(this.selectedVmId) * 31, this.isConfidentialVmSelected) + AnonymousClass005.A0H(this.cvmEligibilityState);
    }

    public final boolean isConfidentialVmSelected() {
        return this.isConfidentialVmSelected;
    }

    public HatchLiveVmList(String str, boolean z, String str2) {
        this.selectedVmId = str;
        this.isConfidentialVmSelected = z;
        this.cvmEligibilityState = str2;
    }

    public String toString() {
        return super.toString();
    }
}
