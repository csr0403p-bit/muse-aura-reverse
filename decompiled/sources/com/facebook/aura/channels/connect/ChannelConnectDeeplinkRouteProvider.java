package com.facebook.aura.channels.connect;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C60Q;
import X.C7384Etj;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.navigation.key.ChannelConnectScreenKey;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ChannelConnectDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final ChannelConnectDeeplinkRouteProvider INSTANCE = new ChannelConnectDeeplinkRouteProvider();
    public static final String INTENT_PARAM = "intent";
    public static final String SERVICE_PARAM = "service";

    /* renamed from: com.facebook.aura.channels.connect.ChannelConnectDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            String queryParameter = uri.getQueryParameter("service");
            if (queryParameter == null) {
                return null;
            }
            return C60Q.A0G(new ChannelConnectScreenKey(queryParameter, uri.getQueryParameter("intent"), uri.getQueryParameter("utm_source")));
        }
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.ALL_FAMILY;
        return Collections.singletonList(new AuraDeeplinkRouteSpec("channel_connect", ChannelConnectRequest.CHANNEL_CONNECT_PATH, null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE, anonymousClass1));
    }
}
