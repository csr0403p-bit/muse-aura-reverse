package com.facebook.aura.hotels;

import X.AGI;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class HotelSelectionPoliciesJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String bed_note;
    public final String check_in_end;
    public final List<String> check_in_instructions;
    public final String check_in_start;
    public final String check_out;
    public final JsonElement important_information;
    public final List<String> mandatory_fee_descriptions;
    public final List<String> optional_extras;
    public final List<String> property_policies;
    public final String room_occupancy_policy;
    public final String rules_and_restrictions_url;
    public final String taxes_and_fees_disclosure;
    public final String taxes_and_fees_terms_url;
    public final String taxes_and_fees_title;

    public final class Companion {
        public final C9hr<HotelSelectionPoliciesJson> serializer() {
            return HotelSelectionPoliciesJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, AbstractC5321DgF.A02(num, HotelSelectionPoliciesJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, HotelSelectionPoliciesJson$Companion$$childSerializers$2.INSTANCE), null, AbstractC5321DgF.A02(num, HotelSelectionPoliciesJson$Companion$$childSerializers$3.INSTANCE), AbstractC5321DgF.A02(num, HotelSelectionPoliciesJson$Companion$$childSerializers$4.INSTANCE), null, null, null, null, null, null};
    }

    public final HotelSelectionPoliciesJson copy(String str, String str2, String str3, List<String> list, List<String> list2, String str4, List<String> list3, List<String> list4, String str5, String str6, String str7, String str8, String str9, JsonElement jsonElement) {
        AnonymousClass002.A1C(list, 3, list2);
        AnonymousClass003.A10(list3, list4);
        return new HotelSelectionPoliciesJson(str, str2, str3, list, list2, str4, list3, list4, str5, str6, str7, str8, str9, jsonElement);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelSelectionPoliciesJson) {
                HotelSelectionPoliciesJson hotelSelectionPoliciesJson = (HotelSelectionPoliciesJson) obj;
                if (!C7384Etj.areEqual(this.check_in_start, hotelSelectionPoliciesJson.check_in_start) || !C7384Etj.areEqual(this.check_in_end, hotelSelectionPoliciesJson.check_in_end) || !C7384Etj.areEqual(this.check_out, hotelSelectionPoliciesJson.check_out) || !C7384Etj.areEqual(this.check_in_instructions, hotelSelectionPoliciesJson.check_in_instructions) || !C7384Etj.areEqual(this.property_policies, hotelSelectionPoliciesJson.property_policies) || !C7384Etj.areEqual(this.room_occupancy_policy, hotelSelectionPoliciesJson.room_occupancy_policy) || !C7384Etj.areEqual(this.mandatory_fee_descriptions, hotelSelectionPoliciesJson.mandatory_fee_descriptions) || !C7384Etj.areEqual(this.optional_extras, hotelSelectionPoliciesJson.optional_extras) || !C7384Etj.areEqual(this.bed_note, hotelSelectionPoliciesJson.bed_note) || !C7384Etj.areEqual(this.rules_and_restrictions_url, hotelSelectionPoliciesJson.rules_and_restrictions_url) || !C7384Etj.areEqual(this.taxes_and_fees_disclosure, hotelSelectionPoliciesJson.taxes_and_fees_disclosure) || !C7384Etj.areEqual(this.taxes_and_fees_title, hotelSelectionPoliciesJson.taxes_and_fees_title) || !C7384Etj.areEqual(this.taxes_and_fees_terms_url, hotelSelectionPoliciesJson.taxes_and_fees_terms_url) || !C7384Etj.areEqual(this.important_information, hotelSelectionPoliciesJson.important_information)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HotelSelectionPoliciesJson(String str, String str2, String str3, List list, List list2, String str4, List list3, List list4, String str5, String str6, String str7, String str8, String str9, JsonElement jsonElement, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? C0881AGi.A00 : list2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? C0881AGi.A00 : list3, (i & 128) != 0 ? C0881AGi.A00 : list4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : jsonElement);
    }

    public static /* synthetic */ HotelSelectionPoliciesJson copy$default(HotelSelectionPoliciesJson hotelSelectionPoliciesJson, String str, String str2, String str3, List list, List list2, String str4, List list3, List list4, String str5, String str6, String str7, String str8, String str9, JsonElement jsonElement, int i, Object obj) {
        String str10 = str2;
        String str11 = str3;
        List list5 = list;
        List list6 = list2;
        String str12 = str4;
        List list7 = list3;
        List list8 = list4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        String str17 = str9;
        JsonElement jsonElement2 = jsonElement;
        if ((i & 1) != 0) {
            str = hotelSelectionPoliciesJson.check_in_start;
        }
        if ((i & 2) != 0) {
            str10 = hotelSelectionPoliciesJson.check_in_end;
        }
        if ((i & 4) != 0) {
            str11 = hotelSelectionPoliciesJson.check_out;
        }
        if ((i & 8) != 0) {
            list5 = hotelSelectionPoliciesJson.check_in_instructions;
        }
        if ((i & 16) != 0) {
            list6 = hotelSelectionPoliciesJson.property_policies;
        }
        if ((i & 32) != 0) {
            str12 = hotelSelectionPoliciesJson.room_occupancy_policy;
        }
        if ((i & 64) != 0) {
            list7 = hotelSelectionPoliciesJson.mandatory_fee_descriptions;
        }
        if ((i & 128) != 0) {
            list8 = hotelSelectionPoliciesJson.optional_extras;
        }
        if ((i & 256) != 0) {
            str13 = hotelSelectionPoliciesJson.bed_note;
        }
        if ((i & 512) != 0) {
            str14 = hotelSelectionPoliciesJson.rules_and_restrictions_url;
        }
        if ((i & 1024) != 0) {
            str15 = hotelSelectionPoliciesJson.taxes_and_fees_disclosure;
        }
        if ((i & 2048) != 0) {
            str16 = hotelSelectionPoliciesJson.taxes_and_fees_title;
        }
        if ((i & 4096) != 0) {
            str17 = hotelSelectionPoliciesJson.taxes_and_fees_terms_url;
        }
        if ((i & 8192) != 0) {
            jsonElement2 = hotelSelectionPoliciesJson.important_information;
        }
        return hotelSelectionPoliciesJson.copy(str, str10, str11, list5, list6, str12, list7, list8, str13, str14, str15, str16, str17, jsonElement2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelSelectionPoliciesJson hotelSelectionPoliciesJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelSelectionPoliciesJson.check_in_start != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.check_in_start, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hotelSelectionPoliciesJson.check_in_end != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.check_in_end, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hotelSelectionPoliciesJson.check_out != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.check_out, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(hotelSelectionPoliciesJson.check_in_instructions)) {
            c9j5.AAQ(hotelSelectionPoliciesJson.check_in_instructions, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(hotelSelectionPoliciesJson.property_policies)) {
            c9j5.AAQ(hotelSelectionPoliciesJson.property_policies, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || hotelSelectionPoliciesJson.room_occupancy_policy != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.room_occupancy_policy, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(hotelSelectionPoliciesJson.mandatory_fee_descriptions)) {
            c9j5.AAQ(hotelSelectionPoliciesJson.mandatory_fee_descriptions, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || !C3cG.A1L(hotelSelectionPoliciesJson.optional_extras)) {
            c9j5.AAQ(hotelSelectionPoliciesJson.optional_extras, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
        if (zAfR || hotelSelectionPoliciesJson.bed_note != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.bed_note, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || hotelSelectionPoliciesJson.rules_and_restrictions_url != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.rules_and_restrictions_url, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || hotelSelectionPoliciesJson.taxes_and_fees_disclosure != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.taxes_and_fees_disclosure, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || hotelSelectionPoliciesJson.taxes_and_fees_title != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.taxes_and_fees_title, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || hotelSelectionPoliciesJson.taxes_and_fees_terms_url != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.taxes_and_fees_terms_url, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || hotelSelectionPoliciesJson.important_information != null) {
            c9j5.AAP(hotelSelectionPoliciesJson.important_information, JsonElementSerializer.A00, c9iZ, 13);
        }
    }

    public final String component1() {
        return this.check_in_start;
    }

    public final String component10() {
        return this.rules_and_restrictions_url;
    }

    public final String component11() {
        return this.taxes_and_fees_disclosure;
    }

    public final String component12() {
        return this.taxes_and_fees_title;
    }

    public final String component13() {
        return this.taxes_and_fees_terms_url;
    }

    public final JsonElement component14() {
        return this.important_information;
    }

    public final String component2() {
        return this.check_in_end;
    }

    public final String component3() {
        return this.check_out;
    }

    public final List<String> component4() {
        return this.check_in_instructions;
    }

    public final List<String> component5() {
        return this.property_policies;
    }

    public final String component6() {
        return this.room_occupancy_policy;
    }

    public final List<String> component7() {
        return this.mandatory_fee_descriptions;
    }

    public final List<String> component8() {
        return this.optional_extras;
    }

    public final String component9() {
        return this.bed_note;
    }

    public final String getBed_note() {
        return this.bed_note;
    }

    public final String getCheck_in_end() {
        return this.check_in_end;
    }

    public final List<String> getCheck_in_instructions() {
        return this.check_in_instructions;
    }

    public final String getCheck_in_start() {
        return this.check_in_start;
    }

    public final String getCheck_out() {
        return this.check_out;
    }

    public final JsonElement getImportant_information() {
        return this.important_information;
    }

    public final List<String> getMandatory_fee_descriptions() {
        return this.mandatory_fee_descriptions;
    }

    public final List<String> getOptional_extras() {
        return this.optional_extras;
    }

    public final List<String> getProperty_policies() {
        return this.property_policies;
    }

    public final String getRoom_occupancy_policy() {
        return this.room_occupancy_policy;
    }

    public final String getRules_and_restrictions_url() {
        return this.rules_and_restrictions_url;
    }

    public final String getTaxes_and_fees_disclosure() {
        return this.taxes_and_fees_disclosure;
    }

    public final String getTaxes_and_fees_terms_url() {
        return this.taxes_and_fees_terms_url;
    }

    public final String getTaxes_and_fees_title() {
        return this.taxes_and_fees_title;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass005.A0F(this.optional_extras, AnonymousClass005.A0F(this.mandatory_fee_descriptions, (AnonymousClass005.A0F(this.property_policies, AnonymousClass005.A0F(this.check_in_instructions, ((((AnonymousClass006.A0G(this.check_in_start) * 31) + AnonymousClass006.A0G(this.check_in_end)) * 31) + AnonymousClass006.A0G(this.check_out)) * 31)) + AnonymousClass006.A0G(this.room_occupancy_policy)) * 31)) + AnonymousClass006.A0G(this.bed_note)) * 31) + AnonymousClass006.A0G(this.rules_and_restrictions_url)) * 31) + AnonymousClass006.A0G(this.taxes_and_fees_disclosure)) * 31) + AnonymousClass006.A0G(this.taxes_and_fees_title)) * 31) + AnonymousClass006.A0G(this.taxes_and_fees_terms_url)) * 31) + C3cH.A02(this.important_information);
    }

    public final HotelDetails toDomain() {
        return new HotelDetails(HotelDetailsStatus.LOADED, null, null, HotelResultModelsKt.hotelNonBlank(this.check_in_start), HotelResultModelsKt.hotelNonBlank(this.check_in_end), HotelResultModelsKt.hotelNonBlank(this.check_out), AGI.A07(this.check_in_instructions), AGI.A07(this.property_policies), AGI.A07(this.mandatory_fee_descriptions), AGI.A07(this.optional_extras));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HotelSelectionPoliciesJson(int i, String str, String str2, String str3, List list, List list2, String str4, List list3, List list4, String str5, String str6, String str7, String str8, String str9, JsonElement jsonElement, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.check_in_start = null;
        } else {
            this.check_in_start = str;
        }
        if ((i & 2) == 0) {
            this.check_in_end = null;
        } else {
            this.check_in_end = str2;
        }
        if ((i & 4) == 0) {
            this.check_out = null;
        } else {
            this.check_out = str3;
        }
        if ((i & 8) == 0) {
            this.check_in_instructions = C0881AGi.A00;
        } else {
            this.check_in_instructions = list;
        }
        if ((i & 16) == 0) {
            this.property_policies = C0881AGi.A00;
        } else {
            this.property_policies = list2;
        }
        if ((i & 32) == 0) {
            this.room_occupancy_policy = null;
        } else {
            this.room_occupancy_policy = str4;
        }
        if ((i & 64) == 0) {
            this.mandatory_fee_descriptions = C0881AGi.A00;
        } else {
            this.mandatory_fee_descriptions = list3;
        }
        if ((i & 128) == 0) {
            this.optional_extras = C0881AGi.A00;
        } else {
            this.optional_extras = list4;
        }
        if ((i & 256) == 0) {
            this.bed_note = null;
        } else {
            this.bed_note = str5;
        }
        if ((i & 512) == 0) {
            this.rules_and_restrictions_url = null;
        } else {
            this.rules_and_restrictions_url = str6;
        }
        if ((i & 1024) == 0) {
            this.taxes_and_fees_disclosure = null;
        } else {
            this.taxes_and_fees_disclosure = str7;
        }
        if ((i & 2048) == 0) {
            this.taxes_and_fees_title = null;
        } else {
            this.taxes_and_fees_title = str8;
        }
        if ((i & 4096) == 0) {
            this.taxes_and_fees_terms_url = null;
        } else {
            this.taxes_and_fees_terms_url = str9;
        }
        if ((i & 8192) == 0) {
            this.important_information = null;
        } else {
            this.important_information = jsonElement;
        }
    }

    public HotelSelectionPoliciesJson(String str, String str2, String str3, List<String> list, List<String> list2, String str4, List<String> list3, List<String> list4, String str5, String str6, String str7, String str8, String str9, JsonElement jsonElement) {
        AnonymousClass002.A1C(list, 3, list2);
        AnonymousClass003.A10(list3, list4);
        this.check_in_start = str;
        this.check_in_end = str2;
        this.check_out = str3;
        this.check_in_instructions = list;
        this.property_policies = list2;
        this.room_occupancy_policy = str4;
        this.mandatory_fee_descriptions = list3;
        this.optional_extras = list4;
        this.bed_note = str5;
        this.rules_and_restrictions_url = str6;
        this.taxes_and_fees_disclosure = str7;
        this.taxes_and_fees_title = str8;
        this.taxes_and_fees_terms_url = str9;
        this.important_information = jsonElement;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HotelSelectionPoliciesJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, null, null, c0881AGi, c0881AGi, null, c0881AGi, c0881AGi, null, null, null, null, null, null);
    }
}
