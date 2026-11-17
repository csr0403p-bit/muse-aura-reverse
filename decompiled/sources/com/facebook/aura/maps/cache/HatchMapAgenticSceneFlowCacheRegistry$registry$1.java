package com.facebook.aura.maps.cache;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneFlowCacheRegistry$registry$1 extends AbstractC7559F3s implements G0U<HatchMapAgenticSceneFlowCache, Unit> {
    public static final HatchMapAgenticSceneFlowCacheRegistry$registry$1 INSTANCE = new HatchMapAgenticSceneFlowCacheRegistry$registry$1();

    public HatchMapAgenticSceneFlowCacheRegistry$registry$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
        invoke2(hatchMapAgenticSceneFlowCache);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
        C7384Etj.A0Y(hatchMapAgenticSceneFlowCache, 0);
        hatchMapAgenticSceneFlowCache.close();
    }
}
