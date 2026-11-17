package com.facebook.aura.network.transport.tigon;

import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.ESl;
import X.F0C;
import com.crossapp.tigonhttp.websocket.TigonHttpWebSocketClient;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchWebSocket;
import com.facebook.aura.network.transport.HatchWebSocketConfig;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import com.facebook.aura.network.transport.tigon.internal.TigonVmAuth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class TigonHatchWebSocket implements HatchWebSocket {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final Companion Companion = new Companion();
    public static final int EVENT_BUFFER_CAPACITY = 8;
    public static final int INCOMING_BUFFER_CAPACITY = 64;
    public final F0C client$delegate;
    public final HatchAuthScheme scheme;

    public TigonHatchWebSocket(HatchAuthScheme hatchAuthScheme) {
        C7384Etj.A0Y(hatchAuthScheme, 0);
        this.scheme = hatchAuthScheme;
        this.client$delegate = AbstractC5321DgF.A03(TigonHatchWebSocket$client$2.INSTANCE);
    }

    public final ESl buildWebSocketRequest$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon(HatchWebSocketConfig hatchWebSocketConfig) {
        String strVmBearerForUrl;
        C7384Etj.A0Y(hatchWebSocketConfig, 0);
        String str = hatchWebSocketConfig.url;
        C7384Etj.A0Y(str, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        Set<String> setKeySet = hatchWebSocketConfig.headers.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator<String> it = setKeySet.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (strA0j != null && strA0j.equalsIgnoreCase("Authorization")) {
                    break;
                }
            }
            if (this.scheme == HatchAuthScheme.VM_JWT && (strVmBearerForUrl = TigonVmAuth.INSTANCE.vmBearerForUrl(hatchWebSocketConfig.url)) != null) {
                AnonymousClass002.A1J("Authorization", strVmBearerForUrl, arrayListA0h);
            }
        } else if (this.scheme == HatchAuthScheme.VM_JWT) {
            AnonymousClass002.A1J("Authorization", strVmBearerForUrl, arrayListA0h);
        }
        Iterator itA0n = AnonymousClass002.A0n(hatchWebSocketConfig.headers);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            C7384Etj.A0Y(key, 0);
            C7384Etj.A0Y(value, 1);
            AnonymousClass002.A1J(key, value, arrayListA0h);
        }
        for (String str2 : hatchWebSocketConfig.subprotocols) {
            C7384Etj.A0Y(str2, 0);
            arrayListA0h2.add(str2);
        }
        long j = hatchWebSocketConfig.pingIntervalMs;
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        int i = (int) j;
        if (i < 0) {
            i = 0;
        }
        return new ESl(str, AbstractC0878AGe.A0X(arrayListA0h), AbstractC0878AGe.A0X(arrayListA0h2), i);
    }

    @Override // com.facebook.aura.network.transport.HatchWebSocket
    public HatchWebSocketSession connect(HatchWebSocketConfig hatchWebSocketConfig) {
        C7384Etj.A0Y(hatchWebSocketConfig, 0);
        ESl eSlBuildWebSocketRequest$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon = buildWebSocketRequest$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon(hatchWebSocketConfig);
        Integer num = C79.A01;
        C9290GCr c9290GCr = new C9290GCr(num, 0, 64);
        C9290GCr c9290GCr2 = new C9290GCr(num, 1, 9);
        return new TigonHatchWebSocketSession(getClient().newWebSocket(eSlBuildWebSocketRequest$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon, new HatchFlowTigonCallbacks(c9290GCr, c9290GCr2), AuraExecutors.INSTANCE.createSerialExecutor()), new C3pd(c9290GCr), new C3pd(c9290GCr2));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final TigonHttpWebSocketClient getClient() {
        return (TigonHttpWebSocketClient) this.client$delegate.getValue();
    }
}
