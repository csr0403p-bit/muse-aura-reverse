package com.facebook.aura.gateway;

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
/* loaded from: classes2.dex */
public final /* synthetic */ class ShopifyCheckoutApprovalJson$$serializer implements C9cd<ShopifyCheckoutApprovalJson> {
    public static final int $stable = 0;
    public static final ShopifyCheckoutApprovalJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShopifyCheckoutApprovalJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = ShopifyCheckoutApprovalJson.$childSerializers;
        String strA0f = null;
        String strA0g = null;
        List listA0Q = null;
        String strA0g2 = null;
        CheckoutMerchantJson checkoutMerchantJson = null;
        List list = null;
        List list2 = null;
        String strA0g3 = null;
        List listA0Q2 = null;
        JsonElement jsonElement = null;
        ShopifyCheckoutShippingAddressJson shopifyCheckoutShippingAddressJson = null;
        ShopifyCheckoutDeliveryJson shopifyCheckoutDeliveryJson = null;
        ShopifyCheckoutContactJson shopifyCheckoutContactJson = null;
        String strA0t = null;
        String strA0f2 = null;
        String strA0u = null;
        PaymentSelectionJson paymentSelectionJson = null;
        int iA8U = 0;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShopifyCheckoutApprovalJson(i2, iA8U, strA0f, strA0g, checkoutMerchantJson, shopifyCheckoutContactJson, shopifyCheckoutShippingAddressJson, shopifyCheckoutDeliveryJson, jsonElement, listA0Q2, strA0g3, strA0g2, list2, list, strA0t, strA0f2, strA0u, paymentSelectionJson, listA0Q, (C2hx) null);
                case 0:
                    iA8U = c9j4A55.A8U(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0f = C3cI.A0f(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0g = C3cI.A0g(c9iZ, c9j4A55);
                    i = i2 | 4;
                    break;
                case 3:
                    checkoutMerchantJson = (CheckoutMerchantJson) c9j4A55.A8Z(CheckoutMerchantJson$$serializer.INSTANCE, c9iZ, 3);
                    i = i2 | 8;
                    break;
                case 4:
                    shopifyCheckoutContactJson = (ShopifyCheckoutContactJson) c9j4A55.A8Z(ShopifyCheckoutContactJson$$serializer.INSTANCE, c9iZ, 4);
                    i = i2 | 16;
                    break;
                case 5:
                    shopifyCheckoutShippingAddressJson = (ShopifyCheckoutShippingAddressJson) c9j4A55.A8Z(ShopifyCheckoutShippingAddressJson$$serializer.INSTANCE, c9iZ, 5);
                    i = i2 | 32;
                    break;
                case 6:
                    shopifyCheckoutDeliveryJson = (ShopifyCheckoutDeliveryJson) c9j4A55.A8Z(ShopifyCheckoutDeliveryJson$$serializer.INSTANCE, c9iZ, 6);
                    i = i2 | 64;
                    break;
                case 7:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 7);
                    i = i2 | 128;
                    break;
                case 8:
                    listA0Q2 = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 8);
                    i = i2 | 256;
                    break;
                case 9:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 9);
                    i = i2 | 512;
                    break;
                case 10:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 10);
                    i = i2 | 1024;
                    break;
                case 11:
                    list2 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 11);
                    i = i2 | 2048;
                    break;
                case 12:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 12);
                    i = i2 | 4096;
                    break;
                case 13:
                    strA0t = C3cI.A0t(c9iZ, c9j4A55);
                    i = i2 | 8192;
                    break;
                case 14:
                    strA0f2 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i = i2 | 16384;
                    break;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i = 32768 | i2;
                    break;
                case 16:
                    paymentSelectionJson = (PaymentSelectionJson) c9j4A55.A8Z(PaymentSelectionJson$$serializer.INSTANCE, c9iZ, 16);
                    i = 65536 | i2;
                    break;
                case 17:
                    listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 17);
                    i2 |= 131072;
                    continue;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 = i;
        }
    }

    static {
        ShopifyCheckoutApprovalJson$$serializer shopifyCheckoutApprovalJson$$serializer = new ShopifyCheckoutApprovalJson$$serializer();
        INSTANCE = shopifyCheckoutApprovalJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.ShopifyCheckoutApprovalJson", shopifyCheckoutApprovalJson$$serializer, 18);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("flow_id", true);
        c9iKA1C.A08("checkout_id", true);
        c9iKA1C.A08("merchant", true);
        c9iKA1C.A08("contact", true);
        c9iKA1C.A08("shipping_address", true);
        c9iKA1C.A08("delivery", true);
        c9iKA1C.A08("lodging", true);
        C3cJ.A0n(ConnectorOrderCheckoutKt.ITEMS_KEY, c9iKA1C);
        C3cJ.A0x(c9iKA1C);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = ShopifyCheckoutApprovalJson.$childSerializers;
        C07729ii c07729ii = C07729ii.A00;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07729ii, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(CheckoutMerchantJson$$serializer.INSTANCE), AbstractC07749im.A00(ShopifyCheckoutContactJson$$serializer.INSTANCE), AbstractC07749im.A00(ShopifyCheckoutShippingAddressJson$$serializer.INSTANCE), AbstractC07749im.A00(ShopifyCheckoutDeliveryJson$$serializer.INSTANCE), AbstractC07749im.A00(JsonElementSerializer.A00), C3cG.A16(f0cArr, 8), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cG.A16(f0cArr, 11), C3cG.A16(f0cArr, 12), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(PaymentSelectionJson$$serializer.INSTANCE), C3cG.A16(f0cArr, 17)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson) {
        AnonymousClass003.A0u(interfaceC07789is, shopifyCheckoutApprovalJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShopifyCheckoutApprovalJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(shopifyCheckoutApprovalJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
