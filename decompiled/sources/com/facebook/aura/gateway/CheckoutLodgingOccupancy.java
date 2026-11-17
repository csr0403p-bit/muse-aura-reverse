package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutLodgingOccupancy extends C06G {
    public static final int $stable = 8;
    public final int adults;
    public final List<Integer> childAges;

    public CheckoutLodgingOccupancy(int i, List<Integer> list) {
        C7384Etj.A0Y(list, 1);
        this.adults = i;
        this.childAges = list;
    }

    public final CheckoutLodgingOccupancy copy(int i, List<Integer> list) {
        C7384Etj.A0Y(list, 1);
        return new CheckoutLodgingOccupancy(i, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingOccupancy) {
                CheckoutLodgingOccupancy checkoutLodgingOccupancy = (CheckoutLodgingOccupancy) obj;
                if (this.adults != checkoutLodgingOccupancy.adults || !C7384Etj.areEqual(this.childAges, checkoutLodgingOccupancy.childAges)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingOccupancy copy$default(CheckoutLodgingOccupancy checkoutLodgingOccupancy, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = checkoutLodgingOccupancy.adults;
        }
        if ((i2 & 2) != 0) {
            list = checkoutLodgingOccupancy.childAges;
        }
        C7384Etj.A0Y(list, 1);
        return new CheckoutLodgingOccupancy(i, list);
    }

    public final int component1() {
        return this.adults;
    }

    public final List<Integer> component2() {
        return this.childAges;
    }

    public final int getAdults() {
        return this.adults;
    }

    public final List<Integer> getChildAges() {
        return this.childAges;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.childAges, this.adults * 31);
    }

    public String toString() {
        return super.toString();
    }
}
