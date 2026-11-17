package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingResultProductJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String brand;
    public final String citation_id;
    public final ShoppingConnectorJson connector;
    public final String currency;
    public final String highlighted_attribute;
    public final String image_url;
    public final boolean is_agentic_checkout_creation_enabled;
    public final boolean is_image_available;
    public final boolean is_unavailable;
    public final String name;
    public final JsonElement pdp_coupon;
    public final String price;
    public final String primary_action;
    public final String product_id;
    public final String provider;
    public final String retailer_name;
    public final String sale_price;
    public final ShoppingSecondaryActionJson secondary_action;
    public final String type;
    public final String url;

    public final class Companion {
        public final C9hr<ShoppingResultProductJson> serializer() {
            return ShoppingResultProductJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingResultProductJson shoppingResultProductJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingResultProductJson.brand)) {
            c9j5.AAV(shoppingResultProductJson.brand, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.citation_id)) {
            c9j5.AAV(shoppingResultProductJson.citation_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.image_url)) {
            c9j5.AAV(shoppingResultProductJson.image_url, c9iZ, 2);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.name)) {
            c9j5.AAV(shoppingResultProductJson.name, c9iZ, 3);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.price)) {
            c9j5.AAV(shoppingResultProductJson.price, c9iZ, 4);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.product_id)) {
            c9j5.AAV(shoppingResultProductJson.product_id, c9iZ, 5);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.sale_price)) {
            c9j5.AAV(shoppingResultProductJson.sale_price, c9iZ, 6);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.currency)) {
            c9j5.AAV(shoppingResultProductJson.currency, c9iZ, 7);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.url)) {
            c9j5.AAV(shoppingResultProductJson.url, c9iZ, 8);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.type)) {
            c9j5.AAV(shoppingResultProductJson.type, c9iZ, 9);
        }
        if (zAfR || shoppingResultProductJson.is_agentic_checkout_creation_enabled) {
            c9j5.AA7(c9iZ, 10, shoppingResultProductJson.is_agentic_checkout_creation_enabled);
        }
        if (zAfR || !shoppingResultProductJson.is_image_available) {
            c9j5.AA7(c9iZ, 11, shoppingResultProductJson.is_image_available);
        }
        if (zAfR || shoppingResultProductJson.is_unavailable) {
            c9j5.AA7(c9iZ, 12, shoppingResultProductJson.is_unavailable);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.provider)) {
            c9j5.AAV(shoppingResultProductJson.provider, c9iZ, 13);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.retailer_name)) {
            c9j5.AAV(shoppingResultProductJson.retailer_name, c9iZ, 14);
        }
        if (zAfR || !"".equals(shoppingResultProductJson.primary_action)) {
            c9j5.AAV(shoppingResultProductJson.primary_action, c9iZ, 15);
        }
        if (zAfR || shoppingResultProductJson.secondary_action != null) {
            c9j5.AAP(shoppingResultProductJson.secondary_action, ShoppingSecondaryActionJson$$serializer.INSTANCE, c9iZ, 16);
        }
        if (zAfR || shoppingResultProductJson.pdp_coupon != null) {
            c9j5.AAP(shoppingResultProductJson.pdp_coupon, JsonElementSerializer.A00, c9iZ, 17);
        }
        if (zAfR || shoppingResultProductJson.connector != null) {
            c9j5.AAP(shoppingResultProductJson.connector, LenientShoppingConnectorSerializer.INSTANCE, c9iZ, 18);
        }
        if (zAfR || shoppingResultProductJson.highlighted_attribute != null) {
            c9j5.AAP(shoppingResultProductJson.highlighted_attribute, LenientShoppingStringSerializer.INSTANCE, c9iZ, 19);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingResultProductJson) {
                ShoppingResultProductJson shoppingResultProductJson = (ShoppingResultProductJson) obj;
                if (!C7384Etj.areEqual(this.brand, shoppingResultProductJson.brand) || !C7384Etj.areEqual(this.citation_id, shoppingResultProductJson.citation_id) || !C7384Etj.areEqual(this.image_url, shoppingResultProductJson.image_url) || !C7384Etj.areEqual(this.name, shoppingResultProductJson.name) || !C7384Etj.areEqual(this.price, shoppingResultProductJson.price) || !C7384Etj.areEqual(this.product_id, shoppingResultProductJson.product_id) || !C7384Etj.areEqual(this.sale_price, shoppingResultProductJson.sale_price) || !C7384Etj.areEqual(this.currency, shoppingResultProductJson.currency) || !C7384Etj.areEqual(this.url, shoppingResultProductJson.url) || !C7384Etj.areEqual(this.type, shoppingResultProductJson.type) || this.is_agentic_checkout_creation_enabled != shoppingResultProductJson.is_agentic_checkout_creation_enabled || this.is_image_available != shoppingResultProductJson.is_image_available || this.is_unavailable != shoppingResultProductJson.is_unavailable || !C7384Etj.areEqual(this.provider, shoppingResultProductJson.provider) || !C7384Etj.areEqual(this.retailer_name, shoppingResultProductJson.retailer_name) || !C7384Etj.areEqual(this.primary_action, shoppingResultProductJson.primary_action) || !C7384Etj.areEqual(this.secondary_action, shoppingResultProductJson.secondary_action) || !C7384Etj.areEqual(this.pdp_coupon, shoppingResultProductJson.pdp_coupon) || !C7384Etj.areEqual(this.connector, shoppingResultProductJson.connector) || !C7384Etj.areEqual(this.highlighted_attribute, shoppingResultProductJson.highlighted_attribute)) {
                }
            }
            return false;
        }
        return true;
    }

    @Serializable(with = LenientShoppingConnectorSerializer.class)
    public static /* synthetic */ void getConnector$annotations() {
    }

    @Serializable(with = LenientShoppingStringSerializer.class)
    public static /* synthetic */ void getHighlighted_attribute$annotations() {
    }

    public final String component1() {
        return this.brand;
    }

    public final String component10() {
        return this.type;
    }

    public final boolean component11() {
        return this.is_agentic_checkout_creation_enabled;
    }

    public final boolean component12() {
        return this.is_image_available;
    }

    public final boolean component13() {
        return this.is_unavailable;
    }

    public final String component14() {
        return this.provider;
    }

    public final String component15() {
        return this.retailer_name;
    }

    public final String component16() {
        return this.primary_action;
    }

    public final ShoppingSecondaryActionJson component17() {
        return this.secondary_action;
    }

    public final JsonElement component18() {
        return this.pdp_coupon;
    }

    public final ShoppingConnectorJson component19() {
        return this.connector;
    }

    public final String component2() {
        return this.citation_id;
    }

    public final String component20() {
        return this.highlighted_attribute;
    }

    public final String component3() {
        return this.image_url;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.price;
    }

    public final String component6() {
        return this.product_id;
    }

    public final String component7() {
        return this.sale_price;
    }

    public final String component8() {
        return this.currency;
    }

    public final String component9() {
        return this.url;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCitation_id() {
        return this.citation_id;
    }

    public final ShoppingConnectorJson getConnector() {
        return this.connector;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getHighlighted_attribute() {
        return this.highlighted_attribute;
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

    public final String getPrimary_action() {
        return this.primary_action;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getRetailer_name() {
        return this.retailer_name;
    }

    public final String getSale_price() {
        return this.sale_price;
    }

    public final ShoppingSecondaryActionJson getSecondary_action() {
        return this.secondary_action;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.primary_action, AnonymousClass005.A0I(this.retailer_name, AnonymousClass005.A0I(this.provider, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.type, AnonymousClass005.A0I(this.url, AnonymousClass005.A0I(this.currency, AnonymousClass005.A0I(this.sale_price, AnonymousClass005.A0I(this.product_id, AnonymousClass005.A0I(this.price, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.image_url, AnonymousClass005.A0I(this.citation_id, AnonymousClass001.A0G(this.brand)))))))))), this.is_agentic_checkout_creation_enabled), this.is_image_available), this.is_unavailable)))) + AnonymousClass006.A0D(this.secondary_action)) * 31) + AnonymousClass006.A0D(this.pdp_coupon)) * 31) + AnonymousClass006.A0D(this.connector)) * 31) + AnonymousClass005.A0H(this.highlighted_attribute);
    }

    public final boolean is_agentic_checkout_creation_enabled() {
        return this.is_agentic_checkout_creation_enabled;
    }

    public final boolean is_image_available() {
        return this.is_image_available;
    }

    public final boolean is_unavailable() {
        return this.is_unavailable;
    }

    public final ShoppingResultProduct toDomain() {
        String strA0l = AnonymousClass002.A0l(this.name);
        if (strA0l.length() <= 0) {
            return null;
        }
        String str = this.product_id;
        String str2 = this.url;
        ShoppingProductType shoppingProductType = ShoppingResultsPresentationKt.toShoppingProductType(this.type);
        String str3 = this.brand;
        String str4 = this.image_url;
        String str5 = this.price;
        String str6 = this.sale_price;
        String str7 = this.currency;
        String str8 = this.citation_id;
        String str9 = this.provider;
        String str10 = this.retailer_name;
        String str11 = this.primary_action;
        ShoppingSecondaryActionJson shoppingSecondaryActionJson = this.secondary_action;
        boolean z = this.is_image_available;
        boolean z2 = this.is_unavailable;
        boolean z3 = this.is_agentic_checkout_creation_enabled;
        ShoppingConnectorJson shoppingConnectorJson = this.connector;
        ShoppingConnector domain = shoppingConnectorJson != null ? shoppingConnectorJson.toDomain() : null;
        String str12 = this.highlighted_attribute;
        return ShoppingResultProductWireKt.shoppingResultProductOf(strA0l, str, str2, shoppingProductType, str3, str4, str5, str6, str7, str8, str9, str10, str11, shoppingSecondaryActionJson, z, z2, z3, false, null, domain, str12 != null ? ShoppingResultsPresentationJsonKt.toSingleLineOrNull(str12) : null);
    }

    public ShoppingResultProductJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, String str11, String str12, String str13, ShoppingSecondaryActionJson shoppingSecondaryActionJson, JsonElement jsonElement, ShoppingConnectorJson shoppingConnectorJson, String str14) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        C7384Etj.A0Y(str9, 8);
        C7384Etj.A0Y(str10, 9);
        C7384Etj.A0Y(str11, 13);
        C60Q.A1F(str12, 14, str13);
        this.brand = str;
        this.citation_id = str2;
        this.image_url = str3;
        this.name = str4;
        this.price = str5;
        this.product_id = str6;
        this.sale_price = str7;
        this.currency = str8;
        this.url = str9;
        this.type = str10;
        this.is_agentic_checkout_creation_enabled = z;
        this.is_image_available = z2;
        this.is_unavailable = z3;
        this.provider = str11;
        this.retailer_name = str12;
        this.primary_action = str13;
        this.secondary_action = shoppingSecondaryActionJson;
        this.pdp_coupon = jsonElement;
        this.connector = shoppingConnectorJson;
        this.highlighted_attribute = str14;
    }

    public final ShoppingResultProductJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, String str11, String str12, String str13, ShoppingSecondaryActionJson shoppingSecondaryActionJson, JsonElement jsonElement, ShoppingConnectorJson shoppingConnectorJson, String str14) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        C7384Etj.A0Y(str9, 8);
        C7384Etj.A0Y(str10, 9);
        C7384Etj.A0Y(str11, 13);
        C60Q.A1F(str12, 14, str13);
        return new ShoppingResultProductJson(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, z2, z3, str11, str12, str13, shoppingSecondaryActionJson, jsonElement, shoppingConnectorJson, str14);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ShoppingResultProductJson copy$default(ShoppingResultProductJson shoppingResultProductJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, String str11, String str12, String str13, ShoppingSecondaryActionJson shoppingSecondaryActionJson, JsonElement jsonElement, ShoppingConnectorJson shoppingConnectorJson, String str14, int i, Object obj) {
        String str15 = str8;
        String str16 = str9;
        String str17 = str10;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        String str18 = str11;
        String str19 = str12;
        String str20 = str13;
        ShoppingSecondaryActionJson shoppingSecondaryActionJson2 = shoppingSecondaryActionJson;
        JsonElement jsonElement2 = jsonElement;
        ShoppingConnectorJson shoppingConnectorJson2 = shoppingConnectorJson;
        String str21 = str14;
        if ((i & 1) != 0) {
            str = shoppingResultProductJson.brand;
        }
        if ((i & 2) != 0) {
            str2 = shoppingResultProductJson.citation_id;
        }
        if ((i & 4) != 0) {
            str3 = shoppingResultProductJson.image_url;
        }
        if ((i & 8) != 0) {
            str4 = shoppingResultProductJson.name;
        }
        if ((i & 16) != 0) {
            str5 = shoppingResultProductJson.price;
        }
        if ((i & 32) != 0) {
            str6 = shoppingResultProductJson.product_id;
        }
        if ((i & 64) != 0) {
            str7 = shoppingResultProductJson.sale_price;
        }
        if ((i & 128) != 0) {
            str15 = shoppingResultProductJson.currency;
        }
        if ((i & 256) != 0) {
            str16 = shoppingResultProductJson.url;
        }
        if ((i & 512) != 0) {
            str17 = shoppingResultProductJson.type;
        }
        if ((i & 1024) != 0) {
            z4 = shoppingResultProductJson.is_agentic_checkout_creation_enabled;
        }
        if ((i & 2048) != 0) {
            z5 = shoppingResultProductJson.is_image_available;
        }
        if ((i & 4096) != 0) {
            z6 = shoppingResultProductJson.is_unavailable;
        }
        if ((i & 8192) != 0) {
            str18 = shoppingResultProductJson.provider;
        }
        if ((i & 16384) != 0) {
            str19 = shoppingResultProductJson.retailer_name;
        }
        if ((i & 32768) != 0) {
            str20 = shoppingResultProductJson.primary_action;
        }
        if ((i & 65536) != 0) {
            shoppingSecondaryActionJson2 = shoppingResultProductJson.secondary_action;
        }
        if ((i & 131072) != 0) {
            jsonElement2 = shoppingResultProductJson.pdp_coupon;
        }
        if ((i & 262144) != 0) {
            shoppingConnectorJson2 = shoppingResultProductJson.connector;
        }
        if ((i & 524288) != 0) {
            str21 = shoppingResultProductJson.highlighted_attribute;
        }
        return shoppingResultProductJson.copy(str, str2, str3, str4, str5, str6, str7, str15, str16, str17, z4, z5, z6, str18, str19, str20, shoppingSecondaryActionJson2, jsonElement2, shoppingConnectorJson2, str21);
    }

    public /* synthetic */ ShoppingResultProductJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, String str11, String str12, String str13, ShoppingSecondaryActionJson shoppingSecondaryActionJson, JsonElement jsonElement, ShoppingConnectorJson shoppingConnectorJson, String str14, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.brand = "";
        } else {
            this.brand = str;
        }
        if ((i & 2) == 0) {
            this.citation_id = "";
        } else {
            this.citation_id = str2;
        }
        if ((i & 4) == 0) {
            this.image_url = "";
        } else {
            this.image_url = str3;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str4;
        }
        if ((i & 16) == 0) {
            this.price = "";
        } else {
            this.price = str5;
        }
        if ((i & 32) == 0) {
            this.product_id = "";
        } else {
            this.product_id = str6;
        }
        if ((i & 64) == 0) {
            this.sale_price = "";
        } else {
            this.sale_price = str7;
        }
        if ((i & 128) == 0) {
            this.currency = "";
        } else {
            this.currency = str8;
        }
        if ((i & 256) == 0) {
            this.url = "";
        } else {
            this.url = str9;
        }
        if ((i & 512) == 0) {
            this.type = "";
        } else {
            this.type = str10;
        }
        if ((i & 1024) == 0) {
            this.is_agentic_checkout_creation_enabled = false;
        } else {
            this.is_agentic_checkout_creation_enabled = z;
        }
        this.is_image_available = (i & 2048) == 0 ? true : z2;
        if ((i & 4096) == 0) {
            this.is_unavailable = false;
        } else {
            this.is_unavailable = z3;
        }
        if ((i & 8192) == 0) {
            this.provider = "";
        } else {
            this.provider = str11;
        }
        if ((i & 16384) == 0) {
            this.retailer_name = "";
        } else {
            this.retailer_name = str12;
        }
        if ((32768 & i) == 0) {
            this.primary_action = "";
        } else {
            this.primary_action = str13;
        }
        if ((65536 & i) == 0) {
            this.secondary_action = null;
        } else {
            this.secondary_action = shoppingSecondaryActionJson;
        }
        if ((131072 & i) == 0) {
            this.pdp_coupon = null;
        } else {
            this.pdp_coupon = jsonElement;
        }
        if ((262144 & i) == 0) {
            this.connector = null;
        } else {
            this.connector = shoppingConnectorJson;
        }
        if ((i & 524288) == 0) {
            this.highlighted_attribute = null;
        } else {
            this.highlighted_attribute = str14;
        }
    }

    public /* synthetic */ ShoppingResultProductJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, String str11, String str12, String str13, ShoppingSecondaryActionJson shoppingSecondaryActionJson, JsonElement jsonElement, ShoppingConnectorJson shoppingConnectorJson, String str14, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, C3cG.A1K(i & 1024, z), C60Q.A1Q(i & 2048, z2), (i & 4096) == 0 ? z3 : false, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? "" : str12, (i & 32768) == 0 ? str13 : "", (i & 65536) != 0 ? null : shoppingSecondaryActionJson, (i & 131072) != 0 ? null : jsonElement, (i & 262144) != 0 ? null : shoppingConnectorJson, (i & 524288) != 0 ? null : str14);
    }

    public ShoppingResultProductJson() {
        this("", "", "", "", "", "", "", "", "", "", false, true, false, "", "", "", null, null, null, null);
    }
}
