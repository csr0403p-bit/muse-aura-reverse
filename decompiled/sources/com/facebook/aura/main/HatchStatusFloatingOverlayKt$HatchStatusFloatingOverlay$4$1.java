package com.facebook.aura.main;

import X.AbstractC7559F3s;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$4$1(HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(0);
        this.$pillMetrics = hatchStatusPillMetrics;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$pillMetrics.setAvatarExpanded(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
