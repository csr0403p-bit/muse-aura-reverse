package com.facebook.aura.agentpermission;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CheckoutPaymentPresentation extends C06G {
    public static final int $stable = 0;
    public final String cardBrand;
    public final String cardLast4;
    public final String label;
    public final String method;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutPaymentPresentation) {
                CheckoutPaymentPresentation checkoutPaymentPresentation = (CheckoutPaymentPresentation) obj;
                if (!C7384Etj.areEqual(this.cardBrand, checkoutPaymentPresentation.cardBrand) || !C7384Etj.areEqual(this.cardLast4, checkoutPaymentPresentation.cardLast4) || !C7384Etj.areEqual(this.label, checkoutPaymentPresentation.label) || !C7384Etj.areEqual(this.method, checkoutPaymentPresentation.method)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutPaymentPresentation copy$default(CheckoutPaymentPresentation checkoutPaymentPresentation, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutPaymentPresentation.cardBrand;
        }
        if ((i & 2) != 0) {
            str2 = checkoutPaymentPresentation.cardLast4;
        }
        if ((i & 4) != 0) {
            str3 = checkoutPaymentPresentation.label;
        }
        if ((i & 8) != 0) {
            str4 = checkoutPaymentPresentation.method;
        }
        return new CheckoutPaymentPresentation(str, str2, str3, str4);
    }

    public final String component1() {
        return this.cardBrand;
    }

    public final String component2() {
        return this.cardLast4;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.method;
    }

    public final CheckoutPaymentPresentation copy(String str, String str2, String str3, String str4) {
        return new CheckoutPaymentPresentation(str, str2, str3, str4);
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final String getCardLast4() {
        return this.cardLast4;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMethod() {
        return this.method;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.cardBrand) * 31) + AnonymousClass006.A0G(this.cardLast4)) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass005.A0H(this.method);
    }

    public CheckoutPaymentPresentation(String str, String str2, String str3, String str4) {
        this.cardBrand = str;
        this.cardLast4 = str2;
        this.label = str3;
        this.method = str4;
    }

    public String toString() {
        return super.toString();
    }
}
