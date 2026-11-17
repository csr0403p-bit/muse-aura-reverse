package com.facebook.aura.shopping.repo;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.gateway.store.VmSwitchCleanupHandler;
import com.facebook.aura.gateway.store.VmSwitchCleanupType;

/* loaded from: classes3.dex */
public final class HatchProductDetailsVmSwitchCleanup implements VmSwitchCleanupHandler {
    public static final HatchProductDetailsVmSwitchCleanup INSTANCE = new HatchProductDetailsVmSwitchCleanup();

    @Override // com.facebook.aura.gateway.store.VmSwitchCleanupHandler
    public void onVmSwitch(AbstractC3358CGz abstractC3358CGz, VmSwitchCleanupType vmSwitchCleanupType) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchProductDetailsRepository hatchProductDetailsRepository = (HatchProductDetailsRepository) abstractC3358CGz.A02(HatchProductDetailsRepository.class);
        if (hatchProductDetailsRepository != null) {
            hatchProductDetailsRepository.resetGatewayState$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo();
        }
    }
}
