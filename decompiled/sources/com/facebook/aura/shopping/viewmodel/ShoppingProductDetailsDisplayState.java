package com.facebook.aura.shopping.viewmodel;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.shopping.model.PdpEyebrowState;
import com.facebook.aura.shopping.model.PdpPrice;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsDisplayState extends C06G {
    public static final int $stable = 0;
    public final boolean commercialContentPending;
    public final ShoppingProductDetailsCouponTag couponTag;
    public final ShoppingProductDetailsCtaState cta;
    public final PdpPrice currentPrice;
    public final String displayProductId;
    public final PdpEyebrowState eyebrow;
    public final boolean galleryContentPending;
    public final AHD<String> heroImageUrls;
    public final AHD<String> imageUrls;
    public final boolean isBuyEnabled;
    public final String leadingHeroImageUrl;
    public final PdpPrice originalPrice;
    public final ShoppingProductDetailsPriceRow pendingPriceRow;
    public final ShoppingProductDetailsPriceIssue priceIssue;
    public final Integer pricePercentOff;
    public final String productName;
    public final AHD<ShoppingResultProductUiModel> relatedProducts;
    public final String selectedSizeLabel;
    public final AHD<ShoppingResultProductUiModel> sellerOtherListings;
    public final AHD<ShoppingProductDetailsVariantGroupState> variantGroups;

    public final ShoppingProductDetailsDisplayState copy(String str, String str2, AHD<String> ahd, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag, PdpEyebrowState pdpEyebrowState, ShoppingProductDetailsCtaState shoppingProductDetailsCtaState, boolean z, AHD<ShoppingProductDetailsVariantGroupState> ahd2, String str3, boolean z2, ShoppingProductDetailsPriceRow shoppingProductDetailsPriceRow, ShoppingProductDetailsPriceIssue shoppingProductDetailsPriceIssue, boolean z3, AHD<ShoppingResultProductUiModel> ahd3, AHD<ShoppingResultProductUiModel> ahd4, String str4) {
        C7384Etj.A0Y(str2, 1);
        AnonymousClass005.A13(ahd, pdpEyebrowState, shoppingProductDetailsCtaState, 2);
        C7384Etj.A0Y(ahd2, 10);
        C3cI.A1I(ahd3, 16, ahd4);
        return new ShoppingProductDetailsDisplayState(str, str2, ahd, pdpPrice, pdpPrice2, num, shoppingProductDetailsCouponTag, pdpEyebrowState, shoppingProductDetailsCtaState, z, ahd2, str3, z2, shoppingProductDetailsPriceRow, shoppingProductDetailsPriceIssue, z3, ahd3, ahd4, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingProductDetailsDisplayState) {
                ShoppingProductDetailsDisplayState shoppingProductDetailsDisplayState = (ShoppingProductDetailsDisplayState) obj;
                if (!C7384Etj.areEqual(this.displayProductId, shoppingProductDetailsDisplayState.displayProductId) || !C7384Etj.areEqual(this.productName, shoppingProductDetailsDisplayState.productName) || !C7384Etj.areEqual(this.imageUrls, shoppingProductDetailsDisplayState.imageUrls) || !C7384Etj.areEqual(this.currentPrice, shoppingProductDetailsDisplayState.currentPrice) || !C7384Etj.areEqual(this.originalPrice, shoppingProductDetailsDisplayState.originalPrice) || !C7384Etj.areEqual(this.pricePercentOff, shoppingProductDetailsDisplayState.pricePercentOff) || !C7384Etj.areEqual(this.couponTag, shoppingProductDetailsDisplayState.couponTag) || !C7384Etj.areEqual(this.eyebrow, shoppingProductDetailsDisplayState.eyebrow) || !C7384Etj.areEqual(this.cta, shoppingProductDetailsDisplayState.cta) || this.isBuyEnabled != shoppingProductDetailsDisplayState.isBuyEnabled || !C7384Etj.areEqual(this.variantGroups, shoppingProductDetailsDisplayState.variantGroups) || !C7384Etj.areEqual(this.selectedSizeLabel, shoppingProductDetailsDisplayState.selectedSizeLabel) || this.commercialContentPending != shoppingProductDetailsDisplayState.commercialContentPending || !C7384Etj.areEqual(this.pendingPriceRow, shoppingProductDetailsDisplayState.pendingPriceRow) || this.priceIssue != shoppingProductDetailsDisplayState.priceIssue || this.galleryContentPending != shoppingProductDetailsDisplayState.galleryContentPending || !C7384Etj.areEqual(this.relatedProducts, shoppingProductDetailsDisplayState.relatedProducts) || !C7384Etj.areEqual(this.sellerOtherListings, shoppingProductDetailsDisplayState.sellerOtherListings) || !C7384Etj.areEqual(this.leadingHeroImageUrl, shoppingProductDetailsDisplayState.leadingHeroImageUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ShoppingProductDetailsDisplayState(String str, String str2, AHD ahd, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag, PdpEyebrowState pdpEyebrowState, ShoppingProductDetailsCtaState shoppingProductDetailsCtaState, boolean z, AHD ahd2, String str3, boolean z2, ShoppingProductDetailsPriceRow shoppingProductDetailsPriceRow, ShoppingProductDetailsPriceIssue shoppingProductDetailsPriceIssue, boolean z3, AHD ahd3, AHD ahd4, String str4, int i, C06H c06h) {
        this(str, str2, ahd, pdpPrice, pdpPrice2, num, shoppingProductDetailsCouponTag, pdpEyebrowState, shoppingProductDetailsCtaState, z, ahd2, (i & 2048) != 0 ? null : str3, C3cG.A1K(i & 4096, z2), (i & 8192) != 0 ? null : shoppingProductDetailsPriceRow, (i & 16384) != 0 ? null : shoppingProductDetailsPriceIssue, C3cH.A1L(32768, i, z3), (65536 & i) != 0 ? AHI.A01 : ahd3, (i & 131072) != 0 ? AHI.A01 : ahd4, str4);
    }

    public final String component1() {
        return this.displayProductId;
    }

    public final boolean component10() {
        return this.isBuyEnabled;
    }

    public final AHD<ShoppingProductDetailsVariantGroupState> component11() {
        return this.variantGroups;
    }

    public final String component12() {
        return this.selectedSizeLabel;
    }

    public final boolean component13() {
        return this.commercialContentPending;
    }

    public final ShoppingProductDetailsPriceRow component14() {
        return this.pendingPriceRow;
    }

    public final ShoppingProductDetailsPriceIssue component15() {
        return this.priceIssue;
    }

    public final boolean component16() {
        return this.galleryContentPending;
    }

    public final AHD<ShoppingResultProductUiModel> component17() {
        return this.relatedProducts;
    }

    public final AHD<ShoppingResultProductUiModel> component18() {
        return this.sellerOtherListings;
    }

    public final String component19() {
        return this.leadingHeroImageUrl;
    }

    public final String component2() {
        return this.productName;
    }

    public final AHD<String> component3() {
        return this.imageUrls;
    }

    public final PdpPrice component4() {
        return this.currentPrice;
    }

    public final PdpPrice component5() {
        return this.originalPrice;
    }

    public final Integer component6() {
        return this.pricePercentOff;
    }

    public final ShoppingProductDetailsCouponTag component7() {
        return this.couponTag;
    }

    public final PdpEyebrowState component8() {
        return this.eyebrow;
    }

    public final ShoppingProductDetailsCtaState component9() {
        return this.cta;
    }

    public final boolean getCommercialContentPending() {
        return this.commercialContentPending;
    }

    public final ShoppingProductDetailsCouponTag getCouponTag() {
        return this.couponTag;
    }

    public final ShoppingProductDetailsCtaState getCta() {
        return this.cta;
    }

    public final PdpPrice getCurrentPrice() {
        return this.currentPrice;
    }

    public final String getDisplayProductId() {
        return this.displayProductId;
    }

    public final PdpEyebrowState getEyebrow() {
        return this.eyebrow;
    }

    public final boolean getGalleryContentPending() {
        return this.galleryContentPending;
    }

    public final AHD<String> getHeroImageUrls() {
        return this.heroImageUrls;
    }

    public final AHD<String> getImageUrls() {
        return this.imageUrls;
    }

    public final String getLeadingHeroImageUrl() {
        return this.leadingHeroImageUrl;
    }

    public final PdpPrice getOriginalPrice() {
        return this.originalPrice;
    }

    public final ShoppingProductDetailsPriceRow getPendingPriceRow() {
        return this.pendingPriceRow;
    }

    public final ShoppingProductDetailsPriceIssue getPriceIssue() {
        return this.priceIssue;
    }

    public final Integer getPricePercentOff() {
        return this.pricePercentOff;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final AHD<ShoppingResultProductUiModel> getRelatedProducts() {
        return this.relatedProducts;
    }

    public final String getSelectedSizeLabel() {
        return this.selectedSizeLabel;
    }

    public final AHD<ShoppingResultProductUiModel> getSellerOtherListings() {
        return this.sellerOtherListings;
    }

    public final AHD<ShoppingProductDetailsVariantGroupState> getVariantGroups() {
        return this.variantGroups;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.sellerOtherListings, AnonymousClass005.A0F(this.relatedProducts, C0KA.A01((((C0KA.A01((AnonymousClass005.A0F(this.variantGroups, C0KA.A01(AnonymousClass005.A0F(this.cta, AnonymousClass005.A0F(this.eyebrow, (((((((AnonymousClass005.A0F(this.imageUrls, AnonymousClass005.A0I(this.productName, AnonymousClass006.A0G(this.displayProductId) * 31)) + AnonymousClass006.A0D(this.currentPrice)) * 31) + AnonymousClass006.A0D(this.originalPrice)) * 31) + AnonymousClass006.A0D(this.pricePercentOff)) * 31) + AnonymousClass006.A0D(this.couponTag)) * 31)), this.isBuyEnabled)) + AnonymousClass006.A0G(this.selectedSizeLabel)) * 31, this.commercialContentPending) + AnonymousClass006.A0D(this.pendingPriceRow)) * 31) + AnonymousClass006.A0D(this.priceIssue)) * 31, this.galleryContentPending))) + AnonymousClass005.A0H(this.leadingHeroImageUrl);
    }

    public final boolean isBuyEnabled() {
        return this.isBuyEnabled;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ShoppingProductDetailsDisplayState copy$default(ShoppingProductDetailsDisplayState shoppingProductDetailsDisplayState, String str, String str2, AHD ahd, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag, PdpEyebrowState pdpEyebrowState, ShoppingProductDetailsCtaState shoppingProductDetailsCtaState, boolean z, AHD ahd2, String str3, boolean z2, ShoppingProductDetailsPriceRow shoppingProductDetailsPriceRow, ShoppingProductDetailsPriceIssue shoppingProductDetailsPriceIssue, boolean z3, AHD ahd3, AHD ahd4, String str4, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        AHD ahd5 = ahd;
        PdpPrice pdpPrice3 = pdpPrice;
        PdpPrice pdpPrice4 = pdpPrice2;
        Integer num2 = num;
        ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag2 = shoppingProductDetailsCouponTag;
        PdpEyebrowState pdpEyebrowState2 = pdpEyebrowState;
        ShoppingProductDetailsCtaState shoppingProductDetailsCtaState2 = shoppingProductDetailsCtaState;
        boolean z4 = z;
        AHD ahd6 = ahd2;
        String str7 = str3;
        boolean z5 = z2;
        ShoppingProductDetailsPriceRow shoppingProductDetailsPriceRow2 = shoppingProductDetailsPriceRow;
        ShoppingProductDetailsPriceIssue shoppingProductDetailsPriceIssue2 = shoppingProductDetailsPriceIssue;
        boolean z6 = z3;
        AHD ahd7 = ahd3;
        AHD ahd8 = ahd4;
        String str8 = str4;
        if ((i & 1) != 0) {
            str5 = shoppingProductDetailsDisplayState.displayProductId;
        }
        if ((i & 2) != 0) {
            str6 = shoppingProductDetailsDisplayState.productName;
        }
        if ((i & 4) != 0) {
            ahd5 = shoppingProductDetailsDisplayState.imageUrls;
        }
        if ((i & 8) != 0) {
            pdpPrice3 = shoppingProductDetailsDisplayState.currentPrice;
        }
        if ((i & 16) != 0) {
            pdpPrice4 = shoppingProductDetailsDisplayState.originalPrice;
        }
        if ((i & 32) != 0) {
            num2 = shoppingProductDetailsDisplayState.pricePercentOff;
        }
        if ((i & 64) != 0) {
            shoppingProductDetailsCouponTag2 = shoppingProductDetailsDisplayState.couponTag;
        }
        if ((i & 128) != 0) {
            pdpEyebrowState2 = shoppingProductDetailsDisplayState.eyebrow;
        }
        if ((i & 256) != 0) {
            shoppingProductDetailsCtaState2 = shoppingProductDetailsDisplayState.cta;
        }
        if ((i & 512) != 0) {
            z4 = shoppingProductDetailsDisplayState.isBuyEnabled;
        }
        if ((i & 1024) != 0) {
            ahd6 = shoppingProductDetailsDisplayState.variantGroups;
        }
        if ((i & 2048) != 0) {
            str7 = shoppingProductDetailsDisplayState.selectedSizeLabel;
        }
        if ((i & 4096) != 0) {
            z5 = shoppingProductDetailsDisplayState.commercialContentPending;
        }
        if ((i & 8192) != 0) {
            shoppingProductDetailsPriceRow2 = shoppingProductDetailsDisplayState.pendingPriceRow;
        }
        if ((i & 16384) != 0) {
            shoppingProductDetailsPriceIssue2 = shoppingProductDetailsDisplayState.priceIssue;
        }
        if ((i & 32768) != 0) {
            z6 = shoppingProductDetailsDisplayState.galleryContentPending;
        }
        if ((i & 65536) != 0) {
            ahd7 = shoppingProductDetailsDisplayState.relatedProducts;
        }
        if ((i & 131072) != 0) {
            ahd8 = shoppingProductDetailsDisplayState.sellerOtherListings;
        }
        if ((i & 262144) != 0) {
            str8 = shoppingProductDetailsDisplayState.leadingHeroImageUrl;
        }
        ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag3 = shoppingProductDetailsCouponTag2;
        return shoppingProductDetailsDisplayState.copy(str5, str6, ahd5, pdpPrice3, pdpPrice4, num2, shoppingProductDetailsCouponTag3, pdpEyebrowState2, shoppingProductDetailsCtaState2, z4, ahd6, str7, z5, shoppingProductDetailsPriceRow2, shoppingProductDetailsPriceIssue2, z6, ahd7, ahd8, str8);
    }

    public ShoppingProductDetailsDisplayState(String str, String str2, AHD<String> ahd, PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag, PdpEyebrowState pdpEyebrowState, ShoppingProductDetailsCtaState shoppingProductDetailsCtaState, boolean z, AHD<ShoppingProductDetailsVariantGroupState> ahd2, String str3, boolean z2, ShoppingProductDetailsPriceRow shoppingProductDetailsPriceRow, ShoppingProductDetailsPriceIssue shoppingProductDetailsPriceIssue, boolean z3, AHD<ShoppingResultProductUiModel> ahd3, AHD<ShoppingResultProductUiModel> ahd4, String str4) {
        AHH ahhA3M;
        C7384Etj.A0Y(str2, 1);
        AnonymousClass005.A13(ahd, pdpEyebrowState, shoppingProductDetailsCtaState, 2);
        C7384Etj.A0Y(ahd2, 10);
        C3cI.A1I(ahd3, 16, ahd4);
        this.displayProductId = str;
        this.productName = str2;
        this.imageUrls = ahd;
        this.currentPrice = pdpPrice;
        this.originalPrice = pdpPrice2;
        this.pricePercentOff = num;
        this.couponTag = shoppingProductDetailsCouponTag;
        this.eyebrow = pdpEyebrowState;
        this.cta = shoppingProductDetailsCtaState;
        this.isBuyEnabled = z;
        this.variantGroups = ahd2;
        this.selectedSizeLabel = str3;
        this.commercialContentPending = z2;
        this.pendingPriceRow = shoppingProductDetailsPriceRow;
        this.priceIssue = shoppingProductDetailsPriceIssue;
        this.galleryContentPending = z3;
        this.relatedProducts = ahd3;
        this.sellerOtherListings = ahd4;
        this.leadingHeroImageUrl = str4;
        if (str4 != null && (ahhA3M = AGI.A0E(str4).A3M(ahd)) != null) {
            ahd = ahhA3M;
        }
        this.heroImageUrls = ahd;
    }
}
