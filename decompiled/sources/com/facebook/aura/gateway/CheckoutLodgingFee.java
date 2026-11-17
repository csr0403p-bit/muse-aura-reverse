package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CheckoutLodgingFee extends C06G {
    public static final int $stable = 0;
    public final String amount;
    public final boolean collectedAtProperty;
    public final String currency;
    public final String label;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingFee) {
                CheckoutLodgingFee checkoutLodgingFee = (CheckoutLodgingFee) obj;
                if (!C7384Etj.areEqual(this.label, checkoutLodgingFee.label) || !C7384Etj.areEqual(this.amount, checkoutLodgingFee.amount) || !C7384Etj.areEqual(this.currency, checkoutLodgingFee.currency) || this.collectedAtProperty != checkoutLodgingFee.collectedAtProperty) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingFee copy$default(CheckoutLodgingFee checkoutLodgingFee, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingFee.label;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLodgingFee.amount;
        }
        if ((i & 4) != 0) {
            str3 = checkoutLodgingFee.currency;
        }
        if ((i & 8) != 0) {
            z = checkoutLodgingFee.collectedAtProperty;
        }
        AnonymousClass003.A0u(str, str2);
        return new CheckoutLodgingFee(str, str2, str3, z);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.amount;
    }

    public final String component3() {
        return this.currency;
    }

    public final boolean component4() {
        return this.collectedAtProperty;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final boolean getCollectedAtProperty() {
        return this.collectedAtProperty;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0I(this.amount, AnonymousClass001.A0G(this.label)) + AnonymousClass006.A0G(this.currency)) * 31, this.collectedAtProperty);
    }

    public CheckoutLodgingFee(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.amount = str2;
        this.currency = str3;
        this.collectedAtProperty = z;
    }

    public final CheckoutLodgingFee copy(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new CheckoutLodgingFee(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }
}
