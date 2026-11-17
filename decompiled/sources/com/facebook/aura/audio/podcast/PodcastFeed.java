package com.facebook.aura.audio.podcast;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class PodcastFeed extends C06G {
    public final String cover;
    public final String feedTitle;
    public final String feedUrl;

    public PodcastFeed(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.feedTitle = str;
        this.feedUrl = str2;
        this.cover = str3;
    }

    public final PodcastFeed copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new PodcastFeed(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PodcastFeed) {
                PodcastFeed podcastFeed = (PodcastFeed) obj;
                if (!C7384Etj.areEqual(this.feedTitle, podcastFeed.feedTitle) || !C7384Etj.areEqual(this.feedUrl, podcastFeed.feedUrl) || !C7384Etj.areEqual(this.cover, podcastFeed.cover)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PodcastFeed copy$default(PodcastFeed podcastFeed, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = podcastFeed.feedTitle;
        }
        if ((i & 2) != 0) {
            str2 = podcastFeed.feedUrl;
        }
        if ((i & 4) != 0) {
            str3 = podcastFeed.cover;
        }
        return podcastFeed.copy(str, str2, str3);
    }

    public final String component1() {
        return this.feedTitle;
    }

    public final String component2() {
        return this.feedUrl;
    }

    public final String component3() {
        return this.cover;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getFeedTitle() {
        return this.feedTitle;
    }

    public final String getFeedUrl() {
        return this.feedUrl;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.feedTitle) + AnonymousClass006.A0G(this.feedUrl)) * 31) + AnonymousClass005.A0H(this.cover);
    }

    public String toString() {
        return super.toString();
    }
}
