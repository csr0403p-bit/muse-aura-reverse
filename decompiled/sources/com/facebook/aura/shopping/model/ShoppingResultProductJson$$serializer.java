package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C60O;
import X.C60Q;
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
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ShoppingResultProductJson$$serializer implements C9cd<ShoppingResultProductJson> {
    public static final int $stable = 0;
    public static final ShoppingResultProductJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShoppingResultProductJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        JsonElement jsonElement = null;
        String strA0g = null;
        ShoppingConnectorJson shoppingConnectorJson = null;
        ShoppingSecondaryActionJson shoppingSecondaryActionJson = null;
        String strA8f = null;
        String strA0h = null;
        String strA0i = null;
        String strA0o = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        String strA8f6 = null;
        String strA8f7 = null;
        String strA8f8 = null;
        String strA8f9 = null;
        String strA8f10 = null;
        int i2 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShoppingResultProductJson(i2, strA8f, strA0h, strA0i, strA0o, strA8f2, strA8f3, strA8f4, strA8f5, strA8f6, strA8f7, zA8G2, zA8G, zA8G3, strA8f8, strA8f9, strA8f10, shoppingSecondaryActionJson, jsonElement, shoppingConnectorJson, strA0g, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strA8f3 = c9j4A55.A8f(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strA8f4 = c9j4A55.A8f(c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strA8f5 = c9j4A55.A8f(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    strA8f6 = c9j4A55.A8f(c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strA8f7 = c9j4A55.A8f(c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    zA8G2 = c9j4A55.A8G(c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    zA8G = c9j4A55.A8G(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    zA8G3 = c9j4A55.A8G(c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA8f8 = c9j4A55.A8f(c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA8f9 = c9j4A55.A8f(c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA8f10 = c9j4A55.A8f(c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    shoppingSecondaryActionJson = (ShoppingSecondaryActionJson) c9j4A55.A8Z(ShoppingSecondaryActionJson$$serializer.INSTANCE, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    shoppingConnectorJson = (ShoppingConnectorJson) c9j4A55.A8Z(LenientShoppingConnectorSerializer.INSTANCE, c9iZ, 18);
                    i = 262144;
                    break;
                case 19:
                    strA0g = C3cH.A0g(LenientShoppingStringSerializer.INSTANCE, c9iZ, c9j4A55, 19);
                    i = 524288;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        ShoppingResultProductJson$$serializer shoppingResultProductJson$$serializer = new ShoppingResultProductJson$$serializer();
        INSTANCE = shoppingResultProductJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.ShoppingResultProductJson", shoppingResultProductJson$$serializer, 20);
        c9iKA1C.A08("brand", true);
        c9iKA1C.A08("citation_id", true);
        C60O.A1T("image_url", c9iKA1C, true);
        c9iKA1C.A08("price", true);
        c9iKA1C.A08("product_id", true);
        c9iKA1C.A08("sale_price", true);
        C3cI.A1N("currency", c9iKA1C, true);
        c9iKA1C.A08("type", true);
        c9iKA1C.A08("is_agentic_checkout_creation_enabled", true);
        c9iKA1C.A08("is_image_available", true);
        c9iKA1C.A08("is_unavailable", true);
        c9iKA1C.A08("provider", true);
        c9iKA1C.A08("retailer_name", true);
        c9iKA1C.A08("primary_action", true);
        c9iKA1C.A08("secondary_action", true);
        c9iKA1C.A08("pdp_coupon", true);
        c9iKA1C.A08(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, true);
        c9iKA1C.A08("highlighted_attribute", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07839ix, c07839ix, c07839ix, c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(ShoppingSecondaryActionJson$$serializer.INSTANCE), AbstractC07749im.A00(JsonElementSerializer.A00), AbstractC07749im.A00(LenientShoppingConnectorSerializer.INSTANCE), AbstractC07749im.A00(LenientShoppingStringSerializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShoppingResultProductJson shoppingResultProductJson) {
        AnonymousClass003.A0u(interfaceC07789is, shoppingResultProductJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShoppingResultProductJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(shoppingResultProductJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
