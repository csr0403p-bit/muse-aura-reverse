package com.facebook.aura.hotels;

import X.AHD;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelPrice extends C06G {
    public static final int $stable = 0;
    public final HotelMoney amountBeforePropertyFees;
    public final HotelMoney baseRate;
    public final HotelMoney mandatoryPropertyFees;
    public final AHD<HotelFee> taxAndFeeRows;
    public final HotelMoney total;

    public HotelPrice(HotelMoney hotelMoney, HotelMoney hotelMoney2, HotelMoney hotelMoney3, HotelMoney hotelMoney4, AHD<HotelFee> ahd) {
        AnonymousClass002.A1C(hotelMoney, 0, ahd);
        this.total = hotelMoney;
        this.baseRate = hotelMoney2;
        this.amountBeforePropertyFees = hotelMoney3;
        this.mandatoryPropertyFees = hotelMoney4;
        this.taxAndFeeRows = ahd;
    }

    public final HotelPrice copy(HotelMoney hotelMoney, HotelMoney hotelMoney2, HotelMoney hotelMoney3, HotelMoney hotelMoney4, AHD<HotelFee> ahd) {
        AnonymousClass002.A1C(hotelMoney, 0, ahd);
        return new HotelPrice(hotelMoney, hotelMoney2, hotelMoney3, hotelMoney4, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelPrice) {
                HotelPrice hotelPrice = (HotelPrice) obj;
                if (!C7384Etj.areEqual(this.total, hotelPrice.total) || !C7384Etj.areEqual(this.baseRate, hotelPrice.baseRate) || !C7384Etj.areEqual(this.amountBeforePropertyFees, hotelPrice.amountBeforePropertyFees) || !C7384Etj.areEqual(this.mandatoryPropertyFees, hotelPrice.mandatoryPropertyFees) || !C7384Etj.areEqual(this.taxAndFeeRows, hotelPrice.taxAndFeeRows)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelPrice copy$default(HotelPrice hotelPrice, HotelMoney hotelMoney, HotelMoney hotelMoney2, HotelMoney hotelMoney3, HotelMoney hotelMoney4, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelMoney = hotelPrice.total;
        }
        if ((i & 2) != 0) {
            hotelMoney2 = hotelPrice.baseRate;
        }
        if ((i & 4) != 0) {
            hotelMoney3 = hotelPrice.amountBeforePropertyFees;
        }
        if ((i & 8) != 0) {
            hotelMoney4 = hotelPrice.mandatoryPropertyFees;
        }
        if ((i & 16) != 0) {
            ahd = hotelPrice.taxAndFeeRows;
        }
        return hotelPrice.copy(hotelMoney, hotelMoney2, hotelMoney3, hotelMoney4, ahd);
    }

    public final HotelMoney component1() {
        return this.total;
    }

    public final HotelMoney component2() {
        return this.baseRate;
    }

    public final HotelMoney component3() {
        return this.amountBeforePropertyFees;
    }

    public final HotelMoney component4() {
        return this.mandatoryPropertyFees;
    }

    public final AHD<HotelFee> component5() {
        return this.taxAndFeeRows;
    }

    public final HotelMoney getAmountBeforePropertyFees() {
        return this.amountBeforePropertyFees;
    }

    public final HotelMoney getBaseRate() {
        return this.baseRate;
    }

    public final HotelMoney getMandatoryPropertyFees() {
        return this.mandatoryPropertyFees;
    }

    public final AHD<HotelFee> getTaxAndFeeRows() {
        return this.taxAndFeeRows;
    }

    public final HotelMoney getTotal() {
        return this.total;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.taxAndFeeRows, (((((AnonymousClass005.A0E(this.total) + AnonymousClass006.A0D(this.baseRate)) * 31) + AnonymousClass006.A0D(this.amountBeforePropertyFees)) * 31) + C3cH.A02(this.mandatoryPropertyFees)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
