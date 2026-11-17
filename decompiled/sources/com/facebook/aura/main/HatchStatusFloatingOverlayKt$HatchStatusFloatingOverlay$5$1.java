package com.facebook.aura.main;

import X.AbstractC7559F3s;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $avatarPanelAllowedNow;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$5$1(HatchStatusPillMetrics hatchStatusPillMetrics, boolean z) {
        super(0);
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$avatarPanelAllowedNow = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$pillMetrics.setAvatarPanelAllowed(this.$avatarPanelAllowedNow);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
