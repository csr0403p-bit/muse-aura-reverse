package com.facebook.aura.globaleffects.api;

import X.C0981AMm;
import X.C78g;

/* loaded from: classes4.dex */
public final class AppFloatingLayerKt$AppFloatingLayers$lambda$4$0$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ long $id$inlined;
    public final /* synthetic */ C0981AMm $windows$inlined;

    public AppFloatingLayerKt$AppFloatingLayers$lambda$4$0$$inlined$onDispose$1(C0981AMm c0981AMm, long j) {
        this.$windows$inlined = c0981AMm;
        this.$id$inlined = j;
    }

    @Override // X.C78g
    public void dispose() {
        this.$windows$inlined.remove(Long.valueOf(this.$id$inlined));
    }
}
