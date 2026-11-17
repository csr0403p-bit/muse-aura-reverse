package com.facebook.aura.hotels;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelPayment extends C06G {
    public static final int $stable = 0;
    public final HotelMoney dueAtProperty;
    public final HotelMoney dueLater;
    public final HotelMoney dueNow;
    public final Boolean fullDepositUponBooking;
    public final AHD<HotelInstallment> installments;
    public final String method;
    public final String timing;

    public HotelPayment(String str, String str2, Boolean bool, HotelMoney hotelMoney, HotelMoney hotelMoney2, HotelMoney hotelMoney3, AHD<HotelInstallment> ahd) {
        C7384Etj.A0Y(ahd, 6);
        this.method = str;
        this.timing = str2;
        this.fullDepositUponBooking = bool;
        this.dueNow = hotelMoney;
        this.dueLater = hotelMoney2;
        this.dueAtProperty = hotelMoney3;
        this.installments = ahd;
    }

    public final HotelPayment copy(String str, String str2, Boolean bool, HotelMoney hotelMoney, HotelMoney hotelMoney2, HotelMoney hotelMoney3, AHD<HotelInstallment> ahd) {
        C7384Etj.A0Y(ahd, 6);
        return new HotelPayment(str, str2, bool, hotelMoney, hotelMoney2, hotelMoney3, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelPayment) {
                HotelPayment hotelPayment = (HotelPayment) obj;
                if (!C7384Etj.areEqual(this.method, hotelPayment.method) || !C7384Etj.areEqual(this.timing, hotelPayment.timing) || !C7384Etj.areEqual(this.fullDepositUponBooking, hotelPayment.fullDepositUponBooking) || !C7384Etj.areEqual(this.dueNow, hotelPayment.dueNow) || !C7384Etj.areEqual(this.dueLater, hotelPayment.dueLater) || !C7384Etj.areEqual(this.dueAtProperty, hotelPayment.dueAtProperty) || !C7384Etj.areEqual(this.installments, hotelPayment.installments)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelPayment copy$default(HotelPayment hotelPayment, String str, String str2, Boolean bool, HotelMoney hotelMoney, HotelMoney hotelMoney2, HotelMoney hotelMoney3, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelPayment.method;
        }
        if ((i & 2) != 0) {
            str2 = hotelPayment.timing;
        }
        if ((i & 4) != 0) {
            bool = hotelPayment.fullDepositUponBooking;
        }
        if ((i & 8) != 0) {
            hotelMoney = hotelPayment.dueNow;
        }
        if ((i & 16) != 0) {
            hotelMoney2 = hotelPayment.dueLater;
        }
        if ((i & 32) != 0) {
            hotelMoney3 = hotelPayment.dueAtProperty;
        }
        if ((i & 64) != 0) {
            ahd = hotelPayment.installments;
        }
        return hotelPayment.copy(str, str2, bool, hotelMoney, hotelMoney2, hotelMoney3, ahd);
    }

    public final String component1() {
        return this.method;
    }

    public final String component2() {
        return this.timing;
    }

    public final Boolean component3() {
        return this.fullDepositUponBooking;
    }

    public final HotelMoney component4() {
        return this.dueNow;
    }

    public final HotelMoney component5() {
        return this.dueLater;
    }

    public final HotelMoney component6() {
        return this.dueAtProperty;
    }

    public final AHD<HotelInstallment> component7() {
        return this.installments;
    }

    public final HotelMoney getDueAtProperty() {
        return this.dueAtProperty;
    }

    public final HotelMoney getDueLater() {
        return this.dueLater;
    }

    public final HotelMoney getDueNow() {
        return this.dueNow;
    }

    public final Boolean getFullDepositUponBooking() {
        return this.fullDepositUponBooking;
    }

    public final AHD<HotelInstallment> getInstallments() {
        return this.installments;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getTiming() {
        return this.timing;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.installments, ((((((((((AnonymousClass006.A0G(this.method) * 31) + AnonymousClass006.A0G(this.timing)) * 31) + AnonymousClass006.A0D(this.fullDepositUponBooking)) * 31) + AnonymousClass006.A0D(this.dueNow)) * 31) + AnonymousClass006.A0D(this.dueLater)) * 31) + C3cH.A02(this.dueAtProperty)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
