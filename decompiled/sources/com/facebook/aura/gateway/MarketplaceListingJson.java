package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class MarketplaceListingJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final MarketplaceListingCoordinateJson coordinate;
    public final String id;
    public final String image_url;
    public final JsonElement is_unavailable;
    public final String kind;
    public final String listing_id;
    public final String name;
    public final String price;
    public final String sale_price;
    public final String url;

    public final class Companion {
        public final C9hr<MarketplaceListingJson> serializer() {
            return MarketplaceListingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(MarketplaceListingJson marketplaceListingJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(marketplaceListingJson.kind)) {
            c9j5.AAV(marketplaceListingJson.kind, c9iZ, 0);
        }
        if (zAfR || !"".equals(marketplaceListingJson.id)) {
            c9j5.AAV(marketplaceListingJson.id, c9iZ, 1);
        }
        if (zAfR || !"".equals(marketplaceListingJson.listing_id)) {
            c9j5.AAV(marketplaceListingJson.listing_id, c9iZ, 2);
        }
        if (zAfR || !"".equals(marketplaceListingJson.name)) {
            c9j5.AAV(marketplaceListingJson.name, c9iZ, 3);
        }
        if (zAfR || !"".equals(marketplaceListingJson.url)) {
            c9j5.AAV(marketplaceListingJson.url, c9iZ, 4);
        }
        if (zAfR || marketplaceListingJson.coordinate != null) {
            c9j5.AAP(marketplaceListingJson.coordinate, MarketplaceListingCoordinateJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || marketplaceListingJson.price != null) {
            c9j5.AAP(marketplaceListingJson.price, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || marketplaceListingJson.sale_price != null) {
            c9j5.AAP(marketplaceListingJson.sale_price, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || marketplaceListingJson.image_url != null) {
            c9j5.AAP(marketplaceListingJson.image_url, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || marketplaceListingJson.is_unavailable != null) {
            c9j5.AAP(marketplaceListingJson.is_unavailable, JsonElementSerializer.A00, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceListingJson) {
                MarketplaceListingJson marketplaceListingJson = (MarketplaceListingJson) obj;
                if (!C7384Etj.areEqual(this.kind, marketplaceListingJson.kind) || !C7384Etj.areEqual(this.id, marketplaceListingJson.id) || !C7384Etj.areEqual(this.listing_id, marketplaceListingJson.listing_id) || !C7384Etj.areEqual(this.name, marketplaceListingJson.name) || !C7384Etj.areEqual(this.url, marketplaceListingJson.url) || !C7384Etj.areEqual(this.coordinate, marketplaceListingJson.coordinate) || !C7384Etj.areEqual(this.price, marketplaceListingJson.price) || !C7384Etj.areEqual(this.sale_price, marketplaceListingJson.sale_price) || !C7384Etj.areEqual(this.image_url, marketplaceListingJson.image_url) || !C7384Etj.areEqual(this.is_unavailable, marketplaceListingJson.is_unavailable)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarketplaceListingJson copy$default(MarketplaceListingJson marketplaceListingJson, String str, String str2, String str3, String str4, String str5, MarketplaceListingCoordinateJson marketplaceListingCoordinateJson, String str6, String str7, String str8, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketplaceListingJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = marketplaceListingJson.id;
        }
        if ((i & 4) != 0) {
            str3 = marketplaceListingJson.listing_id;
        }
        if ((i & 8) != 0) {
            str4 = marketplaceListingJson.name;
        }
        if ((i & 16) != 0) {
            str5 = marketplaceListingJson.url;
        }
        if ((i & 32) != 0) {
            marketplaceListingCoordinateJson = marketplaceListingJson.coordinate;
        }
        if ((i & 64) != 0) {
            str6 = marketplaceListingJson.price;
        }
        if ((i & 128) != 0) {
            str7 = marketplaceListingJson.sale_price;
        }
        if ((i & 256) != 0) {
            str8 = marketplaceListingJson.image_url;
        }
        if ((i & 512) != 0) {
            jsonElement = marketplaceListingJson.is_unavailable;
        }
        return marketplaceListingJson.copy(str, str2, str3, str4, str5, marketplaceListingCoordinateJson, str6, str7, str8, jsonElement);
    }

    public final String component1() {
        return this.kind;
    }

    public final JsonElement component10() {
        return this.is_unavailable;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.listing_id;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.url;
    }

    public final MarketplaceListingCoordinateJson component6() {
        return this.coordinate;
    }

    public final String component7() {
        return this.price;
    }

    public final String component8() {
        return this.sale_price;
    }

    public final String component9() {
        return this.image_url;
    }

    public final MarketplaceListingCoordinateJson getCoordinate() {
        return this.coordinate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getListing_id() {
        return this.listing_id;
    }

    public final String getName() {
        return this.name;
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
        return ((((((((AnonymousClass005.A0I(this.url, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.listing_id, AnonymousClass005.A0I(this.id, AnonymousClass001.A0G(this.kind))))) + AnonymousClass006.A0D(this.coordinate)) * 31) + AnonymousClass006.A0G(this.price)) * 31) + AnonymousClass006.A0G(this.sale_price)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + C3cH.A02(this.is_unavailable);
    }

    public final JsonElement is_unavailable() {
        return this.is_unavailable;
    }

    public /* synthetic */ MarketplaceListingJson(int i, String str, String str2, String str3, String str4, String str5, MarketplaceListingCoordinateJson marketplaceListingCoordinateJson, String str6, String str7, String str8, JsonElement jsonElement, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = "";
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.id = "";
        } else {
            this.id = str2;
        }
        if ((i & 4) == 0) {
            this.listing_id = "";
        } else {
            this.listing_id = str3;
        }
        if ((i & 8) == 0) {
            this.name = "";
        } else {
            this.name = str4;
        }
        if ((i & 16) == 0) {
            this.url = "";
        } else {
            this.url = str5;
        }
        if ((i & 32) == 0) {
            this.coordinate = null;
        } else {
            this.coordinate = marketplaceListingCoordinateJson;
        }
        if ((i & 64) == 0) {
            this.price = null;
        } else {
            this.price = str6;
        }
        if ((i & 128) == 0) {
            this.sale_price = null;
        } else {
            this.sale_price = str7;
        }
        if ((i & 256) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str8;
        }
        if ((i & 512) == 0) {
            this.is_unavailable = null;
        } else {
            this.is_unavailable = jsonElement;
        }
    }

    public final MarketplaceListingJson copy(String str, String str2, String str3, String str4, String str5, MarketplaceListingCoordinateJson marketplaceListingCoordinateJson, String str6, String str7, String str8, JsonElement jsonElement) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new MarketplaceListingJson(str, str2, str3, str4, str5, marketplaceListingCoordinateJson, str6, str7, str8, jsonElement);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MarketplaceListingJson(String str, String str2, String str3, String str4, String str5, MarketplaceListingCoordinateJson marketplaceListingCoordinateJson, String str6, String str7, String str8, JsonElement jsonElement, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : marketplaceListingCoordinateJson, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : jsonElement);
    }

    public MarketplaceListingJson(String str, String str2, String str3, String str4, String str5, MarketplaceListingCoordinateJson marketplaceListingCoordinateJson, String str6, String str7, String str8, JsonElement jsonElement) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.kind = str;
        this.id = str2;
        this.listing_id = str3;
        this.name = str4;
        this.url = str5;
        this.coordinate = marketplaceListingCoordinateJson;
        this.price = str6;
        this.sale_price = str7;
        this.image_url = str8;
        this.is_unavailable = jsonElement;
    }

    public MarketplaceListingJson() {
        this("", "", "", "", "", null, null, null, null, null);
    }
}
