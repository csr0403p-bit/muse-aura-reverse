package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class HotelMoney extends C06G {
    public static final int $stable = 0;
    public final BigDecimal amount;
    public final String currency;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelMoney) {
                HotelMoney hotelMoney = (HotelMoney) obj;
                if (!C7384Etj.areEqual(this.amount, hotelMoney.amount) || !C7384Etj.areEqual(this.currency, hotelMoney.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelMoney copy$default(HotelMoney hotelMoney, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = hotelMoney.amount;
        }
        if ((i & 2) != 0) {
            str = hotelMoney.currency;
        }
        AnonymousClass003.A0u(bigDecimal, str);
        return new HotelMoney(bigDecimal, str);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.currency, AnonymousClass005.A0E(this.amount));
    }

    public HotelMoney(BigDecimal bigDecimal, String str) {
        AnonymousClass003.A0u(bigDecimal, str);
        this.amount = bigDecimal;
        this.currency = str;
    }

    public final HotelMoney copy(BigDecimal bigDecimal, String str) {
        AnonymousClass003.A0u(bigDecimal, str);
        return new HotelMoney(bigDecimal, str);
    }

    public String toString() {
        return super.toString();
    }
}
