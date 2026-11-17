package com.facebook.aura.agentpermission;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;

/* loaded from: classes2.dex */
public final class FlightCheckoutPassengerUiState extends C06G {
    public static final int $stable = HatchAgentPermissionsRepository.FlightCheckoutPassenger.$stable;
    public final List<FlightCheckoutPassengerBag> bags;
    public final boolean bagsUnavailable;
    public final HatchAgentPermissionsRepository.FlightCheckoutPassenger passenger;
    public final List<FlightCheckoutPassengerSeat> seats;
    public final boolean seatsUnavailable;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutPassengerUiState) {
                FlightCheckoutPassengerUiState flightCheckoutPassengerUiState = (FlightCheckoutPassengerUiState) obj;
                if (!C7384Etj.areEqual(this.passenger, flightCheckoutPassengerUiState.passenger) || !C7384Etj.areEqual(this.seats, flightCheckoutPassengerUiState.seats) || !C7384Etj.areEqual(this.bags, flightCheckoutPassengerUiState.bags) || this.seatsUnavailable != flightCheckoutPassengerUiState.seatsUnavailable || this.bagsUnavailable != flightCheckoutPassengerUiState.bagsUnavailable) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightCheckoutPassengerUiState copy$default(FlightCheckoutPassengerUiState flightCheckoutPassengerUiState, HatchAgentPermissionsRepository.FlightCheckoutPassenger flightCheckoutPassenger, List list, List list2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            flightCheckoutPassenger = flightCheckoutPassengerUiState.passenger;
        }
        if ((i & 2) != 0) {
            list = flightCheckoutPassengerUiState.seats;
        }
        if ((i & 4) != 0) {
            list2 = flightCheckoutPassengerUiState.bags;
        }
        if ((i & 8) != 0) {
            z = flightCheckoutPassengerUiState.seatsUnavailable;
        }
        if ((i & 16) != 0) {
            z2 = flightCheckoutPassengerUiState.bagsUnavailable;
        }
        return flightCheckoutPassengerUiState.copy(flightCheckoutPassenger, list, list2, z, z2);
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutPassenger component1() {
        return this.passenger;
    }

    public final List<FlightCheckoutPassengerSeat> component2() {
        return this.seats;
    }

    public final List<FlightCheckoutPassengerBag> component3() {
        return this.bags;
    }

    public final boolean component4() {
        return this.seatsUnavailable;
    }

    public final boolean component5() {
        return this.bagsUnavailable;
    }

    public final List<FlightCheckoutPassengerBag> getBags() {
        return this.bags;
    }

    public final boolean getBagsUnavailable() {
        return this.bagsUnavailable;
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutPassenger getPassenger() {
        return this.passenger;
    }

    public final List<FlightCheckoutPassengerSeat> getSeats() {
        return this.seats;
    }

    public final boolean getSeatsUnavailable() {
        return this.seatsUnavailable;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0F(this.bags, AnonymousClass005.A0F(this.seats, AnonymousClass005.A0E(this.passenger))), this.seatsUnavailable), this.bagsUnavailable);
    }

    public FlightCheckoutPassengerUiState(HatchAgentPermissionsRepository.FlightCheckoutPassenger flightCheckoutPassenger, List<FlightCheckoutPassengerSeat> list, List<FlightCheckoutPassengerBag> list2, boolean z, boolean z2) {
        AnonymousClass005.A0x(flightCheckoutPassenger, list, list2);
        this.passenger = flightCheckoutPassenger;
        this.seats = list;
        this.bags = list2;
        this.seatsUnavailable = z;
        this.bagsUnavailable = z2;
    }

    public final FlightCheckoutPassengerUiState copy(HatchAgentPermissionsRepository.FlightCheckoutPassenger flightCheckoutPassenger, List<FlightCheckoutPassengerSeat> list, List<FlightCheckoutPassengerBag> list2, boolean z, boolean z2) {
        AnonymousClass005.A0x(flightCheckoutPassenger, list, list2);
        return new FlightCheckoutPassengerUiState(flightCheckoutPassenger, list, list2, z, z2);
    }

    public String toString() {
        return super.toString();
    }
}
