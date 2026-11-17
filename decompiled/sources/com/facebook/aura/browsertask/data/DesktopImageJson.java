package com.facebook.aura.browsertask.data;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class DesktopImageJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String content_type;
    public final int height;
    public final String url;
    public final int width;

    public final class Companion {
        public final C9hr<DesktopImageJson> serializer() {
            return DesktopImageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_browsertask_data_data(DesktopImageJson desktopImageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(desktopImageJson.url)) {
            c9j5.AAV(desktopImageJson.url, c9iZ, 0);
        }
        if (zAfR || desktopImageJson.width != 0) {
            c9j5.AAK(c9iZ, 1, desktopImageJson.width);
        }
        if (zAfR || desktopImageJson.height != 0) {
            c9j5.AAK(c9iZ, 2, desktopImageJson.height);
        }
        if (zAfR || !"".equals(desktopImageJson.content_type)) {
            c9j5.AAV(desktopImageJson.content_type, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DesktopImageJson) {
                DesktopImageJson desktopImageJson = (DesktopImageJson) obj;
                if (!C7384Etj.areEqual(this.url, desktopImageJson.url) || this.width != desktopImageJson.width || this.height != desktopImageJson.height || !C7384Etj.areEqual(this.content_type, desktopImageJson.content_type)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DesktopImageJson copy$default(DesktopImageJson desktopImageJson, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = desktopImageJson.url;
        }
        if ((i3 & 2) != 0) {
            i = desktopImageJson.width;
        }
        if ((i3 & 4) != 0) {
            i2 = desktopImageJson.height;
        }
        if ((i3 & 8) != 0) {
            str2 = desktopImageJson.content_type;
        }
        AnonymousClass003.A0w(str, str2);
        return new DesktopImageJson(str, i, i2, str2);
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

    public final String getContent_type() {
        return this.content_type;
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
        return AnonymousClass001.A0H(this.content_type, (((AnonymousClass001.A0G(this.url) + this.width) * 31) + this.height) * 31);
    }

    public String toString() {
        String str = this.url;
        int i = this.width;
        int i2 = this.height;
        String str2 = this.content_type;
        StringBuilder sbA0x = C3cI.A0x("DesktopImageJson(url=", str);
        sbA0x.append(", width=");
        sbA0x.append(i);
        sbA0x.append(", height=");
        sbA0x.append(i2);
        return C3cJ.A0N(", content_type=", str2, sbA0x);
    }

    public /* synthetic */ DesktopImageJson(int i, String str, int i2, int i3, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = "";
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
            this.content_type = "";
        } else {
            this.content_type = str2;
        }
    }

    public final DesktopImageJson copy(String str, int i, int i2, String str2) {
        AnonymousClass003.A0w(str, str2);
        return new DesktopImageJson(str, i, i2, str2);
    }

    public DesktopImageJson(String str, int i, int i2, String str2) {
        AnonymousClass003.A0w(str, str2);
        this.url = str;
        this.width = i;
        this.height = i2;
        this.content_type = str2;
    }

    public /* synthetic */ DesktopImageJson(String str, int i, int i2, String str2, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? "" : str, C3cG.A01(i3, i), (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2);
    }

    public DesktopImageJson() {
        this("", 0, 0, "");
    }
}
