package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelInstallment extends C06G {
    public static final int $stable = 0;
    public final HotelMoney amount;
    public final String label;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelInstallment) {
                HotelInstallment hotelInstallment = (HotelInstallment) obj;
                if (!C7384Etj.areEqual(this.label, hotelInstallment.label) || !C7384Etj.areEqual(this.amount, hotelInstallment.amount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelInstallment copy$default(HotelInstallment hotelInstallment, String str, HotelMoney hotelMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelInstallment.label;
        }
        if ((i & 2) != 0) {
            hotelMoney = hotelInstallment.amount;
        }
        AnonymousClass003.A0u(str, hotelMoney);
        return new HotelInstallment(str, hotelMoney);
    }

    public final String component1() {
        return this.label;
    }

    public final HotelMoney component2() {
        return this.amount;
    }

    public final HotelMoney getAmount() {
        return this.amount;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.amount, AnonymousClass001.A0G(this.label));
    }

    public HotelInstallment(String str, HotelMoney hotelMoney) {
        AnonymousClass003.A0u(str, hotelMoney);
        this.label = str;
        this.amount = hotelMoney;
    }

    public final HotelInstallment copy(String str, HotelMoney hotelMoney) {
        AnonymousClass003.A0u(str, hotelMoney);
        return new HotelInstallment(str, hotelMoney);
    }

    public String toString() {
        return super.toString();
    }
}
