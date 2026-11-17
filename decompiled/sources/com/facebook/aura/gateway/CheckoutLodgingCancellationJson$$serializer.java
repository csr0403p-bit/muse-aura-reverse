package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
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
public final /* synthetic */ class CheckoutLodgingCancellationJson$$serializer implements C9cd<CheckoutLodgingCancellationJson> {
    public static final int $stable = 0;
    public static final CheckoutLodgingCancellationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CheckoutLodgingCancellationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Boolean boolA0M = null;
        Boolean boolA0M2 = null;
        String strA0w = null;
        String strA0w2 = null;
        JsonElement jsonElementA17 = null;
        String strA0w3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CheckoutLodgingCancellationJson(i, boolA0M, boolA0M2, strA0w, strA0w2, jsonElementA17, strA0w3, (C2hx) null);
                case 0:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    boolA0M2 = C3cI.A0M(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    jsonElementA17 = C3cI.A17(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        CheckoutLodgingCancellationJson$$serializer checkoutLodgingCancellationJson$$serializer = new CheckoutLodgingCancellationJson$$serializer();
        INSTANCE = checkoutLodgingCancellationJson$$serializer;
        descriptor = C3cJ.A0V("com.facebook.aura.gateway.CheckoutLodgingCancellationJson", checkoutLodgingCancellationJson$$serializer);
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07839ix c07839ix = C07839ix.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c07839ix);
        C9hr c9hrA002 = AbstractC07749im.A00(c07839ix);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA00, c9hrA002, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(JsonElementSerializer.A00), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CheckoutLodgingCancellationJson checkoutLodgingCancellationJson) {
        AnonymousClass003.A0u(interfaceC07789is, checkoutLodgingCancellationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CheckoutLodgingCancellationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(checkoutLodgingCancellationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
