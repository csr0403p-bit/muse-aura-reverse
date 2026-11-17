package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.C3cG;
import X.C3cI;
import X.CFK;
import X.FGI;
import com.facebook.aura.json.HatchJsonKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes4.dex */
public abstract class PdpCouponJsonKt {
    public static final String TAG = "PdpCouponJson";

    public static final PdpCouponJson decodeCouponOrNull(JsonElement jsonElement) {
        if (jsonElement != null) {
            try {
                return (PdpCouponJson) C3cI.A0T(AbstractC07749im.A00(PdpCouponJson$$serializer.INSTANCE), HatchJsonKt.HatchJson, jsonElement);
            } catch (IllegalArgumentException e) {
                CFK.A0A(TAG, "Dropped malformed pdp_coupon", e);
            }
        }
        return null;
    }

    public static final List<JsonElement> decodeListOrNull(JsonElement jsonElement) {
        if (jsonElement != null) {
            try {
                return (List) C3cI.A0T(AbstractC07749im.A00(C3cG.A19(JsonElementSerializer.A00)), HatchJsonKt.HatchJson, jsonElement);
            } catch (IllegalArgumentException e) {
                CFK.A0A(TAG, "Dropped malformed variant_coupon_prices", e);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.shopping.model.PdpCouponPrice toPdpCouponPrice(kotlinx.serialization.json.JsonElement r9, java.lang.String r10, java.lang.String r11, double r12) {
        /*
            r0 = 1
            X.C7384Etj.A0Y(r10, r0)
            com.facebook.aura.shopping.model.PdpCouponJson r5 = decodeCouponOrNull(r9)
            r7 = 0
            if (r5 == 0) goto L8b
            int r0 = r10.length()
            if (r0 == 0) goto L8b
            java.lang.String r0 = r5.product_id
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L8b
            com.facebook.aura.shopping.model.CouponMoneyJson r3 = r5.price
            if (r3 == 0) goto L8b
            com.facebook.aura.shopping.model.CouponMoneyJson r2 = r5.original_price
            if (r2 == 0) goto L8b
            com.facebook.aura.shopping.model.PdpPrice r8 = r3.toPdpPrice(r11)
            if (r8 == 0) goto L8b
            java.lang.String r0 = r8.currency
            com.facebook.aura.shopping.model.PdpPrice r9 = r2.toPdpPrice(r0)
            if (r9 == 0) goto L8b
            java.lang.String r1 = r9.currency
            java.lang.String r0 = r8.currency
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L8b
            java.lang.Long r0 = r3.amount
            if (r0 == 0) goto L8b
            long r3 = r0.longValue()
            java.lang.Long r0 = r2.amount
            if (r0 == 0) goto L8b
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8b
            java.lang.Double r0 = r5.deadline(r12)
            if (r0 == 0) goto L8b
            double r10 = r0.doubleValue()
            com.facebook.aura.shopping.model.CouponMoneyJson r6 = r5.savings
            if (r6 == 0) goto L8b
            java.lang.Long r0 = r6.amount
            if (r0 == 0) goto L8b
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8b
            java.lang.String r0 = r8.currency
            com.facebook.aura.shopping.model.PdpPrice r13 = r6.toPdpPrice(r0)
            if (r13 == 0) goto L8b
            java.lang.Double r12 = r5.percent_off
            if (r12 == 0) goto L85
            double r3 = r12.doubleValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L85
            r1 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L86
        L85:
            r12 = r7
        L86:
            com.facebook.aura.shopping.model.PdpCouponPrice r7 = new com.facebook.aura.shopping.model.PdpCouponPrice
            r7.<init>(r8, r9, r10, r12, r13)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.model.PdpCouponJsonKt.toPdpCouponPrice(kotlinx.serialization.json.JsonElement, java.lang.String, java.lang.String, double):com.facebook.aura.shopping.model.PdpCouponPrice");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, com.facebook.aura.shopping.model.PdpCouponPrice> variantCouponPrices(kotlinx.serialization.json.JsonElement r15, java.lang.String r16, com.facebook.aura.shopping.model.PdpCouponPrice r17, java.lang.String r18, X.G0U<? super java.lang.String, com.facebook.aura.shopping.model.PdpPrice> r19) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.model.PdpCouponJsonKt.variantCouponPrices(kotlinx.serialization.json.JsonElement, java.lang.String, com.facebook.aura.shopping.model.PdpCouponPrice, java.lang.String, X.G0U):java.util.Map");
    }

    public static final <T> T decodeOrWarn(String str, Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (IllegalArgumentException e) {
            CFK.A0A(TAG, FGI.A0M("Dropped malformed ", str), e);
            return null;
        }
    }

    public static final String pdpCouponCode(JsonElement jsonElement) {
        PdpCouponJson pdpCouponJsonDecodeCouponOrNull = decodeCouponOrNull(jsonElement);
        return ProductDetailsPresentationKt.trimToNonEmpty(pdpCouponJsonDecodeCouponOrNull != null ? pdpCouponJsonDecodeCouponOrNull.coupon_code : null);
    }
}
