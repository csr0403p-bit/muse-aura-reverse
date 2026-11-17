package com.facebook.aura.maps;

import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BRg;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes4.dex */
public final class HatchMapAnalytics {
    public static final int $stable = 0;
    public static final HatchMapAnalytics INSTANCE = new HatchMapAnalytics();

    public final BRg fullscreenMapImpression(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.CHAT, HatchSurface.CHAT, null, HatchScreen.FULL_SCREEN_MAP, HatchComponent.MAP, null, null, null, 500L, 0.0f, FGI.A0a("fullscreenmap:", str, ":", j), null, null);
    }

    public final BRg inlineMapImpression(String str) {
        C7384Etj.A0Y(str, 0);
        return HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.CHAT, HatchSurface.CHAT, null, HatchScreen.INLINE_MAP, HatchComponent.MAP, null, null, null, 500L, 0.0f, FGI.A0M("inlinemap:", str), null, null);
    }

    public final void logMarkerClick(HatchMapDisplayMode hatchMapDisplayMode, String str) {
        AnonymousClass003.A0u(hatchMapDisplayMode, str);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchMapAnalyticsKt.getAnalyticsScreen(hatchMapDisplayMode), HatchComponent.MARKER, str, null, null);
    }

    public final void logPlaceCardClick(HatchMapDisplayMode hatchMapDisplayMode, String str) {
        AnonymousClass003.A0u(hatchMapDisplayMode, str);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchMapAnalyticsKt.getAnalyticsScreen(hatchMapDisplayMode), HatchComponent.PLACE_CARD, str, null, null);
    }

    public final void logPlaceDetailsClick(HatchComponent hatchComponent, String str) {
        AnonymousClass003.A0u(hatchComponent, str);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.MAP_PLACE_DETAILS, hatchComponent, str, null, null);
    }

    public final void logReviewClick(String str, int i) {
        C7384Etj.A0Y(str, 0);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.MAP_PLACE_DETAILS, HatchComponent.REVIEW, str, AnonymousClass006.A10(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i)), null);
    }

    public final BRg placeDetailsImpression(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.CHAT, HatchSurface.CHAT, null, HatchScreen.MAP_PLACE_DETAILS, HatchComponent.MAP_PLACE_DETAILS, str, null, null, 500L, 0.0f, FGI.A0a("mapplacedetails:", str, ":", j), null, null);
    }

    public final void logExpand() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.INLINE_MAP, HatchComponent.EXPAND, null, null, null);
    }

    public final void logFullscreenClose() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.FULL_SCREEN_MAP, HatchComponent.CLOSE_BUTTON, null, null, null);
    }
}
