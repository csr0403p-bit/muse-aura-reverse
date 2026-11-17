package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerComplimentaryOfferJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String action;
    public final String offer_id;
    public final ViewerComplimentaryRedeemPageJson redeem_page;

    public final class Companion {
        public final C9hr<ViewerComplimentaryOfferJson> serializer() {
            return ViewerComplimentaryOfferJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerComplimentaryOfferJson viewerComplimentaryOfferJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(viewerComplimentaryOfferJson.offer_id)) {
            c9j5.AAV(viewerComplimentaryOfferJson.offer_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(viewerComplimentaryOfferJson.action)) {
            c9j5.AAV(viewerComplimentaryOfferJson.action, c9iZ, 1);
        }
        if (zAfR || viewerComplimentaryOfferJson.redeem_page != null) {
            c9j5.AAP(viewerComplimentaryOfferJson.redeem_page, ViewerComplimentaryRedeemPageJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerComplimentaryOfferJson) {
                ViewerComplimentaryOfferJson viewerComplimentaryOfferJson = (ViewerComplimentaryOfferJson) obj;
                if (!C7384Etj.areEqual(this.offer_id, viewerComplimentaryOfferJson.offer_id) || !C7384Etj.areEqual(this.action, viewerComplimentaryOfferJson.action) || !C7384Etj.areEqual(this.redeem_page, viewerComplimentaryOfferJson.redeem_page)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerComplimentaryOfferJson copy$default(ViewerComplimentaryOfferJson viewerComplimentaryOfferJson, String str, String str2, ViewerComplimentaryRedeemPageJson viewerComplimentaryRedeemPageJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viewerComplimentaryOfferJson.offer_id;
        }
        if ((i & 2) != 0) {
            str2 = viewerComplimentaryOfferJson.action;
        }
        if ((i & 4) != 0) {
            viewerComplimentaryRedeemPageJson = viewerComplimentaryOfferJson.redeem_page;
        }
        return viewerComplimentaryOfferJson.copy(str, str2, viewerComplimentaryRedeemPageJson);
    }

    public final String component1() {
        return this.offer_id;
    }

    public final String component2() {
        return this.action;
    }

    public final ViewerComplimentaryRedeemPageJson component3() {
        return this.redeem_page;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getOffer_id() {
        return this.offer_id;
    }

    public final ViewerComplimentaryRedeemPageJson getRedeem_page() {
        return this.redeem_page;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.action, AnonymousClass001.A0G(this.offer_id)) + AnonymousClass006.A0D(this.redeem_page);
    }

    public final ComplimentaryRedeemPage toRedeemPage() {
        Disclaimer domain;
        ViewerComplimentaryRedeemPageJson viewerComplimentaryRedeemPageJson = this.redeem_page;
        if (viewerComplimentaryRedeemPageJson == null || C7BY.A0j(this.offer_id) || C7BY.A0j(this.action) || C7BY.A0j(viewerComplimentaryRedeemPageJson.title) || C7BY.A0j(viewerComplimentaryRedeemPageJson.body) || C7BY.A0j(viewerComplimentaryRedeemPageJson.redeem_label)) {
            return null;
        }
        String str = this.offer_id;
        String str2 = this.action;
        String str3 = viewerComplimentaryRedeemPageJson.title;
        String str4 = viewerComplimentaryRedeemPageJson.body;
        String str5 = viewerComplimentaryRedeemPageJson.redeem_label;
        DisclaimerJson disclaimerJson = viewerComplimentaryRedeemPageJson.disclaimer;
        if (disclaimerJson == null || (domain = disclaimerJson.toDomain()) == null) {
            return null;
        }
        return new ComplimentaryRedeemPage(str, str2, str3, str4, str5, domain);
    }

    public ViewerComplimentaryOfferJson(String str, String str2, ViewerComplimentaryRedeemPageJson viewerComplimentaryRedeemPageJson) {
        AnonymousClass003.A0u(str, str2);
        this.offer_id = str;
        this.action = str2;
        this.redeem_page = viewerComplimentaryRedeemPageJson;
    }

    public final ViewerComplimentaryOfferJson copy(String str, String str2, ViewerComplimentaryRedeemPageJson viewerComplimentaryRedeemPageJson) {
        AnonymousClass003.A0u(str, str2);
        return new ViewerComplimentaryOfferJson(str, str2, viewerComplimentaryRedeemPageJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerComplimentaryOfferJson(int i, String str, String str2, ViewerComplimentaryRedeemPageJson viewerComplimentaryRedeemPageJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.offer_id = "";
        } else {
            this.offer_id = str;
        }
        if ((i & 2) == 0) {
            this.action = "";
        } else {
            this.action = str2;
        }
        if ((i & 4) == 0) {
            this.redeem_page = null;
        } else {
            this.redeem_page = viewerComplimentaryRedeemPageJson;
        }
    }

    public /* synthetic */ ViewerComplimentaryOfferJson(String str, String str2, ViewerComplimentaryRedeemPageJson viewerComplimentaryRedeemPageJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : viewerComplimentaryRedeemPageJson);
    }

    public ViewerComplimentaryOfferJson() {
        this("", "", null);
    }
}
