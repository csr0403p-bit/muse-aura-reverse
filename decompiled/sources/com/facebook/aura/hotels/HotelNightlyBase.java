package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HotelNightlyBase extends C06G {
    public static final int $stable = 0;
    public final HotelMoney amount;
    public final String date;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelNightlyBase) {
                HotelNightlyBase hotelNightlyBase = (HotelNightlyBase) obj;
                if (!C7384Etj.areEqual(this.date, hotelNightlyBase.date) || !C7384Etj.areEqual(this.amount, hotelNightlyBase.amount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelNightlyBase copy$default(HotelNightlyBase hotelNightlyBase, String str, HotelMoney hotelMoney, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelNightlyBase.date;
        }
        if ((i & 2) != 0) {
            hotelMoney = hotelNightlyBase.amount;
        }
        AnonymousClass003.A0u(str, hotelMoney);
        return new HotelNightlyBase(str, hotelMoney);
    }

    public final String component1() {
        return this.date;
    }

    public final HotelMoney component2() {
        return this.amount;
    }

    public final HotelMoney getAmount() {
        return this.amount;
    }

    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.amount, AnonymousClass001.A0G(this.date));
    }

    public HotelNightlyBase(String str, HotelMoney hotelMoney) {
        AnonymousClass003.A0u(str, hotelMoney);
        this.date = str;
        this.amount = hotelMoney;
    }

    public final HotelNightlyBase copy(String str, HotelMoney hotelMoney) {
        AnonymousClass003.A0u(str, hotelMoney);
        return new HotelNightlyBase(str, hotelMoney);
    }

    public String toString() {
        return super.toString();
    }
}
