package com.facebook.aura.subscription.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerTierJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean is_paid;
    public final String name;
    public final String tier_code;
    public final String tier_id;

    public final class Companion {
        public final C9hr<ViewerTierJson> serializer() {
            return ViewerTierJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ViewerTierJson() {
        this(null, "", null, false);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerTierJson viewerTierJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerTierJson.tier_id != null) {
            c9j5.AAP(viewerTierJson.tier_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cH.A1Q(viewerTierJson.name)) {
            c9j5.AAV(viewerTierJson.name, c9iZ, 1);
        }
        if (zAfR || viewerTierJson.tier_code != null) {
            c9j5.AAP(viewerTierJson.tier_code, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || viewerTierJson.is_paid) {
            c9j5.AA7(c9iZ, 3, viewerTierJson.is_paid);
        }
    }

    public final ViewerTierJson copy(String str, String str2, String str3, boolean z) {
        C7384Etj.A0Y(str2, 1);
        return new ViewerTierJson(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerTierJson) {
                ViewerTierJson viewerTierJson = (ViewerTierJson) obj;
                if (!C7384Etj.areEqual(this.tier_id, viewerTierJson.tier_id) || !C7384Etj.areEqual(this.name, viewerTierJson.name) || !C7384Etj.areEqual(this.tier_code, viewerTierJson.tier_code) || this.is_paid != viewerTierJson.is_paid) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerTierJson copy$default(ViewerTierJson viewerTierJson, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerTierJson.tier_id;
        }
        if ((i & 2) != 0) {
            str2 = viewerTierJson.name;
        }
        if ((i & 4) != 0) {
            str3 = viewerTierJson.tier_code;
        }
        if ((i & 8) != 0) {
            z = viewerTierJson.is_paid;
        }
        C7384Etj.A0Y(str2, 1);
        return new ViewerTierJson(str, str2, str3, z);
    }

    public final String component1() {
        return this.tier_id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.tier_code;
    }

    public final boolean component4() {
        return this.is_paid;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTier_code() {
        return this.tier_code;
    }

    public final String getTier_id() {
        return this.tier_id;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0I(this.name, AnonymousClass006.A0G(this.tier_id) * 31) + AnonymousClass005.A0H(this.tier_code)) * 31, this.is_paid);
    }

    public final boolean is_paid() {
        return this.is_paid;
    }

    public String toString() {
        return super.toString();
    }

    public ViewerTierJson(String str, String str2, String str3, boolean z) {
        C7384Etj.A0Y(str2, 1);
        this.tier_id = str;
        this.name = str2;
        this.tier_code = str3;
        this.is_paid = z;
    }

    public /* synthetic */ ViewerTierJson(String str, String str2, String str3, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, AnonymousClass005.A1P(i, z));
    }

    public /* synthetic */ ViewerTierJson(int i, String str, String str2, String str3, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.tier_id = null;
        } else {
            this.tier_id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.tier_code = null;
        } else {
            this.tier_code = str3;
        }
        if ((i & 8) == 0) {
            this.is_paid = false;
        } else {
            this.is_paid = z;
        }
    }
}
