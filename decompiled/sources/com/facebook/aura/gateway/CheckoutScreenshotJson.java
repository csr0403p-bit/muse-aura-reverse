package com.facebook.aura.gateway;

import X.AnonymousClass005;
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
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutScreenshotJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String content_type;
    public final int height;
    public final long updated_at_ms;
    public final String url;
    public final int width;

    public final class Companion {
        public final C9hr<CheckoutScreenshotJson> serializer() {
            return CheckoutScreenshotJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutScreenshotJson checkoutScreenshotJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutScreenshotJson.url != null) {
            c9j5.AAP(checkoutScreenshotJson.url, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || checkoutScreenshotJson.width != 0) {
            c9j5.AAK(c9iZ, 1, checkoutScreenshotJson.width);
        }
        if (zAfR || checkoutScreenshotJson.height != 0) {
            c9j5.AAK(c9iZ, 2, checkoutScreenshotJson.height);
        }
        if (zAfR || checkoutScreenshotJson.content_type != null) {
            c9j5.AAP(checkoutScreenshotJson.content_type, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || checkoutScreenshotJson.updated_at_ms != 0) {
            c9j5.AAN(c9iZ, 4, checkoutScreenshotJson.updated_at_ms);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutScreenshotJson) {
                CheckoutScreenshotJson checkoutScreenshotJson = (CheckoutScreenshotJson) obj;
                if (!C7384Etj.areEqual(this.url, checkoutScreenshotJson.url) || this.width != checkoutScreenshotJson.width || this.height != checkoutScreenshotJson.height || !C7384Etj.areEqual(this.content_type, checkoutScreenshotJson.content_type) || this.updated_at_ms != checkoutScreenshotJson.updated_at_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutScreenshotJson copy$default(CheckoutScreenshotJson checkoutScreenshotJson, String str, int i, int i2, String str2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = checkoutScreenshotJson.url;
        }
        if ((i3 & 2) != 0) {
            i = checkoutScreenshotJson.width;
        }
        if ((i3 & 4) != 0) {
            i2 = checkoutScreenshotJson.height;
        }
        if ((i3 & 8) != 0) {
            str2 = checkoutScreenshotJson.content_type;
        }
        if ((i3 & 16) != 0) {
            j = checkoutScreenshotJson.updated_at_ms;
        }
        return checkoutScreenshotJson.copy(str, i, i2, str2, j);
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

    public final String component4() {
        return this.content_type;
    }

    public final long component5() {
        return this.updated_at_ms;
    }

    public final CheckoutScreenshotJson copy(String str, int i, int i2, String str2, long j) {
        return new CheckoutScreenshotJson(str, i, i2, str2, j);
    }

    public final String getContent_type() {
        return this.content_type;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getUpdated_at_ms() {
        return this.updated_at_ms;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.updated_at_ms, ((((((AnonymousClass006.A0G(this.url) * 31) + this.width) * 31) + this.height) * 31) + AnonymousClass005.A0H(this.content_type)) * 31);
    }

    public final HatchAgentPermissionsRepository.CheckoutScreenshot toDomain() {
        return new HatchAgentPermissionsRepository.CheckoutScreenshot(this.url, this.width, this.height, this.content_type, this.updated_at_ms);
    }

    public CheckoutScreenshotJson(String str, int i, int i2, String str2, long j) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.content_type = str2;
        this.updated_at_ms = j;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutScreenshotJson(String str, int i, int i2, String str2, long j, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? null : str, C3cG.A01(i3, i), (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? 0L : j);
    }

    public /* synthetic */ CheckoutScreenshotJson(int i, String str, int i2, int i3, String str2, long j, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
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
        if ((i & 8) == 0) {
            this.content_type = null;
        } else {
            this.content_type = str2;
        }
        if ((i & 16) == 0) {
            this.updated_at_ms = 0L;
        } else {
            this.updated_at_ms = j;
        }
    }

    public CheckoutScreenshotJson() {
        this(null, 0, 0, null, 0L);
    }
}
