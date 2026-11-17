package com.facebook.aura.shopping.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class MarketplaceSellerInfoJson extends C06G {
    public final JsonPrimitive average_rating;
    public final JsonPrimitive join_year;
    public final JsonPrimitive listing_count;
    public final String name;
    public final List<MarketplaceOtherListingJson> other_listings;
    public final String profile_pic_uri;
    public final String profile_url;
    public final JsonPrimitive rating_count;
    public final String seller_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, MarketplaceSellerInfoJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<MarketplaceSellerInfoJson> serializer() {
            return MarketplaceSellerInfoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceSellerInfoJson) {
                MarketplaceSellerInfoJson marketplaceSellerInfoJson = (MarketplaceSellerInfoJson) obj;
                if (!C7384Etj.areEqual(this.seller_id, marketplaceSellerInfoJson.seller_id) || !C7384Etj.areEqual(this.name, marketplaceSellerInfoJson.name) || !C7384Etj.areEqual(this.profile_url, marketplaceSellerInfoJson.profile_url) || !C7384Etj.areEqual(this.profile_pic_uri, marketplaceSellerInfoJson.profile_pic_uri) || !C7384Etj.areEqual(this.join_year, marketplaceSellerInfoJson.join_year) || !C7384Etj.areEqual(this.average_rating, marketplaceSellerInfoJson.average_rating) || !C7384Etj.areEqual(this.rating_count, marketplaceSellerInfoJson.rating_count) || !C7384Etj.areEqual(this.listing_count, marketplaceSellerInfoJson.listing_count) || !C7384Etj.areEqual(this.other_listings, marketplaceSellerInfoJson.other_listings)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketplaceSellerInfoJson copy$default(MarketplaceSellerInfoJson marketplaceSellerInfoJson, String str, String str2, String str3, String str4, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3, JsonPrimitive jsonPrimitive4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketplaceSellerInfoJson.seller_id;
        }
        if ((i & 2) != 0) {
            str2 = marketplaceSellerInfoJson.name;
        }
        if ((i & 4) != 0) {
            str3 = marketplaceSellerInfoJson.profile_url;
        }
        if ((i & 8) != 0) {
            str4 = marketplaceSellerInfoJson.profile_pic_uri;
        }
        if ((i & 16) != 0) {
            jsonPrimitive = marketplaceSellerInfoJson.join_year;
        }
        if ((i & 32) != 0) {
            jsonPrimitive2 = marketplaceSellerInfoJson.average_rating;
        }
        if ((i & 64) != 0) {
            jsonPrimitive3 = marketplaceSellerInfoJson.rating_count;
        }
        if ((i & 128) != 0) {
            jsonPrimitive4 = marketplaceSellerInfoJson.listing_count;
        }
        if ((i & 256) != 0) {
            list = marketplaceSellerInfoJson.other_listings;
        }
        return marketplaceSellerInfoJson.copy(str, str2, str3, str4, jsonPrimitive, jsonPrimitive2, jsonPrimitive3, jsonPrimitive4, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(MarketplaceSellerInfoJson marketplaceSellerInfoJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || marketplaceSellerInfoJson.seller_id != null) {
            c9j5.AAP(marketplaceSellerInfoJson.seller_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || marketplaceSellerInfoJson.name != null) {
            c9j5.AAP(marketplaceSellerInfoJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || marketplaceSellerInfoJson.profile_url != null) {
            c9j5.AAP(marketplaceSellerInfoJson.profile_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || marketplaceSellerInfoJson.profile_pic_uri != null) {
            c9j5.AAP(marketplaceSellerInfoJson.profile_pic_uri, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || marketplaceSellerInfoJson.join_year != null) {
            c9j5.AAP(marketplaceSellerInfoJson.join_year, JsonPrimitiveSerializer.A01, c9iZ, 4);
        }
        if (zAfR || marketplaceSellerInfoJson.average_rating != null) {
            c9j5.AAP(marketplaceSellerInfoJson.average_rating, JsonPrimitiveSerializer.A01, c9iZ, 5);
        }
        if (zAfR || marketplaceSellerInfoJson.rating_count != null) {
            c9j5.AAP(marketplaceSellerInfoJson.rating_count, JsonPrimitiveSerializer.A01, c9iZ, 6);
        }
        if (zAfR || marketplaceSellerInfoJson.listing_count != null) {
            c9j5.AAP(marketplaceSellerInfoJson.listing_count, JsonPrimitiveSerializer.A01, c9iZ, 7);
        }
        if (zAfR || !C3cG.A1L(marketplaceSellerInfoJson.other_listings)) {
            c9j5.AAQ(marketplaceSellerInfoJson.other_listings, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
    }

    public final String component1() {
        return this.seller_id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.profile_url;
    }

    public final String component4() {
        return this.profile_pic_uri;
    }

    public final JsonPrimitive component5() {
        return this.join_year;
    }

    public final JsonPrimitive component6() {
        return this.average_rating;
    }

    public final JsonPrimitive component7() {
        return this.rating_count;
    }

    public final JsonPrimitive component8() {
        return this.listing_count;
    }

    public final List<MarketplaceOtherListingJson> component9() {
        return this.other_listings;
    }

    public final MarketplaceSellerInfoJson copy(String str, String str2, String str3, String str4, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3, JsonPrimitive jsonPrimitive4, List<MarketplaceOtherListingJson> list) {
        C7384Etj.A0Y(list, 8);
        return new MarketplaceSellerInfoJson(str, str2, str3, str4, jsonPrimitive, jsonPrimitive2, jsonPrimitive3, jsonPrimitive4, list);
    }

    public final JsonPrimitive getAverage_rating() {
        return this.average_rating;
    }

    public final JsonPrimitive getJoin_year() {
        return this.join_year;
    }

    public final JsonPrimitive getListing_count() {
        return this.listing_count;
    }

    public final String getName() {
        return this.name;
    }

    public final List<MarketplaceOtherListingJson> getOther_listings() {
        return this.other_listings;
    }

    public final String getProfile_pic_uri() {
        return this.profile_pic_uri;
    }

    public final String getProfile_url() {
        return this.profile_url;
    }

    public final JsonPrimitive getRating_count() {
        return this.rating_count;
    }

    public final String getSeller_id() {
        return this.seller_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.other_listings, ((((((((((((((AnonymousClass006.A0G(this.seller_id) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.profile_url)) * 31) + AnonymousClass006.A0G(this.profile_pic_uri)) * 31) + AnonymousClass006.A0D(this.join_year)) * 31) + AnonymousClass006.A0D(this.average_rating)) * 31) + AnonymousClass006.A0D(this.rating_count)) * 31) + C3cH.A02(this.listing_count)) * 31);
    }

    public /* synthetic */ MarketplaceSellerInfoJson(int i, String str, String str2, String str3, String str4, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3, JsonPrimitive jsonPrimitive4, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.seller_id = null;
        } else {
            this.seller_id = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.profile_url = null;
        } else {
            this.profile_url = str3;
        }
        if ((i & 8) == 0) {
            this.profile_pic_uri = null;
        } else {
            this.profile_pic_uri = str4;
        }
        if ((i & 16) == 0) {
            this.join_year = null;
        } else {
            this.join_year = jsonPrimitive;
        }
        if ((i & 32) == 0) {
            this.average_rating = null;
        } else {
            this.average_rating = jsonPrimitive2;
        }
        if ((i & 64) == 0) {
            this.rating_count = null;
        } else {
            this.rating_count = jsonPrimitive3;
        }
        if ((i & 128) == 0) {
            this.listing_count = null;
        } else {
            this.listing_count = jsonPrimitive4;
        }
        if ((i & 256) == 0) {
            this.other_listings = C0881AGi.A00;
        } else {
            this.other_listings = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public MarketplaceSellerInfoJson(String str, String str2, String str3, String str4, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3, JsonPrimitive jsonPrimitive4, List<MarketplaceOtherListingJson> list) {
        C7384Etj.A0Y(list, 8);
        this.seller_id = str;
        this.name = str2;
        this.profile_url = str3;
        this.profile_pic_uri = str4;
        this.join_year = jsonPrimitive;
        this.average_rating = jsonPrimitive2;
        this.rating_count = jsonPrimitive3;
        this.listing_count = jsonPrimitive4;
        this.other_listings = list;
    }

    public /* synthetic */ MarketplaceSellerInfoJson(String str, String str2, String str3, String str4, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3, JsonPrimitive jsonPrimitive4, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : jsonPrimitive, (i & 32) != 0 ? null : jsonPrimitive2, (i & 64) != 0 ? null : jsonPrimitive3, (i & 128) != 0 ? null : jsonPrimitive4, (i & 256) != 0 ? C0881AGi.A00 : list);
    }

    public MarketplaceSellerInfoJson() {
        this(null, null, null, null, null, null, null, null, C0881AGi.A00);
    }
}
