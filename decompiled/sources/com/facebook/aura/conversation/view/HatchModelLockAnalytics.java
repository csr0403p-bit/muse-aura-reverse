package com.facebook.aura.conversation.view;

import X.BRg;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class HatchModelLockAnalytics {
    public static final int $stable = 0;
    public static final HatchModelLockAnalytics INSTANCE = new HatchModelLockAnalytics();

    public final BRg supportSheetImpression(String str) {
        C7384Etj.A0Y(str, 0);
        return HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.CHAT, HatchSurface.CHAT, null, HatchScreen.CONTACT_SUPPORT, null, null, null, null, 500L, 0.0f, str, null, null);
    }

    private final void logSupportSheetClick(HatchScreen hatchScreen, HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, hatchScreen, hatchComponent, null, null, null);
    }

    public final void logDoneClick() {
        logSupportSheetClick(HatchScreen.CONTACT_SUPPORT_SUCCESS, HatchComponent.CLOSE_BUTTON);
    }

    public final void logRetryClick() {
        logSupportSheetClick(HatchScreen.CONTACT_SUPPORT, HatchComponent.RETRY_BUTTON);
    }

    public final void logSubmitClick() {
        logSupportSheetClick(HatchScreen.CONTACT_SUPPORT, HatchComponent.SUPPORT_TICKET_SUBMIT_BUTTON);
    }

    public final void logViewSharedDataClick() {
        logSupportSheetClick(HatchScreen.CONTACT_SUPPORT, HatchComponent.DOWNLOAD_BUTTON);
    }
}
