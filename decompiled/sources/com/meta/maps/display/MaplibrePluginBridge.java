package com.meta.maps.display;

import X.C7384Etj;
import org.maplibre.android.XPlatformPluginBridge;

/* loaded from: classes4.dex */
public final class MaplibrePluginBridge implements XPlatformPluginBridge {
    public final MaplibrePlugin plugin;

    public MaplibrePluginBridge(MaplibrePlugin maplibrePlugin) {
        C7384Etj.A0Y(maplibrePlugin, 0);
        this.plugin = maplibrePlugin;
    }

    public long getNativePlugin() {
        return this.plugin.getPtr();
    }
}
