package com.facebook.aura.localbrowser.core;

/* loaded from: classes6.dex */
public final class BrowserEnginePageState {
    public final boolean available;
    public final long revision;

    public final boolean getAvailable() {
        return this.available;
    }

    public final long getRevision() {
        return this.revision;
    }

    public BrowserEnginePageState(long j, boolean z) {
        this.revision = j;
        this.available = z;
    }
}
