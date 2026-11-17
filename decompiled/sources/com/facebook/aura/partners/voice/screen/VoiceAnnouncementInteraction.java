package com.facebook.aura.partners.voice.screen;

import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceAnnouncementInteraction {
    public static final int $stable = 8;
    public boolean logged;
    public final String presentationId;

    public VoiceAnnouncementInteraction(String str) {
        C7384Etj.A0Y(str, 0);
        this.presentationId = str;
    }

    private final void logOnce(Function0<Unit> function0) {
        if (this.logged) {
            return;
        }
        this.logged = true;
        function0.invoke();
    }

    public final void logDismissIfNeeded() {
        if (this.logged) {
            return;
        }
        this.logged = true;
        VoiceAnnouncementAnalytics.INSTANCE.logDismiss(this.presentationId);
    }

    public final void logNotNow() {
        if (this.logged) {
            return;
        }
        this.logged = true;
        VoiceAnnouncementAnalytics.INSTANCE.logNotNow(this.presentationId);
    }

    public final void logTalk() {
        if (this.logged) {
            return;
        }
        this.logged = true;
        VoiceAnnouncementAnalytics.INSTANCE.logTalk(this.presentationId);
    }
}
