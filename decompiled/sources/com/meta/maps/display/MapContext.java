package com.meta.maps.display;

import X.C06H;
import X.C7384Etj;
import com.meta.maps.NativeBase;
import com.meta.maps.core.MapsPlatformProvider;

/* loaded from: classes4.dex */
public final class MapContext extends MapsPluginContainer {
    public static final Companion Companion = new Companion();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapContext(MapsPlatformProvider mapsPlatformProvider) {
        super(createWithProvider(mapsPlatformProvider), (NativeBase.Disposer) MaplibrePlugin.Companion);
        C7384Etj.A0Y(mapsPlatformProvider, 0);
        cacheThisInstance();
    }

    private final native void cacheThisInstance();

    public static final native long create();

    public static final native long createWithProvider(MapsPlatformProvider mapsPlatformProvider);

    public final native MapController getMapController();

    public final native MapsPlatformProvider getProvider();

    public final class Companion {
        public final long create() {
            return MapContext.create();
        }

        public final long createWithProvider(MapsPlatformProvider mapsPlatformProvider) {
            return MapContext.createWithProvider(mapsPlatformProvider);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MapContext(long j, Object obj) {
        super(j, (NativeBase.Disposer) MaplibrePlugin.Companion);
    }

    public MapContext() {
        super(create(), (NativeBase.Disposer) MaplibrePlugin.Companion);
        cacheThisInstance();
    }
}
