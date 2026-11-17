package com.facebook.aura.audio.podcast;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class PodcastCatalog extends C06G {
    public final List<PodcastEpisode> episodes;
    public final PodcastFeed feed;

    public PodcastCatalog(List<PodcastEpisode> list, PodcastFeed podcastFeed) {
        C7384Etj.A0Y(list, 0);
        this.episodes = list;
        this.feed = podcastFeed;
    }

    public final PodcastCatalog copy(List<PodcastEpisode> list, PodcastFeed podcastFeed) {
        C7384Etj.A0Y(list, 0);
        return new PodcastCatalog(list, podcastFeed);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PodcastCatalog) {
                PodcastCatalog podcastCatalog = (PodcastCatalog) obj;
                if (!C7384Etj.areEqual(this.episodes, podcastCatalog.episodes) || !C7384Etj.areEqual(this.feed, podcastCatalog.feed)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PodcastCatalog copy$default(PodcastCatalog podcastCatalog, List list, PodcastFeed podcastFeed, int i, Object obj) {
        if ((i & 1) != 0) {
            list = podcastCatalog.episodes;
        }
        if ((i & 2) != 0) {
            podcastFeed = podcastCatalog.feed;
        }
        C7384Etj.A0Y(list, 0);
        return new PodcastCatalog(list, podcastFeed);
    }

    public final List<PodcastEpisode> component1() {
        return this.episodes;
    }

    public final PodcastFeed component2() {
        return this.feed;
    }

    public final List<PodcastEpisode> getEpisodes() {
        return this.episodes;
    }

    public final PodcastFeed getFeed() {
        return this.feed;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.episodes) + AnonymousClass006.A0D(this.feed);
    }

    public String toString() {
        return super.toString();
    }
}
