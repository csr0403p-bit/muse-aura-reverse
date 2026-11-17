package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchCvmChipBudgetStop extends C06G {
    public static final int $stable = 0;
    public final String attemptId;
    public final String vmId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCvmChipBudgetStop) {
                HatchCvmChipBudgetStop hatchCvmChipBudgetStop = (HatchCvmChipBudgetStop) obj;
                if (!C7384Etj.areEqual(this.vmId, hatchCvmChipBudgetStop.vmId) || !C7384Etj.areEqual(this.attemptId, hatchCvmChipBudgetStop.attemptId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCvmChipBudgetStop copy$default(HatchCvmChipBudgetStop hatchCvmChipBudgetStop, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCvmChipBudgetStop.vmId;
        }
        if ((i & 2) != 0) {
            str2 = hatchCvmChipBudgetStop.attemptId;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchCvmChipBudgetStop(str, str2);
    }

    public final String component1() {
        return this.vmId;
    }

    public final String component2() {
        return this.attemptId;
    }

    public final String getAttemptId() {
        return this.attemptId;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.attemptId, AnonymousClass001.A0G(this.vmId));
    }

    public HatchCvmChipBudgetStop(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.vmId = str;
        this.attemptId = str2;
    }

    public final HatchCvmChipBudgetStop copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchCvmChipBudgetStop(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
