package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.time.LocalDate;

/* loaded from: classes2.dex */
public final class CheckoutLodgingNightlyRate extends C06G {
    public static final int $stable = 8;
    public final String amount;
    public final String currency;
    public final LocalDate stayDate;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingNightlyRate) {
                CheckoutLodgingNightlyRate checkoutLodgingNightlyRate = (CheckoutLodgingNightlyRate) obj;
                if (!C7384Etj.areEqual(this.stayDate, checkoutLodgingNightlyRate.stayDate) || !C7384Etj.areEqual(this.amount, checkoutLodgingNightlyRate.amount) || !C7384Etj.areEqual(this.currency, checkoutLodgingNightlyRate.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingNightlyRate copy$default(CheckoutLodgingNightlyRate checkoutLodgingNightlyRate, LocalDate localDate, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = checkoutLodgingNightlyRate.stayDate;
        }
        if ((i & 2) != 0) {
            str = checkoutLodgingNightlyRate.amount;
        }
        if ((i & 4) != 0) {
            str2 = checkoutLodgingNightlyRate.currency;
        }
        return checkoutLodgingNightlyRate.copy(localDate, str, str2);
    }

    public final LocalDate component1() {
        return this.stayDate;
    }

    public final String component2() {
        return this.amount;
    }

    public final String component3() {
        return this.currency;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final LocalDate getStayDate() {
        return this.stayDate;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.amount, AnonymousClass005.A0E(this.stayDate)) + AnonymousClass006.A0G(this.currency);
    }

    public CheckoutLodgingNightlyRate(LocalDate localDate, String str, String str2) {
        AnonymousClass003.A0u(localDate, str);
        this.stayDate = localDate;
        this.amount = str;
        this.currency = str2;
    }

    public final CheckoutLodgingNightlyRate copy(LocalDate localDate, String str, String str2) {
        AnonymousClass003.A0u(localDate, str);
        return new CheckoutLodgingNightlyRate(localDate, str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
