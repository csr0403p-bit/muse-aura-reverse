package com.meta.maps.display.fancypins;

import X.C06H;
import com.meta.maps.display.MapController;
import com.meta.maps.display.MaplibrePlugin;
import com.meta.maps.fancypins.FancyPinEngine;

/* loaded from: classes6.dex */
public final class FancyPinsPlugin extends MaplibrePlugin {
    public static final Companion Companion = new Companion();
    public final FancyPinEngine engine;
    public boolean isCollisionDebugVisible;

    private final native void cacheThisInstance();

    public static final native long create();

    public final native void disableCollisionProxy();

    public final native void enableCollisionProxy(MapController mapController);

    public final native FancyPinEngine getEngine();

    public final native boolean isCollisionDebugVisible();

    public final native void requestUpdate();

    public final native void setCollisionDebugVisible(boolean z);

    public final class Companion {
        public Companion() {
        }

        public final long create() {
            return FancyPinsPlugin.create();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public FancyPinsPlugin() {
        super(create(), null);
        cacheThisInstance();
    }

    public FancyPinsPlugin(long j, Object obj) {
        super(j, obj);
    }
}
