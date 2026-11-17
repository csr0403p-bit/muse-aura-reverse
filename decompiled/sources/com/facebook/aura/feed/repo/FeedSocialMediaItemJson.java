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
public final class FeedSocialMediaItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String media_url;
    public final String thumbnail_url;

    public final class Companion {
        public final C9hr<FeedSocialMediaItemJson> serializer() {
            return FeedSocialMediaItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedSocialMediaItemJson feedSocialMediaItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(feedSocialMediaItemJson.kind)) {
            c9j5.AAV(feedSocialMediaItemJson.kind, c9iZ, 0);
        }
        if (zAfR || !"".equals(feedSocialMediaItemJson.media_url)) {
            c9j5.AAV(feedSocialMediaItemJson.media_url, c9iZ, 1);
        }
        if (zAfR || feedSocialMediaItemJson.thumbnail_url != null) {
            c9j5.AAP(feedSocialMediaItemJson.thumbnail_url, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedSocialMediaItemJson) {
                FeedSocialMediaItemJson feedSocialMediaItemJson = (FeedSocialMediaItemJson) obj;
                if (!C7384Etj.areEqual(this.kind, feedSocialMediaItemJson.kind) || !C7384Etj.areEqual(this.media_url, feedSocialMediaItemJson.media_url) || !C7384Etj.areEqual(this.thumbnail_url, feedSocialMediaItemJson.thumbnail_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedSocialMediaItemJson copy$default(FeedSocialMediaItemJson feedSocialMediaItemJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedSocialMediaItemJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = feedSocialMediaItemJson.media_url;
        }
        if ((i & 4) != 0) {
            str3 = feedSocialMediaItemJson.thumbnail_url;
        }
        return feedSocialMediaItemJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.media_url;
    }

    public final String component3() {
        return this.thumbnail_url;
    }

    public final String displayUrl() {
        String str;
        if ("video".equals(this.kind)) {
            str = this.thumbnail_url;
            if (str != null) {
            }
            return null;
        }
        str = this.media_url;
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getMedia_url() {
        return this.media_url;
    }

    public final String getThumbnail_url() {
        return this.thumbnail_url;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.media_url, AnonymousClass001.A0G(this.kind)) + AnonymousClass006.A0G(this.thumbnail_url);
    }

    public FeedSocialMediaItemJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.kind = str;
        this.media_url = str2;
        this.thumbnail_url = str3;
    }

    public final FeedSocialMediaItemJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new FeedSocialMediaItemJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedSocialMediaItemJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public /* synthetic */ FeedSocialMediaItemJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = "";
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.media_url = "";
        } else {
            this.media_url = str2;
        }
        if ((i & 4) == 0) {
            this.thumbnail_url = null;
        } else {
            this.thumbnail_url = str3;
        }
    }

    public FeedSocialMediaItemJson() {
        this("", "", null);
    }
}
