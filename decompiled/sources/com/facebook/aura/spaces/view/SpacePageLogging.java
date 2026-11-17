package com.facebook.aura.spaces.view;

import X.BRg;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public interface SpacePageLogging {
    HatchScreen getRetryScreen();

    HatchSubsurface getRetrySubsurface();

    HatchSurface getRetrySurface();

    BRg impression(String str);

    void logInPageBackClick(String str);

    void logLinkClick(String str);
}
