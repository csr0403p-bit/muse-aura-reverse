package com.facebook.aura.shopping.model;

import X.A3q;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.C10571Hud;
import X.C3cG;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9jH;
import X.C9tJ;
import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.common.formatting.LocalizedFormattingKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class ProductDetailsPresentationKt {
    public static final boolean getHasDisplayableField(PdpSeller pdpSeller) {
        String str;
        String str2;
        C7384Etj.A0Y(pdpSeller, 0);
        String str3 = pdpSeller.name;
        return ((str3 == null || C7BY.A0j(str3)) && ((str = pdpSeller.profileUrl) == null || C7BY.A0j(str)) && (((str2 = pdpSeller.profilePicUrl) == null || C7BY.A0j(str2)) && pdpSeller.joinYear == null && pdpSeller.rating == null)) ? false : true;
    }

    public static final String httpsUrlOrNull(String str) {
        if (str == null || !AnonymousClass006.A1b("https://", str)) {
            return null;
        }
        return str;
    }

    public static final boolean showsMerchantLogo(PdpHeader pdpHeader) {
        C7384Etj.A0Y(pdpHeader, 0);
        if (pdpHeader.merchantName != null) {
            return pdpHeader.isPartnerMerchant || pdpHeader.merchantLogoUrl != null;
        }
        return false;
    }

    public static final String trimToNonEmpty(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static /* synthetic */ String formatPrice$default(PdpPrice pdpPrice, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = C60Q.A0w();
        }
        return formatPrice(pdpPrice, locale);
    }

    public static final ProductDetailsPresentation mergedWith(ProductDetailsPresentation productDetailsPresentation, ProductDetailsPresentation productDetailsPresentation2) {
        boolean zA1b = AnonymousClass004.A1b(productDetailsPresentation, productDetailsPresentation2);
        String str = productDetailsPresentation.productId;
        if (C7BY.A0j(str)) {
            str = productDetailsPresentation2.productId;
        }
        PdpHeader pdpHeaderMergedWith = mergedWith(productDetailsPresentation.header, productDetailsPresentation2.header);
        PdpProductInfo pdpProductInfoMergedWith = mergedWith(productDetailsPresentation.product, productDetailsPresentation2.product);
        PdpRating pdpRating = productDetailsPresentation.rating;
        if (pdpRating == null) {
            pdpRating = productDetailsPresentation2.rating;
        }
        List<String> list = productDetailsPresentation.pills;
        if (list.isEmpty()) {
            list = productDetailsPresentation2.pills;
        }
        List<PdpVariantGroup> list2 = productDetailsPresentation.variantGroups;
        if (list2.isEmpty()) {
            list2 = productDetailsPresentation2.variantGroups;
        }
        List<PdpVariantPricing> list3 = productDetailsPresentation.variantPricing;
        if (list3.isEmpty()) {
            list3 = productDetailsPresentation2.variantPricing;
        }
        List<PdpVariantImages> list4 = productDetailsPresentation.variantImages;
        if (list4.isEmpty()) {
            list4 = productDetailsPresentation2.variantImages;
        }
        Set<String> set = productDetailsPresentation.outOfStockProductIds;
        if (set.isEmpty()) {
            set = productDetailsPresentation2.outOfStockProductIds;
        }
        List<PdpAction> list5 = productDetailsPresentation.actions;
        if (list5.isEmpty()) {
            list5 = productDetailsPresentation2.actions;
        }
        List<ShoppingResultProduct> list6 = productDetailsPresentation.relatedProducts;
        if (list6.isEmpty()) {
            list6 = productDetailsPresentation2.relatedProducts;
        }
        ShoppingProductType shoppingProductType = productDetailsPresentation.productType;
        if (shoppingProductType == ShoppingProductType.UNKNOWN || shoppingProductType == null) {
            shoppingProductType = productDetailsPresentation2.productType;
        }
        boolean z = productDetailsPresentation2.canOfferBuyNow;
        ShoppingPrimaryAction shoppingPrimaryAction = productDetailsPresentation2.primaryAction;
        ShoppingSecondaryAction shoppingSecondaryAction = productDetailsPresentation2.secondaryAction;
        PdpSeller pdpSeller = productDetailsPresentation.seller;
        if (pdpSeller == null) {
            pdpSeller = productDetailsPresentation2.seller;
        }
        List<PdpAttribute> list7 = productDetailsPresentation.attributes;
        if (list7.isEmpty()) {
            list7 = productDetailsPresentation2.attributes;
        }
        List<PdpSellerReview> list8 = productDetailsPresentation.sellerReviews;
        if (list8.isEmpty()) {
            list8 = productDetailsPresentation2.sellerReviews;
        }
        PdpLocation pdpLocation = productDetailsPresentation.location;
        if (pdpLocation == null) {
            pdpLocation = productDetailsPresentation2.location;
        }
        ProductShippingReturns productShippingReturns = productDetailsPresentation.shippingReturns;
        if (productShippingReturns == null) {
            productShippingReturns = productDetailsPresentation2.shippingReturns;
        }
        String str2 = productDetailsPresentation.buyLabel;
        if (str2 == null) {
            str2 = productDetailsPresentation2.buyLabel;
        }
        String str3 = productDetailsPresentation.websiteLabel;
        if (str3 == null) {
            str3 = productDetailsPresentation2.websiteLabel;
        }
        String str4 = productDetailsPresentation.categoryName;
        if (str4 == null) {
            str4 = productDetailsPresentation2.categoryName;
        }
        String str5 = productDetailsPresentation.listingDurationText;
        if (str5 == null) {
            str5 = productDetailsPresentation2.listingDurationText;
        }
        Integer num = productDetailsPresentation.sellerListingCount;
        if (num == null) {
            num = productDetailsPresentation2.sellerListingCount;
        }
        List<ShoppingResultProduct> list9 = productDetailsPresentation.sellerOtherListings;
        if (list9.isEmpty()) {
            list9 = productDetailsPresentation2.sellerOtherListings;
        }
        Set<String> set2 = set;
        return new ProductDetailsPresentation(str, pdpHeaderMergedWith, pdpProductInfoMergedWith, pdpRating, list, list2, list3, list4, list5, list6, shoppingProductType, z, shoppingPrimaryAction, shoppingSecondaryAction, pdpSeller, list7, list8, pdpLocation, productShippingReturns, str2, str3, str4, str5, num, list9, set2, C9jH.A00, zA1b, productDetailsPresentation.couponPrices, productDetailsPresentation.ownCouponPriceIds, productDetailsPresentation.isTryOnEligible);
    }

    public static final ProductDetailsPresentation withPayloadPricing(ProductDetailsPresentation productDetailsPresentation, ProductDetailsPresentation productDetailsPresentation2) {
        String str;
        boolean zA1b = AnonymousClass004.A1b(productDetailsPresentation, productDetailsPresentation2);
        PdpHeader pdpHeader = productDetailsPresentation.header;
        String str2 = productDetailsPresentation2.header.brand;
        if (str2 == null) {
            str2 = pdpHeader.brand;
        }
        ProductDetailsPresentation productDetailsPresentationCopy$default = ProductDetailsPresentation.copy$default(productDetailsPresentation, null, new PdpHeader(pdpHeader.merchantName, pdpHeader.merchantLogoUrl, str2, pdpHeader.isPartnerMerchant), null, null, null, null, null, null, null, null, null, zA1b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, zA1b, null, null, null, 2147483645, null);
        PdpPrice pdpPrice = productDetailsPresentation2.product.currentPrice;
        if (pdpPrice == null || (str = pdpPrice.value) == null || C7BY.A0j(str)) {
            return productDetailsPresentationCopy$default;
        }
        PdpProductInfo pdpProductInfo = productDetailsPresentation.product;
        PdpProductInfo pdpProductInfo2 = productDetailsPresentation2.product;
        PdpProductInfo pdpProductInfoCopy = pdpProductInfo.copy(pdpProductInfo.name, pdpProductInfo.description, pdpProductInfo.url, pdpProductInfo.stockStatus, pdpProductInfo2.currentPrice, pdpProductInfo2.originalPrice, pdpProductInfo2.pricePercentOff, pdpProductInfo.images);
        List<PdpVariantPricing> list = productDetailsPresentation.variantPricing;
        ArrayList arrayListA0h = C3cG.A0h();
        for (PdpVariantPricing pdpVariantPricing : list) {
            AnonymousClass006.A1O(pdpVariantPricing.productId, productDetailsPresentation.productId, pdpVariantPricing, arrayListA0h);
        }
        return ProductDetailsPresentation.copy$default(productDetailsPresentationCopy$default, null, null, pdpProductInfoCopy, null, null, null, arrayListA0h, null, null, null, null, zA1b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, zA1b, C9jH.A00, A3q.A00, null, 1342177211, null);
    }

    public static final List<PdpImage> distinctByUrl(List<PdpImage> list) {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        ArrayList arrayListA0h = C3cG.A0h();
        for (PdpImage pdpImage : list) {
            PdpImage pdpImage2 = pdpImage;
            if (!C7BY.A0j(pdpImage2.url)) {
                AnonymousClass006.A1P(AnonymousClass002.A0l(pdpImage2.url), pdpImage, linkedHashSetA0k, arrayListA0h);
            }
        }
        return arrayListA0h;
    }

    public static final String formatPrice(PdpPrice pdpPrice, Locale locale) {
        Object objA0s;
        boolean zA1Y = C60P.A1Y(pdpPrice, locale);
        BigDecimal bigDecimalA0x = C9tJ.A0x(pdpPrice.value);
        if (bigDecimalA0x == null) {
            return C7BY.A0j(pdpPrice.currency) ? pdpPrice.value : FGI.A0U(pdpPrice.currency, InviteCodeScratcherKt.CODE_SEPARATOR, pdpPrice.value);
        }
        try {
            objA0s = LocalizedFormattingKt.formatCurrency(bigDecimalA0x, pdpPrice.currency, locale, zA1Y, zA1Y);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Object objA0U = FGI.A0U(pdpPrice.currency, InviteCodeScratcherKt.CODE_SEPARATOR, pdpPrice.value);
        if (objA0s instanceof C10571Hud) {
            objA0s = objA0U;
        }
        return (String) objA0s;
    }

    public static final String selectedSizeLabel(ProductDetailsPresentation productDetailsPresentation, Map<String, String> map) {
        PdpVariantGroup next;
        String str;
        PdpVariantOption next2;
        AnonymousClass003.A0u(productDetailsPresentation, map);
        Iterator<PdpVariantGroup> it = productDetailsPresentation.getRenderedVariantGroups().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getKind() == PdpVariantDimensionKind.SIZE) {
                break;
            }
        }
        PdpVariantGroup pdpVariantGroup = next;
        if (pdpVariantGroup == null || (str = map.get(pdpVariantGroup.dimension)) == null) {
            return null;
        }
        Iterator<PdpVariantOption> it2 = pdpVariantGroup.options.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (str.equals(next2.id)) {
                break;
            }
        }
        PdpVariantOption pdpVariantOption = next2;
        return trimToNonEmpty(pdpVariantOption != null ? pdpVariantOption.label : null);
    }

    public static final PdpProductInfo mergedWith(PdpProductInfo pdpProductInfo, PdpProductInfo pdpProductInfo2) {
        PdpPrice pdpPrice;
        PdpPrice pdpPrice2;
        Integer num;
        String str;
        PdpPrice pdpPrice3 = pdpProductInfo.currentPrice;
        boolean z = false;
        if (pdpPrice3 != null && (str = pdpPrice3.value) != null && (!C7BY.A0j(str))) {
            z = true;
        }
        String str2 = pdpProductInfo.name;
        if (C7BY.A0j(str2)) {
            str2 = pdpProductInfo2.name;
        }
        String str3 = pdpProductInfo.description;
        if (str3 == null) {
            str3 = pdpProductInfo2.description;
        }
        String str4 = pdpProductInfo.url;
        if (str4 == null) {
            str4 = pdpProductInfo2.url;
        }
        String str5 = pdpProductInfo.stockStatus;
        if (str5 == null) {
            str5 = pdpProductInfo2.stockStatus;
        }
        if (z) {
            pdpPrice = pdpProductInfo.currentPrice;
        } else {
            pdpPrice = pdpProductInfo2.currentPrice;
        }
        if (z) {
            pdpPrice2 = pdpProductInfo.originalPrice;
        } else {
            pdpPrice2 = pdpProductInfo2.originalPrice;
        }
        if (z) {
            num = pdpProductInfo.pricePercentOff;
        } else {
            num = pdpProductInfo2.pricePercentOff;
        }
        List<PdpImage> list = pdpProductInfo.images;
        if (list.isEmpty()) {
            list = pdpProductInfo2.images;
        }
        return new PdpProductInfo(str2, str3, str4, str5, pdpPrice, pdpPrice2, num, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.shopping.model.PdpHeader mergedWith(com.facebook.aura.shopping.model.PdpHeader r6, com.facebook.aura.shopping.model.PdpHeader r7) {
        /*
            java.lang.String r5 = r7.merchantName
            r4 = r5
            if (r5 != 0) goto L7
            java.lang.String r4 = r6.merchantName
        L7:
            r3 = 1
            if (r5 != 0) goto L22
            java.lang.String r2 = r6.merchantLogoUrl
        Lc:
            r1 = r2
        Ld:
            java.lang.String r2 = r6.brand
            if (r2 != 0) goto L13
            java.lang.String r2 = r7.brand
        L13:
            boolean r0 = r7.isPartnerMerchant
            if (r0 != 0) goto L1c
            boolean r0 = r6.isPartnerMerchant
            if (r0 != 0) goto L1c
            r3 = 0
        L1c:
            com.facebook.aura.shopping.model.PdpHeader r0 = new com.facebook.aura.shopping.model.PdpHeader
            r0.<init>(r4, r1, r2, r3)
            return r0
        L22:
            boolean r0 = r7.isPartnerMerchant
            java.lang.String r1 = r7.merchantLogoUrl
            if (r0 != 0) goto Ld
            if (r1 != 0) goto Ld
            java.lang.String r1 = r6.merchantLogoUrl
            r2 = 0
            if (r1 == 0) goto Lc
            java.lang.String r0 = r6.merchantName
            if (r0 == 0) goto Lc
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto Lc
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.model.ProductDetailsPresentationKt.mergedWith(com.facebook.aura.shopping.model.PdpHeader, com.facebook.aura.shopping.model.PdpHeader):com.facebook.aura.shopping.model.PdpHeader");
    }
}
