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
public final class ViewerAgreementJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final SubscriptionPeriodJson current_period;
    public final String id;
    public final boolean is_x_platform;
    public final ViewerPendingPlanChangeJson pending_plan_change;
    public final CurrencyAmountJson price;
    public final String purchase_platform;
    public final String status;
    public final ViewerCrossPlatformDialogJson x_platform_dialog;
    public final String x_platform_message;

    public final class Companion {
        public final C9hr<ViewerAgreementJson> serializer() {
            return ViewerAgreementJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ViewerAgreementJson copy$default(ViewerAgreementJson viewerAgreementJson, String str, String str2, boolean z, String str3, ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson, SubscriptionPeriodJson subscriptionPeriodJson, ViewerPendingPlanChangeJson viewerPendingPlanChangeJson, String str4, CurrencyAmountJson currencyAmountJson, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        boolean z2 = z;
        String str7 = str3;
        ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson2 = viewerCrossPlatformDialogJson;
        SubscriptionPeriodJson subscriptionPeriodJson2 = subscriptionPeriodJson;
        ViewerPendingPlanChangeJson viewerPendingPlanChangeJson2 = viewerPendingPlanChangeJson;
        String str8 = str4;
        CurrencyAmountJson currencyAmountJson2 = currencyAmountJson;
        if ((i & 1) != 0) {
            str5 = viewerAgreementJson.id;
        }
        if ((i & 2) != 0) {
            str6 = viewerAgreementJson.status;
        }
        if ((i & 4) != 0) {
            z2 = viewerAgreementJson.is_x_platform;
        }
        if ((i & 8) != 0) {
            str7 = viewerAgreementJson.x_platform_message;
        }
        if ((i & 16) != 0) {
            viewerCrossPlatformDialogJson2 = viewerAgreementJson.x_platform_dialog;
        }
        if ((i & 32) != 0) {
            subscriptionPeriodJson2 = viewerAgreementJson.current_period;
        }
        if ((i & 64) != 0) {
            viewerPendingPlanChangeJson2 = viewerAgreementJson.pending_plan_change;
        }
        if ((i & 128) != 0) {
            str8 = viewerAgreementJson.purchase_platform;
        }
        if ((i & 256) != 0) {
            currencyAmountJson2 = viewerAgreementJson.price;
        }
        return new ViewerAgreementJson(str5, str6, z2, str7, viewerCrossPlatformDialogJson2, subscriptionPeriodJson2, viewerPendingPlanChangeJson2, str8, currencyAmountJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerAgreementJson viewerAgreementJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerAgreementJson.id != null) {
            c9j5.AAP(viewerAgreementJson.id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerAgreementJson.status != null) {
            c9j5.AAP(viewerAgreementJson.status, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || viewerAgreementJson.is_x_platform) {
            c9j5.AA7(c9iZ, 2, viewerAgreementJson.is_x_platform);
        }
        if (zAfR || viewerAgreementJson.x_platform_message != null) {
            c9j5.AAP(viewerAgreementJson.x_platform_message, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || viewerAgreementJson.x_platform_dialog != null) {
            c9j5.AAP(viewerAgreementJson.x_platform_dialog, ViewerCrossPlatformDialogJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || viewerAgreementJson.current_period != null) {
            c9j5.AAP(viewerAgreementJson.current_period, SubscriptionPeriodJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || viewerAgreementJson.pending_plan_change != null) {
            c9j5.AAP(viewerAgreementJson.pending_plan_change, ViewerPendingPlanChangeJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || viewerAgreementJson.purchase_platform != null) {
            c9j5.AAP(viewerAgreementJson.purchase_platform, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || viewerAgreementJson.price != null) {
            c9j5.AAP(viewerAgreementJson.price, CurrencyAmountJson$$serializer.INSTANCE, c9iZ, 8);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerAgreementJson) {
                ViewerAgreementJson viewerAgreementJson = (ViewerAgreementJson) obj;
                if (!C7384Etj.areEqual(this.id, viewerAgreementJson.id) || !C7384Etj.areEqual(this.status, viewerAgreementJson.status) || this.is_x_platform != viewerAgreementJson.is_x_platform || !C7384Etj.areEqual(this.x_platform_message, viewerAgreementJson.x_platform_message) || !C7384Etj.areEqual(this.x_platform_dialog, viewerAgreementJson.x_platform_dialog) || !C7384Etj.areEqual(this.current_period, viewerAgreementJson.current_period) || !C7384Etj.areEqual(this.pending_plan_change, viewerAgreementJson.pending_plan_change) || !C7384Etj.areEqual(this.purchase_platform, viewerAgreementJson.purchase_platform) || !C7384Etj.areEqual(this.price, viewerAgreementJson.price)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.status;
    }

    public final boolean component3() {
        return this.is_x_platform;
    }

    public final String component4() {
        return this.x_platform_message;
    }

    public final ViewerCrossPlatformDialogJson component5() {
        return this.x_platform_dialog;
    }

    public final SubscriptionPeriodJson component6() {
        return this.current_period;
    }

    public final ViewerPendingPlanChangeJson component7() {
        return this.pending_plan_change;
    }

    public final String component8() {
        return this.purchase_platform;
    }

    public final CurrencyAmountJson component9() {
        return this.price;
    }

    public final ViewerAgreementJson copy(String str, String str2, boolean z, String str3, ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson, SubscriptionPeriodJson subscriptionPeriodJson, ViewerPendingPlanChangeJson viewerPendingPlanChangeJson, String str4, CurrencyAmountJson currencyAmountJson) {
        return new ViewerAgreementJson(str, str2, z, str3, viewerCrossPlatformDialogJson, subscriptionPeriodJson, viewerPendingPlanChangeJson, str4, currencyAmountJson);
    }

    public final SubscriptionPeriodJson getCurrent_period() {
        return this.current_period;
    }

    public final String getId() {
        return this.id;
    }

    public final ViewerPendingPlanChangeJson getPending_plan_change() {
        return this.pending_plan_change;
    }

    public final CurrencyAmountJson getPrice() {
        return this.price;
    }

    public final String getPurchase_platform() {
        return this.purchase_platform;
    }

    public final String getStatus() {
        return this.status;
    }

    public final ViewerCrossPlatformDialogJson getX_platform_dialog() {
        return this.x_platform_dialog;
    }

    public final String getX_platform_message() {
        return this.x_platform_message;
    }

    public int hashCode() {
        return ((((((((((C0KA.A01(((AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0G(this.status)) * 31, this.is_x_platform) + AnonymousClass006.A0G(this.x_platform_message)) * 31) + AnonymousClass006.A0D(this.x_platform_dialog)) * 31) + AnonymousClass006.A0D(this.current_period)) * 31) + AnonymousClass006.A0D(this.pending_plan_change)) * 31) + AnonymousClass006.A0G(this.purchase_platform)) * 31) + C3cH.A02(this.price);
    }

    public final boolean is_x_platform() {
        return this.is_x_platform;
    }

    public /* synthetic */ ViewerAgreementJson(int i, String str, String str2, boolean z, String str3, ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson, SubscriptionPeriodJson subscriptionPeriodJson, ViewerPendingPlanChangeJson viewerPendingPlanChangeJson, String str4, CurrencyAmountJson currencyAmountJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.status = null;
        } else {
            this.status = str2;
        }
        if ((i & 4) == 0) {
            this.is_x_platform = false;
        } else {
            this.is_x_platform = z;
        }
        if ((i & 8) == 0) {
            this.x_platform_message = null;
        } else {
            this.x_platform_message = str3;
        }
        if ((i & 16) == 0) {
            this.x_platform_dialog = null;
        } else {
            this.x_platform_dialog = viewerCrossPlatformDialogJson;
        }
        if ((i & 32) == 0) {
            this.current_period = null;
        } else {
            this.current_period = subscriptionPeriodJson;
        }
        if ((i & 64) == 0) {
            this.pending_plan_change = null;
        } else {
            this.pending_plan_change = viewerPendingPlanChangeJson;
        }
        if ((i & 128) == 0) {
            this.purchase_platform = null;
        } else {
            this.purchase_platform = str4;
        }
        if ((i & 256) == 0) {
            this.price = null;
        } else {
            this.price = currencyAmountJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ViewerAgreementJson(String str, String str2, boolean z, String str3, ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson, SubscriptionPeriodJson subscriptionPeriodJson, ViewerPendingPlanChangeJson viewerPendingPlanChangeJson, String str4, CurrencyAmountJson currencyAmountJson) {
        this.id = str;
        this.status = str2;
        this.is_x_platform = z;
        this.x_platform_message = str3;
        this.x_platform_dialog = viewerCrossPlatformDialogJson;
        this.current_period = subscriptionPeriodJson;
        this.pending_plan_change = viewerPendingPlanChangeJson;
        this.purchase_platform = str4;
        this.price = currencyAmountJson;
    }

    public /* synthetic */ ViewerAgreementJson(String str, String str2, boolean z, String str3, ViewerCrossPlatformDialogJson viewerCrossPlatformDialogJson, SubscriptionPeriodJson subscriptionPeriodJson, ViewerPendingPlanChangeJson viewerPendingPlanChangeJson, String str4, CurrencyAmountJson currencyAmountJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : viewerCrossPlatformDialogJson, (i & 32) != 0 ? null : subscriptionPeriodJson, (i & 64) != 0 ? null : viewerPendingPlanChangeJson, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : currencyAmountJson);
    }

    public ViewerAgreementJson() {
        this(null, null, false, null, null, null, null, null, null);
    }
}
