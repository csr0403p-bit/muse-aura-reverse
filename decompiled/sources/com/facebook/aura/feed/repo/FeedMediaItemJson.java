package com.facebook.aura.feed.repo;

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
/* loaded from: classes.dex */
public final class FeedMediaItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String poster_url;
    public final String url;

    public final class Companion {
        public final C9hr<FeedMediaItemJson> serializer() {
            return FeedMediaItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedMediaItemJson feedMediaItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(feedMediaItemJson.kind)) {
            c9j5.AAV(feedMediaItemJson.kind, c9iZ, 0);
        }
        if (zAfR || !"".equals(feedMediaItemJson.url)) {
            c9j5.AAV(feedMediaItemJson.url, c9iZ, 1);
        }
        if (zAfR || feedMediaItemJson.poster_url != null) {
            c9j5.AAP(feedMediaItemJson.poster_url, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedMediaItemJson) {
                FeedMediaItemJson feedMediaItemJson = (FeedMediaItemJson) obj;
                if (!C7384Etj.areEqual(this.kind, feedMediaItemJson.kind) || !C7384Etj.areEqual(this.url, feedMediaItemJson.url) || !C7384Etj.areEqual(this.poster_url, feedMediaItemJson.poster_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedMediaItemJson copy$default(FeedMediaItemJson feedMediaItemJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedMediaItemJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = feedMediaItemJson.url;
        }
        if ((i & 4) != 0) {
            str3 = feedMediaItemJson.poster_url;
        }
        return feedMediaItemJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.poster_url;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getPoster_url() {
        return this.poster_url;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.kind)) + AnonymousClass006.A0G(this.poster_url);
    }

    public final FeedCarouselItem toDomain() {
        String str = this.url;
        String str2 = null;
        if (str.length() <= 0) {
            return null;
        }
        FeedMediaKind feedMediaKind = "video".equals(this.kind) ? FeedMediaKind.VIDEO : FeedMediaKind.IMAGE;
        String str3 = this.poster_url;
        if (str3 != null && str3.length() > 0) {
            str2 = str3;
        }
        return new FeedCarouselItem(feedMediaKind, str, str2);
    }

    public FeedMediaItemJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.kind = str;
        this.url = str2;
        this.poster_url = str3;
    }

    public final FeedMediaItemJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new FeedMediaItemJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedMediaItemJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public /* synthetic */ FeedMediaItemJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = "";
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.poster_url = null;
        } else {
            this.poster_url = str3;
        }
    }

    public FeedMediaItemJson() {
        this("", "", null);
    }
}
