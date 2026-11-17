package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass003;
import X.BRg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;

/* loaded from: classes.dex */
public final class VoiceNuxAnalytics {
    public static final int $stable = 0;
    public static final VoiceNuxAnalytics INSTANCE = new VoiceNuxAnalytics();

    public final BRg impression(BRg bRg, Map<String, String> map, String str) {
        AnonymousClass003.A0v(bRg, str);
        return HatchImpressionModifierKt.hatchImpression(bRg, HatchOrigin.CHAT, HatchSurface.VOICE_MODE, null, HatchScreen.VOICE_NUX, HatchComponent.VOICE_NUX_SHEET, null, map, null, 0L, 0.0f, str, null, null);
    }

    private final void logClick(HatchComponent hatchComponent, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.VOICE_MODE, null, HatchScreen.VOICE_NUX, hatchComponent, null, map, null);
    }

    public final void logContinue(Map<String, String> map) {
        logClick(HatchComponent.CONTINUE_BUTTON, map);
    }

    public final void logDismiss(Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.VOICE_MODE, null, HatchScreen.VOICE_NUX, HatchComponent.VOICE_NUX_SHEET, null, map);
    }

    public final void logNotNow(Map<String, String> map) {
        logClick(HatchComponent.NOT_NOW_BUTTON, map);
    }
}
