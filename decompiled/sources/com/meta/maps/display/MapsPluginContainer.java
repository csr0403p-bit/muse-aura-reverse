package com.meta.maps.display;

import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public class MapsPluginContainer extends MaplibrePlugin {
    public final native void registerPlugin(MaplibrePlugin maplibrePlugin);

    public final native boolean unregisterPlugin(MaplibrePlugin maplibrePlugin);

    public MapsPluginContainer(long j, Object obj) {
        super(j, (NativeBase.Disposer) MaplibrePlugin.Companion);
    }
}
