package com.facebook.aura.iap;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchTierPrice extends C06G {
    public final Integer amountInHundredths;
    public final String currencyCode;
    public final String formattedPrice;

    public HatchTierPrice(String str, Integer num, String str2) {
        C7384Etj.A0Y(str, 0);
        this.formattedPrice = str;
        this.amountInHundredths = num;
        this.currencyCode = str2;
    }

    public final HatchTierPrice copy(String str, Integer num, String str2) {
        C7384Etj.A0Y(str, 0);
        return new HatchTierPrice(str, num, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTierPrice) {
                HatchTierPrice hatchTierPrice = (HatchTierPrice) obj;
                if (!C7384Etj.areEqual(this.formattedPrice, hatchTierPrice.formattedPrice) || !C7384Etj.areEqual(this.amountInHundredths, hatchTierPrice.amountInHundredths) || !C7384Etj.areEqual(this.currencyCode, hatchTierPrice.currencyCode)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTierPrice copy$default(HatchTierPrice hatchTierPrice, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTierPrice.formattedPrice;
        }
        if ((i & 2) != 0) {
            num = hatchTierPrice.amountInHundredths;
        }
        if ((i & 4) != 0) {
            str2 = hatchTierPrice.currencyCode;
        }
        return hatchTierPrice.copy(str, num, str2);
    }

    public final String component1() {
        return this.formattedPrice;
    }

    public final Integer component2() {
        return this.amountInHundredths;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final Integer getAmountInHundredths() {
        return this.amountInHundredths;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.formattedPrice) + AnonymousClass006.A0D(this.amountInHundredths)) * 31) + AnonymousClass005.A0H(this.currencyCode);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTierPrice(String str, Integer num, String str2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
