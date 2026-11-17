package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
public final /* synthetic */ class FlightCheckoutSegmentJson$$serializer implements C9cd<FlightCheckoutSegmentJson> {
    public static final int $stable = 0;
    public static final FlightCheckoutSegmentJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FlightCheckoutSegmentJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FlightCheckoutSegmentJson.$childSerializers;
        String strA0w = null;
        String strA0r = null;
        FlightCheckoutCarrierJson flightCheckoutCarrierJson = null;
        List listA0P = null;
        String strA0l = null;
        List listA0P2 = null;
        String strA0k = null;
        List listA0P3 = null;
        String strA0n = null;
        String strA0p = null;
        String strA0j = null;
        String strA0i = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FlightCheckoutSegmentJson(i, strA0w, strA0i, strA0j, strA0k, strA0l, listA0P2, strA0n, listA0P, listA0P3, strA0p, flightCheckoutCarrierJson, strA0r, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                case 8:
                    listA0P3 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i |= 512;
                    break;
                case 10:
                    flightCheckoutCarrierJson = (FlightCheckoutCarrierJson) c9j4A55.A8Z(FlightCheckoutCarrierJson$$serializer.INSTANCE, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FlightCheckoutSegmentJson$$serializer flightCheckoutSegmentJson$$serializer = new FlightCheckoutSegmentJson$$serializer();
        INSTANCE = flightCheckoutSegmentJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.FlightCheckoutSegmentJson", flightCheckoutSegmentJson$$serializer, 12);
        boolean zA1R = C3cG.A1R(c9iKA1C);
        c9iKA1C.A08("departing_display", zA1R);
        c9iKA1C.A08("arriving_display", zA1R);
        c9iKA1C.A08("seats_display", zA1R);
        c9iKA1C.A08("flight_display", zA1R);
        c9iKA1C.A08("detail_rows", zA1R);
        c9iKA1C.A08("airline_icon", zA1R);
        c9iKA1C.A08("seat_assignments", zA1R);
        c9iKA1C.A08("baggage", zA1R);
        c9iKA1C.A08("departing_at_local", zA1R);
        c9iKA1C.A08("marketing_carrier", zA1R);
        c9iKA1C.A08("marketing_flight_number", zA1R);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FlightCheckoutSegmentJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 5), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 7), C3cG.A16(f0cArr, 8), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(FlightCheckoutCarrierJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FlightCheckoutSegmentJson flightCheckoutSegmentJson) {
        AnonymousClass003.A0u(interfaceC07789is, flightCheckoutSegmentJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FlightCheckoutSegmentJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(flightCheckoutSegmentJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
