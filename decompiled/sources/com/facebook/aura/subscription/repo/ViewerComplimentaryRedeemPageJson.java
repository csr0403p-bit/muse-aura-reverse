package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
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
public final class ViewerComplimentaryRedeemPageJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String body;
    public final DisclaimerJson disclaimer;
    public final String redeem_label;
    public final String title;

    public final class Companion {
        public final C9hr<ViewerComplimentaryRedeemPageJson> serializer() {
            return ViewerComplimentaryRedeemPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ViewerComplimentaryRedeemPageJson() {
        this("", "", "", null);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerComplimentaryRedeemPageJson viewerComplimentaryRedeemPageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(viewerComplimentaryRedeemPageJson.title)) {
            c9j5.AAV(viewerComplimentaryRedeemPageJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(viewerComplimentaryRedeemPageJson.body)) {
            c9j5.AAV(viewerComplimentaryRedeemPageJson.body, c9iZ, 1);
        }
        if (zAfR || !"".equals(viewerComplimentaryRedeemPageJson.redeem_label)) {
            c9j5.AAV(viewerComplimentaryRedeemPageJson.redeem_label, c9iZ, 2);
        }
        if (zAfR || viewerComplimentaryRedeemPageJson.disclaimer != null) {
            c9j5.AAP(viewerComplimentaryRedeemPageJson.disclaimer, DisclaimerJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerComplimentaryRedeemPageJson) {
                ViewerComplimentaryRedeemPageJson viewerComplimentaryRedeemPageJson = (ViewerComplimentaryRedeemPageJson) obj;
                if (!C7384Etj.areEqual(this.title, viewerComplimentaryRedeemPageJson.title) || !C7384Etj.areEqual(this.body, viewerComplimentaryRedeemPageJson.body) || !C7384Etj.areEqual(this.redeem_label, viewerComplimentaryRedeemPageJson.redeem_label) || !C7384Etj.areEqual(this.disclaimer, viewerComplimentaryRedeemPageJson.disclaimer)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerComplimentaryRedeemPageJson copy$default(ViewerComplimentaryRedeemPageJson viewerComplimentaryRedeemPageJson, String str, String str2, String str3, DisclaimerJson disclaimerJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerComplimentaryRedeemPageJson.title;
        }
        if ((i & 2) != 0) {
            str2 = viewerComplimentaryRedeemPageJson.body;
        }
        if ((i & 4) != 0) {
            str3 = viewerComplimentaryRedeemPageJson.redeem_label;
        }
        if ((i & 8) != 0) {
            disclaimerJson = viewerComplimentaryRedeemPageJson.disclaimer;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new ViewerComplimentaryRedeemPageJson(str, str2, str3, disclaimerJson);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String component3() {
        return this.redeem_label;
    }

    public final DisclaimerJson component4() {
        return this.disclaimer;
    }

    public final String getBody() {
        return this.body;
    }

    public final DisclaimerJson getDisclaimer() {
        return this.disclaimer;
    }

    public final String getRedeem_label() {
        return this.redeem_label;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.redeem_label, AnonymousClass005.A0I(this.body, AnonymousClass001.A0G(this.title))) + AnonymousClass006.A0D(this.disclaimer);
    }

    public final ViewerComplimentaryRedeemPageJson copy(String str, String str2, String str3, DisclaimerJson disclaimerJson) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ViewerComplimentaryRedeemPageJson(str, str2, str3, disclaimerJson);
    }

    public String toString() {
        return super.toString();
    }

    public ViewerComplimentaryRedeemPageJson(String str, String str2, String str3, DisclaimerJson disclaimerJson) {
        AnonymousClass005.A0x(str, str2, str3);
        this.title = str;
        this.body = str2;
        this.redeem_label = str3;
        this.disclaimer = disclaimerJson;
    }

    public /* synthetic */ ViewerComplimentaryRedeemPageJson(String str, String str2, String str3, DisclaimerJson disclaimerJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : disclaimerJson);
    }

    public /* synthetic */ ViewerComplimentaryRedeemPageJson(int i, String str, String str2, String str3, DisclaimerJson disclaimerJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.body = "";
        } else {
            this.body = str2;
        }
        if ((i & 4) == 0) {
            this.redeem_label = "";
        } else {
            this.redeem_label = str3;
        }
        if ((i & 8) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = disclaimerJson;
        }
    }
}
