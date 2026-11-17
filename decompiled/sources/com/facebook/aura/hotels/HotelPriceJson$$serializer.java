package com.facebook.aura.hotels;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
public final /* synthetic */ class HotelPriceJson$$serializer implements C9cd<HotelPriceJson> {
    public static final int $stable = 0;
    public static final HotelPriceJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HotelPriceJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HotelPriceJson.$childSerializers;
        HotelMoneyJson hotelMoneyJsonA0J = null;
        HotelMoneyJson hotelMoneyJsonA0J2 = null;
        List listA0P = null;
        HotelMoneyJson hotelMoneyJsonA0J3 = null;
        HotelMoneyJson hotelMoneyJsonA0J4 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new HotelPriceJson(i, hotelMoneyJsonA0J, hotelMoneyJsonA0J2, listA0P, hotelMoneyJsonA0J3, hotelMoneyJsonA0J4, (C2hx) null);
            }
            if (iA8N == 0) {
                hotelMoneyJsonA0J = C60Q.A0J(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                hotelMoneyJsonA0J2 = C60Q.A0J(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else if (iA8N == 3) {
                hotelMoneyJsonA0J3 = C60Q.A0J(c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                hotelMoneyJsonA0J4 = C60Q.A0J(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        HotelPriceJson$$serializer hotelPriceJson$$serializer = new HotelPriceJson$$serializer();
        INSTANCE = hotelPriceJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.hotels.HotelPriceJson", hotelPriceJson$$serializer, 5);
        c9iKA1C.A08("total", true);
        c9iKA1C.A08("base_rate", true);
        c9iKA1C.A08(HotelBookingModelsJsonKt.TAXES_AND_FEES_KIND, true);
        c9iKA1C.A08("amount_before_property_fees", true);
        c9iKA1C.A08(HotelBookingModelsJsonKt.MANDATORY_PROPERTY_FEES_KIND, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = HotelPriceJson.$childSerializers;
        HotelMoneyJson$$serializer hotelMoneyJson$$serializer = HotelMoneyJson$$serializer.INSTANCE;
        return C3cI.A1b(hotelMoneyJson$$serializer, AbstractC07749im.A00(hotelMoneyJson$$serializer), AbstractC07749im.A00(hotelMoneyJson$$serializer), C3cH.A11(f0cArr), AbstractC07749im.A00(hotelMoneyJson$$serializer));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HotelPriceJson hotelPriceJson) {
        AnonymousClass003.A0u(interfaceC07789is, hotelPriceJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HotelPriceJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(hotelPriceJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
