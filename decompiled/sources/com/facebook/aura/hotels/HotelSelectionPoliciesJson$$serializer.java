package com.facebook.aura.hotels;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class HotelSelectionPoliciesJson$$serializer implements C9cd<HotelSelectionPoliciesJson> {
    public static final int $stable = 0;
    public static final HotelSelectionPoliciesJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HotelSelectionPoliciesJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HotelSelectionPoliciesJson.$childSerializers;
        JsonElement jsonElement = null;
        String strA0f = null;
        String strA0g = null;
        String strA0r = null;
        String strA0q = null;
        List listA0P = null;
        String strA0p = null;
        List listA0P2 = null;
        String str = null;
        List listA0P3 = null;
        List listA0P4 = null;
        String strA0m = null;
        String strA0v = null;
        String strA0s = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HotelSelectionPoliciesJson(i, strA0v, strA0f, strA0g, listA0P2, listA0P4, strA0m, listA0P, listA0P3, str, strA0p, strA0q, strA0r, strA0s, jsonElement, (C2hx) null);
                case 0:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0g = C3cI.A0g(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 3);
                    i |= 8;
                    break;
                case 4:
                    listA0P4 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 6);
                    i |= 64;
                    break;
                case 7:
                    listA0P3 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i |= 512;
                    break;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i |= 1024;
                    break;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i |= 2048;
                    break;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i |= 4096;
                    break;
                case 13:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 13);
                    i |= 8192;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HotelSelectionPoliciesJson$$serializer hotelSelectionPoliciesJson$$serializer = new HotelSelectionPoliciesJson$$serializer();
        INSTANCE = hotelSelectionPoliciesJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.hotels.HotelSelectionPoliciesJson", hotelSelectionPoliciesJson$$serializer, 14);
        c9iKA1C.A08("check_in_start", true);
        c9iKA1C.A08("check_in_end", true);
        c9iKA1C.A08("check_out", true);
        c9iKA1C.A08("check_in_instructions", true);
        c9iKA1C.A08("property_policies", true);
        c9iKA1C.A08("room_occupancy_policy", true);
        c9iKA1C.A08("mandatory_fee_descriptions", true);
        c9iKA1C.A08("optional_extras", true);
        c9iKA1C.A08("bed_note", true);
        c9iKA1C.A08("rules_and_restrictions_url", true);
        c9iKA1C.A08("taxes_and_fees_disclosure", true);
        c9iKA1C.A08("taxes_and_fees_title", true);
        c9iKA1C.A08("taxes_and_fees_terms_url", true);
        c9iKA1C.A08("important_information", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HotelSelectionPoliciesJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A12(f0cArr), C3cH.A13(f0cArr), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 6), C3cG.A16(f0cArr, 7), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(JsonElementSerializer.A00)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, HotelSelectionPoliciesJson hotelSelectionPoliciesJson) {
        AnonymousClass003.A0u(interfaceC07789is, hotelSelectionPoliciesJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HotelSelectionPoliciesJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(hotelSelectionPoliciesJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
