package com.facebook.aura.shopping.repo;

import X.A3q;
import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9jH;
import X.C9sU;
import X.F0C;
import X.Hr7;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.shopping.model.PdpCouponJsonKt;
import com.facebook.aura.shopping.model.PdpCouponPrice;
import com.facebook.aura.shopping.model.PdpHeader;
import com.facebook.aura.shopping.model.PdpImage;
import com.facebook.aura.shopping.model.PdpLocation;
import com.facebook.aura.shopping.model.PdpPrice;
import com.facebook.aura.shopping.model.PdpProductInfo;
import com.facebook.aura.shopping.model.PdpRating;
import com.facebook.aura.shopping.model.PdpSeller;
import com.facebook.aura.shopping.model.PdpVariantGroup;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ProductShippingReturns;
import com.facebook.aura.shopping.model.ShoppingProductType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes4.dex */
public final class ProductDetailsResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final ActionButtonsJson action_buttons;
    public final LocationJson location;
    public final JsonElement marketplace_details;
    public final MerchantJson merchant;
    public final JsonElement pdp_coupon;
    public final ProductJson product;
    public final List<RelatedProductJson> related_products;
    public final SellerJson seller;
    public final List<SellerReviewJson> seller_reviews;
    public final JsonElement shipping_returns;
    public final JsonElement variant_coupon_prices;

    public final class Companion {
        public final C9hr<ProductDetailsResponseJson> serializer() {
            return ProductDetailsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, ProductDetailsResponseJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, ProductDetailsResponseJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsResponseJson) {
                ProductDetailsResponseJson productDetailsResponseJson = (ProductDetailsResponseJson) obj;
                if (!C7384Etj.areEqual(this.product, productDetailsResponseJson.product) || !C7384Etj.areEqual(this.merchant, productDetailsResponseJson.merchant) || !C7384Etj.areEqual(this.related_products, productDetailsResponseJson.related_products) || !C7384Etj.areEqual(this.seller, productDetailsResponseJson.seller) || !C7384Etj.areEqual(this.seller_reviews, productDetailsResponseJson.seller_reviews) || !C7384Etj.areEqual(this.location, productDetailsResponseJson.location) || !C7384Etj.areEqual(this.marketplace_details, productDetailsResponseJson.marketplace_details) || !C7384Etj.areEqual(this.shipping_returns, productDetailsResponseJson.shipping_returns) || !C7384Etj.areEqual(this.action_buttons, productDetailsResponseJson.action_buttons) || !C7384Etj.areEqual(this.pdp_coupon, productDetailsResponseJson.pdp_coupon) || !C7384Etj.areEqual(this.variant_coupon_prices, productDetailsResponseJson.variant_coupon_prices)) {
                }
            }
            return false;
        }
        return true;
    }

    private final ProductDetailsPresentation catalogPresentation(String str) {
        PdpPrice pdpPrice;
        ActionButtonJson actionButtonJson;
        ActionButtonJson actionButtonJson2;
        ProductJson productJson = this.product;
        String str2 = productJson.id;
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(productJson.merchant_name);
        String strTrimToNonEmpty2 = null;
        if (strTrimToNonEmpty == null) {
            MerchantJson merchantJson = this.merchant;
            strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(merchantJson != null ? merchantJson.name : null);
        }
        MerchantJson merchantJson2 = this.merchant;
        PdpHeader pdpHeader = new PdpHeader(strTrimToNonEmpty, ProductDetailsPresentationKt.trimToNonEmpty(merchantJson2 != null ? merchantJson2.image_url : null), null, false);
        ProductJson productJson2 = this.product;
        String str3 = productJson2.name;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = productJson2.description;
        if (str4 == null || C7BY.A0j(str4)) {
            str4 = null;
        }
        String str5 = this.product.url;
        if (str5 == null || C7BY.A0j(str5)) {
            str5 = null;
        }
        String str6 = this.product.stock_status;
        if (str6 == null || C7BY.A0j(str6)) {
            str6 = null;
        }
        PriceJson priceJson = this.product.current_price;
        if (priceJson == null || (pdpPrice = priceJson.toPdpPrice()) == null) {
            pdpPrice = new PdpPrice("", "");
        }
        PriceJson priceJson2 = this.product.original_price;
        PdpPrice pdpPrice2 = priceJson2 != null ? priceJson2.toPdpPrice() : null;
        ProductJson productJson3 = this.product;
        Integer num = productJson3.price_percent_off;
        List<ImageJson> list = productJson3.images;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<ImageJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(new PdpImage(it.next().url));
        }
        PdpProductInfo pdpProductInfo = new PdpProductInfo(str3, str4, str5, str6, pdpPrice, pdpPrice2, num, arrayListA0m);
        ProductJson productJson4 = this.product;
        RatingJson ratingJson = productJson4.rating;
        PdpRating pdpRating = ratingJson != null ? new PdpRating(ratingJson.value, ratingJson.count) : null;
        List<ArtJson> list2 = productJson4.arts;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        Iterator<ArtJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(it2.next().text);
        }
        List<VariantGroupJson> list3 = this.product.variant_groups;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<VariantGroupJson> it3 = list3.iterator();
        while (it3.hasNext()) {
            PdpVariantGroup domain = it3.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        List<VariantPricingJson> list4 = this.product.variant_pricing;
        ArrayList arrayListA0m3 = AnonymousClass002.A0m(list4);
        Iterator<VariantPricingJson> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayListA0m3.add(it4.next().toDomain());
        }
        List<VariantImagesJson> list5 = this.product.variant_images;
        ArrayList arrayListA0m4 = AnonymousClass002.A0m(list5);
        Iterator<VariantImagesJson> it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayListA0m4.add(it5.next().toDomain());
        }
        List<VariantStockStatusJson> list6 = this.product.variant_stock_status;
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (VariantStockStatusJson variantStockStatusJson : list6) {
            if ("OUT_OF_STOCK".equals(variantStockStatusJson.stock_status)) {
                arrayListA0h2.add(variantStockStatusJson);
            }
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it6 = arrayListA0h2.iterator();
        while (it6.hasNext()) {
            linkedHashSetA0k.add(((VariantStockStatusJson) it6.next()).product_id);
        }
        C0881AGi c0881AGi = C0881AGi.A00;
        List<RelatedProductJson> list7 = this.related_products;
        ArrayList arrayListA0m5 = AnonymousClass002.A0m(list7);
        Iterator<RelatedProductJson> it7 = list7.iterator();
        while (it7.hasNext()) {
            arrayListA0m5.add(it7.next().toDomain(str));
        }
        PdpSeller pdpSellerCatalogSeller = catalogSeller();
        List<AttributeJson> list8 = this.product.attributes;
        ArrayList arrayListA0m6 = AnonymousClass002.A0m(list8);
        Iterator<AttributeJson> it8 = list8.iterator();
        while (it8.hasNext()) {
            arrayListA0m6.add(it8.next().toDomain());
        }
        List<SellerReviewJson> list9 = this.seller_reviews;
        ArrayList arrayListA0m7 = AnonymousClass002.A0m(list9);
        Iterator<SellerReviewJson> it9 = list9.iterator();
        while (it9.hasNext()) {
            arrayListA0m7.add(it9.next().toDomain());
        }
        LocationJson locationJson = this.location;
        PdpLocation domain2 = locationJson != null ? locationJson.toDomain() : null;
        ProductShippingReturns productShippingReturnsShippingReturns = shippingReturns();
        ActionButtonsJson actionButtonsJson = this.action_buttons;
        String strTrimToNonEmpty3 = (actionButtonsJson == null || (actionButtonJson2 = actionButtonsJson.buy) == null) ? null : ProductDetailsPresentationKt.trimToNonEmpty(actionButtonJson2.label);
        ActionButtonsJson actionButtonsJson2 = this.action_buttons;
        if (actionButtonsJson2 != null && (actionButtonJson = actionButtonsJson2.website) != null) {
            strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(actionButtonJson.label);
        }
        int i = ProductDetailsPresentation.$stable;
        ShoppingProductType shoppingProductType = ShoppingProductType.UNKNOWN;
        C9jH c9jH = C9jH.A00;
        return new ProductDetailsPresentation(str2, pdpHeader, pdpProductInfo, pdpRating, arrayListA0m2, arrayListA0h, arrayListA0m3, arrayListA0m4, c0881AGi, arrayListA0m5, shoppingProductType, false, null, null, pdpSellerCatalogSeller, arrayListA0m6, arrayListA0m7, domain2, productShippingReturnsShippingReturns, strTrimToNonEmpty3, strTrimToNonEmpty2, null, null, null, c0881AGi, linkedHashSetA0k, c9jH, false, c9jH, A3q.A00, null);
    }

    private final PdpSeller catalogSeller() {
        SellerJson sellerJson = this.seller;
        if (sellerJson == null) {
            if (ProductDetailsPresentationKt.trimToNonEmpty(this.product.seller_name) == null) {
                return null;
            }
            sellerJson = new SellerJson(null, null, null, null, null, null);
        }
        return sellerJson.toDomain(ProductDetailsPresentationKt.trimToNonEmpty(this.product.seller_name));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductDetailsResponseJson copy$default(ProductDetailsResponseJson productDetailsResponseJson, ProductJson productJson, MerchantJson merchantJson, List list, SellerJson sellerJson, List list2, LocationJson locationJson, JsonElement jsonElement, JsonElement jsonElement2, ActionButtonsJson actionButtonsJson, JsonElement jsonElement3, JsonElement jsonElement4, int i, Object obj) {
        if ((i & 1) != 0) {
            productJson = productDetailsResponseJson.product;
        }
        if ((i & 2) != 0) {
            merchantJson = productDetailsResponseJson.merchant;
        }
        if ((i & 4) != 0) {
            list = productDetailsResponseJson.related_products;
        }
        if ((i & 8) != 0) {
            sellerJson = productDetailsResponseJson.seller;
        }
        if ((i & 16) != 0) {
            list2 = productDetailsResponseJson.seller_reviews;
        }
        if ((i & 32) != 0) {
            locationJson = productDetailsResponseJson.location;
        }
        if ((i & 64) != 0) {
            jsonElement = productDetailsResponseJson.marketplace_details;
        }
        if ((i & 128) != 0) {
            jsonElement2 = productDetailsResponseJson.shipping_returns;
        }
        if ((i & 256) != 0) {
            actionButtonsJson = productDetailsResponseJson.action_buttons;
        }
        if ((i & 512) != 0) {
            jsonElement3 = productDetailsResponseJson.pdp_coupon;
        }
        if ((i & 1024) != 0) {
            jsonElement4 = productDetailsResponseJson.variant_coupon_prices;
        }
        return productDetailsResponseJson.copy(productJson, merchantJson, list, sellerJson, list2, locationJson, jsonElement, jsonElement2, actionButtonsJson, jsonElement3, jsonElement4);
    }

    private final Map<String, PdpCouponPrice> couponPrices(String str, double d) {
        PdpCouponPrice pdpCouponPrice = PdpCouponJsonKt.toPdpCouponPrice(this.pdp_coupon, this.product.id, str, d);
        if (pdpCouponPrice == null) {
            return C9jH.A00;
        }
        return AnonymousClass006.A11(this.product.id, pdpCouponPrice, PdpCouponJsonKt.variantCouponPrices(this.variant_coupon_prices, this.product.id, pdpCouponPrice, PdpCouponJsonKt.pdpCouponCode(this.pdp_coupon), new ProductDetailsResponseJson$couponPrices$variantRows$1(this)));
    }

    private final ProductShippingReturns shippingReturns() {
        Object objA0s;
        ProductShippingReturns domain;
        JsonElement jsonElement = this.shipping_returns;
        if (jsonElement != null) {
            try {
                objA0s = (ShippingReturnsJson) C3cI.A0T(ShippingReturnsJson$$serializer.INSTANCE, HatchJsonKt.HatchJson, jsonElement);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            ShippingReturnsJson shippingReturnsJson = (ShippingReturnsJson) objA0s;
            if (shippingReturnsJson != null && (domain = shippingReturnsJson.toDomain()) != null && !domain.isEmpty()) {
                return domain;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.shopping.model.ProductDetailsPresentation withMarketplaceShape(com.facebook.aura.shopping.model.ProductDetailsPresentation r39, com.facebook.aura.shopping.repo.NormalizedMarketplaceDetails r40) {
        /*
            r38 = this;
            r7 = r39
            com.facebook.aura.shopping.model.PdpProductInfo r9 = r7.product
            r0 = r40
            java.util.List<java.lang.String> r1 = r0.additionalImageUrls
            r2 = r38
            java.util.List r17 = r2.heroImages(r1)
            r8 = 0
            int r1 = com.facebook.aura.shopping.model.PdpProductInfo.$stable
            java.lang.String r10 = r9.name
            java.lang.String r11 = r9.description
            java.lang.String r12 = r9.url
            java.lang.String r13 = r9.stockStatus
            com.facebook.aura.shopping.model.PdpPrice r14 = r9.currentPrice
            com.facebook.aura.shopping.model.PdpPrice r15 = r9.originalPrice
            java.lang.Integer r1 = r9.pricePercentOff
            r16 = r1
            com.facebook.aura.shopping.model.PdpProductInfo r10 = r9.copy(r10, r11, r12, r13, r14, r15, r16, r17)
            X.AGi r13 = X.C0881AGi.A00
            com.facebook.aura.shopping.model.PdpSeller r6 = r0.seller
            if (r6 != 0) goto L2d
            com.facebook.aura.shopping.model.PdpSeller r6 = r7.seller
        L2d:
            java.util.List<com.facebook.aura.shopping.model.PdpAttribute> r5 = r0.attributes
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L37
            java.util.List<com.facebook.aura.shopping.model.PdpAttribute> r5 = r7.attributes
        L37:
            com.facebook.aura.shopping.model.PdpLocation r14 = r0.location
            if (r14 == 0) goto L57
            com.facebook.aura.shopping.model.PdpLocation r1 = r7.location
            if (r1 == 0) goto L9e
            java.lang.String r4 = r1.staticMapImageUrl
        L41:
            java.lang.Double r15 = r14.latitude
            java.lang.Double r3 = r14.longitude
            java.lang.Double r2 = r14.radiusKm
            java.lang.String r1 = r14.locationText
            r16 = r3
            r17 = r2
            r18 = r1
            r19 = r4
            com.facebook.aura.shopping.model.PdpLocation r4 = r14.copy(r15, r16, r17, r18, r19)
            if (r4 != 0) goto L59
        L57:
            com.facebook.aura.shopping.model.PdpLocation r4 = r7.location
        L59:
            java.lang.String r3 = r0.categoryName
            java.lang.String r2 = r0.listingDurationText
            java.lang.Integer r1 = r0.sellerListingCount
            java.util.List<com.facebook.aura.shopping.model.ShoppingResultProduct> r0 = r0.otherListings
            r39 = 2115846099(0x7e1d3fd3, float:5.2255047E37)
            r19 = 0
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r21 = r8
            r22 = r6
            r23 = r5
            r24 = r8
            r25 = r4
            r26 = r8
            r27 = r8
            r28 = r8
            r29 = r3
            r30 = r2
            r31 = r1
            r32 = r0
            r33 = r8
            r34 = r8
            r35 = r19
            r36 = r8
            r37 = r8
            r38 = r8
            r40 = r8
            com.facebook.aura.shopping.model.ProductDetailsPresentation r0 = com.facebook.aura.shopping.model.ProductDetailsPresentation.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r0
        L9e:
            r4 = 0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.ProductDetailsResponseJson.withMarketplaceShape(com.facebook.aura.shopping.model.ProductDetailsPresentation, com.facebook.aura.shopping.repo.NormalizedMarketplaceDetails):com.facebook.aura.shopping.model.ProductDetailsPresentation");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(com.facebook.aura.shopping.repo.ProductDetailsResponseJson r27, X.C9j5 r28, X.C9iZ r29) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.repo.ProductDetailsResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(com.facebook.aura.shopping.repo.ProductDetailsResponseJson, X.9j5, X.9iZ):void");
    }

    public final ProductJson component1() {
        return this.product;
    }

    public final JsonElement component10() {
        return this.pdp_coupon;
    }

    public final JsonElement component11() {
        return this.variant_coupon_prices;
    }

    public final MerchantJson component2() {
        return this.merchant;
    }

    public final List<RelatedProductJson> component3() {
        return this.related_products;
    }

    public final SellerJson component4() {
        return this.seller;
    }

    public final List<SellerReviewJson> component5() {
        return this.seller_reviews;
    }

    public final LocationJson component6() {
        return this.location;
    }

    public final JsonElement component7() {
        return this.marketplace_details;
    }

    public final JsonElement component8() {
        return this.shipping_returns;
    }

    public final ActionButtonsJson component9() {
        return this.action_buttons;
    }

    public final ActionButtonsJson getAction_buttons() {
        return this.action_buttons;
    }

    public final LocationJson getLocation() {
        return this.location;
    }

    public final JsonElement getMarketplace_details() {
        return this.marketplace_details;
    }

    public final MerchantJson getMerchant() {
        return this.merchant;
    }

    public final JsonElement getPdp_coupon() {
        return this.pdp_coupon;
    }

    public final ProductJson getProduct() {
        return this.product;
    }

    public final List<RelatedProductJson> getRelated_products() {
        return this.related_products;
    }

    public final SellerJson getSeller() {
        return this.seller;
    }

    public final List<SellerReviewJson> getSeller_reviews() {
        return this.seller_reviews;
    }

    public final JsonElement getShipping_returns() {
        return this.shipping_returns;
    }

    public final JsonElement getVariant_coupon_prices() {
        return this.variant_coupon_prices;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass005.A0F(this.seller_reviews, (AnonymousClass005.A0F(this.related_products, (AnonymousClass005.A0E(this.product) + AnonymousClass006.A0D(this.merchant)) * 31) + AnonymousClass006.A0D(this.seller)) * 31) + AnonymousClass006.A0D(this.location)) * 31) + AnonymousClass006.A0D(this.marketplace_details)) * 31) + AnonymousClass006.A0D(this.shipping_returns)) * 31) + AnonymousClass006.A0D(this.action_buttons)) * 31) + AnonymousClass006.A0D(this.pdp_coupon)) * 31) + C3cH.A02(this.variant_coupon_prices);
    }

    public final boolean ownCouponExpiredOnArrival(String str, double d) {
        return PdpCouponJsonKt.toPdpCouponPrice(this.pdp_coupon, this.product.id, str, d) == null && PdpCouponJsonKt.toPdpCouponPrice(this.pdp_coupon, this.product.id, str, Double.NEGATIVE_INFINITY) != null;
    }

    public final Map<String, PdpCouponPrice> relatedCouponPrices(String str, double d) {
        List<RelatedProductJson> list = this.related_products;
        ArrayList arrayListA0h = C3cG.A0h();
        for (RelatedProductJson relatedProductJson : list) {
            PdpCouponPrice pdpCouponPrice = PdpCouponJsonKt.toPdpCouponPrice(relatedProductJson.pdp_coupon, relatedProductJson.id, str, d);
            if (pdpCouponPrice != null) {
                AnonymousClass002.A1J(relatedProductJson.id, pdpCouponPrice, arrayListA0h);
            }
        }
        return AGH.A06(arrayListA0h);
    }

    public final ProductDetailsPresentation toCatalogDomain(String str, double d) {
        Map<String, PdpCouponPrice> mapCouponPrices = couponPrices(str, d);
        ProductDetailsPresentation domain = toDomain(str);
        String str2 = this.product.id;
        return ProductDetailsPresentation.copy$default(domain, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, mapCouponPrices, (!mapCouponPrices.containsKey(str2) || str2 == null) ? A3q.A00 : Collections.singleton(str2), null, 1342177279, null);
    }

    public final ProductDetailsPresentation toDomain(String str) {
        Object objA0s;
        ProductDetailsPresentation productDetailsPresentationWithMarketplaceShape;
        JsonElement jsonElement = this.marketplace_details;
        NormalizedMarketplaceDetails normalizedMarketplaceDetailsNormalized = null;
        if (jsonElement != null) {
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                F0C<C9hr<Object>>[] f0cArr = MarketplaceDetailsJson.$childSerializers;
                objA0s = (MarketplaceDetailsJson) C3cI.A0T(MarketplaceDetailsJson$$serializer.INSTANCE, c9sU, jsonElement);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            MarketplaceDetailsJson marketplaceDetailsJson = (MarketplaceDetailsJson) objA0s;
            if (marketplaceDetailsJson != null) {
                normalizedMarketplaceDetailsNormalized = MarketplaceDetailsNormalizationKt.normalized(marketplaceDetailsJson, ProductDetailsPresentationKt.trimToNonEmpty(this.product.id), MarketplaceDetailsNormalizationKt.locationVariantText(this.product.selected_variant_info));
            }
        }
        ProductDetailsPresentation productDetailsPresentationCatalogPresentation = catalogPresentation(str);
        return (normalizedMarketplaceDetailsNormalized == null || (productDetailsPresentationWithMarketplaceShape = withMarketplaceShape(productDetailsPresentationCatalogPresentation, normalizedMarketplaceDetailsNormalized)) == null) ? productDetailsPresentationCatalogPresentation : productDetailsPresentationWithMarketplaceShape;
    }

    public ProductDetailsResponseJson(ProductJson productJson, MerchantJson merchantJson, List<RelatedProductJson> list, SellerJson sellerJson, List<SellerReviewJson> list2, LocationJson locationJson, JsonElement jsonElement, JsonElement jsonElement2, ActionButtonsJson actionButtonsJson, JsonElement jsonElement3, JsonElement jsonElement4) {
        AnonymousClass003.A0v(productJson, list);
        C7384Etj.A0Y(list2, 4);
        this.product = productJson;
        this.merchant = merchantJson;
        this.related_products = list;
        this.seller = sellerJson;
        this.seller_reviews = list2;
        this.location = locationJson;
        this.marketplace_details = jsonElement;
        this.shipping_returns = jsonElement2;
        this.action_buttons = actionButtonsJson;
        this.pdp_coupon = jsonElement3;
        this.variant_coupon_prices = jsonElement4;
    }

    private final List<PdpImage> heroImages(List<String> list) {
        ArrayList arrayListA0m;
        boolean zIsEmpty = list.isEmpty();
        List<ImageJson> list2 = this.product.images;
        int iA1D = Hr7.A1D(list2, 10);
        if (zIsEmpty) {
            arrayListA0m = C60O.A11(iA1D);
            Iterator<ImageJson> it = list2.iterator();
            while (it.hasNext()) {
                arrayListA0m.add(new PdpImage(it.next().url));
            }
        } else {
            ArrayList arrayListA11 = C60O.A11(iA1D);
            Iterator<ImageJson> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayListA11.add(AnonymousClass002.A0l(it2.next().url));
            }
            ArrayList arrayListA0P = AbstractC0878AGe.A0P(list, arrayListA11);
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it3 = arrayListA0P.iterator();
            while (it3.hasNext()) {
                AnonymousClass007.A19(arrayListA0h, it3);
            }
            List listA0m = C3cG.A0m(arrayListA0h);
            arrayListA0m = AnonymousClass002.A0m(listA0m);
            Iterator it4 = listA0m.iterator();
            while (it4.hasNext()) {
                arrayListA0m.add(new PdpImage(AnonymousClass005.A0j(it4)));
            }
        }
        return arrayListA0m;
    }

    public final ProductDetailsResponseJson copy(ProductJson productJson, MerchantJson merchantJson, List<RelatedProductJson> list, SellerJson sellerJson, List<SellerReviewJson> list2, LocationJson locationJson, JsonElement jsonElement, JsonElement jsonElement2, ActionButtonsJson actionButtonsJson, JsonElement jsonElement3, JsonElement jsonElement4) {
        AnonymousClass003.A0v(productJson, list);
        C7384Etj.A0Y(list2, 4);
        return new ProductDetailsResponseJson(productJson, merchantJson, list, sellerJson, list2, locationJson, jsonElement, jsonElement2, actionButtonsJson, jsonElement3, jsonElement4);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ProductDetailsResponseJson(int i, ProductJson productJson, MerchantJson merchantJson, List list, SellerJson sellerJson, List list2, LocationJson locationJson, JsonElement jsonElement, JsonElement jsonElement2, ActionButtonsJson actionButtonsJson, JsonElement jsonElement3, JsonElement jsonElement4, C2hx c2hx) {
        List list3 = list;
        List list4 = list2;
        if ((i & 1) != 0) {
            this.product = productJson;
        } else {
            this.product = new ProductJson((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (PriceJson) (0 == true ? 1 : 0), (PriceJson) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (RatingJson) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 524287, (C06H) (0 == true ? 1 : 0));
        }
        if ((i & 2) == 0) {
            this.merchant = null;
        } else {
            this.merchant = merchantJson;
        }
        this.related_products = (i & 4) == 0 ? C0881AGi.A00 : list3;
        if ((i & 8) == 0) {
            this.seller = null;
        } else {
            this.seller = sellerJson;
        }
        this.seller_reviews = (i & 16) == 0 ? C0881AGi.A00 : list4;
        if ((i & 32) == 0) {
            this.location = null;
        } else {
            this.location = locationJson;
        }
        if ((i & 64) == 0) {
            this.marketplace_details = null;
        } else {
            this.marketplace_details = jsonElement;
        }
        if ((i & 128) == 0) {
            this.shipping_returns = null;
        } else {
            this.shipping_returns = jsonElement2;
        }
        if ((i & 256) == 0) {
            this.action_buttons = null;
        } else {
            this.action_buttons = actionButtonsJson;
        }
        if ((i & 512) == 0) {
            this.pdp_coupon = null;
        } else {
            this.pdp_coupon = jsonElement3;
        }
        if ((i & 1024) == 0) {
            this.variant_coupon_prices = null;
        } else {
            this.variant_coupon_prices = jsonElement4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ProductDetailsResponseJson(ProductJson productJson, MerchantJson merchantJson, List list, SellerJson sellerJson, List list2, LocationJson locationJson, JsonElement jsonElement, JsonElement jsonElement2, ActionButtonsJson actionButtonsJson, JsonElement jsonElement3, JsonElement jsonElement4, int i, C06H c06h) {
        this((i & 1) != 0 ? new ProductJson((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (PriceJson) (0 == true ? 1 : 0), (PriceJson) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (RatingJson) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 524287, (C06H) (0 == true ? 1 : 0)) : productJson, (i & 2) != 0 ? null : merchantJson, (i & 4) != 0 ? C0881AGi.A00 : list, (i & 8) != 0 ? null : sellerJson, (i & 16) != 0 ? C0881AGi.A00 : list2, (i & 32) != 0 ? null : locationJson, (i & 64) != 0 ? null : jsonElement, (i & 128) != 0 ? null : jsonElement2, (i & 256) != 0 ? null : actionButtonsJson, (i & 512) != 0 ? null : jsonElement3, (i & 1024) != 0 ? null : jsonElement4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductDetailsResponseJson() {
        this((ProductJson) null, (MerchantJson) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (SellerJson) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (LocationJson) (0 == true ? 1 : 0), (JsonElement) (0 == true ? 1 : 0), (JsonElement) (0 == true ? 1 : 0), (ActionButtonsJson) (0 == true ? 1 : 0), (JsonElement) (0 == true ? 1 : 0), (JsonElement) (0 == true ? 1 : 0), 2047, (C06H) (0 == true ? 1 : 0));
    }
}
