package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.time.LocalDate;
import java.util.List;

/* loaded from: classes2.dex */
public final class CheckoutLodgingTrip extends C06G {
    public static final int $stable = 8;
    public final LocalDate checkIn;
    public final LocalDate checkOut;
    public final List<CheckoutLodgingOccupancy> rooms;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingTrip) {
                CheckoutLodgingTrip checkoutLodgingTrip = (CheckoutLodgingTrip) obj;
                if (!C7384Etj.areEqual(this.checkIn, checkoutLodgingTrip.checkIn) || !C7384Etj.areEqual(this.checkOut, checkoutLodgingTrip.checkOut) || !C7384Etj.areEqual(this.rooms, checkoutLodgingTrip.rooms)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutLodgingTrip copy$default(CheckoutLodgingTrip checkoutLodgingTrip, LocalDate localDate, LocalDate localDate2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = checkoutLodgingTrip.checkIn;
        }
        if ((i & 2) != 0) {
            localDate2 = checkoutLodgingTrip.checkOut;
        }
        if ((i & 4) != 0) {
            list = checkoutLodgingTrip.rooms;
        }
        return checkoutLodgingTrip.copy(localDate, localDate2, list);
    }

    public final LocalDate component1() {
        return this.checkIn;
    }

    public final LocalDate component2() {
        return this.checkOut;
    }

    public final List<CheckoutLodgingOccupancy> component3() {
        return this.rooms;
    }

    public final LocalDate getCheckIn() {
        return this.checkIn;
    }

    public final LocalDate getCheckOut() {
        return this.checkOut;
    }

    public final List<CheckoutLodgingOccupancy> getRooms() {
        return this.rooms;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rooms, AnonymousClass005.A0F(this.checkOut, AnonymousClass005.A0E(this.checkIn)));
    }

    public CheckoutLodgingTrip(LocalDate localDate, LocalDate localDate2, List<CheckoutLodgingOccupancy> list) {
        AnonymousClass005.A0x(localDate, localDate2, list);
        this.checkIn = localDate;
        this.checkOut = localDate2;
        this.rooms = list;
    }

    public final CheckoutLodgingTrip copy(LocalDate localDate, LocalDate localDate2, List<CheckoutLodgingOccupancy> list) {
        AnonymousClass005.A0x(localDate, localDate2, list);
        return new CheckoutLodgingTrip(localDate, localDate2, list);
    }

    public String toString() {
        return super.toString();
    }
}
