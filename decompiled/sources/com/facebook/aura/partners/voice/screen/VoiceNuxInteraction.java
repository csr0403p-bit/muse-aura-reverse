package com.facebook.aura.partners.voice.screen;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceNuxInteraction {
    public static final int $stable = 8;
    public boolean logged;
    public final Map<String, String> metadata;

    private final void logOnce(Function0<Unit> function0) {
        if (this.logged) {
            return;
        }
        this.logged = true;
        function0.invoke();
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final void logContinue() {
        if (this.logged) {
            return;
        }
        this.logged = true;
        VoiceNuxAnalytics.INSTANCE.logContinue(this.metadata);
    }

    public final void logDismissIfNeeded() {
        if (this.logged) {
            return;
        }
        this.logged = true;
        VoiceNuxAnalytics.INSTANCE.logDismiss(this.metadata);
    }

    public final void logNotNow() {
        if (this.logged) {
            return;
        }
        this.logged = true;
        VoiceNuxAnalytics.INSTANCE.logNotNow(this.metadata);
    }

    public VoiceNuxInteraction(Map<String, String> map) {
        this.metadata = map;
    }
}
