package com.facebook.aura.maps;

import X.AFR;
import X.AnonymousClass005;
import X.C1HY;
import X.C7384Etj;
import X.Dg3;
import X.EnumC3085Bxl;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.maps.scene.HatchMapTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchRetainedMapPresentation {
    public static final int $stable = 8;
    public final HatchMapAgenticSceneFlowCache cache;
    public final HatchMapAgenticSceneFlow flow;
    public final HatchMapFlowController flowController;
    public final HatchMapNavigationController navigationController;
    public final C1HY owner;
    public Dg3 ownerObserver;
    public final Function0<Unit> releaseCache;
    public final AFR retainedMap;
    public final HatchMapScene scene;
    public final HatchMapTheme theme;

    public final void onOwnerDestroyed(final Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        Dg3 dg3 = new Dg3() { // from class: com.facebook.aura.maps.HatchRetainedMapPresentation$onOwnerDestroyed$observer$1
            @Override // X.Dg3
            public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
                C7384Etj.A0Y(enumC3085Bxl, 1);
                if (enumC3085Bxl == EnumC3085Bxl.ON_DESTROY) {
                    function0.invoke();
                }
            }
        };
        this.ownerObserver = dg3;
        this.owner.getLifecycle().A04(dg3);
    }

    public final void close() {
        Dg3 dg3 = this.ownerObserver;
        if (dg3 != null) {
            this.owner.getLifecycle().A05(dg3);
        }
        this.ownerObserver = null;
        this.flowController.removeAll();
        this.retainedMap.A00();
        this.releaseCache.invoke();
    }

    public final HatchMapAgenticSceneFlowCache getCache() {
        return this.cache;
    }

    public final HatchMapAgenticSceneFlow getFlow() {
        return this.flow;
    }

    public final HatchMapFlowController getFlowController() {
        return this.flowController;
    }

    public final HatchMapNavigationController getNavigationController() {
        return this.navigationController;
    }

    public final C1HY getOwner() {
        return this.owner;
    }

    public final AFR getRetainedMap() {
        return this.retainedMap;
    }

    public final HatchMapScene getScene() {
        return this.scene;
    }

    public final HatchMapTheme getTheme() {
        return this.theme;
    }

    public HatchRetainedMapPresentation(HatchMapScene hatchMapScene, C1HY c1hy, HatchMapTheme hatchMapTheme, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, AFR afr, HatchMapNavigationController hatchMapNavigationController, HatchMapFlowController hatchMapFlowController, HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, Function0<Unit> function0) {
        AnonymousClass005.A17(hatchMapScene, c1hy, hatchMapTheme, hatchMapAgenticSceneFlowCache, afr);
        AnonymousClass005.A0z(hatchMapNavigationController, hatchMapFlowController, hatchMapAgenticSceneFlow);
        C7384Etj.A0Y(function0, 8);
        this.scene = hatchMapScene;
        this.owner = c1hy;
        this.theme = hatchMapTheme;
        this.cache = hatchMapAgenticSceneFlowCache;
        this.retainedMap = afr;
        this.navigationController = hatchMapNavigationController;
        this.flowController = hatchMapFlowController;
        this.flow = hatchMapAgenticSceneFlow;
        this.releaseCache = function0;
    }
}
