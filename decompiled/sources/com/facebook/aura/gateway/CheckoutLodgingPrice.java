package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutLodgingPrice extends C06G {
    public static final int $stable = 0;
    public final List<CheckoutLodgingFee> fees;
    public final List<CheckoutLodgingNightlyRate> nightlyBaseRates;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingPrice) {
                CheckoutLodgingPrice checkoutLodgingPrice = (CheckoutLodgingPrice) obj;
                if (!C7384Etj.areEqual(this.fees, checkoutLodgingPrice.fees) || !C7384Etj.areEqual(this.nightlyBaseRates, checkoutLodgingPrice.nightlyBaseRates)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingPrice copy$default(CheckoutLodgingPrice checkoutLodgingPrice, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = checkoutLodgingPrice.fees;
        }
        if ((i & 2) != 0) {
            list2 = checkoutLodgingPrice.nightlyBaseRates;
        }
        AnonymousClass003.A0u(list, list2);
        return new CheckoutLodgingPrice(list, list2);
    }

    public final List<CheckoutLodgingFee> component1() {
        return this.fees;
    }

    public final List<CheckoutLodgingNightlyRate> component2() {
        return this.nightlyBaseRates;
    }

    public final List<CheckoutLodgingFee> getFees() {
        return this.fees;
    }

    public final List<CheckoutLodgingNightlyRate> getNightlyBaseRates() {
        return this.nightlyBaseRates;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.nightlyBaseRates, AnonymousClass005.A0E(this.fees));
    }

    public CheckoutLodgingPrice(List<CheckoutLodgingFee> list, List<CheckoutLodgingNightlyRate> list2) {
        AnonymousClass003.A0u(list, list2);
        this.fees = list;
        this.nightlyBaseRates = list2;
    }

    public final CheckoutLodgingPrice copy(List<CheckoutLodgingFee> list, List<CheckoutLodgingNightlyRate> list2) {
        AnonymousClass003.A0u(list, list2);
        return new CheckoutLodgingPrice(list, list2);
    }

    public String toString() {
        return super.toString();
    }
}
