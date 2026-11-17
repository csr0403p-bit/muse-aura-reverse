package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SpaceArticleItem extends C06G {
    public final String imageUrl;
    public final String summary;
    public final String title;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceArticleItem) {
                SpaceArticleItem spaceArticleItem = (SpaceArticleItem) obj;
                if (!C7384Etj.areEqual(this.title, spaceArticleItem.title) || !C7384Etj.areEqual(this.url, spaceArticleItem.url) || !C7384Etj.areEqual(this.summary, spaceArticleItem.summary) || !C7384Etj.areEqual(this.imageUrl, spaceArticleItem.imageUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceArticleItem copy$default(SpaceArticleItem spaceArticleItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceArticleItem.title;
        }
        if ((i & 2) != 0) {
            str2 = spaceArticleItem.url;
        }
        if ((i & 4) != 0) {
            str3 = spaceArticleItem.summary;
        }
        if ((i & 8) != 0) {
            str4 = spaceArticleItem.imageUrl;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new SpaceArticleItem(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.url, AnonymousClass001.A0G(this.title))) + AnonymousClass006.A0G(this.imageUrl);
    }

    public SpaceArticleItem(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        this.title = str;
        this.url = str2;
        this.summary = str3;
        this.imageUrl = str4;
    }

    public final SpaceArticleItem copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        return new SpaceArticleItem(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceArticleItem(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, AnonymousClass006.A0u(i, str4));
    }
}
