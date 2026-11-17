package com.facebook.aura.status.view;

import X.AaC;
import X.AbstractC7559F3s;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ AaC $reportedBounds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$4$1(HatchStatusPillMetrics hatchStatusPillMetrics, AaC aaC) {
        super(0);
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$reportedBounds = aaC;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$pillMetrics.setAvatarBoundsInWindow(this.$reportedBounds);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
