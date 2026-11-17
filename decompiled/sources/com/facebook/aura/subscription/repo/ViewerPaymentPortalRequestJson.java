package com.facebook.aura.subscription.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerPaymentPortalRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String return_url;

    public final class Companion {
        public final C9hr<ViewerPaymentPortalRequestJson> serializer() {
            return ViewerPaymentPortalRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerPaymentPortalRequestJson viewerPaymentPortalRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !"hatch://settings?section=subscriptions".equals(viewerPaymentPortalRequestJson.return_url)) {
            c9j5.AAV(viewerPaymentPortalRequestJson.return_url, c9iZ, 0);
        }
    }

    public final ViewerPaymentPortalRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ViewerPaymentPortalRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ViewerPaymentPortalRequestJson) && C7384Etj.areEqual(this.return_url, ((ViewerPaymentPortalRequestJson) obj).return_url));
    }

    public static /* synthetic */ ViewerPaymentPortalRequestJson copy$default(ViewerPaymentPortalRequestJson viewerPaymentPortalRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerPaymentPortalRequestJson.return_url;
        }
        C7384Etj.A0Y(str, 0);
        return new ViewerPaymentPortalRequestJson(str);
    }

    public final String component1() {
        return this.return_url;
    }

    public final String getReturn_url() {
        return this.return_url;
    }

    public int hashCode() {
        return this.return_url.hashCode();
    }

    public /* synthetic */ ViewerPaymentPortalRequestJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.return_url = "hatch://settings?section=subscriptions";
        } else {
            this.return_url = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ViewerPaymentPortalRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.return_url = str;
    }

    public /* synthetic */ ViewerPaymentPortalRequestJson(String str, int i, C06H c06h) {
        this((i & 1) != 0 ? "hatch://settings?section=subscriptions" : str);
    }

    public ViewerPaymentPortalRequestJson() {
        this("hatch://settings?section=subscriptions");
    }
}
