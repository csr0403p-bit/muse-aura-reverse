package com.facebook.aura.confidentialvm;

import X.AbstractC3358CGz;
import X.C3cG;
import X.C7384Etj;
import X.CH0;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;

/* loaded from: classes2.dex */
public final class ConfidentialVmProvisioningReset {
    public static final ConfidentialVmProvisioningReset INSTANCE = new ConfidentialVmProvisioningReset();

    public final void reset(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        ConfidentialVmRepository.Companion.clearStoredSecret(((CH0) abstractC3358CGz).A01);
        resetForVmSwitch(abstractC3358CGz);
    }

    public final void resetForVmSwitch(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        ConfidentialVmSetupGate.Companion.getInstance(abstractC3358CGz).resetSelection();
        C3cG.A0D(abstractC3358CGz).setVmConfidentiality(HatchVmConfidentiality.UNKNOWN);
    }
}
