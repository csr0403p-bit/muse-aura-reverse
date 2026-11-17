package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.subscription.repo.CurrencyAmount;

/* loaded from: classes4.dex */
public final class CreditProduct extends C06G {
    public final String analyticsPrice;
    public final String creditAmountText;
    public final String dcpProductId;
    public final String displayTitle;
    public final String formattedPrice;
    public final String id;
    public final CurrencyAmount priceAmount;
    public final String productType;
    public final String rowSubtitle;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreditProduct) {
                CreditProduct creditProduct = (CreditProduct) obj;
                if (!C7384Etj.areEqual(this.id, creditProduct.id) || !C7384Etj.areEqual(this.dcpProductId, creditProduct.dcpProductId) || !C7384Etj.areEqual(this.displayTitle, creditProduct.displayTitle) || !C7384Etj.areEqual(this.creditAmountText, creditProduct.creditAmountText) || !C7384Etj.areEqual(this.analyticsPrice, creditProduct.analyticsPrice) || !C7384Etj.areEqual(this.formattedPrice, creditProduct.formattedPrice) || !C7384Etj.areEqual(this.priceAmount, creditProduct.priceAmount) || !C7384Etj.areEqual(this.productType, creditProduct.productType) || !C7384Etj.areEqual(this.rowSubtitle, creditProduct.rowSubtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CreditProduct(String str, String str2, String str3, String str4, String str5, String str6, CurrencyAmount currencyAmount, String str7, String str8, int i, C06H c06h) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : currencyAmount, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }

    public static /* synthetic */ CreditProduct copy$default(CreditProduct creditProduct, String str, String str2, String str3, String str4, String str5, String str6, CurrencyAmount currencyAmount, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditProduct.id;
        }
        if ((i & 2) != 0) {
            str2 = creditProduct.dcpProductId;
        }
        if ((i & 4) != 0) {
            str3 = creditProduct.displayTitle;
        }
        if ((i & 8) != 0) {
            str4 = creditProduct.creditAmountText;
        }
        if ((i & 16) != 0) {
            str5 = creditProduct.analyticsPrice;
        }
        if ((i & 32) != 0) {
            str6 = creditProduct.formattedPrice;
        }
        if ((i & 64) != 0) {
            currencyAmount = creditProduct.priceAmount;
        }
        if ((i & 128) != 0) {
            str7 = creditProduct.productType;
        }
        if ((i & 256) != 0) {
            str8 = creditProduct.rowSubtitle;
        }
        return creditProduct.copy(str, str2, str3, str4, str5, str6, currencyAmount, str7, str8);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.dcpProductId;
    }

    public final String component3() {
        return this.displayTitle;
    }

    public final String component4() {
        return this.creditAmountText;
    }

    public final String component5() {
        return this.analyticsPrice;
    }

    public final String component6() {
        return this.formattedPrice;
    }

    public final CurrencyAmount component7() {
        return this.priceAmount;
    }

    public final String component8() {
        return this.productType;
    }

    public final String component9() {
        return this.rowSubtitle;
    }

    public final String getAnalyticsPrice() {
        return this.analyticsPrice;
    }

    public final String getCreditAmountText() {
        return this.creditAmountText;
    }

    public final String getDcpProductId() {
        return this.dcpProductId;
    }

    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final String getId() {
        return this.id;
    }

    public final CurrencyAmount getPriceAmount() {
        return this.priceAmount;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getRowSubtitle() {
        return this.rowSubtitle;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.creditAmountText, AnonymousClass005.A0I(this.displayTitle, AnonymousClass005.A0I(this.dcpProductId, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0G(this.analyticsPrice)) * 31) + AnonymousClass006.A0G(this.formattedPrice)) * 31) + AnonymousClass006.A0D(this.priceAmount)) * 31) + AnonymousClass006.A0G(this.productType)) * 31) + AnonymousClass005.A0H(this.rowSubtitle);
    }

    public final CreditProduct copy(String str, String str2, String str3, String str4, String str5, String str6, CurrencyAmount currencyAmount, String str7, String str8) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new CreditProduct(str, str2, str3, str4, str5, str6, currencyAmount, str7, str8);
    }

    public String toString() {
        return super.toString();
    }

    public CreditProduct(String str, String str2, String str3, String str4, String str5, String str6, CurrencyAmount currencyAmount, String str7, String str8) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.id = str;
        this.dcpProductId = str2;
        this.displayTitle = str3;
        this.creditAmountText = str4;
        this.analyticsPrice = str5;
        this.formattedPrice = str6;
        this.priceAmount = currencyAmount;
        this.productType = str7;
        this.rowSubtitle = str8;
    }
}
