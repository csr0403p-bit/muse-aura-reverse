package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.HsK;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCartItem extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String id;
    public final String imageUrl;
    public final String linePrice;
    public final String name;
    public final double quantity;

    public final class Companion {
        public final C9hr<ShoppingCartItem> serializer() {
            return ShoppingCartItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCartItem shoppingCartItem, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(shoppingCartItem.id, c9iZ, 0);
        c9j5.AAV(shoppingCartItem.name, c9iZ, 1);
        c9j5.AAD(c9iZ, shoppingCartItem.quantity, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || shoppingCartItem.imageUrl != null) {
            c9j5.AAP(shoppingCartItem.imageUrl, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || shoppingCartItem.linePrice != null) {
            c9j5.AAP(shoppingCartItem.linePrice, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartItem) {
                ShoppingCartItem shoppingCartItem = (ShoppingCartItem) obj;
                if (!C7384Etj.areEqual(this.id, shoppingCartItem.id) || !C7384Etj.areEqual(this.name, shoppingCartItem.name) || Double.compare(this.quantity, shoppingCartItem.quantity) != 0 || !C7384Etj.areEqual(this.imageUrl, shoppingCartItem.imageUrl) || !C7384Etj.areEqual(this.linePrice, shoppingCartItem.linePrice)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingCartItem copy$default(ShoppingCartItem shoppingCartItem, String str, String str2, double d, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCartItem.id;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCartItem.name;
        }
        if ((i & 4) != 0) {
            d = shoppingCartItem.quantity;
        }
        if ((i & 8) != 0) {
            str3 = shoppingCartItem.imageUrl;
        }
        if ((i & 16) != 0) {
            str4 = shoppingCartItem.linePrice;
        }
        return shoppingCartItem.copy(str, str2, d, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final double component3() {
        return this.quantity;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.linePrice;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLinePrice() {
        return this.linePrice;
    }

    public final String getName() {
        return this.name;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id)) + HsK.A00(this.quantity)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass005.A0H(this.linePrice);
    }

    public ShoppingCartItem(String str, String str2, double d, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.name = str2;
        this.quantity = d;
        this.imageUrl = str3;
        this.linePrice = str4;
    }

    public final ShoppingCartItem copy(String str, String str2, double d, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new ShoppingCartItem(str, str2, d, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCartItem(String str, String str2, double d, String str3, String str4, int i, C06H c06h) {
        this(str, str2, d, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public /* synthetic */ ShoppingCartItem(int i, String str, String str2, double d, String str3, String str4, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ShoppingCartItem$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.name = str2;
        this.quantity = d;
        if ((i & 8) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str3;
        }
        if ((i & 16) == 0) {
            this.linePrice = null;
        } else {
            this.linePrice = str4;
        }
    }
}
