package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceAccessRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String activity_id;
    public final String name;
    public final String principal;
    public final Long requested_at_ms;
    public final String requested_permission;

    public final class Companion {
        public final C9hr<SpaceAccessRequestJson> serializer() {
            return SpaceAccessRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SpaceAccessRequestJson spaceAccessRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(spaceAccessRequestJson.activity_id)) {
            c9j5.AAV(spaceAccessRequestJson.activity_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(spaceAccessRequestJson.principal)) {
            c9j5.AAV(spaceAccessRequestJson.principal, c9iZ, 1);
        }
        if (zAfR || spaceAccessRequestJson.name != null) {
            c9j5.AAP(spaceAccessRequestJson.name, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || spaceAccessRequestJson.requested_permission != null) {
            c9j5.AAP(spaceAccessRequestJson.requested_permission, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || spaceAccessRequestJson.requested_at_ms != null) {
            c9j5.AAP(spaceAccessRequestJson.requested_at_ms, C9j1.A00, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceAccessRequestJson) {
                SpaceAccessRequestJson spaceAccessRequestJson = (SpaceAccessRequestJson) obj;
                if (!C7384Etj.areEqual(this.activity_id, spaceAccessRequestJson.activity_id) || !C7384Etj.areEqual(this.principal, spaceAccessRequestJson.principal) || !C7384Etj.areEqual(this.name, spaceAccessRequestJson.name) || !C7384Etj.areEqual(this.requested_permission, spaceAccessRequestJson.requested_permission) || !C7384Etj.areEqual(this.requested_at_ms, spaceAccessRequestJson.requested_at_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceAccessRequestJson copy$default(SpaceAccessRequestJson spaceAccessRequestJson, String str, String str2, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceAccessRequestJson.activity_id;
        }
        if ((i & 2) != 0) {
            str2 = spaceAccessRequestJson.principal;
        }
        if ((i & 4) != 0) {
            str3 = spaceAccessRequestJson.name;
        }
        if ((i & 8) != 0) {
            str4 = spaceAccessRequestJson.requested_permission;
        }
        if ((i & 16) != 0) {
            l = spaceAccessRequestJson.requested_at_ms;
        }
        return spaceAccessRequestJson.copy(str, str2, str3, str4, l);
    }

    public final String component1() {
        return this.activity_id;
    }

    public final String component2() {
        return this.principal;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.requested_permission;
    }

    public final Long component5() {
        return this.requested_at_ms;
    }

    public final String getActivity_id() {
        return this.activity_id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPrincipal() {
        return this.principal;
    }

    public final Long getRequested_at_ms() {
        return this.requested_at_ms;
    }

    public final String getRequested_permission() {
        return this.requested_permission;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.principal, AnonymousClass001.A0G(this.activity_id)) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.requested_permission)) * 31) + C3cH.A02(this.requested_at_ms);
    }

    public SpaceAccessRequestJson(String str, String str2, String str3, String str4, Long l) {
        AnonymousClass003.A0u(str, str2);
        this.activity_id = str;
        this.principal = str2;
        this.name = str3;
        this.requested_permission = str4;
        this.requested_at_ms = l;
    }

    public final SpaceAccessRequestJson copy(String str, String str2, String str3, String str4, Long l) {
        AnonymousClass003.A0u(str, str2);
        return new SpaceAccessRequestJson(str, str2, str3, str4, l);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceAccessRequestJson(String str, String str2, String str3, String str4, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l);
    }

    public /* synthetic */ SpaceAccessRequestJson(int i, String str, String str2, String str3, String str4, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.activity_id = "";
        } else {
            this.activity_id = str;
        }
        if ((i & 2) == 0) {
            this.principal = "";
        } else {
            this.principal = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.requested_permission = null;
        } else {
            this.requested_permission = str4;
        }
        if ((i & 16) == 0) {
            this.requested_at_ms = null;
        } else {
            this.requested_at_ms = l;
        }
    }

    public SpaceAccessRequestJson() {
        this("", "", null, null, null);
    }
}
