package com.facebook.aura.hotels;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60O;
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
import com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt;
import com.facebook.aura.perf.HatchPauseQplLogger;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HotelSelectionJson$$serializer implements C9cd<HotelSelectionJson> {
    public static final int $stable = 0;
    public static final HotelSelectionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HotelSelectionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HotelSelectionJson.$childSerializers;
        List list = null;
        Integer num = null;
        HotelSelectionPoliciesJson hotelSelectionPoliciesJson = null;
        HotelSelectionCancellationJson hotelSelectionCancellationJson = null;
        HotelGuestReviewJson hotelGuestReviewJson = null;
        String strA0f = null;
        String strA0s = null;
        HotelPaymentJson hotelPaymentJson = null;
        HotelSelectionPriceJson hotelSelectionPriceJson = null;
        String strA0t = null;
        HotelRoomOptionsActionJson hotelRoomOptionsActionJson = null;
        HotelBookingActionJson hotelBookingActionJson = null;
        HotelBookingActionJson hotelBookingActionJson2 = null;
        String strA8f = null;
        String strA0h = null;
        HotelAttributionJson hotelAttributionJson = null;
        JsonElement jsonElement = null;
        JsonElement jsonElement2 = null;
        JsonElement jsonElement3 = null;
        HotelTripJson hotelTripJson = null;
        HotelResultJson hotelResultJson = null;
        List listA0P = null;
        String strA0q = null;
        int i2 = 0;
        int iA8U = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HotelSelectionJson(i2, iA8U, strA0h, hotelAttributionJson, jsonElement, jsonElement2, jsonElement3, strA8f, hotelTripJson, hotelResultJson, listA0P, strA0q, hotelGuestReviewJson, strA0s, strA0t, num, list, hotelSelectionPriceJson, hotelPaymentJson, hotelSelectionCancellationJson, hotelSelectionPoliciesJson, strA0f, zA8G, hotelBookingActionJson2, hotelBookingActionJson, hotelRoomOptionsActionJson, (C2hx) null);
                case 0:
                    iA8U = c9j4A55.A8U(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    hotelAttributionJson = (HotelAttributionJson) c9j4A55.A8Z(HotelAttributionJson$$serializer.INSTANCE, c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    jsonElement2 = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    jsonElement3 = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strA8f = c9j4A55.A8f(c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    hotelTripJson = (HotelTripJson) c9j4A55.A8Z(HotelTripJson$$serializer.INSTANCE, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    hotelResultJson = (HotelResultJson) c9j4A55.A8Z(HotelResultJson$$serializer.INSTANCE, c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    hotelGuestReviewJson = (HotelGuestReviewJson) c9j4A55.A8Z(HotelGuestReviewJson$$serializer.INSTANCE, c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i2 |= 8192;
                    continue;
                case 14:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 15);
                    i = 32768;
                    break;
                case 16:
                    hotelSelectionPriceJson = (HotelSelectionPriceJson) c9j4A55.A8Z(HotelSelectionPriceJson$$serializer.INSTANCE, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    hotelPaymentJson = (HotelPaymentJson) c9j4A55.A8Z(HotelPaymentJson$$serializer.INSTANCE, c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    hotelSelectionCancellationJson = (HotelSelectionCancellationJson) c9j4A55.A8Z(HotelSelectionCancellationJson$$serializer.INSTANCE, c9iZ, 18);
                    i = 262144;
                    break;
                case 19:
                    hotelSelectionPoliciesJson = (HotelSelectionPoliciesJson) c9j4A55.A8Z(HotelSelectionPoliciesJson$$serializer.INSTANCE, c9iZ, 19);
                    i = 524288;
                    break;
                case 20:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 20);
                    i = 1048576;
                    break;
                case 21:
                    zA8G = c9j4A55.A8G(c9iZ, 21);
                    i = 2097152;
                    break;
                case 22:
                    hotelBookingActionJson2 = (HotelBookingActionJson) c9j4A55.A8Z(HotelBookingActionJson$$serializer.INSTANCE, c9iZ, 22);
                    i = 4194304;
                    break;
                case 23:
                    hotelBookingActionJson = (HotelBookingActionJson) c9j4A55.A8Z(HotelBookingActionJson$$serializer.INSTANCE, c9iZ, 23);
                    i = 8388608;
                    break;
                case 24:
                    hotelRoomOptionsActionJson = (HotelRoomOptionsActionJson) c9j4A55.A8Z(HotelRoomOptionsActionJson$$serializer.INSTANCE, c9iZ, 24);
                    i = HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        HotelSelectionJson$$serializer hotelSelectionJson$$serializer = new HotelSelectionJson$$serializer();
        INSTANCE = hotelSelectionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.hotels.HotelSelectionJson", hotelSelectionJson$$serializer, 25);
        c9iKA1C.A08("schema_version", true);
        c9iKA1C.A08("provider", true);
        c9iKA1C.A08("attribution", true);
        c9iKA1C.A08("address", true);
        c9iKA1C.A08("phone_number", true);
        c9iKA1C.A08("property_page_url", true);
        c9iKA1C.A08("selection_ref", true);
        c9iKA1C.A08("trip", true);
        c9iKA1C.A08("hotel", true);
        c9iKA1C.A08("gallery", true);
        c9iKA1C.A08("star_rating", true);
        C60O.A1V("guest_review", c9iKA1C, true);
        c9iKA1C.A08("room_description", true);
        c9iKA1C.A08("room_max_guests", true);
        c9iKA1C.A08("amenity_highlights", true);
        c9iKA1C.A08("price", true);
        c9iKA1C.A08("payment", true);
        c9iKA1C.A08(HatchPauseQplLogger.REASON_CANCELLATION, true);
        c9iKA1C.A08(NativeLoginTosDisclosureKt.TOKEN_POLICIES, true);
        c9iKA1C.A08("captured_at", true);
        c9iKA1C.A08("price_changed", true);
        c9iKA1C.A08("booking_action", true);
        c9iKA1C.A08("website_action", true);
        c9iKA1C.A08("room_options_action", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HotelSelectionJson.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(HotelAttributionJson$$serializer.INSTANCE);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        C9hr c9hrA002 = AbstractC07749im.A00(jsonElementSerializer);
        C9hr c9hrA003 = AbstractC07749im.A00(jsonElementSerializer);
        C9hr c9hrA004 = AbstractC07749im.A00(jsonElementSerializer);
        C9hr c9hrA005 = AbstractC07749im.A00(HotelTripJson$$serializer.INSTANCE);
        C9hr c9hrA006 = AbstractC07749im.A00(HotelResultJson$$serializer.INSTANCE);
        C9hr c9hrA16 = C3cG.A16(f0cArr, 9);
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA008 = AbstractC07749im.A00(HotelGuestReviewJson$$serializer.INSTANCE);
        C9hr c9hrA009 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0010 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0011 = AbstractC07749im.A00(c07729ii);
        C9hr c9hrA162 = C3cG.A16(f0cArr, 15);
        C9hr c9hrA0012 = AbstractC07749im.A00(HotelSelectionPriceJson$$serializer.INSTANCE);
        C9hr c9hrA0013 = AbstractC07749im.A00(HotelPaymentJson$$serializer.INSTANCE);
        C9hr c9hrA0014 = AbstractC07749im.A00(HotelSelectionCancellationJson$$serializer.INSTANCE);
        C9hr c9hrA0015 = AbstractC07749im.A00(HotelSelectionPoliciesJson$$serializer.INSTANCE);
        C9hr c9hrA0016 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        HotelBookingActionJson$$serializer hotelBookingActionJson$$serializer = HotelBookingActionJson$$serializer.INSTANCE;
        return new C9hr[]{c07729ii, c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c07779iq, c9hrA005, c9hrA006, c9hrA16, c9hrA007, c9hrA008, c9hrA009, c9hrA0010, c9hrA0011, c9hrA162, c9hrA0012, c9hrA0013, c9hrA0014, c9hrA0015, c9hrA0016, c07839ix, AbstractC07749im.A00(hotelBookingActionJson$$serializer), AbstractC07749im.A00(hotelBookingActionJson$$serializer), AbstractC07749im.A00(HotelRoomOptionsActionJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HotelSelectionJson hotelSelectionJson) {
        AnonymousClass003.A0u(interfaceC07789is, hotelSelectionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HotelSelectionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(hotelSelectionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
