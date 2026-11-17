package com.facebook.aura.hotels;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5hV;
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
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HotelSelectionPriceJson$$serializer implements C9cd<HotelSelectionPriceJson> {
    public static final int $stable = 0;
    public static final HotelSelectionPriceJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HotelSelectionPriceJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HotelSelectionPriceJson.$childSerializers;
        HotelMoneyJson hotelMoneyJsonA0J = null;
        List list = null;
        HotelMoneyJson hotelMoneyJsonA0J2 = null;
        HotelMoneyJson hotelMoneyJson = null;
        List listA0P = null;
        HotelMoneyJson hotelMoneyJsonA0J3 = null;
        HotelMoneyJson hotelMoneyJsonA0J4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HotelSelectionPriceJson(i, hotelMoneyJsonA0J, hotelMoneyJson, listA0P, hotelMoneyJsonA0J3, hotelMoneyJsonA0J4, hotelMoneyJsonA0J2, list, (C2hx) null);
                case 0:
                    hotelMoneyJsonA0J = C60Q.A0J(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    hotelMoneyJson = (HotelMoneyJson) c9j4A55.A8Z(HotelMoneyJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    hotelMoneyJsonA0J3 = C60Q.A0J(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    hotelMoneyJsonA0J4 = C60Q.A0J(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    hotelMoneyJsonA0J2 = C60Q.A0J(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HotelSelectionPriceJson$$serializer hotelSelectionPriceJson$$serializer = new HotelSelectionPriceJson$$serializer();
        INSTANCE = hotelSelectionPriceJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.hotels.HotelSelectionPriceJson", hotelSelectionPriceJson$$serializer, 7);
        c9iKA1C.A08("total", true);
        c9iKA1C.A08("base_rate", true);
        c9iKA1C.A08(HotelBookingModelsJsonKt.TAXES_AND_FEES_KIND, true);
        c9iKA1C.A08("amount_before_property_fees", true);
        c9iKA1C.A08(HotelBookingModelsJsonKt.MANDATORY_PROPERTY_FEES_KIND, true);
        c9iKA1C.A08("average_nightly_base_rate", true);
        c9iKA1C.A08("nightly_base_rates", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HotelSelectionPriceJson.$childSerializers;
        HotelMoneyJson$$serializer hotelMoneyJson$$serializer = HotelMoneyJson$$serializer.INSTANCE;
        return new C9hr[]{AbstractC07749im.A00(hotelMoneyJson$$serializer), AbstractC07749im.A00(hotelMoneyJson$$serializer), C3cH.A11(f0cArr), AbstractC07749im.A00(hotelMoneyJson$$serializer), AbstractC07749im.A00(hotelMoneyJson$$serializer), AbstractC07749im.A00(hotelMoneyJson$$serializer), C3cH.A14(f0cArr, 6)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HotelSelectionPriceJson hotelSelectionPriceJson) {
        AnonymousClass003.A0u(interfaceC07789is, hotelSelectionPriceJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HotelSelectionPriceJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(hotelSelectionPriceJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
