package com.facebook.aura.confidentialvm.model;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import com.facebook.aura.gateway.intf.HatchLiveVmList;
import com.facebook.aura.gateway.intf.HatchVmListListener;

/* loaded from: classes.dex */
public final class ConfidentialVmEligibilityListener implements HatchVmListListener {
    public static final int $stable = 0;
    public static final ConfidentialVmEligibilityListener INSTANCE = new ConfidentialVmEligibilityListener();

    @Override // com.facebook.aura.gateway.intf.HatchVmListListener
    public void onLiveVmList(AbstractC3358CGz abstractC3358CGz, HatchLiveVmList hatchLiveVmList) {
        AnonymousClass003.A0u(abstractC3358CGz, hatchLiveVmList);
        ConfidentialVmEligibility.Companion.getInstance(abstractC3358CGz).onLiveVmList$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_model_model(hatchLiveVmList);
    }
}
