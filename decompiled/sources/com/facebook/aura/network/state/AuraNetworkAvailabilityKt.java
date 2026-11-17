package com.facebook.aura.network.state;

import X.C7384Etj;
import X.G0U;
import X.HtJ;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AuraNetworkAvailabilityKt {
    public static final <T> T ifOnline(Function0<? extends T> function0) {
        C7384Etj.A0Y(function0, 0);
        if (AuraNetworkMonitor.INSTANCE.isOnline()) {
            return function0.invoke();
        }
        return null;
    }

    public static final <T> Object requireOnline(G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super T> htJ) throws NoNetworkException {
        if (AuraNetworkMonitor.INSTANCE.isOnline()) {
            return g0u.invoke(htJ);
        }
        throw new NoNetworkException("No network");
    }
}
