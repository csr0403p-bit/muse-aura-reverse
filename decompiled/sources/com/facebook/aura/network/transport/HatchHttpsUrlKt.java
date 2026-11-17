package com.facebook.aura.network.transport;

import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import java.net.URI;

/* loaded from: classes3.dex */
public abstract class HatchHttpsUrlKt {
    public static final int HTTPS_PORT = 443;
    public static final String HTTPS_SCHEME = "https";

    public static final String httpsHostOrNull(String str) {
        Object objA0s;
        String host;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = new URI(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        URI uri = (URI) objA0s;
        if (uri != null) {
            String scheme = uri.getScheme();
            if ((scheme == null ? false : scheme.equalsIgnoreCase("https")) && uri.getUserInfo() == null && ((uri.getPort() == -1 || uri.getPort() == 443) && (host = uri.getHost()) != null && !C7BY.A0j(host))) {
                return host;
            }
        }
        return null;
    }
}
