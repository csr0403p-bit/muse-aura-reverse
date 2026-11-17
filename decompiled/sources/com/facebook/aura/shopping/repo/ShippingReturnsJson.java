package com.facebook.aura.shopping.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07839ix;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9oY;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ProductShippingReturns;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonPrimitive;

@Serializable
/* loaded from: classes4.dex */
public final class ShippingReturnsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer fastest_shipping_days;
    public final Boolean free_returns;
    public final FreeShippingJson free_shipping;
    public final JsonElement fulfillment_methods;
    public final JsonElement membership_free_shipping;
    public final JsonElement not_returnable;
    public final JsonElement return_policy_text;
    public final Integer return_window_days;

    public final class Companion {
        public final C9hr<ShippingReturnsJson> serializer() {
            return ShippingReturnsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ShippingReturnsJson copy$default(ShippingReturnsJson shippingReturnsJson, FreeShippingJson freeShippingJson, Integer num, Boolean bool, Integer num2, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4, int i, Object obj) {
        FreeShippingJson freeShippingJson2 = freeShippingJson;
        Integer num3 = num;
        Boolean bool2 = bool;
        Integer num4 = num2;
        JsonElement jsonElement5 = jsonElement;
        JsonElement jsonElement6 = jsonElement2;
        JsonElement jsonElement7 = jsonElement3;
        JsonElement jsonElement8 = jsonElement4;
        if ((i & 1) != 0) {
            freeShippingJson2 = shippingReturnsJson.free_shipping;
        }
        if ((i & 2) != 0) {
            num3 = shippingReturnsJson.fastest_shipping_days;
        }
        if ((i & 4) != 0) {
            bool2 = shippingReturnsJson.free_returns;
        }
        if ((i & 8) != 0) {
            num4 = shippingReturnsJson.return_window_days;
        }
        if ((i & 16) != 0) {
            jsonElement5 = shippingReturnsJson.fulfillment_methods;
        }
        if ((i & 32) != 0) {
            jsonElement6 = shippingReturnsJson.membership_free_shipping;
        }
        if ((i & 64) != 0) {
            jsonElement7 = shippingReturnsJson.return_policy_text;
        }
        if ((i & 128) != 0) {
            jsonElement8 = shippingReturnsJson.not_returnable;
        }
        return new ShippingReturnsJson(freeShippingJson2, num3, bool2, num4, jsonElement5, jsonElement6, jsonElement7, jsonElement8);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ShippingReturnsJson shippingReturnsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || shippingReturnsJson.free_shipping != null) {
            c9j5.AAP(shippingReturnsJson.free_shipping, FreeShippingJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || shippingReturnsJson.fastest_shipping_days != null) {
            c9j5.AAP(shippingReturnsJson.fastest_shipping_days, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || shippingReturnsJson.free_returns != null) {
            c9j5.AAP(shippingReturnsJson.free_returns, C07839ix.A00, c9iZ, 2);
        }
        if (zAfR || shippingReturnsJson.return_window_days != null) {
            c9j5.AAP(shippingReturnsJson.return_window_days, C07729ii.A00, c9iZ, 3);
        }
        if (zAfR || shippingReturnsJson.fulfillment_methods != null) {
            c9j5.AAP(shippingReturnsJson.fulfillment_methods, JsonElementSerializer.A00, c9iZ, 4);
        }
        if (zAfR || shippingReturnsJson.membership_free_shipping != null) {
            c9j5.AAP(shippingReturnsJson.membership_free_shipping, JsonElementSerializer.A00, c9iZ, 5);
        }
        if (zAfR || shippingReturnsJson.return_policy_text != null) {
            c9j5.AAP(shippingReturnsJson.return_policy_text, JsonElementSerializer.A00, c9iZ, 6);
        }
        if (zAfR || shippingReturnsJson.not_returnable != null) {
            c9j5.AAP(shippingReturnsJson.not_returnable, JsonElementSerializer.A00, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShippingReturnsJson) {
                ShippingReturnsJson shippingReturnsJson = (ShippingReturnsJson) obj;
                if (!C7384Etj.areEqual(this.free_shipping, shippingReturnsJson.free_shipping) || !C7384Etj.areEqual(this.fastest_shipping_days, shippingReturnsJson.fastest_shipping_days) || !C7384Etj.areEqual(this.free_returns, shippingReturnsJson.free_returns) || !C7384Etj.areEqual(this.return_window_days, shippingReturnsJson.return_window_days) || !C7384Etj.areEqual(this.fulfillment_methods, shippingReturnsJson.fulfillment_methods) || !C7384Etj.areEqual(this.membership_free_shipping, shippingReturnsJson.membership_free_shipping) || !C7384Etj.areEqual(this.return_policy_text, shippingReturnsJson.return_policy_text) || !C7384Etj.areEqual(this.not_returnable, shippingReturnsJson.not_returnable)) {
                }
            }
            return false;
        }
        return true;
    }

    public final FreeShippingJson component1() {
        return this.free_shipping;
    }

    public final Integer component2() {
        return this.fastest_shipping_days;
    }

    public final Boolean component3() {
        return this.free_returns;
    }

    public final Integer component4() {
        return this.return_window_days;
    }

    public final JsonElement component5() {
        return this.fulfillment_methods;
    }

    public final JsonElement component6() {
        return this.membership_free_shipping;
    }

    public final JsonElement component7() {
        return this.return_policy_text;
    }

    public final JsonElement component8() {
        return this.not_returnable;
    }

    public final ShippingReturnsJson copy(FreeShippingJson freeShippingJson, Integer num, Boolean bool, Integer num2, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4) {
        return new ShippingReturnsJson(freeShippingJson, num, bool, num2, jsonElement, jsonElement2, jsonElement3, jsonElement4);
    }

    public final Integer getFastest_shipping_days() {
        return this.fastest_shipping_days;
    }

    public final Boolean getFree_returns() {
        return this.free_returns;
    }

    public final FreeShippingJson getFree_shipping() {
        return this.free_shipping;
    }

    public final JsonElement getFulfillment_methods() {
        return this.fulfillment_methods;
    }

    public final JsonElement getMembership_free_shipping() {
        return this.membership_free_shipping;
    }

    public final JsonElement getNot_returnable() {
        return this.not_returnable;
    }

    public final JsonElement getReturn_policy_text() {
        return this.return_policy_text;
    }

    public final Integer getReturn_window_days() {
        return this.return_window_days;
    }

    public int hashCode() {
        return (((((((((((((AnonymousClass006.A0D(this.free_shipping) * 31) + AnonymousClass006.A0D(this.fastest_shipping_days)) * 31) + AnonymousClass006.A0D(this.free_returns)) * 31) + AnonymousClass006.A0D(this.return_window_days)) * 31) + AnonymousClass006.A0D(this.fulfillment_methods)) * 31) + AnonymousClass006.A0D(this.membership_free_shipping)) * 31) + AnonymousClass006.A0D(this.return_policy_text)) * 31) + C3cH.A02(this.not_returnable);
    }

    public final ProductShippingReturns toDomain() {
        List list;
        Boolean boolA01;
        JsonPrimitive jsonPrimitive;
        ProductShippingReturns.FulfillmentMethod fulfillmentMethod;
        FreeShippingJson freeShippingJson = this.free_shipping;
        ProductShippingReturns.FreeShipping domain = freeShippingJson != null ? freeShippingJson.toDomain() : null;
        Integer num = this.fastest_shipping_days;
        Boolean bool = this.free_returns;
        Integer num2 = this.return_window_days;
        JsonElement jsonElement = this.fulfillment_methods;
        if (!(jsonElement instanceof JsonArray) || (list = (JsonArray) jsonElement) == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strStringOrNull = HatchProductDetailsJsonKt.stringOrNull((JsonElement) it.next());
            if ("shipping".equals(strStringOrNull)) {
                fulfillmentMethod = ProductShippingReturns.FulfillmentMethod.SHIPPING;
            } else if ("delivery".equals(strStringOrNull)) {
                fulfillmentMethod = ProductShippingReturns.FulfillmentMethod.DELIVERY;
            }
            arrayListA0h.add(fulfillmentMethod);
        }
        List listA0m = C3cG.A0m(arrayListA0h);
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(HatchProductDetailsJsonKt.stringOrNull(this.membership_free_shipping));
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(HatchProductDetailsJsonKt.stringOrNull(this.return_policy_text));
        JsonElement jsonElement2 = this.not_returnable;
        if (!(jsonElement2 instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElement2) == null || (boolA01 = C9oY.A01(jsonPrimitive)) == null || !boolA01.booleanValue()) {
            boolA01 = null;
        }
        return new ProductShippingReturns(domain, num, bool, num2, listA0m, strTrimToNonEmpty, strTrimToNonEmpty2, boolA01);
    }

    public ShippingReturnsJson(FreeShippingJson freeShippingJson, Integer num, Boolean bool, Integer num2, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4) {
        this.free_shipping = freeShippingJson;
        this.fastest_shipping_days = num;
        this.free_returns = bool;
        this.return_window_days = num2;
        this.fulfillment_methods = jsonElement;
        this.membership_free_shipping = jsonElement2;
        this.return_policy_text = jsonElement3;
        this.not_returnable = jsonElement4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShippingReturnsJson(FreeShippingJson freeShippingJson, Integer num, Boolean bool, Integer num2, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : freeShippingJson, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : jsonElement, (i & 32) != 0 ? null : jsonElement2, (i & 64) != 0 ? null : jsonElement3, (i & 128) != 0 ? null : jsonElement4);
    }

    public /* synthetic */ ShippingReturnsJson(int i, FreeShippingJson freeShippingJson, Integer num, Boolean bool, Integer num2, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.free_shipping = null;
        } else {
            this.free_shipping = freeShippingJson;
        }
        if ((i & 2) == 0) {
            this.fastest_shipping_days = null;
        } else {
            this.fastest_shipping_days = num;
        }
        if ((i & 4) == 0) {
            this.free_returns = null;
        } else {
            this.free_returns = bool;
        }
        if ((i & 8) == 0) {
            this.return_window_days = null;
        } else {
            this.return_window_days = num2;
        }
        if ((i & 16) == 0) {
            this.fulfillment_methods = null;
        } else {
            this.fulfillment_methods = jsonElement;
        }
        if ((i & 32) == 0) {
            this.membership_free_shipping = null;
        } else {
            this.membership_free_shipping = jsonElement2;
        }
        if ((i & 64) == 0) {
            this.return_policy_text = null;
        } else {
            this.return_policy_text = jsonElement3;
        }
        if ((i & 128) == 0) {
            this.not_returnable = null;
        } else {
            this.not_returnable = jsonElement4;
        }
    }

    public ShippingReturnsJson() {
        this(null, null, null, null, null, null, null, null);
    }
}
