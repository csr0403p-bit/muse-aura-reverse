package com.facebook.aura.shopping.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes4.dex */
public final class CurrentShoppingCart extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String capturedAt;
    public final ShoppingCart cart;
    public final String checkoutLabel;
    public final ShoppingSecondaryAction secondaryAction;

    public CurrentShoppingCart(ShoppingCart shoppingCart, String str, String str2, ShoppingSecondaryAction shoppingSecondaryAction) {
        C7384Etj.A0Y(shoppingCart, 0);
        this.cart = shoppingCart;
        this.capturedAt = str;
        this.checkoutLabel = str2;
        this.secondaryAction = shoppingSecondaryAction;
    }

    public final CurrentShoppingCart copy(ShoppingCart shoppingCart, String str, String str2, ShoppingSecondaryAction shoppingSecondaryAction) {
        C7384Etj.A0Y(shoppingCart, 0);
        return new CurrentShoppingCart(shoppingCart, str, str2, shoppingSecondaryAction);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CurrentShoppingCart) {
                CurrentShoppingCart currentShoppingCart = (CurrentShoppingCart) obj;
                if (!C7384Etj.areEqual(this.cart, currentShoppingCart.cart) || !C7384Etj.areEqual(this.capturedAt, currentShoppingCart.capturedAt) || !C7384Etj.areEqual(this.checkoutLabel, currentShoppingCart.checkoutLabel) || !C7384Etj.areEqual(this.secondaryAction, currentShoppingCart.secondaryAction)) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public final CurrentShoppingCart fromJson(JsonElement jsonElement) {
            return ShoppingCartPresentationJsonKt.parseCurrentShoppingCart(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ CurrentShoppingCart copy$default(CurrentShoppingCart currentShoppingCart, ShoppingCart shoppingCart, String str, String str2, ShoppingSecondaryAction shoppingSecondaryAction, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingCart = currentShoppingCart.cart;
        }
        if ((i & 2) != 0) {
            str = currentShoppingCart.capturedAt;
        }
        if ((i & 4) != 0) {
            str2 = currentShoppingCart.checkoutLabel;
        }
        if ((i & 8) != 0) {
            shoppingSecondaryAction = currentShoppingCart.secondaryAction;
        }
        C7384Etj.A0Y(shoppingCart, 0);
        return new CurrentShoppingCart(shoppingCart, str, str2, shoppingSecondaryAction);
    }

    public final ShoppingCart component1() {
        return this.cart;
    }

    public final String component2() {
        return this.capturedAt;
    }

    public final String component3() {
        return this.checkoutLabel;
    }

    public final ShoppingSecondaryAction component4() {
        return this.secondaryAction;
    }

    public final String getCapturedAt() {
        return this.capturedAt;
    }

    public final ShoppingCart getCart() {
        return this.cart;
    }

    public final String getCheckoutLabel() {
        return this.checkoutLabel;
    }

    public final ShoppingSecondaryAction getSecondaryAction() {
        return this.secondaryAction;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0E(this.cart) + AnonymousClass006.A0G(this.capturedAt)) * 31) + AnonymousClass006.A0G(this.checkoutLabel)) * 31) + C3cH.A02(this.secondaryAction);
    }

    public String toString() {
        return super.toString();
    }
}
