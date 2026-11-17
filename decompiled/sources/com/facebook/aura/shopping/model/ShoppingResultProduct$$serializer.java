package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
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
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ShoppingResultProduct$$serializer implements C9cd<ShoppingResultProduct> {
    public static final int $stable = 0;
    public static final ShoppingResultProduct$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShoppingResultProduct deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ShoppingResultProduct.$childSerializers;
        String strA0g = null;
        String strA0g2 = null;
        String strA0o = null;
        String strA0m = null;
        String strA0n = null;
        String strA0l = null;
        Integer num = null;
        String strA0k = null;
        String str = null;
        String strA0u = null;
        String strA0s = null;
        ShoppingProductType shoppingProductType = null;
        String strA0w = null;
        String strA0h = null;
        ShoppingPrimaryAction shoppingPrimaryAction = null;
        ShoppingSecondaryAction shoppingSecondaryAction = null;
        ShoppingConnector shoppingConnector = null;
        int i2 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShoppingResultProduct(i2, strA0w, strA0h, strA0g, strA0k, strA0l, strA0m, strA0n, strA0o, shoppingProductType, zA8G3, zA8G2, zA8G4, strA0s, num, zA8G, strA0u, str, shoppingPrimaryAction, shoppingSecondaryAction, shoppingConnector, strA0g2, (C2hx) null);
                case 0:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0g = C3cI.A0g(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i2 |= 16;
                    continue;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i2 |= 64;
                    continue;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i2 |= 128;
                    continue;
                case 8:
                    shoppingProductType = (ShoppingProductType) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    zA8G3 = c9j4A55.A8G(c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    zA8G2 = c9j4A55.A8G(c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    zA8G4 = c9j4A55.A8G(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    zA8G = c9j4A55.A8G(c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i = 32768;
                    break;
                case 16:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    shoppingPrimaryAction = (ShoppingPrimaryAction) C9j4.A00(c9iZ, c9j4A55, f0cArr, 17);
                    i = 131072;
                    break;
                case 18:
                    shoppingSecondaryAction = (ShoppingSecondaryAction) c9j4A55.A8Z(ShoppingSecondaryAction$$serializer.INSTANCE, c9iZ, 18);
                    i = 262144;
                    break;
                case 19:
                    shoppingConnector = (ShoppingConnector) c9j4A55.A8Z(ShoppingConnector$$serializer.INSTANCE, c9iZ, 19);
                    i = 524288;
                    break;
                case 20:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 20);
                    i = 1048576;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        ShoppingResultProduct$$serializer shoppingResultProduct$$serializer = new ShoppingResultProduct$$serializer();
        INSTANCE = shoppingResultProduct$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.ShoppingResultProduct", shoppingResultProduct$$serializer, 21);
        C60O.A1T("productId", c9iKA1C, false);
        c9iKA1C.A08("brand", false);
        C9iK.A03("imageUrl", c9iKA1C, false);
        c9iKA1C.A08("salePrice", false);
        c9iKA1C.A08("priceCurrency", true);
        c9iKA1C.A08("url", false);
        c9iKA1C.A08("type", true);
        c9iKA1C.A08("isAgenticCheckoutCreationEnabled", true);
        c9iKA1C.A08("isAgenticCheckoutCompletionEnabled", true);
        c9iKA1C.A08("isUnavailable", true);
        c9iKA1C.A08("citationId", true);
        c9iKA1C.A08("wireIndex", true);
        c9iKA1C.A08("isImageAvailable", true);
        c9iKA1C.A08("provider", true);
        c9iKA1C.A08("retailerName", true);
        c9iKA1C.A08("primaryAction", true);
        c9iKA1C.A08("secondaryAction", true);
        c9iKA1C.A08(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, true);
        c9iKA1C.A08("highlightedAttribute", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ShoppingResultProduct.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA16 = C3cG.A16(f0cArr, 8);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c9hrA00, c07779iq, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, c9hrA16, c07839ix, c07839ix, c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07729ii.A00), c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 17), AbstractC07749im.A00(ShoppingSecondaryAction$$serializer.INSTANCE), AbstractC07749im.A00(ShoppingConnector$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShoppingResultProduct shoppingResultProduct) {
        AnonymousClass003.A0u(interfaceC07789is, shoppingResultProduct);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShoppingResultProduct.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(shoppingResultProduct, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
