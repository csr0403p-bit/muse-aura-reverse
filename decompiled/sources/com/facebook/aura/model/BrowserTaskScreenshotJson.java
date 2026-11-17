package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskScreenshotJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int height;
    public final String url;
    public final int width;

    public final class Companion {
        public final C9hr<BrowserTaskScreenshotJson> serializer() {
            return BrowserTaskScreenshotJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public BrowserTaskScreenshotJson(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(BrowserTaskScreenshotJson browserTaskScreenshotJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(browserTaskScreenshotJson.url)) {
            c9j5.AAV(browserTaskScreenshotJson.url, c9iZ, 0);
        }
        if (zAfR || browserTaskScreenshotJson.width != 0) {
            c9j5.AAK(c9iZ, 1, browserTaskScreenshotJson.width);
        }
        if (zAfR || browserTaskScreenshotJson.height != 0) {
            c9j5.AAK(c9iZ, 2, browserTaskScreenshotJson.height);
        }
    }

    public final BrowserTaskScreenshotJson copy(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskScreenshotJson(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskScreenshotJson) {
                BrowserTaskScreenshotJson browserTaskScreenshotJson = (BrowserTaskScreenshotJson) obj;
                if (!C7384Etj.areEqual(this.url, browserTaskScreenshotJson.url) || this.width != browserTaskScreenshotJson.width || this.height != browserTaskScreenshotJson.height) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserTaskScreenshotJson copy$default(BrowserTaskScreenshotJson browserTaskScreenshotJson, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = browserTaskScreenshotJson.url;
        }
        if ((i3 & 2) != 0) {
            i = browserTaskScreenshotJson.width;
        }
        if ((i3 & 4) != 0) {
            i2 = browserTaskScreenshotJson.height;
        }
        return browserTaskScreenshotJson.copy(str, i, i2);
    }

    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.url) + this.width) * 31) + this.height;
    }

    public final BrowserTaskScreenshot toDomain() {
        String strA0l = AnonymousClass002.A0l(this.url);
        if (strA0l.length() <= 0) {
            strA0l = null;
        }
        return new BrowserTaskScreenshot(strA0l, this.width, this.height);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BrowserTaskScreenshotJson(int i, String str, int i2, int i3, C2hx c2hx) {
        this.url = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.width = 0;
        } else {
            this.width = i2;
        }
        if ((i & 4) == 0) {
            this.height = 0;
        } else {
            this.height = i3;
        }
    }

    public /* synthetic */ BrowserTaskScreenshotJson(String str, int i, int i2, int i3, C06H c06h) {
        this(C3cH.A0Z(i3, str), C3cG.A01(i3, i), (i3 & 4) != 0 ? 0 : i2);
    }

    public BrowserTaskScreenshotJson() {
        this("", 0, 0);
    }
}
