package com.facebook.aura.model;

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
public final /* synthetic */ class FlightRowSegmentJson$$serializer implements C9cd<FlightRowSegmentJson> {
    public static final int $stable = 0;
    public static final FlightRowSegmentJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FlightRowSegmentJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FlightRowSegmentJson.$childSerializers;
        String strA8f = null;
        String strA0r = null;
        String strA0p = null;
        String str = null;
        String strA0o = null;
        String strA0m = null;
        List listA0P = null;
        String strA0n = null;
        String strA0l = null;
        FlightTimestampJson flightTimestampJson = null;
        FlightTimestampJson flightTimestampJson2 = null;
        String strA0h = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FlightRowSegmentJson(i, strA8f, strA0h, flightTimestampJson2, flightTimestampJson, strA0l, strA0m, strA0n, strA0o, str, strA0p, listA0P, strA0r, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    flightTimestampJson2 = (FlightTimestampJson) c9j4A55.A8Z(FlightTimestampJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    flightTimestampJson = (FlightTimestampJson) c9j4A55.A8Z(FlightTimestampJson$$serializer.INSTANCE, c9iZ, 3);
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
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
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
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 10);
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
        FlightRowSegmentJson$$serializer flightRowSegmentJson$$serializer = new FlightRowSegmentJson$$serializer();
        INSTANCE = flightRowSegmentJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.FlightRowSegmentJson", flightRowSegmentJson$$serializer, 12);
        boolean zA13 = C3cJ.A13(c9iKA1C);
        c9iKA1C.A08(GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_FLIGHT, zA13);
        c9iKA1C.A08("carrier", zA13);
        c9iKA1C.A08("airline_icon", zA13);
        c9iKA1C.A08("operating_carrier", zA13);
        c9iKA1C.A08("operating_flight", zA13);
        c9iKA1C.A08("passengers", zA13);
        c9iKA1C.A08("aircraft", zA13);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FlightRowSegmentJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        FlightTimestampJson$$serializer flightTimestampJson$$serializer = FlightTimestampJson$$serializer.INSTANCE;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(flightTimestampJson$$serializer), AbstractC07749im.A00(flightTimestampJson$$serializer), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 10), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FlightRowSegmentJson flightRowSegmentJson) {
        AnonymousClass003.A0u(interfaceC07789is, flightRowSegmentJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FlightRowSegmentJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(flightRowSegmentJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
