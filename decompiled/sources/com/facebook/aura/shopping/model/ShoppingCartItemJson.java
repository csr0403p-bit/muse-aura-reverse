package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07799it;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShoppingCartItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String id;
    public final String image_url;
    public final String line_price;
    public final String name;
    public final Double quantity;

    public final class Companion {
        public final C9hr<ShoppingCartItemJson> serializer() {
            return ShoppingCartItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCartItemJson shoppingCartItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingCartItemJson.id)) {
            c9j5.AAV(shoppingCartItemJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingCartItemJson.name)) {
            c9j5.AAV(shoppingCartItemJson.name, c9iZ, 1);
        }
        if (zAfR || shoppingCartItemJson.quantity != null) {
            c9j5.AAP(shoppingCartItemJson.quantity, C07799it.A00, c9iZ, 2);
        }
        if (zAfR || !"".equals(shoppingCartItemJson.image_url)) {
            c9j5.AAV(shoppingCartItemJson.image_url, c9iZ, 3);
        }
        if (zAfR || !"".equals(shoppingCartItemJson.line_price)) {
            c9j5.AAV(shoppingCartItemJson.line_price, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartItemJson) {
                ShoppingCartItemJson shoppingCartItemJson = (ShoppingCartItemJson) obj;
                if (!C7384Etj.areEqual(this.id, shoppingCartItemJson.id) || !C7384Etj.areEqual(this.name, shoppingCartItemJson.name) || !C7384Etj.areEqual(this.quantity, shoppingCartItemJson.quantity) || !C7384Etj.areEqual(this.image_url, shoppingCartItemJson.image_url) || !C7384Etj.areEqual(this.line_price, shoppingCartItemJson.line_price)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ShoppingCartItemJson copy$default(ShoppingCartItemJson shoppingCartItemJson, String str, String str2, Double d, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCartItemJson.id;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCartItemJson.name;
        }
        if ((i & 4) != 0) {
            d = shoppingCartItemJson.quantity;
        }
        if ((i & 8) != 0) {
            str3 = shoppingCartItemJson.image_url;
        }
        if ((i & 16) != 0) {
            str4 = shoppingCartItemJson.line_price;
        }
        return shoppingCartItemJson.copy(str, str2, d, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Double component3() {
        return this.quantity;
    }

    public final String component4() {
        return this.image_url;
    }

    public final String component5() {
        return this.line_price;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getLine_price() {
        return this.line_price;
    }

    public final String getName() {
        return this.name;
    }

    public final Double getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.line_price, AnonymousClass005.A0I(this.image_url, (AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0D(this.quantity)) * 31));
    }

    public /* synthetic */ ShoppingCartItemJson(int i, String str, String str2, Double d, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.quantity = null;
        } else {
            this.quantity = d;
        }
        if ((i & 8) == 0) {
            this.image_url = "";
        } else {
            this.image_url = str3;
        }
        if ((i & 16) == 0) {
            this.line_price = "";
        } else {
            this.line_price = str4;
        }
    }

    public final ShoppingCartItemJson copy(String str, String str2, Double d, String str3, String str4) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        return new ShoppingCartItemJson(str, str2, d, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingCartItemJson(String str, String str2, Double d, String str3, String str4) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        this.id = str;
        this.name = str2;
        this.quantity = d;
        this.image_url = str3;
        this.line_price = str4;
    }

    public /* synthetic */ ShoppingCartItemJson(String str, String str2, Double d, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    public ShoppingCartItemJson() {
        this("", "", null, "", "");
    }
}
