package com.facebook.aura.agentpermission;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class FlightCheckoutPassengerBag extends C06G {
    public static final int $stable = 0;
    public final int quantity;
    public final FlightCheckoutBagType type;

    public FlightCheckoutPassengerBag(FlightCheckoutBagType flightCheckoutBagType, int i) {
        C7384Etj.A0Y(flightCheckoutBagType, 0);
        this.type = flightCheckoutBagType;
        this.quantity = i;
    }

    public final FlightCheckoutPassengerBag copy(FlightCheckoutBagType flightCheckoutBagType, int i) {
        C7384Etj.A0Y(flightCheckoutBagType, 0);
        return new FlightCheckoutPassengerBag(flightCheckoutBagType, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutPassengerBag) {
                FlightCheckoutPassengerBag flightCheckoutPassengerBag = (FlightCheckoutPassengerBag) obj;
                if (this.type != flightCheckoutPassengerBag.type || this.quantity != flightCheckoutPassengerBag.quantity) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutPassengerBag copy$default(FlightCheckoutPassengerBag flightCheckoutPassengerBag, FlightCheckoutBagType flightCheckoutBagType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            flightCheckoutBagType = flightCheckoutPassengerBag.type;
        }
        if ((i2 & 2) != 0) {
            i = flightCheckoutPassengerBag.quantity;
        }
        C7384Etj.A0Y(flightCheckoutBagType, 0);
        return new FlightCheckoutPassengerBag(flightCheckoutBagType, i);
    }

    public final FlightCheckoutBagType component1() {
        return this.type;
    }

    public final int component2() {
        return this.quantity;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final FlightCheckoutBagType getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.type) + this.quantity;
    }

    public String toString() {
        return super.toString();
    }
}
