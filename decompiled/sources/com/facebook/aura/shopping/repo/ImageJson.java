package com.facebook.aura.shopping.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ImageJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String url;

    public final class Companion {
        public final C9hr<ImageJson> serializer() {
            return ImageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ImageJson imageJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(imageJson.url)) {
            c9j5.AAV(imageJson.url, c9iZ, 0);
        }
    }

    public final ImageJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ImageJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImageJson) && C7384Etj.areEqual(this.url, ((ImageJson) obj).url));
    }

    public static /* synthetic */ ImageJson copy$default(ImageJson imageJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageJson.url;
        }
        C7384Etj.A0Y(str, 0);
        return new ImageJson(str);
    }

    public final String component1() {
        return this.url;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public /* synthetic */ ImageJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ImageJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
    }

    public /* synthetic */ ImageJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public ImageJson() {
        this("");
    }
}
