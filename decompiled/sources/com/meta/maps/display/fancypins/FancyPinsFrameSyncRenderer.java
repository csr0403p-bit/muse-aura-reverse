package com.meta.maps.display.fancypins;

import org.maplibre.android.maps.renderer.MapRenderer;

/* loaded from: classes6.dex */
public interface FancyPinsFrameSyncRenderer {
    void acknowledgeViewAnnotationSync(long j);

    boolean beginFrameUpdate(long j);

    void endFrameUpdate(long j);

    long freezeTextureSwapsAndGetLastSwappedFrameIdentity();

    long getCurrentRenderFrameIdentity();

    boolean getSupportsFrameSync();

    boolean isRenderingFrame();

    void releaseTextureSwapGate();

    boolean requestViewAnnotationSync(long j);

    void setFrameListener(MapRenderer.ViewAnnotationFrameListener viewAnnotationFrameListener);
}
