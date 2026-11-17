package com.facebook.aura.rentalcars;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class RentalCarRate extends C06G {
    public static final int $stable = 0;
    public final RentalCarVehicle car;
    public final RentalCarStop dropoff;
    public final RentalCarMileage mileage;
    public final RentalCarPaymentType paymentType;
    public final RentalCarStop pickup;
    public final String rateId;
    public final RentalCarSupplier supplier;
    public final RentalCarMoney total;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarRate) {
                RentalCarRate rentalCarRate = (RentalCarRate) obj;
                if (!C7384Etj.areEqual(this.rateId, rentalCarRate.rateId) || !C7384Etj.areEqual(this.total, rentalCarRate.total) || this.paymentType != rentalCarRate.paymentType || !C7384Etj.areEqual(this.mileage, rentalCarRate.mileage) || !C7384Etj.areEqual(this.supplier, rentalCarRate.supplier) || !C7384Etj.areEqual(this.car, rentalCarRate.car) || !C7384Etj.areEqual(this.pickup, rentalCarRate.pickup) || !C7384Etj.areEqual(this.dropoff, rentalCarRate.dropoff)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarRate copy$default(RentalCarRate rentalCarRate, String str, RentalCarMoney rentalCarMoney, RentalCarPaymentType rentalCarPaymentType, RentalCarMileage rentalCarMileage, RentalCarSupplier rentalCarSupplier, RentalCarVehicle rentalCarVehicle, RentalCarStop rentalCarStop, RentalCarStop rentalCarStop2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalCarRate.rateId;
        }
        if ((i & 2) != 0) {
            rentalCarMoney = rentalCarRate.total;
        }
        if ((i & 4) != 0) {
            rentalCarPaymentType = rentalCarRate.paymentType;
        }
        if ((i & 8) != 0) {
            rentalCarMileage = rentalCarRate.mileage;
        }
        if ((i & 16) != 0) {
            rentalCarSupplier = rentalCarRate.supplier;
        }
        if ((i & 32) != 0) {
            rentalCarVehicle = rentalCarRate.car;
        }
        if ((i & 64) != 0) {
            rentalCarStop = rentalCarRate.pickup;
        }
        if ((i & 128) != 0) {
            rentalCarStop2 = rentalCarRate.dropoff;
        }
        return rentalCarRate.copy(str, rentalCarMoney, rentalCarPaymentType, rentalCarMileage, rentalCarSupplier, rentalCarVehicle, rentalCarStop, rentalCarStop2);
    }

    public final String component1() {
        return this.rateId;
    }

    public final RentalCarMoney component2() {
        return this.total;
    }

    public final RentalCarPaymentType component3() {
        return this.paymentType;
    }

    public final RentalCarMileage component4() {
        return this.mileage;
    }

    public final RentalCarSupplier component5() {
        return this.supplier;
    }

    public final RentalCarVehicle component6() {
        return this.car;
    }

    public final RentalCarStop component7() {
        return this.pickup;
    }

    public final RentalCarStop component8() {
        return this.dropoff;
    }

    public final RentalCarVehicle getCar() {
        return this.car;
    }

    public final RentalCarStop getDropoff() {
        return this.dropoff;
    }

    public final RentalCarMileage getMileage() {
        return this.mileage;
    }

    public final RentalCarPaymentType getPaymentType() {
        return this.paymentType;
    }

    public final RentalCarStop getPickup() {
        return this.pickup;
    }

    public final String getRateId() {
        return this.rateId;
    }

    public final RentalCarSupplier getSupplier() {
        return this.supplier;
    }

    public final RentalCarMoney getTotal() {
        return this.total;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.dropoff, AnonymousClass005.A0F(this.pickup, AnonymousClass005.A0F(this.car, AnonymousClass005.A0F(this.supplier, (AnonymousClass005.A0F(this.paymentType, AnonymousClass005.A0F(this.total, AnonymousClass001.A0G(this.rateId))) + AnonymousClass006.A0D(this.mileage)) * 31))));
    }

    public RentalCarRate(String str, RentalCarMoney rentalCarMoney, RentalCarPaymentType rentalCarPaymentType, RentalCarMileage rentalCarMileage, RentalCarSupplier rentalCarSupplier, RentalCarVehicle rentalCarVehicle, RentalCarStop rentalCarStop, RentalCarStop rentalCarStop2) {
        AnonymousClass005.A0x(str, rentalCarMoney, rentalCarPaymentType);
        C7384Etj.A0Y(rentalCarSupplier, 4);
        AnonymousClass005.A0z(rentalCarVehicle, rentalCarStop, rentalCarStop2);
        this.rateId = str;
        this.total = rentalCarMoney;
        this.paymentType = rentalCarPaymentType;
        this.mileage = rentalCarMileage;
        this.supplier = rentalCarSupplier;
        this.car = rentalCarVehicle;
        this.pickup = rentalCarStop;
        this.dropoff = rentalCarStop2;
    }

    public final RentalCarRate copy(String str, RentalCarMoney rentalCarMoney, RentalCarPaymentType rentalCarPaymentType, RentalCarMileage rentalCarMileage, RentalCarSupplier rentalCarSupplier, RentalCarVehicle rentalCarVehicle, RentalCarStop rentalCarStop, RentalCarStop rentalCarStop2) {
        AnonymousClass005.A0x(str, rentalCarMoney, rentalCarPaymentType);
        C7384Etj.A0Y(rentalCarSupplier, 4);
        AnonymousClass005.A0z(rentalCarVehicle, rentalCarStop, rentalCarStop2);
        return new RentalCarRate(str, rentalCarMoney, rentalCarPaymentType, rentalCarMileage, rentalCarSupplier, rentalCarVehicle, rentalCarStop, rentalCarStop2);
    }

    public String toString() {
        return super.toString();
    }
}
