package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.meta.maps.display.SDKInsets;

/* loaded from: classes4.dex */
public final class HatchMapHostKt$MapDisplayModeEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchMapDisplayMode $displayMode;
    public final /* synthetic */ HatchMapAgenticSceneFlow $flow;
    public final /* synthetic */ SDKInsets $resolvedCameraInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapHostKt$MapDisplayModeEffect$1$1(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, HatchMapDisplayMode hatchMapDisplayMode, SDKInsets sDKInsets) {
        super(1);
        this.$flow = hatchMapAgenticSceneFlow;
        this.$displayMode = hatchMapDisplayMode;
        this.$resolvedCameraInsets = sDKInsets;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$flow.updateDisplayMode(this.$displayMode, this.$resolvedCameraInsets);
        return new C78g() { // from class: com.facebook.aura.maps.HatchMapHostKt$MapDisplayModeEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
