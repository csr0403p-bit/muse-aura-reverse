package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CheckoutLodging extends C06G {
    public static final int $stable = 8;
    public final CheckoutLodgingCancellation cancellation;
    public final String location;
    public final CheckoutLodgingPayment payment;
    public final CheckoutLodgingPrice price;
    public final CheckoutLodgingRoom room;
    public final CheckoutLodgingTaxesDisclosure taxesDisclosure;
    public final CheckoutLodgingTrip trip;

    public static /* synthetic */ CheckoutLodging copy$default(CheckoutLodging checkoutLodging, String str, CheckoutLodgingTrip checkoutLodgingTrip, CheckoutLodgingRoom checkoutLodgingRoom, CheckoutLodgingCancellation checkoutLodgingCancellation, CheckoutLodgingPrice checkoutLodgingPrice, CheckoutLodgingPayment checkoutLodgingPayment, CheckoutLodgingTaxesDisclosure checkoutLodgingTaxesDisclosure, int i, Object obj) {
        String str2 = str;
        CheckoutLodgingTrip checkoutLodgingTrip2 = checkoutLodgingTrip;
        CheckoutLodgingRoom checkoutLodgingRoom2 = checkoutLodgingRoom;
        CheckoutLodgingCancellation checkoutLodgingCancellation2 = checkoutLodgingCancellation;
        CheckoutLodgingPrice checkoutLodgingPrice2 = checkoutLodgingPrice;
        CheckoutLodgingPayment checkoutLodgingPayment2 = checkoutLodgingPayment;
        CheckoutLodgingTaxesDisclosure checkoutLodgingTaxesDisclosure2 = checkoutLodgingTaxesDisclosure;
        if ((i & 1) != 0) {
            str2 = checkoutLodging.location;
        }
        if ((i & 2) != 0) {
            checkoutLodgingTrip2 = checkoutLodging.trip;
        }
        if ((i & 4) != 0) {
            checkoutLodgingRoom2 = checkoutLodging.room;
        }
        if ((i & 8) != 0) {
            checkoutLodgingCancellation2 = checkoutLodging.cancellation;
        }
        if ((i & 16) != 0) {
            checkoutLodgingPrice2 = checkoutLodging.price;
        }
        if ((i & 32) != 0) {
            checkoutLodgingPayment2 = checkoutLodging.payment;
        }
        if ((i & 64) != 0) {
            checkoutLodgingTaxesDisclosure2 = checkoutLodging.taxesDisclosure;
        }
        return new CheckoutLodging(str2, checkoutLodgingTrip2, checkoutLodgingRoom2, checkoutLodgingCancellation2, checkoutLodgingPrice2, checkoutLodgingPayment2, checkoutLodgingTaxesDisclosure2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodging) {
                CheckoutLodging checkoutLodging = (CheckoutLodging) obj;
                if (!C7384Etj.areEqual(this.location, checkoutLodging.location) || !C7384Etj.areEqual(this.trip, checkoutLodging.trip) || !C7384Etj.areEqual(this.room, checkoutLodging.room) || !C7384Etj.areEqual(this.cancellation, checkoutLodging.cancellation) || !C7384Etj.areEqual(this.price, checkoutLodging.price) || !C7384Etj.areEqual(this.payment, checkoutLodging.payment) || !C7384Etj.areEqual(this.taxesDisclosure, checkoutLodging.taxesDisclosure)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.location;
    }

    public final CheckoutLodgingTrip component2() {
        return this.trip;
    }

    public final CheckoutLodgingRoom component3() {
        return this.room;
    }

    public final CheckoutLodgingCancellation component4() {
        return this.cancellation;
    }

    public final CheckoutLodgingPrice component5() {
        return this.price;
    }

    public final CheckoutLodgingPayment component6() {
        return this.payment;
    }

    public final CheckoutLodgingTaxesDisclosure component7() {
        return this.taxesDisclosure;
    }

    public final CheckoutLodging copy(String str, CheckoutLodgingTrip checkoutLodgingTrip, CheckoutLodgingRoom checkoutLodgingRoom, CheckoutLodgingCancellation checkoutLodgingCancellation, CheckoutLodgingPrice checkoutLodgingPrice, CheckoutLodgingPayment checkoutLodgingPayment, CheckoutLodgingTaxesDisclosure checkoutLodgingTaxesDisclosure) {
        return new CheckoutLodging(str, checkoutLodgingTrip, checkoutLodgingRoom, checkoutLodgingCancellation, checkoutLodgingPrice, checkoutLodgingPayment, checkoutLodgingTaxesDisclosure);
    }

    public final CheckoutLodgingCancellation getCancellation() {
        return this.cancellation;
    }

    public final String getLocation() {
        return this.location;
    }

    public final CheckoutLodgingPayment getPayment() {
        return this.payment;
    }

    public final CheckoutLodgingPrice getPrice() {
        return this.price;
    }

    public final CheckoutLodgingRoom getRoom() {
        return this.room;
    }

    public final CheckoutLodgingTaxesDisclosure getTaxesDisclosure() {
        return this.taxesDisclosure;
    }

    public final CheckoutLodgingTrip getTrip() {
        return this.trip;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass006.A0G(this.location) * 31) + AnonymousClass006.A0D(this.trip)) * 31) + AnonymousClass006.A0D(this.room)) * 31) + AnonymousClass006.A0D(this.cancellation)) * 31) + AnonymousClass006.A0D(this.price)) * 31) + AnonymousClass006.A0D(this.payment)) * 31) + C3cH.A02(this.taxesDisclosure);
    }

    public CheckoutLodging(String str, CheckoutLodgingTrip checkoutLodgingTrip, CheckoutLodgingRoom checkoutLodgingRoom, CheckoutLodgingCancellation checkoutLodgingCancellation, CheckoutLodgingPrice checkoutLodgingPrice, CheckoutLodgingPayment checkoutLodgingPayment, CheckoutLodgingTaxesDisclosure checkoutLodgingTaxesDisclosure) {
        this.location = str;
        this.trip = checkoutLodgingTrip;
        this.room = checkoutLodgingRoom;
        this.cancellation = checkoutLodgingCancellation;
        this.price = checkoutLodgingPrice;
        this.payment = checkoutLodgingPayment;
        this.taxesDisclosure = checkoutLodgingTaxesDisclosure;
    }

    public String toString() {
        return super.toString();
    }
}
