package com.facebook.aura.spaces.conversation;

import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;

/* loaded from: classes.dex */
public final class SpaceCardAnalytics {
    public static final int $stable = 0;
    public static final SpaceCardAnalytics INSTANCE = new SpaceCardAnalytics();

    public final void logBuildSpaceClick(String str, Map<String, String> map) {
        AnonymousClass003.A0u(str, map);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.TRY_IT_BUTTON, str, map, null);
    }

    public final void logOpenSpaceClick(HatchScreen hatchScreen, String str, Map<String, String> map) {
        AnonymousClass003.A0v(hatchScreen, map);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.TAB_SPACE, str, map, null);
    }

    public final void logSpaceCardMenuClick(HatchScreen hatchScreen, String str, Map<String, String> map) {
        AnonymousClass005.A0x(hatchScreen, str, map);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.DOT_MENU, hatchScreen, HatchComponent.SPACE_CARD, str, map, null);
    }
}
