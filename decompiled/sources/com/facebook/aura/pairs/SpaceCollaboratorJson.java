package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceCollaboratorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String connection_id;
    public final String name;
    public final String permission;
    public final String photo_url;
    public final String principal;
    public final String state;

    public final class Companion {
        public final C9hr<SpaceCollaboratorJson> serializer() {
            return SpaceCollaboratorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceCollaboratorJson(String str, String str2, String str3, String str4, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        this.principal = str;
        this.state = str2;
        this.name = str3;
        this.permission = str4;
        this.photo_url = str5;
        this.connection_id = str6;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SpaceCollaboratorJson spaceCollaboratorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(spaceCollaboratorJson.principal)) {
            c9j5.AAV(spaceCollaboratorJson.principal, c9iZ, 0);
        }
        if (zAfR || spaceCollaboratorJson.state != null) {
            c9j5.AAP(spaceCollaboratorJson.state, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || spaceCollaboratorJson.name != null) {
            c9j5.AAP(spaceCollaboratorJson.name, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || spaceCollaboratorJson.permission != null) {
            c9j5.AAP(spaceCollaboratorJson.permission, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || spaceCollaboratorJson.photo_url != null) {
            c9j5.AAP(spaceCollaboratorJson.photo_url, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || spaceCollaboratorJson.connection_id != null) {
            c9j5.AAP(spaceCollaboratorJson.connection_id, C07779iq.A01, c9iZ, 5);
        }
    }

    public final SpaceCollaboratorJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        C7384Etj.A0Y(str, 0);
        return new SpaceCollaboratorJson(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceCollaboratorJson) {
                SpaceCollaboratorJson spaceCollaboratorJson = (SpaceCollaboratorJson) obj;
                if (!C7384Etj.areEqual(this.principal, spaceCollaboratorJson.principal) || !C7384Etj.areEqual(this.state, spaceCollaboratorJson.state) || !C7384Etj.areEqual(this.name, spaceCollaboratorJson.name) || !C7384Etj.areEqual(this.permission, spaceCollaboratorJson.permission) || !C7384Etj.areEqual(this.photo_url, spaceCollaboratorJson.photo_url) || !C7384Etj.areEqual(this.connection_id, spaceCollaboratorJson.connection_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceCollaboratorJson copy$default(SpaceCollaboratorJson spaceCollaboratorJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceCollaboratorJson.principal;
        }
        if ((i & 2) != 0) {
            str2 = spaceCollaboratorJson.state;
        }
        if ((i & 4) != 0) {
            str3 = spaceCollaboratorJson.name;
        }
        if ((i & 8) != 0) {
            str4 = spaceCollaboratorJson.permission;
        }
        if ((i & 16) != 0) {
            str5 = spaceCollaboratorJson.photo_url;
        }
        if ((i & 32) != 0) {
            str6 = spaceCollaboratorJson.connection_id;
        }
        return spaceCollaboratorJson.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.principal;
    }

    public final String component2() {
        return this.state;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.permission;
    }

    public final String component5() {
        return this.photo_url;
    }

    public final String component6() {
        return this.connection_id;
    }

    public final String getConnection_id() {
        return this.connection_id;
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

    public final String getPrincipal() {
        return this.principal;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return ((((((((AnonymousClass001.A0G(this.principal) + AnonymousClass006.A0G(this.state)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.permission)) * 31) + AnonymousClass006.A0G(this.photo_url)) * 31) + AnonymousClass005.A0H(this.connection_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceCollaboratorJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public /* synthetic */ SpaceCollaboratorJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        this.principal = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.state = null;
        } else {
            this.state = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.permission = null;
        } else {
            this.permission = str4;
        }
        if ((i & 16) == 0) {
            this.photo_url = null;
        } else {
            this.photo_url = str5;
        }
        if ((i & 32) == 0) {
            this.connection_id = null;
        } else {
            this.connection_id = str6;
        }
    }

    public SpaceCollaboratorJson() {
        this("", null, null, null, null, null);
    }
}
