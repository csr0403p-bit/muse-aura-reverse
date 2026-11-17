package com.facebook.aura.feed.repo;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class FeedCarouselItem extends C06G {
    public static final int $stable = 0;
    public final FeedMediaKind kind;
    public final String posterUrl;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedCarouselItem) {
                FeedCarouselItem feedCarouselItem = (FeedCarouselItem) obj;
                if (this.kind != feedCarouselItem.kind || !C7384Etj.areEqual(this.url, feedCarouselItem.url) || !C7384Etj.areEqual(this.posterUrl, feedCarouselItem.posterUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedCarouselItem copy$default(FeedCarouselItem feedCarouselItem, FeedMediaKind feedMediaKind, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            feedMediaKind = feedCarouselItem.kind;
        }
        if ((i & 2) != 0) {
            str = feedCarouselItem.url;
        }
        if ((i & 4) != 0) {
            str2 = feedCarouselItem.posterUrl;
        }
        return feedCarouselItem.copy(feedMediaKind, str, str2);
    }

    public final FeedMediaKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.posterUrl;
    }

    public final FeedMediaKind getKind() {
        return this.kind;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.url, AnonymousClass005.A0E(this.kind)) + AnonymousClass006.A0G(this.posterUrl);
    }

    public FeedCarouselItem(FeedMediaKind feedMediaKind, String str, String str2) {
        AnonymousClass003.A0u(feedMediaKind, str);
        this.kind = feedMediaKind;
        this.url = str;
        this.posterUrl = str2;
    }

    public final FeedCarouselItem copy(FeedMediaKind feedMediaKind, String str, String str2) {
        AnonymousClass003.A0u(feedMediaKind, str);
        return new FeedCarouselItem(feedMediaKind, str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedCarouselItem(FeedMediaKind feedMediaKind, String str, String str2, int i, C06H c06h) {
        this(feedMediaKind, str, AnonymousClass006.A0t(i, str2));
    }
}
