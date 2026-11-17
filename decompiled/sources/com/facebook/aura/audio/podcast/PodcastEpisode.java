package com.facebook.aura.audio.podcast;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class PodcastEpisode extends C06G {
    public final String cover;
    public final String feedUrl;
    public final String slug;
    public final String spotifyEpisodeUri;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PodcastEpisode) {
                PodcastEpisode podcastEpisode = (PodcastEpisode) obj;
                if (!C7384Etj.areEqual(this.slug, podcastEpisode.slug) || !C7384Etj.areEqual(this.title, podcastEpisode.title) || !C7384Etj.areEqual(this.cover, podcastEpisode.cover) || !C7384Etj.areEqual(this.feedUrl, podcastEpisode.feedUrl) || !C7384Etj.areEqual(this.spotifyEpisodeUri, podcastEpisode.spotifyEpisodeUri)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PodcastEpisode copy$default(PodcastEpisode podcastEpisode, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = podcastEpisode.slug;
        }
        if ((i & 2) != 0) {
            str2 = podcastEpisode.title;
        }
        if ((i & 4) != 0) {
            str3 = podcastEpisode.cover;
        }
        if ((i & 8) != 0) {
            str4 = podcastEpisode.feedUrl;
        }
        if ((i & 16) != 0) {
            str5 = podcastEpisode.spotifyEpisodeUri;
        }
        return podcastEpisode.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.cover;
    }

    public final String component4() {
        return this.feedUrl;
    }

    public final String component5() {
        return this.spotifyEpisodeUri;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getFeedUrl() {
        return this.feedUrl;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSpotifyEpisodeUri() {
        return this.spotifyEpisodeUri;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.slug)) + AnonymousClass006.A0G(this.cover)) * 31) + AnonymousClass006.A0G(this.feedUrl)) * 31) + AnonymousClass005.A0H(this.spotifyEpisodeUri);
    }

    public PodcastEpisode(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        this.slug = str;
        this.title = str2;
        this.cover = str3;
        this.feedUrl = str4;
        this.spotifyEpisodeUri = str5;
    }

    public final PodcastEpisode copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        return new PodcastEpisode(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }
}
