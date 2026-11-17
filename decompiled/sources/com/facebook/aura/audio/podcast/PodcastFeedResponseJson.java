package com.facebook.aura.audio.podcast;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PodcastFeedResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final PodcastFeedJson feed;

    public final class Companion {
        public final C9hr<PodcastFeedResponseJson> serializer() {
            return PodcastFeedResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_audio_podcast_podcast(PodcastFeedResponseJson podcastFeedResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || podcastFeedResponseJson.feed != null) {
            c9j5.AAP(podcastFeedResponseJson.feed, PodcastFeedJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PodcastFeedResponseJson) && C7384Etj.areEqual(this.feed, ((PodcastFeedResponseJson) obj).feed));
    }

    public static /* synthetic */ PodcastFeedResponseJson copy$default(PodcastFeedResponseJson podcastFeedResponseJson, PodcastFeedJson podcastFeedJson, int i, Object obj) {
        if ((i & 1) != 0) {
            podcastFeedJson = podcastFeedResponseJson.feed;
        }
        return new PodcastFeedResponseJson(podcastFeedJson);
    }

    public final PodcastFeedJson component1() {
        return this.feed;
    }

    public final PodcastFeedResponseJson copy(PodcastFeedJson podcastFeedJson) {
        return new PodcastFeedResponseJson(podcastFeedJson);
    }

    public final PodcastFeedJson getFeed() {
        return this.feed;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.feed);
    }

    public final PodcastFeed toDomain() {
        PodcastFeedJson podcastFeedJson = this.feed;
        if (podcastFeedJson != null) {
            return podcastFeedJson.toDomain();
        }
        return null;
    }

    public /* synthetic */ PodcastFeedResponseJson(int i, PodcastFeedJson podcastFeedJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.feed = null;
        } else {
            this.feed = podcastFeedJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PodcastFeedResponseJson(PodcastFeedJson podcastFeedJson) {
        this.feed = podcastFeedJson;
    }

    public /* synthetic */ PodcastFeedResponseJson(PodcastFeedJson podcastFeedJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : podcastFeedJson);
    }

    public PodcastFeedResponseJson() {
        this(null);
    }
}
