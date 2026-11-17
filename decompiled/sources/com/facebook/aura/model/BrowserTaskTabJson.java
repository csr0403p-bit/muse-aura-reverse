package com.facebook.aura.model;

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
/* loaded from: classes2.dex */
public final class BrowserTaskTabJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String url;

    public final class Companion {
        public final C9hr<BrowserTaskTabJson> serializer() {
            return BrowserTaskTabJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(BrowserTaskTabJson browserTaskTabJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(browserTaskTabJson.url)) {
            c9j5.AAV(browserTaskTabJson.url, c9iZ, 0);
        }
    }

    public final BrowserTaskTabJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskTabJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BrowserTaskTabJson) && C7384Etj.areEqual(this.url, ((BrowserTaskTabJson) obj).url));
    }

    public static /* synthetic */ BrowserTaskTabJson copy$default(BrowserTaskTabJson browserTaskTabJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserTaskTabJson.url;
        }
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskTabJson(str);
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

    public /* synthetic */ BrowserTaskTabJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public BrowserTaskTabJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
    }

    public /* synthetic */ BrowserTaskTabJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public BrowserTaskTabJson() {
        this("");
    }
}
