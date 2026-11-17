package com.facebook.aura.ui.adaptive;

import X.BFM;

/* loaded from: classes.dex */
public abstract class AuraSidePanelPresentationKt {
    public static final AuraSidePanelPresentation auraSidePanelPresentation(BFM bfm, int i) {
        AuraAdaptiveInfo auraAdaptiveInfo = (AuraAdaptiveInfo) bfm.A6v(AuraAdaptiveInfoKt.LocalAuraAdaptiveInfo);
        return auraAdaptiveInfo.isTwoPane() ? AuraSidePanelPresentation.Docked : auraAdaptiveInfo.isCompact() ? AuraSidePanelPresentation.PushAside : AuraSidePanelPresentation.Floating;
    }
}
