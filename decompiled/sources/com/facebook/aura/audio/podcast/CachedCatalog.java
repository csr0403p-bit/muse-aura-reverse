package com.facebook.aura.audio.podcast;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class CachedCatalog {
    public final PodcastCatalog catalog;
    public final long fetchedAtMs;

    public CachedCatalog(PodcastCatalog podcastCatalog, long j) {
        C7384Etj.A0Y(podcastCatalog, 0);
        this.catalog = podcastCatalog;
        this.fetchedAtMs = j;
    }

    public final PodcastCatalog getCatalog() {
        return this.catalog;
    }

    public final long getFetchedAtMs() {
        return this.fetchedAtMs;
    }
}
