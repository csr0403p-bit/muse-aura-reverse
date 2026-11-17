package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutLodgingPayment extends C06G {
    public static final int $stable = 8;
    public final CheckoutLodgingMoney dueAtProperty;
    public final List<CheckoutLodgingInstallment> installments;

    public CheckoutLodgingPayment(CheckoutLodgingMoney checkoutLodgingMoney, List<CheckoutLodgingInstallment> list) {
        C7384Etj.A0Y(list, 1);
        this.dueAtProperty = checkoutLodgingMoney;
        this.installments = list;
    }

    public final CheckoutLodgingPayment copy(CheckoutLodgingMoney checkoutLodgingMoney, List<CheckoutLodgingInstallment> list) {
        C7384Etj.A0Y(list, 1);
        return new CheckoutLodgingPayment(checkoutLodgingMoney, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingPayment) {
                CheckoutLodgingPayment checkoutLodgingPayment = (CheckoutLodgingPayment) obj;
                if (!C7384Etj.areEqual(this.dueAtProperty, checkoutLodgingPayment.dueAtProperty) || !C7384Etj.areEqual(this.installments, checkoutLodgingPayment.installments)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingPayment copy$default(CheckoutLodgingPayment checkoutLodgingPayment, CheckoutLodgingMoney checkoutLodgingMoney, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutLodgingMoney = checkoutLodgingPayment.dueAtProperty;
        }
        if ((i & 2) != 0) {
            list = checkoutLodgingPayment.installments;
        }
        C7384Etj.A0Y(list, 1);
        return new CheckoutLodgingPayment(checkoutLodgingMoney, list);
    }

    public final CheckoutLodgingMoney component1() {
        return this.dueAtProperty;
    }

    public final List<CheckoutLodgingInstallment> component2() {
        return this.installments;
    }

    public final CheckoutLodgingMoney getDueAtProperty() {
        return this.dueAtProperty;
    }

    public final List<CheckoutLodgingInstallment> getInstallments() {
        return this.installments;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.installments, AnonymousClass006.A0D(this.dueAtProperty) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
