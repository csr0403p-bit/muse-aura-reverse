package com.meta.maps.fancypins;

import X.AbstractC08169sz;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterId {
    public static final FancyPinRuntimeClusterId INSTANCE = new FancyPinRuntimeClusterId();
    public static final String PREFIX = "__fancy_cluster_";

    public final boolean isRuntimeClusterId(String str) {
        C7384Etj.A0Y(str, 0);
        return str.startsWith(PREFIX);
    }

    public final String make(long j) {
        return FGI.A0M(PREFIX, AbstractC08169sz.A00(j));
    }
}
