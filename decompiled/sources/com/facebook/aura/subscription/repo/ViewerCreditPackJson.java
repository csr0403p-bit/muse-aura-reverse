package com.facebook.aura.subscription.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.CFK;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ViewerCreditPackJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int credits_granted;
    public final String external_product_id;
    public final String name;
    public final String pack_row_subtitle;
    public final CurrencyAmountJson price;
    public final String product_id;
    public final String product_type;

    public final class Companion {
        public final C9hr<ViewerCreditPackJson> serializer() {
            return ViewerCreditPackJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ViewerCreditPackJson copy$default(ViewerCreditPackJson viewerCreditPackJson, String str, String str2, String str3, int i, CurrencyAmountJson currencyAmountJson, String str4, String str5, int i2, Object obj) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        int i3 = i;
        CurrencyAmountJson currencyAmountJson2 = currencyAmountJson;
        String str9 = str4;
        String str10 = str5;
        if ((i2 & 1) != 0) {
            str6 = viewerCreditPackJson.product_id;
        }
        if ((i2 & 2) != 0) {
            str7 = viewerCreditPackJson.external_product_id;
        }
        if ((i2 & 4) != 0) {
            str8 = viewerCreditPackJson.name;
        }
        if ((i2 & 8) != 0) {
            i3 = viewerCreditPackJson.credits_granted;
        }
        if ((i2 & 16) != 0) {
            currencyAmountJson2 = viewerCreditPackJson.price;
        }
        if ((i2 & 32) != 0) {
            str9 = viewerCreditPackJson.product_type;
        }
        if ((i2 & 64) != 0) {
            str10 = viewerCreditPackJson.pack_row_subtitle;
        }
        return new ViewerCreditPackJson(str6, str7, str8, i3, currencyAmountJson2, str9, str10);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerCreditPackJson viewerCreditPackJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || viewerCreditPackJson.product_id != null) {
            c9j5.AAP(viewerCreditPackJson.product_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || viewerCreditPackJson.external_product_id != null) {
            c9j5.AAP(viewerCreditPackJson.external_product_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || viewerCreditPackJson.name != null) {
            c9j5.AAP(viewerCreditPackJson.name, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || viewerCreditPackJson.credits_granted != 0) {
            c9j5.AAK(c9iZ, 3, viewerCreditPackJson.credits_granted);
        }
        if (zAfR || viewerCreditPackJson.price != null) {
            c9j5.AAP(viewerCreditPackJson.price, CurrencyAmountJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || viewerCreditPackJson.product_type != null) {
            c9j5.AAP(viewerCreditPackJson.product_type, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || viewerCreditPackJson.pack_row_subtitle != null) {
            c9j5.AAP(viewerCreditPackJson.pack_row_subtitle, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ViewerCreditPackJson) {
                ViewerCreditPackJson viewerCreditPackJson = (ViewerCreditPackJson) obj;
                if (!C7384Etj.areEqual(this.product_id, viewerCreditPackJson.product_id) || !C7384Etj.areEqual(this.external_product_id, viewerCreditPackJson.external_product_id) || !C7384Etj.areEqual(this.name, viewerCreditPackJson.name) || this.credits_granted != viewerCreditPackJson.credits_granted || !C7384Etj.areEqual(this.price, viewerCreditPackJson.price) || !C7384Etj.areEqual(this.product_type, viewerCreditPackJson.product_type) || !C7384Etj.areEqual(this.pack_row_subtitle, viewerCreditPackJson.pack_row_subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.product_id;
    }

    public final String component2() {
        return this.external_product_id;
    }

    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.credits_granted;
    }

    public final CurrencyAmountJson component5() {
        return this.price;
    }

    public final String component6() {
        return this.product_type;
    }

    public final String component7() {
        return this.pack_row_subtitle;
    }

    public final ViewerCreditPackJson copy(String str, String str2, String str3, int i, CurrencyAmountJson currencyAmountJson, String str4, String str5) {
        return new ViewerCreditPackJson(str, str2, str3, i, currencyAmountJson, str4, str5);
    }

    public final int getCredits_granted() {
        return this.credits_granted;
    }

    public final String getExternal_product_id() {
        return this.external_product_id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPack_row_subtitle() {
        return this.pack_row_subtitle;
    }

    public final CurrencyAmountJson getPrice() {
        return this.price;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getProduct_type() {
        return this.product_type;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass006.A0G(this.product_id) * 31) + AnonymousClass006.A0G(this.external_product_id)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + this.credits_granted) * 31) + AnonymousClass006.A0D(this.price)) * 31) + AnonymousClass006.A0G(this.product_type)) * 31) + AnonymousClass005.A0H(this.pack_row_subtitle);
    }

    public final TopUpPack toDomain() {
        String str = this.external_product_id;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        String str2 = this.product_id;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        if (str == null || str2 == null || this.credits_granted <= 0) {
            CFK.A06(AuraSubscriptionRepositoryJsonKt.TAG, FGI.A0U("Dropping credit pack ", this.name, ": missing Play SKU, quotable id, or granted credits"));
            return null;
        }
        String str3 = this.name;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        int i = this.credits_granted;
        CurrencyAmountJson currencyAmountJson = this.price;
        CurrencyAmount domain = currencyAmountJson != null ? currencyAmountJson.toDomain() : null;
        String str4 = this.product_type;
        String str5 = this.pack_row_subtitle;
        if (str5 == null || C7BY.A0j(str5)) {
            str5 = null;
        }
        return new TopUpPack(str, str2, str3, i, domain, str4, str5);
    }

    public ViewerCreditPackJson(String str, String str2, String str3, int i, CurrencyAmountJson currencyAmountJson, String str4, String str5) {
        this.product_id = str;
        this.external_product_id = str2;
        this.name = str3;
        this.credits_granted = i;
        this.price = currencyAmountJson;
        this.product_type = str4;
        this.pack_row_subtitle = str5;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ViewerCreditPackJson(String str, String str2, String str3, int i, CurrencyAmountJson currencyAmountJson, String str4, String str5, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : currencyAmountJson, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }

    public /* synthetic */ ViewerCreditPackJson(int i, String str, String str2, String str3, int i2, CurrencyAmountJson currencyAmountJson, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.product_id = null;
        } else {
            this.product_id = str;
        }
        if ((i & 2) == 0) {
            this.external_product_id = null;
        } else {
            this.external_product_id = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.credits_granted = 0;
        } else {
            this.credits_granted = i2;
        }
        if ((i & 16) == 0) {
            this.price = null;
        } else {
            this.price = currencyAmountJson;
        }
        if ((i & 32) == 0) {
            this.product_type = null;
        } else {
            this.product_type = str4;
        }
        if ((i & 64) == 0) {
            this.pack_row_subtitle = null;
        } else {
            this.pack_row_subtitle = str5;
        }
    }

    public ViewerCreditPackJson() {
        this(null, null, null, 0, null, null, null);
    }
}
