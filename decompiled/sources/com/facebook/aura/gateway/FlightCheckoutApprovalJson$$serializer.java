package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
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
public final /* synthetic */ class FlightCheckoutApprovalJson$$serializer implements C9cd<FlightCheckoutApprovalJson> {
    public static final int $stable = 0;
    public static final FlightCheckoutApprovalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FlightCheckoutApprovalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FlightCheckoutApprovalJson.$childSerializers;
        CheckoutMerchantJson checkoutMerchantJson = null;
        List listA0Q = null;
        List listA0Q2 = null;
        String strA0g = null;
        String str = null;
        String strA0l = null;
        List listA0P = null;
        List listA0P2 = null;
        String strA0k = null;
        String strA0o = null;
        String strA0r = null;
        List listA0P3 = null;
        String strA0s = null;
        String strA0t = null;
        PaymentSelectionJson paymentSelectionJson = null;
        int i = 0;
        int iA8U = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new FlightCheckoutApprovalJson(i, iA8U, checkoutMerchantJson, strA0g, strA0k, strA0l, listA0P2, listA0Q2, strA0o, str, listA0P, listA0P3, strA0r, strA0s, strA0t, paymentSelectionJson, listA0Q, (C2hx) null);
                case 0:
                    iA8U = c9j4A55.A8U(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    checkoutMerchantJson = (CheckoutMerchantJson) c9j4A55.A8Z(CheckoutMerchantJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0g = C3cI.A0g(c9iZ, c9j4A55);
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
                    listA0Q2 = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 6);
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
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 9);
                    i |= 512;
                    break;
                case 10:
                    listA0P3 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 10);
                    i |= 1024;
                    break;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i |= 2048;
                    break;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i |= 4096;
                    break;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i |= 8192;
                    break;
                case 14:
                    paymentSelectionJson = (PaymentSelectionJson) c9j4A55.A8Z(PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 14);
                    i |= 16384;
                    break;
                case 15:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 15);
                    i |= 32768;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        FlightCheckoutApprovalJson$$serializer flightCheckoutApprovalJson$$serializer = new FlightCheckoutApprovalJson$$serializer();
        INSTANCE = flightCheckoutApprovalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.FlightCheckoutApprovalJson", flightCheckoutApprovalJson$$serializer, 16);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("merchant", true);
        c9iKA1C.A08("trip_type_label", true);
        c9iKA1C.A08("carrier_label", true);
        c9iKA1C.A08("carrier_detail", true);
        c9iKA1C.A08("slices", true);
        C3cJ.A0n("passengers", c9iKA1C);
        C3cJ.A0x(c9iKA1C);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FlightCheckoutApprovalJson.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(CheckoutMerchantJson$$serializer.INSTANCE);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07729ii, c9hrA00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 5), C3cG.A16(f0cArr, 6), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 9), C3cG.A16(f0cArr, 10), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(PaymentSelectionJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 15)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FlightCheckoutApprovalJson flightCheckoutApprovalJson) {
        AnonymousClass003.A0u(interfaceC07789is, flightCheckoutApprovalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FlightCheckoutApprovalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(flightCheckoutApprovalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
