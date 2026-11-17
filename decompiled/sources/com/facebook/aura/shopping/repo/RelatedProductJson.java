package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class RelatedProductJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String brand;
    public final String id;
    public final String image_url;
    public final String name;
    public final JsonElement pdp_coupon;
    public final String price;
    public final String sale_price;
    public final String url;

    public final class Companion {
        public final C9hr<RelatedProductJson> serializer() {
            return RelatedProductJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public RelatedProductJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.name = str2;
        this.brand = str3;
        this.price = str4;
        this.sale_price = str5;
        this.url = str6;
        this.image_url = str7;
        this.pdp_coupon = jsonElement;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(RelatedProductJson relatedProductJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(relatedProductJson.id)) {
            c9j5.AAV(relatedProductJson.id, c9iZ, 0);
        }
        if (zAfR || relatedProductJson.name != null) {
            c9j5.AAP(relatedProductJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || relatedProductJson.brand != null) {
            c9j5.AAP(relatedProductJson.brand, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || relatedProductJson.price != null) {
            c9j5.AAP(relatedProductJson.price, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || relatedProductJson.sale_price != null) {
            c9j5.AAP(relatedProductJson.sale_price, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || relatedProductJson.url != null) {
            c9j5.AAP(relatedProductJson.url, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || relatedProductJson.image_url != null) {
            c9j5.AAP(relatedProductJson.image_url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || relatedProductJson.pdp_coupon != null) {
            c9j5.AAP(relatedProductJson.pdp_coupon, JsonElementSerializer.A00, c9iZ, 7);
        }
    }

    public final RelatedProductJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement) {
        C7384Etj.A0Y(str, 0);
        return new RelatedProductJson(str, str2, str3, str4, str5, str6, str7, jsonElement);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RelatedProductJson) {
                RelatedProductJson relatedProductJson = (RelatedProductJson) obj;
                if (!C7384Etj.areEqual(this.id, relatedProductJson.id) || !C7384Etj.areEqual(this.name, relatedProductJson.name) || !C7384Etj.areEqual(this.brand, relatedProductJson.brand) || !C7384Etj.areEqual(this.price, relatedProductJson.price) || !C7384Etj.areEqual(this.sale_price, relatedProductJson.sale_price) || !C7384Etj.areEqual(this.url, relatedProductJson.url) || !C7384Etj.areEqual(this.image_url, relatedProductJson.image_url) || !C7384Etj.areEqual(this.pdp_coupon, relatedProductJson.pdp_coupon)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RelatedProductJson copy$default(RelatedProductJson relatedProductJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = relatedProductJson.id;
        }
        if ((i & 2) != 0) {
            str2 = relatedProductJson.name;
        }
        if ((i & 4) != 0) {
            str3 = relatedProductJson.brand;
        }
        if ((i & 8) != 0) {
            str4 = relatedProductJson.price;
        }
        if ((i & 16) != 0) {
            str5 = relatedProductJson.sale_price;
        }
        if ((i & 32) != 0) {
            str6 = relatedProductJson.url;
        }
        if ((i & 64) != 0) {
            str7 = relatedProductJson.image_url;
        }
        if ((i & 128) != 0) {
            jsonElement = relatedProductJson.pdp_coupon;
        }
        return relatedProductJson.copy(str, str2, str3, str4, str5, str6, str7, jsonElement);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.brand;
    }

    public final String component4() {
        return this.price;
    }

    public final String component5() {
        return this.sale_price;
    }

    public final String component6() {
        return this.url;
    }

    public final String component7() {
        return this.image_url;
    }

    public final JsonElement component8() {
        return this.pdp_coupon;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getName() {
        return this.name;
    }

    public final JsonElement getPdp_coupon() {
        return this.pdp_coupon;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getSale_price() {
        return this.sale_price;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.brand)) * 31) + AnonymousClass006.A0G(this.price)) * 31) + AnonymousClass006.A0G(this.sale_price)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + C3cH.A02(this.pdp_coupon);
    }

    public final ShoppingResultProduct toDomain(String str) {
        String str2 = this.price;
        String str3 = null;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        String str4 = this.id;
        if (C7BY.A0j(str4)) {
            str4 = null;
        }
        String str5 = this.name;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.brand;
        if (str6 == null || C7BY.A0j(str6)) {
            str6 = null;
        }
        String str7 = this.image_url;
        if (str7 == null || C7BY.A0j(str7)) {
            str7 = null;
        }
        String str8 = this.sale_price;
        if (str8 == null || C7BY.A0j(str8) || str8.equals(str2)) {
            str8 = null;
        }
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str);
        String str9 = this.url;
        if (str9 != null && !C7BY.A0j(str9)) {
            str3 = str9;
        }
        return new ShoppingResultProduct(str4, str5, str6, str7, str2, str8, strTrimToNonEmpty, str3, ShoppingProductType.CATALOG, true, false, false, null, null, true, null, null, null, null, null, null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RelatedProductJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : jsonElement);
    }

    public /* synthetic */ RelatedProductJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, JsonElement jsonElement, C2hx c2hx) {
        this.id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.brand = null;
        } else {
            this.brand = str3;
        }
        if ((i & 8) == 0) {
            this.price = null;
        } else {
            this.price = str4;
        }
        if ((i & 16) == 0) {
            this.sale_price = null;
        } else {
            this.sale_price = str5;
        }
        if ((i & 32) == 0) {
            this.url = null;
        } else {
            this.url = str6;
        }
        if ((i & 64) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str7;
        }
        if ((i & 128) == 0) {
            this.pdp_coupon = null;
        } else {
            this.pdp_coupon = jsonElement;
        }
    }

    public RelatedProductJson() {
        this("", null, null, null, null, null, null, null);
    }
}
