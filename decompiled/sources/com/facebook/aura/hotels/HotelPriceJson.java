package com.facebook.aura.hotels;

import X.AGI;
import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelPriceJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable;
    public static final Companion Companion = new Companion();
    public final HotelMoneyJson amount_before_property_fees;
    public final HotelMoneyJson base_rate;
    public final HotelMoneyJson mandatory_property_fees;
    public final List<HotelTaxAndFeeJson> taxes_and_fees;
    public final HotelMoneyJson total;

    public final class Companion {
        public final C9hr<HotelPriceJson> serializer() {
            return HotelPriceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        int i = HotelMoneyJson.$stable;
        $stable = i | i | i | i;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(C79.A01, HotelPriceJson$Companion$$childSerializers$1.INSTANCE), null, null};
    }

    public HotelPriceJson(HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List<HotelTaxAndFeeJson> list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4) {
        C7384Etj.A0Y(list, 2);
        this.total = hotelMoneyJson;
        this.base_rate = hotelMoneyJson2;
        this.taxes_and_fees = list;
        this.amount_before_property_fees = hotelMoneyJson3;
        this.mandatory_property_fees = hotelMoneyJson4;
    }

    public final HotelPriceJson copy(HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List<HotelTaxAndFeeJson> list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4) {
        C7384Etj.A0Y(list, 2);
        return new HotelPriceJson(hotelMoneyJson, hotelMoneyJson2, list, hotelMoneyJson3, hotelMoneyJson4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelPriceJson) {
                HotelPriceJson hotelPriceJson = (HotelPriceJson) obj;
                if (!C7384Etj.areEqual(this.total, hotelPriceJson.total) || !C7384Etj.areEqual(this.base_rate, hotelPriceJson.base_rate) || !C7384Etj.areEqual(this.taxes_and_fees, hotelPriceJson.taxes_and_fees) || !C7384Etj.areEqual(this.amount_before_property_fees, hotelPriceJson.amount_before_property_fees) || !C7384Etj.areEqual(this.mandatory_property_fees, hotelPriceJson.mandatory_property_fees)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelPriceJson copy$default(HotelPriceJson hotelPriceJson, HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelMoneyJson = hotelPriceJson.total;
        }
        if ((i & 2) != 0) {
            hotelMoneyJson2 = hotelPriceJson.base_rate;
        }
        if ((i & 4) != 0) {
            list = hotelPriceJson.taxes_and_fees;
        }
        if ((i & 8) != 0) {
            hotelMoneyJson3 = hotelPriceJson.amount_before_property_fees;
        }
        if ((i & 16) != 0) {
            hotelMoneyJson4 = hotelPriceJson.mandatory_property_fees;
        }
        return hotelPriceJson.copy(hotelMoneyJson, hotelMoneyJson2, list, hotelMoneyJson3, hotelMoneyJson4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelPriceJson hotelPriceJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelPriceJson.total != null) {
            c9j5.AAP(hotelPriceJson.total, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || hotelPriceJson.base_rate != null) {
            c9j5.AAP(hotelPriceJson.base_rate, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(hotelPriceJson.taxes_and_fees)) {
            c9j5.AAQ(hotelPriceJson.taxes_and_fees, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || hotelPriceJson.amount_before_property_fees != null) {
            c9j5.AAP(hotelPriceJson.amount_before_property_fees, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || hotelPriceJson.mandatory_property_fees != null) {
            c9j5.AAP(hotelPriceJson.mandatory_property_fees, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public final HotelMoneyJson component1() {
        return this.total;
    }

    public final HotelMoneyJson component2() {
        return this.base_rate;
    }

    public final List<HotelTaxAndFeeJson> component3() {
        return this.taxes_and_fees;
    }

    public final HotelMoneyJson component4() {
        return this.amount_before_property_fees;
    }

    public final HotelMoneyJson component5() {
        return this.mandatory_property_fees;
    }

    public final HotelMoneyJson getAmount_before_property_fees() {
        return this.amount_before_property_fees;
    }

    public final HotelMoneyJson getBase_rate() {
        return this.base_rate;
    }

    public final HotelMoneyJson getMandatory_property_fees() {
        return this.mandatory_property_fees;
    }

    public final List<HotelTaxAndFeeJson> getTaxes_and_fees() {
        return this.taxes_and_fees;
    }

    public final HotelMoneyJson getTotal() {
        return this.total;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.taxes_and_fees, ((AnonymousClass006.A0D(this.total) * 31) + AnonymousClass006.A0D(this.base_rate)) * 31) + AnonymousClass006.A0D(this.amount_before_property_fees)) * 31) + C3cH.A02(this.mandatory_property_fees);
    }

    public final HotelPrice toDomain() {
        HotelMoney domain;
        HotelMoneyJson hotelMoneyJson = this.total;
        if (hotelMoneyJson == null || (domain = hotelMoneyJson.toDomain()) == null) {
            return null;
        }
        HotelMoneyJson hotelMoneyJson2 = this.base_rate;
        HotelMoney domain2 = hotelMoneyJson2 != null ? hotelMoneyJson2.toDomain() : null;
        HotelMoneyJson hotelMoneyJson3 = this.amount_before_property_fees;
        HotelMoney domain3 = hotelMoneyJson3 != null ? hotelMoneyJson3.toDomain() : null;
        HotelMoneyJson hotelMoneyJson4 = this.mandatory_property_fees;
        HotelMoney domain4 = hotelMoneyJson4 != null ? hotelMoneyJson4.toDomain() : null;
        List<HotelTaxAndFeeJson> list = this.taxes_and_fees;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HotelTaxAndFeeJson> it = list.iterator();
        while (it.hasNext()) {
            HotelFee domain5 = it.next().toDomain();
            if (domain5 != null) {
                arrayListA0h.add(domain5);
            }
        }
        return new HotelPrice(domain, domain2, domain3, domain4, AGI.A07(arrayListA0h));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelPriceJson(HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hotelMoneyJson, (i & 2) != 0 ? null : hotelMoneyJson2, C3cI.A12(list, i), (i & 8) != 0 ? null : hotelMoneyJson3, (i & 16) != 0 ? null : hotelMoneyJson4);
    }

    public /* synthetic */ HotelPriceJson(int i, HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.total = null;
        } else {
            this.total = hotelMoneyJson;
        }
        if ((i & 2) == 0) {
            this.base_rate = null;
        } else {
            this.base_rate = hotelMoneyJson2;
        }
        if ((i & 4) == 0) {
            this.taxes_and_fees = C0881AGi.A00;
        } else {
            this.taxes_and_fees = list;
        }
        if ((i & 8) == 0) {
            this.amount_before_property_fees = null;
        } else {
            this.amount_before_property_fees = hotelMoneyJson3;
        }
        if ((i & 16) == 0) {
            this.mandatory_property_fees = null;
        } else {
            this.mandatory_property_fees = hotelMoneyJson4;
        }
    }

    public HotelPriceJson() {
        this(null, null, C0881AGi.A00, null, null);
    }
}
