package com.facebook.aura.gateway;

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

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FlightCheckoutSliceJson$$serializer implements C9cd<FlightCheckoutSliceJson> {
    public static final int $stable = 0;
    public static final FlightCheckoutSliceJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FlightCheckoutSliceJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FlightCheckoutSliceJson.$childSerializers;
        FlightCheckoutPlaceJson flightCheckoutPlaceJson = null;
        List listA0P = null;
        String strA0w = null;
        FlightCheckoutPlaceJson flightCheckoutPlaceJson2 = null;
        String strA0j = null;
        FlightCheckoutStopsJson flightCheckoutStopsJson = null;
        String strA0w2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FlightCheckoutSliceJson(i, flightCheckoutPlaceJson, flightCheckoutPlaceJson2, strA0j, flightCheckoutStopsJson, strA0w2, strA0w, listA0P, (C2hx) null);
                case 0:
                    flightCheckoutPlaceJson = (FlightCheckoutPlaceJson) c9j4A55.A8Z(FlightCheckoutPlaceJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    flightCheckoutPlaceJson2 = (FlightCheckoutPlaceJson) c9j4A55.A8Z(FlightCheckoutPlaceJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    flightCheckoutStopsJson = (FlightCheckoutStopsJson) c9j4A55.A8Z(FlightCheckoutStopsJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FlightCheckoutSliceJson$$serializer flightCheckoutSliceJson$$serializer = new FlightCheckoutSliceJson$$serializer();
        INSTANCE = flightCheckoutSliceJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.FlightCheckoutSliceJson", flightCheckoutSliceJson$$serializer, 7);
        c9iKA1C.A08("origin", true);
        c9iKA1C.A08("destination", true);
        c9iKA1C.A08("departure_display", true);
        C3cH.A1G("stops", c9iKA1C, true);
        c9iKA1C.A08("subtitle", true);
        c9iKA1C.A08("segments", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FlightCheckoutSliceJson.$childSerializers;
        FlightCheckoutPlaceJson$$serializer flightCheckoutPlaceJson$$serializer = FlightCheckoutPlaceJson$$serializer.INSTANCE;
        C9hr c9hrA00 = AbstractC07749im.A00(flightCheckoutPlaceJson$$serializer);
        C9hr c9hrA002 = AbstractC07749im.A00(flightCheckoutPlaceJson$$serializer);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA00, c9hrA002, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(FlightCheckoutStopsJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 6)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FlightCheckoutSliceJson flightCheckoutSliceJson) {
        AnonymousClass003.A0u(interfaceC07789is, flightCheckoutSliceJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FlightCheckoutSliceJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(flightCheckoutSliceJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
