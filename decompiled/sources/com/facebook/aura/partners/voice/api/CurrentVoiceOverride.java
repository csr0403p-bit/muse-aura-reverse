package com.facebook.aura.partners.voice.api;

import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CurrentVoiceOverride {
    public final long updatedAtMs;
    public final String voiceId;

    public CurrentVoiceOverride(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.voiceId = str;
        this.updatedAtMs = j;
    }

    public final long getUpdatedAtMs() {
        return this.updatedAtMs;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }
}
