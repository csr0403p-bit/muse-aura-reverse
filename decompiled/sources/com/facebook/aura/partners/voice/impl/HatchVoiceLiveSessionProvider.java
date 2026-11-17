package com.facebook.aura.partners.voice.impl;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.livesession.api.LiveSession;
import com.facebook.aura.livesession.api.LiveSessionProvider;

/* loaded from: classes2.dex */
public final class HatchVoiceLiveSessionProvider implements LiveSessionProvider {
    public static final int $stable = 0;
    public static final HatchVoiceLiveSessionProvider INSTANCE = new HatchVoiceLiveSessionProvider();

    @Override // com.facebook.aura.livesession.api.LiveSessionProvider
    public LiveSession liveSession(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return new VoiceLiveSession(abstractC3358CGz);
    }
}
