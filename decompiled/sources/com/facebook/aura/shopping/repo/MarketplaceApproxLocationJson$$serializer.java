package com.facebook.aura.shopping.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
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
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class MarketplaceApproxLocationJson$$serializer implements C9cd<MarketplaceApproxLocationJson> {
    public static final MarketplaceApproxLocationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final MarketplaceApproxLocationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        JsonPrimitive jsonPrimitive = null;
        JsonPrimitive jsonPrimitive2 = null;
        JsonPrimitive jsonPrimitive3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new MarketplaceApproxLocationJson(i, jsonPrimitive, jsonPrimitive2, jsonPrimitive3, (C2hx) null);
            }
            if (iA8N == 0) {
                jsonPrimitive = (JsonPrimitive) c9j4A55.A8Z(JsonPrimitiveSerializer.A01, c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                jsonPrimitive2 = (JsonPrimitive) c9j4A55.A8Z(JsonPrimitiveSerializer.A01, c9iZ, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                jsonPrimitive3 = (JsonPrimitive) c9j4A55.A8Z(JsonPrimitiveSerializer.A01, c9iZ, 2);
                i |= 4;
            }
        }
    }

    static {
        MarketplaceApproxLocationJson$$serializer marketplaceApproxLocationJson$$serializer = new MarketplaceApproxLocationJson$$serializer();
        INSTANCE = marketplaceApproxLocationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.repo.MarketplaceApproxLocationJson", marketplaceApproxLocationJson$$serializer, 3);
        C9iK.A06(c9iKA1C, true);
        c9iKA1C.A08("radius_km", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        JsonPrimitiveSerializer jsonPrimitiveSerializer = JsonPrimitiveSerializer.A01;
        return C3cG.A1b(jsonPrimitiveSerializer, AbstractC07749im.A00(jsonPrimitiveSerializer), AbstractC07749im.A00(jsonPrimitiveSerializer));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, MarketplaceApproxLocationJson marketplaceApproxLocationJson) {
        AnonymousClass003.A0u(interfaceC07789is, marketplaceApproxLocationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        MarketplaceApproxLocationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(marketplaceApproxLocationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
