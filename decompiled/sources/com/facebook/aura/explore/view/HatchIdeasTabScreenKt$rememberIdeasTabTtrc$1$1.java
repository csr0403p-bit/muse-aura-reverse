package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$rememberIdeasTabTtrc$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchNavTTRCCoordinator $navTtrcCoordinator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$rememberIdeasTabTtrc$1$1(HatchNavTTRCCoordinator hatchNavTTRCCoordinator) {
        super(1);
        this.$navTtrcCoordinator = hatchNavTTRCCoordinator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchNavTTRCCoordinator hatchNavTTRCCoordinator = this.$navTtrcCoordinator;
        HatchNavTTRCSpec.Surface surface = HatchNavTTRCSpec.Surface.IDEAS;
        if (hatchNavTTRCCoordinator.captureActiveToken(surface) == null) {
            this.$navTtrcCoordinator.startNavigation(surface, false, false, null, null);
        }
        return new C78g() { // from class: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$rememberIdeasTabTtrc$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
