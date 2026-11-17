package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CheckoutLodgingTaxesDisclosure extends C06G {
    public static final int $stable = 0;
    public final String termsUrl;
    public final String text;
    public final String title;

    public CheckoutLodgingTaxesDisclosure(String str, String str2, String str3) {
        C7384Etj.A0Y(str2, 1);
        this.title = str;
        this.text = str2;
        this.termsUrl = str3;
    }

    public final CheckoutLodgingTaxesDisclosure copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str2, 1);
        return new CheckoutLodgingTaxesDisclosure(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingTaxesDisclosure) {
                CheckoutLodgingTaxesDisclosure checkoutLodgingTaxesDisclosure = (CheckoutLodgingTaxesDisclosure) obj;
                if (!C7384Etj.areEqual(this.title, checkoutLodgingTaxesDisclosure.title) || !C7384Etj.areEqual(this.text, checkoutLodgingTaxesDisclosure.text) || !C7384Etj.areEqual(this.termsUrl, checkoutLodgingTaxesDisclosure.termsUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingTaxesDisclosure copy$default(CheckoutLodgingTaxesDisclosure checkoutLodgingTaxesDisclosure, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingTaxesDisclosure.title;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLodgingTaxesDisclosure.text;
        }
        if ((i & 4) != 0) {
            str3 = checkoutLodgingTaxesDisclosure.termsUrl;
        }
        return checkoutLodgingTaxesDisclosure.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.termsUrl;
    }

    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.text, AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.termsUrl);
    }

    public String toString() {
        return super.toString();
    }
}
