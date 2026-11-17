package com.facebook.aura.shopping.model;

import X.C10571Hud;
import X.C3cG;
import X.C9sU;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public abstract class ShoppingCartPresentationJsonKt {
    public static final int MAX_SHOPPING_CART_ITEMS = 200;

    public static final ShoppingCartJson decodeShoppingCartJson(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = ShoppingCartJson.$stable;
            objA0s = (ShoppingCartJson) c9sU.A01(ShoppingCartJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        return (ShoppingCartJson) (objA0s instanceof C10571Hud ? null : objA0s);
    }

    public static final CurrentShoppingCart parseCurrentShoppingCart(JsonElement jsonElement) {
        ShoppingCartJson shoppingCartJsonDecodeShoppingCartJson = decodeShoppingCartJson(jsonElement);
        if (shoppingCartJsonDecodeShoppingCartJson != null) {
            return shoppingCartJsonDecodeShoppingCartJson.toCurrentCart();
        }
        return null;
    }

    public static final ShoppingCartPresentation parseShoppingCartPresentation(JsonElement jsonElement, String str) {
        ShoppingCartJson shoppingCartJsonDecodeShoppingCartJson = decodeShoppingCartJson(jsonElement);
        if (shoppingCartJsonDecodeShoppingCartJson != null) {
            return shoppingCartJsonDecodeShoppingCartJson.toPresentation(str);
        }
        return null;
    }
}
