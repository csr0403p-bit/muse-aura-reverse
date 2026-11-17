package com.facebook.aura.main;

import X.AbstractC7559F3s;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$2$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$2$1(HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(0);
        this.$pillMetrics = hatchStatusPillMetrics;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$pillMetrics.avatarPanelProgress$delegate.AFn());
    }
}
