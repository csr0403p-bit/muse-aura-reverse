package com.meta.maps.display.routeline;

import X.C06H;
import X.C7384Etj;
import com.meta.maps.NativeBase;
import com.meta.maps.display.MapController;
import com.meta.maps.display.MaplibrePlugin;

/* loaded from: classes4.dex */
public final class RouteLinePlugin extends MaplibrePlugin {
    public static final Companion Companion = new Companion();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLinePlugin(MapController mapController) {
        super(create(mapController), (NativeBase.Disposer) MaplibrePlugin.Companion);
        C7384Etj.A0Y(mapController, 0);
        cacheThisInstance();
    }

    private final native void cacheThisInstance();

    public static final native long create(MapController mapController);

    public final native void addRouteLineToMap(RouteLine routeLine);

    public final native void removeRouteLineFromMap(RouteLine routeLine);

    public final native void setSegmentModeEnabled(boolean z);

    public final class Companion {
        public final long create(MapController mapController) {
            return RouteLinePlugin.create(mapController);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public RouteLinePlugin(long j, Object obj) {
        super(j, (NativeBase.Disposer) MaplibrePlugin.Companion);
    }
}
