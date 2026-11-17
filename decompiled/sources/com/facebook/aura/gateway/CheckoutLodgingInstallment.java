package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CheckoutLodgingInstallment extends C06G {
    public static final int $stable = 0;
    public final CheckoutLodgingMoney amount;
    public final String label;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingInstallment) {
                CheckoutLodgingInstallment checkoutLodgingInstallment = (CheckoutLodgingInstallment) obj;
                if (!C7384Etj.areEqual(this.label, checkoutLodgingInstallment.label) || !C7384Etj.areEqual(this.amount, checkoutLodgingInstallment.amount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingInstallment copy$default(CheckoutLodgingInstallment checkoutLodgingInstallment, String str, CheckoutLodgingMoney checkoutLodgingMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingInstallment.label;
        }
        if ((i & 2) != 0) {
            checkoutLodgingMoney = checkoutLodgingInstallment.amount;
        }
        AnonymousClass003.A0u(str, checkoutLodgingMoney);
        return new CheckoutLodgingInstallment(str, checkoutLodgingMoney);
    }

    public final String component1() {
        return this.label;
    }

    public final CheckoutLodgingMoney component2() {
        return this.amount;
    }

    public final CheckoutLodgingMoney getAmount() {
        return this.amount;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.amount, AnonymousClass001.A0G(this.label));
    }

    public CheckoutLodgingInstallment(String str, CheckoutLodgingMoney checkoutLodgingMoney) {
        AnonymousClass003.A0u(str, checkoutLodgingMoney);
        this.label = str;
        this.amount = checkoutLodgingMoney;
    }

    public final CheckoutLodgingInstallment copy(String str, CheckoutLodgingMoney checkoutLodgingMoney) {
        AnonymousClass003.A0u(str, checkoutLodgingMoney);
        return new CheckoutLodgingInstallment(str, checkoutLodgingMoney);
    }

    public String toString() {
        return super.toString();
    }
}
