package com.facebook.aura.shopping.repo;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.shopping.model.PdpAttribute;
import com.facebook.aura.shopping.model.PdpLocation;
import com.facebook.aura.shopping.model.PdpSeller;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import java.util.List;

/* loaded from: classes4.dex */
public final class NormalizedMarketplaceDetails extends C06G {
    public final List<String> additionalImageUrls;
    public final List<PdpAttribute> attributes;
    public final String categoryName;
    public final String listingDurationText;
    public final PdpLocation location;
    public final List<ShoppingResultProduct> otherListings;
    public final PdpSeller seller;
    public final Integer sellerListingCount;

    public NormalizedMarketplaceDetails(String str, List<PdpAttribute> list, String str2, List<String> list2, PdpSeller pdpSeller, Integer num, List<ShoppingResultProduct> list3, PdpLocation pdpLocation) {
        AnonymousClass002.A1B(list, 1, list2);
        C7384Etj.A0Y(list3, 6);
        this.categoryName = str;
        this.attributes = list;
        this.listingDurationText = str2;
        this.additionalImageUrls = list2;
        this.seller = pdpSeller;
        this.sellerListingCount = num;
        this.otherListings = list3;
        this.location = pdpLocation;
    }

    public final NormalizedMarketplaceDetails copy(String str, List<PdpAttribute> list, String str2, List<String> list2, PdpSeller pdpSeller, Integer num, List<ShoppingResultProduct> list3, PdpLocation pdpLocation) {
        AnonymousClass002.A1B(list, 1, list2);
        C7384Etj.A0Y(list3, 6);
        return new NormalizedMarketplaceDetails(str, list, str2, list2, pdpSeller, num, list3, pdpLocation);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NormalizedMarketplaceDetails) {
                NormalizedMarketplaceDetails normalizedMarketplaceDetails = (NormalizedMarketplaceDetails) obj;
                if (!C7384Etj.areEqual(this.categoryName, normalizedMarketplaceDetails.categoryName) || !C7384Etj.areEqual(this.attributes, normalizedMarketplaceDetails.attributes) || !C7384Etj.areEqual(this.listingDurationText, normalizedMarketplaceDetails.listingDurationText) || !C7384Etj.areEqual(this.additionalImageUrls, normalizedMarketplaceDetails.additionalImageUrls) || !C7384Etj.areEqual(this.seller, normalizedMarketplaceDetails.seller) || !C7384Etj.areEqual(this.sellerListingCount, normalizedMarketplaceDetails.sellerListingCount) || !C7384Etj.areEqual(this.otherListings, normalizedMarketplaceDetails.otherListings) || !C7384Etj.areEqual(this.location, normalizedMarketplaceDetails.location)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NormalizedMarketplaceDetails copy$default(NormalizedMarketplaceDetails normalizedMarketplaceDetails, String str, List list, String str2, List list2, PdpSeller pdpSeller, Integer num, List list3, PdpLocation pdpLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = normalizedMarketplaceDetails.categoryName;
        }
        if ((i & 2) != 0) {
            list = normalizedMarketplaceDetails.attributes;
        }
        if ((i & 4) != 0) {
            str2 = normalizedMarketplaceDetails.listingDurationText;
        }
        if ((i & 8) != 0) {
            list2 = normalizedMarketplaceDetails.additionalImageUrls;
        }
        if ((i & 16) != 0) {
            pdpSeller = normalizedMarketplaceDetails.seller;
        }
        if ((i & 32) != 0) {
            num = normalizedMarketplaceDetails.sellerListingCount;
        }
        if ((i & 64) != 0) {
            list3 = normalizedMarketplaceDetails.otherListings;
        }
        if ((i & 128) != 0) {
            pdpLocation = normalizedMarketplaceDetails.location;
        }
        return normalizedMarketplaceDetails.copy(str, list, str2, list2, pdpSeller, num, list3, pdpLocation);
    }

    public final String component1() {
        return this.categoryName;
    }

    public final List<PdpAttribute> component2() {
        return this.attributes;
    }

    public final String component3() {
        return this.listingDurationText;
    }

    public final List<String> component4() {
        return this.additionalImageUrls;
    }

    public final PdpSeller component5() {
        return this.seller;
    }

    public final Integer component6() {
        return this.sellerListingCount;
    }

    public final List<ShoppingResultProduct> component7() {
        return this.otherListings;
    }

    public final PdpLocation component8() {
        return this.location;
    }

    public final List<String> getAdditionalImageUrls() {
        return this.additionalImageUrls;
    }

    public final List<PdpAttribute> getAttributes() {
        return this.attributes;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final String getListingDurationText() {
        return this.listingDurationText;
    }

    public final PdpLocation getLocation() {
        return this.location;
    }

    public final List<ShoppingResultProduct> getOtherListings() {
        return this.otherListings;
    }

    public final PdpSeller getSeller() {
        return this.seller;
    }

    public final Integer getSellerListingCount() {
        return this.sellerListingCount;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.otherListings, (((AnonymousClass005.A0F(this.additionalImageUrls, (AnonymousClass005.A0F(this.attributes, AnonymousClass006.A0G(this.categoryName) * 31) + AnonymousClass006.A0G(this.listingDurationText)) * 31) + AnonymousClass006.A0D(this.seller)) * 31) + AnonymousClass006.A0D(this.sellerListingCount)) * 31) + C3cH.A02(this.location);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NormalizedMarketplaceDetails(String str, List list, String str2, List list2, PdpSeller pdpSeller, Integer num, List list3, PdpLocation pdpLocation, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, C3cI.A11(list, i), (i & 4) != 0 ? null : str2, (i & 8) != 0 ? C0881AGi.A00 : list2, (i & 16) != 0 ? null : pdpSeller, (i & 32) != 0 ? null : num, (i & 64) != 0 ? C0881AGi.A00 : list3, (i & 128) != 0 ? null : pdpLocation);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NormalizedMarketplaceDetails() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, c0881AGi, null, c0881AGi, null, null, c0881AGi, null);
    }
}
