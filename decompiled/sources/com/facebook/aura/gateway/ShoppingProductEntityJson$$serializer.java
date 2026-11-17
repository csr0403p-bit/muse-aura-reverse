package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
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
import com.facebook.aura.shopping.model.LenientShoppingConnectorSerializer;
import com.facebook.aura.shopping.model.ShoppingConnectorJson;
import com.facebook.aura.shopping.model.ShoppingSecondaryActionJson;
import com.facebook.aura.shopping.model.ShoppingSecondaryActionJson$$serializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ShoppingProductEntityJson$$serializer implements C9cd<ShoppingProductEntityJson> {
    public static final int $stable = 0;
    public static final ShoppingProductEntityJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShoppingProductEntityJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        int i2;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        int i3 = 0;
        ShoppingSecondaryActionJson shoppingSecondaryActionJson = null;
        ShoppingConnectorJson shoppingConnectorJson = null;
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
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShoppingProductEntityJson(i3, strA8f, strA0h, strA0i, strA0o, strA8f2, strA8f3, zA8G4, zA8G3, zA8G, zA8G2, strA8f4, strA8f5, strA8f6, strA8f7, strA8f8, strA8f9, shoppingSecondaryActionJson, strA8f10, shoppingConnectorJson, c2hx);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i3 |= 1;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i3 |= 2;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i3 |= 4;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i3 |= 8;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i3 |= 16;
                case 5:
                    strA8f3 = c9j4A55.A8f(c9iZ, 5);
                    i3 |= 32;
                case 6:
                    zA8G4 = c9j4A55.A8G(c9iZ, 6);
                    i3 |= 64;
                case 7:
                    zA8G3 = c9j4A55.A8G(c9iZ, 7);
                    i3 |= 128;
                case 8:
                    zA8G = c9j4A55.A8G(c9iZ, 8);
                    i3 |= 256;
                case 9:
                    zA8G2 = c9j4A55.A8G(c9iZ, 9);
                    i3 |= 512;
                case 10:
                    strA8f4 = c9j4A55.A8f(c9iZ, 10);
                    i3 |= 1024;
                case 11:
                    strA8f5 = c9j4A55.A8f(c9iZ, 11);
                    i3 |= 2048;
                case 12:
                    strA8f6 = c9j4A55.A8f(c9iZ, 12);
                    i3 |= 4096;
                case 13:
                    strA8f7 = c9j4A55.A8f(c9iZ, 13);
                    i3 |= 8192;
                case 14:
                    strA8f8 = c9j4A55.A8f(c9iZ, 14);
                    i3 |= 16384;
                case 15:
                    strA8f9 = c9j4A55.A8f(c9iZ, 15);
                    i2 = 32768;
                    i3 |= i2;
                case 16:
                    shoppingSecondaryActionJson = (ShoppingSecondaryActionJson) c9j4A55.A8Z(ShoppingSecondaryActionJson$$serializer.INSTANCE, c9iZ, 16);
                    i2 = 65536;
                    i3 |= i2;
                case 17:
                    strA8f10 = c9j4A55.A8f(c9iZ, 17);
                    i = 131072;
                    i3 |= i;
                case 18:
                    shoppingConnectorJson = (ShoppingConnectorJson) c9j4A55.A8Z(LenientShoppingConnectorSerializer.INSTANCE, c9iZ, 18);
                    i = 262144;
                    i3 |= i;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ShoppingProductEntityJson$$serializer shoppingProductEntityJson$$serializer = new ShoppingProductEntityJson$$serializer();
        INSTANCE = shoppingProductEntityJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.ShoppingProductEntityJson", shoppingProductEntityJson$$serializer, 19);
        c9iKA1C.A08("citation_id", true);
        C3cI.A1N("product_name", c9iKA1C, true);
        c9iKA1C.A08("product_id", true);
        c9iKA1C.A08("product_type", true);
        c9iKA1C.A08("image_url", true);
        c9iKA1C.A08("is_unavailable", true);
        c9iKA1C.A08("is_agentic_checkout_creation_enabled", true);
        c9iKA1C.A08("is_agentic_checkout_completion_enabled", true);
        c9iKA1C.A08("is_image_available", true);
        c9iKA1C.A08("provider", true);
        c9iKA1C.A08("primary_action", true);
        c9iKA1C.A08("retailer_name", true);
        c9iKA1C.A08("brand", true);
        c9iKA1C.A08("price", true);
        c9iKA1C.A08("sale_price", true);
        c9iKA1C.A08("secondary_action", true);
        c9iKA1C.A08("currency", true);
        c9iKA1C.A08(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07839ix, c07839ix, c07839ix, c07839ix, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(ShoppingSecondaryActionJson$$serializer.INSTANCE), c07779iq, AbstractC07749im.A00(LenientShoppingConnectorSerializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShoppingProductEntityJson shoppingProductEntityJson) {
        AnonymousClass003.A0u(interfaceC07789is, shoppingProductEntityJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShoppingProductEntityJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(shoppingProductEntityJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
