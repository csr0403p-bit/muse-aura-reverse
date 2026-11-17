package com.facebook.aura.spaces.view;

import X.AIW;
import X.AnonymousClass007;
import X.BRg;
import X.BS0;
import X.C0924AIa;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class OwnedSpacePageLogging implements SpacePageLogging {
    public final HatchSpaceEntryPoint entryPoint;
    public final HatchSurface retrySurface = HatchSurface.SPACES;
    public final HatchSubsurface retrySubsurface = HatchSubsurface.SPACES_CAROUSEL;
    public final HatchScreen retryScreen = HatchScreen.SPACES_HOME;

    @Override // com.facebook.aura.spaces.view.SpacePageLogging
    public HatchScreen getRetryScreen() {
        return this.retryScreen;
    }

    @Override // com.facebook.aura.spaces.view.SpacePageLogging
    public HatchSubsurface getRetrySubsurface() {
        return this.retrySubsurface;
    }

    @Override // com.facebook.aura.spaces.view.SpacePageLogging
    public HatchSurface getRetrySurface() {
        return this.retrySurface;
    }

    @Override // com.facebook.aura.spaces.view.SpacePageLogging
    public BRg impression(String str) {
        BS0 bs0 = BRg.A00;
        HatchOrigin hatchOrigin = HatchOrigin.SPACES;
        HatchSurface hatchSurface = HatchSurface.SPACES;
        HatchSubsurface hatchSubsurface = HatchSubsurface.SPACES_CAROUSEL;
        HatchScreen hatchScreen = HatchScreen.SPACES_HOME;
        HatchComponent hatchComponent = HatchComponent.SPACE_CARD;
        C0924AIa c0924AIaA0i = AnonymousClass007.A0i(str);
        HatchSpaceEntryPoint hatchSpaceEntryPoint = this.entryPoint;
        if (hatchSpaceEntryPoint != null) {
            c0924AIaA0i.put(HatchMetadataKey.ENTRY_POINT.getValue(), hatchSpaceEntryPoint.getValue());
        }
        return HatchImpressionModifierKt.hatchImpression(bs0, hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AIW.A0K(c0924AIaA0i), 0, 500L, 0.0f, null, null, null);
    }

    @Override // com.facebook.aura.spaces.view.SpacePageLogging
    public void logInPageBackClick(String str) {
        HatchSpacesModalScreenKt.logSpacePageClick(HatchComponent.BACK_BUTTON, str);
    }

    @Override // com.facebook.aura.spaces.view.SpacePageLogging
    public void logLinkClick(String str) {
        HatchSpacesModalScreenKt.logSpacePageClick(HatchComponent.EXTERNAL_LINK, str);
    }

    public OwnedSpacePageLogging(HatchSpaceEntryPoint hatchSpaceEntryPoint) {
        this.entryPoint = hatchSpaceEntryPoint;
    }
}
