package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class FeedPostMetadataDetail extends C06G {
    public static final int $stable = 0;
    public final String id;
    public final String title;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedPostMetadataDetail) {
                FeedPostMetadataDetail feedPostMetadataDetail = (FeedPostMetadataDetail) obj;
                if (!C7384Etj.areEqual(this.id, feedPostMetadataDetail.id) || !C7384Etj.areEqual(this.title, feedPostMetadataDetail.title) || !C7384Etj.areEqual(this.value, feedPostMetadataDetail.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedPostMetadataDetail copy$default(FeedPostMetadataDetail feedPostMetadataDetail, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedPostMetadataDetail.id;
        }
        if ((i & 2) != 0) {
            str2 = feedPostMetadataDetail.title;
        }
        if ((i & 4) != 0) {
            str3 = feedPostMetadataDetail.value;
        }
        return feedPostMetadataDetail.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.value;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)));
    }

    public FeedPostMetadataDetail(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.title = str2;
        this.value = str3;
    }

    public final FeedPostMetadataDetail copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new FeedPostMetadataDetail(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
