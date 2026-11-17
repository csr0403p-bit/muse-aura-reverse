package com.facebook.aura.rentalcars;

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
/* loaded from: classes3.dex */
public final /* synthetic */ class RentalCarVehicleJson$$serializer implements C9cd<RentalCarVehicleJson> {
    public static final int $stable = 0;
    public static final RentalCarVehicleJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final RentalCarVehicleJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = RentalCarVehicleJson.$childSerializers;
        String strA0w = null;
        List listA0P = null;
        Boolean bool = null;
        String strA0w2 = null;
        RentalCarBaggageJson rentalCarBaggageJson = null;
        Integer num = null;
        String strA0k = null;
        String strA0i = null;
        String strA0j = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new RentalCarVehicleJson(i, strA0w, strA0i, strA0j, strA0k, num, rentalCarBaggageJson, bool, strA0w2, listA0P, (C2hx) null);
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
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    rentalCarBaggageJson = (RentalCarBaggageJson) c9j4A55.A8Z(RentalCarBaggageJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 8);
                    i |= 256;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        RentalCarVehicleJson$$serializer rentalCarVehicleJson$$serializer = new RentalCarVehicleJson$$serializer();
        INSTANCE = rentalCarVehicleJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.rentalcars.RentalCarVehicleJson", rentalCarVehicleJson$$serializer, 9);
        c9iKA1C.A08("name", true);
        C3cH.A1F("category", c9iKA1C, true);
        c9iKA1C.A08("transmission", true);
        c9iKA1C.A08("max_passengers", true);
        c9iKA1C.A08("baggage", true);
        c9iKA1C.A08("air_conditioning", true);
        c9iKA1C.A08("fuel", true);
        c9iKA1C.A08("images", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = RentalCarVehicleJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07729ii.A00), AbstractC07749im.A00(RentalCarBaggageJson$$serializer.INSTANCE), AbstractC07749im.A00(C07839ix.A00), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 8)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, RentalCarVehicleJson rentalCarVehicleJson) {
        AnonymousClass003.A0u(interfaceC07789is, rentalCarVehicleJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        RentalCarVehicleJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(rentalCarVehicleJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
