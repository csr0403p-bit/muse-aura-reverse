package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SharedTargetJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String direction;
    public final String goal_id;
    public final String host_muse;
    public final String idea_id;
    public final String kind;
    public final String share_id;
    public final String title;

    public final class Companion {
        public final C9hr<SharedTargetJson> serializer() {
            return SharedTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ SharedTargetJson copy$default(SharedTargetJson sharedTargetJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        if ((i & 1) != 0) {
            str8 = sharedTargetJson.share_id;
        }
        if ((i & 2) != 0) {
            str9 = sharedTargetJson.kind;
        }
        if ((i & 4) != 0) {
            str10 = sharedTargetJson.direction;
        }
        if ((i & 8) != 0) {
            str11 = sharedTargetJson.title;
        }
        if ((i & 16) != 0) {
            str12 = sharedTargetJson.idea_id;
        }
        if ((i & 32) != 0) {
            str13 = sharedTargetJson.goal_id;
        }
        if ((i & 64) != 0) {
            str14 = sharedTargetJson.host_muse;
        }
        AnonymousClass005.A0x(str8, str9, str10);
        return new SharedTargetJson(str8, str9, str10, str11, str12, str13, str14);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SharedTargetJson sharedTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(sharedTargetJson.share_id)) {
            c9j5.AAV(sharedTargetJson.share_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(sharedTargetJson.kind)) {
            c9j5.AAV(sharedTargetJson.kind, c9iZ, 1);
        }
        if (zAfR || !"".equals(sharedTargetJson.direction)) {
            c9j5.AAV(sharedTargetJson.direction, c9iZ, 2);
        }
        if (zAfR || sharedTargetJson.title != null) {
            c9j5.AAP(sharedTargetJson.title, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || sharedTargetJson.idea_id != null) {
            c9j5.AAP(sharedTargetJson.idea_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || sharedTargetJson.goal_id != null) {
            c9j5.AAP(sharedTargetJson.goal_id, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || sharedTargetJson.host_muse != null) {
            c9j5.AAP(sharedTargetJson.host_muse, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedTargetJson) {
                SharedTargetJson sharedTargetJson = (SharedTargetJson) obj;
                if (!C7384Etj.areEqual(this.share_id, sharedTargetJson.share_id) || !C7384Etj.areEqual(this.kind, sharedTargetJson.kind) || !C7384Etj.areEqual(this.direction, sharedTargetJson.direction) || !C7384Etj.areEqual(this.title, sharedTargetJson.title) || !C7384Etj.areEqual(this.idea_id, sharedTargetJson.idea_id) || !C7384Etj.areEqual(this.goal_id, sharedTargetJson.goal_id) || !C7384Etj.areEqual(this.host_muse, sharedTargetJson.host_muse)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.share_id;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.direction;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.idea_id;
    }

    public final String component6() {
        return this.goal_id;
    }

    public final String component7() {
        return this.host_muse;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getGoal_id() {
        return this.goal_id;
    }

    public final String getHost_muse() {
        return this.host_muse;
    }

    public final String getIdea_id() {
        return this.idea_id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getShare_id() {
        return this.share_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.direction, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.share_id))) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.idea_id)) * 31) + AnonymousClass006.A0G(this.goal_id)) * 31) + AnonymousClass005.A0H(this.host_muse);
    }

    public /* synthetic */ SharedTargetJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.share_id = "";
        } else {
            this.share_id = str;
        }
        if ((i & 2) == 0) {
            this.kind = "";
        } else {
            this.kind = str2;
        }
        if ((i & 4) == 0) {
            this.direction = "";
        } else {
            this.direction = str3;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str4;
        }
        if ((i & 16) == 0) {
            this.idea_id = null;
        } else {
            this.idea_id = str5;
        }
        if ((i & 32) == 0) {
            this.goal_id = null;
        } else {
            this.goal_id = str6;
        }
        if ((i & 64) == 0) {
            this.host_muse = null;
        } else {
            this.host_muse = str7;
        }
    }

    public final SharedTargetJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A0x(str, str2, str3);
        return new SharedTargetJson(str, str2, str3, str4, str5, str6, str7);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SharedTargetJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public SharedTargetJson(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A0x(str, str2, str3);
        this.share_id = str;
        this.kind = str2;
        this.direction = str3;
        this.title = str4;
        this.idea_id = str5;
        this.goal_id = str6;
        this.host_muse = str7;
    }

    public SharedTargetJson() {
        this("", "", "", null, null, null, null);
    }
}
