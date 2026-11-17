package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
public final /* synthetic */ class DeliveryCheckoutStopJson$$serializer implements C9cd<DeliveryCheckoutStopJson> {
    public static final int $stable = 0;
    public static final DeliveryCheckoutStopJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final DeliveryCheckoutStopJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        String strA0w2 = null;
        String strA0i = null;
        DeliveryCheckoutAddressJson deliveryCheckoutAddressJson = null;
        DeliveryCheckoutContactJson deliveryCheckoutContactJson = null;
        DeliveryCheckoutTimeJson deliveryCheckoutTimeJson = null;
        String strA0w3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new DeliveryCheckoutStopJson(i, strA0w, strA0i, deliveryCheckoutAddressJson, deliveryCheckoutContactJson, deliveryCheckoutTimeJson, strA0w3, strA0w2, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    deliveryCheckoutAddressJson = (DeliveryCheckoutAddressJson) c9j4A55.A8Z(DeliveryCheckoutAddressJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    deliveryCheckoutContactJson = (DeliveryCheckoutContactJson) c9j4A55.A8Z(DeliveryCheckoutContactJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    deliveryCheckoutTimeJson = (DeliveryCheckoutTimeJson) c9j4A55.A8Z(DeliveryCheckoutTimeJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        DeliveryCheckoutStopJson$$serializer deliveryCheckoutStopJson$$serializer = new DeliveryCheckoutStopJson$$serializer();
        INSTANCE = deliveryCheckoutStopJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.DeliveryCheckoutStopJson", deliveryCheckoutStopJson$$serializer, 7);
        boolean zA1Q = C3cG.A1Q(c9iKA1C);
        c9iKA1C.A08("role", zA1Q);
        c9iKA1C.A08("address", zA1Q);
        c9iKA1C.A08("contact", zA1Q);
        c9iKA1C.A08("time", zA1Q);
        c9iKA1C.A08("handoff", zA1Q);
        c9iKA1C.A08("instructions", zA1Q);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(DeliveryCheckoutAddressJson$$serializer.INSTANCE), AbstractC07749im.A00(DeliveryCheckoutContactJson$$serializer.INSTANCE), AbstractC07749im.A00(DeliveryCheckoutTimeJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, DeliveryCheckoutStopJson deliveryCheckoutStopJson) {
        AnonymousClass003.A0u(interfaceC07789is, deliveryCheckoutStopJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        DeliveryCheckoutStopJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(deliveryCheckoutStopJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
