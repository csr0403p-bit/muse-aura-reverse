package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchCvmReplacement;

/* loaded from: classes2.dex */
public abstract class HatchCvmReplaceStoreKt {
    public static final HatchCvmReplacement.Active forVm(HatchCvmReplacement hatchCvmReplacement, String str) {
        HatchCvmReplacement.Active active;
        C7384Etj.A0Y(hatchCvmReplacement, 0);
        if ((hatchCvmReplacement instanceof HatchCvmReplacement.Active) && (active = (HatchCvmReplacement.Active) hatchCvmReplacement) != null && C7384Etj.areEqual(active.vmId, str)) {
            return active;
        }
        return null;
    }

    public static final boolean isCvmReplacement(HatchVmState hatchVmState) {
        C7384Etj.A0Y(hatchVmState, 0);
        return hatchVmState == HatchVmState.CVM_AWAITING_DST_VM_CHIP_SELECTION || hatchVmState == HatchVmState.CVM_DST_VM_STARTING || hatchVmState == HatchVmState.CVM_DST_VM_FAILED_TO_START || hatchVmState == HatchVmState.CVM_LOCKED;
    }

    public static final boolean isAwaitingChipPinnedUnlock(HatchCvmReplacement.Active active) {
        return AnonymousClass002.A1Z(active != null ? active.state : null, HatchVmState.CVM_LOCKED);
    }

    public static final boolean isAwaitingChipSelection(HatchCvmReplacement.Active active) {
        return AnonymousClass002.A1Z(active != null ? active.state : null, HatchVmState.CVM_AWAITING_DST_VM_CHIP_SELECTION);
    }
}
