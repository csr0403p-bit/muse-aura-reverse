package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60O;
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

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ShoppingResultsPresentation$$serializer implements C9cd<ShoppingResultsPresentation> {
    public static final int $stable = 0;
    public static final ShoppingResultsPresentation$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShoppingResultsPresentation deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ShoppingResultsPresentation.$childSerializers;
        List listA0P = null;
        ShoppingCollection shoppingCollection = null;
        String strA0w = null;
        ShoppingResultsAttribution shoppingResultsAttribution = null;
        String strA0j = null;
        String strA8f = null;
        String strA0w2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShoppingResultsPresentation(i, listA0P, shoppingResultsAttribution, strA0j, strA8f, strA0w2, strA0w, shoppingCollection, null);
                case 0:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 0);
                    i |= 1;
                    break;
                case 1:
                    shoppingResultsAttribution = (ShoppingResultsAttribution) c9j4A55.A8Z(ShoppingResultsAttribution$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA8f = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    shoppingCollection = (ShoppingCollection) c9j4A55.A8Z(ShoppingCollection$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ShoppingResultsPresentation$$serializer shoppingResultsPresentation$$serializer = new ShoppingResultsPresentation$$serializer();
        INSTANCE = shoppingResultsPresentation$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.ShoppingResultsPresentation", shoppingResultsPresentation$$serializer, 7);
        c9iKA1C.A08("products", false);
        c9iKA1C.A08("attribution", true);
        c9iKA1C.A08("widgetId", true);
        C3cI.A1P("kind", c9iKA1C, true);
        C60O.A1W(c9iKA1C, true);
        c9iKA1C.A08("shoppingCollection", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9hr c9hrA0z = C3cH.A0z(ShoppingResultsPresentation.$childSerializers);
        C9hr c9hrA00 = AbstractC07749im.A00(ShoppingResultsAttribution$$serializer.INSTANCE);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA0z, c9hrA00, AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ShoppingCollection$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShoppingResultsPresentation shoppingResultsPresentation) {
        AnonymousClass003.A0u(interfaceC07789is, shoppingResultsPresentation);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShoppingResultsPresentation.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(shoppingResultsPresentation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
