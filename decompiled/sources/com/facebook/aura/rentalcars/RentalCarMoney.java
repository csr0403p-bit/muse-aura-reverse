package com.facebook.aura.rentalcars;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class RentalCarMoney extends C06G {
    public static final int $stable = 0;
    public final BigDecimal amount;
    public final String currency;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarMoney) {
                RentalCarMoney rentalCarMoney = (RentalCarMoney) obj;
                if (!C7384Etj.areEqual(this.amount, rentalCarMoney.amount) || !C7384Etj.areEqual(this.currency, rentalCarMoney.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarMoney copy$default(RentalCarMoney rentalCarMoney, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = rentalCarMoney.amount;
        }
        if ((i & 2) != 0) {
            str = rentalCarMoney.currency;
        }
        AnonymousClass003.A0u(bigDecimal, str);
        return new RentalCarMoney(bigDecimal, str);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.currency, AnonymousClass005.A0E(this.amount));
    }

    public RentalCarMoney(BigDecimal bigDecimal, String str) {
        AnonymousClass003.A0u(bigDecimal, str);
        this.amount = bigDecimal;
        this.currency = str;
    }

    public final RentalCarMoney copy(BigDecimal bigDecimal, String str) {
        AnonymousClass003.A0u(bigDecimal, str);
        return new RentalCarMoney(bigDecimal, str);
    }

    public String toString() {
        return super.toString();
    }
}
