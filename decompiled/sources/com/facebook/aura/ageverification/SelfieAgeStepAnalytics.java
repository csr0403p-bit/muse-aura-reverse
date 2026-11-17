package com.facebook.aura.ageverification;

import X.AnonymousClass003;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class SelfieAgeStepAnalytics {
    public static final int $stable = 0;
    public static final SelfieAgeStepAnalytics INSTANCE = new SelfieAgeStepAnalytics();

    public final void logClick(HatchComponent hatchComponent, HatchScreen hatchScreen) {
        AnonymousClass003.A0u(hatchComponent, hatchScreen);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, hatchScreen, hatchComponent, null, null, null);
    }

    public static /* synthetic */ void logClick$default(SelfieAgeStepAnalytics selfieAgeStepAnalytics, HatchComponent hatchComponent, HatchScreen hatchScreen, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchScreen = HatchScreen.ONBOARDING_AGE_CONFIRMATION;
        }
        selfieAgeStepAnalytics.logClick(hatchComponent, hatchScreen);
    }
}
