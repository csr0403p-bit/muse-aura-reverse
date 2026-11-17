package com.facebook.aura.livesession.api;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C1BN;
import X.C20Q;
import X.C20Y;
import X.C3Pi;
import X.C7384Etj;
import com.facebook.aura.partners.voice.impl.HatchVoiceLiveSessionProvider;

/* loaded from: classes2.dex */
public final class LiveSessions {
    public static final int $stable = 0;
    public static final LiveSessions INSTANCE = new LiveSessions();
    public static final C1BN<Boolean> inactive = C3Pi.A00(AnonymousClass002.A0v(false));

    public final LiveSession forSession(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        int i = new int[]{0}[0];
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            return HatchVoiceLiveSessionProvider.INSTANCE.liveSession(abstractC3358CGz);
        }
        throw new IllegalArgumentException(String.format("No implementation bound to key: %s", numValueOf));
    }

    public final C1BN<Boolean> isActive(AbstractC3358CGz abstractC3358CGz) {
        C1BN<Boolean> c1bnIsActive;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        LiveSession liveSessionForSession = forSession(abstractC3358CGz);
        return (liveSessionForSession == null || (c1bnIsActive = liveSessionForSession.isActive()) == null) ? inactive : c1bnIsActive;
    }

    public final C20Q<Integer> statusOverride(AbstractC3358CGz abstractC3358CGz, String str) {
        C20Q<Integer> c20qStatusOverride;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        LiveSession liveSessionForSession = forSession(abstractC3358CGz);
        return (liveSessionForSession == null || (c20qStatusOverride = liveSessionForSession.statusOverride(str)) == null) ? new C20Y(null) : c20qStatusOverride;
    }
}
