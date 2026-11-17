package com.facebook.aura.maps;

import X.AnonymousClass003;
import X.InterfaceC1559AlZ;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry;

/* loaded from: classes4.dex */
public final class HatchMapCacheLease implements InterfaceC1559AlZ {
    public final HatchMapAgenticSceneFlowCache cache;
    public boolean isReleased;
    public final HatchMapAgenticSceneFlowCacheRegistry registry;

    private final void release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        this.registry.release(this.cache);
    }

    public final HatchMapAgenticSceneFlowCache getCache() {
        return this.cache;
    }

    @Override // X.InterfaceC1559AlZ
    public void onRemembered() {
    }

    public HatchMapCacheLease(HatchMapAgenticSceneFlowCacheRegistry hatchMapAgenticSceneFlowCacheRegistry, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
        AnonymousClass003.A0u(hatchMapAgenticSceneFlowCacheRegistry, hatchMapAgenticSceneFlowCache);
        this.registry = hatchMapAgenticSceneFlowCacheRegistry;
        this.cache = hatchMapAgenticSceneFlowCache;
    }

    @Override // X.InterfaceC1559AlZ
    public void onAbandoned() {
        release();
    }

    @Override // X.InterfaceC1559AlZ
    public void onForgotten() {
        release();
    }
}
