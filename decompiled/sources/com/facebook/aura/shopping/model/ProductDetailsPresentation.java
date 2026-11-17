package com.facebook.aura.shopping.model;

import X.A3q;
import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC2258BHp;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C8j5;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9jH;
import X.F0C;
import X.F60;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.shopping.model.PdpVariantSwatch;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ProductDetailsPresentation extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final List<PdpAction> actions;
    public final boolean actionsFromServer;
    public final List<PdpAttribute> attributes;
    public final String buyLabel;
    public final boolean canOfferBuyNow;
    public final String categoryName;
    public final Map<String, PdpCouponPrice> couponPrices;
    public final PdpHeader header;
    public final Boolean isTryOnEligible;
    public final String listingDurationText;
    public final PdpLocation location;
    public final Set<String> outOfStockProductIds;
    public final Set<String> ownCouponPriceIds;
    public final List<String> pills;
    public final ShoppingPrimaryAction primaryAction;
    public final PdpProductInfo product;
    public final String productId;
    public final ShoppingProductType productType;
    public final PdpRating rating;
    public final List<ShoppingResultProduct> relatedProducts;
    public final ShoppingSecondaryAction secondaryAction;
    public final PdpSeller seller;
    public final Integer sellerListingCount;
    public final List<ShoppingResultProduct> sellerOtherListings;
    public final List<PdpSellerReview> sellerReviews;
    public final ProductShippingReturns shippingReturns;
    public final Map<String, PdpVariantDetails> variantDetails;
    public final List<PdpVariantGroup> variantGroups;
    public final List<PdpVariantImages> variantImages;
    public final List<PdpVariantPricing> variantPricing;
    public final String websiteLabel;

    public final class Companion {
        public final C9hr<ProductDetailsPresentation> serializer() {
            return ProductDetailsPresentation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        F0C<C9hr<Object>>[] f0cArr = new F0C[31];
        Integer num = C79.A01;
        System.arraycopy(new F0C[]{null, null, null, null, AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$3.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$4.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$5.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$6.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$7.INSTANCE), null, AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$8.INSTANCE), null, null, AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$9.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$10.INSTANCE), null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$11.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$12.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$13.INSTANCE)}, 0, f0cArr, 0, 27);
        System.arraycopy(new F0C[]{null, AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$14.INSTANCE), AbstractC5321DgF.A02(num, ProductDetailsPresentation$Companion$$childSerializers$15.INSTANCE), null}, 0, f0cArr, 27, 4);
        $childSerializers = f0cArr;
    }

    private final PdpVariantDetails fetchedVariant(String str) {
        if (str == null || str.equals(this.productId)) {
            return null;
        }
        return this.variantDetails.get(str);
    }

    public final String displayProductId(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        String strResolvedProductId = resolvedProductId(map);
        if (strResolvedProductId == null) {
            strResolvedProductId = standInProductId(map);
        }
        if (strResolvedProductId == null || strResolvedProductId.equals(this.productId)) {
            return null;
        }
        return strResolvedProductId;
    }

    public final PdpPrice effectiveCurrentPrice(String str) {
        PdpVariantPricing next;
        PdpPrice pdpPrice;
        if (str != null) {
            Iterator<PdpVariantPricing> it = this.variantPricing.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.productId)) {
                    break;
                }
            }
            PdpVariantPricing pdpVariantPricing = next;
            if (pdpVariantPricing != null && (pdpPrice = pdpVariantPricing.currentPrice) != null) {
                return pdpPrice;
            }
        }
        return this.product.currentPrice;
    }

    public final List<PdpImage> effectiveImages(Map<String, String> map) {
        List<PdpImage> list;
        C7384Etj.A0Y(map, 0);
        String strHeroProductId = heroProductId(map);
        if (strHeroProductId != null) {
            PdpVariantDetails pdpVariantDetails = this.variantDetails.get(strHeroProductId);
            if (pdpVariantDetails == null || (list = pdpVariantDetails.images) == null) {
                list = C0881AGi.A00;
            }
            if (list.size() > 1) {
                return list;
            }
            PdpImage pdpImageRepresentativeImage = representativeImage(strHeroProductId);
            if (pdpImageRepresentativeImage == null) {
                Iterator<String> it = selectedColorProductIds(map).iterator();
                while (it.hasNext()) {
                    pdpImageRepresentativeImage = representativeImage(AnonymousClass005.A0j(it));
                    if (pdpImageRepresentativeImage != null) {
                    }
                }
                if (!list.isEmpty()) {
                    return list;
                }
            }
            return Collections.singletonList(pdpImageRepresentativeImage);
        }
        return ProductDetailsPresentationKt.distinctByUrl(this.product.images);
    }

    public final PdpPrice effectiveOriginalPrice(String str) {
        PdpVariantPricing pdpVariantPricing = null;
        if (str != null) {
            Iterator<PdpVariantPricing> it = this.variantPricing.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PdpVariantPricing next = it.next();
                if (str.equals(next.productId)) {
                    pdpVariantPricing = next;
                    break;
                }
            }
            PdpVariantPricing pdpVariantPricing2 = pdpVariantPricing;
            if (pdpVariantPricing2 != null) {
                return pdpVariantPricing2.originalPrice;
            }
        }
        return this.product.originalPrice;
    }

    public final Integer effectivePricePercentOff(String str) {
        PdpVariantPricing pdpVariantPricing = null;
        if (str != null) {
            Iterator<PdpVariantPricing> it = this.variantPricing.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PdpVariantPricing next = it.next();
                if (str.equals(next.productId)) {
                    pdpVariantPricing = next;
                    break;
                }
            }
            PdpVariantPricing pdpVariantPricing2 = pdpVariantPricing;
            if (pdpVariantPricing2 != null) {
                return pdpVariantPricing2.pricePercentOff;
            }
        }
        return this.product.pricePercentOff;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsPresentation) {
                ProductDetailsPresentation productDetailsPresentation = (ProductDetailsPresentation) obj;
                if (!C7384Etj.areEqual(this.productId, productDetailsPresentation.productId) || !C7384Etj.areEqual(this.header, productDetailsPresentation.header) || !C7384Etj.areEqual(this.product, productDetailsPresentation.product) || !C7384Etj.areEqual(this.rating, productDetailsPresentation.rating) || !C7384Etj.areEqual(this.pills, productDetailsPresentation.pills) || !C7384Etj.areEqual(this.variantGroups, productDetailsPresentation.variantGroups) || !C7384Etj.areEqual(this.variantPricing, productDetailsPresentation.variantPricing) || !C7384Etj.areEqual(this.variantImages, productDetailsPresentation.variantImages) || !C7384Etj.areEqual(this.actions, productDetailsPresentation.actions) || !C7384Etj.areEqual(this.relatedProducts, productDetailsPresentation.relatedProducts) || this.productType != productDetailsPresentation.productType || this.canOfferBuyNow != productDetailsPresentation.canOfferBuyNow || this.primaryAction != productDetailsPresentation.primaryAction || !C7384Etj.areEqual(this.secondaryAction, productDetailsPresentation.secondaryAction) || !C7384Etj.areEqual(this.seller, productDetailsPresentation.seller) || !C7384Etj.areEqual(this.attributes, productDetailsPresentation.attributes) || !C7384Etj.areEqual(this.sellerReviews, productDetailsPresentation.sellerReviews) || !C7384Etj.areEqual(this.location, productDetailsPresentation.location) || !C7384Etj.areEqual(this.shippingReturns, productDetailsPresentation.shippingReturns) || !C7384Etj.areEqual(this.buyLabel, productDetailsPresentation.buyLabel) || !C7384Etj.areEqual(this.websiteLabel, productDetailsPresentation.websiteLabel) || !C7384Etj.areEqual(this.categoryName, productDetailsPresentation.categoryName) || !C7384Etj.areEqual(this.listingDurationText, productDetailsPresentation.listingDurationText) || !C7384Etj.areEqual(this.sellerListingCount, productDetailsPresentation.sellerListingCount) || !C7384Etj.areEqual(this.sellerOtherListings, productDetailsPresentation.sellerOtherListings) || !C7384Etj.areEqual(this.outOfStockProductIds, productDetailsPresentation.outOfStockProductIds) || !C7384Etj.areEqual(this.variantDetails, productDetailsPresentation.variantDetails) || this.actionsFromServer != productDetailsPresentation.actionsFromServer || !C7384Etj.areEqual(this.couponPrices, productDetailsPresentation.couponPrices) || !C7384Etj.areEqual(this.ownCouponPriceIds, productDetailsPresentation.ownCouponPriceIds) || !C7384Etj.areEqual(this.isTryOnEligible, productDetailsPresentation.isTryOnEligible)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String heroProductId(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        String strStandInProductId = standInProductId(map);
        if (strStandInProductId == null || strStandInProductId.equals(this.productId)) {
            return null;
        }
        return strStandInProductId;
    }

    public final boolean isBuyable(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        List<PdpVariantGroup> renderedVariantGroups = getRenderedVariantGroups();
        if (!renderedVariantGroups.isEmpty()) {
            if (resolvedProductId(map) != null) {
                if (!(renderedVariantGroups instanceof Collection) || !renderedVariantGroups.isEmpty()) {
                    Iterator<PdpVariantGroup> it = renderedVariantGroups.iterator();
                    while (it.hasNext()) {
                        String str = it.next().dimension;
                        if (!isOptionAvailable(str, (String) AbstractC2258BHp.A0L(str, map), map)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final boolean isOptionAvailable(String str, String str2, Map<String, String> map) {
        PdpVariantOption pdpVariantOption;
        PdpVariantGroup next;
        ?? A1Z = AnonymousClass005.A1Z(str, str2, map);
        Iterator<PdpVariantGroup> it = getRenderedVariantGroups().iterator();
        while (true) {
            pdpVariantOption = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(next.dimension)) {
                break;
            }
        }
        PdpVariantGroup pdpVariantGroup = next;
        if (pdpVariantGroup != null) {
            Iterator<PdpVariantOption> it2 = pdpVariantGroup.options.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PdpVariantOption next2 = it2.next();
                if (str2.equals(next2.id)) {
                    pdpVariantOption = next2;
                    break;
                }
            }
            PdpVariantOption pdpVariantOption2 = pdpVariantOption;
            if (pdpVariantOption2 != null) {
                if (pdpVariantGroup.getKind() == PdpVariantDimensionKind.COLOR) {
                    if (getRenderedVariantGroups().size() <= A1Z) {
                    }
                    return A1Z;
                }
                if (isPickedColorReportedUnavailable(map)) {
                    return false;
                }
                if (!pdpVariantGroup.isReportedUnavailable(pdpVariantOption2)) {
                    Set<String> setMatchingProductIds = matchingProductIds(AnonymousClass006.A11(str, str2, map));
                    if (setMatchingProductIds != null) {
                        if (!setMatchingProductIds.isEmpty()) {
                            if (resolvedFrom(setMatchingProductIds) != null) {
                                return !this.outOfStockProductIds.contains(r1);
                            }
                        }
                    }
                    return A1Z;
                }
            }
        }
        return false;
    }

    public final PdpAction productWebsiteAction(String str) {
        C7384Etj.A0Y(str, 0);
        return PdpAction.Companion.productWebsite(str, this.productType == ShoppingProductType.MARKETPLACE ? null : this.websiteLabel);
    }

    public final String resolvedProductId(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        Set<String> setMatchingProductIds = matchingProductIds(map);
        if (setMatchingProductIds != null) {
            return resolvedFrom(setMatchingProductIds);
        }
        return null;
    }

    public final Map<String, String> selectionsForProductId(String str) {
        PdpVariantOption next;
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str)) {
            return C9jH.A00;
        }
        List<PdpVariantGroup> renderedVariantGroups = getRenderedVariantGroups();
        ArrayList arrayListA0h = C3cG.A0h();
        for (PdpVariantGroup pdpVariantGroup : renderedVariantGroups) {
            Iterator<PdpVariantOption> it = pdpVariantGroup.options.iterator();
            do {
                next = null;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            } while (!next.productIds.contains(str));
            PdpVariantOption pdpVariantOption = next;
            if (pdpVariantOption != null) {
                AnonymousClass002.A1J(pdpVariantGroup.dimension, pdpVariantOption.id, arrayListA0h);
            }
        }
        return AGH.A06(arrayListA0h);
    }

    public final ProductDetailsPresentation withEmptyVariantDetails(String str) {
        C7384Etj.A0Y(str, 0);
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AnonymousClass006.A11(str, new PdpVariantDetails(null, null, C0881AGi.A00), this.variantDetails), false, null, null, null, 2080374783, null);
    }

    private final PdpVariantGroup getColorRow() {
        return variantRow(PdpVariantDimensionKind.COLOR);
    }

    private final boolean isPickedColorReportedUnavailable(Map<String, String> map) {
        PdpVariantOption next;
        PdpVariantGroup pdpVariantGroupVariantRow = variantRow(PdpVariantDimensionKind.COLOR);
        if (pdpVariantGroupVariantRow == null) {
            return false;
        }
        Iterator<PdpVariantOption> it = pdpVariantGroupVariantRow.options.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.id, map.get(pdpVariantGroupVariantRow.dimension))) {
                break;
            }
        }
        PdpVariantOption pdpVariantOption = next;
        if (pdpVariantOption != null) {
            return pdpVariantGroupVariantRow.isReportedUnavailable(pdpVariantOption);
        }
        return false;
    }

    private final PdpImage representativeImage(String str) {
        PdpImage pdpImage;
        PdpVariantImages next;
        List<PdpImage> list;
        Iterator<PdpVariantImages> it = this.variantImages.iterator();
        while (true) {
            pdpImage = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.productId, str)) {
                break;
            }
        }
        PdpVariantImages pdpVariantImages = next;
        if (pdpVariantImages == null || (list = pdpVariantImages.images) == null) {
            return null;
        }
        Iterator<PdpImage> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PdpImage next2 = it2.next();
            if (!C7BY.A0j(next2.url)) {
                pdpImage = next2;
                break;
            }
        }
        return pdpImage;
    }

    private final String resolvedFrom(Set<String> set) {
        return set.contains(this.productId) ? this.productId : (String) AbstractC0878AGe.A0D(set);
    }

    private final List<String> selectedColorProductIds(Map<String, String> map) {
        PdpVariantOption next;
        List<String> list;
        PdpVariantGroup pdpVariantGroupVariantRow = variantRow(PdpVariantDimensionKind.COLOR);
        if (pdpVariantGroupVariantRow != null) {
            Iterator<PdpVariantOption> it = pdpVariantGroupVariantRow.options.iterator();
            do {
                next = null;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            } while (!C7384Etj.areEqual(next.id, map.get(pdpVariantGroupVariantRow.dimension)));
            PdpVariantOption pdpVariantOption = next;
            if (pdpVariantOption != null && (list = pdpVariantOption.productIds) != null) {
                return list;
            }
        }
        return C0881AGi.A00;
    }

    private final PdpImage swatchPhoto(PdpVariantOption pdpVariantOption) {
        String next;
        PdpImage pdpImageRepresentativeImage;
        List<String> list = pdpVariantOption.productIds;
        PdpImage pdpImage = null;
        if (list.contains(this.productId)) {
            Iterator<PdpImage> it = this.product.images.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PdpImage next2 = it.next();
                if (!C7BY.A0j(next2.url)) {
                    pdpImage = next2;
                    break;
                }
            }
            pdpImage = pdpImage;
            if (pdpImage == null) {
                return representativeImage(this.productId);
            }
        } else {
            Iterator<String> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (!this.outOfStockProductIds.contains(next)) {
                    break;
                }
            }
            String str = next;
            if ((str != null || (str = (String) AbstractC0878AGe.A0G(list)) != null) && (pdpImageRepresentativeImage = representativeImage(str)) != null) {
                return pdpImageRepresentativeImage;
            }
            Iterator<String> it3 = list.iterator();
            while (it3.hasNext()) {
                PdpImage pdpImageRepresentativeImage2 = representativeImage(AnonymousClass005.A0j(it3));
                if (pdpImageRepresentativeImage2 != null) {
                    return pdpImageRepresentativeImage2;
                }
            }
        }
        return pdpImage;
    }

    private final PdpVariantGroup variantRow(PdpVariantDimensionKind pdpVariantDimensionKind) {
        PdpVariantGroup next;
        Iterator<PdpVariantGroup> it = this.variantGroups.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getKind() == pdpVariantDimensionKind) {
                break;
            }
        }
        return next;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ProductDetailsPresentation productDetailsPresentation, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(productDetailsPresentation.productId, c9iZ, 0);
        c9j5.AAQ(productDetailsPresentation.header, PdpHeader$$serializer.INSTANCE, c9iZ, 1);
        c9j5.AAQ(productDetailsPresentation.product, PdpProductInfo$$serializer.INSTANCE, c9iZ, 2);
        c9j5.AAP(productDetailsPresentation.rating, PdpRating$$serializer.INSTANCE, c9iZ, 3);
        c9j5.AAQ(productDetailsPresentation.pills, C3cH.A15(f0cArr, 4), c9iZ, 4);
        c9j5.AAQ(productDetailsPresentation.variantGroups, C3cH.A15(f0cArr, 5), c9iZ, 5);
        c9j5.AAQ(productDetailsPresentation.variantPricing, C3cH.A15(f0cArr, 6), c9iZ, 6);
        c9j5.AAQ(productDetailsPresentation.variantImages, C3cH.A15(f0cArr, 7), c9iZ, 7);
        c9j5.AAQ(productDetailsPresentation.actions, C3cH.A15(f0cArr, 8), c9iZ, 8);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(productDetailsPresentation.relatedProducts)) {
            c9j5.AAQ(productDetailsPresentation.relatedProducts, C3cH.A15(f0cArr, 9), c9iZ, 9);
        }
        if (zAfR || productDetailsPresentation.productType != ShoppingProductType.UNKNOWN) {
            c9j5.AAQ(productDetailsPresentation.productType, C3cH.A15(f0cArr, 10), c9iZ, 10);
        }
        if (zAfR || productDetailsPresentation.canOfferBuyNow) {
            c9j5.AA7(c9iZ, 11, productDetailsPresentation.canOfferBuyNow);
        }
        if (zAfR || productDetailsPresentation.primaryAction != null) {
            c9j5.AAP(productDetailsPresentation.primaryAction, C3cH.A15(f0cArr, 12), c9iZ, 12);
        }
        if (zAfR || productDetailsPresentation.secondaryAction != null) {
            c9j5.AAP(productDetailsPresentation.secondaryAction, ShoppingSecondaryAction$$serializer.INSTANCE, c9iZ, 13);
        }
        if (zAfR || productDetailsPresentation.seller != null) {
            c9j5.AAP(productDetailsPresentation.seller, PdpSeller$$serializer.INSTANCE, c9iZ, 14);
        }
        if (zAfR || !C3cG.A1L(productDetailsPresentation.attributes)) {
            c9j5.AAQ(productDetailsPresentation.attributes, C3cH.A15(f0cArr, 15), c9iZ, 15);
        }
        if (zAfR || !C3cG.A1L(productDetailsPresentation.sellerReviews)) {
            c9j5.AAQ(productDetailsPresentation.sellerReviews, C3cH.A15(f0cArr, 16), c9iZ, 16);
        }
        if (zAfR || productDetailsPresentation.location != null) {
            c9j5.AAP(productDetailsPresentation.location, PdpLocation$$serializer.INSTANCE, c9iZ, 17);
        }
        if (zAfR || productDetailsPresentation.shippingReturns != null) {
            c9j5.AAP(productDetailsPresentation.shippingReturns, ProductShippingReturns$$serializer.INSTANCE, c9iZ, 18);
        }
        if (zAfR || productDetailsPresentation.buyLabel != null) {
            c9j5.AAP(productDetailsPresentation.buyLabel, C07779iq.A01, c9iZ, 19);
        }
        if (zAfR || productDetailsPresentation.websiteLabel != null) {
            c9j5.AAP(productDetailsPresentation.websiteLabel, C07779iq.A01, c9iZ, 20);
        }
        if (zAfR || productDetailsPresentation.categoryName != null) {
            c9j5.AAP(productDetailsPresentation.categoryName, C07779iq.A01, c9iZ, 21);
        }
        if (zAfR || productDetailsPresentation.listingDurationText != null) {
            c9j5.AAP(productDetailsPresentation.listingDurationText, C07779iq.A01, c9iZ, 22);
        }
        if (zAfR || productDetailsPresentation.sellerListingCount != null) {
            c9j5.AAP(productDetailsPresentation.sellerListingCount, C07729ii.A00, c9iZ, 23);
        }
        if (zAfR || !C3cG.A1L(productDetailsPresentation.sellerOtherListings)) {
            c9j5.AAQ(productDetailsPresentation.sellerOtherListings, C3cH.A15(f0cArr, 24), c9iZ, 24);
        }
        if (zAfR || !C7384Etj.areEqual(productDetailsPresentation.outOfStockProductIds, A3q.A00)) {
            c9j5.AAQ(productDetailsPresentation.outOfStockProductIds, C3cH.A15(f0cArr, 25), c9iZ, 25);
        }
        if (zAfR || !C7384Etj.areEqual(productDetailsPresentation.variantDetails, C9jH.A00)) {
            c9j5.AAQ(productDetailsPresentation.variantDetails, C3cH.A15(f0cArr, 26), c9iZ, 26);
        }
        if (zAfR || productDetailsPresentation.actionsFromServer) {
            c9j5.AA7(c9iZ, 27, productDetailsPresentation.actionsFromServer);
        }
        if (zAfR || !C7384Etj.areEqual(productDetailsPresentation.couponPrices, C9jH.A00)) {
            c9j5.AAQ(productDetailsPresentation.couponPrices, C3cH.A15(f0cArr, 28), c9iZ, 28);
        }
        if (zAfR || !C7384Etj.areEqual(productDetailsPresentation.ownCouponPriceIds, A3q.A00)) {
            c9j5.AAQ(productDetailsPresentation.ownCouponPriceIds, C3cH.A15(f0cArr, 29), c9iZ, 29);
        }
        if (zAfR || productDetailsPresentation.isTryOnEligible != null) {
            c9j5.AAP(productDetailsPresentation.isTryOnEligible, C07839ix.A00, c9iZ, 30);
        }
    }

    public final Map<String, PdpVariantSwatch> colorSwatches() {
        List<PdpVariantOption> list;
        PdpVariantGroup pdpVariantGroupVariantRow = variantRow(PdpVariantDimensionKind.COLOR);
        if (pdpVariantGroupVariantRow == null || (list = pdpVariantGroupVariantRow.options) == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (PdpVariantOption pdpVariantOption : list) {
            Integer num = pdpVariantOption.swatchRgb;
            if (num != null) {
                AnonymousClass002.A1J(pdpVariantOption.id, new PdpVariantSwatch.Hex(num.intValue()), arrayListA0h);
            }
        }
        if (arrayListA0h.size() == list.size()) {
            return AGH.A06(arrayListA0h);
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (PdpVariantOption pdpVariantOption2 : list) {
            String str = pdpVariantOption2.id;
            PdpImage pdpImageSwatchPhoto = swatchPhoto(pdpVariantOption2);
            linkedHashMapA15.put(str, new PdpVariantSwatch.Photo(pdpImageSwatchPhoto != null ? pdpImageSwatchPhoto.url : null));
        }
        return linkedHashMapA15;
    }

    public final String component1() {
        return this.productId;
    }

    public final List<ShoppingResultProduct> component10() {
        return this.relatedProducts;
    }

    public final ShoppingProductType component11() {
        return this.productType;
    }

    public final boolean component12() {
        return this.canOfferBuyNow;
    }

    public final ShoppingPrimaryAction component13() {
        return this.primaryAction;
    }

    public final ShoppingSecondaryAction component14() {
        return this.secondaryAction;
    }

    public final PdpSeller component15() {
        return this.seller;
    }

    public final List<PdpAttribute> component16() {
        return this.attributes;
    }

    public final List<PdpSellerReview> component17() {
        return this.sellerReviews;
    }

    public final PdpLocation component18() {
        return this.location;
    }

    public final ProductShippingReturns component19() {
        return this.shippingReturns;
    }

    public final PdpHeader component2() {
        return this.header;
    }

    public final String component20() {
        return this.buyLabel;
    }

    public final String component21() {
        return this.websiteLabel;
    }

    public final String component22() {
        return this.categoryName;
    }

    public final String component23() {
        return this.listingDurationText;
    }

    public final Integer component24() {
        return this.sellerListingCount;
    }

    public final List<ShoppingResultProduct> component25() {
        return this.sellerOtherListings;
    }

    public final Set<String> component26() {
        return this.outOfStockProductIds;
    }

    public final Map<String, PdpVariantDetails> component27() {
        return this.variantDetails;
    }

    public final boolean component28() {
        return this.actionsFromServer;
    }

    public final Map<String, PdpCouponPrice> component29() {
        return this.couponPrices;
    }

    public final PdpProductInfo component3() {
        return this.product;
    }

    public final Set<String> component30() {
        return this.ownCouponPriceIds;
    }

    public final Boolean component31() {
        return this.isTryOnEligible;
    }

    public final PdpRating component4() {
        return this.rating;
    }

    public final List<String> component5() {
        return this.pills;
    }

    public final List<PdpVariantGroup> component6() {
        return this.variantGroups;
    }

    public final List<PdpVariantPricing> component7() {
        return this.variantPricing;
    }

    public final List<PdpVariantImages> component8() {
        return this.variantImages;
    }

    public final List<PdpAction> component9() {
        return this.actions;
    }

    public final ProductDetailsPresentation copy(String str, PdpHeader pdpHeader, PdpProductInfo pdpProductInfo, PdpRating pdpRating, List<String> list, List<PdpVariantGroup> list2, List<PdpVariantPricing> list3, List<PdpVariantImages> list4, List<PdpAction> list5, List<ShoppingResultProduct> list6, ShoppingProductType shoppingProductType, boolean z, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, PdpSeller pdpSeller, List<PdpAttribute> list7, List<PdpSellerReview> list8, PdpLocation pdpLocation, ProductShippingReturns productShippingReturns, String str2, String str3, String str4, String str5, Integer num, List<ShoppingResultProduct> list9, Set<String> set, Map<String, PdpVariantDetails> map, boolean z2, Map<String, PdpCouponPrice> map2, Set<String> set2, Boolean bool) {
        AnonymousClass005.A0x(str, pdpHeader, pdpProductInfo);
        C7384Etj.A0Y(list, 4);
        AnonymousClass005.A0z(list2, list3, list4);
        C7384Etj.A0Y(list5, 8);
        C3cH.A18(list6, shoppingProductType);
        AnonymousClass003.A12(list7, list8);
        C8j5.A0l(list9, set, map);
        C7384Etj.A0Y(map2, 28);
        C7384Etj.A0Y(set2, 29);
        return new ProductDetailsPresentation(str, pdpHeader, pdpProductInfo, pdpRating, list, list2, list3, list4, list5, list6, shoppingProductType, z, shoppingPrimaryAction, shoppingSecondaryAction, pdpSeller, list7, list8, pdpLocation, productShippingReturns, str2, str3, str4, str5, num, list9, set, map, z2, map2, set2, bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r6 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.facebook.aura.shopping.model.PdpAction> effectiveActions(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = r10.actionsFromServer
            if (r0 != 0) goto L48
            com.facebook.aura.shopping.model.PdpVariantDetails r0 = r10.fetchedVariant(r11)
            if (r0 == 0) goto L41
            java.lang.String r9 = r0.url
            if (r9 == 0) goto L42
            r6 = r9
        Lf:
            java.util.List<com.facebook.aura.shopping.model.PdpAction> r0 = r10.actions
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r8 = r0.iterator()
        L19:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r7 = r8.next()
            com.facebook.aura.shopping.model.PdpAction r7 = (com.facebook.aura.shopping.model.PdpAction) r7
            boolean r0 = r7.followsProductWebsite
            if (r0 == 0) goto L3d
            com.facebook.aura.shopping.model.PdpActionIntent$OpenUrl r4 = new com.facebook.aura.shopping.model.PdpActionIntent$OpenUrl
            r4.<init>(r6)
            java.lang.String r3 = r7.label
            com.facebook.aura.shopping.model.PdpActionStyle r2 = r7.style
            boolean r1 = r7.followsProductWebsite
            r0 = 2
            X.C7384Etj.A0Y(r2, r0)
            com.facebook.aura.shopping.model.PdpAction r7 = new com.facebook.aura.shopping.model.PdpAction
            r7.<init>(r4, r3, r2, r1)
        L3d:
            r5.add(r7)
            goto L19
        L41:
            r9 = 0
        L42:
            com.facebook.aura.shopping.model.PdpProductInfo r0 = r10.product
            java.lang.String r6 = r0.url
            if (r6 != 0) goto Lf
        L48:
            java.util.List<com.facebook.aura.shopping.model.PdpAction> r0 = r10.actions
            return r0
        L4b:
            if (r9 == 0) goto L7a
            com.facebook.aura.shopping.model.ShoppingSecondaryAction r0 = r10.secondaryAction
            if (r0 != 0) goto L7a
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L64
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L64
        L5b:
            com.facebook.aura.shopping.model.PdpAction r0 = r10.productWebsiteAction(r6)
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0Q(r0, r5)
            return r0
        L64:
            java.util.Iterator r1 = r5.iterator()
        L68:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r1.next()
            com.facebook.aura.shopping.model.PdpAction r0 = (com.facebook.aura.shopping.model.PdpAction) r0
            com.facebook.aura.shopping.model.PdpActionIntent r0 = r0.intent
            boolean r0 = r0 instanceof com.facebook.aura.shopping.model.PdpActionIntent.OpenUrl
            if (r0 == 0) goto L68
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.model.ProductDetailsPresentation.effectiveActions(java.lang.String):java.util.List");
    }

    public final List<PdpAction> getActions() {
        return this.actions;
    }

    public final boolean getActionsFromServer() {
        return this.actionsFromServer;
    }

    public final List<PdpAttribute> getAttributes() {
        return this.attributes;
    }

    public final String getBuyLabel() {
        return this.buyLabel;
    }

    public final boolean getCanOfferBuyNow() {
        return this.canOfferBuyNow;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final Map<String, PdpCouponPrice> getCouponPrices() {
        return this.couponPrices;
    }

    public final PdpHeader getHeader() {
        return this.header;
    }

    public final String getListingDurationText() {
        return this.listingDurationText;
    }

    public final PdpLocation getLocation() {
        return this.location;
    }

    public final Set<String> getOutOfStockProductIds() {
        return this.outOfStockProductIds;
    }

    public final Set<String> getOwnCouponPriceIds() {
        return this.ownCouponPriceIds;
    }

    public final List<String> getPills() {
        return this.pills;
    }

    public final ShoppingPrimaryAction getPrimaryAction() {
        return this.primaryAction;
    }

    public final PdpProductInfo getProduct() {
        return this.product;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final ShoppingProductType getProductType() {
        return this.productType;
    }

    public final PdpRating getRating() {
        return this.rating;
    }

    public final List<ShoppingResultProduct> getRelatedProducts() {
        return this.relatedProducts;
    }

    public final List<PdpVariantGroup> getRenderedVariantGroups() {
        return BFI.A0F(new PdpVariantGroup[]{variantRow(PdpVariantDimensionKind.COLOR), variantRow(PdpVariantDimensionKind.SIZE)});
    }

    public final ShoppingSecondaryAction getSecondaryAction() {
        return this.secondaryAction;
    }

    public final PdpSeller getSeller() {
        return this.seller;
    }

    public final Integer getSellerListingCount() {
        return this.sellerListingCount;
    }

    public final List<ShoppingResultProduct> getSellerOtherListings() {
        return this.sellerOtherListings;
    }

    public final List<PdpSellerReview> getSellerReviews() {
        return this.sellerReviews;
    }

    public final ProductShippingReturns getShippingReturns() {
        return this.shippingReturns;
    }

    public final Map<String, PdpVariantDetails> getVariantDetails() {
        return this.variantDetails;
    }

    public final List<PdpVariantGroup> getVariantGroups() {
        return this.variantGroups;
    }

    public final List<PdpVariantImages> getVariantImages() {
        return this.variantImages;
    }

    public final List<PdpVariantPricing> getVariantPricing() {
        return this.variantPricing;
    }

    public final String getWebsiteLabel() {
        return this.websiteLabel;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.ownCouponPriceIds, AnonymousClass005.A0F(this.couponPrices, C0KA.A01(AnonymousClass005.A0F(this.variantDetails, AnonymousClass005.A0F(this.outOfStockProductIds, AnonymousClass005.A0F(this.sellerOtherListings, (((((((((((((AnonymousClass005.A0F(this.sellerReviews, AnonymousClass005.A0F(this.attributes, (((((C0KA.A01(AnonymousClass005.A0F(this.productType, AnonymousClass005.A0F(this.relatedProducts, AnonymousClass005.A0F(this.actions, AnonymousClass005.A0F(this.variantImages, AnonymousClass005.A0F(this.variantPricing, AnonymousClass005.A0F(this.variantGroups, AnonymousClass005.A0F(this.pills, (AnonymousClass005.A0F(this.product, AnonymousClass005.A0F(this.header, AnonymousClass001.A0G(this.productId))) + AnonymousClass006.A0D(this.rating)) * 31))))))), this.canOfferBuyNow) + AnonymousClass006.A0D(this.primaryAction)) * 31) + AnonymousClass006.A0D(this.secondaryAction)) * 31) + AnonymousClass006.A0D(this.seller)) * 31)) + AnonymousClass006.A0D(this.location)) * 31) + AnonymousClass006.A0D(this.shippingReturns)) * 31) + AnonymousClass006.A0G(this.buyLabel)) * 31) + AnonymousClass006.A0G(this.websiteLabel)) * 31) + AnonymousClass006.A0G(this.categoryName)) * 31) + AnonymousClass006.A0G(this.listingDurationText)) * 31) + AnonymousClass006.A0D(this.sellerListingCount)) * 31))), this.actionsFromServer))) + C3cH.A02(this.isTryOnEligible);
    }

    public final Boolean isTryOnEligible() {
        return this.isTryOnEligible;
    }

    public final ProductDetailsPresentation withVariantDetails(String str, PdpProductInfo pdpProductInfo) {
        boolean zA1b = AnonymousClass004.A1b(str, pdpProductInfo);
        Map<String, PdpVariantDetails> map = this.variantDetails;
        int i = PdpVariantDetails.$stable;
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, zA1b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AnonymousClass006.A11(str, new PdpVariantDetails(ProductDetailsPresentationKt.trimToNonEmpty(pdpProductInfo.name), ProductDetailsPresentationKt.trimToNonEmpty(pdpProductInfo.url), ProductDetailsPresentationKt.distinctByUrl(pdpProductInfo.images)), map), zA1b, null, null, null, 2080374783, null);
    }

    private final Set<String> matchingProductIds(Map<String, String> map) {
        PdpVariantOption next;
        Set<String> setA0S = null;
        for (PdpVariantGroup pdpVariantGroup : getRenderedVariantGroups()) {
            String str = map.get(pdpVariantGroup.dimension);
            if (str == null) {
                return null;
            }
            Iterator<PdpVariantOption> it = pdpVariantGroup.options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.id)) {
                    break;
                }
            }
            PdpVariantOption pdpVariantOption = next;
            if (pdpVariantOption == null) {
                return null;
            }
            Set<String> setA0g = AbstractC0878AGe.A0g(pdpVariantOption.productIds);
            setA0S = setA0S != null ? AbstractC0878AGe.A0S(setA0S, setA0g) : setA0g;
        }
        return setA0S;
    }

    private final String standInProductId(Map<String, String> map) {
        String next;
        List<String> listSelectedColorProductIds = selectedColorProductIds(map);
        if (listSelectedColorProductIds.contains(this.productId)) {
            return this.productId;
        }
        Iterator<String> it = listSelectedColorProductIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!this.outOfStockProductIds.contains(next)) {
                break;
            }
        }
        String str = next;
        return str == null ? (String) AbstractC0878AGe.A0G(listSelectedColorProductIds) : str;
    }

    public final String effectiveProductName(String str) {
        String str2;
        PdpVariantDetails pdpVariantDetailsFetchedVariant = fetchedVariant(str);
        return (pdpVariantDetailsFetchedVariant == null || (str2 = pdpVariantDetailsFetchedVariant.name) == null) ? this.product.name : str2;
    }

    public String toString() {
        return super.toString();
    }

    public ProductDetailsPresentation(String str, PdpHeader pdpHeader, PdpProductInfo pdpProductInfo, PdpRating pdpRating, List<String> list, List<PdpVariantGroup> list2, List<PdpVariantPricing> list3, List<PdpVariantImages> list4, List<PdpAction> list5, List<ShoppingResultProduct> list6, ShoppingProductType shoppingProductType, boolean z, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, PdpSeller pdpSeller, List<PdpAttribute> list7, List<PdpSellerReview> list8, PdpLocation pdpLocation, ProductShippingReturns productShippingReturns, String str2, String str3, String str4, String str5, Integer num, List<ShoppingResultProduct> list9, Set<String> set, Map<String, PdpVariantDetails> map, boolean z2, Map<String, PdpCouponPrice> map2, Set<String> set2, Boolean bool) {
        AnonymousClass005.A0x(str, pdpHeader, pdpProductInfo);
        C7384Etj.A0Y(list, 4);
        AnonymousClass005.A0z(list2, list3, list4);
        C7384Etj.A0Y(list5, 8);
        C3cH.A18(list6, shoppingProductType);
        AnonymousClass003.A12(list7, list8);
        C8j5.A0l(list9, set, map);
        C7384Etj.A0Y(map2, 28);
        C7384Etj.A0Y(set2, 29);
        this.productId = str;
        this.header = pdpHeader;
        this.product = pdpProductInfo;
        this.rating = pdpRating;
        this.pills = list;
        this.variantGroups = list2;
        this.variantPricing = list3;
        this.variantImages = list4;
        this.actions = list5;
        this.relatedProducts = list6;
        this.productType = shoppingProductType;
        this.canOfferBuyNow = z;
        this.primaryAction = shoppingPrimaryAction;
        this.secondaryAction = shoppingSecondaryAction;
        this.seller = pdpSeller;
        this.attributes = list7;
        this.sellerReviews = list8;
        this.location = pdpLocation;
        this.shippingReturns = productShippingReturns;
        this.buyLabel = str2;
        this.websiteLabel = str3;
        this.categoryName = str4;
        this.listingDurationText = str5;
        this.sellerListingCount = num;
        this.sellerOtherListings = list9;
        this.outOfStockProductIds = set;
        this.variantDetails = map;
        this.actionsFromServer = z2;
        this.couponPrices = map2;
        this.ownCouponPriceIds = set2;
        this.isTryOnEligible = bool;
    }

    public static /* synthetic */ ProductDetailsPresentation copy$default(ProductDetailsPresentation productDetailsPresentation, String str, PdpHeader pdpHeader, PdpProductInfo pdpProductInfo, PdpRating pdpRating, List list, List list2, List list3, List list4, List list5, List list6, ShoppingProductType shoppingProductType, boolean z, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, PdpSeller pdpSeller, List list7, List list8, PdpLocation pdpLocation, ProductShippingReturns productShippingReturns, String str2, String str3, String str4, String str5, Integer num, List list9, Set set, Map map, boolean z2, Map map2, Set set2, Boolean bool, int i, Object obj) {
        String str6 = str;
        PdpHeader pdpHeader2 = pdpHeader;
        PdpProductInfo pdpProductInfo2 = pdpProductInfo;
        PdpRating pdpRating2 = pdpRating;
        List list10 = list;
        List list11 = list2;
        List list12 = list3;
        List list13 = list4;
        List list14 = list5;
        List list15 = list6;
        ShoppingProductType shoppingProductType2 = shoppingProductType;
        boolean z3 = z;
        ShoppingPrimaryAction shoppingPrimaryAction2 = shoppingPrimaryAction;
        ShoppingSecondaryAction shoppingSecondaryAction2 = shoppingSecondaryAction;
        PdpSeller pdpSeller2 = pdpSeller;
        List list16 = list7;
        Set set3 = set;
        Map map3 = map;
        boolean z4 = z2;
        Map map4 = map2;
        Set set4 = set2;
        List list17 = list8;
        PdpLocation pdpLocation2 = pdpLocation;
        ProductShippingReturns productShippingReturns2 = productShippingReturns;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        Integer num2 = num;
        List list18 = list9;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            str6 = productDetailsPresentation.productId;
        }
        if ((i & 2) != 0) {
            pdpHeader2 = productDetailsPresentation.header;
        }
        if ((i & 4) != 0) {
            pdpProductInfo2 = productDetailsPresentation.product;
        }
        if ((i & 8) != 0) {
            pdpRating2 = productDetailsPresentation.rating;
        }
        if ((i & 16) != 0) {
            list10 = productDetailsPresentation.pills;
        }
        if ((i & 32) != 0) {
            list11 = productDetailsPresentation.variantGroups;
        }
        if ((i & 64) != 0) {
            list12 = productDetailsPresentation.variantPricing;
        }
        if ((i & 128) != 0) {
            list13 = productDetailsPresentation.variantImages;
        }
        if ((i & 256) != 0) {
            list14 = productDetailsPresentation.actions;
        }
        if ((i & 512) != 0) {
            list15 = productDetailsPresentation.relatedProducts;
        }
        if ((i & 1024) != 0) {
            shoppingProductType2 = productDetailsPresentation.productType;
        }
        if ((i & 2048) != 0) {
            z3 = productDetailsPresentation.canOfferBuyNow;
        }
        if ((i & 4096) != 0) {
            shoppingPrimaryAction2 = productDetailsPresentation.primaryAction;
        }
        if ((i & 8192) != 0) {
            shoppingSecondaryAction2 = productDetailsPresentation.secondaryAction;
        }
        if ((i & 16384) != 0) {
            pdpSeller2 = productDetailsPresentation.seller;
        }
        if ((i & 32768) != 0) {
            list16 = productDetailsPresentation.attributes;
        }
        if ((i & 65536) != 0) {
            list17 = productDetailsPresentation.sellerReviews;
        }
        if ((i & 131072) != 0) {
            pdpLocation2 = productDetailsPresentation.location;
        }
        if ((i & 262144) != 0) {
            productShippingReturns2 = productDetailsPresentation.shippingReturns;
        }
        if ((i & 524288) != 0) {
            str7 = productDetailsPresentation.buyLabel;
        }
        if ((i & 1048576) != 0) {
            str8 = productDetailsPresentation.websiteLabel;
        }
        if ((i & 2097152) != 0) {
            str9 = productDetailsPresentation.categoryName;
        }
        if ((i & 4194304) != 0) {
            str10 = productDetailsPresentation.listingDurationText;
        }
        if ((i & 8388608) != 0) {
            num2 = productDetailsPresentation.sellerListingCount;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            list18 = productDetailsPresentation.sellerOtherListings;
        }
        if ((i & 33554432) != 0) {
            set3 = productDetailsPresentation.outOfStockProductIds;
        }
        if ((i & 67108864) != 0) {
            map3 = productDetailsPresentation.variantDetails;
        }
        if ((i & 134217728) != 0) {
            z4 = productDetailsPresentation.actionsFromServer;
        }
        if ((i & 268435456) != 0) {
            map4 = productDetailsPresentation.couponPrices;
        }
        if ((i & 536870912) != 0) {
            set4 = productDetailsPresentation.ownCouponPriceIds;
        }
        if ((i & 1073741824) != 0) {
            bool2 = productDetailsPresentation.isTryOnEligible;
        }
        return productDetailsPresentation.copy(str6, pdpHeader2, pdpProductInfo2, pdpRating2, list10, list11, list12, list13, list14, list15, shoppingProductType2, z3, shoppingPrimaryAction2, shoppingSecondaryAction2, pdpSeller2, list16, list17, pdpLocation2, productShippingReturns2, str7, str8, str9, str10, num2, list18, set3, map3, z4, map4, set4, bool2);
    }

    public /* synthetic */ ProductDetailsPresentation(int i, String str, PdpHeader pdpHeader, PdpProductInfo pdpProductInfo, PdpRating pdpRating, List list, List list2, List list3, List list4, List list5, List list6, ShoppingProductType shoppingProductType, boolean z, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, PdpSeller pdpSeller, List list7, List list8, PdpLocation pdpLocation, ProductShippingReturns productShippingReturns, String str2, String str3, String str4, String str5, Integer num, List list9, Set set, Map map, boolean z2, Map map2, Set set2, Boolean bool, C2hx c2hx) {
        List list10 = list7;
        List list11 = list8;
        List list12 = list9;
        Set set3 = set;
        Map map3 = map;
        Map map4 = map2;
        Set set4 = set2;
        if (511 != (i & 511)) {
            C9iI.A00(ProductDetailsPresentation$$serializer.descriptor, i, 511);
            throw F60.createAndThrow();
        }
        this.productId = str;
        this.header = pdpHeader;
        this.product = pdpProductInfo;
        this.rating = pdpRating;
        this.pills = list;
        this.variantGroups = list2;
        this.variantPricing = list3;
        this.variantImages = list4;
        this.actions = list5;
        this.relatedProducts = (i & 512) == 0 ? C0881AGi.A00 : list6;
        this.productType = (i & 1024) == 0 ? ShoppingProductType.UNKNOWN : shoppingProductType;
        if ((i & 2048) == 0) {
            this.canOfferBuyNow = false;
        } else {
            this.canOfferBuyNow = z;
        }
        if ((i & 4096) == 0) {
            this.primaryAction = null;
        } else {
            this.primaryAction = shoppingPrimaryAction;
        }
        if ((i & 8192) == 0) {
            this.secondaryAction = null;
        } else {
            this.secondaryAction = shoppingSecondaryAction;
        }
        if ((i & 16384) == 0) {
            this.seller = null;
        } else {
            this.seller = pdpSeller;
        }
        this.attributes = (32768 & i) == 0 ? C0881AGi.A00 : list10;
        this.sellerReviews = (65536 & i) == 0 ? C0881AGi.A00 : list11;
        if ((131072 & i) == 0) {
            this.location = null;
        } else {
            this.location = pdpLocation;
        }
        if ((262144 & i) == 0) {
            this.shippingReturns = null;
        } else {
            this.shippingReturns = productShippingReturns;
        }
        if ((524288 & i) == 0) {
            this.buyLabel = null;
        } else {
            this.buyLabel = str2;
        }
        if ((1048576 & i) == 0) {
            this.websiteLabel = null;
        } else {
            this.websiteLabel = str3;
        }
        if ((2097152 & i) == 0) {
            this.categoryName = null;
        } else {
            this.categoryName = str4;
        }
        if ((4194304 & i) == 0) {
            this.listingDurationText = null;
        } else {
            this.listingDurationText = str5;
        }
        if ((8388608 & i) == 0) {
            this.sellerListingCount = null;
        } else {
            this.sellerListingCount = num;
        }
        this.sellerOtherListings = (16777216 & i) == 0 ? C0881AGi.A00 : list12;
        this.outOfStockProductIds = (33554432 & i) == 0 ? A3q.A00 : set3;
        this.variantDetails = (67108864 & i) == 0 ? C9jH.A00 : map3;
        if ((134217728 & i) == 0) {
            this.actionsFromServer = false;
        } else {
            this.actionsFromServer = z2;
        }
        this.couponPrices = (268435456 & i) == 0 ? C9jH.A00 : map4;
        this.ownCouponPriceIds = (536870912 & i) == 0 ? A3q.A00 : set4;
        if ((i & 1073741824) == 0) {
            this.isTryOnEligible = null;
        } else {
            this.isTryOnEligible = bool;
        }
    }

    public /* synthetic */ ProductDetailsPresentation(String str, PdpHeader pdpHeader, PdpProductInfo pdpProductInfo, PdpRating pdpRating, List list, List list2, List list3, List list4, List list5, List list6, ShoppingProductType shoppingProductType, boolean z, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, PdpSeller pdpSeller, List list7, List list8, PdpLocation pdpLocation, ProductShippingReturns productShippingReturns, String str2, String str3, String str4, String str5, Integer num, List list9, Set set, Map map, boolean z2, Map map2, Set set2, Boolean bool, int i, C06H c06h) {
        this(str, pdpHeader, pdpProductInfo, pdpRating, list, list2, list3, list4, list5, (i & 512) != 0 ? C0881AGi.A00 : list6, (i & 1024) != 0 ? ShoppingProductType.UNKNOWN : shoppingProductType, C3cG.A1K(i & 2048, z), (i & 4096) != 0 ? null : shoppingPrimaryAction, (i & 8192) != 0 ? null : shoppingSecondaryAction, (i & 16384) != 0 ? null : pdpSeller, (32768 & i) != 0 ? C0881AGi.A00 : list7, (65536 & i) != 0 ? C0881AGi.A00 : list8, (131072 & i) != 0 ? null : pdpLocation, (262144 & i) != 0 ? null : productShippingReturns, (524288 & i) != 0 ? null : str2, (1048576 & i) != 0 ? null : str3, (2097152 & i) != 0 ? null : str4, (4194304 & i) != 0 ? null : str5, (8388608 & i) != 0 ? null : num, (16777216 & i) != 0 ? C0881AGi.A00 : list9, (33554432 & i) != 0 ? A3q.A00 : set, (67108864 & i) != 0 ? C9jH.A00 : map, C3cH.A1L(134217728, i, z2), (268435456 & i) != 0 ? C9jH.A00 : map2, (536870912 & i) != 0 ? A3q.A00 : set2, (i & 1073741824) != 0 ? null : bool);
    }
}
