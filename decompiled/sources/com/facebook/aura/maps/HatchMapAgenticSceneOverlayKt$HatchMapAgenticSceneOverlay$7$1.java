package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.C9Tm;
import X.G0U;
import com.facebook.aura.maps.model.HatchMapScene;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$7$1 extends AbstractC7559F3s implements G0U<C9Tm, Boolean> {
    public final /* synthetic */ HatchMapAgenticScenePresentation $presentation;

    @Override // X.G0U
    public final Boolean invoke(C9Tm c9Tm) {
        C7384Etj.A0Y(c9Tm, 0);
        HatchMapAnalytics hatchMapAnalytics = HatchMapAnalytics.INSTANCE;
        HatchMapAgenticScenePresentation hatchMapAgenticScenePresentation = this.$presentation;
        HatchMapDisplayMode hatchMapDisplayMode = hatchMapAgenticScenePresentation.displayMode;
        HatchMapScene hatchMapScene = hatchMapAgenticScenePresentation.scene;
        String str = c9Tm.A09;
        hatchMapAnalytics.logPlaceCardClick(hatchMapDisplayMode, HatchMapAnalyticsKt.analyticsId(hatchMapScene, str));
        G0U<String, Unit> g0u = this.$presentation.onPlaceDetailsRequested;
        if (g0u != null) {
            g0u.invoke(str);
        }
        return AnonymousClass001.A0i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$7$1(HatchMapAgenticScenePresentation hatchMapAgenticScenePresentation) {
        super(1);
        this.$presentation = hatchMapAgenticScenePresentation;
    }
}
