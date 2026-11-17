package com.facebook.aura.network.transport.tigon.internal;

import X.C7384Etj;
import com.facebook.aura.network.AuraAuthHeaders;
import com.facebook.aura.network.api.HatchVmHostsKt;
import java.net.URI;

/* loaded from: classes5.dex */
public final class TigonVmAuth {
    public static final TigonVmAuth INSTANCE = new TigonVmAuth();

    private final boolean isTlsMetaAiVmUrl(String str) {
        String scheme;
        try {
            URI uri = new URI(str);
            String scheme2 = uri.getScheme();
            if ((scheme2 != null && scheme2.equalsIgnoreCase("https")) || ((scheme = uri.getScheme()) != null && scheme.equalsIgnoreCase("wss"))) {
                if (HatchVmHostsKt.isMetaAiVmHost(uri.getHost())) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final boolean isMetaAiVmUrl(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            return HatchVmHostsKt.isMetaAiVmHost(new URI(str).getHost());
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean needsMetaAIVMAuth(String str) {
        C7384Etj.A0Y(str, 0);
        return isTlsMetaAiVmUrl(str);
    }

    public final String vmBearerForUrl(String str) {
        C7384Etj.A0Y(str, 0);
        if (isTlsMetaAiVmUrl(str)) {
            return AuraAuthHeaders.INSTANCE.currentVmBearer();
        }
        return null;
    }
}
