package com.facebook.aura.model;

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
public final /* synthetic */ class FlightRowFlightDataJson$$serializer implements C9cd<FlightRowFlightDataJson> {
    public static final int $stable = 0;
    public static final FlightRowFlightDataJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FlightRowFlightDataJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FlightRowFlightDataJson.$childSerializers;
        String strA0f = null;
        List listA0Q = null;
        FlightRowBagsJson flightRowBagsJson = null;
        String strA0r = null;
        String strA0k = null;
        String str = null;
        String strA0j = null;
        String strA0t = null;
        String strA0s = null;
        String strA0q = null;
        String strA0p = null;
        List listA0P = null;
        String strA8f = null;
        String strA8f2 = null;
        String strA0u = null;
        String strA0f2 = null;
        List list = null;
        String strA0f3 = null;
        String strA0g = null;
        String strA0f4 = null;
        String strA0f5 = null;
        int i2 = 0;
        int iA8U = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FlightRowFlightDataJson(i2, strA8f, strA0f, strA0j, strA0k, iA8U, listA0P, flightRowBagsJson, zA8G, str, strA0p, strA0q, strA0r, strA0s, strA0t, strA8f2, strA0u, strA0f2, list, strA0f3, strA0g, strA0f4, strA0f5, listA0Q, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    iA8U = c9j4A55.A8U(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    flightRowBagsJson = (FlightRowBagsJson) c9j4A55.A8Z(FlightRowBagsJson$$serializer.INSTANCE, c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
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
                    strA8f2 = c9j4A55.A8f(c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i = 32768;
                    break;
                case 16:
                    strA0f2 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 16);
                    i = 65536;
                    break;
                case 17:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 17);
                    i = 131072;
                    break;
                case 18:
                    strA0f3 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i = 262144;
                    break;
                case 19:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 19);
                    i = 524288;
                    break;
                case 20:
                    strA0f4 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 20);
                    i = 1048576;
                    break;
                case 21:
                    strA0f5 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 21);
                    i = 2097152;
                    break;
                case 22:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 22);
                    i = 4194304;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        FlightRowFlightDataJson$$serializer flightRowFlightDataJson$$serializer = new FlightRowFlightDataJson$$serializer();
        INSTANCE = flightRowFlightDataJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.FlightRowFlightDataJson", flightRowFlightDataJson$$serializer, 23);
        boolean zA1Q = C3cG.A1Q(c9iKA1C);
        c9iKA1C.A08("airline", zA1Q);
        c9iKA1C.A08("price", zA1Q);
        c9iKA1C.A08("duration", zA1Q);
        c9iKA1C.A08("stops", zA1Q);
        c9iKA1C.A08("slices", zA1Q);
        c9iKA1C.A08("bags", zA1Q);
        c9iKA1C.A08("baggage_varies", zA1Q);
        c9iKA1C.A08("refundable", zA1Q);
        c9iKA1C.A08("changeable", zA1Q);
        c9iKA1C.A08("refund_penalty", zA1Q);
        c9iKA1C.A08("change_penalty", zA1Q);
        c9iKA1C.A08("refund_penalty_status", zA1Q);
        c9iKA1C.A08("change_penalty_status", zA1Q);
        c9iKA1C.A08("response_message", zA1Q);
        c9iKA1C.A08("flight_link", zA1Q);
        c9iKA1C.A08("cta_text", zA1Q);
        c9iKA1C.A08("passengers", zA1Q);
        c9iKA1C.A08("price_per_passenger", zA1Q);
        c9iKA1C.A08("selection_stage", zA1Q);
        c9iKA1C.A08("from_price", zA1Q);
        c9iKA1C.A08("from_price_per_passenger", zA1Q);
        c9iKA1C.A08("price_breakdown", zA1Q);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FlightRowFlightDataJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C07729ii.A00, C3cG.A16(f0cArr, 5), AbstractC07749im.A00(FlightRowBagsJson$$serializer.INSTANCE), C07839ix.A00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 17), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 22)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FlightRowFlightDataJson flightRowFlightDataJson) {
        AnonymousClass003.A0u(interfaceC07789is, flightRowFlightDataJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FlightRowFlightDataJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(flightRowFlightDataJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
