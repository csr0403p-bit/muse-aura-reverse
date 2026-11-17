package com.facebook.aura.shopping.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ProductDetailsResponseJson$$serializer implements C9cd<ProductDetailsResponseJson> {
    public static final ProductDetailsResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ProductDetailsResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ProductDetailsResponseJson.$childSerializers;
        ProductJson productJson = null;
        JsonElement jsonElement = null;
        ActionButtonsJson actionButtonsJson = null;
        JsonElement jsonElement2 = null;
        JsonElement jsonElement3 = null;
        List listA0P = null;
        JsonElement jsonElement4 = null;
        LocationJson locationJson = null;
        SellerJson sellerJson = null;
        List listA0P2 = null;
        MerchantJson merchantJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ProductDetailsResponseJson(i, productJson, merchantJson, listA0P2, sellerJson, listA0P, locationJson, jsonElement3, jsonElement2, actionButtonsJson, jsonElement4, jsonElement, (C2hx) null);
                case 0:
                    productJson = (ProductJson) c9j4A55.A8a(ProductJson$$serializer.INSTANCE, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    merchantJson = (MerchantJson) c9j4A55.A8Z(MerchantJson$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    listA0P2 = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    sellerJson = (SellerJson) c9j4A55.A8Z(SellerJson$$serializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 4);
                    i |= 16;
                    break;
                case 5:
                    locationJson = (LocationJson) c9j4A55.A8Z(LocationJson$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    jsonElement3 = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    jsonElement2 = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    actionButtonsJson = (ActionButtonsJson) c9j4A55.A8Z(ActionButtonsJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    jsonElement4 = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 10);
                    i |= 1024;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ProductDetailsResponseJson$$serializer productDetailsResponseJson$$serializer = new ProductDetailsResponseJson$$serializer();
        INSTANCE = productDetailsResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.repo.ProductDetailsResponseJson", productDetailsResponseJson$$serializer, 11);
        c9iKA1C.A08("product", true);
        c9iKA1C.A08("merchant", true);
        c9iKA1C.A08("related_products", true);
        c9iKA1C.A08("seller", true);
        c9iKA1C.A08("seller_reviews", true);
        c9iKA1C.A08(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, true);
        c9iKA1C.A08("marketplace_details", true);
        c9iKA1C.A08("shipping_returns", true);
        c9iKA1C.A08("action_buttons", true);
        c9iKA1C.A08("pdp_coupon", true);
        c9iKA1C.A08("variant_coupon_prices", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ProductDetailsResponseJson.$childSerializers;
        ProductJson$$serializer productJson$$serializer = ProductJson$$serializer.INSTANCE;
        C9hr c9hrA00 = AbstractC07749im.A00(MerchantJson$$serializer.INSTANCE);
        C9hr c9hrA11 = C3cH.A11(f0cArr);
        C9hr c9hrA002 = AbstractC07749im.A00(SellerJson$$serializer.INSTANCE);
        C9hr c9hrA13 = C3cH.A13(f0cArr);
        C9hr c9hrA003 = AbstractC07749im.A00(LocationJson$$serializer.INSTANCE);
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        return new C9hr[]{productJson$$serializer, c9hrA00, c9hrA11, c9hrA002, c9hrA13, c9hrA003, AbstractC07749im.A00(jsonElementSerializer), AbstractC07749im.A00(jsonElementSerializer), AbstractC07749im.A00(ActionButtonsJson$$serializer.INSTANCE), AbstractC07749im.A00(jsonElementSerializer), AbstractC07749im.A00(jsonElementSerializer)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ProductDetailsResponseJson productDetailsResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, productDetailsResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ProductDetailsResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(productDetailsResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
