package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.LenientShoppingConnectorSerializer;
import com.facebook.aura.shopping.model.ShoppingConnectorJson;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductWireKt;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingSecondaryActionJson;
import com.facebook.aura.shopping.model.ShoppingSecondaryActionJson$$serializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingProductEntityJson extends C06G {
    public final String brand;
    public final String citation_id;
    public final ShoppingConnectorJson connector;
    public final String currency;
    public final String image_url;
    public final boolean is_agentic_checkout_completion_enabled;
    public final boolean is_agentic_checkout_creation_enabled;
    public final boolean is_image_available;
    public final boolean is_unavailable;
    public final String price;
    public final String primary_action;
    public final String product_id;
    public final String product_name;
    public final String product_type;
    public final String provider;
    public final String retailer_name;
    public final String sale_price;
    public final ShoppingSecondaryActionJson secondary_action;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final int $stable = ShoppingConnectorJson.$stable | ShoppingSecondaryActionJson.$stable;

    public final class Companion {
        public final C9hr<ShoppingProductEntityJson> serializer() {
            return ShoppingProductEntityJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ShoppingProductEntityJson shoppingProductEntityJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingProductEntityJson.citation_id)) {
            c9j5.AAV(shoppingProductEntityJson.citation_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.product_name)) {
            c9j5.AAV(shoppingProductEntityJson.product_name, c9iZ, 1);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.url)) {
            c9j5.AAV(shoppingProductEntityJson.url, c9iZ, 2);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.product_id)) {
            c9j5.AAV(shoppingProductEntityJson.product_id, c9iZ, 3);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.product_type)) {
            c9j5.AAV(shoppingProductEntityJson.product_type, c9iZ, 4);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.image_url)) {
            c9j5.AAV(shoppingProductEntityJson.image_url, c9iZ, 5);
        }
        if (zAfR || shoppingProductEntityJson.is_unavailable) {
            c9j5.AA7(c9iZ, 6, shoppingProductEntityJson.is_unavailable);
        }
        if (zAfR || shoppingProductEntityJson.is_agentic_checkout_creation_enabled) {
            c9j5.AA7(c9iZ, 7, shoppingProductEntityJson.is_agentic_checkout_creation_enabled);
        }
        if (zAfR || shoppingProductEntityJson.is_agentic_checkout_completion_enabled) {
            c9j5.AA7(c9iZ, 8, shoppingProductEntityJson.is_agentic_checkout_completion_enabled);
        }
        if (zAfR || !shoppingProductEntityJson.is_image_available) {
            c9j5.AA7(c9iZ, 9, shoppingProductEntityJson.is_image_available);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.provider)) {
            c9j5.AAV(shoppingProductEntityJson.provider, c9iZ, 10);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.primary_action)) {
            c9j5.AAV(shoppingProductEntityJson.primary_action, c9iZ, 11);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.retailer_name)) {
            c9j5.AAV(shoppingProductEntityJson.retailer_name, c9iZ, 12);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.brand)) {
            c9j5.AAV(shoppingProductEntityJson.brand, c9iZ, 13);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.price)) {
            c9j5.AAV(shoppingProductEntityJson.price, c9iZ, 14);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.sale_price)) {
            c9j5.AAV(shoppingProductEntityJson.sale_price, c9iZ, 15);
        }
        if (zAfR || shoppingProductEntityJson.secondary_action != null) {
            c9j5.AAP(shoppingProductEntityJson.secondary_action, ShoppingSecondaryActionJson$$serializer.INSTANCE, c9iZ, 16);
        }
        if (zAfR || !"".equals(shoppingProductEntityJson.currency)) {
            c9j5.AAV(shoppingProductEntityJson.currency, c9iZ, 17);
        }
        if (zAfR || shoppingProductEntityJson.connector != null) {
            c9j5.AAP(shoppingProductEntityJson.connector, LenientShoppingConnectorSerializer.INSTANCE, c9iZ, 18);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductEntityJson) {
                ShoppingProductEntityJson shoppingProductEntityJson = (ShoppingProductEntityJson) obj;
                if (!C7384Etj.areEqual(this.citation_id, shoppingProductEntityJson.citation_id) || !C7384Etj.areEqual(this.product_name, shoppingProductEntityJson.product_name) || !C7384Etj.areEqual(this.url, shoppingProductEntityJson.url) || !C7384Etj.areEqual(this.product_id, shoppingProductEntityJson.product_id) || !C7384Etj.areEqual(this.product_type, shoppingProductEntityJson.product_type) || !C7384Etj.areEqual(this.image_url, shoppingProductEntityJson.image_url) || this.is_unavailable != shoppingProductEntityJson.is_unavailable || this.is_agentic_checkout_creation_enabled != shoppingProductEntityJson.is_agentic_checkout_creation_enabled || this.is_agentic_checkout_completion_enabled != shoppingProductEntityJson.is_agentic_checkout_completion_enabled || this.is_image_available != shoppingProductEntityJson.is_image_available || !C7384Etj.areEqual(this.provider, shoppingProductEntityJson.provider) || !C7384Etj.areEqual(this.primary_action, shoppingProductEntityJson.primary_action) || !C7384Etj.areEqual(this.retailer_name, shoppingProductEntityJson.retailer_name) || !C7384Etj.areEqual(this.brand, shoppingProductEntityJson.brand) || !C7384Etj.areEqual(this.price, shoppingProductEntityJson.price) || !C7384Etj.areEqual(this.sale_price, shoppingProductEntityJson.sale_price) || !C7384Etj.areEqual(this.secondary_action, shoppingProductEntityJson.secondary_action) || !C7384Etj.areEqual(this.currency, shoppingProductEntityJson.currency) || !C7384Etj.areEqual(this.connector, shoppingProductEntityJson.connector)) {
                }
            }
            return false;
        }
        return true;
    }

    @Serializable(with = LenientShoppingConnectorSerializer.class)
    public static /* synthetic */ void getConnector$annotations() {
    }

    public final String component1() {
        return this.citation_id;
    }

    public final boolean component10() {
        return this.is_image_available;
    }

    public final String component11() {
        return this.provider;
    }

    public final String component12() {
        return this.primary_action;
    }

    public final String component13() {
        return this.retailer_name;
    }

    public final String component14() {
        return this.brand;
    }

    public final String component15() {
        return this.price;
    }

    public final String component16() {
        return this.sale_price;
    }

    public final ShoppingSecondaryActionJson component17() {
        return this.secondary_action;
    }

    public final String component18() {
        return this.currency;
    }

    public final ShoppingConnectorJson component19() {
        return this.connector;
    }

    public final String component2() {
        return this.product_name;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.product_id;
    }

    public final String component5() {
        return this.product_type;
    }

    public final String component6() {
        return this.image_url;
    }

    public final boolean component7() {
        return this.is_unavailable;
    }

    public final boolean component8() {
        return this.is_agentic_checkout_creation_enabled;
    }

    public final boolean component9() {
        return this.is_agentic_checkout_completion_enabled;
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

    public final String getImage_url() {
        return this.image_url;
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

    public final String getProduct_name() {
        return this.product_name;
    }

    public final String getProduct_type() {
        return this.product_type;
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

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.currency, (AnonymousClass005.A0I(this.sale_price, AnonymousClass005.A0I(this.price, AnonymousClass005.A0I(this.brand, AnonymousClass005.A0I(this.retailer_name, AnonymousClass005.A0I(this.primary_action, AnonymousClass005.A0I(this.provider, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.image_url, AnonymousClass005.A0I(this.product_type, AnonymousClass005.A0I(this.product_id, AnonymousClass005.A0I(this.url, AnonymousClass005.A0I(this.product_name, AnonymousClass001.A0G(this.citation_id)))))), this.is_unavailable), this.is_agentic_checkout_creation_enabled), this.is_agentic_checkout_completion_enabled), this.is_image_available))))))) + AnonymousClass006.A0D(this.secondary_action)) * 31) + C3cH.A02(this.connector);
    }

    public final boolean is_agentic_checkout_completion_enabled() {
        return this.is_agentic_checkout_completion_enabled;
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
        String strA0l = AnonymousClass002.A0l(this.product_name);
        if (strA0l.length() <= 0) {
            return null;
        }
        String strA0l2 = AnonymousClass002.A0l(this.product_id);
        String str = null;
        if (strA0l2.length() > 0) {
            str = strA0l2;
        }
        String strA0l3 = AnonymousClass002.A0l(this.url);
        String str2 = null;
        if (strA0l3.length() > 0) {
            str2 = strA0l3;
        }
        if (str == null && str2 == null) {
            return null;
        }
        ShoppingProductType shoppingProductType = ShoppingResultsPresentationKt.toShoppingProductType(this.product_type);
        if (shoppingProductType == ShoppingProductType.CATALOG && str == null) {
            return null;
        }
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
        boolean z4 = this.is_agentic_checkout_completion_enabled;
        ShoppingConnectorJson shoppingConnectorJson = this.connector;
        return ShoppingResultProductWireKt.shoppingResultProductOf(strA0l, str, str2, shoppingProductType, str3, str4, str5, str6, str7, str8, str9, str10, str11, shoppingSecondaryActionJson, z, z2, z3, z4, null, shoppingConnectorJson != null ? shoppingConnectorJson.toDomain() : null, null);
    }

    public ShoppingProductEntityJson(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, String str7, String str8, String str9, String str10, String str11, String str12, ShoppingSecondaryActionJson shoppingSecondaryActionJson, String str13, ShoppingConnectorJson shoppingConnectorJson) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        AnonymousClass005.A18(str7, str8, str9, str10, str11);
        C3cI.A1I(str12, 15, str13);
        this.citation_id = str;
        this.product_name = str2;
        this.url = str3;
        this.product_id = str4;
        this.product_type = str5;
        this.image_url = str6;
        this.is_unavailable = z;
        this.is_agentic_checkout_creation_enabled = z2;
        this.is_agentic_checkout_completion_enabled = z3;
        this.is_image_available = z4;
        this.provider = str7;
        this.primary_action = str8;
        this.retailer_name = str9;
        this.brand = str10;
        this.price = str11;
        this.sale_price = str12;
        this.secondary_action = shoppingSecondaryActionJson;
        this.currency = str13;
        this.connector = shoppingConnectorJson;
    }

    public final ShoppingProductEntityJson copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, String str7, String str8, String str9, String str10, String str11, String str12, ShoppingSecondaryActionJson shoppingSecondaryActionJson, String str13, ShoppingConnectorJson shoppingConnectorJson) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        AnonymousClass005.A18(str7, str8, str9, str10, str11);
        C3cI.A1I(str12, 15, str13);
        return new ShoppingProductEntityJson(str, str2, str3, str4, str5, str6, z, z2, z3, z4, str7, str8, str9, str10, str11, str12, shoppingSecondaryActionJson, str13, shoppingConnectorJson);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ShoppingProductEntityJson copy$default(ShoppingProductEntityJson shoppingProductEntityJson, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, String str7, String str8, String str9, String str10, String str11, String str12, ShoppingSecondaryActionJson shoppingSecondaryActionJson, String str13, ShoppingConnectorJson shoppingConnectorJson, int i, Object obj) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        ShoppingSecondaryActionJson shoppingSecondaryActionJson2 = shoppingSecondaryActionJson;
        String str26 = str13;
        ShoppingConnectorJson shoppingConnectorJson2 = shoppingConnectorJson;
        if ((i & 1) != 0) {
            str14 = shoppingProductEntityJson.citation_id;
        }
        if ((i & 2) != 0) {
            str15 = shoppingProductEntityJson.product_name;
        }
        if ((i & 4) != 0) {
            str16 = shoppingProductEntityJson.url;
        }
        if ((i & 8) != 0) {
            str17 = shoppingProductEntityJson.product_id;
        }
        if ((i & 16) != 0) {
            str18 = shoppingProductEntityJson.product_type;
        }
        if ((i & 32) != 0) {
            str19 = shoppingProductEntityJson.image_url;
        }
        if ((i & 64) != 0) {
            z5 = shoppingProductEntityJson.is_unavailable;
        }
        if ((i & 128) != 0) {
            z6 = shoppingProductEntityJson.is_agentic_checkout_creation_enabled;
        }
        if ((i & 256) != 0) {
            z7 = shoppingProductEntityJson.is_agentic_checkout_completion_enabled;
        }
        if ((i & 512) != 0) {
            z8 = shoppingProductEntityJson.is_image_available;
        }
        if ((i & 1024) != 0) {
            str20 = shoppingProductEntityJson.provider;
        }
        if ((i & 2048) != 0) {
            str21 = shoppingProductEntityJson.primary_action;
        }
        if ((i & 4096) != 0) {
            str22 = shoppingProductEntityJson.retailer_name;
        }
        if ((i & 8192) != 0) {
            str23 = shoppingProductEntityJson.brand;
        }
        if ((i & 16384) != 0) {
            str24 = shoppingProductEntityJson.price;
        }
        if ((i & 32768) != 0) {
            str25 = shoppingProductEntityJson.sale_price;
        }
        if ((i & 65536) != 0) {
            shoppingSecondaryActionJson2 = shoppingProductEntityJson.secondary_action;
        }
        if ((i & 131072) != 0) {
            str26 = shoppingProductEntityJson.currency;
        }
        if ((i & 262144) != 0) {
            shoppingConnectorJson2 = shoppingProductEntityJson.connector;
        }
        boolean z9 = z5;
        return shoppingProductEntityJson.copy(str14, str15, str16, str17, str18, str19, z9, z6, z7, z8, str20, str21, str22, str23, str24, str25, shoppingSecondaryActionJson2, str26, shoppingConnectorJson2);
    }

    public /* synthetic */ ShoppingProductEntityJson(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, String str7, String str8, String str9, String str10, String str11, String str12, ShoppingSecondaryActionJson shoppingSecondaryActionJson, String str13, ShoppingConnectorJson shoppingConnectorJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, C3cG.A1K(i & 64, z), C3cH.A1N(i, z2), (i & 256) == 0 ? z3 : false, C60Q.A1Q(i & 512, z4), (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? "" : str10, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? "" : str12, (i & 65536) != 0 ? null : shoppingSecondaryActionJson, (i & 131072) == 0 ? str13 : "", (i & 262144) != 0 ? null : shoppingConnectorJson);
    }

    public /* synthetic */ ShoppingProductEntityJson(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, String str7, String str8, String str9, String str10, String str11, String str12, ShoppingSecondaryActionJson shoppingSecondaryActionJson, String str13, ShoppingConnectorJson shoppingConnectorJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.citation_id = "";
        } else {
            this.citation_id = str;
        }
        if ((i & 2) == 0) {
            this.product_name = "";
        } else {
            this.product_name = str2;
        }
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str3;
        }
        if ((i & 8) == 0) {
            this.product_id = "";
        } else {
            this.product_id = str4;
        }
        if ((i & 16) == 0) {
            this.product_type = "";
        } else {
            this.product_type = str5;
        }
        if ((i & 32) == 0) {
            this.image_url = "";
        } else {
            this.image_url = str6;
        }
        if ((i & 64) == 0) {
            this.is_unavailable = false;
        } else {
            this.is_unavailable = z;
        }
        if ((i & 128) == 0) {
            this.is_agentic_checkout_creation_enabled = false;
        } else {
            this.is_agentic_checkout_creation_enabled = z2;
        }
        if ((i & 256) == 0) {
            this.is_agentic_checkout_completion_enabled = false;
        } else {
            this.is_agentic_checkout_completion_enabled = z3;
        }
        if ((i & 512) == 0) {
            this.is_image_available = true;
        } else {
            this.is_image_available = z4;
        }
        if ((i & 1024) == 0) {
            this.provider = "";
        } else {
            this.provider = str7;
        }
        if ((i & 2048) == 0) {
            this.primary_action = "";
        } else {
            this.primary_action = str8;
        }
        if ((i & 4096) == 0) {
            this.retailer_name = "";
        } else {
            this.retailer_name = str9;
        }
        if ((i & 8192) == 0) {
            this.brand = "";
        } else {
            this.brand = str10;
        }
        if ((i & 16384) == 0) {
            this.price = "";
        } else {
            this.price = str11;
        }
        if ((32768 & i) == 0) {
            this.sale_price = "";
        } else {
            this.sale_price = str12;
        }
        if ((65536 & i) == 0) {
            this.secondary_action = null;
        } else {
            this.secondary_action = shoppingSecondaryActionJson;
        }
        if ((131072 & i) == 0) {
            this.currency = "";
        } else {
            this.currency = str13;
        }
        if ((i & 262144) == 0) {
            this.connector = null;
        } else {
            this.connector = shoppingConnectorJson;
        }
    }

    public ShoppingProductEntityJson() {
        this("", "", "", "", "", "", false, false, false, true, "", "", "", "", "", "", null, "", null);
    }
}
