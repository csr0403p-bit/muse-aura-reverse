package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.header.view.HatchStatusPillMetrics;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $avatarPanelAllowedNow;
    public final /* synthetic */ boolean $imeVisible;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$3$1(boolean z, boolean z2, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(1);
        this.$avatarPanelAllowedNow = z;
        this.$imeVisible = z2;
        this.$pillMetrics = hatchStatusPillMetrics;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$avatarPanelAllowedNow || this.$imeVisible) {
            this.$pillMetrics.setAvatarExpanded(false);
        }
        return new C78g() { // from class: com.facebook.aura.main.HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
