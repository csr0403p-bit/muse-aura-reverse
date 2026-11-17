package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchTabHeaderKt$HatchTabHeader$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Object $chromeOwner;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTabHeaderKt$HatchTabHeader$3$1(HatchStatusPillMetrics hatchStatusPillMetrics, Object obj) {
        super(1);
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$chromeOwner = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchStatusPillMetrics hatchStatusPillMetrics = this.$pillMetrics;
        final Object obj = this.$chromeOwner;
        return new C78g() { // from class: com.facebook.aura.header.view.HatchTabHeaderKt$HatchTabHeader$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (hatchStatusPillMetrics.headerRowOwner$delegate.getValue() == obj) {
                    hatchStatusPillMetrics.setHeaderRowOwner(null);
                    hatchStatusPillMetrics.m1007setHeaderRowBottomYLDhkOg(null);
                }
                if (hatchStatusPillMetrics.trailingChromeOwner$delegate.getValue() == obj) {
                    hatchStatusPillMetrics.setTrailingChromeOwner(null);
                    hatchStatusPillMetrics.m1011setTrailingChromeWidth0680j_4(0.0f);
                    hatchStatusPillMetrics.m1010setTrailingChromeCenterYYLDhkOg(null);
                }
            }
        };
    }
}
