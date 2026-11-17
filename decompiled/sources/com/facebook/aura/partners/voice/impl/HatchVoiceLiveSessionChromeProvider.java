package com.facebook.aura.partners.voice.impl;

import com.facebook.aura.livesession.api.LiveSessionChrome;
import com.facebook.aura.livesession.api.LiveSessionChromeProvider;

/* loaded from: classes.dex */
public final class HatchVoiceLiveSessionChromeProvider implements LiveSessionChromeProvider {
    public static final int $stable = 0;
    public static final HatchVoiceLiveSessionChromeProvider INSTANCE = new HatchVoiceLiveSessionChromeProvider();

    @Override // com.facebook.aura.livesession.api.LiveSessionChromeProvider
    public LiveSessionChrome chrome() {
        return HatchVoiceLiveSessionChrome.INSTANCE;
    }
}
