package com.facebook.aura.notifications.push.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmUpgradePushRedirect;
import java.util.Map;

/* loaded from: classes3.dex */
public class VmLockedPushRedirectStatic {
    public static VmLockedPushOutcome redirect(int i, AbstractC3358CGz abstractC3358CGz, String str, Map<String, String> map) {
        if (i == 0) {
            return ConfidentialVmUpgradePushRedirect.INSTANCE.redirect(abstractC3358CGz, str, map);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
