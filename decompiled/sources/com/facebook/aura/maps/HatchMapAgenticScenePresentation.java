package com.facebook.aura.maps;

import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.model.HatchMapScene;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapAgenticScenePresentation implements HatchMapFlowPresentation {
    public static final int $stable = 8;
    public final HatchMapAgenticSceneFlowCache cache;
    public final HatchMapDisplayMode displayMode;
    public final G0U<String, Unit> onCarouselPageChanged;
    public final G0U<String, Unit> onExpand;
    public final G0U<String, Unit> onPlaceDetailsRequested;
    public final HatchMapScene scene;
    public final String selectedArtifactId;

    public final HatchMapAgenticSceneFlowCache getCache() {
        return this.cache;
    }

    public final HatchMapDisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public final G0U<String, Unit> getOnCarouselPageChanged() {
        return this.onCarouselPageChanged;
    }

    public final G0U<String, Unit> getOnExpand() {
        return this.onExpand;
    }

    public final G0U<String, Unit> getOnPlaceDetailsRequested() {
        return this.onPlaceDetailsRequested;
    }

    public final HatchMapScene getScene() {
        return this.scene;
    }

    public final String getSelectedArtifactId() {
        return this.selectedArtifactId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapAgenticScenePresentation(HatchMapScene hatchMapScene, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, HatchMapDisplayMode hatchMapDisplayMode, String str, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3) {
        AnonymousClass005.A0x(hatchMapScene, hatchMapAgenticSceneFlowCache, hatchMapDisplayMode);
        C7384Etj.A0Y(g0u3, 6);
        this.scene = hatchMapScene;
        this.cache = hatchMapAgenticSceneFlowCache;
        this.displayMode = hatchMapDisplayMode;
        this.selectedArtifactId = str;
        this.onExpand = g0u;
        this.onPlaceDetailsRequested = g0u2;
        this.onCarouselPageChanged = g0u3;
    }
}
