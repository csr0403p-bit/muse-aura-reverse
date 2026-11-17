package com.facebook.aura.subscription.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class CurrencyAmount extends C06G {
    public static final int $stable = 0;
    public final Integer amount;
    public final String currency;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CurrencyAmount) {
                CurrencyAmount currencyAmount = (CurrencyAmount) obj;
                if (!C7384Etj.areEqual(this.currency, currencyAmount.currency) || !C7384Etj.areEqual(this.amount, currencyAmount.amount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CurrencyAmount copy$default(CurrencyAmount currencyAmount, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyAmount.currency;
        }
        if ((i & 2) != 0) {
            num = currencyAmount.amount;
        }
        return new CurrencyAmount(str, num);
    }

    public final String component1() {
        return this.currency;
    }

    public final Integer component2() {
        return this.amount;
    }

    public final CurrencyAmount copy(String str, Integer num) {
        return new CurrencyAmount(str, num);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.currency) * 31) + C3cH.A02(this.amount);
    }

    public CurrencyAmount(String str, Integer num) {
        this.currency = str;
        this.amount = num;
    }

    public String toString() {
        return super.toString();
    }
}
