package com.facebook.aura.model;

import X.C10571Hud;
import X.C3cG;
import X.C60O;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class ExternalLinkPresentationJsonKt {
    public static final String HTTPS_SCHEME_PREFIX = "https://";
    public static final String HTTP_SCHEME_PREFIX = "http://";
    public static final int MAX_CHECKOUT_FLOW_ID_LENGTH = 128;
    public static final int MAX_CHECKOUT_PROVIDER_LENGTH = 64;
    public static final Set<String> SAVED_CHECKOUT_ENTRY_POINTS = C60O.A19("cart_assistant_button", "chat");

    public static final ExternalLinkPresentation parseExternalLinkPresentation(JsonElement jsonElement, String str) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            objA0s = (ExternalLinkPresentationJson) HatchJsonKt.HatchJson.A01(ExternalLinkPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        ExternalLinkPresentationJson externalLinkPresentationJson = (ExternalLinkPresentationJson) objA0s;
        if (externalLinkPresentationJson != null) {
            return externalLinkPresentationJson.toDomain(str, parseShoppingCheckout(C60O.A1F("shopping_checkout", (JsonObject) jsonElement)));
        }
        return null;
    }

    public static final ShoppingCheckoutAttribution parseShoppingCheckout(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            objA0s = (ShoppingCheckoutJson) HatchJsonKt.HatchJson.A01(ShoppingCheckoutJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        ShoppingCheckoutJson shoppingCheckoutJson = (ShoppingCheckoutJson) objA0s;
        if (shoppingCheckoutJson != null) {
            return shoppingCheckoutJson.toDomain();
        }
        return null;
    }
}
