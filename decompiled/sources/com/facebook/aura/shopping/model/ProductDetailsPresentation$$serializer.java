package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ProductDetailsPresentation$$serializer implements C9cd<ProductDetailsPresentation> {
    public static final int $stable = 0;
    public static final ProductDetailsPresentation$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ProductDetailsPresentation deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ProductDetailsPresentation.$childSerializers;
        Set set = null;
        Map map = null;
        Map map2 = null;
        List listA0Q = null;
        ProductShippingReturns productShippingReturns = null;
        PdpLocation pdpLocation = null;
        List list = null;
        String strA0g = null;
        String strA0g2 = null;
        String strA0g3 = null;
        Integer num = null;
        String strA0g4 = null;
        Boolean bool = null;
        Set set2 = null;
        String strA8f = null;
        PdpHeader pdpHeader = null;
        PdpProductInfo pdpProductInfo = null;
        PdpRating pdpRating = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        ShoppingProductType shoppingProductType = null;
        ShoppingPrimaryAction shoppingPrimaryAction = null;
        ShoppingSecondaryAction shoppingSecondaryAction = null;
        PdpSeller pdpSeller = null;
        List list8 = null;
        boolean zA8G = false;
        int i2 = 0;
        boolean zA8G2 = false;
        boolean z = true;
        while (z) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    pdpHeader = (PdpHeader) c9j4A55.A8a(PdpHeader$$serializer.INSTANCE, c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    pdpProductInfo = (PdpProductInfo) c9j4A55.A8a(PdpProductInfo$$serializer.INSTANCE, c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    pdpRating = (PdpRating) c9j4A55.A8Z(PdpRating$$serializer.INSTANCE, c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    list2 = (List) c9j4A55.A8a(f0cArr[4].getValue(), c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    list3 = (List) c9j4A55.A8a(f0cArr[5].getValue(), c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    list4 = (List) c9j4A55.A8a(f0cArr[6].getValue(), c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    list5 = (List) c9j4A55.A8a(f0cArr[7].getValue(), c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    list6 = (List) c9j4A55.A8a(f0cArr[8].getValue(), c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    list7 = (List) c9j4A55.A8a(f0cArr[9].getValue(), c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    shoppingProductType = (ShoppingProductType) c9j4A55.A8a(f0cArr[10].getValue(), c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    zA8G2 = c9j4A55.A8G(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    shoppingPrimaryAction = (ShoppingPrimaryAction) C9j4.A00(c9iZ, c9j4A55, f0cArr, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    shoppingSecondaryAction = (ShoppingSecondaryAction) c9j4A55.A8Z(ShoppingSecondaryAction$$serializer.INSTANCE, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    pdpSeller = (PdpSeller) c9j4A55.A8Z(PdpSeller$$serializer.INSTANCE, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    list8 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 15);
                    i = 32768;
                    break;
                case 16:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 16);
                    i = 65536;
                    break;
                case 17:
                    pdpLocation = (PdpLocation) c9j4A55.A8Z(PdpLocation$$serializer.INSTANCE, c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    productShippingReturns = (ProductShippingReturns) c9j4A55.A8Z(ProductShippingReturns$$serializer.INSTANCE, c9iZ, 18);
                    i = 262144;
                    break;
                case 19:
                    strA0g4 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 19);
                    i = 524288;
                    break;
                case 20:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 20);
                    i = 1048576;
                    break;
                case 21:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 21);
                    i = 2097152;
                    break;
                case 22:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 22);
                    i = 4194304;
                    break;
                case 23:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 23);
                    i = 8388608;
                    break;
                case 24:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 24);
                    i = HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES;
                    break;
                case 25:
                    set2 = (Set) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 25);
                    i = 33554432;
                    break;
                case 26:
                    map = (Map) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 26);
                    i = 67108864;
                    break;
                case 27:
                    zA8G = c9j4A55.A8G(c9iZ, 27);
                    i = 134217728;
                    break;
                case 28:
                    map2 = (Map) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 28);
                    i = 268435456;
                    break;
                case 29:
                    set = (Set) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 29);
                    i = 536870912;
                    break;
                case 30:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 30);
                    i = 1073741824;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
        c9j4A55.AAd(c9iZ);
        return new ProductDetailsPresentation(i2, strA8f, pdpHeader, pdpProductInfo, pdpRating, list2, list3, list4, list5, list6, list7, shoppingProductType, zA8G2, shoppingPrimaryAction, shoppingSecondaryAction, pdpSeller, list8, listA0Q, pdpLocation, productShippingReturns, strA0g4, strA0g3, strA0g2, strA0g, num, list, set2, map, zA8G, map2, set, bool, (C2hx) null);
    }

    static {
        ProductDetailsPresentation$$serializer productDetailsPresentation$$serializer = new ProductDetailsPresentation$$serializer();
        INSTANCE = productDetailsPresentation$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.model.ProductDetailsPresentation", productDetailsPresentation$$serializer, 31);
        c9iKA1C.A08("productId", false);
        c9iKA1C.A08("header", false);
        c9iKA1C.A08("product", false);
        c9iKA1C.A08("rating", false);
        c9iKA1C.A08("pills", false);
        c9iKA1C.A08("variantGroups", false);
        c9iKA1C.A08("variantPricing", false);
        c9iKA1C.A08("variantImages", false);
        c9iKA1C.A08("actions", false);
        c9iKA1C.A08("relatedProducts", true);
        c9iKA1C.A08("productType", true);
        c9iKA1C.A08("canOfferBuyNow", true);
        c9iKA1C.A08("primaryAction", true);
        c9iKA1C.A08("secondaryAction", true);
        c9iKA1C.A08("seller", true);
        c9iKA1C.A08("attributes", true);
        c9iKA1C.A08("sellerReviews", true);
        c9iKA1C.A08(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, true);
        c9iKA1C.A08("shippingReturns", true);
        c9iKA1C.A08("buyLabel", true);
        c9iKA1C.A08("websiteLabel", true);
        c9iKA1C.A08("categoryName", true);
        c9iKA1C.A08("listingDurationText", true);
        c9iKA1C.A08("sellerListingCount", true);
        c9iKA1C.A08("sellerOtherListings", true);
        c9iKA1C.A08("outOfStockProductIds", true);
        c9iKA1C.A08("variantDetails", true);
        c9iKA1C.A08("actionsFromServer", true);
        c9iKA1C.A08("couponPrices", true);
        c9iKA1C.A08("ownCouponPriceIds", true);
        c9iKA1C.A08("isTryOnEligible", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ProductDetailsPresentation.$childSerializers;
        C9hr<?>[] c9hrArr = new C9hr[31];
        C07779iq c07779iq = C07779iq.A01;
        PdpHeader$$serializer pdpHeader$$serializer = PdpHeader$$serializer.INSTANCE;
        PdpProductInfo$$serializer pdpProductInfo$$serializer = PdpProductInfo$$serializer.INSTANCE;
        C9hr c9hrA00 = AbstractC07749im.A00(PdpRating$$serializer.INSTANCE);
        C9hr c9hrA13 = C3cH.A13(f0cArr);
        C9hr c9hrA16 = C3cG.A16(f0cArr, 5);
        C9hr c9hrA162 = C3cG.A16(f0cArr, 6);
        C9hr c9hrA163 = C3cG.A16(f0cArr, 7);
        C9hr c9hrA164 = C3cG.A16(f0cArr, 8);
        C9hr c9hrA165 = C3cG.A16(f0cArr, 9);
        C9hr c9hrA166 = C3cG.A16(f0cArr, 10);
        C07839ix c07839ix = C07839ix.A00;
        System.arraycopy(new C9hr[]{c07779iq, pdpHeader$$serializer, pdpProductInfo$$serializer, c9hrA00, c9hrA13, c9hrA16, c9hrA162, c9hrA163, c9hrA164, c9hrA165, c9hrA166, c07839ix, C3cH.A14(f0cArr, 12), AbstractC07749im.A00(ShoppingSecondaryAction$$serializer.INSTANCE), AbstractC07749im.A00(PdpSeller$$serializer.INSTANCE), C3cG.A16(f0cArr, 15), C3cG.A16(f0cArr, 16), AbstractC07749im.A00(PdpLocation$$serializer.INSTANCE), AbstractC07749im.A00(ProductShippingReturns$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07729ii.A00), C3cG.A16(f0cArr, 24), C3cG.A16(f0cArr, 25), C3cG.A16(f0cArr, 26)}, 0, c9hrArr, 0, 27);
        System.arraycopy(new C9hr[]{c07839ix, C3cG.A16(f0cArr, 28), C3cG.A16(f0cArr, 29), AbstractC07749im.A00(c07839ix)}, 0, c9hrArr, 27, 4);
        return c9hrArr;
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ProductDetailsPresentation productDetailsPresentation) {
        AnonymousClass003.A0u(interfaceC07789is, productDetailsPresentation);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ProductDetailsPresentation.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(productDetailsPresentation, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
