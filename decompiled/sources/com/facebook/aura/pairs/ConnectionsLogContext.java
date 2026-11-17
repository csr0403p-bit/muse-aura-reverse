package com.facebook.aura.pairs;

import X.AnonymousClass003;
import com.facebook.aura.analytics.hatch.HatchScreen;

/* loaded from: classes3.dex */
public final class ConnectionsLogContext {
    public static final int $stable = 0;
    public final String presentationKey;
    public final HatchScreen screen;

    public final String getPresentationKey() {
        return this.presentationKey;
    }

    public final HatchScreen getScreen() {
        return this.screen;
    }

    public ConnectionsLogContext(HatchScreen hatchScreen, String str) {
        AnonymousClass003.A0u(hatchScreen, str);
        this.screen = hatchScreen;
        this.presentationKey = str;
    }
}
