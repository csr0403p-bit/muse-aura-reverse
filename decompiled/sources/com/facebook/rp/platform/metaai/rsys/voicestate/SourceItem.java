package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.C8j2;
import X.FGI;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class SourceItem extends C06G {

    @SerializedName("favicon_url")
    public final String faviconUrl;

    @SerializedName("subtitle")
    public final String subtitle;

    @SerializedName("title")
    public final String title;

    @SerializedName("url")
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SourceItem) {
                SourceItem sourceItem = (SourceItem) obj;
                if (!C7384Etj.areEqual(this.url, sourceItem.url) || !C7384Etj.areEqual(this.title, sourceItem.title) || !C7384Etj.areEqual(this.subtitle, sourceItem.subtitle) || !C7384Etj.areEqual(this.faviconUrl, sourceItem.faviconUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SourceItem copy$default(SourceItem sourceItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sourceItem.url;
        }
        if ((i & 2) != 0) {
            str2 = sourceItem.title;
        }
        if ((i & 4) != 0) {
            str3 = sourceItem.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = sourceItem.faviconUrl;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new SourceItem(str, str2, str3, str4);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.faviconUrl;
    }

    public final String getFaviconUrl() {
        return this.faviconUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.subtitle, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.url))) + AnonymousClass006.A0G(this.faviconUrl);
    }

    public String toString() {
        return FGI.A0m("SourceItem(url=", this.url, C8j2.A00(15), this.title, ", subtitle=", this.subtitle, ", faviconUrl=", this.faviconUrl, ")");
    }

    public SourceItem(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        this.url = str;
        this.title = str2;
        this.subtitle = str3;
        this.faviconUrl = str4;
    }

    public final SourceItem copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        return new SourceItem(str, str2, str3, str4);
    }
}
