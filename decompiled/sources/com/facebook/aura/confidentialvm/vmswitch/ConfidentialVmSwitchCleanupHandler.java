package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C3cG;
import X.CH0;
import com.facebook.aura.confidentialvm.ConfidentialVmProvisioningReset;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint;
import com.facebook.aura.gateway.store.VmSwitchCleanupHandler;
import com.facebook.aura.gateway.store.VmSwitchCleanupType;

/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchCleanupHandler implements VmSwitchCleanupHandler {
    public static final ConfidentialVmSwitchCleanupHandler INSTANCE = new ConfidentialVmSwitchCleanupHandler();

    @Override // com.facebook.aura.gateway.store.VmSwitchCleanupHandler
    public void onVmSwitch(AbstractC3358CGz abstractC3358CGz, VmSwitchCleanupType vmSwitchCleanupType) {
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, vmSwitchCleanupType);
        int iOrdinal = vmSwitchCleanupType.ordinal();
        if (iOrdinal == 0) {
            ConfidentialVmProvisioningReset.INSTANCE.resetForVmSwitch(abstractC3358CGz);
            return;
        }
        if (iOrdinal != zA1a) {
            throw C3cG.A0q();
        }
        ConfidentialVmProvisioningReset.INSTANCE.reset(abstractC3358CGz);
        ConfidentialVmMigrationCheckpoint.Companion companion = ConfidentialVmMigrationCheckpoint.Companion;
        String str = ((CH0) abstractC3358CGz).A01;
        companion.store(str).clear();
        ConfidentialVmDowngradeCheckpoint.Companion.store(str).clear();
        ConfidentialVmMigrationDoneRecord.Companion.store(str).clear();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VmSwitchCleanupType.values().length];
            try {
                AnonymousClass002.A13(VmSwitchCleanupType.SAME_ACCOUNT_SWITCH, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VmSwitchCleanupType.FULL_DATA_RESET, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
