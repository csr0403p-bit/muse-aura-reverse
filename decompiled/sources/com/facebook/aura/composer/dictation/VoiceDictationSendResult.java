package com.facebook.aura.composer.dictation;

/* loaded from: classes5.dex */
public final class VoiceDictationSendResult {
    public static final int $stable = 0;
    public final boolean requested;
    public final boolean sent;

    public final boolean getRequested() {
        return this.requested;
    }

    public final boolean getSent() {
        return this.sent;
    }

    public VoiceDictationSendResult(boolean z, boolean z2) {
        this.requested = z;
        this.sent = z2;
    }
}
