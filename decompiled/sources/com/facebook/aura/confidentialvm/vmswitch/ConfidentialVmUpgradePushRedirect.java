package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.notifications.push.api.VmLockedPushOutcome;
import com.facebook.aura.notifications.push.api.VmLockedPushRedirect;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ConfidentialVmUpgradePushRedirect implements VmLockedPushRedirect {
    public static final ConfidentialVmUpgradePushRedirect INSTANCE = new ConfidentialVmUpgradePushRedirect();

    @Override // com.facebook.aura.notifications.push.api.VmLockedPushRedirect
    public VmLockedPushOutcome redirect(AbstractC3358CGz abstractC3358CGz, String str, Map<String, String> map) {
        VmLockedPushOutcome vmLockedPushOutcome;
        AnonymousClass005.A0x(abstractC3358CGz, str, map);
        String strUpgradeCvmEnvIdOf = ConfidentialVmUpgradePushRedirectKt.upgradeCvmEnvIdOf(map);
        if (strUpgradeCvmEnvIdOf == null || strUpgradeCvmEnvIdOf.equalsIgnoreCase(str)) {
            vmLockedPushOutcome = VmLockedPushOutcome.NotHandled.INSTANCE;
        } else {
            String strOnUpgradePushOrDropReason = ConfidentialVmMigrationOperation.Companion.getInstance(abstractC3358CGz).onUpgradePushOrDropReason(str, strUpgradeCvmEnvIdOf);
            if (strOnUpgradePushOrDropReason != null) {
                return new VmLockedPushOutcome.Dropped(strOnUpgradePushOrDropReason);
            }
            vmLockedPushOutcome = VmLockedPushOutcome.Accepted.INSTANCE;
        }
        return vmLockedPushOutcome;
    }
}
