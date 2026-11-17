package com.facebook.aura.shopping.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
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
public final class ProductJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<ArtJson> arts;
    public final List<AttributeJson> attributes;
    public final PriceJson current_price;
    public final String description;
    public final String id;
    public final List<ImageJson> images;
    public final String merchant_name;
    public final String name;
    public final PriceJson original_price;
    public final Integer price_percent_off;
    public final RatingJson rating;
    public final List<AttributeJson> selected_variant_info;
    public final String seller_name;
    public final String stock_status;
    public final String url;
    public final List<VariantGroupJson> variant_groups;
    public final List<VariantImagesJson> variant_images;
    public final List<VariantPricingJson> variant_pricing;
    public final List<VariantStockStatusJson> variant_stock_status;

    public final class Companion {
        public final C9hr<ProductJson> serializer() {
            return ProductJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, ProductJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ProductJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, ProductJson$Companion$$childSerializers$3.INSTANCE), AbstractC5321DgF.A02(num, ProductJson$Companion$$childSerializers$4.INSTANCE), AbstractC5321DgF.A02(num, ProductJson$Companion$$childSerializers$5.INSTANCE), AbstractC5321DgF.A02(num, ProductJson$Companion$$childSerializers$6.INSTANCE), null, AbstractC5321DgF.A02(num, ProductJson$Companion$$childSerializers$7.INSTANCE), AbstractC5321DgF.A02(num, ProductJson$Companion$$childSerializers$8.INSTANCE)};
    }

    public final ProductJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, PriceJson priceJson, PriceJson priceJson2, Integer num, List<ImageJson> list, List<VariantGroupJson> list2, List<VariantPricingJson> list3, List<VariantImagesJson> list4, List<VariantStockStatusJson> list5, List<ArtJson> list6, RatingJson ratingJson, List<AttributeJson> list7, List<AttributeJson> list8) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A18(list, list2, list3, list4, list5);
        C3cI.A1I(list6, 15, list7);
        C7384Etj.A0Y(list8, 18);
        return new ProductJson(str, str2, str3, str4, str5, str6, str7, priceJson, priceJson2, num, list, list2, list3, list4, list5, list6, ratingJson, list7, list8);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductJson) {
                ProductJson productJson = (ProductJson) obj;
                if (!C7384Etj.areEqual(this.id, productJson.id) || !C7384Etj.areEqual(this.name, productJson.name) || !C7384Etj.areEqual(this.merchant_name, productJson.merchant_name) || !C7384Etj.areEqual(this.seller_name, productJson.seller_name) || !C7384Etj.areEqual(this.description, productJson.description) || !C7384Etj.areEqual(this.url, productJson.url) || !C7384Etj.areEqual(this.stock_status, productJson.stock_status) || !C7384Etj.areEqual(this.current_price, productJson.current_price) || !C7384Etj.areEqual(this.original_price, productJson.original_price) || !C7384Etj.areEqual(this.price_percent_off, productJson.price_percent_off) || !C7384Etj.areEqual(this.images, productJson.images) || !C7384Etj.areEqual(this.variant_groups, productJson.variant_groups) || !C7384Etj.areEqual(this.variant_pricing, productJson.variant_pricing) || !C7384Etj.areEqual(this.variant_images, productJson.variant_images) || !C7384Etj.areEqual(this.variant_stock_status, productJson.variant_stock_status) || !C7384Etj.areEqual(this.arts, productJson.arts) || !C7384Etj.areEqual(this.rating, productJson.rating) || !C7384Etj.areEqual(this.attributes, productJson.attributes) || !C7384Etj.areEqual(this.selected_variant_info, productJson.selected_variant_info)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ProductJson productJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(productJson.id)) {
            c9j5.AAV(productJson.id, c9iZ, 0);
        }
        if (zAfR || productJson.name != null) {
            c9j5.AAP(productJson.name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || productJson.merchant_name != null) {
            c9j5.AAP(productJson.merchant_name, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || productJson.seller_name != null) {
            c9j5.AAP(productJson.seller_name, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || productJson.description != null) {
            c9j5.AAP(productJson.description, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || productJson.url != null) {
            c9j5.AAP(productJson.url, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || productJson.stock_status != null) {
            c9j5.AAP(productJson.stock_status, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || productJson.current_price != null) {
            c9j5.AAP(productJson.current_price, PriceJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || productJson.original_price != null) {
            c9j5.AAP(productJson.original_price, PriceJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || productJson.price_percent_off != null) {
            c9j5.AAP(productJson.price_percent_off, C07729ii.A00, c9iZ, 9);
        }
        if (zAfR || !C3cG.A1L(productJson.images)) {
            c9j5.AAQ(productJson.images, C3cH.A15(f0cArr, 10), c9iZ, 10);
        }
        if (zAfR || !C3cG.A1L(productJson.variant_groups)) {
            c9j5.AAQ(productJson.variant_groups, C3cH.A15(f0cArr, 11), c9iZ, 11);
        }
        if (zAfR || !C3cG.A1L(productJson.variant_pricing)) {
            c9j5.AAQ(productJson.variant_pricing, C3cH.A15(f0cArr, 12), c9iZ, 12);
        }
        if (zAfR || !C3cG.A1L(productJson.variant_images)) {
            c9j5.AAQ(productJson.variant_images, C3cH.A15(f0cArr, 13), c9iZ, 13);
        }
        if (zAfR || !C3cG.A1L(productJson.variant_stock_status)) {
            c9j5.AAQ(productJson.variant_stock_status, C3cH.A15(f0cArr, 14), c9iZ, 14);
        }
        if (zAfR || !C3cG.A1L(productJson.arts)) {
            c9j5.AAQ(productJson.arts, C3cH.A15(f0cArr, 15), c9iZ, 15);
        }
        if (zAfR || productJson.rating != null) {
            c9j5.AAP(productJson.rating, RatingJson$$serializer.INSTANCE, c9iZ, 16);
        }
        if (zAfR || !C3cG.A1L(productJson.attributes)) {
            c9j5.AAQ(productJson.attributes, C3cH.A15(f0cArr, 17), c9iZ, 17);
        }
        if (zAfR || !C3cG.A1L(productJson.selected_variant_info)) {
            c9j5.AAQ(productJson.selected_variant_info, C3cH.A15(f0cArr, 18), c9iZ, 18);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final Integer component10() {
        return this.price_percent_off;
    }

    public final List<ImageJson> component11() {
        return this.images;
    }

    public final List<VariantGroupJson> component12() {
        return this.variant_groups;
    }

    public final List<VariantPricingJson> component13() {
        return this.variant_pricing;
    }

    public final List<VariantImagesJson> component14() {
        return this.variant_images;
    }

    public final List<VariantStockStatusJson> component15() {
        return this.variant_stock_status;
    }

    public final List<ArtJson> component16() {
        return this.arts;
    }

    public final RatingJson component17() {
        return this.rating;
    }

    public final List<AttributeJson> component18() {
        return this.attributes;
    }

    public final List<AttributeJson> component19() {
        return this.selected_variant_info;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.merchant_name;
    }

    public final String component4() {
        return this.seller_name;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.url;
    }

    public final String component7() {
        return this.stock_status;
    }

    public final PriceJson component8() {
        return this.current_price;
    }

    public final PriceJson component9() {
        return this.original_price;
    }

    public final List<ArtJson> getArts() {
        return this.arts;
    }

    public final List<AttributeJson> getAttributes() {
        return this.attributes;
    }

    public final PriceJson getCurrent_price() {
        return this.current_price;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ImageJson> getImages() {
        return this.images;
    }

    public final String getMerchant_name() {
        return this.merchant_name;
    }

    public final String getName() {
        return this.name;
    }

    public final PriceJson getOriginal_price() {
        return this.original_price;
    }

    public final Integer getPrice_percent_off() {
        return this.price_percent_off;
    }

    public final RatingJson getRating() {
        return this.rating;
    }

    public final List<AttributeJson> getSelected_variant_info() {
        return this.selected_variant_info;
    }

    public final String getSeller_name() {
        return this.seller_name;
    }

    public final String getStock_status() {
        return this.stock_status;
    }

    public final String getUrl() {
        return this.url;
    }

    public final List<VariantGroupJson> getVariant_groups() {
        return this.variant_groups;
    }

    public final List<VariantImagesJson> getVariant_images() {
        return this.variant_images;
    }

    public final List<VariantPricingJson> getVariant_pricing() {
        return this.variant_pricing;
    }

    public final List<VariantStockStatusJson> getVariant_stock_status() {
        return this.variant_stock_status;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.selected_variant_info, AnonymousClass005.A0F(this.attributes, (AnonymousClass005.A0F(this.arts, AnonymousClass005.A0F(this.variant_stock_status, AnonymousClass005.A0F(this.variant_images, AnonymousClass005.A0F(this.variant_pricing, AnonymousClass005.A0F(this.variant_groups, AnonymousClass005.A0F(this.images, (((((((((((((((((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.merchant_name)) * 31) + AnonymousClass006.A0G(this.seller_name)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.stock_status)) * 31) + AnonymousClass006.A0D(this.current_price)) * 31) + AnonymousClass006.A0D(this.original_price)) * 31) + AnonymousClass006.A0D(this.price_percent_off)) * 31)))))) + C3cH.A02(this.rating)) * 31));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductJson() {
        this((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (PriceJson) (0 == true ? 1 : 0), (PriceJson) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (RatingJson) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 524287, (C06H) (0 == true ? 1 : 0));
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ProductJson copy$default(ProductJson productJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, PriceJson priceJson, PriceJson priceJson2, Integer num, List list, List list2, List list3, List list4, List list5, List list6, RatingJson ratingJson, List list7, List list8, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        PriceJson priceJson3 = priceJson;
        PriceJson priceJson4 = priceJson2;
        Integer num2 = num;
        List list9 = list;
        List list10 = list2;
        List list11 = list3;
        List list12 = list4;
        List list13 = list5;
        List list14 = list6;
        RatingJson ratingJson2 = ratingJson;
        List list15 = list7;
        List list16 = list8;
        if ((i & 1) != 0) {
            str8 = productJson.id;
        }
        if ((i & 2) != 0) {
            str9 = productJson.name;
        }
        if ((i & 4) != 0) {
            str10 = productJson.merchant_name;
        }
        if ((i & 8) != 0) {
            str11 = productJson.seller_name;
        }
        if ((i & 16) != 0) {
            str12 = productJson.description;
        }
        if ((i & 32) != 0) {
            str13 = productJson.url;
        }
        if ((i & 64) != 0) {
            str14 = productJson.stock_status;
        }
        if ((i & 128) != 0) {
            priceJson3 = productJson.current_price;
        }
        if ((i & 256) != 0) {
            priceJson4 = productJson.original_price;
        }
        if ((i & 512) != 0) {
            num2 = productJson.price_percent_off;
        }
        if ((i & 1024) != 0) {
            list9 = productJson.images;
        }
        if ((i & 2048) != 0) {
            list10 = productJson.variant_groups;
        }
        if ((i & 4096) != 0) {
            list11 = productJson.variant_pricing;
        }
        if ((i & 8192) != 0) {
            list12 = productJson.variant_images;
        }
        if ((i & 16384) != 0) {
            list13 = productJson.variant_stock_status;
        }
        if ((i & 32768) != 0) {
            list14 = productJson.arts;
        }
        if ((i & 65536) != 0) {
            ratingJson2 = productJson.rating;
        }
        if ((i & 131072) != 0) {
            list15 = productJson.attributes;
        }
        if ((i & 262144) != 0) {
            list16 = productJson.selected_variant_info;
        }
        String str15 = str14;
        return productJson.copy(str8, str9, str10, str11, str12, str13, str15, priceJson3, priceJson4, num2, list9, list10, list11, list12, list13, list14, ratingJson2, list15, list16);
    }

    public /* synthetic */ ProductJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, PriceJson priceJson, PriceJson priceJson2, Integer num, List list, List list2, List list3, List list4, List list5, List list6, RatingJson ratingJson, List list7, List list8, C2hx c2hx) {
        List list9 = list4;
        List list10 = list5;
        List list11 = list6;
        List list12 = list7;
        List list13 = list8;
        this.id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.merchant_name = null;
        } else {
            this.merchant_name = str3;
        }
        if ((i & 8) == 0) {
            this.seller_name = null;
        } else {
            this.seller_name = str4;
        }
        if ((i & 16) == 0) {
            this.description = null;
        } else {
            this.description = str5;
        }
        if ((i & 32) == 0) {
            this.url = null;
        } else {
            this.url = str6;
        }
        if ((i & 64) == 0) {
            this.stock_status = null;
        } else {
            this.stock_status = str7;
        }
        if ((i & 128) == 0) {
            this.current_price = null;
        } else {
            this.current_price = priceJson;
        }
        if ((i & 256) == 0) {
            this.original_price = null;
        } else {
            this.original_price = priceJson2;
        }
        if ((i & 512) == 0) {
            this.price_percent_off = null;
        } else {
            this.price_percent_off = num;
        }
        if ((i & 1024) == 0) {
            this.images = C0881AGi.A00;
        } else {
            this.images = list;
        }
        if ((i & 2048) == 0) {
            this.variant_groups = C0881AGi.A00;
        } else {
            this.variant_groups = list2;
        }
        if ((i & 4096) == 0) {
            this.variant_pricing = C0881AGi.A00;
        } else {
            this.variant_pricing = list3;
        }
        this.variant_images = (i & 8192) == 0 ? C0881AGi.A00 : list9;
        this.variant_stock_status = (i & 16384) == 0 ? C0881AGi.A00 : list10;
        this.arts = (32768 & i) == 0 ? C0881AGi.A00 : list11;
        if ((65536 & i) == 0) {
            this.rating = null;
        } else {
            this.rating = ratingJson;
        }
        this.attributes = (131072 & i) == 0 ? C0881AGi.A00 : list12;
        this.selected_variant_info = (i & 262144) == 0 ? C0881AGi.A00 : list13;
    }

    public /* synthetic */ ProductJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, PriceJson priceJson, PriceJson priceJson2, Integer num, List list, List list2, List list3, List list4, List list5, List list6, RatingJson ratingJson, List list7, List list8, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, C3cG.A0e(str2, i & 2), C3cG.A0e(str3, i & 4), C3cG.A0e(str4, i & 8), C3cG.A0e(str5, i & 16), C3cG.A0e(str6, i & 32), C3cG.A0e(str7, i & 64), (i & 128) != 0 ? null : priceJson, (i & 256) != 0 ? null : priceJson2, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? C0881AGi.A00 : list, (i & 2048) != 0 ? C0881AGi.A00 : list2, (i & 4096) != 0 ? C0881AGi.A00 : list3, (i & 8192) != 0 ? C0881AGi.A00 : list4, (i & 16384) != 0 ? C0881AGi.A00 : list5, (i & 32768) != 0 ? C0881AGi.A00 : list6, (i & 65536) != 0 ? null : ratingJson, (i & 131072) != 0 ? C0881AGi.A00 : list7, (i & 262144) != 0 ? C0881AGi.A00 : list8);
    }

    public ProductJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, PriceJson priceJson, PriceJson priceJson2, Integer num, List<ImageJson> list, List<VariantGroupJson> list2, List<VariantPricingJson> list3, List<VariantImagesJson> list4, List<VariantStockStatusJson> list5, List<ArtJson> list6, RatingJson ratingJson, List<AttributeJson> list7, List<AttributeJson> list8) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A18(list, list2, list3, list4, list5);
        C3cI.A1I(list6, 15, list7);
        C7384Etj.A0Y(list8, 18);
        this.id = str;
        this.name = str2;
        this.merchant_name = str3;
        this.seller_name = str4;
        this.description = str5;
        this.url = str6;
        this.stock_status = str7;
        this.current_price = priceJson;
        this.original_price = priceJson2;
        this.price_percent_off = num;
        this.images = list;
        this.variant_groups = list2;
        this.variant_pricing = list3;
        this.variant_images = list4;
        this.variant_stock_status = list5;
        this.arts = list6;
        this.rating = ratingJson;
        this.attributes = list7;
        this.selected_variant_info = list8;
    }
}
