package com.facebook.aura.shopping.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
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
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ProductJson$$serializer implements C9cd<ProductJson> {
    public static final ProductJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ProductJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ProductJson.$childSerializers;
        List listA0P = null;
        String strA0f = null;
        List listA0Q = null;
        PriceJson priceJson = null;
        PriceJson priceJson2 = null;
        String strA0g = null;
        String strA0g2 = null;
        Integer num = null;
        String strA0g3 = null;
        String strA0g4 = null;
        List list = null;
        String strA0g5 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        RatingJson ratingJson = null;
        List list6 = null;
        String strA8f = null;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ProductJson(i2, strA8f, strA0f, strA0g5, strA0g4, strA0g2, strA0g3, strA0g, priceJson2, priceJson, num, listA0Q, list, list2, list3, list4, list5, ratingJson, list6, listA0P, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0g5 = C3cI.A0g(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0g4 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    priceJson2 = (PriceJson) c9j4A55.A8Z(PriceJson$$serializer.INSTANCE, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    priceJson = (PriceJson) c9j4A55.A8Z(PriceJson$$serializer.INSTANCE, c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    list2 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    list3 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    list4 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    list5 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 15);
                    i = 32768;
                    break;
                case 16:
                    ratingJson = (RatingJson) c9j4A55.A8Z(RatingJson$$serializer.INSTANCE, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    list6 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 17);
                    i = 131072;
                    break;
                case 18:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 18);
                    i = 262144;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        ProductJson$$serializer productJson$$serializer = new ProductJson$$serializer();
        INSTANCE = productJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.repo.ProductJson", productJson$$serializer, 19);
        C60O.A1T("id", c9iKA1C, true);
        c9iKA1C.A08("merchant_name", true);
        c9iKA1C.A08("seller_name", true);
        C3cI.A1N(HatchWebPageParserKt.DESCRIPTION, c9iKA1C, true);
        c9iKA1C.A08("stock_status", true);
        c9iKA1C.A08("current_price", true);
        c9iKA1C.A08("original_price", true);
        c9iKA1C.A08("price_percent_off", true);
        c9iKA1C.A08("images", true);
        c9iKA1C.A08("variant_groups", true);
        c9iKA1C.A08("variant_pricing", true);
        c9iKA1C.A08("variant_images", true);
        c9iKA1C.A08("variant_stock_status", true);
        c9iKA1C.A08("arts", true);
        c9iKA1C.A08("rating", true);
        c9iKA1C.A08("attributes", true);
        c9iKA1C.A08("selected_variant_info", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ProductJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        PriceJson$$serializer priceJson$$serializer = PriceJson$$serializer.INSTANCE;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, AbstractC07749im.A00(priceJson$$serializer), AbstractC07749im.A00(priceJson$$serializer), AbstractC07749im.A00(C07729ii.A00), C3cG.A16(f0cArr, 10), C3cG.A16(f0cArr, 11), C3cG.A16(f0cArr, 12), C3cG.A16(f0cArr, 13), C3cG.A16(f0cArr, 14), C3cG.A16(f0cArr, 15), AbstractC07749im.A00(RatingJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 17), C3cG.A16(f0cArr, 18)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ProductJson productJson) {
        AnonymousClass003.A0u(interfaceC07789is, productJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ProductJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(productJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
