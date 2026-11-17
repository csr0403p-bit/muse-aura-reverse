package com.facebook.aura.shopping.model;

import X.A3b;
import X.A6B;
import X.AbstractC7559F3s;
import X.C0881AGi;
import X.C7384Etj;
import X.C8iN;
import X.CFK;
import X.G0U;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes4.dex */
public abstract class ShoppingFeaturedProductJsonKt {
    public static final int MAX_FEATURED_PRODUCTS = 50;
    public static final String TAG = "ShoppingFeaturedProduct";

    /* renamed from: com.facebook.aura.shopping.model.ShoppingFeaturedProductJsonKt$parseShoppingFeaturedProducts$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<JsonElement, ShoppingFeaturedProduct> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final ShoppingFeaturedProduct invoke(JsonElement jsonElement) {
            C7384Etj.A0Y(jsonElement, 0);
            ShoppingFeaturedProductJson shoppingFeaturedProductJsonDecodeOrNull = ShoppingFeaturedProductJsonKt.decodeOrNull(jsonElement);
            if (shoppingFeaturedProductJsonDecodeOrNull != null) {
                return shoppingFeaturedProductJsonDecodeOrNull.toDomain();
            }
            return null;
        }
    }

    public static final ShoppingFeaturedProductJson decodeOrNull(JsonElement jsonElement) {
        try {
            return (ShoppingFeaturedProductJson) HatchJsonKt.HatchJson.A01(ShoppingFeaturedProductJson$$serializer.INSTANCE, jsonElement);
        } catch (IllegalArgumentException unused) {
            CFK.A06(TAG, "Dropped malformed featured product entry");
            return null;
        }
    }

    public static final List<ShoppingFeaturedProduct> parseShoppingFeaturedProducts(JsonElement jsonElement) {
        JsonArray jsonArrayAsJsonArrayOrNull = JsonObjectExtensionsKt.asJsonArrayOrNull(jsonElement);
        if (jsonArrayAsJsonArrayOrNull != null) {
            List<ShoppingFeaturedProduct> listA02 = A6B.A02(A6B.A04(AnonymousClass1.INSTANCE, new A3b(new C8iN(jsonArrayAsJsonArrayOrNull, 0), 50)));
            if (listA02 != null) {
                return listA02;
            }
        }
        return C0881AGi.A00;
    }
}
