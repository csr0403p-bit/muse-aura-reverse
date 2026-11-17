package com.facebook.aura.partners.voice.api;

import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CachedCatalog {
    public final VoiceCatalog catalog;
    public final long fetchedAtMs;

    public CachedCatalog(VoiceCatalog voiceCatalog, long j) {
        C7384Etj.A0Y(voiceCatalog, 0);
        this.catalog = voiceCatalog;
        this.fetchedAtMs = j;
    }

    public final VoiceCatalog getCatalog() {
        return this.catalog;
    }

    public final long getFetchedAtMs() {
        return this.fetchedAtMs;
    }
}
