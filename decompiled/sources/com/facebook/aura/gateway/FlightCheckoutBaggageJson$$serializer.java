package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class FlightCheckoutBaggageJson$$serializer implements C9cd<FlightCheckoutBaggageJson> {
    public static final int $stable = 0;
    public static final FlightCheckoutBaggageJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FlightCheckoutBaggageJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        Integer numA0N = null;
        String strA0v2 = null;
        Integer numA0N2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new FlightCheckoutBaggageJson(i, strA0v, numA0N, strA0v2, numA0N2, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                numA0N = C3cI.A0N(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                numA0N2 = C3cI.A0N(c9iZ, c9j4A55, 3);
                i |= 8;
            }
        }
    }

    static {
        FlightCheckoutBaggageJson$$serializer flightCheckoutBaggageJson$$serializer = new FlightCheckoutBaggageJson$$serializer();
        INSTANCE = flightCheckoutBaggageJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.FlightCheckoutBaggageJson", flightCheckoutBaggageJson$$serializer, 4);
        c9iKA1C.A08("passenger_name", true);
        C3cH.A1F("passenger_index", c9iKA1C, true);
        c9iKA1C.A08("quantity", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C07729ii c07729ii = C07729ii.A00;
        return C3cH.A1a(c07729ii, c9hrA00, AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(c07779iq));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FlightCheckoutBaggageJson flightCheckoutBaggageJson) {
        AnonymousClass003.A0u(interfaceC07789is, flightCheckoutBaggageJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FlightCheckoutBaggageJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(flightCheckoutBaggageJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
