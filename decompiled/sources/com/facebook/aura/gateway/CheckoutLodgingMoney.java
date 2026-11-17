package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CheckoutLodgingMoney extends C06G {
    public static final int $stable = 0;
    public final String amount;
    public final String currency;

    public CheckoutLodgingMoney(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.amount = str;
        this.currency = str2;
    }

    public final CheckoutLodgingMoney copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new CheckoutLodgingMoney(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingMoney) {
                CheckoutLodgingMoney checkoutLodgingMoney = (CheckoutLodgingMoney) obj;
                if (!C7384Etj.areEqual(this.amount, checkoutLodgingMoney.amount) || !C7384Etj.areEqual(this.currency, checkoutLodgingMoney.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingMoney copy$default(CheckoutLodgingMoney checkoutLodgingMoney, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingMoney.amount;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLodgingMoney.currency;
        }
        C7384Etj.A0Y(str, 0);
        return new CheckoutLodgingMoney(str, str2);
    }

    public final String component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.amount) + AnonymousClass006.A0G(this.currency);
    }

    public String toString() {
        return super.toString();
    }
}
