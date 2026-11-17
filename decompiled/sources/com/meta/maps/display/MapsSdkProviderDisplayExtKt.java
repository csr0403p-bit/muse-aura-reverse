package com.meta.maps.display;

import X.C7384Etj;
import com.meta.maps.core.Analytics;
import com.meta.maps.core.MapsSdkProvider;

/* loaded from: classes4.dex */
public abstract class MapsSdkProviderDisplayExtKt {
    public static final MapContext createMapContext(MapsSdkProvider mapsSdkProvider) {
        C7384Etj.A0Y(mapsSdkProvider, 0);
        MapContext mapContext = new MapContext(mapsSdkProvider);
        Analytics analytics = mapsSdkProvider.getAnalytics();
        if (analytics != null) {
            mapContext.getMapController().setAnalytics(analytics);
        }
        return mapContext;
    }
}
