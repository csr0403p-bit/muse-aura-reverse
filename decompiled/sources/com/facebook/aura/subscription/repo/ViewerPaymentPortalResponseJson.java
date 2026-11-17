package com.facebook.aura.subscription.repo;

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
/* loaded from: classes4.dex */
public final class ViewerPaymentPortalResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String url;

    public final class Companion {
        public final C9hr<ViewerPaymentPortalResponseJson> serializer() {
            return ViewerPaymentPortalResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerPaymentPortalResponseJson viewerPaymentPortalResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(viewerPaymentPortalResponseJson.url)) {
            c9j5.AAV(viewerPaymentPortalResponseJson.url, c9iZ, 0);
        }
    }

    public final ViewerPaymentPortalResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ViewerPaymentPortalResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ViewerPaymentPortalResponseJson) && C7384Etj.areEqual(this.url, ((ViewerPaymentPortalResponseJson) obj).url));
    }

    public static /* synthetic */ ViewerPaymentPortalResponseJson copy$default(ViewerPaymentPortalResponseJson viewerPaymentPortalResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerPaymentPortalResponseJson.url;
        }
        C7384Etj.A0Y(str, 0);
        return new ViewerPaymentPortalResponseJson(str);
    }

    public final String component1() {
        return this.url;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public /* synthetic */ ViewerPaymentPortalResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ViewerPaymentPortalResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
    }

    public /* synthetic */ ViewerPaymentPortalResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public ViewerPaymentPortalResponseJson() {
        this("");
    }
}
