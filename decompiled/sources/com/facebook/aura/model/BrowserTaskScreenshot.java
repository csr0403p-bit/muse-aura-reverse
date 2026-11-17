package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskScreenshot extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int height;
    public final String url;
    public final int width;

    public final class Companion {
        public final C9hr<BrowserTaskScreenshot> serializer() {
            return BrowserTaskScreenshot$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(BrowserTaskScreenshot browserTaskScreenshot, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || browserTaskScreenshot.url != null) {
            c9j5.AAP(browserTaskScreenshot.url, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || browserTaskScreenshot.width != 0) {
            c9j5.AAK(c9iZ, 1, browserTaskScreenshot.width);
        }
        if (zAfR || browserTaskScreenshot.height != 0) {
            c9j5.AAK(c9iZ, 2, browserTaskScreenshot.height);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserTaskScreenshot) {
                BrowserTaskScreenshot browserTaskScreenshot = (BrowserTaskScreenshot) obj;
                if (!C7384Etj.areEqual(this.url, browserTaskScreenshot.url) || this.width != browserTaskScreenshot.width || this.height != browserTaskScreenshot.height) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserTaskScreenshot copy$default(BrowserTaskScreenshot browserTaskScreenshot, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = browserTaskScreenshot.url;
        }
        if ((i3 & 2) != 0) {
            i = browserTaskScreenshot.width;
        }
        if ((i3 & 4) != 0) {
            i2 = browserTaskScreenshot.height;
        }
        return new BrowserTaskScreenshot(str, i, i2);
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

    public final BrowserTaskScreenshot copy(String str, int i, int i2) {
        return new BrowserTaskScreenshot(str, i, i2);
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
        return (((AnonymousClass006.A0G(this.url) * 31) + this.width) * 31) + this.height;
    }

    public BrowserTaskScreenshot(String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BrowserTaskScreenshot(int i, String str, int i2, int i3, C2hx c2hx) {
        this.url = (i & 1) == 0 ? null : str;
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

    public /* synthetic */ BrowserTaskScreenshot(String str, int i, int i2, int i3, C06H c06h) {
        this(AnonymousClass006.A0r(i3, str), C3cG.A01(i3, i), (i3 & 4) != 0 ? 0 : i2);
    }

    public BrowserTaskScreenshot() {
        this(null, 0, 0);
    }
}
