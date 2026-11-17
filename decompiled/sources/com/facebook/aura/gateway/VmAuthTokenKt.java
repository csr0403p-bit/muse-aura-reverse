package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BzK;
import X.C7384Etj;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.common.prefs.HatchPrefsStore;

/* loaded from: classes3.dex */
public abstract class VmAuthTokenKt {
    public static final String KEY_GATEWAY_URL = "lobster_gateway_url";
    public static final String KEY_VM_AUTH_TOKEN = "auth_token";
    public static final String KEY_WRITTEN_AT_MS = "written_at_ms";

    public static final boolean commitVmAuthToken(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        BzK bzKA9q = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.AUTH).A9q();
        bzKA9q.AYr("auth_token", AnonymousClass002.A0l(str2));
        bzKA9q.AYp("written_at_ms", System.currentTimeMillis());
        return bzKA9q.commit();
    }

    public static final void setVmAuthToken(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        BzK bzKA9q = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.AUTH).A9q();
        bzKA9q.AYr("auth_token", AnonymousClass002.A0l(str2));
        bzKA9q.apply();
    }

    public static final String vmAuthTokenForGatewayUrl(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass002.A0l(getVmAuthToken(HatcheryVMIdUtilsKt.extractHatcheryVMId(AnonymousClass002.A0l(str))));
    }

    public static final String vmBoundAuthToken(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        String string = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz).getString(KEY_GATEWAY_URL, "");
        return getVmAuthToken(HatcheryVMIdUtilsKt.extractHatcheryVMId(string != null ? string : ""));
    }

    public static final String getVmAuthToken(String str) {
        String string = AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.AUTH).getString("auth_token", "");
        return string == null ? "" : string;
    }
}
