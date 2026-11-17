package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.header.view.HatchStatusPillMetrics;

/* loaded from: classes.dex */
public final class HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Object $panelOwner;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$4$1(HatchStatusPillMetrics hatchStatusPillMetrics, Object obj) {
        super(1);
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$panelOwner = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchStatusPillMetrics hatchStatusPillMetrics = this.$pillMetrics;
        final Object obj = this.$panelOwner;
        return new C78g() { // from class: com.facebook.aura.status.view.HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (hatchStatusPillMetrics.avatarPanelOwner$delegate.getValue() == obj) {
                    hatchStatusPillMetrics.setAvatarPanelOwner(null);
                    hatchStatusPillMetrics.setAvatarExpanded(false);
                    hatchStatusPillMetrics.setAvatarPanelDragProgress(null);
                    hatchStatusPillMetrics.setAvatarPanelSettleVelocity(null);
                    hatchStatusPillMetrics.setAvatarPanelProgress(0.0f);
                    hatchStatusPillMetrics.setAvatarPanelBottomPx(0.0f);
                }
            }
        };
    }
}
