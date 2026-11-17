package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt;
import com.facebook.aura.perf.HatchPauseQplLogger;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutLodgingJson$$serializer implements C9cd<CheckoutLodgingJson> {
    public static final int $stable = 0;
    public static final CheckoutLodgingJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CheckoutLodgingJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        JsonElement jsonElementA17 = null;
        CheckoutLodgingTripJson checkoutLodgingTripJson = null;
        CheckoutLodgingRoomJson checkoutLodgingRoomJson = null;
        CheckoutLodgingCancellationJson checkoutLodgingCancellationJson = null;
        JsonElement jsonElementA172 = null;
        JsonElement jsonElementA173 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CheckoutLodgingJson(i, strA0w, checkoutLodgingTripJson, checkoutLodgingRoomJson, checkoutLodgingCancellationJson, jsonElementA172, jsonElementA173, jsonElementA17, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    checkoutLodgingTripJson = (CheckoutLodgingTripJson) c9j4A55.A8Z(CheckoutLodgingTripJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    checkoutLodgingRoomJson = (CheckoutLodgingRoomJson) c9j4A55.A8Z(CheckoutLodgingRoomJson$$serializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    checkoutLodgingCancellationJson = (CheckoutLodgingCancellationJson) c9j4A55.A8Z(CheckoutLodgingCancellationJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    jsonElementA172 = C3cI.A17(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    jsonElementA173 = C3cI.A17(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    jsonElementA17 = C3cI.A17(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        CheckoutLodgingJson$$serializer checkoutLodgingJson$$serializer = new CheckoutLodgingJson$$serializer();
        INSTANCE = checkoutLodgingJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.CheckoutLodgingJson", checkoutLodgingJson$$serializer, 7);
        c9iKA1C.A08(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, true);
        c9iKA1C.A08("trip", true);
        c9iKA1C.A08("room", true);
        c9iKA1C.A08(HatchPauseQplLogger.REASON_CANCELLATION, true);
        c9iKA1C.A08("price", true);
        c9iKA1C.A08("payment", true);
        c9iKA1C.A08(NativeLoginTosDisclosureKt.TOKEN_POLICIES, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cJ.A1A(JsonElementSerializer.A00, C3cG.A15(), AbstractC07749im.A00(CheckoutLodgingTripJson$$serializer.INSTANCE), AbstractC07749im.A00(CheckoutLodgingRoomJson$$serializer.INSTANCE), AbstractC07749im.A00(CheckoutLodgingCancellationJson$$serializer.INSTANCE));
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, CheckoutLodgingJson checkoutLodgingJson) {
        AnonymousClass003.A0u(interfaceC07789is, checkoutLodgingJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CheckoutLodgingJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(checkoutLodgingJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
