package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.view.HatchStatusPillMetrics;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$7$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AvatarTakeover $avatarTakeover;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ Object $takeoverAvatarOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$7$1(HatchStatusPillMetrics hatchStatusPillMetrics, AvatarTakeover avatarTakeover, Object obj) {
        super(1);
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$avatarTakeover = avatarTakeover;
        this.$takeoverAvatarOwner = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchStatusPillMetrics hatchStatusPillMetrics = this.$pillMetrics;
        final AvatarTakeover avatarTakeover = this.$avatarTakeover;
        final Object obj = this.$takeoverAvatarOwner;
        return new C78g() { // from class: com.facebook.aura.main.HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$7$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchStatusPillMetrics.m1009setRenderedPillBottomYLDhkOg(null);
                hatchStatusPillMetrics.setAvatarBoundsInWindow(null);
                hatchStatusPillMetrics.setAvatarPanelAllowed(false);
                AvatarTakeover avatarTakeover2 = avatarTakeover;
                if (avatarTakeover2 != null) {
                    avatarTakeover2.updateVisibility(obj, false);
                }
            }
        };
    }
}
