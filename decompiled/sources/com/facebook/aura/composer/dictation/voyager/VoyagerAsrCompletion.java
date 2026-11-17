package com.facebook.aura.composer.dictation.voyager;

import X.AnonymousClass003;

/* loaded from: classes5.dex */
public final class VoyagerAsrCompletion {
    public final String sessionId;
    public final String terminalReason;
    public final boolean usedPreRewriteText;

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTerminalReason() {
        return this.terminalReason;
    }

    public final boolean getUsedPreRewriteText() {
        return this.usedPreRewriteText;
    }

    public VoyagerAsrCompletion(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.sessionId = str;
        this.terminalReason = str2;
        this.usedPreRewriteText = z;
    }
}
