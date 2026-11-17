package com.facebook.aura.livesession.api;

import X.AnonymousClass005;
import com.facebook.aura.partners.voice.impl.HatchVoiceLiveSessionChromeProvider;

/* loaded from: classes.dex */
public class LiveSessionChromeProviderStatic {
    public static LiveSessionChrome chrome(int i) {
        if (i == 0) {
            return HatchVoiceLiveSessionChromeProvider.INSTANCE.chrome();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
