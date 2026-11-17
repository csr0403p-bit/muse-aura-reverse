package com.facebook.aura.analytics.waterfall;

import X.AGH;
import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0924AIa;
import X.C3cG;
import X.C7BY;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class HatchPriceImpressionEventDataKt {
    public static final String NO_DISCOUNT = "0";

    public static final Map<String, String> consumablePriceImpressionEventData(String str, String str2, String str3, Integer num, String str4) {
        AnonymousClass003.A0v(str, str3);
        Map<String, String> mapPriceEventData = priceEventData(str3, num, str4);
        if (mapPriceEventData == null) {
            return null;
        }
        C0924AIa c0924AIaA0u = C3cG.A0u();
        AnonymousClass001.A1C(HatchMetadataKey.DCP_CONSUMABLE_PRODUCT_ID, str, c0924AIaA0u);
        if (str2 != null && !C7BY.A0j(str2)) {
            AnonymousClass001.A1C(HatchMetadataKey.DCP_PRODUCT_TYPE, str2, c0924AIaA0u);
        }
        c0924AIaA0u.putAll(mapPriceEventData);
        return AIW.A0K(c0924AIaA0u);
    }

    public static final Map<String, String> priceEventData(String str, Integer num, String str2) {
        int iIntValue;
        if (C7BY.A0j(str) || num == null || (iIntValue = num.intValue()) <= 0 || str2 == null || C7BY.A0j(str2)) {
            return null;
        }
        String strValueOf = String.valueOf(iIntValue);
        return AGH.A0D(AnonymousClass006.A12(HatchMetadataKey.DISCOUNTED_PRICE, str), AnonymousClass006.A12(HatchMetadataKey.UNDISCOUNTED_PRICE, str), AnonymousClass006.A12(HatchMetadataKey.DISCOUNTED_PRICE_RAW_AMOUNT, strValueOf), AnonymousClass006.A12(HatchMetadataKey.UNDISCOUNTED_PRICE_RAW_AMOUNT, strValueOf), AnonymousClass006.A12(HatchMetadataKey.CURRENCY_CODE, str2), C3cG.A0r(HatchMetadataKey.TOTAL_DISCOUNT_PERCENTAGE.getValue(), NO_DISCOUNT), AnonymousClass006.A12(HatchMetadataKey.TOTAL_DISCOUNT_AMOUNT, NO_DISCOUNT));
    }

    public static final Map<String, String> subscriptionPriceImpressionEventData(String str, String str2, Integer num, String str3, String str4, Integer num2) {
        int iIntValue;
        AnonymousClass003.A0u(str, str2);
        Map<String, String> mapPriceEventData = priceEventData(str2, num, str3);
        if (mapPriceEventData == null) {
            return null;
        }
        C0924AIa c0924AIaA0u = C3cG.A0u();
        AnonymousClass001.A1C(HatchMetadataKey.DCP_TIER_ID, str, c0924AIaA0u);
        c0924AIaA0u.putAll(mapPriceEventData);
        if (str4 != null && !C7BY.A0j(str4)) {
            AnonymousClass001.A1C(HatchMetadataKey.REGULAR_BILLING_PERIOD, str4, c0924AIaA0u);
        }
        if (num2 != null && (iIntValue = num2.intValue()) > 0) {
            AnonymousClass006.A1B(HatchMetadataKey.REGULAR_BILLING_LENGTH, c0924AIaA0u, iIntValue);
        }
        return AIW.A0K(c0924AIaA0u);
    }
}
