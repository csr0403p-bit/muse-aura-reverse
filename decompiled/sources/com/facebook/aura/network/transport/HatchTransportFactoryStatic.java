package com.facebook.aura.network.transport;

import X.AnonymousClass005;
import com.facebook.aura.network.transport.tigon.TigonTransportFactory;

/* loaded from: classes5.dex */
public class HatchTransportFactoryStatic {
    public static int[] getKeys() {
        return new int[]{0};
    }

    public static HatchHttpClient httpClient(int i, HatchAuthScheme hatchAuthScheme) {
        if (i == 0) {
            return TigonTransportFactory.INSTANCE.httpClient(hatchAuthScheme);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static HatchScopedVmChannel openScopedVmChannel(int i, String str, String str2, String str3) {
        if (i == 0) {
            return TigonTransportFactory.INSTANCE.openScopedVmChannel(str, str2, str3);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static HatchWebSocket webSocket(int i, HatchAuthScheme hatchAuthScheme) {
        if (i == 0) {
            return TigonTransportFactory.INSTANCE.webSocket(hatchAuthScheme);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static boolean willUseTigon(int i, HatchAuthScheme hatchAuthScheme) {
        if (i == 0) {
            return TigonTransportFactory.INSTANCE.willUseTigon(hatchAuthScheme);
        }
        throw AnonymousClass005.A0c(i);
    }
}
