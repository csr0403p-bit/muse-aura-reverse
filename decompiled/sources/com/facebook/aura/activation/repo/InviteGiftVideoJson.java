package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class InviteGiftVideoJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int height;
    public final String url_dark;
    public final String url_light;
    public final int width;

    public final class Companion {
        public final C9hr<InviteGiftVideoJson> serializer() {
            return InviteGiftVideoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(InviteGiftVideoJson inviteGiftVideoJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(inviteGiftVideoJson.url_light)) {
            c9j5.AAV(inviteGiftVideoJson.url_light, c9iZ, 0);
        }
        if (zAfR || !"".equals(inviteGiftVideoJson.url_dark)) {
            c9j5.AAV(inviteGiftVideoJson.url_dark, c9iZ, 1);
        }
        if (zAfR || inviteGiftVideoJson.width != 0) {
            c9j5.AAK(c9iZ, 2, inviteGiftVideoJson.width);
        }
        if (zAfR || inviteGiftVideoJson.height != 0) {
            c9j5.AAK(c9iZ, 3, inviteGiftVideoJson.height);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InviteGiftVideoJson) {
                InviteGiftVideoJson inviteGiftVideoJson = (InviteGiftVideoJson) obj;
                if (!C7384Etj.areEqual(this.url_light, inviteGiftVideoJson.url_light) || !C7384Etj.areEqual(this.url_dark, inviteGiftVideoJson.url_dark) || this.width != inviteGiftVideoJson.width || this.height != inviteGiftVideoJson.height) {
                }
            }
            return false;
        }
        return true;
    }

    public InviteGiftVideoJson() {
        this("", "", 0, 0);
    }

    public static /* synthetic */ InviteGiftVideoJson copy$default(InviteGiftVideoJson inviteGiftVideoJson, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = inviteGiftVideoJson.url_light;
        }
        if ((i3 & 2) != 0) {
            str2 = inviteGiftVideoJson.url_dark;
        }
        if ((i3 & 4) != 0) {
            i = inviteGiftVideoJson.width;
        }
        if ((i3 & 8) != 0) {
            i2 = inviteGiftVideoJson.height;
        }
        AnonymousClass003.A0u(str, str2);
        return new InviteGiftVideoJson(str, str2, i, i2);
    }

    public final String component1() {
        return this.url_light;
    }

    public final String component2() {
        return this.url_dark;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl_dark() {
        return this.url_dark;
    }

    public final String getUrl_light() {
        return this.url_light;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.url_dark, AnonymousClass001.A0G(this.url_light)) + this.width) * 31) + this.height;
    }

    public final InviteGiftVideoJson copy(String str, String str2, int i, int i2) {
        AnonymousClass003.A0u(str, str2);
        return new InviteGiftVideoJson(str, str2, i, i2);
    }

    public String toString() {
        return super.toString();
    }

    public InviteGiftVideoJson(String str, String str2, int i, int i2) {
        AnonymousClass003.A0u(str, str2);
        this.url_light = str;
        this.url_dark = str2;
        this.width = i;
        this.height = i2;
    }

    public /* synthetic */ InviteGiftVideoJson(String str, String str2, int i, int i2, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public /* synthetic */ InviteGiftVideoJson(int i, String str, String str2, int i2, int i3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url_light = "";
        } else {
            this.url_light = str;
        }
        if ((i & 2) == 0) {
            this.url_dark = "";
        } else {
            this.url_dark = str2;
        }
        if ((i & 4) == 0) {
            this.width = 0;
        } else {
            this.width = i2;
        }
        if ((i & 8) == 0) {
            this.height = 0;
        } else {
            this.height = i3;
        }
    }
}
