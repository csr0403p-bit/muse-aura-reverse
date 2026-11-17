package com.facebook.aura.composer.dictation.voyager;

import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;

/* loaded from: classes5.dex */
public final class VoyagerAsrResult {
    public final DictationOutcome outcome;
    public final boolean serverAnswered;
    public final VoyagerAsrServerError serverError;
    public final String sessionId;
    public final String terminalReason;
    public final boolean usedPreRewriteText;

    public /* synthetic */ VoyagerAsrResult(String str, String str2, boolean z, DictationOutcome dictationOutcome, VoyagerAsrServerError voyagerAsrServerError, boolean z2, int i, C06H c06h) {
        this(str, str2, z, (i & 8) != 0 ? DictationOutcome.FAILED : dictationOutcome, (i & 16) != 0 ? null : voyagerAsrServerError, C3cG.A1K(i & 32, z2));
    }

    public final DictationOutcome getOutcome() {
        return this.outcome;
    }

    public final boolean getServerAnswered() {
        return this.serverAnswered;
    }

    public final VoyagerAsrServerError getServerError() {
        return this.serverError;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTerminalReason() {
        return this.terminalReason;
    }

    public final boolean getUsedPreRewriteText() {
        return this.usedPreRewriteText;
    }

    public VoyagerAsrResult(String str, String str2, boolean z, DictationOutcome dictationOutcome, VoyagerAsrServerError voyagerAsrServerError, boolean z2) {
        AnonymousClass003.A0w(str, dictationOutcome);
        this.terminalReason = str;
        this.sessionId = str2;
        this.usedPreRewriteText = z;
        this.outcome = dictationOutcome;
        this.serverError = voyagerAsrServerError;
        this.serverAnswered = z2;
    }
}
