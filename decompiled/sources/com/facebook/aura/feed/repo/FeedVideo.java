package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class FeedVideo extends C06G {
    public static final int $stable = 0;
    public final Float aspectRatio;
    public final String posterUrl;
    public final String url;

    public FeedVideo(String str, String str2, Float f) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.posterUrl = str2;
        this.aspectRatio = f;
    }

    public final FeedVideo copy(String str, String str2, Float f) {
        C7384Etj.A0Y(str, 0);
        return new FeedVideo(str, str2, f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedVideo) {
                FeedVideo feedVideo = (FeedVideo) obj;
                if (!C7384Etj.areEqual(this.url, feedVideo.url) || !C7384Etj.areEqual(this.posterUrl, feedVideo.posterUrl) || !C7384Etj.areEqual(this.aspectRatio, feedVideo.aspectRatio)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedVideo copy$default(FeedVideo feedVideo, String str, String str2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedVideo.url;
        }
        if ((i & 2) != 0) {
            str2 = feedVideo.posterUrl;
        }
        if ((i & 4) != 0) {
            f = feedVideo.aspectRatio;
        }
        return feedVideo.copy(str, str2, f);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.posterUrl;
    }

    public final Float component3() {
        return this.aspectRatio;
    }

    public final Float getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.url) + AnonymousClass006.A0G(this.posterUrl)) * 31) + C06G.A04(this.aspectRatio);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedVideo(String str, String str2, Float f, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : f);
    }
}
