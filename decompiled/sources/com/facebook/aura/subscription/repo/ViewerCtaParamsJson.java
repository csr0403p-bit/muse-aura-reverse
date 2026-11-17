package com.facebook.aura.subscription.repo;

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
/* loaded from: classes4.dex */
public final class ViewerCtaParamsJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String product_id;
    public final String target_tier_id;
    public final String url;

    public final class Companion {
        public final C9hr<ViewerCtaParamsJson> serializer() {
            return ViewerCtaParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerCtaParamsJson viewerCtaParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerCtaParamsJson.target_tier_id != null) {
            c9j5.AAP(viewerCtaParamsJson.target_tier_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerCtaParamsJson.product_id != null) {
            c9j5.AAP(viewerCtaParamsJson.product_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || viewerCtaParamsJson.url != null) {
            c9j5.AAP(viewerCtaParamsJson.url, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerCtaParamsJson) {
                ViewerCtaParamsJson viewerCtaParamsJson = (ViewerCtaParamsJson) obj;
                if (!C7384Etj.areEqual(this.target_tier_id, viewerCtaParamsJson.target_tier_id) || !C7384Etj.areEqual(this.product_id, viewerCtaParamsJson.product_id) || !C7384Etj.areEqual(this.url, viewerCtaParamsJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerCtaParamsJson copy$default(ViewerCtaParamsJson viewerCtaParamsJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerCtaParamsJson.target_tier_id;
        }
        if ((i & 2) != 0) {
            str2 = viewerCtaParamsJson.product_id;
        }
        if ((i & 4) != 0) {
            str3 = viewerCtaParamsJson.url;
        }
        return new ViewerCtaParamsJson(str, str2, str3);
    }

    public final String component1() {
        return this.target_tier_id;
    }

    public final String component2() {
        return this.product_id;
    }

    public final String component3() {
        return this.url;
    }

    public final ViewerCtaParamsJson copy(String str, String str2, String str3) {
        return new ViewerCtaParamsJson(str, str2, str3);
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getTarget_tier_id() {
        return this.target_tier_id;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.target_tier_id) * 31) + AnonymousClass006.A0G(this.product_id)) * 31) + AnonymousClass005.A0H(this.url);
    }

    public ViewerCtaParamsJson(String str, String str2, String str3) {
        this.target_tier_id = str;
        this.product_id = str2;
        this.url = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerCtaParamsJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.target_tier_id = null;
        } else {
            this.target_tier_id = str;
        }
        if ((i & 2) == 0) {
            this.product_id = null;
        } else {
            this.product_id = str2;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    public /* synthetic */ ViewerCtaParamsJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public ViewerCtaParamsJson() {
        this(null, null, null);
    }
}
