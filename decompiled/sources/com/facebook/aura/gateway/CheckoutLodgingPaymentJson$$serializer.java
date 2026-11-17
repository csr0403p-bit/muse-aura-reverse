package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutLodgingPaymentJson$$serializer implements C9cd<CheckoutLodgingPaymentJson> {
    public static final int $stable = 0;
    public static final CheckoutLodgingPaymentJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CheckoutLodgingPaymentJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        JsonElement jsonElementA16 = null;
        JsonElement jsonElementA162 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CheckoutLodgingPaymentJson(i, jsonElementA16, jsonElementA162, (C2hx) null);
            }
            if (iA8N == 0) {
                jsonElementA16 = C3cI.A16(c9iZ, c9j4A55, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                jsonElementA162 = C3cI.A16(c9iZ, c9j4A55, 1);
                i |= 2;
            }
        }
    }

    static {
        CheckoutLodgingPaymentJson$$serializer checkoutLodgingPaymentJson$$serializer = new CheckoutLodgingPaymentJson$$serializer();
        INSTANCE = checkoutLodgingPaymentJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.CheckoutLodgingPaymentJson", checkoutLodgingPaymentJson$$serializer, 2);
        c9iKA1C.A08("due_at_property", true);
        c9iKA1C.A08("installments", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        return C3cH.A1Z(jsonElementSerializer, AbstractC07749im.A00(jsonElementSerializer));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CheckoutLodgingPaymentJson checkoutLodgingPaymentJson) {
        AnonymousClass003.A0u(interfaceC07789is, checkoutLodgingPaymentJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CheckoutLodgingPaymentJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(checkoutLodgingPaymentJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
