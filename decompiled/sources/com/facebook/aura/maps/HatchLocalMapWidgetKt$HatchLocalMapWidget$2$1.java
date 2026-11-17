package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.maps.model.HatchMapScene;

/* loaded from: classes4.dex */
public final class HatchLocalMapWidgetKt$HatchLocalMapWidget$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ HatchMapScene $scene;
    public final /* synthetic */ HatchMapSceneRegistry $sceneRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLocalMapWidgetKt$HatchLocalMapWidget$2$1(HatchMapSceneRegistry hatchMapSceneRegistry, String str, HatchMapScene hatchMapScene) {
        super(1);
        this.$sceneRegistry = hatchMapSceneRegistry;
        this.$presentationId = str;
        this.$scene = hatchMapScene;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$sceneRegistry.publish(this.$presentationId, this.$scene);
        return new C78g() { // from class: com.facebook.aura.maps.HatchLocalMapWidgetKt$HatchLocalMapWidget$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
