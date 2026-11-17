package com.facebook.aura.gateway.api;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class GatewayTrafficObservers {
    public static final String TAG = "GatewayTrafficObservers";
    public static final GatewayTrafficObservers INSTANCE = new GatewayTrafficObservers();
    public static volatile List<? extends GatewayTrafficObserver> observers = C0881AGi.A00;

    public final void dispatchReceived(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C7384Etj.A0Y(str, 1);
    }

    public final synchronized void register(GatewayTrafficObserver gatewayTrafficObserver) {
        C7384Etj.A0Y(gatewayTrafficObserver, 0);
    }

    public final synchronized void unregister(GatewayTrafficObserver gatewayTrafficObserver) {
        C7384Etj.A0Y(gatewayTrafficObserver, 0);
        observers = AbstractC0878AGe.A0b(observers, gatewayTrafficObserver);
    }

    public final void dispatchSent(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
    }
}
