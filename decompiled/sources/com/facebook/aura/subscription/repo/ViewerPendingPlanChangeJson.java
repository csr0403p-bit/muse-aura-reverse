package com.facebook.aura.subscription.repo;

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
/* loaded from: classes4.dex */
public final class ViewerPendingPlanChangeJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String direction;
    public final Long effective_at;
    public final ViewerTierJson target_tier;
    public final String timing;

    public final class Companion {
        public final C9hr<ViewerPendingPlanChangeJson> serializer() {
            return ViewerPendingPlanChangeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ViewerPendingPlanChangeJson() {
        this(null, null, null, null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerPendingPlanChangeJson viewerPendingPlanChangeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerPendingPlanChangeJson.direction != null) {
            c9j5.AAP(viewerPendingPlanChangeJson.direction, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerPendingPlanChangeJson.timing != null) {
            c9j5.AAP(viewerPendingPlanChangeJson.timing, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || viewerPendingPlanChangeJson.effective_at != null) {
            c9j5.AAP(viewerPendingPlanChangeJson.effective_at, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || viewerPendingPlanChangeJson.target_tier != null) {
            c9j5.AAP(viewerPendingPlanChangeJson.target_tier, ViewerTierJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerPendingPlanChangeJson) {
                ViewerPendingPlanChangeJson viewerPendingPlanChangeJson = (ViewerPendingPlanChangeJson) obj;
                if (!C7384Etj.areEqual(this.direction, viewerPendingPlanChangeJson.direction) || !C7384Etj.areEqual(this.timing, viewerPendingPlanChangeJson.timing) || !C7384Etj.areEqual(this.effective_at, viewerPendingPlanChangeJson.effective_at) || !C7384Etj.areEqual(this.target_tier, viewerPendingPlanChangeJson.target_tier)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerPendingPlanChangeJson copy$default(ViewerPendingPlanChangeJson viewerPendingPlanChangeJson, String str, String str2, Long l, ViewerTierJson viewerTierJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerPendingPlanChangeJson.direction;
        }
        if ((i & 2) != 0) {
            str2 = viewerPendingPlanChangeJson.timing;
        }
        if ((i & 4) != 0) {
            l = viewerPendingPlanChangeJson.effective_at;
        }
        if ((i & 8) != 0) {
            viewerTierJson = viewerPendingPlanChangeJson.target_tier;
        }
        return new ViewerPendingPlanChangeJson(str, str2, l, viewerTierJson);
    }

    public final String component1() {
        return this.direction;
    }

    public final String component2() {
        return this.timing;
    }

    public final Long component3() {
        return this.effective_at;
    }

    public final ViewerTierJson component4() {
        return this.target_tier;
    }

    public final ViewerPendingPlanChangeJson copy(String str, String str2, Long l, ViewerTierJson viewerTierJson) {
        return new ViewerPendingPlanChangeJson(str, str2, l, viewerTierJson);
    }

    public final String getDirection() {
        return this.direction;
    }

    public final Long getEffective_at() {
        return this.effective_at;
    }

    public final ViewerTierJson getTarget_tier() {
        return this.target_tier;
    }

    public final String getTiming() {
        return this.timing;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.direction) * 31) + AnonymousClass006.A0G(this.timing)) * 31) + AnonymousClass006.A0D(this.effective_at)) * 31) + C3cH.A02(this.target_tier);
    }

    public String toString() {
        return super.toString();
    }

    public ViewerPendingPlanChangeJson(String str, String str2, Long l, ViewerTierJson viewerTierJson) {
        this.direction = str;
        this.timing = str2;
        this.effective_at = l;
        this.target_tier = viewerTierJson;
    }

    public /* synthetic */ ViewerPendingPlanChangeJson(String str, String str2, Long l, ViewerTierJson viewerTierJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : viewerTierJson);
    }

    public /* synthetic */ ViewerPendingPlanChangeJson(int i, String str, String str2, Long l, ViewerTierJson viewerTierJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.direction = null;
        } else {
            this.direction = str;
        }
        if ((i & 2) == 0) {
            this.timing = null;
        } else {
            this.timing = str2;
        }
        if ((i & 4) == 0) {
            this.effective_at = null;
        } else {
            this.effective_at = l;
        }
        if ((i & 8) == 0) {
            this.target_tier = null;
        } else {
            this.target_tier = viewerTierJson;
        }
    }
}
