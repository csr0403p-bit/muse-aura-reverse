package com.facebook.aura.navigation;

import X.AKH;
import X.AKJ;
import X.AnonymousClass002;
import X.BFM;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class LocalResultEventBus {
    public static final int $stable = 0;
    public static final LocalResultEventBus INSTANCE = new LocalResultEventBus();
    public static final AKH<ResultEventBus> localResultEventBus = AnonymousClass002.A0L(LocalResultEventBus$localResultEventBus$1.INSTANCE);

    public final AKJ<ResultEventBus> provides(ResultEventBus resultEventBus) {
        C7384Etj.A0Y(resultEventBus, 0);
        return localResultEventBus.A04(resultEventBus);
    }

    public final ResultEventBus getCurrent(BFM bfm, int i) {
        ResultEventBus resultEventBus = (ResultEventBus) bfm.A6v(localResultEventBus);
        if (resultEventBus != null) {
            return resultEventBus;
        }
        throw C3cG.A0Q("No ResultEventBus has been provided");
    }
}
