package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.shopping.model.ShoppingCartPresentation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCartPresentationData extends C06G implements HatchPresentationData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ShoppingCartPresentation shoppingCart;

    public final class Companion {
        public final C9hr<ShoppingCartPresentationData> serializer() {
            return ShoppingCartPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ShoppingCartPresentationData copy(ShoppingCartPresentation shoppingCartPresentation) {
        C7384Etj.A0Y(shoppingCartPresentation, 0);
        return new ShoppingCartPresentationData(shoppingCartPresentation);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShoppingCartPresentationData) && C7384Etj.areEqual(this.shoppingCart, ((ShoppingCartPresentationData) obj).shoppingCart));
    }

    public /* synthetic */ ShoppingCartPresentationData(int i, ShoppingCartPresentation shoppingCartPresentation, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ShoppingCartPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.shoppingCart = shoppingCartPresentation;
    }

    public static /* synthetic */ ShoppingCartPresentationData copy$default(ShoppingCartPresentationData shoppingCartPresentationData, ShoppingCartPresentation shoppingCartPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingCartPresentation = shoppingCartPresentationData.shoppingCart;
        }
        C7384Etj.A0Y(shoppingCartPresentation, 0);
        return new ShoppingCartPresentationData(shoppingCartPresentation);
    }

    public final ShoppingCartPresentation component1() {
        return this.shoppingCart;
    }

    public final ShoppingCartPresentation getShoppingCart() {
        return this.shoppingCart;
    }

    public int hashCode() {
        return this.shoppingCart.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingCartPresentationData(ShoppingCartPresentation shoppingCartPresentation) {
        C7384Etj.A0Y(shoppingCartPresentation, 0);
        this.shoppingCart = shoppingCartPresentation;
    }
}
