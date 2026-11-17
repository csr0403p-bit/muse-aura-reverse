package com.facebook.aura.subscription.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.CFK;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerUsageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer percent_used;
    public final String quota_status;
    public final String state;

    public final class Companion {
        public final C9hr<ViewerUsageJson> serializer() {
            return ViewerUsageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerUsageJson viewerUsageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerUsageJson.state != null) {
            c9j5.AAP(viewerUsageJson.state, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerUsageJson.percent_used != null) {
            c9j5.AAP(viewerUsageJson.percent_used, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || viewerUsageJson.quota_status != null) {
            c9j5.AAP(viewerUsageJson.quota_status, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerUsageJson) {
                ViewerUsageJson viewerUsageJson = (ViewerUsageJson) obj;
                if (!C7384Etj.areEqual(this.state, viewerUsageJson.state) || !C7384Etj.areEqual(this.percent_used, viewerUsageJson.percent_used) || !C7384Etj.areEqual(this.quota_status, viewerUsageJson.quota_status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerUsageJson copy$default(ViewerUsageJson viewerUsageJson, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerUsageJson.state;
        }
        if ((i & 2) != 0) {
            num = viewerUsageJson.percent_used;
        }
        if ((i & 4) != 0) {
            str2 = viewerUsageJson.quota_status;
        }
        return new ViewerUsageJson(str, num, str2);
    }

    public final String component1() {
        return this.state;
    }

    public final Integer component2() {
        return this.percent_used;
    }

    public final String component3() {
        return this.quota_status;
    }

    public final ViewerUsageJson copy(String str, Integer num, String str2) {
        return new ViewerUsageJson(str, num, str2);
    }

    public final Integer getPercent_used() {
        return this.percent_used;
    }

    public final String getQuota_status() {
        return this.quota_status;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.state) * 31) + AnonymousClass006.A0D(this.percent_used)) * 31) + AnonymousClass005.A0H(this.quota_status);
    }

    public final boolean isOutOfCredits() {
        String str = this.quota_status;
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(AuraSubscriptionRepositoryJsonKt.DEPLETED_QUOTA_STATUS);
    }

    public final Integer monthlyUsedPercentOrNull() {
        Integer num = this.percent_used;
        if (num == null) {
            CFK.A06(AuraSubscriptionRepositoryJsonKt.TAG, FGI.A0U("Missing monthly usage percentage (state=", this.state, "); every Hatch tier is metered"));
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue < 0) {
            iIntValue = 0;
        } else if (iIntValue > 100) {
            iIntValue = 100;
        }
        return Integer.valueOf(iIntValue);
    }

    public ViewerUsageJson(String str, Integer num, String str2) {
        this.state = str;
        this.percent_used = num;
        this.quota_status = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerUsageJson(int i, String str, Integer num, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.state = null;
        } else {
            this.state = str;
        }
        if ((i & 2) == 0) {
            this.percent_used = null;
        } else {
            this.percent_used = num;
        }
        if ((i & 4) == 0) {
            this.quota_status = null;
        } else {
            this.quota_status = str2;
        }
    }

    public /* synthetic */ ViewerUsageJson(String str, Integer num, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }

    public ViewerUsageJson() {
        this(null, null, null);
    }
}
