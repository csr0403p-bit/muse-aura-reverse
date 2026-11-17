package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCart extends C06G {
    public static final int $stable = 0;
    public final ShoppingResultsAttribution attribution;
    public final List<ShoppingCartItem> items;
    public final String retailerName;
    public final String subtotal;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, ShoppingCart$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<ShoppingCart> serializer() {
            return ShoppingCart$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ShoppingCart copy(List<ShoppingCartItem> list, String str, String str2, ShoppingResultsAttribution shoppingResultsAttribution) {
        C7384Etj.A0Y(list, 0);
        return new ShoppingCart(list, str, str2, shoppingResultsAttribution);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCart) {
                ShoppingCart shoppingCart = (ShoppingCart) obj;
                if (!C7384Etj.areEqual(this.items, shoppingCart.items) || !C7384Etj.areEqual(this.subtotal, shoppingCart.subtotal) || !C7384Etj.areEqual(this.retailerName, shoppingCart.retailerName) || !C7384Etj.areEqual(this.attribution, shoppingCart.attribution)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ShoppingCart(int i, List list, String str, String str2, ShoppingResultsAttribution shoppingResultsAttribution, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ShoppingCart$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.subtotal = null;
        } else {
            this.subtotal = str;
        }
        if ((i & 4) == 0) {
            this.retailerName = null;
        } else {
            this.retailerName = str2;
        }
        if ((i & 8) == 0) {
            this.attribution = null;
        } else {
            this.attribution = shoppingResultsAttribution;
        }
    }

    public static /* synthetic */ ShoppingCart copy$default(ShoppingCart shoppingCart, List list, String str, String str2, ShoppingResultsAttribution shoppingResultsAttribution, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shoppingCart.items;
        }
        if ((i & 2) != 0) {
            str = shoppingCart.subtotal;
        }
        if ((i & 4) != 0) {
            str2 = shoppingCart.retailerName;
        }
        if ((i & 8) != 0) {
            shoppingResultsAttribution = shoppingCart.attribution;
        }
        C7384Etj.A0Y(list, 0);
        return new ShoppingCart(list, str, str2, shoppingResultsAttribution);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCart shoppingCart, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(shoppingCart.items, C3cH.A15($childSerializers, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || shoppingCart.subtotal != null) {
            c9j5.AAP(shoppingCart.subtotal, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || shoppingCart.retailerName != null) {
            c9j5.AAP(shoppingCart.retailerName, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || shoppingCart.attribution != null) {
            c9j5.AAP(shoppingCart.attribution, ShoppingResultsAttribution$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public final List<ShoppingCartItem> component1() {
        return this.items;
    }

    public final String component2() {
        return this.subtotal;
    }

    public final String component3() {
        return this.retailerName;
    }

    public final ShoppingResultsAttribution component4() {
        return this.attribution;
    }

    public final ShoppingResultsAttribution getAttribution() {
        return this.attribution;
    }

    public final List<ShoppingCartItem> getItems() {
        return this.items;
    }

    public final String getRetailerName() {
        return this.retailerName;
    }

    public final String getSubtotal() {
        return this.subtotal;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0E(this.items) + AnonymousClass006.A0G(this.subtotal)) * 31) + AnonymousClass006.A0G(this.retailerName)) * 31) + C3cH.A02(this.attribution);
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingCart(List<ShoppingCartItem> list, String str, String str2, ShoppingResultsAttribution shoppingResultsAttribution) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
        this.subtotal = str;
        this.retailerName = str2;
        this.attribution = shoppingResultsAttribution;
    }

    public /* synthetic */ ShoppingCart(List list, String str, String str2, ShoppingResultsAttribution shoppingResultsAttribution, int i, C06H c06h) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : shoppingResultsAttribution);
    }
}
