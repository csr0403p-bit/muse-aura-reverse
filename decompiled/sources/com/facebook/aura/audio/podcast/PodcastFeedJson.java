package com.facebook.aura.audio.podcast;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PodcastFeedJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String cover;
    public final String feed_title;
    public final String feed_url;

    public final class Companion {
        public final C9hr<PodcastFeedJson> serializer() {
            return PodcastFeedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PodcastFeedJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.feed_title = str;
        this.feed_url = str2;
        this.cover = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_audio_podcast_podcast(PodcastFeedJson podcastFeedJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(podcastFeedJson.feed_title)) {
            c9j5.AAV(podcastFeedJson.feed_title, c9iZ, 0);
        }
        if (zAfR || podcastFeedJson.feed_url != null) {
            c9j5.AAP(podcastFeedJson.feed_url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || podcastFeedJson.cover != null) {
            c9j5.AAP(podcastFeedJson.cover, C07779iq.A01, c9iZ, 2);
        }
    }

    public final PodcastFeedJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new PodcastFeedJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PodcastFeedJson) {
                PodcastFeedJson podcastFeedJson = (PodcastFeedJson) obj;
                if (!C7384Etj.areEqual(this.feed_title, podcastFeedJson.feed_title) || !C7384Etj.areEqual(this.feed_url, podcastFeedJson.feed_url) || !C7384Etj.areEqual(this.cover, podcastFeedJson.cover)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PodcastFeedJson copy$default(PodcastFeedJson podcastFeedJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = podcastFeedJson.feed_title;
        }
        if ((i & 2) != 0) {
            str2 = podcastFeedJson.feed_url;
        }
        if ((i & 4) != 0) {
            str3 = podcastFeedJson.cover;
        }
        return podcastFeedJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.feed_title;
    }

    public final String component2() {
        return this.feed_url;
    }

    public final String component3() {
        return this.cover;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getFeed_title() {
        return this.feed_title;
    }

    public final String getFeed_url() {
        return this.feed_url;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.feed_title) + AnonymousClass006.A0G(this.feed_url)) * 31) + AnonymousClass005.A0H(this.cover);
    }

    public final PodcastFeed toDomain() {
        return new PodcastFeed(this.feed_title, this.feed_url, this.cover);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PodcastFeedJson(int i, String str, String str2, String str3, C2hx c2hx) {
        this.feed_title = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.feed_url = null;
        } else {
            this.feed_url = str2;
        }
        if ((i & 4) == 0) {
            this.cover = null;
        } else {
            this.cover = str3;
        }
    }

    public /* synthetic */ PodcastFeedJson(String str, String str2, String str3, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public PodcastFeedJson() {
        this("", null, null);
    }
}
