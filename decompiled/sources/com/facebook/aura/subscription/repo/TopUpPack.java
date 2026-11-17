package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class TopUpPack extends C06G {
    public static final int $stable = 0;
    public final int creditAmount;
    public final String dcpProductId;
    public final String playProductId;
    public final CurrencyAmount price;
    public final String productType;
    public final String rowSubtitle;
    public final String title;

    public static /* synthetic */ TopUpPack copy$default(TopUpPack topUpPack, String str, String str2, String str3, int i, CurrencyAmount currencyAmount, String str4, String str5, int i2, Object obj) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        int i3 = i;
        CurrencyAmount currencyAmount2 = currencyAmount;
        String str9 = str4;
        String str10 = str5;
        if ((i2 & 1) != 0) {
            str6 = topUpPack.playProductId;
        }
        if ((i2 & 2) != 0) {
            str7 = topUpPack.dcpProductId;
        }
        if ((i2 & 4) != 0) {
            str8 = topUpPack.title;
        }
        if ((i2 & 8) != 0) {
            i3 = topUpPack.creditAmount;
        }
        if ((i2 & 16) != 0) {
            currencyAmount2 = topUpPack.price;
        }
        if ((i2 & 32) != 0) {
            str9 = topUpPack.productType;
        }
        if ((i2 & 64) != 0) {
            str10 = topUpPack.rowSubtitle;
        }
        AnonymousClass003.A0u(str6, str7);
        return new TopUpPack(str6, str7, str8, i3, currencyAmount2, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TopUpPack) {
                TopUpPack topUpPack = (TopUpPack) obj;
                if (!C7384Etj.areEqual(this.playProductId, topUpPack.playProductId) || !C7384Etj.areEqual(this.dcpProductId, topUpPack.dcpProductId) || !C7384Etj.areEqual(this.title, topUpPack.title) || this.creditAmount != topUpPack.creditAmount || !C7384Etj.areEqual(this.price, topUpPack.price) || !C7384Etj.areEqual(this.productType, topUpPack.productType) || !C7384Etj.areEqual(this.rowSubtitle, topUpPack.rowSubtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.playProductId;
    }

    public final String component2() {
        return this.dcpProductId;
    }

    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.creditAmount;
    }

    public final CurrencyAmount component5() {
        return this.price;
    }

    public final String component6() {
        return this.productType;
    }

    public final String component7() {
        return this.rowSubtitle;
    }

    public final int getCreditAmount() {
        return this.creditAmount;
    }

    public final String getDcpProductId() {
        return this.dcpProductId;
    }

    public final String getPlayProductId() {
        return this.playProductId;
    }

    public final CurrencyAmount getPrice() {
        return this.price;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getRowSubtitle() {
        return this.rowSubtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.dcpProductId, AnonymousClass001.A0G(this.playProductId)) + AnonymousClass006.A0G(this.title)) * 31) + this.creditAmount) * 31) + AnonymousClass006.A0D(this.price)) * 31) + AnonymousClass006.A0G(this.productType)) * 31) + AnonymousClass005.A0H(this.rowSubtitle);
    }

    public TopUpPack(String str, String str2, String str3, int i, CurrencyAmount currencyAmount, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        this.playProductId = str;
        this.dcpProductId = str2;
        this.title = str3;
        this.creditAmount = i;
        this.price = currencyAmount;
        this.productType = str4;
        this.rowSubtitle = str5;
    }

    public final TopUpPack copy(String str, String str2, String str3, int i, CurrencyAmount currencyAmount, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        return new TopUpPack(str, str2, str3, i, currencyAmount, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TopUpPack(String str, String str2, String str3, int i, CurrencyAmount currencyAmount, String str4, String str5, int i2, C06H c06h) {
        this(str, str2, str3, i, (i2 & 16) != 0 ? null : currencyAmount, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }
}
