package com.facebook.aura.pairs.intf;

import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BRg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class ConnectionsAnalytics {
    public static final ConnectionsAnalytics INSTANCE = new ConnectionsAnalytics();
    public static final HatchOrigin origin = HatchOrigin.CONNECTIONS;
    public static final HatchSurface surface = HatchSurface.CONNECTIONS;

    public final void logPeerSpaceClick(HatchComponent hatchComponent) {
        AnonymousClass006.A0b(hatchComponent).logClick(surface, null, HatchScreen.PEER_SPACE, hatchComponent, null, null, null);
    }

    public final BRg peerSpaceImpression(HatchComponent hatchComponent, String str) {
        AnonymousClass003.A0u(hatchComponent, str);
        return HatchImpressionModifierKt.hatchImpression(BRg.A00, origin, surface, null, HatchScreen.PEER_SPACE, hatchComponent, null, null, null, 500L, 0.0f, str, null, null);
    }

    public final HatchOrigin getOrigin() {
        return origin;
    }

    public final HatchSurface getSurface() {
        return surface;
    }
}
