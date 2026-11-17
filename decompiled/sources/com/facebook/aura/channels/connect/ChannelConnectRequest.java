package com.facebook.aura.channels.connect;

import X.AbstractC0878AGe;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7Je;
import X.HxE;
import android.net.Uri;
import com.facebook.aura.common.url.HatchUrl;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ChannelConnectRequest {
    public static final int $stable = 0;
    public static final String CHANNEL_CONNECT_PATH = "/connect/channel";
    public static final String INTENT_DISCONNECT = "disconnect";
    public static final String INTENT_PARAM = "intent";
    public static final String SERVICE_PARAM = "service";
    public static final String UTM_SOURCE_PARAM = "utm_source";
    public static final ChannelConnectRequest INSTANCE = new ChannelConnectRequest();
    public static final Set<String> WHATSAPP_HANDOFF_SOURCES = C60O.A19("wa4a", "waios");

    public final HxE<String, String> tryParse(String str) {
        String queryParameter;
        C7384Etj.A0Y(str, 0);
        Uri uriA02 = C7Je.A02(str);
        if (uriA02 == null || !HatchUrl.DOMAIN.equals(uriA02.getHost()) || !CHANNEL_CONNECT_PATH.equals(uriA02.getPath()) || (queryParameter = uriA02.getQueryParameter("service")) == null) {
            return null;
        }
        return C3cG.A0r(queryParameter, uriA02.getQueryParameter("intent"));
    }

    public final boolean isWhatsAppHandoff(String str) {
        return AbstractC0878AGe.A0k(WHATSAPP_HANDOFF_SOURCES, str);
    }
}
