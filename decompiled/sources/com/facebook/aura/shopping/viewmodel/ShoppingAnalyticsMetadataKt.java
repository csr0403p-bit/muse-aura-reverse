package com.facebook.aura.shopping.viewmodel;

import X.AGI;
import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import X.C9jH;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingMerchantKt;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class ShoppingAnalyticsMetadataKt {
    public static final BO6<String, String> shoppingAnalyticsMetadata(ShoppingResultProduct shoppingResultProduct, String str, ShoppingFormat shoppingFormat, String str2, ShoppingMerchantRanking shoppingMerchantRanking, Map<String, String> map) {
        Integer numPositionOf;
        AnonymousClass003.A0v(shoppingResultProduct, shoppingFormat);
        C7384Etj.A0Y(map, 5);
        String str3 = shoppingResultProduct.productId;
        String str4 = shoppingResultProduct.url;
        ShoppingProductType shoppingProductType = shoppingResultProduct.type;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.putAll(map);
        if (shoppingMerchantRanking != null && (numPositionOf = shoppingMerchantRanking.positionOf(shoppingResultProduct)) != null) {
            AnonymousClass006.A1B(HatchMetadataKey.MERCHANT_POSITION, c0924AIaA0u, numPositionOf.intValue());
            c0924AIaA0u.put(HatchMetadataKey.MERCHANT_COUNT.getValue(), String.valueOf(shoppingMerchantRanking.positions.size()));
        }
        return shoppingProductMetadata(str, shoppingFormat, str3, str4, str2, shoppingProductType, AIW.A0K(c0924AIaA0u));
    }

    public static final BO6<String, String> shoppingProductMetadata(String str, ShoppingFormat shoppingFormat, String str2, String str3, String str4, ShoppingProductType shoppingProductType, Map<String, String> map) {
        String loggingValue;
        C7384Etj.A0Y(map, 6);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.putAll(map);
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str2);
        if (strTrimToNonEmpty != null) {
            AnonymousClass001.A1C(HatchMetadataKey.PRODUCT_ID, strTrimToNonEmpty, c0924AIaA0u);
        }
        String strShoppingProductUrlOf = ShoppingMerchantKt.shoppingProductUrlOf(str3);
        if (strShoppingProductUrlOf != null) {
            AnonymousClass001.A1C(HatchMetadataKey.PRODUCT_URL, strShoppingProductUrlOf, c0924AIaA0u);
        }
        if (shoppingProductType != null && (loggingValue = ShoppingResultsPresentationKt.getLoggingValue(shoppingProductType)) != null) {
            AnonymousClass001.A1C(HatchMetadataKey.PRODUCT_TYPE, loggingValue, c0924AIaA0u);
        }
        putShoppingContext(c0924AIaA0u, str, shoppingFormat, str4);
        return AGI.A08(AIW.A0K(c0924AIaA0u));
    }

    public static final BO6<String, String> shoppingWidgetMetadata(String str, ShoppingFormat shoppingFormat, String str2, ShoppingMerchantRanking shoppingMerchantRanking, Map<String, String> map) {
        AnonymousClass005.A12(shoppingFormat, shoppingMerchantRanking, map, 1);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.putAll(map);
        int size = shoppingMerchantRanking.positions.size();
        if (size > 0) {
            AnonymousClass006.A1B(HatchMetadataKey.MERCHANT_COUNT, c0924AIaA0u, size);
        }
        putShoppingContext(c0924AIaA0u, str, shoppingFormat, str2);
        return AGI.A08(AIW.A0K(c0924AIaA0u));
    }

    public static final void putShoppingContext(Map<String, String> map, String str, ShoppingFormat shoppingFormat, String str2) {
        if (shoppingFormat != null) {
            map.put(HatchMetadataKey.SHOPPING_FORMAT.getValue(), shoppingFormat.getValue());
        }
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str2);
        if (strTrimToNonEmpty != null) {
            map.put(HatchMetadataKey.WIDGET_ID.getValue(), strTrimToNonEmpty);
        }
        if (str != null) {
            map.put(HatchMetadataKey.HOST_MESSAGE_ID.getValue(), str);
        }
    }

    public static /* synthetic */ BO6 shoppingAnalyticsMetadata$default(ShoppingResultProduct shoppingResultProduct, String str, ShoppingFormat shoppingFormat, String str2, ShoppingMerchantRanking shoppingMerchantRanking, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            shoppingMerchantRanking = null;
        }
        if ((i & 16) != 0) {
            map = C9jH.A00;
        }
        return shoppingAnalyticsMetadata(shoppingResultProduct, str, shoppingFormat, str2, shoppingMerchantRanking, map);
    }

    public static /* synthetic */ BO6 shoppingProductMetadata$default(String str, ShoppingFormat shoppingFormat, String str2, String str3, String str4, ShoppingProductType shoppingProductType, Map map, int i, Object obj) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            shoppingProductType = null;
        }
        if ((i & 64) != 0) {
            map = C9jH.A00;
        }
        return shoppingProductMetadata(str, shoppingFormat, str2, str3, str4, shoppingProductType, map);
    }

    public static /* synthetic */ BO6 shoppingWidgetMetadata$default(String str, ShoppingFormat shoppingFormat, String str2, ShoppingMerchantRanking shoppingMerchantRanking, Map map, int i, Object obj) {
        if ((i & 16) != 0) {
            map = C9jH.A00;
        }
        return shoppingWidgetMetadata(str, shoppingFormat, str2, shoppingMerchantRanking, map);
    }
}
