package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9tJ;
import java.math.BigDecimal;
import java.util.Locale;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelMoneyJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;

    public final class Companion {
        public final C9hr<HotelMoneyJson> serializer() {
            return HotelMoneyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(HotelMoneyJson hotelMoneyJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(hotelMoneyJson.amount)) {
            c9j5.AAV(hotelMoneyJson.amount, c9iZ, 0);
        }
        if (zAfR || !"".equals(hotelMoneyJson.currency)) {
            c9j5.AAV(hotelMoneyJson.currency, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelMoneyJson) {
                HotelMoneyJson hotelMoneyJson = (HotelMoneyJson) obj;
                if (!C7384Etj.areEqual(this.amount, hotelMoneyJson.amount) || !C7384Etj.areEqual(this.currency, hotelMoneyJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HotelMoneyJson copy$default(HotelMoneyJson hotelMoneyJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelMoneyJson.amount;
        }
        if ((i & 2) != 0) {
            str2 = hotelMoneyJson.currency;
        }
        AnonymousClass003.A0u(str, str2);
        return new HotelMoneyJson(str, str2);
    }

    public final String component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.currency, AnonymousClass001.A0G(this.amount));
    }

    public final HotelMoney toDomain() {
        BigDecimal bigDecimalA0x = C9tJ.A0x(AnonymousClass002.A0l(this.amount));
        if (bigDecimalA0x == null) {
            return null;
        }
        String strA0l = AnonymousClass002.A0l(this.currency);
        Locale locale = Locale.ROOT;
        C7384Etj.A0V(locale);
        String upperCase = strA0l.toUpperCase(locale);
        if (HotelResultsJsonKt.getIsoCurrencyCodes().contains(upperCase)) {
            return new HotelMoney(bigDecimalA0x, upperCase);
        }
        return null;
    }

    public HotelMoneyJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.amount = str;
        this.currency = str2;
    }

    public final HotelMoneyJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HotelMoneyJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelMoneyJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.amount = "";
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.currency = "";
        } else {
            this.currency = str2;
        }
    }

    public /* synthetic */ HotelMoneyJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public HotelMoneyJson() {
        this("", "");
    }
}
