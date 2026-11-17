package com.facebook.aura.spaces.menu;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PeerSpaceMemberJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String muse_id;
    public final String name;
    public final String permission;
    public final String photo_url;
    public final boolean you;

    public final class Companion {
        public final C9hr<PeerSpaceMemberJson> serializer() {
            return PeerSpaceMemberJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(PeerSpaceMemberJson peerSpaceMemberJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(peerSpaceMemberJson.muse_id)) {
            c9j5.AAV(peerSpaceMemberJson.muse_id, c9iZ, 0);
        }
        if (zAfR || peerSpaceMemberJson.name != null) {
            c9j5.AAP(peerSpaceMemberJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || peerSpaceMemberJson.permission != null) {
            c9j5.AAP(peerSpaceMemberJson.permission, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || peerSpaceMemberJson.you) {
            c9j5.AA7(c9iZ, 3, peerSpaceMemberJson.you);
        }
        if (zAfR || peerSpaceMemberJson.photo_url != null) {
            c9j5.AAP(peerSpaceMemberJson.photo_url, C07779iq.A01, c9iZ, 4);
        }
    }

    public final PeerSpaceMemberJson copy(String str, String str2, String str3, boolean z, String str4) {
        C7384Etj.A0Y(str, 0);
        return new PeerSpaceMemberJson(str, str2, str3, z, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerSpaceMemberJson) {
                PeerSpaceMemberJson peerSpaceMemberJson = (PeerSpaceMemberJson) obj;
                if (!C7384Etj.areEqual(this.muse_id, peerSpaceMemberJson.muse_id) || !C7384Etj.areEqual(this.name, peerSpaceMemberJson.name) || !C7384Etj.areEqual(this.permission, peerSpaceMemberJson.permission) || this.you != peerSpaceMemberJson.you || !C7384Etj.areEqual(this.photo_url, peerSpaceMemberJson.photo_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PeerSpaceMemberJson copy$default(PeerSpaceMemberJson peerSpaceMemberJson, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerSpaceMemberJson.muse_id;
        }
        if ((i & 2) != 0) {
            str2 = peerSpaceMemberJson.name;
        }
        if ((i & 4) != 0) {
            str3 = peerSpaceMemberJson.permission;
        }
        if ((i & 8) != 0) {
            z = peerSpaceMemberJson.you;
        }
        if ((i & 16) != 0) {
            str4 = peerSpaceMemberJson.photo_url;
        }
        return peerSpaceMemberJson.copy(str, str2, str3, z, str4);
    }

    public final String component1() {
        return this.muse_id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.permission;
    }

    public final boolean component4() {
        return this.you;
    }

    public final String component5() {
        return this.photo_url;
    }

    public final String getMuse_id() {
        return this.muse_id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPermission() {
        return this.permission;
    }

    public final String getPhoto_url() {
        return this.photo_url;
    }

    public final boolean getYou() {
        return this.you;
    }

    public int hashCode() {
        return C0KA.A01((((AnonymousClass001.A0G(this.muse_id) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.permission)) * 31, this.you) + AnonymousClass005.A0H(this.photo_url);
    }

    public /* synthetic */ PeerSpaceMemberJson(int i, String str, String str2, String str3, boolean z, String str4, C2hx c2hx) {
        this.muse_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.permission = null;
        } else {
            this.permission = str3;
        }
        if ((i & 8) == 0) {
            this.you = false;
        } else {
            this.you = z;
        }
        if ((i & 16) == 0) {
            this.photo_url = null;
        } else {
            this.photo_url = str4;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerSpaceMemberJson(String str, String str2, String str3, boolean z, String str4) {
        C7384Etj.A0Y(str, 0);
        this.muse_id = str;
        this.name = str2;
        this.permission = str3;
        this.you = z;
        this.photo_url = str4;
    }

    public /* synthetic */ PeerSpaceMemberJson(String str, String str2, String str3, boolean z, String str4, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, AnonymousClass005.A1P(i, z), (i & 16) != 0 ? null : str4);
    }

    public PeerSpaceMemberJson() {
        this("", null, null, false, null);
    }
}
