package com.facebook.aura.analytics;

import X.BV4;
import X.C3cG;
import X.C7384Etj;
import X.DFX;
import X.G0U;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraEarlyAnalytics {
    public static final AuraEarlyAnalytics INSTANCE = new AuraEarlyAnalytics();
    public static final List<G0U<DFX, Unit>> actions = C3cG.A0h();
    public static volatile boolean initialized;

    public final void onInitialized$fbandroid_express_aura_java_com_facebook_aura_analytics_analytics(DFX dfx) {
        C7384Etj.A0Y(dfx, 0);
        initialized = true;
        List<G0U<DFX, Unit>> list = actions;
        synchronized (list) {
        }
        Iterator<G0U<DFX, Unit>> it = list.iterator();
        while (it.hasNext()) {
            it.next().invoke(dfx);
        }
        list.clear();
    }

    public final void whenInitialized(G0U<? super DFX, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        boolean z = true;
        if (!initialized) {
            List<G0U<DFX, Unit>> list = actions;
            synchronized (list) {
                if (!initialized) {
                    list.add(g0u);
                    z = false;
                }
            }
            if (!z) {
                return;
            }
        }
        g0u.invoke(BV4.A0C());
    }
}
