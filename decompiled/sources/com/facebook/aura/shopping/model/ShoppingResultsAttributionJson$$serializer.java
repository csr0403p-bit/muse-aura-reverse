package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C5hV;
import X.C60O;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class ShoppingResultsAttributionJson$$serializer implements C9cd<ShoppingResultsAttributionJson> {
    public static final int $stable = 0;
    public static final ShoppingResultsAttributionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShoppingResultsAttributionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA0g = null;
        String strA0g2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ShoppingResultsAttributionJson(i, strA8f, strA8f2, strA8f3, strA0g, strA0g2, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f3 = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA0g = C3cH.A0g(LenientShoppingStringSerializer.INSTANCE, c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                strA0g2 = C3cH.A0g(LenientShoppingStringSerializer.INSTANCE, c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        ShoppingResultsAttributionJson$$serializer shoppingResultsAttributionJson$$serializer = new ShoppingResultsAttributionJson$$serializer();
        INSTANCE = shoppingResultsAttributionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.ShoppingResultsAttributionJson", shoppingResultsAttributionJson$$serializer, 5);
        C3cH.A1G("provider", c9iKA1C, true);
        c9iKA1C.A08("icon_url", true);
        C60O.A1W(c9iKA1C, true);
        c9iKA1C.A08("website", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        LenientShoppingStringSerializer lenientShoppingStringSerializer = LenientShoppingStringSerializer.INSTANCE;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(lenientShoppingStringSerializer), AbstractC07749im.A00(lenientShoppingStringSerializer)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShoppingResultsAttributionJson shoppingResultsAttributionJson) {
        AnonymousClass003.A0u(interfaceC07789is, shoppingResultsAttributionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShoppingResultsAttributionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(shoppingResultsAttributionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
