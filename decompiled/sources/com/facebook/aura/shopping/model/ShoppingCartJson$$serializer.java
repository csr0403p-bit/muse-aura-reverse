package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.gateway.ConnectorOrderCheckoutKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ShoppingCartJson$$serializer implements C9cd<ShoppingCartJson> {
    public static final int $stable = 0;
    public static final ShoppingCartJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShoppingCartJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ShoppingCartJson.$childSerializers;
        String strA8f = null;
        ShoppingSecondaryActionJson shoppingSecondaryActionJson = null;
        ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson = null;
        String strA0w = null;
        ShoppingCartAttributionJson shoppingCartAttributionJson = null;
        List list = null;
        String strA0i = null;
        String strA0o = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShoppingCartJson(i, strA8f, list, strA0i, strA0o, shoppingCartAttributionJson, strA0w, shoppingCartCheckoutActionJson, shoppingSecondaryActionJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) C9j4.A00(c9iZ, c9j4A55, f0cArr, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    shoppingCartAttributionJson = (ShoppingCartAttributionJson) c9j4A55.A8Z(ShoppingCartAttributionJson$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    shoppingCartCheckoutActionJson = (ShoppingCartCheckoutActionJson) c9j4A55.A8Z(ShoppingCartCheckoutActionJson$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    shoppingSecondaryActionJson = (ShoppingSecondaryActionJson) c9j4A55.A8Z(ShoppingSecondaryActionJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ShoppingCartJson$$serializer shoppingCartJson$$serializer = new ShoppingCartJson$$serializer();
        INSTANCE = shoppingCartJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.ShoppingCartJson", shoppingCartJson$$serializer, 8);
        boolean zA1R = C3cG.A1R(c9iKA1C);
        c9iKA1C.A08(ConnectorOrderCheckoutKt.ITEMS_KEY, zA1R);
        c9iKA1C.A08("subtotal", zA1R);
        c9iKA1C.A08("retailer_name", zA1R);
        c9iKA1C.A08("attribution", zA1R);
        c9iKA1C.A08("captured_at", zA1R);
        c9iKA1C.A08("checkout_action", zA1R);
        c9iKA1C.A08("secondary_action", zA1R);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ShoppingCartJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C3cH.A14(f0cArr, 1), c07779iq, c07779iq, AbstractC07749im.A00(ShoppingCartAttributionJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ShoppingCartCheckoutActionJson$$serializer.INSTANCE), AbstractC07749im.A00(ShoppingSecondaryActionJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShoppingCartJson shoppingCartJson) {
        AnonymousClass003.A0u(interfaceC07789is, shoppingCartJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShoppingCartJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(shoppingCartJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
