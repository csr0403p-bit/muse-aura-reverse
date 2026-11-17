package com.facebook.aura.hotels;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HotelFee extends C06G {
    public static final int $stable = 0;
    public final HotelMoney amount;
    public final boolean isPropertyFee;
    public final boolean isTaxesAndFees;
    public final String label;

    public HotelFee(String str, boolean z, boolean z2, HotelMoney hotelMoney) {
        C7384Etj.A0Y(hotelMoney, 3);
        this.label = str;
        this.isPropertyFee = z;
        this.isTaxesAndFees = z2;
        this.amount = hotelMoney;
    }

    public final HotelFee copy(String str, boolean z, boolean z2, HotelMoney hotelMoney) {
        C7384Etj.A0Y(hotelMoney, 3);
        return new HotelFee(str, z, z2, hotelMoney);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelFee) {
                HotelFee hotelFee = (HotelFee) obj;
                if (!C7384Etj.areEqual(this.label, hotelFee.label) || this.isPropertyFee != hotelFee.isPropertyFee || this.isTaxesAndFees != hotelFee.isTaxesAndFees || !C7384Etj.areEqual(this.amount, hotelFee.amount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelFee copy$default(HotelFee hotelFee, String str, boolean z, boolean z2, HotelMoney hotelMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelFee.label;
        }
        if ((i & 2) != 0) {
            z = hotelFee.isPropertyFee;
        }
        if ((i & 4) != 0) {
            z2 = hotelFee.isTaxesAndFees;
        }
        if ((i & 8) != 0) {
            hotelMoney = hotelFee.amount;
        }
        C7384Etj.A0Y(hotelMoney, 3);
        return new HotelFee(str, z, z2, hotelMoney);
    }

    public final String component1() {
        return this.label;
    }

    public final boolean component2() {
        return this.isPropertyFee;
    }

    public final boolean component3() {
        return this.isTaxesAndFees;
    }

    public final HotelMoney component4() {
        return this.amount;
    }

    public final HotelMoney getAmount() {
        return this.amount;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.amount, C0KA.A01(C0KA.A01(AnonymousClass006.A0G(this.label) * 31, this.isPropertyFee), this.isTaxesAndFees));
    }

    public final boolean isPropertyFee() {
        return this.isPropertyFee;
    }

    public final boolean isTaxesAndFees() {
        return this.isTaxesAndFees;
    }

    public String toString() {
        return super.toString();
    }
}
