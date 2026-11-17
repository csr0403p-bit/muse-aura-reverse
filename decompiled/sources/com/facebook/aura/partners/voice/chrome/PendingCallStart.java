package com.facebook.aura.partners.voice.chrome;

import X.C7384Etj;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;

/* loaded from: classes2.dex */
public final class PendingCallStart {
    public final VoiceCallStart start;
    public final String threadId;

    public PendingCallStart(String str, VoiceCallStart voiceCallStart) {
        C7384Etj.A0Y(voiceCallStart, 1);
        this.threadId = str;
        this.start = voiceCallStart;
    }

    public final VoiceCallStart getStart() {
        return this.start;
    }

    public final String getThreadId() {
        return this.threadId;
    }
}
