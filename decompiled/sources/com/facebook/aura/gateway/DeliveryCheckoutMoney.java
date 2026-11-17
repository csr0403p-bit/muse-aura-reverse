package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.math.BigDecimal;
import java.util.Currency;

/* loaded from: classes2.dex */
public final class DeliveryCheckoutMoney extends C06G {
    public static final int $stable = 8;
    public final BigDecimal amount;
    public final Currency currency;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutMoney) {
                DeliveryCheckoutMoney deliveryCheckoutMoney = (DeliveryCheckoutMoney) obj;
                if (!C7384Etj.areEqual(this.amount, deliveryCheckoutMoney.amount) || !C7384Etj.areEqual(this.currency, deliveryCheckoutMoney.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutMoney copy$default(DeliveryCheckoutMoney deliveryCheckoutMoney, BigDecimal bigDecimal, Currency currency, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = deliveryCheckoutMoney.amount;
        }
        if ((i & 2) != 0) {
            currency = deliveryCheckoutMoney.currency;
        }
        AnonymousClass003.A0u(bigDecimal, currency);
        return new DeliveryCheckoutMoney(bigDecimal, currency);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final Currency component2() {
        return this.currency;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.currency, AnonymousClass005.A0E(this.amount));
    }

    public DeliveryCheckoutMoney(BigDecimal bigDecimal, Currency currency) {
        AnonymousClass003.A0u(bigDecimal, currency);
        this.amount = bigDecimal;
        this.currency = currency;
    }

    public final DeliveryCheckoutMoney copy(BigDecimal bigDecimal, Currency currency) {
        AnonymousClass003.A0u(bigDecimal, currency);
        return new DeliveryCheckoutMoney(bigDecimal, currency);
    }

    public String toString() {
        return super.toString();
    }
}
