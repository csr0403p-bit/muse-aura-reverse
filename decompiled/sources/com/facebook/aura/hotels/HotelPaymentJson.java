package com.facebook.aura.hotels;

import X.AGI;
import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
public final class HotelPaymentJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable;
    public static final Companion Companion = new Companion();
    public final HotelMoneyJson due_at_property;
    public final HotelMoneyJson due_later;
    public final HotelMoneyJson due_now;
    public final Boolean full_deposit_upon_booking;
    public final List<HotelInstallmentJson> installments;
    public final String method;
    public final String timing;

    public final class Companion {
        public final C9hr<HotelPaymentJson> serializer() {
            return HotelPaymentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        int i = HotelMoneyJson.$stable;
        $stable = i | i | i;
        $childSerializers = new F0C[]{null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HotelPaymentJson$Companion$$childSerializers$1.INSTANCE)};
    }

    public final HotelPaymentJson copy(String str, String str2, Boolean bool, HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, HotelMoneyJson hotelMoneyJson3, List<HotelInstallmentJson> list) {
        C7384Etj.A0Y(list, 6);
        return new HotelPaymentJson(str, str2, bool, hotelMoneyJson, hotelMoneyJson2, hotelMoneyJson3, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelPaymentJson) {
                HotelPaymentJson hotelPaymentJson = (HotelPaymentJson) obj;
                if (!C7384Etj.areEqual(this.method, hotelPaymentJson.method) || !C7384Etj.areEqual(this.timing, hotelPaymentJson.timing) || !C7384Etj.areEqual(this.full_deposit_upon_booking, hotelPaymentJson.full_deposit_upon_booking) || !C7384Etj.areEqual(this.due_now, hotelPaymentJson.due_now) || !C7384Etj.areEqual(this.due_later, hotelPaymentJson.due_later) || !C7384Etj.areEqual(this.due_at_property, hotelPaymentJson.due_at_property) || !C7384Etj.areEqual(this.installments, hotelPaymentJson.installments)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelPaymentJson copy$default(HotelPaymentJson hotelPaymentJson, String str, String str2, Boolean bool, HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, HotelMoneyJson hotelMoneyJson3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotelPaymentJson.method;
        }
        if ((i & 2) != 0) {
            str2 = hotelPaymentJson.timing;
        }
        if ((i & 4) != 0) {
            bool = hotelPaymentJson.full_deposit_upon_booking;
        }
        if ((i & 8) != 0) {
            hotelMoneyJson = hotelPaymentJson.due_now;
        }
        if ((i & 16) != 0) {
            hotelMoneyJson2 = hotelPaymentJson.due_later;
        }
        if ((i & 32) != 0) {
            hotelMoneyJson3 = hotelPaymentJson.due_at_property;
        }
        if ((i & 64) != 0) {
            list = hotelPaymentJson.installments;
        }
        return hotelPaymentJson.copy(str, str2, bool, hotelMoneyJson, hotelMoneyJson2, hotelMoneyJson3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelPaymentJson hotelPaymentJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelPaymentJson.method != null) {
            c9j5.AAP(hotelPaymentJson.method, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hotelPaymentJson.timing != null) {
            c9j5.AAP(hotelPaymentJson.timing, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hotelPaymentJson.full_deposit_upon_booking != null) {
            c9j5.AAP(hotelPaymentJson.full_deposit_upon_booking, C07839ix.A00, c9iZ, 2);
        }
        if (zAfR || hotelPaymentJson.due_now != null) {
            c9j5.AAP(hotelPaymentJson.due_now, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || hotelPaymentJson.due_later != null) {
            c9j5.AAP(hotelPaymentJson.due_later, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || hotelPaymentJson.due_at_property != null) {
            c9j5.AAP(hotelPaymentJson.due_at_property, HotelMoneyJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(hotelPaymentJson.installments)) {
            c9j5.AAQ(hotelPaymentJson.installments, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
    }

    public final String component1() {
        return this.method;
    }

    public final String component2() {
        return this.timing;
    }

    public final Boolean component3() {
        return this.full_deposit_upon_booking;
    }

    public final HotelMoneyJson component4() {
        return this.due_now;
    }

    public final HotelMoneyJson component5() {
        return this.due_later;
    }

    public final HotelMoneyJson component6() {
        return this.due_at_property;
    }

    public final List<HotelInstallmentJson> component7() {
        return this.installments;
    }

    public final HotelMoneyJson getDue_at_property() {
        return this.due_at_property;
    }

    public final HotelMoneyJson getDue_later() {
        return this.due_later;
    }

    public final HotelMoneyJson getDue_now() {
        return this.due_now;
    }

    public final Boolean getFull_deposit_upon_booking() {
        return this.full_deposit_upon_booking;
    }

    public final List<HotelInstallmentJson> getInstallments() {
        return this.installments;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getTiming() {
        return this.timing;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.installments, ((((((((((AnonymousClass006.A0G(this.method) * 31) + AnonymousClass006.A0G(this.timing)) * 31) + AnonymousClass006.A0D(this.full_deposit_upon_booking)) * 31) + AnonymousClass006.A0D(this.due_now)) * 31) + AnonymousClass006.A0D(this.due_later)) * 31) + C3cH.A02(this.due_at_property)) * 31);
    }

    public final HotelPayment toDomain() {
        String strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(this.method);
        String strHotelNonBlank2 = HotelResultModelsKt.hotelNonBlank(this.timing);
        Boolean bool = this.full_deposit_upon_booking;
        HotelMoneyJson hotelMoneyJson = this.due_now;
        HotelMoney domain = hotelMoneyJson != null ? hotelMoneyJson.toDomain() : null;
        HotelMoneyJson hotelMoneyJson2 = this.due_later;
        HotelMoney domain2 = hotelMoneyJson2 != null ? hotelMoneyJson2.toDomain() : null;
        HotelMoneyJson hotelMoneyJson3 = this.due_at_property;
        HotelMoney domain3 = hotelMoneyJson3 != null ? hotelMoneyJson3.toDomain() : null;
        List<HotelInstallmentJson> list = this.installments;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HotelInstallmentJson> it = list.iterator();
        while (it.hasNext()) {
            HotelInstallment domain4 = it.next().toDomain();
            if (domain4 != null) {
                arrayListA0h.add(domain4);
            }
        }
        return new HotelPayment(strHotelNonBlank, strHotelNonBlank2, bool, domain, domain2, domain3, AGI.A07(arrayListA0h));
    }

    public /* synthetic */ HotelPaymentJson(int i, String str, String str2, Boolean bool, HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, HotelMoneyJson hotelMoneyJson3, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.method = null;
        } else {
            this.method = str;
        }
        if ((i & 2) == 0) {
            this.timing = null;
        } else {
            this.timing = str2;
        }
        if ((i & 4) == 0) {
            this.full_deposit_upon_booking = null;
        } else {
            this.full_deposit_upon_booking = bool;
        }
        if ((i & 8) == 0) {
            this.due_now = null;
        } else {
            this.due_now = hotelMoneyJson;
        }
        if ((i & 16) == 0) {
            this.due_later = null;
        } else {
            this.due_later = hotelMoneyJson2;
        }
        if ((i & 32) == 0) {
            this.due_at_property = null;
        } else {
            this.due_at_property = hotelMoneyJson3;
        }
        if ((i & 64) == 0) {
            this.installments = C0881AGi.A00;
        } else {
            this.installments = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelPaymentJson(String str, String str2, Boolean bool, HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, HotelMoneyJson hotelMoneyJson3, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : hotelMoneyJson, (i & 16) != 0 ? null : hotelMoneyJson2, (i & 32) != 0 ? null : hotelMoneyJson3, (i & 64) != 0 ? C0881AGi.A00 : list);
    }

    public HotelPaymentJson(String str, String str2, Boolean bool, HotelMoneyJson hotelMoneyJson, HotelMoneyJson hotelMoneyJson2, HotelMoneyJson hotelMoneyJson3, List<HotelInstallmentJson> list) {
        C7384Etj.A0Y(list, 6);
        this.method = str;
        this.timing = str2;
        this.full_deposit_upon_booking = bool;
        this.due_now = hotelMoneyJson;
        this.due_later = hotelMoneyJson2;
        this.due_at_property = hotelMoneyJson3;
        this.installments = list;
    }

    public HotelPaymentJson() {
        this(null, null, null, null, null, null, C0881AGi.A00);
    }
}
