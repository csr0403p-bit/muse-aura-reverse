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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class DeliveryCheckoutApprovalJson$$serializer implements C9cd<DeliveryCheckoutApprovalJson> {
    public static final int $stable = 0;
    public static final DeliveryCheckoutApprovalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final DeliveryCheckoutApprovalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = DeliveryCheckoutApprovalJson.$childSerializers;
        List listA0Q = null;
        List listA0Q2 = null;
        String strA0h = null;
        DeliveryCheckoutMoneyJson deliveryCheckoutMoneyJson = null;
        JsonElement jsonElementA16 = null;
        String strA0l = null;
        String strA0k = null;
        List listA0P = null;
        DeliveryCheckoutProviderJson deliveryCheckoutProviderJson = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new DeliveryCheckoutApprovalJson(i, iA8U, deliveryCheckoutProviderJson, listA0P, strA0k, strA0l, strA0h, deliveryCheckoutMoneyJson, listA0Q2, listA0Q, jsonElementA16, (C2hx) null);
                case 0:
                    iA8U = c9j4A55.A8U(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    deliveryCheckoutProviderJson = (DeliveryCheckoutProviderJson) c9j4A55.A8Z(DeliveryCheckoutProviderJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
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
                    strA0h = C3cI.A0h(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    deliveryCheckoutMoneyJson = (DeliveryCheckoutMoneyJson) c9j4A55.A8Z(DeliveryCheckoutMoneyJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    listA0Q2 = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                case 8:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 8);
                    i |= 256;
                    break;
                case 9:
                    jsonElementA16 = C3cI.A16(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        DeliveryCheckoutApprovalJson$$serializer deliveryCheckoutApprovalJson$$serializer = new DeliveryCheckoutApprovalJson$$serializer();
        INSTANCE = deliveryCheckoutApprovalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.DeliveryCheckoutApprovalJson", deliveryCheckoutApprovalJson$$serializer, 10);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("provider", true);
        c9iKA1C.A08("stops", true);
        c9iKA1C.A08("payment_method_label", true);
        c9iKA1C.A08("payment_source", true);
        c9iKA1C.A08("card_last4", true);
        c9iKA1C.A08("total", true);
        c9iKA1C.A08("price_breakdown", true);
        c9iKA1C.A08("legal_links", true);
        c9iKA1C.A08("legal_notice", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = DeliveryCheckoutApprovalJson.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(DeliveryCheckoutProviderJson$$serializer.INSTANCE);
        C9hr c9hrA11 = C3cH.A11(f0cArr);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07729ii, c9hrA00, c9hrA11, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(DeliveryCheckoutMoneyJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 7), C3cG.A16(f0cArr, 8), AbstractC07749im.A00(JsonElementSerializer.A00)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, DeliveryCheckoutApprovalJson deliveryCheckoutApprovalJson) {
        AnonymousClass003.A0u(interfaceC07789is, deliveryCheckoutApprovalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        DeliveryCheckoutApprovalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(deliveryCheckoutApprovalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
