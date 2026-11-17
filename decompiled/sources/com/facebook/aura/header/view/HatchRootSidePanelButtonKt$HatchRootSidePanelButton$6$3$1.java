package com.facebook.aura.header.view;

import X.AXN;
import X.AaC;
import X.AbstractC7559F3s;
import X.C1DG;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchRootSidePanelButtonKt$HatchRootSidePanelButton$6$3$1 extends AbstractC7559F3s implements G0U<AaC, Unit> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        this.$pillMetrics.m1008setLeadingChromeCenterYYLDhkOg(new C1DG(this.$density.Agx((aaC.A03 + aaC.A00) / 2.0f)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRootSidePanelButtonKt$HatchRootSidePanelButton$6$3$1(HatchStatusPillMetrics hatchStatusPillMetrics, AXN axn) {
        super(1);
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$density = axn;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC) {
        invoke2(aaC);
        return Unit.INSTANCE;
    }
}
