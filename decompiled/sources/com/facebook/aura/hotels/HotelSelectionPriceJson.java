package com.facebook.aura.hotels;

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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HotelSelectionPriceJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable;
    public static final Companion Companion = new Companion();
    public final HotelMoneyJson amount_before_property_fees;
    public final HotelMoneyJson average_nightly_base_rate;
    public final HotelMoneyJson base_rate;
    public final HotelMoneyJson mandatory_property_fees;
    public final List<HotelNightlyRateJson> nightly_base_rates;
    public final List<HotelTaxAndFeeJson> taxes_and_fees;
    public final HotelMoneyJson total;

    public final class Companion {
        public final C9hr<HotelSelectionPriceJson> serializer() {
            return HotelSelectionPriceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        int i = HotelMoneyJson.$stable;
        $stable = i | i | i | i | i;
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, HotelSelectionPriceJson$Companion$$childSerializers$1.INSTANCE), null, null, null, AbstractC5321DgF.A02(num, HotelSelectionPriceJson$Companion$$childSerializers$2.INSTANCE)};
    }

    public final HotelSelectionPriceJson copy(HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List<HotelTaxAndFeeJson> list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4, HotelMoneyJson hotelMoneyJson5, List<HotelNightlyRateJson> list2) {
        C7384Etj.A0Y(list, 2);
        return new HotelSelectionPriceJson(hotelMoneyJson, hotelMoneyJson2, list, hotelMoneyJson3, hotelMoneyJson4, hotelMoneyJson5, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelSelectionPriceJson) {
                HotelSelectionPriceJson hotelSelectionPriceJson = (HotelSelectionPriceJson) obj;
                if (!C7384Etj.areEqual(this.total, hotelSelectionPriceJson.total) || !C7384Etj.areEqual(this.base_rate, hotelSelectionPriceJson.base_rate) || !C7384Etj.areEqual(this.taxes_and_fees, hotelSelectionPriceJson.taxes_and_fees) || !C7384Etj.areEqual(this.amount_before_property_fees, hotelSelectionPriceJson.amount_before_property_fees) || !C7384Etj.areEqual(this.mandatory_property_fees, hotelSelectionPriceJson.mandatory_property_fees) || !C7384Etj.areEqual(this.average_nightly_base_rate, hotelSelectionPriceJson.average_nightly_base_rate) || !C7384Etj.areEqual(this.nightly_base_rates, hotelSelectionPriceJson.nightly_base_rates)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelSelectionPriceJson copy$default(HotelSelectionPriceJson hotelSelectionPriceJson, HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4, HotelMoneyJson hotelMoneyJson5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelMoneyJson = hotelSelectionPriceJson.total;
        }
        if ((i & 2) != 0) {
            hotelMoneyJson2 = hotelSelectionPriceJson.base_rate;
        }
        if ((i & 4) != 0) {
            list = hotelSelectionPriceJson.taxes_and_fees;
        }
        if ((i & 8) != 0) {
            hotelMoneyJson3 = hotelSelectionPriceJson.amount_before_property_fees;
        }
        if ((i & 16) != 0) {
            hotelMoneyJson4 = hotelSelectionPriceJson.mandatory_property_fees;
        }
        if ((i & 32) != 0) {
            hotelMoneyJson5 = hotelSelectionPriceJson.average_nightly_base_rate;
        }
        if ((i & 64) != 0) {
            list2 = hotelSelectionPriceJson.nightly_base_rates;
        }
        return hotelSelectionPriceJson.copy(hotelMoneyJson, hotelMoneyJson2, list, hotelMoneyJson3, hotelMoneyJson4, hotelMoneyJson5, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelSelectionPriceJson hotelSelectionPriceJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelSelectionPriceJson.total != null) {
            c9j5.AAP(hotelSelectionPriceJson.total, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || hotelSelectionPriceJson.base_rate != null) {
            c9j5.AAP(hotelSelectionPriceJson.base_rate, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(hotelSelectionPriceJson.taxes_and_fees)) {
            c9j5.AAQ(hotelSelectionPriceJson.taxes_and_fees, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || hotelSelectionPriceJson.amount_before_property_fees != null) {
            c9j5.AAP(hotelSelectionPriceJson.amount_before_property_fees, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || hotelSelectionPriceJson.mandatory_property_fees != null) {
            c9j5.AAP(hotelSelectionPriceJson.mandatory_property_fees, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || hotelSelectionPriceJson.average_nightly_base_rate != null) {
            c9j5.AAP(hotelSelectionPriceJson.average_nightly_base_rate, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || hotelSelectionPriceJson.nightly_base_rates != null) {
            c9j5.AAP(hotelSelectionPriceJson.nightly_base_rates, C3cH.A15(f0cArr, 6), c9iZ, 6);
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

    public final HotelMoneyJson component6() {
        return this.average_nightly_base_rate;
    }

    public final List<HotelNightlyRateJson> component7() {
        return this.nightly_base_rates;
    }

    public final HotelMoneyJson getAmount_before_property_fees() {
        return this.amount_before_property_fees;
    }

    public final HotelMoneyJson getAverage_nightly_base_rate() {
        return this.average_nightly_base_rate;
    }

    public final HotelMoneyJson getBase_rate() {
        return this.base_rate;
    }

    public final HotelMoneyJson getMandatory_property_fees() {
        return this.mandatory_property_fees;
    }

    public final List<HotelNightlyRateJson> getNightly_base_rates() {
        return this.nightly_base_rates;
    }

    public final List<HotelTaxAndFeeJson> getTaxes_and_fees() {
        return this.taxes_and_fees;
    }

    public final HotelMoneyJson getTotal() {
        return this.total;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(this.taxes_and_fees, ((AnonymousClass006.A0D(this.total) * 31) + AnonymousClass006.A0D(this.base_rate)) * 31) + AnonymousClass006.A0D(this.amount_before_property_fees)) * 31) + AnonymousClass006.A0D(this.mandatory_property_fees)) * 31) + AnonymousClass006.A0D(this.average_nightly_base_rate)) * 31) + C3cH.A02(this.nightly_base_rates);
    }

    public final HotelPrice toDomain() {
        HotelPrice domain = new HotelPriceJson(this.total, this.base_rate, this.taxes_and_fees, this.amount_before_property_fees, this.mandatory_property_fees).toDomain();
        if (domain == null || domain.total.amount.signum() < 0) {
            return null;
        }
        return domain;
    }

    public /* synthetic */ HotelSelectionPriceJson(int i, HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4, HotelMoneyJson hotelMoneyJson5, List list2, C2hx c2hx) {
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
        if ((i & 32) == 0) {
            this.average_nightly_base_rate = null;
        } else {
            this.average_nightly_base_rate = hotelMoneyJson5;
        }
        if ((i & 64) == 0) {
            this.nightly_base_rates = null;
        } else {
            this.nightly_base_rates = list2;
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelSelectionPriceJson(HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4, HotelMoneyJson hotelMoneyJson5, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hotelMoneyJson, (i & 2) != 0 ? null : hotelMoneyJson2, C3cI.A12(list, i), (i & 8) != 0 ? null : hotelMoneyJson3, (i & 16) != 0 ? null : hotelMoneyJson4, (i & 32) != 0 ? null : hotelMoneyJson5, (i & 64) != 0 ? null : list2);
    }

    public HotelSelectionPriceJson(HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, List<HotelTaxAndFeeJson> list, HotelMoneyJson hotelMoneyJson3, HotelMoneyJson hotelMoneyJson4, HotelMoneyJson hotelMoneyJson5, List<HotelNightlyRateJson> list2) {
        C7384Etj.A0Y(list, 2);
        this.total = hotelMoneyJson;
        this.base_rate = hotelMoneyJson2;
        this.taxes_and_fees = list;
        this.amount_before_property_fees = hotelMoneyJson3;
        this.mandatory_property_fees = hotelMoneyJson4;
        this.average_nightly_base_rate = hotelMoneyJson5;
        this.nightly_base_rates = list2;
    }

    public HotelSelectionPriceJson() {
        this(null, null, C0881AGi.A00, null, null, null, null);
    }
}
