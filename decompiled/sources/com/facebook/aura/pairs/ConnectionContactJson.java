package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
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
/* loaded from: classes3.dex */
public final class ConnectionContactJson extends C06G {
    public static final int $stable;
    public static final Companion Companion = new Companion();
    public final String agent_name;
    public final String display_name;
    public final PeerImageJson muse_avatar;
    public final PeerImageJson muse_avatar_ref;
    public final PeerImageJson profile_photo;
    public final PeerImageJson profile_photo_ref;
    public final String status;

    public final class Companion {
        public final C9hr<ConnectionContactJson> serializer() {
            return ConnectionContactJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ConnectionContactJson copy$default(ConnectionContactJson connectionContactJson, String str, String str2, String str3, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        PeerImageJson peerImageJson5 = peerImageJson;
        PeerImageJson peerImageJson6 = peerImageJson2;
        PeerImageJson peerImageJson7 = peerImageJson3;
        PeerImageJson peerImageJson8 = peerImageJson4;
        if ((i & 1) != 0) {
            str4 = connectionContactJson.status;
        }
        if ((i & 2) != 0) {
            str5 = connectionContactJson.display_name;
        }
        if ((i & 4) != 0) {
            str6 = connectionContactJson.agent_name;
        }
        if ((i & 8) != 0) {
            peerImageJson5 = connectionContactJson.profile_photo;
        }
        if ((i & 16) != 0) {
            peerImageJson6 = connectionContactJson.muse_avatar;
        }
        if ((i & 32) != 0) {
            peerImageJson7 = connectionContactJson.profile_photo_ref;
        }
        if ((i & 64) != 0) {
            peerImageJson8 = connectionContactJson.muse_avatar_ref;
        }
        AnonymousClass005.A0x(str4, str5, str6);
        return new ConnectionContactJson(str4, str5, str6, peerImageJson5, peerImageJson6, peerImageJson7, peerImageJson8);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ConnectionContactJson connectionContactJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(connectionContactJson.status)) {
            c9j5.AAV(connectionContactJson.status, c9iZ, 0);
        }
        if (zAfR || !"".equals(connectionContactJson.display_name)) {
            c9j5.AAV(connectionContactJson.display_name, c9iZ, 1);
        }
        if (zAfR || !"".equals(connectionContactJson.agent_name)) {
            c9j5.AAV(connectionContactJson.agent_name, c9iZ, 2);
        }
        if (zAfR || connectionContactJson.profile_photo != null) {
            c9j5.AAP(connectionContactJson.profile_photo, PeerImageJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || connectionContactJson.muse_avatar != null) {
            c9j5.AAP(connectionContactJson.muse_avatar, PeerImageJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || connectionContactJson.profile_photo_ref != null) {
            c9j5.AAP(connectionContactJson.profile_photo_ref, PeerImageJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || connectionContactJson.muse_avatar_ref != null) {
            c9j5.AAP(connectionContactJson.muse_avatar_ref, PeerImageJson$$serializer.INSTANCE, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionContactJson) {
                ConnectionContactJson connectionContactJson = (ConnectionContactJson) obj;
                if (!C7384Etj.areEqual(this.status, connectionContactJson.status) || !C7384Etj.areEqual(this.display_name, connectionContactJson.display_name) || !C7384Etj.areEqual(this.agent_name, connectionContactJson.agent_name) || !C7384Etj.areEqual(this.profile_photo, connectionContactJson.profile_photo) || !C7384Etj.areEqual(this.muse_avatar, connectionContactJson.muse_avatar) || !C7384Etj.areEqual(this.profile_photo_ref, connectionContactJson.profile_photo_ref) || !C7384Etj.areEqual(this.muse_avatar_ref, connectionContactJson.muse_avatar_ref)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        int i = PeerImageJson.$stable;
        $stable = i | i | i | i;
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.display_name;
    }

    public final String component3() {
        return this.agent_name;
    }

    public final PeerImageJson component4() {
        return this.profile_photo;
    }

    public final PeerImageJson component5() {
        return this.muse_avatar;
    }

    public final PeerImageJson component6() {
        return this.profile_photo_ref;
    }

    public final PeerImageJson component7() {
        return this.muse_avatar_ref;
    }

    public final String getAgent_name() {
        return this.agent_name;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final PeerImageJson getMuse_avatar() {
        return this.muse_avatar;
    }

    public final PeerImageJson getMuse_avatar_ref() {
        return this.muse_avatar_ref;
    }

    public final PeerImageJson getProfile_photo() {
        return this.profile_photo;
    }

    public final PeerImageJson getProfile_photo_ref() {
        return this.profile_photo_ref;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.agent_name, AnonymousClass005.A0I(this.display_name, AnonymousClass001.A0G(this.status))) + AnonymousClass006.A0D(this.profile_photo)) * 31) + AnonymousClass006.A0D(this.muse_avatar)) * 31) + AnonymousClass006.A0D(this.profile_photo_ref)) * 31) + C3cH.A02(this.muse_avatar_ref);
    }

    public /* synthetic */ ConnectionContactJson(int i, String str, String str2, String str3, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.status = "";
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.agent_name = "";
        } else {
            this.agent_name = str3;
        }
        if ((i & 8) == 0) {
            this.profile_photo = null;
        } else {
            this.profile_photo = peerImageJson;
        }
        if ((i & 16) == 0) {
            this.muse_avatar = null;
        } else {
            this.muse_avatar = peerImageJson2;
        }
        if ((i & 32) == 0) {
            this.profile_photo_ref = null;
        } else {
            this.profile_photo_ref = peerImageJson3;
        }
        if ((i & 64) == 0) {
            this.muse_avatar_ref = null;
        } else {
            this.muse_avatar_ref = peerImageJson4;
        }
    }

    public final ConnectionContactJson copy(String str, String str2, String str3, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ConnectionContactJson(str, str2, str3, peerImageJson, peerImageJson2, peerImageJson3, peerImageJson4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionContactJson(String str, String str2, String str3, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : peerImageJson, (i & 16) != 0 ? null : peerImageJson2, (i & 32) != 0 ? null : peerImageJson3, (i & 64) != 0 ? null : peerImageJson4);
    }

    public ConnectionContactJson(String str, String str2, String str3, PeerImageJson peerImageJson, PeerImageJson peerImageJson2, PeerImageJson peerImageJson3, PeerImageJson peerImageJson4) {
        AnonymousClass005.A0x(str, str2, str3);
        this.status = str;
        this.display_name = str2;
        this.agent_name = str3;
        this.profile_photo = peerImageJson;
        this.muse_avatar = peerImageJson2;
        this.profile_photo_ref = peerImageJson3;
        this.muse_avatar_ref = peerImageJson4;
    }

    public ConnectionContactJson() {
        this("", "", "", null, null, null, null);
    }
}
