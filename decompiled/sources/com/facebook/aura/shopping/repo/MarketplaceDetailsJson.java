package com.facebook.aura.shopping.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class MarketplaceDetailsJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> additional_image_urls;
    public final MarketplaceApproxLocationJson approximate_location;
    public final List<MarketplaceAttributeJson> attributes;
    public final String category_name;
    public final String listing_duration_text;
    public final String location_text;
    public final MarketplaceSellerInfoJson seller_info;

    public final class Companion {
        public final C9hr<MarketplaceDetailsJson> serializer() {
            return MarketplaceDetailsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, AbstractC5321DgF.A02(num, MarketplaceDetailsJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, MarketplaceDetailsJson$Companion$$childSerializers$2.INSTANCE), null, null, null};
    }

    public MarketplaceDetailsJson(String str, List<MarketplaceAttributeJson> list, String str2, List<String> list2, MarketplaceSellerInfoJson marketplaceSellerInfoJson, MarketplaceApproxLocationJson marketplaceApproxLocationJson, String str3) {
        AnonymousClass002.A1B(list, 1, list2);
        this.category_name = str;
        this.attributes = list;
        this.listing_duration_text = str2;
        this.additional_image_urls = list2;
        this.seller_info = marketplaceSellerInfoJson;
        this.approximate_location = marketplaceApproxLocationJson;
        this.location_text = str3;
    }

    public final MarketplaceDetailsJson copy(String str, List<MarketplaceAttributeJson> list, String str2, List<String> list2, MarketplaceSellerInfoJson marketplaceSellerInfoJson, MarketplaceApproxLocationJson marketplaceApproxLocationJson, String str3) {
        AnonymousClass002.A1B(list, 1, list2);
        return new MarketplaceDetailsJson(str, list, str2, list2, marketplaceSellerInfoJson, marketplaceApproxLocationJson, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceDetailsJson) {
                MarketplaceDetailsJson marketplaceDetailsJson = (MarketplaceDetailsJson) obj;
                if (!C7384Etj.areEqual(this.category_name, marketplaceDetailsJson.category_name) || !C7384Etj.areEqual(this.attributes, marketplaceDetailsJson.attributes) || !C7384Etj.areEqual(this.listing_duration_text, marketplaceDetailsJson.listing_duration_text) || !C7384Etj.areEqual(this.additional_image_urls, marketplaceDetailsJson.additional_image_urls) || !C7384Etj.areEqual(this.seller_info, marketplaceDetailsJson.seller_info) || !C7384Etj.areEqual(this.approximate_location, marketplaceDetailsJson.approximate_location) || !C7384Etj.areEqual(this.location_text, marketplaceDetailsJson.location_text)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketplaceDetailsJson copy$default(MarketplaceDetailsJson marketplaceDetailsJson, String str, List list, String str2, List list2, MarketplaceSellerInfoJson marketplaceSellerInfoJson, MarketplaceApproxLocationJson marketplaceApproxLocationJson, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketplaceDetailsJson.category_name;
        }
        if ((i & 2) != 0) {
            list = marketplaceDetailsJson.attributes;
        }
        if ((i & 4) != 0) {
            str2 = marketplaceDetailsJson.listing_duration_text;
        }
        if ((i & 8) != 0) {
            list2 = marketplaceDetailsJson.additional_image_urls;
        }
        if ((i & 16) != 0) {
            marketplaceSellerInfoJson = marketplaceDetailsJson.seller_info;
        }
        if ((i & 32) != 0) {
            marketplaceApproxLocationJson = marketplaceDetailsJson.approximate_location;
        }
        if ((i & 64) != 0) {
            str3 = marketplaceDetailsJson.location_text;
        }
        return marketplaceDetailsJson.copy(str, list, str2, list2, marketplaceSellerInfoJson, marketplaceApproxLocationJson, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(MarketplaceDetailsJson marketplaceDetailsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || marketplaceDetailsJson.category_name != null) {
            c9j5.AAP(marketplaceDetailsJson.category_name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(marketplaceDetailsJson.attributes)) {
            c9j5.AAQ(marketplaceDetailsJson.attributes, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || marketplaceDetailsJson.listing_duration_text != null) {
            c9j5.AAP(marketplaceDetailsJson.listing_duration_text, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(marketplaceDetailsJson.additional_image_urls)) {
            c9j5.AAQ(marketplaceDetailsJson.additional_image_urls, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || marketplaceDetailsJson.seller_info != null) {
            c9j5.AAP(marketplaceDetailsJson.seller_info, MarketplaceSellerInfoJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || marketplaceDetailsJson.approximate_location != null) {
            c9j5.AAP(marketplaceDetailsJson.approximate_location, MarketplaceApproxLocationJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || marketplaceDetailsJson.location_text != null) {
            c9j5.AAP(marketplaceDetailsJson.location_text, C07779iq.A01, c9iZ, 6);
        }
    }

    public final String component1() {
        return this.category_name;
    }

    public final List<MarketplaceAttributeJson> component2() {
        return this.attributes;
    }

    public final String component3() {
        return this.listing_duration_text;
    }

    public final List<String> component4() {
        return this.additional_image_urls;
    }

    public final MarketplaceSellerInfoJson component5() {
        return this.seller_info;
    }

    public final MarketplaceApproxLocationJson component6() {
        return this.approximate_location;
    }

    public final String component7() {
        return this.location_text;
    }

    public final List<String> getAdditional_image_urls() {
        return this.additional_image_urls;
    }

    public final MarketplaceApproxLocationJson getApproximate_location() {
        return this.approximate_location;
    }

    public final List<MarketplaceAttributeJson> getAttributes() {
        return this.attributes;
    }

    public final String getCategory_name() {
        return this.category_name;
    }

    public final String getListing_duration_text() {
        return this.listing_duration_text;
    }

    public final String getLocation_text() {
        return this.location_text;
    }

    public final MarketplaceSellerInfoJson getSeller_info() {
        return this.seller_info;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.additional_image_urls, (AnonymousClass005.A0F(this.attributes, AnonymousClass006.A0G(this.category_name) * 31) + AnonymousClass006.A0G(this.listing_duration_text)) * 31) + AnonymousClass006.A0D(this.seller_info)) * 31) + AnonymousClass006.A0D(this.approximate_location)) * 31) + AnonymousClass005.A0H(this.location_text);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MarketplaceDetailsJson(String str, List list, String str2, List list2, MarketplaceSellerInfoJson marketplaceSellerInfoJson, MarketplaceApproxLocationJson marketplaceApproxLocationJson, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, C3cI.A11(list, i), (i & 4) != 0 ? null : str2, (i & 8) != 0 ? C0881AGi.A00 : list2, (i & 16) != 0 ? null : marketplaceSellerInfoJson, (i & 32) != 0 ? null : marketplaceApproxLocationJson, (i & 64) != 0 ? null : str3);
    }

    public /* synthetic */ MarketplaceDetailsJson(int i, String str, List list, String str2, List list2, MarketplaceSellerInfoJson marketplaceSellerInfoJson, MarketplaceApproxLocationJson marketplaceApproxLocationJson, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.category_name = null;
        } else {
            this.category_name = str;
        }
        if ((i & 2) == 0) {
            this.attributes = C0881AGi.A00;
        } else {
            this.attributes = list;
        }
        if ((i & 4) == 0) {
            this.listing_duration_text = null;
        } else {
            this.listing_duration_text = str2;
        }
        if ((i & 8) == 0) {
            this.additional_image_urls = C0881AGi.A00;
        } else {
            this.additional_image_urls = list2;
        }
        if ((i & 16) == 0) {
            this.seller_info = null;
        } else {
            this.seller_info = marketplaceSellerInfoJson;
        }
        if ((i & 32) == 0) {
            this.approximate_location = null;
        } else {
            this.approximate_location = marketplaceApproxLocationJson;
        }
        if ((i & 64) == 0) {
            this.location_text = null;
        } else {
            this.location_text = str3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MarketplaceDetailsJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, c0881AGi, null, c0881AGi, null, null, null);
    }
}
