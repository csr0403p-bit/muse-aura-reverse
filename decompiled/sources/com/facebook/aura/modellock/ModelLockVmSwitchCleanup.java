package com.facebook.aura.modellock;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.gateway.store.VmSwitchCleanupHandler;
import com.facebook.aura.gateway.store.VmSwitchCleanupType;

/* loaded from: classes3.dex */
public final class ModelLockVmSwitchCleanup implements VmSwitchCleanupHandler {
    public static final ModelLockVmSwitchCleanup INSTANCE = new ModelLockVmSwitchCleanup();

    @Override // com.facebook.aura.gateway.store.VmSwitchCleanupHandler
    public void onVmSwitch(AbstractC3358CGz abstractC3358CGz, VmSwitchCleanupType vmSwitchCleanupType) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        ModelLockRepository.Companion.getInstance(abstractC3358CGz).clear();
    }
}
