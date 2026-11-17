package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCartPresentation extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ShoppingCart cart;
    public final String title;
    public final String widgetId;

    public final class Companion {
        public final C9hr<ShoppingCartPresentation> serializer() {
            return ShoppingCartPresentation$$serializer.INSTANCE;
        }

        public final ShoppingCartPresentation fromJson(JsonElement jsonElement, String str) {
            return ShoppingCartPresentationJsonKt.parseShoppingCartPresentation(jsonElement, str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCartPresentation shoppingCartPresentation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shoppingCartPresentation.title, c9iZ, 0);
        c9j5.AAQ(shoppingCartPresentation.cart, ShoppingCart$$serializer.INSTANCE, c9iZ, 1);
        if (c9j5.AfR() || shoppingCartPresentation.widgetId != null) {
            c9j5.AAP(shoppingCartPresentation.widgetId, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartPresentation) {
                ShoppingCartPresentation shoppingCartPresentation = (ShoppingCartPresentation) obj;
                if (!C7384Etj.areEqual(this.title, shoppingCartPresentation.title) || !C7384Etj.areEqual(this.cart, shoppingCartPresentation.cart) || !C7384Etj.areEqual(this.widgetId, shoppingCartPresentation.widgetId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingCartPresentation copy$default(ShoppingCartPresentation shoppingCartPresentation, String str, ShoppingCart shoppingCart, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCartPresentation.title;
        }
        if ((i & 2) != 0) {
            shoppingCart = shoppingCartPresentation.cart;
        }
        if ((i & 4) != 0) {
            str2 = shoppingCartPresentation.widgetId;
        }
        return shoppingCartPresentation.copy(str, shoppingCart, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final ShoppingCart component2() {
        return this.cart;
    }

    public final String component3() {
        return this.widgetId;
    }

    public final ShoppingCart getCart() {
        return this.cart;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.cart, AnonymousClass001.A0G(this.title)) + AnonymousClass006.A0G(this.widgetId);
    }

    public ShoppingCartPresentation(String str, ShoppingCart shoppingCart, String str2) {
        AnonymousClass003.A0u(str, shoppingCart);
        this.title = str;
        this.cart = shoppingCart;
        this.widgetId = str2;
    }

    public final ShoppingCartPresentation copy(String str, ShoppingCart shoppingCart, String str2) {
        AnonymousClass003.A0u(str, shoppingCart);
        return new ShoppingCartPresentation(str, shoppingCart, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCartPresentation(int i, String str, ShoppingCart shoppingCart, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ShoppingCartPresentation$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.title = str;
        this.cart = shoppingCart;
        this.widgetId = C3cI.A0W(i, str2);
    }

    public /* synthetic */ ShoppingCartPresentation(String str, ShoppingCart shoppingCart, String str2, int i, C06H c06h) {
        this(str, shoppingCart, AnonymousClass006.A0t(i, str2));
    }
}
