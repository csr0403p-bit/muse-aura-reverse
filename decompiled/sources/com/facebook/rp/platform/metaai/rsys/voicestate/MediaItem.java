package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class MediaItem extends C06G {

    @SerializedName("url")
    public final String url;

    @SerializedName("url_fallback")
    public final String urlFallback;

    public MediaItem(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.urlFallback = str2;
    }

    public final MediaItem copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new MediaItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaItem) {
                MediaItem mediaItem = (MediaItem) obj;
                if (!C7384Etj.areEqual(this.url, mediaItem.url) || !C7384Etj.areEqual(this.urlFallback, mediaItem.urlFallback)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaItem.url;
        }
        if ((i & 2) != 0) {
            str2 = mediaItem.urlFallback;
        }
        C7384Etj.A0Y(str, 0);
        return new MediaItem(str, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.urlFallback;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlFallback() {
        return this.urlFallback;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.url) + AnonymousClass006.A0G(this.urlFallback);
    }

    public String toString() {
        return FGI.A0h("MediaItem(url=", this.url, ", urlFallback=", this.urlFallback, ")");
    }
}
