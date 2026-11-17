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
public final /* synthetic */ class FlightRowSlice$$serializer implements C9cd<FlightRowSlice> {
    public static final int $stable = 0;
    public static final FlightRowSlice$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FlightRowSlice deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FlightRowSlice.$childSerializers;
        List listA0P = null;
        String strA0n = null;
        String strA0w = null;
        String strA0l = null;
        FlightTimestamp flightTimestamp = null;
        FlightTimestamp flightTimestamp2 = null;
        String strA8f = null;
        String strA0h = null;
        boolean zA8G = false;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FlightRowSlice(i, strA8f, strA0h, flightTimestamp2, flightTimestamp, strA0l, iA8U, strA0n, zA8G, strA0w, listA0P, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    flightTimestamp2 = (FlightTimestamp) c9j4A55.A8Z(FlightTimestamp$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    flightTimestamp = (FlightTimestamp) c9j4A55.A8Z(FlightTimestamp$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    iA8U = c9j4A55.A8U(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                case 9:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FlightRowSlice$$serializer flightRowSlice$$serializer = new FlightRowSlice$$serializer();
        INSTANCE = flightRowSlice$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.FlightRowSlice", flightRowSlice$$serializer, 10);
        boolean zA13 = C3cJ.A13(c9iKA1C);
        c9iKA1C.A08("stops", zA13);
        c9iKA1C.A08("cabin", zA13);
        c9iKA1C.A08("cabinVaries", zA13);
        c9iKA1C.A08("fareBrand", zA13);
        c9iKA1C.A08("segments", zA13);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FlightRowSlice.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        FlightTimestamp$$serializer flightTimestamp$$serializer = FlightTimestamp$$serializer.INSTANCE;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(flightTimestamp$$serializer), AbstractC07749im.A00(flightTimestamp$$serializer), AbstractC07749im.A00(c07779iq), C07729ii.A00, AbstractC07749im.A00(c07779iq), C07839ix.A00, AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 9)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FlightRowSlice flightRowSlice) {
        AnonymousClass003.A0u(interfaceC07789is, flightRowSlice);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FlightRowSlice.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(flightRowSlice, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
