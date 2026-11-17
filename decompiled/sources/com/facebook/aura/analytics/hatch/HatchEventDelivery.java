package com.facebook.aura.analytics.hatch;

import X.AnonymousClass005;
import X.C7526EzK;
import X.C7BY;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchEventDelivery {
    public static final int $stable = 0;
    public static final HatchEventDelivery INSTANCE = new HatchEventDelivery();
    public static final List<String> immediateMarkers = Arrays.asList("onboarding", HatchStartupPoints.SURFACE_LOGIN, HatchSurface.AGE_CONFIRMATION.getValue());

    private final boolean isImmediate(String str) {
        if (str != null) {
            List<String> list = immediateMarkers;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (C7BY.A0q(str, AnonymousClass005.A0j(it), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final C7526EzK configFor(String str, String str2) {
        return (isImmediate(str) || isImmediate(str2)) ? C7526EzK.A02 : C7526EzK.A01;
    }
}
