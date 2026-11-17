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
import X.C60O;
import X.C60Q;
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
public final /* synthetic */ class HotelResultJson$$serializer implements C9cd<HotelResultJson> {
    public static final int $stable = 0;
    public static final HotelResultJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HotelResultJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HotelResultJson.$childSerializers;
        C2hx c2hx = null;
        HotelImageJson hotelImageJson = null;
        HotelBrowseActionJson hotelBrowseActionJson = null;
        HotelMoneyJson hotelMoneyJson = null;
        String strA0g = null;
        String strA0g2 = null;
        HotelGuestReviewsJson hotelGuestReviewsJson = null;
        Integer num = null;
        List listA0P = null;
        String str = null;
        HotelLocationJson hotelLocationJson = null;
        List list = null;
        List list2 = null;
        String strA0h = null;
        String strA0i = null;
        String strA0o = null;
        String strA8f = null;
        String strA0f = null;
        String strA8f2 = null;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HotelResultJson(i2, strA8f2, strA0h, strA0i, strA0o, strA8f, hotelImageJson, hotelLocationJson, hotelMoneyJson, str, list2, listA0P, num, hotelGuestReviewsJson, list, strA0g2, strA0g, strA0f, hotelBrowseActionJson, c2hx);
                case 0:
                    strA8f2 = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    hotelImageJson = (HotelImageJson) c9j4A55.A8Z(HotelImageJson$$serializer.INSTANCE, c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    hotelLocationJson = (HotelLocationJson) c9j4A55.A8Z(HotelLocationJson$$serializer.INSTANCE, c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    hotelMoneyJson = (HotelMoneyJson) c9j4A55.A8Z(HotelMoneyJson$$serializer.INSTANCE, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    list2 = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    hotelGuestReviewsJson = (HotelGuestReviewsJson) c9j4A55.A8Z(HotelGuestReviewsJson$$serializer.INSTANCE, c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 15);
                    i = 32768;
                    break;
                case 16:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 16);
                    i = 65536;
                    break;
                case 17:
                    hotelBrowseActionJson = (HotelBrowseActionJson) c9j4A55.A8Z(HotelBrowseActionJson$$serializer.INSTANCE, c9iZ, 17);
                    i2 |= 131072;
                    continue;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        HotelResultJson$$serializer hotelResultJson$$serializer = new HotelResultJson$$serializer();
        INSTANCE = hotelResultJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.hotels.HotelResultJson", hotelResultJson$$serializer, 18);
        c9iKA1C.A08("result_ref", true);
        C60O.A1T("hotel_id", c9iKA1C, true);
        c9iKA1C.A08("offer_id", true);
        c9iKA1C.A08("rate_id", true);
        c9iKA1C.A08("image", true);
        c9iKA1C.A08(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, true);
        c9iKA1C.A08("total_price", true);
        c9iKA1C.A08("room_name", true);
        c9iKA1C.A08("room_details", true);
        c9iKA1C.A08("bed_options", true);
        c9iKA1C.A08("room_max_guests", true);
        c9iKA1C.A08("guest_reviews", true);
        C60O.A1V("amenity_highlights", c9iKA1C, true);
        c9iKA1C.A08("phone_number", true);
        c9iKA1C.A08("website_url", true);
        c9iKA1C.A08("detail_action", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HotelResultJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(HotelImageJson$$serializer.INSTANCE), AbstractC07749im.A00(HotelLocationJson$$serializer.INSTANCE), AbstractC07749im.A00(HotelMoneyJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 9), C3cG.A16(f0cArr, 10), AbstractC07749im.A00(C07729ii.A00), AbstractC07749im.A00(HotelGuestReviewsJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 13), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(HotelBrowseActionJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HotelResultJson hotelResultJson) {
        AnonymousClass003.A0u(interfaceC07789is, hotelResultJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HotelResultJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_model_model(hotelResultJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
