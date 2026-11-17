package com.facebook.aura.browsertask.control;

import X.AnonymousClass001;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.HsK;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserViewerJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final double device_pixel_ratio;
    public final int height;
    public final int width;

    public final class Companion {
        public final C9hr<BrowserViewerJson> serializer() {
            return BrowserViewerJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_browsertask_control_control(BrowserViewerJson browserViewerJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAK(c9iZ, 0, browserViewerJson.width);
        c9j5.AAK(c9iZ, 1, browserViewerJson.height);
        c9j5.AAD(c9iZ, browserViewerJson.device_pixel_ratio, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserViewerJson) {
                BrowserViewerJson browserViewerJson = (BrowserViewerJson) obj;
                if (this.width != browserViewerJson.width || this.height != browserViewerJson.height || Double.compare(this.device_pixel_ratio, browserViewerJson.device_pixel_ratio) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserViewerJson copy$default(BrowserViewerJson browserViewerJson, int i, int i2, double d, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = browserViewerJson.width;
        }
        if ((i3 & 2) != 0) {
            i2 = browserViewerJson.height;
        }
        if ((i3 & 4) != 0) {
            d = browserViewerJson.device_pixel_ratio;
        }
        return new BrowserViewerJson(i, i2, d);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final double component3() {
        return this.device_pixel_ratio;
    }

    public final BrowserViewerJson copy(int i, int i2, double d) {
        return new BrowserViewerJson(i, i2, d);
    }

    public final double getDevice_pixel_ratio() {
        return this.device_pixel_ratio;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((this.width * 31) + this.height) * 31) + HsK.A00(this.device_pixel_ratio);
    }

    public String toString() {
        int i = this.width;
        int i2 = this.height;
        double d = this.device_pixel_ratio;
        StringBuilder sb = new StringBuilder("BrowserViewerJson(width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", device_pixel_ratio=");
        sb.append(d);
        return AnonymousClass001.A0v(")", sb);
    }

    public BrowserViewerJson(int i, int i2, double d) {
        this.width = i;
        this.height = i2;
        this.device_pixel_ratio = d;
    }

    public /* synthetic */ BrowserViewerJson(int i, int i2, int i3, double d, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(BrowserViewerJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.width = i2;
        this.height = i3;
        this.device_pixel_ratio = d;
    }
}
