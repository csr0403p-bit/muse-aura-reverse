package com.facebook.aura.subscription.repo;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerCatalogPlanJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String billing_interval;
    public final Integer billing_interval_count;
    public final String change_direction;
    public final ViewerCatalogDisplayJson display;
    public final boolean is_current;
    public final String name;
    public final DisclaimerJson purchase_disclaimer;
    public final int rank;
    public final Long selected_tier;
    public final String tier_code;
    public final String tier_id;

    public final class Companion {
        public final C9hr<ViewerCatalogPlanJson> serializer() {
            return ViewerCatalogPlanJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ViewerCatalogPlanJson(String str, String str2, String str3, Long l, int i, boolean z, String str4, ViewerCatalogDisplayJson viewerCatalogDisplayJson, DisclaimerJson disclaimerJson, String str5, Integer num) {
        C7384Etj.A0Y(str2, 1);
        this.tier_id = str;
        this.name = str2;
        this.tier_code = str3;
        this.selected_tier = l;
        this.rank = i;
        this.is_current = z;
        this.change_direction = str4;
        this.display = viewerCatalogDisplayJson;
        this.purchase_disclaimer = disclaimerJson;
        this.billing_interval = str5;
        this.billing_interval_count = num;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerCatalogPlanJson viewerCatalogPlanJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerCatalogPlanJson.tier_id != null) {
            c9j5.AAP(viewerCatalogPlanJson.tier_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cH.A1Q(viewerCatalogPlanJson.name)) {
            c9j5.AAV(viewerCatalogPlanJson.name, c9iZ, 1);
        }
        if (zAfR || viewerCatalogPlanJson.tier_code != null) {
            c9j5.AAP(viewerCatalogPlanJson.tier_code, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || viewerCatalogPlanJson.selected_tier != null) {
            c9j5.AAP(viewerCatalogPlanJson.selected_tier, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || viewerCatalogPlanJson.rank != 0) {
            c9j5.AAK(c9iZ, 4, viewerCatalogPlanJson.rank);
        }
        if (zAfR || viewerCatalogPlanJson.is_current) {
            c9j5.AA7(c9iZ, 5, viewerCatalogPlanJson.is_current);
        }
        if (zAfR || viewerCatalogPlanJson.change_direction != null) {
            c9j5.AAP(viewerCatalogPlanJson.change_direction, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || viewerCatalogPlanJson.display != null) {
            c9j5.AAP(viewerCatalogPlanJson.display, ViewerCatalogDisplayJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || viewerCatalogPlanJson.purchase_disclaimer != null) {
            c9j5.AAP(viewerCatalogPlanJson.purchase_disclaimer, DisclaimerJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || viewerCatalogPlanJson.billing_interval != null) {
            c9j5.AAP(viewerCatalogPlanJson.billing_interval, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || viewerCatalogPlanJson.billing_interval_count != null) {
            c9j5.AAP(viewerCatalogPlanJson.billing_interval_count, C07729ii.A00, c9iZ, 10);
        }
    }

    public final ViewerCatalogPlanJson copy(String str, String str2, String str3, Long l, int i, boolean z, String str4, ViewerCatalogDisplayJson viewerCatalogDisplayJson, DisclaimerJson disclaimerJson, String str5, Integer num) {
        C7384Etj.A0Y(str2, 1);
        return new ViewerCatalogPlanJson(str, str2, str3, l, i, z, str4, viewerCatalogDisplayJson, disclaimerJson, str5, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerCatalogPlanJson) {
                ViewerCatalogPlanJson viewerCatalogPlanJson = (ViewerCatalogPlanJson) obj;
                if (!C7384Etj.areEqual(this.tier_id, viewerCatalogPlanJson.tier_id) || !C7384Etj.areEqual(this.name, viewerCatalogPlanJson.name) || !C7384Etj.areEqual(this.tier_code, viewerCatalogPlanJson.tier_code) || !C7384Etj.areEqual(this.selected_tier, viewerCatalogPlanJson.selected_tier) || this.rank != viewerCatalogPlanJson.rank || this.is_current != viewerCatalogPlanJson.is_current || !C7384Etj.areEqual(this.change_direction, viewerCatalogPlanJson.change_direction) || !C7384Etj.areEqual(this.display, viewerCatalogPlanJson.display) || !C7384Etj.areEqual(this.purchase_disclaimer, viewerCatalogPlanJson.purchase_disclaimer) || !C7384Etj.areEqual(this.billing_interval, viewerCatalogPlanJson.billing_interval) || !C7384Etj.areEqual(this.billing_interval_count, viewerCatalogPlanJson.billing_interval_count)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ViewerCatalogPlanJson copy$default(ViewerCatalogPlanJson viewerCatalogPlanJson, String str, String str2, String str3, Long l, int i, boolean z, String str4, ViewerCatalogDisplayJson viewerCatalogDisplayJson, DisclaimerJson disclaimerJson, String str5, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = viewerCatalogPlanJson.tier_id;
        }
        if ((i2 & 2) != 0) {
            str2 = viewerCatalogPlanJson.name;
        }
        if ((i2 & 4) != 0) {
            str3 = viewerCatalogPlanJson.tier_code;
        }
        if ((i2 & 8) != 0) {
            l = viewerCatalogPlanJson.selected_tier;
        }
        if ((i2 & 16) != 0) {
            i = viewerCatalogPlanJson.rank;
        }
        if ((i2 & 32) != 0) {
            z = viewerCatalogPlanJson.is_current;
        }
        if ((i2 & 64) != 0) {
            str4 = viewerCatalogPlanJson.change_direction;
        }
        if ((i2 & 128) != 0) {
            viewerCatalogDisplayJson = viewerCatalogPlanJson.display;
        }
        if ((i2 & 256) != 0) {
            disclaimerJson = viewerCatalogPlanJson.purchase_disclaimer;
        }
        if ((i2 & 512) != 0) {
            str5 = viewerCatalogPlanJson.billing_interval;
        }
        if ((i2 & 1024) != 0) {
            num = viewerCatalogPlanJson.billing_interval_count;
        }
        return viewerCatalogPlanJson.copy(str, str2, str3, l, i, z, str4, viewerCatalogDisplayJson, disclaimerJson, str5, num);
    }

    public final String component1() {
        return this.tier_id;
    }

    public final String component10() {
        return this.billing_interval;
    }

    public final Integer component11() {
        return this.billing_interval_count;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.tier_code;
    }

    public final Long component4() {
        return this.selected_tier;
    }

    public final int component5() {
        return this.rank;
    }

    public final boolean component6() {
        return this.is_current;
    }

    public final String component7() {
        return this.change_direction;
    }

    public final ViewerCatalogDisplayJson component8() {
        return this.display;
    }

    public final DisclaimerJson component9() {
        return this.purchase_disclaimer;
    }

    public final String getBilling_interval() {
        return this.billing_interval;
    }

    public final Integer getBilling_interval_count() {
        return this.billing_interval_count;
    }

    public final String getChange_direction() {
        return this.change_direction;
    }

    public final ViewerCatalogDisplayJson getDisplay() {
        return this.display;
    }

    public final String getName() {
        return this.name;
    }

    public final DisclaimerJson getPurchase_disclaimer() {
        return this.purchase_disclaimer;
    }

    public final int getRank() {
        return this.rank;
    }

    public final Long getSelected_tier() {
        return this.selected_tier;
    }

    public final String getTier_code() {
        return this.tier_code;
    }

    public final String getTier_id() {
        return this.tier_id;
    }

    public int hashCode() {
        return ((((((((C0KA.A01((((((AnonymousClass005.A0I(this.name, AnonymousClass006.A0G(this.tier_id) * 31) + AnonymousClass006.A0G(this.tier_code)) * 31) + AnonymousClass006.A0D(this.selected_tier)) * 31) + this.rank) * 31, this.is_current) + AnonymousClass006.A0G(this.change_direction)) * 31) + AnonymousClass006.A0D(this.display)) * 31) + AnonymousClass006.A0D(this.purchase_disclaimer)) * 31) + AnonymousClass006.A0G(this.billing_interval)) * 31) + C3cH.A02(this.billing_interval_count);
    }

    public final boolean is_current() {
        return this.is_current;
    }

    public final SubscriptionProduct toDomain() {
        AHD ahdA07;
        List<String> list;
        String str = this.tier_id;
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        String str2 = this.name;
        String str3 = this.tier_code;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        Long l = this.selected_tier;
        ViewerCatalogDisplayJson viewerCatalogDisplayJson = this.display;
        if (viewerCatalogDisplayJson == null || (list = viewerCatalogDisplayJson.highlights) == null || (ahdA07 = AGI.A07(list)) == null) {
            ahdA07 = AHI.A01;
        }
        int i = this.rank;
        boolean z = this.is_current;
        SubscriptionChangeDirection subscriptionChangeDirectionFromServerValue = SubscriptionChangeDirection.Companion.fromServerValue(this.change_direction);
        DisclaimerJson disclaimerJson = this.purchase_disclaimer;
        Disclaimer domain = disclaimerJson != null ? disclaimerJson.toDomain() : null;
        SubscriptionBillingInterval subscriptionBillingIntervalFromServerValue = SubscriptionBillingInterval.Companion.fromServerValue(this.billing_interval);
        Integer num = this.billing_interval_count;
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        return new SubscriptionProduct(str, str2, str3, l, ahdA07, i, z, subscriptionChangeDirectionFromServerValue, domain, subscriptionBillingIntervalFromServerValue, num);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerCatalogPlanJson(int i, String str, String str2, String str3, Long l, int i2, boolean z, String str4, ViewerCatalogDisplayJson viewerCatalogDisplayJson, DisclaimerJson disclaimerJson, String str5, Integer num, C2hx c2hx) {
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
            this.selected_tier = null;
        } else {
            this.selected_tier = l;
        }
        if ((i & 16) == 0) {
            this.rank = 0;
        } else {
            this.rank = i2;
        }
        if ((i & 32) == 0) {
            this.is_current = false;
        } else {
            this.is_current = z;
        }
        if ((i & 64) == 0) {
            this.change_direction = null;
        } else {
            this.change_direction = str4;
        }
        if ((i & 128) == 0) {
            this.display = null;
        } else {
            this.display = viewerCatalogDisplayJson;
        }
        if ((i & 256) == 0) {
            this.purchase_disclaimer = null;
        } else {
            this.purchase_disclaimer = disclaimerJson;
        }
        if ((i & 512) == 0) {
            this.billing_interval = null;
        } else {
            this.billing_interval = str5;
        }
        if ((i & 1024) == 0) {
            this.billing_interval_count = null;
        } else {
            this.billing_interval_count = num;
        }
    }

    public /* synthetic */ ViewerCatalogPlanJson(String str, String str2, String str3, Long l, int i, boolean z, String str4, ViewerCatalogDisplayJson viewerCatalogDisplayJson, DisclaimerJson disclaimerJson, String str5, Integer num, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : viewerCatalogDisplayJson, (i2 & 256) != 0 ? null : disclaimerJson, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : num);
    }

    public ViewerCatalogPlanJson() {
        this(null, "", null, null, 0, false, null, null, null, null, null);
    }
}
