package com.facebook.aura.feed.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class FeedSocialEmbed extends C06G {
    public static final int $stable = 0;
    public final String author;
    public final String destinationUrl;
    public final String sourceIconUrl;
    public final String sourceName;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedSocialEmbed) {
                FeedSocialEmbed feedSocialEmbed = (FeedSocialEmbed) obj;
                if (!C7384Etj.areEqual(this.destinationUrl, feedSocialEmbed.destinationUrl) || !C7384Etj.areEqual(this.author, feedSocialEmbed.author) || !C7384Etj.areEqual(this.sourceName, feedSocialEmbed.sourceName) || !C7384Etj.areEqual(this.sourceIconUrl, feedSocialEmbed.sourceIconUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedSocialEmbed copy$default(FeedSocialEmbed feedSocialEmbed, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedSocialEmbed.destinationUrl;
        }
        if ((i & 2) != 0) {
            str2 = feedSocialEmbed.author;
        }
        if ((i & 4) != 0) {
            str3 = feedSocialEmbed.sourceName;
        }
        if ((i & 8) != 0) {
            str4 = feedSocialEmbed.sourceIconUrl;
        }
        return new FeedSocialEmbed(str, str2, str3, str4);
    }

    public final String component1() {
        return this.destinationUrl;
    }

    public final String component2() {
        return this.author;
    }

    public final String component3() {
        return this.sourceName;
    }

    public final String component4() {
        return this.sourceIconUrl;
    }

    public final FeedSocialEmbed copy(String str, String str2, String str3, String str4) {
        return new FeedSocialEmbed(str, str2, str3, str4);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getDestinationUrl() {
        return this.destinationUrl;
    }

    public final String getSourceIconUrl() {
        return this.sourceIconUrl;
    }

    public final String getSourceName() {
        return this.sourceName;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.destinationUrl) * 31) + AnonymousClass006.A0G(this.author)) * 31) + AnonymousClass006.A0G(this.sourceName)) * 31) + AnonymousClass005.A0H(this.sourceIconUrl);
    }

    public FeedSocialEmbed(String str, String str2, String str3, String str4) {
        this.destinationUrl = str;
        this.author = str2;
        this.sourceName = str3;
        this.sourceIconUrl = str4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedSocialEmbed(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public FeedSocialEmbed() {
        this(null, null, null, null);
    }
}
