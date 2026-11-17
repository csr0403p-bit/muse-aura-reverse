package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BRg;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class VoiceAnnouncementAnalytics {
    public static final int $stable = 0;
    public static final VoiceAnnouncementAnalytics INSTANCE = new VoiceAnnouncementAnalytics();

    public final BRg impression(BRg bRg, String str) {
        AnonymousClass003.A0u(bRg, str);
        return HatchImpressionModifierKt.hatchImpression(bRg, HatchOrigin.CHAT, HatchSurface.VOICE_MODE, null, HatchScreen.VOICE_ANNOUNCEMENT, HatchComponent.VOICE_ANNOUNCEMENT_SHEET, str, null, null, 0L, 0.0f, FGI.A0M("voice_announcement:", str), null, null);
    }

    public final void logDismiss(String str) {
        AnonymousClass006.A0b(str).logDismiss(HatchSurface.VOICE_MODE, null, HatchScreen.VOICE_ANNOUNCEMENT, HatchComponent.VOICE_ANNOUNCEMENT_SHEET, str, null);
    }

    public final void logNotNow(String str) {
        C7384Etj.A0Y(str, 0);
        logClick(HatchComponent.NOT_NOW_BUTTON, str);
    }

    public final void logTalk(String str) {
        C7384Etj.A0Y(str, 0);
        logClick(HatchComponent.CONTINUE_BUTTON, str);
    }

    private final void logClick(HatchComponent hatchComponent, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.VOICE_MODE, null, HatchScreen.VOICE_ANNOUNCEMENT, hatchComponent, str, null, null);
    }
}
