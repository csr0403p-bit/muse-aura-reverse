package com.facebook.aura.hotels;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
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
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HotelResultsJson$$serializer implements C9cd<HotelResultsJson> {
    public static final int $stable = 0;
    public static final HotelResultsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HotelResultsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HotelResultsJson.$childSerializers;
        C2hx c2hx = null;
        String strA0p = null;
        HotelBrowseActionJson hotelBrowseActionJson = null;
        HotelTripJson hotelTripJson = null;
        HotelResultLimitsJson hotelResultLimitsJson = null;
        List listA0P = null;
        String strA0m = null;
        Integer num = null;
        String strA0l = null;
        HotelAttributionJson hotelAttributionJson = null;
        String strA0h = null;
        String strA0i = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HotelResultsJson(i, iA8U, strA0h, strA0i, hotelAttributionJson, strA0l, strA0m, hotelTripJson, listA0P, hotelBrowseActionJson, strA0p, num, hotelResultLimitsJson, c2hx);
                case 0:
                    iA8U = c9j4A55.A8U(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    hotelAttributionJson = (HotelAttributionJson) c9j4A55.A8Z(HotelAttributionJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    hotelTripJson = (HotelTripJson) c9j4A55.A8Z(HotelTripJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                case 8:
                    hotelBrowseActionJson = (HotelBrowseActionJson) c9j4A55.A8Z(HotelBrowseActionJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i |= 512;
                    break;
                case 10:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    hotelResultLimitsJson = (HotelResultLimitsJson) c9j4A55.A8Z(HotelResultLimitsJson$$serializer.INSTANCE, c9iZ, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HotelResultsJson$$serializer hotelResultsJson$$serializer = new HotelResultsJson$$serializer();
        INSTANCE = hotelResultsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.hotels.HotelResultsJson", hotelResultsJson$$serializer, 12);
        c9iKA1C.A08("schema_version", true);
        c9iKA1C.A08("search_ref", true);
        c9iKA1C.A08("provider", true);
        C3cH.A1G("attribution", c9iKA1C, true);
        c9iKA1C.A08(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, true);
        c9iKA1C.A08("trip", true);
        c9iKA1C.A08("hotels", true);
        c9iKA1C.A08("see_all_action", true);
        c9iKA1C.A08("captured_at", true);
        c9iKA1C.A08("returned_count", true);
        c9iKA1C.A08("limits", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HotelResultsJson.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07729ii, c07779iq, c07779iq, AbstractC07749im.A00(HotelAttributionJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(HotelTripJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 7), AbstractC07749im.A00(HotelBrowseActionJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(HotelResultLimitsJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HotelResultsJson hotelResultsJson) {
        AnonymousClass003.A0u(interfaceC07789is, hotelResultsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HotelResultsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(hotelResultsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
