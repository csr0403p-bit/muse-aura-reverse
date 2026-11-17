package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
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
public final /* synthetic */ class CarRentalReservationApprovalJson$$serializer implements C9cd<CarRentalReservationApprovalJson> {
    public static final int $stable = 0;
    public static final CarRentalReservationApprovalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CarRentalReservationApprovalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = CarRentalReservationApprovalJson.$childSerializers;
        C2hx c2hx = null;
        List listA0Q = null;
        String str = null;
        String strA0g = null;
        String strA0h = null;
        String strA0n = null;
        CarRentalReservationStopJson carRentalReservationStopJson = null;
        CarRentalReservationStopJson carRentalReservationStopJson2 = null;
        CarRentalReservationVehicleJson carRentalReservationVehicleJson = null;
        CarRentalReservationSupplierJson carRentalReservationSupplierJson = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CarRentalReservationApprovalJson(i, iA8U, carRentalReservationSupplierJson, carRentalReservationVehicleJson, carRentalReservationStopJson2, carRentalReservationStopJson, strA0h, strA0n, strA0g, str, listA0Q, c2hx);
                case 0:
                    iA8U = c9j4A55.A8U(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    carRentalReservationSupplierJson = (CarRentalReservationSupplierJson) c9j4A55.A8Z(CarRentalReservationSupplierJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    carRentalReservationVehicleJson = (CarRentalReservationVehicleJson) c9j4A55.A8Z(CarRentalReservationVehicleJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    carRentalReservationStopJson2 = (CarRentalReservationStopJson) c9j4A55.A8Z(CarRentalReservationStopJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    carRentalReservationStopJson = (CarRentalReservationStopJson) c9j4A55.A8Z(CarRentalReservationStopJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0h = C3cI.A0h(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        CarRentalReservationApprovalJson$$serializer carRentalReservationApprovalJson$$serializer = new CarRentalReservationApprovalJson$$serializer();
        INSTANCE = carRentalReservationApprovalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.CarRentalReservationApprovalJson", carRentalReservationApprovalJson$$serializer, 10);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("supplier", true);
        c9iKA1C.A08("vehicle", true);
        c9iKA1C.A08("pickup", true);
        c9iKA1C.A08("dropoff", true);
        c9iKA1C.A08("total_amount", true);
        c9iKA1C.A08("total_currency", true);
        c9iKA1C.A08("payment_type", true);
        c9iKA1C.A08("driver_name", true);
        c9iKA1C.A08("legal_links", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = CarRentalReservationApprovalJson.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(CarRentalReservationSupplierJson$$serializer.INSTANCE);
        C9hr c9hrA002 = AbstractC07749im.A00(CarRentalReservationVehicleJson$$serializer.INSTANCE);
        CarRentalReservationStopJson$$serializer carRentalReservationStopJson$$serializer = CarRentalReservationStopJson$$serializer.INSTANCE;
        C9hr c9hrA003 = AbstractC07749im.A00(carRentalReservationStopJson$$serializer);
        C9hr c9hrA004 = AbstractC07749im.A00(carRentalReservationStopJson$$serializer);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07729ii, c9hrA00, c9hrA002, c9hrA003, c9hrA004, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 9)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CarRentalReservationApprovalJson carRentalReservationApprovalJson) {
        AnonymousClass003.A0u(interfaceC07789is, carRentalReservationApprovalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CarRentalReservationApprovalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(carRentalReservationApprovalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
