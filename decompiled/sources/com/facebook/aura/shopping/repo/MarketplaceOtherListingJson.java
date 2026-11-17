package com.facebook.aura.shopping.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class MarketplaceOtherListingJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String image_url;
    public final JsonPrimitive listing_id;
    public final String location_text;
    public final String price;
    public final String sale_price;
    public final String title;

    public final class Companion {
        public final C9hr<MarketplaceOtherListingJson> serializer() {
            return MarketplaceOtherListingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ MarketplaceOtherListingJson copy$default(MarketplaceOtherListingJson marketplaceOtherListingJson, JsonPrimitive jsonPrimitive, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        JsonPrimitive jsonPrimitive2 = jsonPrimitive;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if ((i & 1) != 0) {
            jsonPrimitive2 = marketplaceOtherListingJson.listing_id;
        }
        if ((i & 2) != 0) {
            str6 = marketplaceOtherListingJson.title;
        }
        if ((i & 4) != 0) {
            str7 = marketplaceOtherListingJson.image_url;
        }
        if ((i & 8) != 0) {
            str8 = marketplaceOtherListingJson.price;
        }
        if ((i & 16) != 0) {
            str9 = marketplaceOtherListingJson.sale_price;
        }
        if ((i & 32) != 0) {
            str10 = marketplaceOtherListingJson.location_text;
        }
        return new MarketplaceOtherListingJson(jsonPrimitive2, str6, str7, str8, str9, str10);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(MarketplaceOtherListingJson marketplaceOtherListingJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || marketplaceOtherListingJson.listing_id != null) {
            c9j5.AAP(marketplaceOtherListingJson.listing_id, JsonPrimitiveSerializer.A01, c9iZ, 0);
        }
        if (zAfR || marketplaceOtherListingJson.title != null) {
            c9j5.AAP(marketplaceOtherListingJson.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || marketplaceOtherListingJson.image_url != null) {
            c9j5.AAP(marketplaceOtherListingJson.image_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || marketplaceOtherListingJson.price != null) {
            c9j5.AAP(marketplaceOtherListingJson.price, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || marketplaceOtherListingJson.sale_price != null) {
            c9j5.AAP(marketplaceOtherListingJson.sale_price, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || marketplaceOtherListingJson.location_text != null) {
            c9j5.AAP(marketplaceOtherListingJson.location_text, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceOtherListingJson) {
                MarketplaceOtherListingJson marketplaceOtherListingJson = (MarketplaceOtherListingJson) obj;
                if (!C7384Etj.areEqual(this.listing_id, marketplaceOtherListingJson.listing_id) || !C7384Etj.areEqual(this.title, marketplaceOtherListingJson.title) || !C7384Etj.areEqual(this.image_url, marketplaceOtherListingJson.image_url) || !C7384Etj.areEqual(this.price, marketplaceOtherListingJson.price) || !C7384Etj.areEqual(this.sale_price, marketplaceOtherListingJson.sale_price) || !C7384Etj.areEqual(this.location_text, marketplaceOtherListingJson.location_text)) {
                }
            }
            return false;
        }
        return true;
    }

    public final JsonPrimitive component1() {
        return this.listing_id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.image_url;
    }

    public final String component4() {
        return this.price;
    }

    public final String component5() {
        return this.sale_price;
    }

    public final String component6() {
        return this.location_text;
    }

    public final MarketplaceOtherListingJson copy(JsonPrimitive jsonPrimitive, String str, String str2, String str3, String str4, String str5) {
        return new MarketplaceOtherListingJson(jsonPrimitive, str, str2, str3, str4, str5);
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final JsonPrimitive getListing_id() {
        return this.listing_id;
    }

    public final String getLocation_text() {
        return this.location_text;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getSale_price() {
        return this.sale_price;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0D(this.listing_id) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + AnonymousClass006.A0G(this.price)) * 31) + AnonymousClass006.A0G(this.sale_price)) * 31) + AnonymousClass005.A0H(this.location_text);
    }

    public /* synthetic */ MarketplaceOtherListingJson(int i, JsonPrimitive jsonPrimitive, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.listing_id = null;
        } else {
            this.listing_id = jsonPrimitive;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str2;
        }
        if ((i & 8) == 0) {
            this.price = null;
        } else {
            this.price = str3;
        }
        if ((i & 16) == 0) {
            this.sale_price = null;
        } else {
            this.sale_price = str4;
        }
        if ((i & 32) == 0) {
            this.location_text = null;
        } else {
            this.location_text = str5;
        }
    }

    public String toString() {
        return super.toString();
    }

    public MarketplaceOtherListingJson(JsonPrimitive jsonPrimitive, String str, String str2, String str3, String str4, String str5) {
        this.listing_id = jsonPrimitive;
        this.title = str;
        this.image_url = str2;
        this.price = str3;
        this.sale_price = str4;
        this.location_text = str5;
    }

    public /* synthetic */ MarketplaceOtherListingJson(JsonPrimitive jsonPrimitive, String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : jsonPrimitive, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public MarketplaceOtherListingJson() {
        this(null, null, null, null, null, null);
    }
}
