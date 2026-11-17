package com.facebook.aura.main;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL4;
import X.C1DG;
import X.G0U;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$4$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ boolean $reportsPillBottom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$4$1$1(boolean z, HatchStatusPillMetrics hatchStatusPillMetrics, AXN axn) {
        super(1);
        this.$reportsPillBottom = z;
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$density = axn;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1344invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1344invokeozmzZPI(long j) {
        if (this.$reportsPillBottom) {
            this.$pillMetrics.m1009setRenderedPillBottomYLDhkOg(new C1DG(this.$density.Agy(AnonymousClass002.A09(j))));
        }
    }
}
