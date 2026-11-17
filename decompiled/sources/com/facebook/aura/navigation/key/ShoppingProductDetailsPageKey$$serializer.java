package com.facebook.aura.navigation.key;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingPrimaryAction;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingProductSource$$serializer;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction$$serializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ShoppingProductDetailsPageKey$$serializer implements C9cd<ShoppingProductDetailsPageKey> {
    public static final ShoppingProductDetailsPageKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShoppingProductDetailsPageKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ShoppingProductDetailsPageKey.$childSerializers;
        ShoppingSaveTarget shoppingSaveTarget = null;
        ShoppingSecondaryAction shoppingSecondaryAction = null;
        String strA0g = null;
        String strA0g2 = null;
        String strA0g3 = null;
        ShoppingFormat shoppingFormat = null;
        ShoppingAddToCartTarget shoppingAddToCartTarget = null;
        ShoppingPrimaryAction shoppingPrimaryAction = null;
        String strA0g4 = null;
        String str = null;
        ShoppingProductSource shoppingProductSource = null;
        String str2 = null;
        String strA0g5 = null;
        String strA8f = null;
        String strA0i = null;
        String strA0j = null;
        String strA0k = null;
        String strA0l = null;
        ShoppingProductType shoppingProductType = null;
        String str3 = null;
        String strA0p = null;
        String strA0q = null;
        int i2 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShoppingProductDetailsPageKey(i2, strA8f, strA0i, strA0j, strA0k, strA0l, zA8G2, shoppingProductType, zA8G, str3, strA0p, strA0q, strA0g4, strA0g5, shoppingPrimaryAction, shoppingAddToCartTarget, shoppingSaveTarget, shoppingSecondaryAction, shoppingFormat, strA0g3, strA0g2, shoppingProductSource, strA0g, str, str2, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
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
                    zA8G2 = c9j4A55.A8G(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    shoppingProductType = (ShoppingProductType) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    str3 = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0g4 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0g5 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    shoppingPrimaryAction = (ShoppingPrimaryAction) C9j4.A00(c9iZ, c9j4A55, f0cArr, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    shoppingAddToCartTarget = (ShoppingAddToCartTarget) C9j4.A00(c9iZ, c9j4A55, f0cArr, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    shoppingSaveTarget = (ShoppingSaveTarget) C9j4.A00(c9iZ, c9j4A55, f0cArr, 15);
                    i = 32768;
                    break;
                case 16:
                    shoppingSecondaryAction = (ShoppingSecondaryAction) c9j4A55.A8Z(ShoppingSecondaryAction$$serializer.INSTANCE, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    shoppingFormat = (ShoppingFormat) C9j4.A00(c9iZ, c9j4A55, f0cArr, 17);
                    i = 131072;
                    break;
                case 18:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i = 262144;
                    break;
                case 19:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 19);
                    i = 524288;
                    break;
                case 20:
                    shoppingProductSource = (ShoppingProductSource) c9j4A55.A8Z(ShoppingProductSource$$serializer.INSTANCE, c9iZ, 20);
                    i = 1048576;
                    break;
                case 21:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 21);
                    i = 2097152;
                    break;
                case 22:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 22);
                    i = 4194304;
                    break;
                case 23:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 23);
                    i = 8388608;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        ShoppingProductDetailsPageKey$$serializer shoppingProductDetailsPageKey$$serializer = new ShoppingProductDetailsPageKey$$serializer();
        INSTANCE = shoppingProductDetailsPageKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey", shoppingProductDetailsPageKey$$serializer, 24);
        c9iKA1C.A08("productId", false);
        c9iKA1C.A08("sessionId", true);
        c9iKA1C.A08("brand", true);
        c9iKA1C.A08("merchantName", true);
        c9iKA1C.A08("merchantLogoUrl", true);
        c9iKA1C.A08("isPartnerMerchant", true);
        c9iKA1C.A08("productType", true);
        c9iKA1C.A08("canOfferBuyNow", true);
        c9iKA1C.A08("productUrl", true);
        c9iKA1C.A08("hydrationProductId", true);
        c9iKA1C.A08("hydrationConnectorId", true);
        c9iKA1C.A08("priceCurrency", true);
        c9iKA1C.A08("hostMessageId", true);
        c9iKA1C.A08("primaryAction", true);
        c9iKA1C.A08("addToCartTarget", true);
        c9iKA1C.A08("saveTarget", true);
        c9iKA1C.A08("secondaryAction", true);
        c9iKA1C.A08("entryFormat", false);
        c9iKA1C.A08("widgetId", false);
        c9iKA1C.A08("cardProductId", false);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_SOURCE, true);
        c9iKA1C.A08("sharedElementKey", true);
        c9iKA1C.A08("collectionId", true);
        c9iKA1C.A08("leadingHeroImageUrl", false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ShoppingProductDetailsPageKey.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c07839ix, C3cG.A16(f0cArr, 6), c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 13), C3cH.A14(f0cArr, 14), C3cH.A14(f0cArr, 15), AbstractC07749im.A00(ShoppingSecondaryAction$$serializer.INSTANCE), C3cH.A14(f0cArr, 17), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ShoppingProductSource$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShoppingProductDetailsPageKey shoppingProductDetailsPageKey) {
        AnonymousClass003.A0u(interfaceC07789is, shoppingProductDetailsPageKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShoppingProductDetailsPageKey.write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(shoppingProductDetailsPageKey, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
