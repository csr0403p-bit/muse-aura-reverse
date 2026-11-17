package com.facebook.aura.audio.podcast;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PodcastEpisodeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String cover;
    public final String feed_url;
    public final String slug;
    public final String spotify_episode_uri;
    public final String title;

    public final class Companion {
        public final C9hr<PodcastEpisodeJson> serializer() {
            return PodcastEpisodeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_audio_podcast_podcast(PodcastEpisodeJson podcastEpisodeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(podcastEpisodeJson.slug)) {
            c9j5.AAV(podcastEpisodeJson.slug, c9iZ, 0);
        }
        if (zAfR || !"".equals(podcastEpisodeJson.title)) {
            c9j5.AAV(podcastEpisodeJson.title, c9iZ, 1);
        }
        if (zAfR || podcastEpisodeJson.cover != null) {
            c9j5.AAP(podcastEpisodeJson.cover, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || podcastEpisodeJson.feed_url != null) {
            c9j5.AAP(podcastEpisodeJson.feed_url, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || podcastEpisodeJson.spotify_episode_uri != null) {
            c9j5.AAP(podcastEpisodeJson.spotify_episode_uri, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PodcastEpisodeJson) {
                PodcastEpisodeJson podcastEpisodeJson = (PodcastEpisodeJson) obj;
                if (!C7384Etj.areEqual(this.slug, podcastEpisodeJson.slug) || !C7384Etj.areEqual(this.title, podcastEpisodeJson.title) || !C7384Etj.areEqual(this.cover, podcastEpisodeJson.cover) || !C7384Etj.areEqual(this.feed_url, podcastEpisodeJson.feed_url) || !C7384Etj.areEqual(this.spotify_episode_uri, podcastEpisodeJson.spotify_episode_uri)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PodcastEpisodeJson copy$default(PodcastEpisodeJson podcastEpisodeJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = podcastEpisodeJson.slug;
        }
        if ((i & 2) != 0) {
            str2 = podcastEpisodeJson.title;
        }
        if ((i & 4) != 0) {
            str3 = podcastEpisodeJson.cover;
        }
        if ((i & 8) != 0) {
            str4 = podcastEpisodeJson.feed_url;
        }
        if ((i & 16) != 0) {
            str5 = podcastEpisodeJson.spotify_episode_uri;
        }
        return podcastEpisodeJson.copy(str, str2, str3, str4, str5);
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
        return this.feed_url;
    }

    public final String component5() {
        return this.spotify_episode_uri;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getFeed_url() {
        return this.feed_url;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSpotify_episode_uri() {
        return this.spotify_episode_uri;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.slug)) + AnonymousClass006.A0G(this.cover)) * 31) + AnonymousClass006.A0G(this.feed_url)) * 31) + AnonymousClass005.A0H(this.spotify_episode_uri);
    }

    public final PodcastEpisode toDomain() {
        return new PodcastEpisode(this.slug, this.title, this.cover, this.feed_url, this.spotify_episode_uri);
    }

    public PodcastEpisodeJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        this.slug = str;
        this.title = str2;
        this.cover = str3;
        this.feed_url = str4;
        this.spotify_episode_uri = str5;
    }

    public final PodcastEpisodeJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        return new PodcastEpisodeJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PodcastEpisodeJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public /* synthetic */ PodcastEpisodeJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.slug = "";
        } else {
            this.slug = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.cover = null;
        } else {
            this.cover = str3;
        }
        if ((i & 8) == 0) {
            this.feed_url = null;
        } else {
            this.feed_url = str4;
        }
        if ((i & 16) == 0) {
            this.spotify_episode_uri = null;
        } else {
            this.spotify_episode_uri = str5;
        }
    }

    public PodcastEpisodeJson() {
        this("", "", null, null, null);
    }
}
