package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C1DG;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPageScreenKt$HatchPageScreen$3$1$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ float $pageHeaderHeight;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPageScreenKt$HatchPageScreen$3$1$2$1$1$1(HatchStatusPillMetrics hatchStatusPillMetrics, float f) {
        super(0);
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$pageHeaderHeight = f;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$pillMetrics.m1006setContentTopReservationYLDhkOg(new C1DG(this.$pageHeaderHeight));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
