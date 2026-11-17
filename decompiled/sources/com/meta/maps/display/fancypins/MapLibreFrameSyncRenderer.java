package com.meta.maps.display.fancypins;

import X.C7384Etj;
import android.view.TextureView;
import org.maplibre.android.maps.renderer.MapRenderer;

/* loaded from: classes6.dex */
public final class MapLibreFrameSyncRenderer implements FancyPinsFrameSyncRenderer {
    public final MapRenderer renderer;

    public MapLibreFrameSyncRenderer(MapRenderer mapRenderer) {
        C7384Etj.A0Y(mapRenderer, 0);
        this.renderer = mapRenderer;
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public void acknowledgeViewAnnotationSync(long j) {
        this.renderer.acknowledgeViewAnnotationSync(j);
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public boolean beginFrameUpdate(long j) {
        return this.renderer.nativeBeginViewAnnotationFrameUpdate(j);
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public void endFrameUpdate(long j) {
        this.renderer.nativeEndViewAnnotationFrameUpdate(j);
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public long freezeTextureSwapsAndGetLastSwappedFrameIdentity() {
        return this.renderer.freezeTextureSwapsAndGetLastSwappedFrameIdentity();
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public long getCurrentRenderFrameIdentity() {
        return this.renderer.getCurrentRenderFrameIdentity();
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public boolean getSupportsFrameSync() {
        return this.renderer.getView() instanceof TextureView;
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public boolean isRenderingFrame() {
        return this.renderer.isRenderingFrame();
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public void releaseTextureSwapGate() {
        this.renderer.releaseTextureSwapGate();
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public boolean requestViewAnnotationSync(long j) {
        return this.renderer.requestViewAnnotationSync(j);
    }

    @Override // com.meta.maps.display.fancypins.FancyPinsFrameSyncRenderer
    public void setFrameListener(MapRenderer.ViewAnnotationFrameListener viewAnnotationFrameListener) {
        this.renderer.setViewAnnotationFrameListener(viewAnnotationFrameListener);
    }
}
