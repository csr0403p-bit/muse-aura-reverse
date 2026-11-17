package com.facebook.aura.maps;

import X.AFR;
import X.AbstractC7559F3s;
import X.C1HY;
import android.content.Context;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.maps.scene.HatchMapTheme;
import com.meta.maps.display.SDKInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMapPresentationKt$rememberHatchRetainedMapPresentation$lease$1$1 extends AbstractC7559F3s implements Function0<HatchRetainedMapPresentation> {
    public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
    public final /* synthetic */ HatchMapAgenticSceneFlowCacheRegistry $cacheRegistry;
    public final /* synthetic */ SDKInsets $cameraInsets;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchMapDisplayMode $displayMode;
    public final /* synthetic */ boolean $isDarkMode;
    public final /* synthetic */ C1HY $owner;
    public final /* synthetic */ HatchMapScene $scene;
    public final /* synthetic */ boolean $selectsFirstElementOnEnter;
    public final /* synthetic */ HatchMapTheme $theme;

    /* renamed from: com.facebook.aura.maps.HatchMapPresentationKt$rememberHatchRetainedMapPresentation$lease$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
        public final /* synthetic */ HatchMapAgenticSceneFlowCacheRegistry $cacheRegistry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchMapAgenticSceneFlowCacheRegistry hatchMapAgenticSceneFlowCacheRegistry, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
            super(0);
            this.$cacheRegistry = hatchMapAgenticSceneFlowCacheRegistry;
            this.$cache = hatchMapAgenticSceneFlowCache;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$cacheRegistry.release(this.$cache);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapPresentationKt$rememberHatchRetainedMapPresentation$lease$1$1(HatchMapAgenticSceneFlowCacheRegistry hatchMapAgenticSceneFlowCacheRegistry, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, HatchMapScene hatchMapScene, HatchMapTheme hatchMapTheme, HatchMapDisplayMode hatchMapDisplayMode, SDKInsets sDKInsets, boolean z, boolean z2, C1HY c1hy, Context context) {
        super(0);
        this.$cacheRegistry = hatchMapAgenticSceneFlowCacheRegistry;
        this.$cache = hatchMapAgenticSceneFlowCache;
        this.$scene = hatchMapScene;
        this.$theme = hatchMapTheme;
        this.$displayMode = hatchMapDisplayMode;
        this.$cameraInsets = sDKInsets;
        this.$isDarkMode = z;
        this.$selectsFirstElementOnEnter = z2;
        this.$owner = c1hy;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchRetainedMapPresentation invoke() {
        this.$cacheRegistry.retain(this.$cache);
        HatchMapNavigationController hatchMapNavigationController = new HatchMapNavigationController();
        HatchMapFlowController hatchMapFlowController = new HatchMapFlowController();
        HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow = new HatchMapAgenticSceneFlow(hatchMapNavigationController, this.$scene, this.$theme, this.$displayMode, this.$cameraInsets, this.$isDarkMode, this.$cache, this.$selectsFirstElementOnEnter);
        hatchMapFlowController.push(hatchMapAgenticSceneFlow);
        HatchMapScene hatchMapScene = this.$scene;
        C1HY c1hy = this.$owner;
        return new HatchRetainedMapPresentation(hatchMapScene, c1hy, this.$theme, this.$cache, new AFR(this.$context, c1hy, HatchBaseMapViewFactory.INSTANCE), hatchMapNavigationController, hatchMapFlowController, hatchMapAgenticSceneFlow, new AnonymousClass1(this.$cacheRegistry, this.$cache));
    }
}
