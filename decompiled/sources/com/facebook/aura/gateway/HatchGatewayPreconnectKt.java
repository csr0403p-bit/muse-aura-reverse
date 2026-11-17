package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.C10571Hud;
import X.C3cG;
import X.C60N;
import com.facebook.aura.network.sandbox.AuraSandbox;
import java.net.URI;

/* loaded from: classes5.dex */
public abstract class HatchGatewayPreconnectKt {
    public static final int PROACTIVE_WAKE_RETRY_COUNT = 0;
    public static final String TAG = "HatchGatewayPreconnect";

    public static /* synthetic */ String stefiPreconnectHost$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = C60N.A00(24);
        }
        if ((i & 2) != 0) {
            str2 = AuraSandbox.INSTANCE.getHttpHost();
        }
        return stefiPreconnectHost(str, str2);
    }

    public static final String stefiPreconnectHost(String str, String str2) {
        Object objA0s;
        AnonymousClass003.A0u(str, str2);
        try {
            objA0s = new URI(AuraSandbox.INSTANCE.rewriteUrl(str, str2)).getHost();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        String str3 = (String) objA0s;
        if (str3 == null || str3.length() <= 0) {
            return null;
        }
        return str3;
    }
}
