package com.facebook.aura.watchlink;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class WatchLinkResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String access_token;
    public final String app_version;
    public final Boolean backgrounding_enabled;
    public final String link_id;
    public final String state;
    public final String user_id;
    public final String vm_url;

    public final class Companion {
        public final C9hr<WatchLinkResponse> serializer() {
            return WatchLinkResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WatchLinkResponse(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        C7384Etj.A0Y(str, 0);
        this.state = str;
        this.link_id = str2;
        this.user_id = str3;
        this.access_token = str4;
        this.vm_url = str5;
        this.app_version = str6;
        this.backgrounding_enabled = bool;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_watchlink_watchlink(WatchLinkResponse watchLinkResponse, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(watchLinkResponse.state, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || watchLinkResponse.link_id != null) {
            c9j5.AAP(watchLinkResponse.link_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || watchLinkResponse.user_id != null) {
            c9j5.AAP(watchLinkResponse.user_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || watchLinkResponse.access_token != null) {
            c9j5.AAP(watchLinkResponse.access_token, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || watchLinkResponse.vm_url != null) {
            c9j5.AAP(watchLinkResponse.vm_url, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || watchLinkResponse.app_version != null) {
            c9j5.AAP(watchLinkResponse.app_version, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || watchLinkResponse.backgrounding_enabled != null) {
            c9j5.AAP(watchLinkResponse.backgrounding_enabled, C07839ix.A00, c9iZ, 6);
        }
    }

    public final WatchLinkResponse copy(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool) {
        C7384Etj.A0Y(str, 0);
        return new WatchLinkResponse(str, str2, str3, str4, str5, str6, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WatchLinkResponse) {
                WatchLinkResponse watchLinkResponse = (WatchLinkResponse) obj;
                if (!C7384Etj.areEqual(this.state, watchLinkResponse.state) || !C7384Etj.areEqual(this.link_id, watchLinkResponse.link_id) || !C7384Etj.areEqual(this.user_id, watchLinkResponse.user_id) || !C7384Etj.areEqual(this.access_token, watchLinkResponse.access_token) || !C7384Etj.areEqual(this.vm_url, watchLinkResponse.vm_url) || !C7384Etj.areEqual(this.app_version, watchLinkResponse.app_version) || !C7384Etj.areEqual(this.backgrounding_enabled, watchLinkResponse.backgrounding_enabled)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WatchLinkResponse copy$default(WatchLinkResponse watchLinkResponse, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchLinkResponse.state;
        }
        if ((i & 2) != 0) {
            str2 = watchLinkResponse.link_id;
        }
        if ((i & 4) != 0) {
            str3 = watchLinkResponse.user_id;
        }
        if ((i & 8) != 0) {
            str4 = watchLinkResponse.access_token;
        }
        if ((i & 16) != 0) {
            str5 = watchLinkResponse.vm_url;
        }
        if ((i & 32) != 0) {
            str6 = watchLinkResponse.app_version;
        }
        if ((i & 64) != 0) {
            bool = watchLinkResponse.backgrounding_enabled;
        }
        return watchLinkResponse.copy(str, str2, str3, str4, str5, str6, bool);
    }

    public final String component1() {
        return this.state;
    }

    public final String component2() {
        return this.link_id;
    }

    public final String component3() {
        return this.user_id;
    }

    public final String component4() {
        return this.access_token;
    }

    public final String component5() {
        return this.vm_url;
    }

    public final String component6() {
        return this.app_version;
    }

    public final Boolean component7() {
        return this.backgrounding_enabled;
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final Boolean getBackgrounding_enabled() {
        return this.backgrounding_enabled;
    }

    public final String getLink_id() {
        return this.link_id;
    }

    public final String getState() {
        return this.state;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getVm_url() {
        return this.vm_url;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass001.A0G(this.state) + AnonymousClass006.A0G(this.link_id)) * 31) + AnonymousClass006.A0G(this.user_id)) * 31) + AnonymousClass006.A0G(this.access_token)) * 31) + AnonymousClass006.A0G(this.vm_url)) * 31) + AnonymousClass006.A0G(this.app_version)) * 31) + C3cH.A02(this.backgrounding_enabled);
    }

    public String toString() {
        String str = this.state;
        String str2 = this.link_id;
        String str3 = this.user_id;
        String str4 = this.access_token;
        String str5 = this.vm_url;
        String str6 = this.app_version;
        Boolean bool = this.backgrounding_enabled;
        StringBuilder sbA0x = C3cI.A0x("WatchLinkResponse(state=", str);
        sbA0x.append(", link_id=");
        sbA0x.append(str2);
        sbA0x.append(", user_id=");
        sbA0x.append(str3);
        sbA0x.append(", access_token=");
        sbA0x.append(str4);
        sbA0x.append(", vm_url=");
        sbA0x.append(str5);
        sbA0x.append(", app_version=");
        sbA0x.append(str6);
        return C3cJ.A0L(bool, ", backgrounding_enabled=", sbA0x);
    }

    public /* synthetic */ WatchLinkResponse(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool);
    }

    public /* synthetic */ WatchLinkResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(WatchLinkResponse$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.state = str;
        if ((i & 2) == 0) {
            this.link_id = null;
        } else {
            this.link_id = str2;
        }
        if ((i & 4) == 0) {
            this.user_id = null;
        } else {
            this.user_id = str3;
        }
        if ((i & 8) == 0) {
            this.access_token = null;
        } else {
            this.access_token = str4;
        }
        if ((i & 16) == 0) {
            this.vm_url = null;
        } else {
            this.vm_url = str5;
        }
        if ((i & 32) == 0) {
            this.app_version = null;
        } else {
            this.app_version = str6;
        }
        if ((i & 64) == 0) {
            this.backgrounding_enabled = null;
        } else {
            this.backgrounding_enabled = bool;
        }
    }
}
