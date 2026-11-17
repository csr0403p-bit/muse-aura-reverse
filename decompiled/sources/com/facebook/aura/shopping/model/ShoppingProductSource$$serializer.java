package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ShoppingProductSource$$serializer implements C9cd<ShoppingProductSource> {
    public static final int $stable = 0;
    public static final ShoppingProductSource$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShoppingProductSource deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        String strA0i = null;
        String strA0w4 = null;
        Integer numA0X = null;
        String strA8f = null;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShoppingProductSource(i, strA0w3, strA0i, iA8U, strA0w4, numA0X, strA8f, strA0w2, strA0w, (C2hx) null);
                case 0:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    iA8U = c9j4A55.A8U(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w4 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    numA0X = C60Q.A0X(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ShoppingProductSource$$serializer shoppingProductSource$$serializer = new ShoppingProductSource$$serializer();
        INSTANCE = shoppingProductSource$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.ShoppingProductSource", shoppingProductSource$$serializer, 8);
        c9iKA1C.A08("presentationId", true);
        c9iKA1C.A08("presentationEventId", true);
        c9iKA1C.A08("index", false);
        c9iKA1C.A08("widgetId", true);
        C60O.A1S("wireIndex", c9iKA1C, true);
        c9iKA1C.A08("messageId", true);
        c9iKA1C.A08("citationId", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c9hrA00, c9hrA002, c07729ii, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07729ii), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShoppingProductSource shoppingProductSource) {
        AnonymousClass003.A0u(interfaceC07789is, shoppingProductSource);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShoppingProductSource.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(shoppingProductSource, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
