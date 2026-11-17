package com.facebook.aura.shopping.model;

import X.AnonymousClass002;
import X.C06827l3;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C9sU;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Iterator;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class ShoppingResultsPresentationJsonKt {
    public static final int MAX_SHOPPING_COLLECTION_LISTS = 10;
    public static final int MAX_SHOPPING_COLLECTION_LIST_PRODUCTS = 50;
    public static final int MAX_SHOPPING_RESULTS_PRODUCTS = 20;
    public static final int MIN_SHOPPING_COLLECTION_LISTS = 2;
    public static final C06827l3 WHITESPACE_RUN = C06827l3.A02("\\s+");

    public static final ShoppingResultsPresentation parseShoppingResultsPresentation(JsonElement jsonElement, String str) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = ShoppingResultsPresentationJson.$stable;
            objA0s = (ShoppingResultsPresentationJson) c9sU.A01(ShoppingResultsPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        ShoppingResultsPresentationJson shoppingResultsPresentationJson = (ShoppingResultsPresentationJson) objA0s;
        if (shoppingResultsPresentationJson != null) {
            return shoppingResultsPresentationJson.toDomain(str);
        }
        return null;
    }

    public static final String toSingleLineOrNull(String str) {
        return ProductDetailsPresentationKt.trimToNonEmpty(WHITESPACE_RUN.A03(str, InviteCodeScratcherKt.CODE_SEPARATOR));
    }

    public static final ShoppingCollectionLayout toShoppingCollectionLayout(String str) {
        ShoppingCollectionLayout next;
        Iterator<ShoppingCollectionLayout> it = ShoppingCollectionLayout.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getWireValue(), AnonymousClass002.A0l(str))) {
                break;
            }
        }
        ShoppingCollectionLayout shoppingCollectionLayout = next;
        return shoppingCollectionLayout == null ? ShoppingCollectionLayout.COLLAGE : shoppingCollectionLayout;
    }
}
