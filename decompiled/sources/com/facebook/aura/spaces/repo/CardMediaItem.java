package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class CardMediaItem extends C06G {
    public final String mediaType;
    public final String sourceUrl;
    public final String thumbnailUrl;
    public final String videoUrl;

    public CardMediaItem(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        this.mediaType = str;
        this.videoUrl = str2;
        this.thumbnailUrl = str3;
        this.sourceUrl = str4;
    }

    public final CardMediaItem copy(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        return new CardMediaItem(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CardMediaItem) {
                CardMediaItem cardMediaItem = (CardMediaItem) obj;
                if (!C7384Etj.areEqual(this.mediaType, cardMediaItem.mediaType) || !C7384Etj.areEqual(this.videoUrl, cardMediaItem.videoUrl) || !C7384Etj.areEqual(this.thumbnailUrl, cardMediaItem.thumbnailUrl) || !C7384Etj.areEqual(this.sourceUrl, cardMediaItem.sourceUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CardMediaItem copy$default(CardMediaItem cardMediaItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardMediaItem.mediaType;
        }
        if ((i & 2) != 0) {
            str2 = cardMediaItem.videoUrl;
        }
        if ((i & 4) != 0) {
            str3 = cardMediaItem.thumbnailUrl;
        }
        if ((i & 8) != 0) {
            str4 = cardMediaItem.sourceUrl;
        }
        C7384Etj.A0Y(str, 0);
        return new CardMediaItem(str, str2, str3, str4);
    }

    public final String component1() {
        return this.mediaType;
    }

    public final String component2() {
        return this.videoUrl;
    }

    public final String component3() {
        return this.thumbnailUrl;
    }

    public final String component4() {
        return this.sourceUrl;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.mediaType) + AnonymousClass006.A0G(this.videoUrl)) * 31) + AnonymousClass006.A0G(this.thumbnailUrl)) * 31) + AnonymousClass005.A0H(this.sourceUrl);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CardMediaItem(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
