package com.facebook.aura.flights;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class FlightFarePrice extends C06G {
    public static final int $stable = 0;
    public final String amount;
    public final boolean isFromPrice;
    public final boolean isPerPerson;

    public FlightFarePrice(String str, boolean z, boolean z2) {
        C7384Etj.A0Y(str, 0);
        this.amount = str;
        this.isPerPerson = z;
        this.isFromPrice = z2;
    }

    public final FlightFarePrice copy(String str, boolean z, boolean z2) {
        C7384Etj.A0Y(str, 0);
        return new FlightFarePrice(str, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightFarePrice) {
                FlightFarePrice flightFarePrice = (FlightFarePrice) obj;
                if (!C7384Etj.areEqual(this.amount, flightFarePrice.amount) || this.isPerPerson != flightFarePrice.isPerPerson || this.isFromPrice != flightFarePrice.isFromPrice) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightFarePrice copy$default(FlightFarePrice flightFarePrice, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightFarePrice.amount;
        }
        if ((i & 2) != 0) {
            z = flightFarePrice.isPerPerson;
        }
        if ((i & 4) != 0) {
            z2 = flightFarePrice.isFromPrice;
        }
        return flightFarePrice.copy(str, z, z2);
    }

    public final String component1() {
        return this.amount;
    }

    public final boolean component2() {
        return this.isPerPerson;
    }

    public final boolean component3() {
        return this.isFromPrice;
    }

    public final String getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass001.A0G(this.amount), this.isPerPerson), this.isFromPrice);
    }

    public final boolean isFromPrice() {
        return this.isFromPrice;
    }

    public final boolean isPerPerson() {
        return this.isPerPerson;
    }

    public String toString() {
        return super.toString();
    }
}
