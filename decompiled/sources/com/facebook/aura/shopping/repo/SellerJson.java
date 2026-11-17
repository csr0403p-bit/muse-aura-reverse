package com.facebook.aura.shopping.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.PdpRating;
import com.facebook.aura.shopping.model.PdpSeller;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SellerJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer join_year;
    public final String name;
    public final String profile_pic_url;
    public final String profile_url;
    public final RatingJson rating;
    public final String seller_id;

    public final class Companion {
        public final C9hr<SellerJson> serializer() {
            return SellerJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ SellerJson copy$default(SellerJson sellerJson, String str, String str2, String str3, String str4, Integer num, RatingJson ratingJson, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Integer num2 = num;
        RatingJson ratingJson2 = ratingJson;
        if ((i & 1) != 0) {
            str5 = sellerJson.seller_id;
        }
        if ((i & 2) != 0) {
            str6 = sellerJson.name;
        }
        if ((i & 4) != 0) {
            str7 = sellerJson.profile_pic_url;
        }
        if ((i & 8) != 0) {
            str8 = sellerJson.profile_url;
        }
        if ((i & 16) != 0) {
            num2 = sellerJson.join_year;
        }
        if ((i & 32) != 0) {
            ratingJson2 = sellerJson.rating;
        }
        return new SellerJson(str5, str6, str7, str8, num2, ratingJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(SellerJson sellerJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || sellerJson.seller_id != null) {
            c9j5.AAP(sellerJson.seller_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || sellerJson.name != null) {
            c9j5.AAP(sellerJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || sellerJson.profile_pic_url != null) {
            c9j5.AAP(sellerJson.profile_pic_url, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || sellerJson.profile_url != null) {
            c9j5.AAP(sellerJson.profile_url, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || sellerJson.join_year != null) {
            c9j5.AAP(sellerJson.join_year, C07729ii.A00, c9iZ, 4);
        }
        if (zAfR || sellerJson.rating != null) {
            c9j5.AAP(sellerJson.rating, RatingJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerJson) {
                SellerJson sellerJson = (SellerJson) obj;
                if (!C7384Etj.areEqual(this.seller_id, sellerJson.seller_id) || !C7384Etj.areEqual(this.name, sellerJson.name) || !C7384Etj.areEqual(this.profile_pic_url, sellerJson.profile_pic_url) || !C7384Etj.areEqual(this.profile_url, sellerJson.profile_url) || !C7384Etj.areEqual(this.join_year, sellerJson.join_year) || !C7384Etj.areEqual(this.rating, sellerJson.rating)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.seller_id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.profile_pic_url;
    }

    public final String component4() {
        return this.profile_url;
    }

    public final Integer component5() {
        return this.join_year;
    }

    public final RatingJson component6() {
        return this.rating;
    }

    public final SellerJson copy(String str, String str2, String str3, String str4, Integer num, RatingJson ratingJson) {
        return new SellerJson(str, str2, str3, str4, num, ratingJson);
    }

    public final Integer getJoin_year() {
        return this.join_year;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfile_pic_url() {
        return this.profile_pic_url;
    }

    public final String getProfile_url() {
        return this.profile_url;
    }

    public final RatingJson getRating() {
        return this.rating;
    }

    public final String getSeller_id() {
        return this.seller_id;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.seller_id) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.profile_pic_url)) * 31) + AnonymousClass006.A0G(this.profile_url)) * 31) + AnonymousClass006.A0D(this.join_year)) * 31) + C3cH.A02(this.rating);
    }

    public final PdpSeller toDomain(String str) {
        String str2 = this.seller_id;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        String str3 = this.name;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = str;
        }
        String str4 = this.profile_pic_url;
        if (str4 == null || C7BY.A0j(str4)) {
            str4 = null;
        }
        String str5 = this.profile_url;
        if (str5 == null || C7BY.A0j(str5)) {
            str5 = null;
        }
        Integer num = this.join_year;
        RatingJson ratingJson = this.rating;
        return new PdpSeller(str2, str3, str4, str5, num, ratingJson != null ? new PdpRating(ratingJson.value, ratingJson.count) : null);
    }

    public /* synthetic */ SellerJson(int i, String str, String str2, String str3, String str4, Integer num, RatingJson ratingJson, C2hx c2hx) {
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
            this.profile_pic_url = null;
        } else {
            this.profile_pic_url = str3;
        }
        if ((i & 8) == 0) {
            this.profile_url = null;
        } else {
            this.profile_url = str4;
        }
        if ((i & 16) == 0) {
            this.join_year = null;
        } else {
            this.join_year = num;
        }
        if ((i & 32) == 0) {
            this.rating = null;
        } else {
            this.rating = ratingJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SellerJson(String str, String str2, String str3, String str4, Integer num, RatingJson ratingJson) {
        this.seller_id = str;
        this.name = str2;
        this.profile_pic_url = str3;
        this.profile_url = str4;
        this.join_year = num;
        this.rating = ratingJson;
    }

    public /* synthetic */ SellerJson(String str, String str2, String str3, String str4, Integer num, RatingJson ratingJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : ratingJson);
    }

    public SellerJson() {
        this(null, null, null, null, null, null);
    }
}
