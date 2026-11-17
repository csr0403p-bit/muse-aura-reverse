package com.facebook.aura.status.view;

import X.C78g;
import com.facebook.aura.header.view.HatchStatusPillMetrics;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$5$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics$inlined;

    public HatchStatusPillKt$HatchStatusPill$5$1$invoke$$inlined$onDispose$1(HatchStatusPillMetrics hatchStatusPillMetrics) {
        this.$pillMetrics$inlined = hatchStatusPillMetrics;
    }

    @Override // X.C78g
    public void dispose() {
        this.$pillMetrics$inlined.setAvatarBoundsInWindow(null);
    }
}
