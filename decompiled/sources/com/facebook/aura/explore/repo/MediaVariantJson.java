package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class MediaVariantJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Long byteSize;
    public final Integer height;
    public final String mimeType;
    public final String url;
    public final String version;
    public final Integer width;

    public final class Companion {
        public final C9hr<MediaVariantJson> serializer() {
            return MediaVariantJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MediaVariantJson(String str, Integer num, Integer num2, String str2, Long l, String str3) {
        AnonymousClass002.A1D(str, 0, str3);
        this.url = str;
        this.width = num;
        this.height = num2;
        this.mimeType = str2;
        this.byteSize = l;
        this.version = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(MediaVariantJson mediaVariantJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(mediaVariantJson.url)) {
            c9j5.AAV(mediaVariantJson.url, c9iZ, 0);
        }
        if (zAfR || mediaVariantJson.width != null) {
            c9j5.AAP(mediaVariantJson.width, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || mediaVariantJson.height != null) {
            c9j5.AAP(mediaVariantJson.height, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || mediaVariantJson.mimeType != null) {
            c9j5.AAP(mediaVariantJson.mimeType, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || mediaVariantJson.byteSize != null) {
            c9j5.AAP(mediaVariantJson.byteSize, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || !"".equals(mediaVariantJson.version)) {
            c9j5.AAV(mediaVariantJson.version, c9iZ, 5);
        }
    }

    public final MediaVariantJson copy(String str, Integer num, Integer num2, String str2, Long l, String str3) {
        AnonymousClass002.A1D(str, 0, str3);
        return new MediaVariantJson(str, num, num2, str2, l, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaVariantJson) {
                MediaVariantJson mediaVariantJson = (MediaVariantJson) obj;
                if (!C7384Etj.areEqual(this.url, mediaVariantJson.url) || !C7384Etj.areEqual(this.width, mediaVariantJson.width) || !C7384Etj.areEqual(this.height, mediaVariantJson.height) || !C7384Etj.areEqual(this.mimeType, mediaVariantJson.mimeType) || !C7384Etj.areEqual(this.byteSize, mediaVariantJson.byteSize) || !C7384Etj.areEqual(this.version, mediaVariantJson.version)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MediaVariantJson copy$default(MediaVariantJson mediaVariantJson, String str, Integer num, Integer num2, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaVariantJson.url;
        }
        if ((i & 2) != 0) {
            num = mediaVariantJson.width;
        }
        if ((i & 4) != 0) {
            num2 = mediaVariantJson.height;
        }
        if ((i & 8) != 0) {
            str2 = mediaVariantJson.mimeType;
        }
        if ((i & 16) != 0) {
            l = mediaVariantJson.byteSize;
        }
        if ((i & 32) != 0) {
            str3 = mediaVariantJson.version;
        }
        return mediaVariantJson.copy(str, num, num2, str2, l, str3);
    }

    public final String component1() {
        return this.url;
    }

    public final Integer component2() {
        return this.width;
    }

    public final Integer component3() {
        return this.height;
    }

    public final String component4() {
        return this.mimeType;
    }

    public final Long component5() {
        return this.byteSize;
    }

    public final String component6() {
        return this.version;
    }

    public final Long getByteSize() {
        return this.byteSize;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVersion() {
        return this.version;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.version, (((((((AnonymousClass001.A0G(this.url) + AnonymousClass006.A0D(this.width)) * 31) + AnonymousClass006.A0D(this.height)) * 31) + AnonymousClass006.A0G(this.mimeType)) * 31) + C3cH.A02(this.byteSize)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MediaVariantJson(String str, Integer num, Integer num2, String str2, Long l, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? "" : str3);
    }

    public /* synthetic */ MediaVariantJson(int i, String str, Integer num, Integer num2, String str2, Long l, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
        if ((i & 4) == 0) {
            this.height = null;
        } else {
            this.height = num2;
        }
        if ((i & 8) == 0) {
            this.mimeType = null;
        } else {
            this.mimeType = str2;
        }
        if ((i & 16) == 0) {
            this.byteSize = null;
        } else {
            this.byteSize = l;
        }
        if ((i & 32) == 0) {
            this.version = "";
        } else {
            this.version = str3;
        }
    }

    public MediaVariantJson() {
        this("", null, null, null, null, "");
    }
}
