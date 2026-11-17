package com.facebook.aura.rentalcars;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class RentalCarRateJson$$serializer implements C9cd<RentalCarRateJson> {
    public static final int $stable = 0;
    public static final RentalCarRateJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final RentalCarRateJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        RentalCarMileageJson rentalCarMileageJson = null;
        String strA0w = null;
        String strA0w2 = null;
        RentalCarLocationJson rentalCarLocationJson = null;
        RentalCarVehicleJson rentalCarVehicleJson = null;
        RentalCarLocationJson rentalCarLocationJson2 = null;
        RentalCarSupplierJson rentalCarSupplierJson = null;
        String strA0k = null;
        String strA0h = null;
        String strA0i = null;
        String strA8f2 = null;
        String strA8f3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new RentalCarRateJson(i, strA8f, strA0h, strA0i, strA0k, rentalCarMileageJson, rentalCarSupplierJson, rentalCarVehicleJson, rentalCarLocationJson2, rentalCarLocationJson, strA8f2, strA0w2, strA8f3, strA0w, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    rentalCarMileageJson = (RentalCarMileageJson) c9j4A55.A8Z(RentalCarMileageJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    rentalCarSupplierJson = (RentalCarSupplierJson) c9j4A55.A8Z(RentalCarSupplierJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    rentalCarVehicleJson = (RentalCarVehicleJson) c9j4A55.A8Z(RentalCarVehicleJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    rentalCarLocationJson2 = (RentalCarLocationJson) c9j4A55.A8Z(RentalCarLocationJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    rentalCarLocationJson = (RentalCarLocationJson) c9j4A55.A8Z(RentalCarLocationJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA8f2 = c9j4A55.A8f(c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 10);
                    i |= 1024;
                    break;
                case 11:
                    strA8f3 = c9j4A55.A8f(c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 12);
                    i |= 4096;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        RentalCarRateJson$$serializer rentalCarRateJson$$serializer = new RentalCarRateJson$$serializer();
        INSTANCE = rentalCarRateJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.rentalcars.RentalCarRateJson", rentalCarRateJson$$serializer, 13);
        c9iKA1C.A08("rate_id", true);
        c9iKA1C.A08("total_amount", true);
        c9iKA1C.A08("total_currency", true);
        c9iKA1C.A08("payment_type", true);
        c9iKA1C.A08("mileage", true);
        c9iKA1C.A08("supplier", true);
        c9iKA1C.A08("car", true);
        c9iKA1C.A08("pickup_location", true);
        c9iKA1C.A08("dropoff_location", true);
        c9iKA1C.A08("pickup_date", true);
        c9iKA1C.A08("pickup_time", true);
        c9iKA1C.A08("dropoff_date", true);
        c9iKA1C.A08("dropoff_time", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(RentalCarMileageJson$$serializer.INSTANCE);
        C9hr c9hrA003 = AbstractC07749im.A00(RentalCarSupplierJson$$serializer.INSTANCE);
        C9hr c9hrA004 = AbstractC07749im.A00(RentalCarVehicleJson$$serializer.INSTANCE);
        RentalCarLocationJson$$serializer rentalCarLocationJson$$serializer = RentalCarLocationJson$$serializer.INSTANCE;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, AbstractC07749im.A00(rentalCarLocationJson$$serializer), AbstractC07749im.A00(rentalCarLocationJson$$serializer), c07779iq, AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, RentalCarRateJson rentalCarRateJson) {
        AnonymousClass003.A0u(interfaceC07789is, rentalCarRateJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        RentalCarRateJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_rentalcars_impl_impl(rentalCarRateJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
