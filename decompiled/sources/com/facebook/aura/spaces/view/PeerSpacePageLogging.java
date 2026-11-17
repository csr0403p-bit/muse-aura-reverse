package com.facebook.aura.spaces.view;

import X.BRg;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.pairs.intf.ConnectionsAnalytics;

/* loaded from: classes.dex */
public final class PeerSpacePageLogging implements SpacePageLogging {
    public final String presentationKey;
    public final HatchScreen retryScreen;
    public final HatchSubsurface retrySubsurface;
    public final HatchSurface retrySurface;

    public PeerSpacePageLogging(String str) {
        C7384Etj.A0Y(str, 0);
        this.presentationKey = str;
        this.retrySurface = ConnectionsAnalytics.surface;
        this.retryScreen = HatchScreen.PEER_SPACE;
    }

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
        ConnectionsAnalytics connectionsAnalytics = ConnectionsAnalytics.INSTANCE;
        HatchComponent hatchComponent = HatchComponent.CONNECTIONS_SCREEN_VIEW;
        return connectionsAnalytics.peerSpaceImpression(hatchComponent, FGI.A0U(this.presentationKey, ":", hatchComponent.getValue()));
    }

    @Override // com.facebook.aura.spaces.view.SpacePageLogging
    public void logLinkClick(String str) {
        ConnectionsAnalytics.INSTANCE.logPeerSpaceClick(HatchComponent.EXTERNAL_LINK);
    }

    @Override // com.facebook.aura.spaces.view.SpacePageLogging
    public void logInPageBackClick(String str) {
    }
}
