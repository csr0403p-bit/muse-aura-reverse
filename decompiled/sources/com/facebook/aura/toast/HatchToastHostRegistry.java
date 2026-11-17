package com.facebook.aura.toast;

import X.C7384Etj;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class HatchToastHostRegistry {
    public static final int $stable = 0;
    public static final HatchToastHostRegistry INSTANCE = new HatchToastHostRegistry();
    public static final CopyOnWriteArrayList<HatchToastHost> hosts = new CopyOnWriteArrayList<>();

    public final void register(HatchToastHost hatchToastHost) {
        C7384Etj.A0Y(hatchToastHost, 0);
        hosts.add(hatchToastHost);
    }

    public final void unregister(HatchToastHost hatchToastHost) {
        C7384Etj.A0Y(hatchToastHost, 0);
        hosts.remove(hatchToastHost);
    }

    public final HatchToastHost getCurrent() {
        HatchToastHost hatchToastHostPrevious;
        CopyOnWriteArrayList<HatchToastHost> copyOnWriteArrayList = hosts;
        ListIterator<HatchToastHost> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                hatchToastHostPrevious = null;
                break;
            }
            hatchToastHostPrevious = listIterator.previous();
            if (hatchToastHostPrevious.getAcceptsToasts()) {
                break;
            }
        }
        return hatchToastHostPrevious;
    }
}
