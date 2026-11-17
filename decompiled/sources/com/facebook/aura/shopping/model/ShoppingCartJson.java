package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ShoppingCartJson extends C06G {
    public final ShoppingCartAttributionJson attribution;
    public final String captured_at;
    public final ShoppingCartCheckoutActionJson checkout_action;
    public final List<ShoppingCartItemJson> items;
    public final String retailer_name;
    public final ShoppingSecondaryActionJson secondary_action;
    public final String subtotal;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final int $stable = ShoppingSecondaryActionJson.$stable;
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, ShoppingCartJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null};

    public final class Companion {
        public final C9hr<ShoppingCartJson> serializer() {
            return ShoppingCartJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ShoppingCartJson(String str, List<ShoppingCartItemJson> list, String str2, String str3, ShoppingCartAttributionJson shoppingCartAttributionJson, String str4, ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson, ShoppingSecondaryActionJson shoppingSecondaryActionJson) {
        AnonymousClass005.A11(str, str2, str3, 0);
        this.title = str;
        this.items = list;
        this.subtotal = str2;
        this.retailer_name = str3;
        this.attribution = shoppingCartAttributionJson;
        this.captured_at = str4;
        this.checkout_action = shoppingCartCheckoutActionJson;
        this.secondary_action = shoppingSecondaryActionJson;
    }

    public final ShoppingCartJson copy(String str, List<ShoppingCartItemJson> list, String str2, String str3, ShoppingCartAttributionJson shoppingCartAttributionJson, String str4, ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson, ShoppingSecondaryActionJson shoppingSecondaryActionJson) {
        AnonymousClass005.A11(str, str2, str3, 0);
        return new ShoppingCartJson(str, list, str2, str3, shoppingCartAttributionJson, str4, shoppingCartCheckoutActionJson, shoppingSecondaryActionJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCartJson) {
                ShoppingCartJson shoppingCartJson = (ShoppingCartJson) obj;
                if (!C7384Etj.areEqual(this.title, shoppingCartJson.title) || !C7384Etj.areEqual(this.items, shoppingCartJson.items) || !C7384Etj.areEqual(this.subtotal, shoppingCartJson.subtotal) || !C7384Etj.areEqual(this.retailer_name, shoppingCartJson.retailer_name) || !C7384Etj.areEqual(this.attribution, shoppingCartJson.attribution) || !C7384Etj.areEqual(this.captured_at, shoppingCartJson.captured_at) || !C7384Etj.areEqual(this.checkout_action, shoppingCartJson.checkout_action) || !C7384Etj.areEqual(this.secondary_action, shoppingCartJson.secondary_action)) {
                }
            }
            return false;
        }
        return true;
    }

    public final ShoppingCart toCart(List<ShoppingCartItemJson> list) {
        String strTrimToNonEmpty;
        Double d;
        C7384Etj.A0Y(list, 0);
        if (list.size() <= 200) {
            HashSet hashSet = new HashSet(list.size());
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            for (ShoppingCartItemJson shoppingCartItemJson : list) {
                String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(shoppingCartItemJson.id);
                if (strTrimToNonEmpty2 != null && hashSet.add(strTrimToNonEmpty2) && (strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(shoppingCartItemJson.name)) != null && (d = shoppingCartItemJson.quantity) != null) {
                    double dDoubleValue = d.doubleValue();
                    if (Math.abs(dDoubleValue) <= Double.MAX_VALUE && dDoubleValue > 0.0d) {
                        arrayListA0i.add(new ShoppingCartItem(strTrimToNonEmpty2, strTrimToNonEmpty, dDoubleValue, ProductDetailsPresentationKt.trimToNonEmpty(shoppingCartItemJson.image_url), ProductDetailsPresentationKt.trimToNonEmpty(shoppingCartItemJson.line_price)));
                    }
                }
            }
            int i = ShoppingCart.$stable;
            String strTrimToNonEmpty3 = ProductDetailsPresentationKt.trimToNonEmpty(this.subtotal);
            String strTrimToNonEmpty4 = ProductDetailsPresentationKt.trimToNonEmpty(this.retailer_name);
            ShoppingCartAttributionJson shoppingCartAttributionJson = this.attribution;
            return new ShoppingCart(arrayListA0i, strTrimToNonEmpty3, strTrimToNonEmpty4, shoppingCartAttributionJson != null ? shoppingCartAttributionJson.toDomain() : null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingCartJson copy$default(ShoppingCartJson shoppingCartJson, String str, List list, String str2, String str3, ShoppingCartAttributionJson shoppingCartAttributionJson, String str4, ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson, ShoppingSecondaryActionJson shoppingSecondaryActionJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCartJson.title;
        }
        if ((i & 2) != 0) {
            list = shoppingCartJson.items;
        }
        if ((i & 4) != 0) {
            str2 = shoppingCartJson.subtotal;
        }
        if ((i & 8) != 0) {
            str3 = shoppingCartJson.retailer_name;
        }
        if ((i & 16) != 0) {
            shoppingCartAttributionJson = shoppingCartJson.attribution;
        }
        if ((i & 32) != 0) {
            str4 = shoppingCartJson.captured_at;
        }
        if ((i & 64) != 0) {
            shoppingCartCheckoutActionJson = shoppingCartJson.checkout_action;
        }
        if ((i & 128) != 0) {
            shoppingSecondaryActionJson = shoppingCartJson.secondary_action;
        }
        return shoppingCartJson.copy(str, list, str2, str3, shoppingCartAttributionJson, str4, shoppingCartCheckoutActionJson, shoppingSecondaryActionJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCartJson shoppingCartJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingCartJson.title)) {
            c9j5.AAV(shoppingCartJson.title, c9iZ, 0);
        }
        if (zAfR || shoppingCartJson.items != null) {
            c9j5.AAP(shoppingCartJson.items, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !"".equals(shoppingCartJson.subtotal)) {
            c9j5.AAV(shoppingCartJson.subtotal, c9iZ, 2);
        }
        if (zAfR || !"".equals(shoppingCartJson.retailer_name)) {
            c9j5.AAV(shoppingCartJson.retailer_name, c9iZ, 3);
        }
        if (zAfR || shoppingCartJson.attribution != null) {
            c9j5.AAP(shoppingCartJson.attribution, ShoppingCartAttributionJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || shoppingCartJson.captured_at != null) {
            c9j5.AAP(shoppingCartJson.captured_at, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || shoppingCartJson.checkout_action != null) {
            c9j5.AAP(shoppingCartJson.checkout_action, ShoppingCartCheckoutActionJson$$serializer.INSTANCE, c9iZ, 6);
        }
        if (zAfR || shoppingCartJson.secondary_action != null) {
            c9j5.AAP(shoppingCartJson.secondary_action, ShoppingSecondaryActionJson$$serializer.INSTANCE, c9iZ, 7);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final List<ShoppingCartItemJson> component2() {
        return this.items;
    }

    public final String component3() {
        return this.subtotal;
    }

    public final String component4() {
        return this.retailer_name;
    }

    public final ShoppingCartAttributionJson component5() {
        return this.attribution;
    }

    public final String component6() {
        return this.captured_at;
    }

    public final ShoppingCartCheckoutActionJson component7() {
        return this.checkout_action;
    }

    public final ShoppingSecondaryActionJson component8() {
        return this.secondary_action;
    }

    public final ShoppingCartAttributionJson getAttribution() {
        return this.attribution;
    }

    public final String getCaptured_at() {
        return this.captured_at;
    }

    public final ShoppingCartCheckoutActionJson getCheckout_action() {
        return this.checkout_action;
    }

    public final List<ShoppingCartItemJson> getItems() {
        return this.items;
    }

    public final String getRetailer_name() {
        return this.retailer_name;
    }

    public final ShoppingSecondaryActionJson getSecondary_action() {
        return this.secondary_action;
    }

    public final String getSubtotal() {
        return this.subtotal;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.retailer_name, AnonymousClass005.A0I(this.subtotal, (AnonymousClass001.A0G(this.title) + AnonymousClass006.A0D(this.items)) * 31)) + AnonymousClass006.A0D(this.attribution)) * 31) + AnonymousClass006.A0G(this.captured_at)) * 31) + AnonymousClass006.A0D(this.checkout_action)) * 31) + C3cH.A02(this.secondary_action);
    }

    public final CurrentShoppingCart toCurrentCart() {
        ShoppingCart cart;
        String str;
        List<ShoppingCartItemJson> list = this.items;
        if (list == null || (cart = toCart(list)) == null) {
            return null;
        }
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(this.captured_at);
        ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson = this.checkout_action;
        if (shoppingCartCheckoutActionJson == null || !"agent_checkout".equals(shoppingCartCheckoutActionJson.type) || strTrimToNonEmpty == null || cart.items.isEmpty() || (str = shoppingCartCheckoutActionJson.label) == null || C7BY.A0j(str)) {
            str = null;
        }
        ShoppingSecondaryActionJson shoppingSecondaryActionJson = this.secondary_action;
        return new CurrentShoppingCart(cart, strTrimToNonEmpty, str, shoppingSecondaryActionJson != null ? shoppingSecondaryActionJson.toDomain() : null);
    }

    public final ShoppingCartPresentation toPresentation(String str) {
        List<ShoppingCartItemJson> list;
        ShoppingCart cart;
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(this.title);
        if (strTrimToNonEmpty == null || (list = this.items) == null || (cart = toCart(list)) == null) {
            return null;
        }
        return new ShoppingCartPresentation(strTrimToNonEmpty, cart, ProductDetailsPresentationKt.trimToNonEmpty(str));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCartJson(String str, List list, String str2, String str3, ShoppingCartAttributionJson shoppingCartAttributionJson, String str4, ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson, ShoppingSecondaryActionJson shoppingSecondaryActionJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : shoppingCartAttributionJson, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : shoppingCartCheckoutActionJson, (i & 128) != 0 ? null : shoppingSecondaryActionJson);
    }

    public /* synthetic */ ShoppingCartJson(int i, String str, List list, String str2, String str3, ShoppingCartAttributionJson shoppingCartAttributionJson, String str4, ShoppingCartCheckoutActionJson shoppingCartCheckoutActionJson, ShoppingSecondaryActionJson shoppingSecondaryActionJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
        if ((i & 4) == 0) {
            this.subtotal = "";
        } else {
            this.subtotal = str2;
        }
        if ((i & 8) == 0) {
            this.retailer_name = "";
        } else {
            this.retailer_name = str3;
        }
        if ((i & 16) == 0) {
            this.attribution = null;
        } else {
            this.attribution = shoppingCartAttributionJson;
        }
        if ((i & 32) == 0) {
            this.captured_at = null;
        } else {
            this.captured_at = str4;
        }
        if ((i & 64) == 0) {
            this.checkout_action = null;
        } else {
            this.checkout_action = shoppingCartCheckoutActionJson;
        }
        if ((i & 128) == 0) {
            this.secondary_action = null;
        } else {
            this.secondary_action = shoppingSecondaryActionJson;
        }
    }

    public ShoppingCartJson() {
        this("", null, "", "", null, null, null, null);
    }
}
