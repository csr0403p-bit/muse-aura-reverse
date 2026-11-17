package com.facebook.aura.livesession.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.partners.voice.impl.HatchVoiceLiveSessionProvider;

/* loaded from: classes2.dex */
public class LiveSessionProviderStatic {
    public static LiveSession liveSession(int i, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return HatchVoiceLiveSessionProvider.INSTANCE.liveSession(abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
