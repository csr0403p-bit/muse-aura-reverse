package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.header.view.HatchStatusPillMetrics;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$StatusPillContent$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $canReportBounds;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$StatusPillContent$1$1(boolean z, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(1);
        this.$canReportBounds = z;
        this.$pillMetrics = hatchStatusPillMetrics;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final boolean z = this.$canReportBounds;
        final HatchStatusPillMetrics hatchStatusPillMetrics = this.$pillMetrics;
        return new C78g() { // from class: com.facebook.aura.status.view.HatchStatusPillKt$StatusPillContent$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (z) {
                    hatchStatusPillMetrics.setPillBoundsInWindow(null);
                }
            }
        };
    }
}
