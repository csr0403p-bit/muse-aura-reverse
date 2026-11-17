package com.facebook.aura.network.transport;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.F3T;
import com.facebook.aura.network.transport.tigon.TigonTransportFactory;

/* loaded from: classes5.dex */
public final class HatchTransport {
    public static final HatchTransport INSTANCE = new HatchTransport();

    private final HatchTransportFactory requireSingleBinding() {
        return new SingleBindingDispatch(new F3T(new int[]{0}).A00());
    }

    public final HatchHttpClient httpClient(HatchAuthScheme hatchAuthScheme) {
        C7384Etj.A0Y(hatchAuthScheme, 0);
        return requireSingleBinding().httpClient(hatchAuthScheme);
    }

    public final HatchWebSocket webSocket(HatchAuthScheme hatchAuthScheme) {
        C7384Etj.A0Y(hatchAuthScheme, 0);
        return requireSingleBinding().webSocket(hatchAuthScheme);
    }

    public final boolean willUseTigon(HatchAuthScheme hatchAuthScheme) {
        C7384Etj.A0Y(hatchAuthScheme, 0);
        return requireSingleBinding().willUseTigon(hatchAuthScheme);
    }

    public final class SingleBindingDispatch implements HatchTransportFactory {
        public final int key;

        @Override // com.facebook.aura.network.transport.HatchTransportFactory
        public HatchHttpClient httpClient(HatchAuthScheme hatchAuthScheme) {
            C7384Etj.A0Y(hatchAuthScheme, 0);
            int i = this.key;
            if (i != 0) {
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
            }
            HatchHttpClient hatchHttpClientHttpClient = TigonTransportFactory.INSTANCE.httpClient(hatchAuthScheme);
            C7384Etj.A0U(hatchHttpClientHttpClient);
            return hatchHttpClientHttpClient;
        }

        @Override // com.facebook.aura.network.transport.HatchTransportFactory
        public HatchWebSocket webSocket(HatchAuthScheme hatchAuthScheme) {
            C7384Etj.A0Y(hatchAuthScheme, 0);
            int i = this.key;
            if (i != 0) {
                throw AnonymousClass005.A0c(i);
            }
            HatchWebSocket hatchWebSocketWebSocket = TigonTransportFactory.INSTANCE.webSocket(hatchAuthScheme);
            C7384Etj.A0U(hatchWebSocketWebSocket);
            return hatchWebSocketWebSocket;
        }

        @Override // com.facebook.aura.network.transport.HatchTransportFactory
        public boolean willUseTigon(HatchAuthScheme hatchAuthScheme) {
            C7384Etj.A0Y(hatchAuthScheme, 0);
            int i = this.key;
            if (i == 0) {
                return TigonTransportFactory.INSTANCE.willUseTigon(hatchAuthScheme);
            }
            throw AnonymousClass005.A0c(i);
        }

        public SingleBindingDispatch(int i) {
            this.key = i;
        }

        @Override // com.facebook.aura.network.transport.HatchTransportFactory
        public HatchScopedVmChannel openScopedVmChannel(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            int i = this.key;
            if (i == 0) {
                return TigonTransportFactory.INSTANCE.openScopedVmChannel(str, str2, str3);
            }
            throw AnonymousClass005.A0c(i);
        }
    }

    public final HatchScopedVmChannel openScopedVmChannel(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return requireSingleBinding().openScopedVmChannel(str, str2, str3);
    }

    public final void preconnect(HatchAuthScheme hatchAuthScheme, String str) {
        AnonymousClass003.A0u(hatchAuthScheme, str);
        requireSingleBinding().httpClient(hatchAuthScheme).preconnect(str);
    }
}
