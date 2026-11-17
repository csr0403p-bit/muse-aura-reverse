package com.facebook.aura.navigation.key;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingProductSource$$serializer;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction$$serializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class InstacartProductDetailsSheetKey$$serializer implements C9cd<InstacartProductDetailsSheetKey> {
    public static final InstacartProductDetailsSheetKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final InstacartProductDetailsSheetKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = InstacartProductDetailsSheetKey.$childSerializers;
        int i = 0;
        ShoppingProductSource shoppingProductSource = null;
        ShoppingAddToCartTarget shoppingAddToCartTarget = null;
        String strA0j = null;
        String strA0s = null;
        String str = null;
        ShoppingProductType shoppingProductType = null;
        String strA0l = null;
        ShoppingSecondaryAction shoppingSecondaryAction = null;
        String strA0m = null;
        String strA0k = null;
        ShoppingFormat shoppingFormat = null;
        String strA8f = null;
        String strA0f = null;
        String strA0t = null;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new InstacartProductDetailsSheetKey(i, strA8f, strA0f, strA0j, strA0k, strA0l, strA0m, zA8G, shoppingProductType, str, shoppingAddToCartTarget, shoppingSecondaryAction, shoppingFormat, strA0s, strA0t, shoppingProductSource, null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    zA8G = c9j4A55.A8G(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    shoppingProductType = (ShoppingProductType) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    shoppingAddToCartTarget = (ShoppingAddToCartTarget) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 9);
                    i |= 512;
                    break;
                case 10:
                    shoppingSecondaryAction = (ShoppingSecondaryAction) c9j4A55.A8Z(ShoppingSecondaryAction$$serializer.INSTANCE, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    shoppingFormat = (ShoppingFormat) C9j4.A00(c9iZ, c9j4A55, f0cArr, 11);
                    i |= 2048;
                    break;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i |= 4096;
                    break;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i |= 8192;
                    break;
                case 14:
                    shoppingProductSource = (ShoppingProductSource) c9j4A55.A8Z(ShoppingProductSource$$serializer.INSTANCE, c9iZ, 14);
                    i |= 16384;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        InstacartProductDetailsSheetKey$$serializer instacartProductDetailsSheetKey$$serializer = new InstacartProductDetailsSheetKey$$serializer();
        INSTANCE = instacartProductDetailsSheetKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey", instacartProductDetailsSheetKey$$serializer, 15);
        c9iKA1C.A08("productId", false);
        c9iKA1C.A08("sessionId", false);
        c9iKA1C.A08("hostMessageId", false);
        c9iKA1C.A08("brand", false);
        c9iKA1C.A08("merchantName", false);
        c9iKA1C.A08("merchantLogoUrl", false);
        c9iKA1C.A08("isPartnerMerchant", false);
        c9iKA1C.A08("productType", false);
        c9iKA1C.A08("productUrl", false);
        c9iKA1C.A08("addToCartTarget", false);
        c9iKA1C.A08("secondaryAction", false);
        c9iKA1C.A08("entryFormat", false);
        c9iKA1C.A08("widgetId", false);
        c9iKA1C.A08("cardProductId", false);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_SOURCE, false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = InstacartProductDetailsSheetKey.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C07839ix.A00, C3cG.A16(f0cArr, 7), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 9), AbstractC07749im.A00(ShoppingSecondaryAction$$serializer.INSTANCE), C3cH.A14(f0cArr, 11), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ShoppingProductSource$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, InstacartProductDetailsSheetKey instacartProductDetailsSheetKey) {
        AnonymousClass003.A0u(interfaceC07789is, instacartProductDetailsSheetKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        InstacartProductDetailsSheetKey.write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(instacartProductDetailsSheetKey, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
